package com.xiaolv.test.image;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class SplitToNine2 {


   
   
	
	
	public static void main(String ...strings ){
		String filename = "C:\\Users\\charlie\\Desktop\\quan.jpg";
		
		SplitToNine2 stn = new SplitToNine2();
		
		File out = new File("C:\\Users\\charlie\\Desktop");
		
		try {
			stn.cut9Image( filename, 300, 300);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void cut9Image( String filename, int i, int j) {
		
		String nameNoSuffix = filename.split("\\")[0];
		System.out.println("noSufffix=" + nameNoSuffix);

		BufferedImage source;
		try {
			source = ImageIO.read(new File(filename));
			int internal = 300;
			int idx = 0;
			for (int y = 0; y < source.getHeight(); y += internal) {
				ImageIO.write(source.getSubimage(0, y, internal, internal), "jpg", new File(filename.split(".")[1] + idx++ + ".jpg"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
