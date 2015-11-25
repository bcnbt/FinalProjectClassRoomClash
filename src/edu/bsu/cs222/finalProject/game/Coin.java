package edu.bsu.cs222.finalProject.game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Shape;

import edu.bsu.cs222.finalProject.game.Player;
import edu.bsu.cs222.finalProject.imageloader.MenuLoader;
import edu.bsu.cs222.finalProject.states.GameState;

public class Coin {
	


	public float speed = 4;
	public static Shape enemy;
	private Box coin1,coin2,coin3,coin4,coin5,coin6,coin7,coin8,coin9,
	  			coin1A,coin2A,coin3A,coin4A,coin5A,coin6A,coin7A,coin8A,coin9A,
	  			coin1B,coin2B,coin3B,coin4B,coin5B,coin6B,coin7B,coin8B,coin9B,
	  			coin1C,coin2C,coin3C,coin4C,coin5C,coin6C,coin7C,coin8C,coin9C;
	 			// coin1D,coin2D,coin3D,coin4D,coin5D,coin6D,coin7D,coin8D,coin9D,
	 			// coin1E,coin2E,coin3E,coin4E,coin5E,coin6E,coin7E,coin8E,coin9E;
	private Image coinA,coinB,coinC,coinD,coinE,coinF,coinG,coinH,coinJ,
	  			  coinA1,coinB1,coinC1,coinD1,coinE1,coinF1,coinG1,coinH1,coinJ1,
	  			  coinA2,coinB2,coinC2,coinD2,coinE2,coinF2,coinG2,coinH2,coinJ2,
	  			  coinA3,coinB3,coinC3,coinD3,coinE3,coinF3,coinG3,coinH3,coinJ3;
	  			  //coinA4,coinB4,coinC4,coinD4,coinE4,coinF4,coinG4,coinH4,coinJ4;
	public float enemyY = 0;
	public float enemyX = 0;
	private static final MenuLoader Image_Producer = new MenuLoader();
	
	//coinsCollected row 1
		boolean coinACollected = false;
		boolean coinBCollected = false;
		boolean coinCCollected = false;
		boolean coinDCollected = false;
		boolean coinECollected = false;
		boolean coinFCollected = false;
		boolean coinGCollected = false;
		boolean coinHCollected = false;
		boolean coinICollected = false;
		boolean coinJCollected = false;
		//coinsCollected row 2
		boolean coin1ACollected = false;
		boolean coin1BCollected = false;
		boolean coin1CCollected = false;
		boolean coin1DCollected = false;
		boolean coin1ECollected = false;
		boolean coin1FCollected = false;
		boolean coin1GCollected = false;
		boolean coin1HCollected = false;
		boolean coin1ICollected = false;
		boolean coin1JCollected = false;
		//coinsCollected row 3
		boolean coin2JCollected = false;
		boolean coin2ACollected = false;
		boolean coin2BCollected = false;
		boolean coin2CCollected = false;
		boolean coin2DCollected = false;
		boolean coin2ECollected = false;
		boolean coin2FCollected = false;
		boolean coin2GCollected = false;
		boolean coin2HCollected = false;
		boolean coin2ICollected = false;
		//coinsCollected  //row 4
		boolean coin3ACollected = false;
		boolean coin3BCollected = false;
		boolean coin3CCollected = false;
		boolean coin3DCollected = false;
		boolean coin3ECollected = false;
		boolean coin3FCollected = false;
		boolean coin3GCollected = false;
		boolean coin3HCollected = false;
		boolean coin3ICollected = false;
		boolean coin3JCollected = false;

	
	public Coin( StaticLevel level)
	{
		
	}
	
