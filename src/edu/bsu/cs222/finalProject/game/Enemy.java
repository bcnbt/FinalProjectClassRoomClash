package edu.bsu.cs222.finalProject.game;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import edu.bsu.cs222.finalProject.game.Player;
import edu.bsu.cs222.finalProject.imageloader.CharacterImageLoader;
import edu.bsu.cs222.finalProject.states.GameState;

public class Enemy {

	
	private static final CharacterImageLoader Character_Image_Producer = new CharacterImageLoader();
	public float speed = 4;
	public static Shape enemy;
	private StaticLevel level;
	private Animation enemyA;
	private Animation enemyMovingLeft, enemyMovingRight, stoppedRight;
	private float vX = 0;
	private float vY = 0;
	public float enemyY = 0;
	public float enemyX = 0;
	private int[] animationDuration = { 300, 300 };
	
	public Enemy( StaticLevel level)
	{
		this.level = level;
		
	}
	
	public void init(GameContainer gc) throws SlickException {
		enemy  = new Rectangle(5,5,30,78);
		Image[] PlayerAnimationLeft = {
				Character_Image_Producer.createImage("enemyleft1"),
				Character_Image_Producer.createImage("enemyleft2") };
		Image[] PlayerAnimationRight = {
				Character_Image_Producer.createImage("enemyright1"),
				Character_Image_Producer.createImage("enemyright2")};
		
		enemyMovingLeft = new Animation(PlayerAnimationLeft, animationDuration, true);
		enemyMovingRight = new Animation(PlayerAnimationRight, animationDuration, true);
		stoppedRight = new Animation(PlayerAnimationRight, animationDuration, false);
		enemyA = stoppedRight;
	}
	

	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.setColor( Color.transparent );
		g.draw(enemy);
		enemyA.draw(enemyX, enemyY);
		
	}


	public void update(GameContainer gc, int delta) throws SlickException {
		
		
		
		// Y acceleration
				if(Player.playerY < enemyY)
				{
					vY = -speed;
					enemyA = enemyMovingLeft;
					enemy.setY( enemy.getY() + vY );
					enemyY = enemy.getY();
					if( level.collidesWith(enemy) )
					{
						enemy.setY( enemy.getY() - vY );
						enemyY = enemy.getY();
						vY = 0;
					}
				} 
				
				if(Player.playerY > enemyY)
				{
					enemyA = enemyMovingRight;
					vY = speed;enemy.setY( enemy.getY() + vY );
					enemyY = enemy.getY();
					if( level.collidesWith(enemy) )
					{
						enemy.setY( enemy.getY() - vY );
						enemyY = enemy.getY();
						vY = 0;
					}
				}
				else
				{
					vY = 0;
				}
		
				
		
		// X acceleration
				if(Player.playerX < enemyX)
				{
					enemyA = enemyMovingLeft; 
					vX = -speed;
					enemy.setX( enemy.getX() + vX );
					enemyX = enemy.getX();
					if( level.collidesWith(enemy) )
					{
						enemy.setX( enemy.getX() - vX );
						enemyX = enemy.getX();
						vX = 0;
					}
				} 
				if(Player.playerX > enemyX)
				{
					enemyA = enemyMovingRight;
					vX = speed;
					enemy.setX( enemy.getX() + vX );
					enemyX = enemy.getX();
					if( level.collidesWith(enemy) )
					{
						enemy.setX( enemy.getX() - vX );
						enemyX = enemy.getX();
						vX = 0;
					}
				}
				else
				{
					vX = 0;
				}
				if(GameState.player.collidesWithEnemy(enemy)){
					GameState.gameOver = true;
				}
		}
	
		
	
	
	public float getX1() {  return enemyX; }
	public float getX2() {  return enemyX + 30; }
	public float getY1() {  return enemyY; }
	public float getY2() {  return enemyY + 78; }
	}