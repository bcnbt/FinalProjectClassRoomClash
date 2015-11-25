package edu.bsu.cs222.finalProject.imageloader;

import org.newdawn.slick.Image;

public class CharacterImageLoader extends ImageLoader {
	
	public Image createImage(String imageName) {
		imageName = "char/" + imageName;
		return super.createImage(imageName);
	}
}
