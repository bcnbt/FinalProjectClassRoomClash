package edu.bsu.cs222.finalProject.imageloader;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class ImageLoader {

	private static final String BASE_IMAGE_PATH = "res/";
	private static final String EXPECTED_IMAGE_TYPE = ".png";
	private static String imagePath;

	private void createImagePath(String imageName) {
		imagePath = BASE_IMAGE_PATH + imageName + EXPECTED_IMAGE_TYPE;
	}
	
	public Image createImage(String imageName) {
		Image image = null;
		createImagePath(imageName);
		try {
			image = new Image(imagePath);
		} catch (SlickException e) {
			e.printStackTrace();
			System.out.print("Image could not be found, or was not the correct file type (.png)");
		}
		return image;
	}
}

	