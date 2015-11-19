/*
 * Fitxer Projecte/jocs/GestorJocs.java
 * 
 */
package jocs;
import jocs.dades.DadesPartidaLletresBarrejades;
import jocs.utilitats.Arrays;
import jocs.utilitats.Random;
import jocs.GestorLletresBarrejades;
import jocs.dades.GestorDades;


/**
 *
 * @author Jessica
 */
public class Principal {
     public static void main(String[] args) {
        GestorLletresBarrejades prg = new GestorLletresBarrejades();
        GestorDades gestorDades = new GestorDades();
        DadesPartidaLletresBarrejades dadesJoc = gestorDades.crearDades2();
        prg.inici(dadesJoc);
    }
    
    /**
     * Inicialitza l'aplicació, les dades, mostra el menu principal i 
     * gestiona les crides segons la opció escollida
     */
    public void inici(){
        //A CODIFICAR... mostrar menú i crida a controlPrincipal
    }
    
    /**
     * Selecciona la crida adequada en funció de la opció que arriba per paràmetre
     * @param opcio és el selector per escollir la crida
     * @param dades és l'estructura de dades iniicalitzada necessària per passar a les crides
     * @return un booleà indicant si la opció passada implica la sortida de l'execució o no
     */
    public boolean controlOpcioPrincipal(char opcio /*, EstructuraDades dades*/){
        boolean ret=false;
        //A CODIFICAR... 
        
        return ret;
    }
    
    
}
