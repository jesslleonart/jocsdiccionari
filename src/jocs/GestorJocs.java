/*
 * Fitxer Projecte/jocs/GestorJocs.java
 * 
 */
package jocs;

/**
 *
 * @author Jessica
 */
public class GestorJocs {
    
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
    
  
  
    /**
     * Demana a l'usuari que seleccioni un contacte de la llista de contactes, 
     * extreu el seu número i fa la trucada. Seguidament actualitzarà 
     * l'estadística de els dades
     * @param dades és l'estructura de dades inicialitzada necessària per 
     * actualitzar l'estadística
     */
    public void trucarAmbLlistaDeContactes(/*EstructuraDades dades*/){
        //A CODIFICAR... 
        
    }
    
    /**
     * Demana a l'usuari que escrigui el missatge i un cop escrit, es demana també 
     * el número a marcar i s'envia el text per SMS. Seguidament 
     * actualitzarà l'estadística de els dades
     * @param dades és l'estructura de dades inicialitzada necessària per 
     * actualitzar l'estadística
     */
    public void enviarSmsAmbMarcatgeDirecte(/*EstructuraDades dades*/){
        //A CODIFICAR... 
    }

    /**
     * Demana a l'usuari que escrigui el missatge i un cop escrit, es demana a que se 
     * seleccioni un contacte per extreure el número a marcar. Amb el text i 
     * el número es fa l'enviament SMS. Seguidament actualitzarà l'estadística 
     * de els dades
     * @param dades és l'estructura de dades inicialitzada necessària per 
     * actualitzar l'estadística i extreure la llista de contactes
     */
    public void enviarSmsAmbLlistaDeContactes(/*EstructuraDades dades*/){
        //A CODIFICAR... 
        
    }
    
    /**
     * Mostrar la llista dels contactes, demana que se seleccioni un i li extreu 
     * el seu número de telèfon que serà utilitzat per realitzar la trucada
     * @param dades és l'estructura de dades inicialitzada necessària per 
     * extreure la llista de contactes
     * @return 
     */
    public int seleccionarNumeroContacte(/*EstructuraDades dades*/){
        int ret=0;
        //A CODIFICAR... 
        
        return ret;        
    }
    
    /**
     * Realitza la trucada del número passat per paràmetre i retorna el número 
     * de segons que ha durat.
     * @param numero és el número de telèfon a marcar expressat en una array de chars
     */
    public int ferTrucada(char[] numero){
        int ret=0;
        //A CODIFICAR... 
        
        return ret;
    }    
    
    /**
     * Envia el missatge de text passat, al número indicat al primer paràmetre 
     * via SMS. Retorna el nombre de missatges que han estat necessaris per 
     * fer l'enviament.
     * @param numero és el número de telèfon a marcar expressat en una array de chars
     * @param text és el text a enviar
     */
    public int enviarSms(char[] numero, String text){
        int ret=0;
        //A CODIFICAR... 
        
        return ret;
    }    
    
    
}
