/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend1;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author Luis Lavado
 */
public class Imagen_de_fondo implements Border{

    public BufferedImage gatita;
    
    public Imagen_de_fondo(){
        try {
            URL imagePath = new URL(getClass().getResource(".../Recursos/sandra.JPG").toString());
            gatita = ImageIO.read(imagePath);
        } catch (Exception e) {
        }
    }
    

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(gatita, x, y, width, height, c);
        //g.drawImage(gatita, (x + (width - gatita.getwidth())/2), (y + (height - gatita.getheight())/2), null;        
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    public boolean isBorderOpaque() {
        return false;
    }    /*  
  public void paintBoorder(Component c, Graphics g, int x, int y, int width, int height){
	g.drawImage(back, (x +(width - back.getwidth())/2), null;

  }
  public Insets getBorderInsets (Component c) {
     return new Insets(0,0,0,0);
  }
  public boolean isBorderOpera(){
    return false;
  }




}  */
    
}
