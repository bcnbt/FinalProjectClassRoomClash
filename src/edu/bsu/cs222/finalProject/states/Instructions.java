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

public class Instructions extends BasicGameState {

	private static final MenuLoader Image_Creator = new MenuLoader();
	private Image instructionsbackground;
	int stateID = 2;
	boolean quit = true;

	public Instructions(int stateID) {
		this.stateID = stateID;
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		instructionsbackground = Image_Creator.createImage("instructions");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.drawImage(instructionsbackground,0,0);
		
		//Exit menu
		if(quit ==true){
			g.setColor(Color.black);
			g.fillRect(700, 250, 200, 250);
			g.setColor(Color.white);
			g.drawRect(700, 250, 200, 250);
			g.drawString("Instructions", 750 , 300);
			g.drawString("Main Menu (M)", 750 , 350);
			g.drawString("Quit Game (Q)", 750 , 400);
			
			
			if(quit==false){
				g.clear();
			}
		}
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
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
