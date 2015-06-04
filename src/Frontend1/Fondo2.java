/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend1;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

/**
 *
 * @author Luis Lavado
 */
public class Fondo2 extends JDesktopPane {

    private Image imagen;

    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

        setOpaque(false);
        super.paint(g);

    }
    public Fondo2(Image imagenInicial) {
        if (imagenInicial != null) {
            imagen = imagenInicial;
        }
    }
}
