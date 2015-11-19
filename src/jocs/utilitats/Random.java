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
public class Random {
    
     /**
     * Genera un nombre a l'atzar
     * @param limitValue és el valor màxim que pot sortir
     * @return un int a l'atzar
     */
    public int nanoRandom(int limitValue) {
        long nano = System.nanoTime(); //valor de la hora del sistema en nanosegons
        int ret = (int) (nano % limitValue); //encavir el valor dins del rang demanat
        if (ret < 0) {    //converti valors negatius en positius
            ret *= -1;
        }
        return ret;
    }
    /**
     * Retorna un ítem d'un array String[] a l'atzar
     * @param array és l'array del que busquem una posició a l'atzar
     * @return String de l'array a l'atzar
     */
    public String stringRandom(String[] array) {
        String ret = array[nanoRandom(array.length)];
        return ret;
    }
    
    
}
