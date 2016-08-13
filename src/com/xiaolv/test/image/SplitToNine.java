package com.xiaolv.test.image;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class SplitToNine {

	// 缩放
	public void zoomImage(File out, String name, int rtype, int cw, int ch,
			int w, int h) throws Exception {
		BufferedImage bimg0 = ImageIO.read(new File(out, name));
		int bw = bimg0.getWidth();
		int bh = bimg0.getHeight();
		int type = -1;
		String format = null;
		if (name.toLowerCase().endsWith("png")) {
			format = "PNG";
			type = BufferedImage.TYPE_INT_ARGB;

		} else {
			format = "JPG";
			type = BufferedImage.TYPE_INT_RGB;
		}
		int zw = 0;
		int zh = 0;
		switch (rtype) {
		case 1:
			// 宽度ZOOM
			zw = w - 2 * cw;
			zh = ch;
			break;
		case 2:
			// 高度ZOOM
			zw = cw;
			zh = h - 2 * ch;
			break;
		case 3:
			// 高宽ZOOM
			zw = w - 2 * cw;
			zh = h - 2 * ch;
			break;
		}
		BufferedImage image = new BufferedImage(zw, zh, type);
		Graphics g = image.getGraphics();
		g.drawImage(bimg0, 0, 0, zw, zh, 0, 0, bw, bh, null);
		ImageIO.write(image, format, new File(out, name));
	}

	// 合并9图
	public void mergeImage(File out, String name, String[] images, int w, int h)
			throws Exception {
		BufferedImage bimg0 = ImageIO.read(new File(out.getParentFile(), name));
		int type = -1;
		String format = null;
		if (name.toLowerCase().endsWith("png")) {
			format = "PNG";
			type = BufferedImage.TYPE_INT_ARGB;

		} else {
			format = "JPG";
			type = BufferedImage.TYPE_INT_RGB;
		}

		BufferedImage image = new BufferedImage(w, h, type);
		Graphics g = image.getGraphics();

		int x = 0;
		int y = 0;
		for (int i = 0; i < images.length; i++) {
			BufferedImage bimg = ImageIO.read(new File(out, images[i]));
			g.drawImage(bimg, x, y, bimg.getWidth(), bimg.getHeight(), null);
			if (i % 3 == 0)
				x = x + bimg.getWidth();
			else if (i % 3 == 1)
				x = x + bimg.getWidth();
			else if (i % 3 == 2)
				x = 0;
			// g.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2,
			// observer)

			if (i % 3 == 2)
				y = y + bimg.getHeight();

		}
		ImageIO.write(image, format, new File(out.getParentFile(), name));
	}

	/**
	 * 九宫格切割处理图片
	 */
	private void cut9Image(File out, String name, int w, int h)
			throws Exception {
		File cache = new File(out.getPath() + "/cache");
		if (!cache.exists())
			cache.mkdir();
		// 原图
		BufferedImage bimg0 = ImageIO.read(new File(name));
		String[] images = new String[9];
		List list = new ArrayList();

		int w0 = bimg0.getWidth();
		int h0 = bimg0.getHeight();
		int type = -1;
		String format = null;
		if (name.toLowerCase().endsWith("png")) {
			format = "PNG";
			type = BufferedImage.TYPE_INT_ARGB;

		} else {
			format = "JPG";
			type = BufferedImage.TYPE_INT_RGB;
		}
		// 切割成9部分
		/**
		 * 边角四块的高度和宽度
		 */
		int cornerwidth = 3;
		int cornerheight = 3;
		// 左上
		BufferedImage image1 = new BufferedImage(cornerwidth, cornerheight,
				type);
		// 右上
		BufferedImage image2 = new BufferedImage(cornerwidth, cornerheight,
				type);
		// 左下
		BufferedImage image3 = new BufferedImage(cornerwidth, cornerheight,
				type);
		// 右下
		BufferedImage image4 = new BufferedImage(cornerwidth, cornerheight,
				type);

		int topwidth = w0 - 2 * cornerwidth;
		int topheight = cornerheight;
		// TOP
		BufferedImage topbimg = new BufferedImage(topwidth, topheight, type);
		int leftwidth = cornerwidth;
		int leftheight = h0 - 2 * cornerheight;
		// LEFT
		BufferedImage leftbimg = new BufferedImage(leftwidth, leftheight, type);
		int midwidth = w0 - 2 * cornerwidth;
		int midheight = h0 - 2 * cornerheight;
		// middle
		BufferedImage midbimg = new BufferedImage(midwidth, midheight, type);
		int rightwidth = cornerwidth;
		int rightheight = h0 - 2 * cornerheight;
		// right
		BufferedImage rightbimg = new BufferedImage(rightwidth, rightheight,
				type);
		int bottomwidth = w0 - 2 * cornerwidth;
		int bottomheight = cornerheight;
		// bottom
		BufferedImage bottombimg = new BufferedImage(bottomwidth, bottomheight,
				type);

		Graphics g1 = image1.getGraphics();
		Graphics g2 = image2.getGraphics();
		Graphics g3 = image3.getGraphics();
		Graphics g4 = image4.getGraphics();
		Graphics gtop = topbimg.getGraphics();
		Graphics gleft = leftbimg.getGraphics();
		Graphics gmid = midbimg.getGraphics();
		Graphics gright = rightbimg.getGraphics();
		Graphics gbottom = bottombimg.getGraphics();
		String cutname = "";
		// 左上
		g1.drawImage(bimg0, 0, 0, cornerwidth, cornerheight, 0, 0, cornerwidth,
				cornerheight, null);
		cutname = "image1." + format;
		ImageIO.write(image1, format, new File(cache, cutname));
		images[0] = cutname;
		list.add(image1);
		// top
		gtop.drawImage(bimg0, 0, 0, topwidth, topheight, cornerwidth, 0,
				cornerwidth + topwidth, topheight, null);
		cutname = "top." + format;
		ImageIO.write(topbimg, format, new File(cache, cutname));
		zoomImage(cache, cutname, 1, cornerwidth, cornerheight, w, h);
		images[1] = cutname;
		list.add(topbimg);
		// 右上
		g2.drawImage(bimg0, 0, 0, cornerwidth, cornerheight, cornerwidth
				+ topwidth, 0, 2 * cornerwidth + topwidth, cornerheight, null);
		cutname = "image2." + format;
		ImageIO.write(image2, format, new File(cache, cutname));
		images[2] = cutname;
		list.add(image2);
		// 左
		gleft.drawImage(bimg0, 0, 0, leftwidth, leftheight, 0, cornerheight,
				0 + leftwidth, cornerheight + leftheight, null);
		cutname = "left." + format;
		ImageIO.write(leftbimg, format, new File(cache, cutname));
		zoomImage(cache, cutname, 2, cornerwidth, cornerheight, w, h);
		images[3] = cutname;
		list.add(leftbimg);
		// 中
		gmid.drawImage(bimg0, 0, 0, midwidth, midheight, cornerwidth,
				cornerheight, cornerwidth + midwidth, cornerheight + midheight,
				null);
		cutname = "mid." + format;
		ImageIO.write(midbimg, format, new File(cache, cutname));
		zoomImage(cache, cutname, 3, cornerwidth, cornerheight, w, h);
		images[4] = cutname;
		list.add(midbimg);
		// 右
		gright.drawImage(bimg0, 0, 0, rightwidth, rightheight, cornerwidth
				+ midwidth, cornerheight, 2 * cornerwidth + midwidth,
				cornerheight + midheight, null);
		cutname = "right." + format;
		ImageIO.write(rightbimg, format, new File(cache, cutname));
		zoomImage(cache, cutname, 2, cornerwidth, cornerheight, w, h);
		images[5] = cutname;
		list.add(rightbimg);
		// 左下
		g3.drawImage(bimg0, 0, 0, cornerwidth, cornerheight, 0, cornerheight
				+ leftheight, 0 + cornerwidth, 2 * cornerheight + leftheight,
				null);
		cutname = "image3." + format;
		ImageIO.write(image3, format, new File(cache, cutname));
		images[6] = cutname;
		list.add(image3);
		// 底
		gbottom.drawImage(bimg0, 0, 0, bottomwidth, bottomheight, cornerwidth,
				cornerheight + midheight, cornerwidth + bottomwidth, 2
						* cornerheight + midheight, null);
		cutname = "bottom." + format;
		ImageIO.write(bottombimg, format, new File(cache, cutname));
		zoomImage(cache, cutname, 1, cornerwidth, cornerheight, w, h);
		images[7] = cutname;
		list.add(bottombimg);
		// 右下
		g4.drawImage(bimg0, 0, 0, cornerwidth, cornerheight, cornerwidth
				+ bottomwidth, cornerheight + rightheight, 2 * cornerwidth
				+ bottomwidth, 2 * cornerheight + rightheight, null);
		cutname = "image4." + format;
		ImageIO.write(image4, format, new File(cache, cutname));
		images[8] = cutname;
		list.add(image4);

		mergeImage(cache, name, images, w, h);

		for (int i = 0; i < images.length; i++) {
			File file = new File(cache, images[i]);
			if (file.exists())
				file.delete();
		}
		cache.deleteOnExit();

	}
	
	
	public static void main(String ...strings ){
		String filename = "C:\\Users\\charlie\\Desktop\\quan.jpg";
		
		SplitToNine stn = new SplitToNine();
		
		File out = new File("C:\\Users\\charlie\\Desktop");
		
		try {
			stn.cut9Image(out, filename, 300, 300);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
