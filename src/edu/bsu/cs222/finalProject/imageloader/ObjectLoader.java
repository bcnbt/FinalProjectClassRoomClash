package edu.bsu.cs222.finalProject.imageloader;

import org.newdawn.slick.Image;

public class ObjectLoader extends ImageLoader {
	
	public Image createImage(String imageName){
		imageName = "obj/" + imageName;
		return super.createImage(imageName);
	}
	
}
