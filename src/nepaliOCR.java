/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unova
 */

import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class nepaliOCR extends Component{
   
    BufferedImage img;
    
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
    
    public nepaliOCR() {
        try {
            img = ImageIO.read(new File("test.jpg"));
        }
        catch (IOException e) {}
    }
    
    public Dimension getPreferredSize() {
        if(img == null) {
            return new Dimension (500, 500);
        } else  {
            return new Dimension(img.getWidth(null), img.getHeight(null));
        }
    }
    public static void main (String args[]) {
        JFrame f = new JFrame("Load Image Sample");
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.add (new nepaliOCR());
        f.pack();
        f.setVisible(true);
    }

    
}
