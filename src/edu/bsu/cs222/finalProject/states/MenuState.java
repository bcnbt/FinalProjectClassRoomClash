package edu.bsu.cs222.finalProject.states;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import edu.bsu.cs222.finalProject.imageloader.MenuLoader;
//import edu.bsu.cs222.finalProject.map.Background;

public class MenuState extends BasicGameState {
	private Image startgamebackground;
	private Image startgame;
	private Image exitgame;
	private Image Instructions;
	private Image highscore;
	int stateID = 0;
	private int buttonleftx = 425;
	private int buttonrightx = 636;
	private static final MenuLoader Image_Creator = new MenuLoader();

	public MenuState(int stateID) {
		this.stateID = stateID;
	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		startgamebackground = Image_Creator.createImage("background");
		startgame = Image_Creator.createImage("startgame");
		exitgame = Image_Creator.createImage("exitgame");
		Instructions = Image_Creator.createImage("instructionsbutton");
		highscore = Image_Creator.createImage("highscorebutton");
	}
	
	
	

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		//g.getBackground();//TODO use .Background() function?
		g.drawImage(startgamebackground, 0, 0);
		g.drawImage(startgame, buttonleftx, 300);
		g.drawImage(highscore, buttonleftx, 360);
		g.drawImage(Instructions, buttonleftx, 420);
		g.drawImage(exitgame, buttonleftx, 480);

	}
	//detects button clicks
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		if ((xpos > buttonleftx && xpos < buttonrightx)
				&& (ypos > 300 && ypos < 350)) {
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(1);
			}
		}
		if ((xpos > buttonleftx && xpos < buttonrightx)
				&& (ypos > 240 && ypos < 290)) {
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(3);
			}
		}
		if ((xpos > buttonleftx && xpos < buttonrightx)
				&& (ypos > 180 && ypos < 230)) {
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(2);
			}
		}
		if ((xpos > buttonleftx && xpos < buttonrightx)
				&& (ypos > 120 && ypos < 170)) {
			if (Mouse.isButtonDown(0)) {
				System.exit(0);
			}
		}
	}

	public int getID() {
		return stateID;
	}
}
