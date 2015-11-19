/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jocs.utilitats;

/**
 *
 * @author Jessica
 */
public class Arrays {
    
     /**
     * Inicialitzem l'array de la mida dimensio amb String valor
     * @param dimensio es la mida de l'array, valor és amb allò que l'omplim
     * @return String[]
     */
    public String[] inicialitzarArray(int dimensio, String valor) {
        String[] ret = new String[dimensio];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = valor;
        }
        return ret;
    }
    
   /**
     * Ordena array String alfabèticament
     * @param array és l'array que ordenem
     * @return array String[] ordenat
     */
    public String[] ordenarArray(String[] array) {
        String[] ret = array;
        for (int i = 0; i < ret.length - 1; i++) {
            for (int j = i + 1; j < ret.length; j++) {
                if (ret[i].compareTo(ret[j]) < 0) {
                    String canvi = ret[i];
                    ret[i] = ret[j];
                    ret[j] = canvi;
                }
            }
        }
        return ret;
    }
    
     /**
     * Redimensiona un array amb la dimensió passada per paràmetre
     * @param array és l'array que redimensionem
     * @param dimensio és la mida al que volem redimensionar
     * @return array String[] ordenat
     */
    public String[] redimensionarArray(String[] array, int dimensio) {
        String[] ret = new String[dimensio];
        for (int posicio = 0; posicio < dimensio; posicio++) {
            boolean buit = array[posicio].equals(" ");
            if (!buit) {
                ret[posicio] = array[posicio];
            }
        }
        return ret;
    }
    
    
       /**
     * Donat un array, comprova si el String valor  hi és
     * @param array és l'array on realitzem la cerca
     * @param valor és el que hi cerquem
     * @return true si es troba, false si no
     */
    public boolean cercaValorEnArray(String[] array, String valor) {
        boolean trobat = false;
        for (int i = 0; i < array.length; i++) {
            if (valor == array[i]) {
                trobat = true;
            }
        }
        return trobat;
    }
    
}