	public void init(GameContainer gc) throws SlickException {
		//coin boxes //row 1
				coin1 = new Box(950, 580, 965, 595);
				coin2 = new Box(850, 580, 865, 595);
				coin3 = new Box(750, 580, 765, 595);
				coin4 = new Box(650, 580, 665, 595);
				coin5 = new Box(550, 580, 565, 595);
				coin6 = new Box(450, 580, 465, 595);
				coin7 = new Box(350, 580, 365, 595);
				coin8 = new Box(250, 580, 265, 595);
				coin9 = new Box(150, 580, 165, 595);
				//coin box   //row 2
				coin1A = new Box(950, 375, 965, 390);
				coin2A = new Box(850, 375, 865, 390);
				coin3A = new Box(750, 375, 765, 390);
				coin4A = new Box(650, 375, 665, 390);
				coin5A = new Box(550, 375, 565, 390);
				coin6A = new Box(450, 375, 465, 390);
				coin7A = new Box(350, 375, 365, 390);
				coin8A = new Box(250, 375, 265, 390);
				coin9A = new Box(150, 375, 165, 390);
				//coin box  //row 3
				coin1B = new Box(950, 210, 965, 225);
				coin2B = new Box(850, 210, 865, 225);
				coin3B = new Box(750, 210, 765, 225);
				coin4B = new Box(650, 210, 665, 225);
				coin5B = new Box(550, 210, 565, 225);
				coin6B = new Box(450, 210, 465, 225);
				coin7B = new Box(350, 210, 365, 225);
				coin8B = new Box(250, 210, 265, 225);
				coin9B = new Box(150, 210, 165, 225);
				//coin box  //row 4
				coin1C = new Box(950, 50, 965, 65);
				coin2C = new Box(850, 50, 865, 65);
				coin3C = new Box(750, 50, 765, 65);
				coin4C = new Box(650, 50, 665, 65);
				coin5C = new Box(550, 50, 565, 65);
				coin6C = new Box(450, 50, 465, 65);
				coin7C = new Box(350, 50, 365, 65);
				coin8C = new Box(250, 50, 265, 65);
				coin9C = new Box(150, 50, 165, 65);
				/*
				coin1E = new Box(950, 580, 965, 595);
				coin2E = new Box(850, 580, 865, 595);
				coin3E = new Box(750, 580, 765, 595);
				coin4E = new Box(650, 580, 665, 595);
				coin5E = new Box(550, 580, 565, 595);
				coin6E = new Box(450, 580, 465, 595);
				coin7E = new Box(350, 580, 365, 595);
				coin8E = new Box(250, 580, 265, 595);
				coin9E = new Box(150, 580, 165, 595);
				*/
		//coin  //row 1		
				coinJ = Image_Producer.createImage("coin");
				coinA = Image_Producer.createImage("coin");
				coinB = Image_Producer.createImage("coin");
				coinC = Image_Producer.createImage("coin");
				coinD = Image_Producer.createImage("coin");
				coinE = Image_Producer.createImage("coin");
				coinF = Image_Producer.createImage("coin");
				coinG = Image_Producer.createImage("coin");
				coinH = Image_Producer.createImage("coin");
		//coin  //row 2	
				coinA1 = Image_Producer.createImage("coin");
				coinB1 = Image_Producer.createImage("coin");
				coinC1 = Image_Producer.createImage("coin");
				coinD1 = Image_Producer.createImage("coin");
				coinE1 = Image_Producer.createImage("coin");
				coinF1 = Image_Producer.createImage("coin");
				coinG1= Image_Producer.createImage("coin");
				coinH1 = Image_Producer.createImage("coin");
				coinJ1 = Image_Producer.createImage("coin");
		//coin  //row 3		
				coinA2 = Image_Producer.createImage("coin");
				coinB2 = Image_Producer.createImage("coin");
				coinC2 = Image_Producer.createImage("coin");
				coinD2 = Image_Producer.createImage("coin");
				coinE2 = Image_Producer.createImage("coin");
				coinF2 = Image_Producer.createImage("coin");
				coinG2= Image_Producer.createImage("coin");
				coinH2 = Image_Producer.createImage("coin");
				coinJ2 = Image_Producer.createImage("coin");
		//coin //row 4
				coinA3 = Image_Producer.createImage("coin");
				coinB3 = Image_Producer.createImage("coin");
				coinC3 = Image_Producer.createImage("coin");
				coinD3 = Image_Producer.createImage("coin");
				coinE3 = Image_Producer.createImage("coin");
				coinF3 = Image_Producer.createImage("coin");
				coinG3= Image_Producer.createImage("coin");
				coinH3 = Image_Producer.createImage("coin");
				coinJ3 = Image_Producer.createImage("coin");
		//coin //row 5
			/*	coinA4 = Image_Producer.createImage("coin");
				coinB4 = Image_Producer.createImage("coin");
				coinC4 = Image_Producer.createImage("coin");
				coinD4 = Image_Producer.createImage("coin");
				coinE4 = Image_Producer.createImage("coin");
				coinF4 = Image_Producer.createImage("coin");
				coinG4= Image_Producer.createImage("coin");
				coinH4 = Image_Producer.createImage("coin");
				coinJ4 = Image_Producer.createImage("coin");*/
				
	}
	

