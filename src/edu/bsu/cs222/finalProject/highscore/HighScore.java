package edu.bsu.cs222.finalProject.highscore;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import edu.bsu.cs222.finalProject.game.StaticLevel;
import edu.bsu.cs222.finalProject.states.GameState;
import edu.bsu.cs222.finalProject.states.HighScoreState;

public class HighScore {

	public static String tempName = "";
	public static String tempchar = "";

	public HighScore(StaticLevel level) {

	}

	public void init(GameContainer gc) throws SlickException {

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {

		Input input = gc.getInput();

		for (int i = 10; i > 0; i--) {
			tempchar = "";

			if (input.isKeyDown(Input.KEY_A)) {
				tempchar = "A";
			}
			if (input.isKeyDown(Input.KEY_B)) {
				tempchar = "B";
			}
			if (input.isKeyDown(Input.KEY_C)) {
				tempchar = "C";
			}
			if (input.isKeyDown(Input.KEY_D)) {
				tempchar = "D";
			}
			if (input.isKeyDown(Input.KEY_E)) {
				tempchar = "E";
			}
			if (input.isKeyDown(Input.KEY_F)) {
				tempchar = "F";
			}
			if (input.isKeyDown(Input.KEY_G)) {
				tempchar = "G";
			}
			if (input.isKeyDown(Input.KEY_H)) {
				tempchar = "H";
			}
			if (input.isKeyDown(Input.KEY_I)) {
				tempchar = "H";
			}
			if (input.isKeyDown(Input.KEY_J)) {
				tempchar = "J";
			}
			if (input.isKeyDown(Input.KEY_K)) {
				tempchar = "K";
			}
			if (input.isKeyDown(Input.KEY_L)) {
				tempchar = "L";
			}
			if (input.isKeyDown(Input.KEY_M)) {
				tempchar = "M";
			}
			if (input.isKeyDown(Input.KEY_N)) {
				tempchar = "N";
			}
			if (input.isKeyDown(Input.KEY_O)) {
				tempchar = "O";
			}
			if (input.isKeyDown(Input.KEY_P)) {
				tempchar = "P";
			}
			if (input.isKeyDown(Input.KEY_Q)) {
				tempchar = "Q";
			}
			if (input.isKeyDown(Input.KEY_R)) {
				tempchar = "R";
			}
			if (input.isKeyDown(Input.KEY_S)) {
				tempchar = "S";
			}
			if (input.isKeyDown(Input.KEY_T)) {
				tempchar = "T";
			}
			if (input.isKeyDown(Input.KEY_U)) {
				tempchar = "U";
			}
			if (input.isKeyDown(Input.KEY_V)) {
				tempchar = "V";
			}
			if (input.isKeyDown(Input.KEY_W)) {
				tempchar = "W";
			}
			if (input.isKeyDown(Input.KEY_X)) {
				tempchar = "X";
			}
			if (input.isKeyDown(Input.KEY_Y)) {
				tempchar = "Y";
			}
			if (input.isKeyDown(Input.KEY_Z)) {
				tempchar = "Z";

			}
			if (input.isKeyDown(Input.KEY_ENTER)) {

				HighScoreState.hsn1 = tempName;
				HighScoreState.hs1 = (int) GameState.coinCounter;
			} else {
				// tempchar = "";
			}

		}
		if (tempchar == "") {
			tempName = tempName + tempchar;
		}
	}
}
