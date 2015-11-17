/*
 * Fitxer Projecte/jocs/GestorComencaPer.java
 */
package jocs;

/**
 * Gestiona les crides a funcions relacionades amb el joc Comença Per...
 *
 * @author Jessica
 */
public class GestorComencaPer {

    /**
     * Inicialitza el joc, les dades, mostra l'explicació del joc i gestiona les
     * opcions segons les propostes de l'usuari
     *
     * @param dades és l'estructura de dades iniicalitzada necessària per passar
     * a les crides
     */
    public void inici(/*EstructuraDades dades*/) {
        //A CODIFICAR... mostrar explicació i inicialitzar les dades necessàries:
        //paraulaAEndevinar, interficie.mostrarLletres
    }

    /**
     * Busca a l'atzar la paraula a endevinar per l'usuari
     *
     * @param dades és l'estructura de dades iniicalitzada necessària per fer
     * l'acció
     */
    public String paraulaAEndevinar(/*EstructuraDades dades*/) {
        String ret = null;
        //A CODIFICAR...
        return ret;
    }

    /**
     * Valida que la proposta sigui correcta o no, els punts a restar per
     * incorrecta es restaran aqui
     *
     * @param dades és la proposta demanada a l'usuari a Interficie
     * @return true si és correcta, false si és incorrecta
     */
    public boolean validarProposta(/*EstructuraDades dades*/) {
        boolean ret = false;
        return ret;
    }

    /**
     * Comprova si és possible donar més pistes a l'usuari
     *
     * @param punts que té l'usuari
     * @param paraulaAEndevinar per saber quantes lletres té en total
     * @param pistes per saber quantes lletres hem mostrat ja
     * @return true si es poden donar més pistes, false si no
     */
    public boolean esPotDonarMesPistes(int punts, String paraulaAEndevinar, String pistes) {
        boolean ret = false;
        return ret;
    }

    /**
     * Resta o suma els punts depenent de la proposta de l'usuari
     *
     * @param puntsActuals que té l'usuari
     * @param dades si demanarPistes = true, restar 2 punts, si validarProposta
     * = false, restar 1 punt
     * @return la nova puntuació
     */
    public int puntuacio(int puntsActuals /*EstructuraDades dades*/) {
        int ret = puntsActuals;
        return ret;
    }

    /**
     * mostra missatge de felicitació o de consolació i torna al menú principal
     */
    public void fiJoc() {
        //A CODIFICAR
    }

}
