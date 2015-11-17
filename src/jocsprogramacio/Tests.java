/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jocsprogramacio;

import Consola.EntraDades;
import Consola.Interficies;

/**
 *
 * @author solde
 */
public class Tests {

    public static void main(String[] args) {

    }

    public void entraNum() {
        // TODO code application logic here 
        Consola.EntraDades testEntraNum = new EntraDades();
        double numero = testEntraNum.entrarUnDouble("hola ke ase mete un numero");
        System.out.println("el teu nombre es: " + numero);

    }

    public void testLinia1() {
        Consola.Interficies testInterficies = new Interficies();
        testInterficies.separacio("*__*", 40);
        testInterficies.separacio("12345", 40);
        testInterficies.separacio("=", 80);
        testInterficies.separacio("^^ :)", 77);
        testInterficies.separacio("^^ :)", 75);
    }

    public void testCentrat() {
        Consola.Interficies testInterficies = new Interficies();
        testInterficies.textCentrat("Texte centrat", 60);
        System.out.println();
        testInterficies.separacio("*", 60);
        System.out.println();
        testInterficies.textCentrat("Un text encara més llarg i maco", 60);
        System.out.println();
        testInterficies.separacio("*", 60);
        System.out.println();

    }

    public void entraNumRang() {
        // TODO code application logic here 
        Consola.EntraDades testEntraNum = new EntraDades();
        //double numero = testEntraNum.FloatEnRang(" mete un numero entre 7 y 12", 7,12);
        double numero2 = testEntraNum.FloatEnRang(" mete un numero entre 7 y 12", 12, 7);
        System.out.println("el teu nombre es: " + numero2);

    }

    public void testTitol() {
        Consola.Interficies testos = new Interficies();
        testos.titol("Això és títol amplada 60", 60);
        testos.titol("frase molt llarga que s'haura de partir ja que nomes li poso una amplada molt petita, que es de 30", 30);
    }

}
