


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unova
 */
public class Functions {
    static BufferedImage image;
    static Image scaledImage;
    File  file1;
    int width,height;
    
    // Open File Function
     public void openFile () {
        JFileChooser path = new JFileChooser();
        File a = new File(System.getProperty("user.home"));
        path.setCurrentDirectory(new File(a+"/Desktop"));
        int result = path.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            file1 = path.getSelectedFile();
        }
         try{
            //file1 =  new File("C:/Users/unova/Desktop/hello.jpg");
            image = ImageIO.read(file1);
        }
        catch(IOException e1){
            System.out.println("Error exist");
        }
         
    }
    
    public void binarize () {
    
    }
    public void drawImage(int width){
        System.out.println("This function is called");
        this.width = width;
       
        
        
    }
    
   
    
    
}
