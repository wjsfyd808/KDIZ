package org.comstudy21.graphic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ex01 extends MyFrame {
	public Ex01() {
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("paint");
		g.setColor(Color.RED);
		g.fillRect(50, 50,100,100);
		g.setColor(Color.BLACK);
		Font font = new Font("Arial",Font.BOLD,15);
		g.setFont(font);
		g.drawString("JAVA", 80,90);
		
		File imageSrc = new File("C:\\Users\\user\\Pictures\\png01.jpg");
		BufferedImage img = null;
		try {
			img = ImageIO.read(imageSrc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(img,50,500,100,100,null);
	}
	public void repaint(Graphics g) {
		System.out.println("repaint");
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