	public void render(GameContainer gc, Graphics g) throws SlickException {
				GameState.playerBox.render(gc, g);
		//Coins  //row 1
				if (coinACollected == false) {
					coinA.draw(850, 580);
				}
				if (coinBCollected == false) {
					coinB.draw(750, 580);
				}
				if (coinCCollected == false) {
					coinC.draw(650, 580);
				}
				if (coinDCollected == false) {
					coinD.draw(550, 580);
				}
				if (coinECollected == false) {
					coinE.draw(450, 580);
				}
				if (coinFCollected == false) {
					coinF.draw(350, 580);
				}
				if (coinGCollected == false) {
					coinG.draw(250, 580);
				}
				if (coinHCollected == false) {
					coinH.draw(150, 580);
				}
				if (coinJCollected == false) {
					coinJ.draw(950, 580);
				}
		//Coins  //row 2
				if (coin1ACollected == false) {
					coinA1.draw(850, 375);
				}
				if (coin1BCollected == false) {
					coinB1.draw(750, 375);
				}
				if (coin1CCollected == false) {
					coinC1.draw(650, 375);
				}
				if (coin1DCollected == false) {
					coinD1.draw(550, 375);
				}
				if (coin1ECollected == false) {
					coinE1.draw(450, 375);
				}
				if (coin1FCollected == false) {
					coinF1.draw(350, 375);
				}
				if (coin1GCollected == false) {
					coinG1.draw(250, 375);
				}
				if (coin1HCollected == false) {
					coinH1.draw(150, 375);
				}
				if (coin1JCollected == false) {
					coinJ1.draw(950, 375);
				}
		//Coins  //row 3
				if (coin2ACollected == false) {
					coinA2.draw(850, 210);
				}
				if (coin2BCollected == false) {
					coinB2.draw(750, 210);
				}
				if (coin2CCollected == false) {
					coinC2.draw(650, 210);
				}
				if (coin2DCollected == false) {
					coinD2.draw(550, 210);
				}
				if (coin2ECollected == false) {
					coinE2.draw(450, 210);
				}
				if (coin2FCollected == false) {
					coinF2.draw(350, 210);
				}
				if (coin2GCollected == false) {
					coinG2.draw(250, 210);
				}
				if (coin2HCollected == false) {
					coinH2.draw(150, 210);
				}
				if (coin2JCollected == false) {
					coinJ2.draw(950, 210);
				}
		//Coins  //row 4
				if (coin3ACollected == false) {
					coinA3.draw(850, 50);
				}
				if (coin3BCollected == false) {
					coinB3.draw(750, 50);
				}
				if (coin3CCollected == false) {
					coinC3.draw(650, 50);
				}
				if (coin3DCollected == false) {
					coinD3.draw(550, 50);
				}
				if (coin3ECollected == false) {
					coinE3.draw(450, 50);
				}
				if (coin3FCollected == false) {
					coinF3.draw(350, 50);
				}
				if (coin3GCollected == false) {
					coinG3.draw(250, 50);
				}
				if (coin3HCollected == false) {
					coinH3.draw(150, 50);
				}
				if (coin3JCollected == false) {
					coinJ3.draw(950, 50);
				}
	}


