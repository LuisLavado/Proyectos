/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import Modelo.IdTipoPersona1;
import java.util.ArrayList;

/**
 *
 * @author JOEL
 */
public class ClsTipoPersona1 {
   ArrayList <IdTipoPersona1>tbtipopersona = new ArrayList<IdTipoPersona1>(); 
    public ClsTipoPersona1(IdTipoPersona1 idtp1) {
        tbtipopersona.add(idtp1);
    }
    
    public ArrayList reporteTipoPersona(){        
        return tbtipopersona;
    } 
}
