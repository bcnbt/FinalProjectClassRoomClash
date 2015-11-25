package edu.bsu.cs222.finalProject.game;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import edu.bsu.cs222.finalProject.imageloader.CharacterImageLoader;
import edu.bsu.cs222.finalProject.game.Player;

public class Player {

	
	private static final CharacterImageLoader Character_Image_Producer = new CharacterImageLoader();
	public float speed = 6;
	private Shape player;
	private StaticLevel level;
	private Animation playerA;
	private Animation movingLeft, movingRight, movingUp, movingDown,  stoppedRight;
	private float vX = 0;
	private float vY = 0;
	public static float playerY = 0;
	public static float playerX = 0;
	private int[] animationDuration = { 300, 300 };
	
	public Player( StaticLevel level)
	{
		this.level = level;
		
	}
	
	public void init(GameContainer gc) throws SlickException {
		player  = new Rectangle(5,5,30,78);
		Image[] PlayerAnimationLeft = {
				Character_Image_Producer.createImage("playerleft1"),
				Character_Image_Producer.createImage("playerleft2") };
		Image[] PlayerAnimationRight = {
				Character_Image_Producer.createImage("playerright1"),
				Character_Image_Producer.createImage("playerright2")};
		Image[] PlayerAnimationUp = {
				Character_Image_Producer.createImage("playerleft1"),
				Character_Image_Producer.createImage("playerleft2")};
		Image[] PlayerAnimationDown = {
				Character_Image_Producer.createImage("playerleft1"),
				Character_Image_Producer.createImage("playerleft2")};
		movingLeft = new Animation(PlayerAnimationLeft, animationDuration, true);
		movingRight = new Animation(PlayerAnimationRight, animationDuration, true);
		movingUp = new Animation(PlayerAnimationUp, animationDuration, true);
		movingDown = new Animation(PlayerAnimationDown, animationDuration, true);
		stoppedRight = new Animation(PlayerAnimationRight, animationDuration, false);
		playerA = stoppedRight;
	}
	

	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.setColor( Color.transparent );
		g.draw(player);
		playerA.draw(playerX, playerY);
		
	}


	public void update(GameContainer gc, int delta) throws SlickException {
		
		
		
		// Y acceleration
				if( gc.getInput().isKeyDown(Input.KEY_UP) )
				{
					vY = -speed;
					playerA = movingUp;
				} else if( gc.getInput().isKeyDown(Input.KEY_DOWN) )
				{
					playerA = movingDown;
					vY = speed;
				}
				else
				{
					vY = 0;
				}
		// Y Movement-Collisions
				player.setY( player.getY() + vY );
				playerY = player.getY();
				if( level.collidesWith(player) )
				{
					player.setY( player.getY() - vY );
					playerY =player.getY();
					vY = 0;
				}
		
		// X acceleration
				if( gc.getInput().isKeyDown(Input.KEY_LEFT) )
				{
					playerA = movingLeft; 
					vX = -speed;
				} else if( gc.getInput().isKeyDown(Input.KEY_RIGHT) )
				{
					playerA = movingRight;
					vX = speed;
				}
				else
				{
					vX = 0;
				}
		
		// X Movement-Collisions
				player.setX( player.getX() + vX );
				playerX =player.getX();
				if( level.collidesWith(player) )
				{
					player.setX( player.getX() - vX );
					playerX =player.getX();
					vX = 0;
				}
				
		}
	
	public boolean collidesWithEnemy(Shape s){
		return player.intersects(s);
	}
	
	
	public float getX1() {  return playerX; }
	public float getX2() {  return playerX + 30; }
	public float getY1() {  return playerY; }
	public float getY2() {  return playerY + 78; }
	}