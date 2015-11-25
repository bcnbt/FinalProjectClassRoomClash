package edu.bsu.cs222.finalProject.main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;





import edu.bsu.cs222.finalProject.states.GameState;
import edu.bsu.cs222.finalProject.states.HighScoreState;
import edu.bsu.cs222.finalProject.states.Instructions;
import edu.bsu.cs222.finalProject.states.MenuState;

public class ClassRoomClashMain extends StateBasedGame{

	public static final String NAME = "ClassRoomClash";
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 625;
	public static final int FPS = 59;
	public static final int MENU = 0;
	public static final int PLAY = 1;
	public static final int INSTRUCTIONS = 2;
	public static final int HIGH_SCORE = 3;
	public static int lives = 1;
	public static int gameScore = 0;
	
	
	public ClassRoomClashMain(){
		super(NAME);
		this.addState(new GameState(PLAY));
		this.addState(new MenuState(MENU));
		this.addState(new Instructions(INSTRUCTIONS));
		this.addState(new HighScoreState(HIGH_SCORE));
		
	}
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(MENU).init(gc , this);
		this.getState(PLAY).init(gc, this);
		this.getState(INSTRUCTIONS).init(gc, this);
		this.getState(HIGH_SCORE).init(gc, this);
		this.enterState(MENU);
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app;
		try {
			app = new AppGameContainer(new ClassRoomClashMain());
			app.setShowFPS(false);
			app.setDisplayMode(WIDTH, HEIGHT, false);
			app.setTargetFrameRate(FPS);
			app.start();
		}catch (SlickException e) {
			e.printStackTrace();
		}	
		}
	}

