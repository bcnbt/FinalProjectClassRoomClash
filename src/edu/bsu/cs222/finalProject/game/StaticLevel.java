package edu.bsu.cs222.finalProject.game;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Line;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import edu.bsu.cs222.finalProject.imageloader.MenuLoader;

public class StaticLevel 
{
	private static final MenuLoader Image_Producer = new MenuLoader();
	
	private Shape wallT,wallB,wallR,wallL,desk1,desk2,desk3,desk4,desk5,desk6,desk7,desk8,desk9,desk10,desk11,desk12;
	private Image background;
	
	
	public void init(GameContainer gc) throws SlickException {
		
		background = Image_Producer.createImage("board");
	
		desk1 = new Rectangle( 79 , 99 , 148 , 68 );
		desk2 = new Rectangle( 79 , 261 , 148 , 68 );
		desk3 = new Rectangle( 79 , 460 , 148 , 68 );
		desk4 = new Rectangle( 323 , 98 , 148 , 68 );
		desk5 = new Rectangle( 323 , 262 , 148 , 68 );
		desk6 = new Rectangle( 323 , 460 , 148 , 68 );
		desk7 = new Rectangle( 546 , 98 , 148 , 68 );
		desk8 = new Rectangle( 545 , 262 , 148 , 68 );
		desk9 = new Rectangle( 547 , 460 , 148 , 68 );
		desk10 = new Rectangle( 769 , 97 , 148 , 68 );
		desk11 = new Rectangle( 769 , 261 , 148 , 68 );
		desk12 = new Rectangle( 769 , 459 , 148 , 68 );
		wallL = new Line( 1 , 1 , 1 , 620 );
		wallR = new Line( 998 , 1 , 998 , 620 );
		wallT = new Line( 1 , 1 , 998 , 1 );
		wallB = new Line( 1 , 624 , 998 , 624 );
		
	}
	

	public void render(GameContainer gc, Graphics g) throws SlickException {
		background.draw(0, 0);
		g.setColor(Color.transparent);
		g.draw(desk1);
		g.draw(desk2);
		g.draw(desk3);
		g.draw(desk4);
		g.draw(desk5);
		g.draw(desk6);
		g.draw(desk7);
		g.draw(desk8);
		g.draw(desk9);
		g.draw(desk10);
		g.draw(desk11);
		g.draw(desk12);
		g.draw(wallL);
		g.draw(wallR);
		g.draw(wallT);
		g.draw(wallB);
		
	}


	public void update(GameContainer gc, int delta) throws SlickException {
		
	}
	
	
	public boolean collidesWith( Shape s )
	{
	return wallL.intersects(s) || wallR.intersects(s) || wallT.intersects(s) || wallB.intersects(s) || desk1.intersects(s) || desk2.intersects(s) || desk3.intersects(s) || desk4.intersects(s) || desk5.intersects(s) || desk6.intersects(s) || desk7.intersects(s) || desk8.intersects(s) || desk9.intersects(s) || desk10.intersects(s) || desk11.intersects(s) || desk12.intersects(s);
	}
}






