/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Luis Lavado
 */
public class Fondo1 extends JDesktopPane {

    Image imagen;

    public Fondo1() {
        super();
        imagen = new ImageIcon(getClass().getResource("/Recursos/fondo1.jpg")).getImage();
        setBackground(new Color(69, 64, 92));
    }

    Fondo1(Fondo1 fondo) {
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}
