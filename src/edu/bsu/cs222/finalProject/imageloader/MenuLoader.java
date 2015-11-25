package edu.bsu.cs222.finalProject.imageloader;

import org.newdawn.slick.Image;

public class MenuLoader extends ImageLoader {

	public Image createImage(String imageName) {
		imageName = "ui/" + imageName;
		return super.createImage(imageName);
	}
}