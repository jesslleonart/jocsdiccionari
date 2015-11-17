/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

/**
 * Aquesta classe serveix per a presentar d'una manera més maca les interfícies
 * que necessitis per a la teva aplicació.
 *
 * @author solde
 */
public class Interficies {

    /**
     * Presenta per consola amb una decoració digna d'un inici d'aplicació
     *
     * @param text és el text a mostrar per pantalla
     * @param amplada és la amplada de línia que volem pel text
     */
    public void titol(String text, int amplada) {
        String textFinal, farciment = "*";
        int espai;
        espai = amplada - text.length();
        separacio("*", amplada);
        System.out.print('*');
        textCentrat(text, amplada - 2);
        System.out.println("*");
        separacio("*", amplada);
    }

    public void textCentrat(String text, int amplada) {
        String textFinal = "", textFinal2 = "", farciment = "*";
        String[] partides;
        double espai, conta = 0, totalLletres = text.length();
        if (amplada > totalLletres) {
            espai = Math.floor((amplada - totalLletres) / 2);
            for (int i = 0; i < espai; i++) {
                textFinal += " ";
            }

            if ((amplada - totalLletres) % 2 == 1) {
                textFinal2 = textFinal + " ";
            } else {
                textFinal2 = textFinal;
            }

            System.out.print(textFinal + text + textFinal2);
        } else {
            int marge = 10;
            
            partides = text.split(" ");

            int divisions = (int) totalLletres / amplada;
            String[] subfrases = new String[divisions];

            for (int i = 0; i < divisions; i++) {
                subfrases[i] = "";
                conta = 0;
               
                    for (String particula : partides) {
                        subfrases[i] += particula + " ";
                        conta = conta + particula.length() +4;
                     if(conta>totalLletres/divisions) ;   
                    }
                
                textCentrat(subfrases[i], amplada);
                System.out.println();
            }

        }

    }

    /**
     * Presenta per consola un menú numerat en un format amigable
     *
     * @param text és el text de presentació per a mostrar a sobre del menú
     * @param opcions és l'array d'opcions que es mostraràn per a que l'usuari
     * escolleixi
     * @param amplada
     */
    public void llistaMenu(String text, String[] opcions, int amplada) {

    }

    /**
     * Mostra per consola un text d'acomiadament i tanca amb una cenefa
     *
     * @param text és el text a mostrar per consola
     * @param amplada
     */
    public void fi(String text, int amplada) {

    }

    /**
     * Mostra per consola una cenefa a base de caràcters escollits, amb una
     * amplada definida per l'usuari
     *
     * @param dibuix és el dibuix (a base de caracters) que es repetirà com una
     * cenefa
     * @param amplada és l'amplada que volem que tingui la cenefa
     */
    public void separacio(String dibuix, int amplada) {
        int h = 0;
        while (h < amplada) {
            //recòrrer cada caracter del dibuix i imprimir-lo
            for (int i = 0; i < dibuix.length(); i++) {
                System.out.print(dibuix.charAt(i));
                h++;
                if (h >= amplada) {
                    break;
                }
            }
        }
        System.out.println();
    }

    /**
     * Presenta un text envoltat d'un farciment personalitzat
     *
     * @param text és el text que es mostrarà
     * @param farcit és el caracter que farcirà l'espai restant
     * @param amplada és l'amplada de linia definida per a la consola
     * @param dreta si és true, farcirà a la dreta del text i si no, ho farà a
     * l'esquerra
     */
    public static void farciment(String text, char farcit, int amplada, boolean dreta) {
        String textFinal, farciment = "";
        int espai;
        espai = amplada - text.length();
        if (espai < 4) {
            textFinal = text.substring(0, amplada - 3) + "...";
        } else {
            for (int i = 0; i < espai; i++) {
                farciment += farcit;
            }
            if (dreta) {
                textFinal = text + farciment;
            } else {
                textFinal = farciment + text;
            }

        }

        System.out.println(textFinal);

    }

}
