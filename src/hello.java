/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unova
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Image;
import java.io.IOException;
import java.awt.geom.*;
import java.awt.Graphics2D;



public class hello {

	private JFrame frame;
	public BufferedImage image,newimage2;
	public Image scaledImage;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hello window = new hello();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hello() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try{
		image = ImageIO.read(new File("C:/Users/unova/Desktop/hello.jpg"));
		
		}catch(IOException e){
			e.printStackTrace();
		}
		frame = new JFrame();
		frame.setSize(800,800);
		//scaledImage = image.getScaledInstance(frame.getWidth(),frame.getHeight(),Image.SCALE_SMOOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		
		JPanel panel_1 = new JPanel(){
			
			protected void paintComponent(Graphics graphic){	
				BufferedImage newimage = new BufferedImage(image.getWidth(),image.getHeight(),BufferedImage.TYPE_INT_ARGB);
				newimage = image;
			 Graphics2D graphic1 = (Graphics2D) graphic.create();

			graphic1.rotate(Math.toRadians(90), image.getWidth()/2, image.getHeight()/2);
                           
			graphic1.drawImage(newimage,null,20,20);
                       
			}
			
		};
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
	}

}