	public void update(GameContainer gc, int delta) throws SlickException {
		//Collecting coins //row 1
		GameState.playerBox.setPos(Player.playerX, Player.playerY);
				if (coinJCollected == false) {
					if (coin1.collide(GameState.playerBox)) {
						coinJCollected = true;
						if (coinJCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coinACollected == false) {
					if (coin2.collide(GameState.playerBox)) {
						coinACollected = true;
						if (coinACollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coinBCollected == false) {
					if (coin3.collide(GameState.playerBox)) {
						coinBCollected = true;
						if (coinBCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coinCCollected == false) {
					if (coin4.collide(GameState.playerBox)) {
						coinCCollected = true;
						if (coinCCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coinDCollected == false) {
					if (coin5.collide(GameState.playerBox)) {
						coinDCollected = true;
						if (coinDCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coinECollected == false) {
					if (coin6.collide(GameState.playerBox)) {
						coinECollected = true;
						if (coinECollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coinFCollected == false) {
					if (coin7.collide(GameState.playerBox)) {
						coinFCollected = true;
						if (coinFCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coinGCollected == false) {
					if (coin8.collide(GameState.playerBox)) {
						coinGCollected = true;
						if (coinGCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coinHCollected == false) {
					if (coin9.collide(GameState.playerBox)) {
						coinHCollected = true;
						if (coinHCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
		//Collected coins // row 2
				if (coin1ACollected == false) {
					if (coin2A.collide(GameState.playerBox)) {
						coin1ACollected = true;
						if (coin1ACollected == true) {
							GameState.coinCounter++;
						}
					}	
				}
				if (coin1BCollected == false) {
					if (coin3A.collide(GameState.playerBox)) {
						coin1BCollected = true;
						if (coin1BCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin1CCollected == false) {
					if (coin4A.collide(GameState.playerBox)) {
						coin1CCollected = true;
						if (coin1CCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin1DCollected == false) {
					if (coin5A.collide(GameState.playerBox)) {
						coin1DCollected = true;
						if (coin1DCollected == true) {
						GameState.coinCounter++;
						}
					}
				}
				if (coin1ECollected == false) {
					if (coin6A.collide(GameState.playerBox)) {
						coin1ECollected = true;
						if (coin1ECollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin1FCollected == false) {
					if (coin7A.collide(GameState.playerBox)) {
						coin1FCollected = true;
						if (coin1FCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin1GCollected == false) {
					if (coin8A.collide(GameState.playerBox)) {
						coin1GCollected = true;
						if (coin1GCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin1HCollected == false) {
					if (coin9A.collide(GameState.playerBox)) {
						coin1HCollected = true;
						if (coin1HCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin1JCollected == false) {
					if (coin1A.collide(GameState.playerBox)) {
						coin1JCollected = true;
						if (coin1JCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
		//Collected coin  //row 3
				if (coin2ACollected == false) {
					if (coin2B.collide(GameState.playerBox)) {
						coin2ACollected = true;
						if (coin2ACollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin2BCollected == false) {
					if (coin3B.collide(GameState.playerBox)) {
						coin2BCollected = true;
						if (coin2BCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin2CCollected == false) {
					if (coin4B.collide(GameState.playerBox)) {
						coin2CCollected = true;
						if (coin2CCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin2DCollected == false) {
					if (coin5B.collide(GameState.playerBox)) {
						coin2DCollected = true;
						if (coin2DCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin2ECollected == false) {
					if (coin6B.collide(GameState.playerBox)) {
						coin2ECollected = true;
						if (coin1ECollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin2FCollected == false) {
					if (coin7B.collide(GameState.playerBox)) {
						coin2FCollected = true;
						if (coin2FCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin2GCollected == false) {
					if (coin8B.collide(GameState.playerBox)) {
						coin2GCollected = true;
						if (coin2GCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin2HCollected == false) {
					if (coin9B.collide(GameState.playerBox)) {
						coin2HCollected = true;
						if (coin2HCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin2JCollected == false) {
					if (coin1B.collide(GameState.playerBox)) {
						coin2JCollected = true;
						if (coin2JCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
		//Collected coin  //row 4
				if (coin3ACollected == false) {
					if (coin2C.collide(GameState.playerBox)) {
						coin3ACollected = true;
						if (coin3ACollected == true) {
							GameState.coinCounter++;
						}
					}
				}
				if (coin3BCollected == false) {
					if (coin3C.collide(GameState.playerBox)) {
						coin3BCollected = true;
						if (coin3BCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
			if (coin3CCollected == false) {
					if (coin4C.collide(GameState.playerBox)) {
						coin3CCollected = true;
					if (coin3CCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
			if (coin3DCollected == false) {
					if (coin5C.collide(GameState.playerBox)) {
						coin3DCollected = true;
						if (coin3DCollected == true) {
							GameState.coinCounter++;
						}
					}
				}
			if (coin3ECollected == false) {
				if (coin6C.collide(GameState.playerBox)) {
					coin3ECollected = true;
					if (coin3ECollected == true) {
						GameState.coinCounter++;
					}
				}
			}
			if (coin3FCollected == false) {
				if (coin7C.collide(GameState.playerBox)) {
					coin3FCollected = true;
					if (coin3FCollected == true) {
						GameState.coinCounter++;
					}
				}
			}
			if (coin3GCollected == false) {
				if (coin8C.collide(GameState.playerBox)) {
					coin3GCollected = true;
					if (coin3GCollected == true) {
						GameState.coinCounter++;
					}
				}
			}
			if (coin3HCollected == false) {
				if (coin9C.collide(GameState.playerBox)) {
					coin3HCollected = true;
					if (coin3HCollected == true) {
					GameState.coinCounter++;
					}
				}
			}
			if (coin3JCollected == false) {
				if (coin1C.collide(GameState.playerBox)) {
					coin3JCollected = true;
					if (coin3JCollected == true) {
						GameState.coinCounter++;
					}
				}
			}
		}
	
		
	
	
	public float getX1() {  return enemyX; }
	public float getX2() {  return enemyX + 30; }
	public float getY1() {  return enemyY; }
	public float getY2() {  return enemyY + 78; }
	}