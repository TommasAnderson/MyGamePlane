package cn.neau.neaugame;

import java.awt.Image;
import java.awt.image.*;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil {
	
	private GameUtil() {
		//工具类最好将构造器私有化
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 指定图片的目录
	 */
	
	public static Image getImage(String path) {
		BufferedImage bi = null;
		try {
			URL u = GameUtil.class.getClassLoader().getResource(path);
			bi=ImageIO.read(u);			
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return bi;
	}

}
