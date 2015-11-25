package edu.bsu.cs222.finalProject.states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import edu.bsu.cs222.finalProject.imageloader.MenuLoader;

public class HighScoreState extends BasicGameState {

	private static final MenuLoader Image_Creator = new MenuLoader();
	private Image highscoreBackground;
	int stateID = 2;
	public static int hs1;
	public static int hs2;
	public static int hs3;
	public static int hs4;
	public static int hs5;
	public static String hsn1 = "";
	public static String hsn2 = "";
	public static String hsn3 = "";
	public static String hsn4 = "";
	public static String hsn5 = "";
	boolean quit = true;

	public HighScoreState(int stateID) {
		this.stateID = stateID;
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		highscoreBackground = Image_Creator.createImage("highscore");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.drawImage(highscoreBackground, 	0, 		0);
		g.setColor(Color.black);
		g.drawString("1. " + hsn1 + "           " + hs1, 	120, 	200);
		g.drawString("2. ", 	120, 	250);
		g.drawString("3. ", 	120, 	300);
		g.drawString("4. ", 	120, 	350);
		g.drawString("5. ",     120, 	400);
		
		//Exit menu
		if(quit ==true){
			g.setColor(Color.black);
			g.fillRect(700, 250, 200, 250);
			g.setColor(Color.white);
			g.drawRect(700, 250, 200, 250);
			g.drawString("Class Room Clash", 730 , 300);
			g.drawString("Main Menu (M)", 750 , 350);
			g.drawString("Quit Game (Q)", 750 , 400);
					
					
			if(quit==false){
				g.clear();
			}
		}
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		Input input = gc.getInput();
		if (input.isKeyDown(Input.KEY_ESCAPE)) {
			quit = true;
		}
		if(quit == true){
			if (input.isKeyDown(Input.KEY_M)){
				sbg.enterState(0);
			}
			if (input.isKeyDown(Input.KEY_Q)){
				System.exit(0);
			}
		}
	}

	@Override
	public int getID() {
		return stateID;
	}
}
