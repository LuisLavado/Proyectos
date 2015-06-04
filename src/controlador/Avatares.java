/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.Image;
import java.util.List;
import org.edisoncor.gui.util.Avatar;
import java.util.ArrayList;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author lis_cs
 */
public class Avatares {
    public List<Avatar> Ava(){
       List<Avatar> Avatares= new ArrayList<>();
        
        
        Avatares.add(new Avatar("Salir",Load("../imagenes/logo_UPeU.jpg")));
        Avatares.add(new Avatar("configuraciones",Load("../imagenes/logo_UPeU.jpg")));
        Avatares.add(new Avatar("Stock",Load("../imagenes/logo_UPeU.jpg")));
        Avatares.add(new Avatar("Realizar Venta",Load("../imagenes/logo_UPeU.jpg")));
        Avatares.add(new Avatar("Trabajadores",Load("../imagenes/logo_UPeU.jpg")));
        return Avatares;
    }
private Image Load(String fileName)
{
    try{
        return ImageIO.read(Avatares.class.getResource(fileName));
    }catch(IOException e){
        return null;
    }
}
   
    }

