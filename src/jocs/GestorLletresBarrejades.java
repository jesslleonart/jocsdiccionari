
  /*
 * 
 */
package jocs;

import jocs.dades.DadesPartidaLletresBarrejades;
import jocs.utilitats.arrays.Arrays;
import jocs.utilitats.arrays.Random;

/**
 * Gestiona les crides a funcions relacionades amb el joc LletresBarrejades
 * @author Jessica
 */
public class GestorLletresBarrejades {
    
     //biblioteques necessàries
    Arrays utilitatsArrays=new Arrays();
    Random utilitatsRandom=new Random();
    DadesPartidaLletresBarrejades dades=new DadesPartidaLletresBarrejades();
    
     /**
     * Inicialitza el joc, les dades, mostra l'explicació del joc i
     * gestiona les opcions segons les propostes de l'usuari
     * @param dades és l'estructura de dades inicialitzada necessària per passar a les crides
     */
    public void inici(DadesPartidaLletresBarrejades dadesJoc){
        //A CODIFICAR... mostrar explicació i inicialitzar les dades necessàries:
        
        String[] prova = obtenirParaulesALAtzar(dadesJoc.DICCIONARI, 30);

        for (int i = 0; i < prova.length - 1; i++) {
            System.out.print(prova[i]);
            System.out.print(", ");
        }
        System.out.println(prova[prova.length - 1]);
    }
    
    
    /**
     * Genera el dipòsit de lletres amb el que jugarà l'usuari
     * @param dades és l'estructura de dades iniicalitzada necessària per fer l'acció
     */
    public char[] diposit(DadesPartidaLletresBarrejades dadesJoc) {
     char ret[] = dadesJoc.diposit;
     //A CODIFICAR... obtenirParaulesALAtzar, barrejar lletres... fins que tinguem el dipòsit
    return ret;    
    }
    
    /**
     * Valida que la proposta sigui correcta o no, els punts a restar per incorrecta es restaran aqui
     * @param dades és la proposta demanada a l'usuari a Interficie
     * @return true si és correcta, false si és incorrecta
     */
    public boolean validarProposta(DadesPartidaLletresBarrejades dadesJoc) {
       boolean ret = false;
       // comparar la proposta de l'usuari amb el dipòsit 
       return ret;
    }
    
    /**
     * Obtenim paraules a l'atzar fins que tinguem 30 lletres entre total
     * @param diccionari és d'on treiem les paraules
     * @param limit és el nombre de lletres que necessitem
     * @return array String amb les paraules escollides
     */
    public String[] obtenirParaulesALAtzar(String[] diccionari, int limit) {
        String[] paraules = utilitatsArrays.inicialitzarArray(limit, "-");
        int comptador = 0;
        int nombreLletres = 0;
        
        //bucle fins que arribem a 30 lletres exactes (4)
        while (nombreLletres != limit) {
            for (int i = 0; i < paraules.length; i++) {

                String paraulaNova = utilitatsRandom.stringRandom(diccionari);
                
                //guardem la paraula només si no està ja a l'array o si amb aquesta no superem els 30 caràcters (3)
                if (!utilitatsArrays.cercaValorEnArray(paraules, paraulaNova) && (nombreLletres + paraulaNova.length()) <= limit) {
                    paraules[i] = paraulaNova;
                    //sumem les lletres de la paraula al total (2.1.2)
                    nombreLletres = nombreLletres + paraulaNova.length();
                    //comptador per després saber la mida necessària de l'array (2.1.1)
                    comptador++;
                }
            }

        }
        paraules = utilitatsArrays.ordenarArray(paraules);
        return utilitatsArrays.redimensionarArray(paraules, comptador);

    }
    
  
    
     /**
     * Actualitza les lletres disponibles del dipòsit després de la proposta de l'usuari
     * @param dades inclou la proposta de l'usuari si ha estat validada
     * @return el nou dipòsit
     */
    public char[] actualitzarDiposit(DadesPartidaLletresBarrejades dadesJoc){
        char[] ret = null;
        return ret;
    }
    
    /**
     * Resta o suma els punts depenent de la proposta de l'usuari
     * @param puntsActuals que té l'usuari
     * @param dades necessitem saber el torn en el que estem i les lletres utilitzades en la proposta
     * @return la nova puntuació
     */
    public int puntuacio(DadesPartidaLletresBarrejades dadesJoc){
        int ret = dadesJoc.puntsPartida;
        return ret;
    }
    /**
     * mostra missatge de felicitació o de consolació i torna al menú principal
     */
    public void fiJoc() {
        //A CODIFICAR
    }
   
   
    
}
