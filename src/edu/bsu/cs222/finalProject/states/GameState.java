package edu.bsu.cs222.finalProject.states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import edu.bsu.cs222.finalProject.game.Box;
import edu.bsu.cs222.finalProject.game.Coin;
import edu.bsu.cs222.finalProject.game.Enemy;
import edu.bsu.cs222.finalProject.game.Player;
import edu.bsu.cs222.finalProject.game.StaticLevel;
import edu.bsu.cs222.finalProject.highscore.HighScore;


public class GameState extends BasicGameState
{
	public static boolean gameOver = false;
	private StaticLevel level;
	public static Player player;
	public static Enemy enemy;
	public static Coin coin;
	public static HighScore highScore;
	int stateID = 1;
	float x = 0;
	float y =0;
	boolean quit = false;
	public static float coinCounter = 0;
	public static Box playerBox;
	public boolean name = false;
	
	public GameState(int stateID) {
		this.stateID = stateID;
	}


	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		//level1
		level = new StaticLevel();
		level.init(gc);
		
		//player
		player = new Player( level );
		player.init(gc);
		
		//enemy
		enemy = new Enemy( level );
		enemy.init(gc);
		
		//coins
		coin = new Coin(level);
		coin.init(gc);
		
		//high score state
		highScore = new HighScore(level);
		highScore.init(gc);
		
		
//player
		playerBox = new Box(Player.playerX, Player.playerY, Player.playerX + 30, Player.playerY + 78);
		
	}
	
	

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
		level.render(gc, g);
		coin.render(gc, g);
		if(coinCounter >= 5){
			enemy.render(gc, g);
		}
		
		player.render(gc, g);
		playerBox.render(gc, g);
		

		//Exit menu
		if(quit ==true){
			g.setColor(Color.black);
			g.fillRect(400, 50, 200, 250);
			g.setColor(Color.white);
			g.drawRect(400, 50, 200, 300);
			g.drawString("Resume (R)", 450 , 100);
			g.drawString("Main Menu (M)", 450 , 150);
			g.drawString("Quit Game (Q)", 450 , 200);
			g.drawString("Score:" + coinCounter , 450 , 250);
			
			
			if(quit==false){
				g.clear();
			}
		}
		if(gameOver == true){
			g.setColor(Color.black);
			g.fillRect(400, 50, 200, 350);
			g.setColor(Color.white);
			g.drawRect(400, 50, 200, 350);
			g.drawString("GAME OVER", 450 , 100);
			g.drawString("Main Menu (M)", 450 , 150);
			g.drawString("Quit Game (Q)", 450 , 200);
			g.drawString("Score:" + coinCounter , 460 , 250);
			g.drawString("Name?", 475, 300);
			if(coinCounter <= 36.0){
				highScore.render(gc,sbg,g);
				name=true;
				//g.drawString(HighScoreState.hsn1, 465, 318);
			g.drawString("_______", 465, 320);
			
			}
			
		}
	}


	public void update(GameContainer gc,StateBasedGame sbg , int delta) throws SlickException {
		level.update(gc, delta);
		player.update(gc, delta);
		coin.update(gc, delta);
		//playerBox.setPos(Player.playerX, Player.playerY);
		
		if(coinCounter >= 5){
			enemy.update(gc, delta);
		}
		
		Input input = gc.getInput();
		if (input.isKeyDown(Input.KEY_ESCAPE)) {
			quit = true;
		}
		
		if(quit == true){
			player.speed = 0;
			enemy.speed = 0;
			if (input.isKeyDown(Input.KEY_R)){
				quit = false;
				player.speed = 8;
				enemy.speed = 4;
			}
			if (input.isKeyDown(Input.KEY_M)){
				sbg.enterState(0);
			}
			if (input.isKeyDown(Input.KEY_Q)){
				System.exit(0);
			}
		}
		if(gameOver == true){
			player.speed = 0;
			enemy.speed = 0;
			if (input.isKeyDown(Input.KEY_M)){
				sbg.enterState(0);
			}
			if (input.isKeyDown(Input.KEY_Q)){
				System.exit(0);
			}
		}
		if(name == true){
			highScore.update(gc,sbg,delta);
		}
}

	public int getID() {
		return stateID;
	}


}