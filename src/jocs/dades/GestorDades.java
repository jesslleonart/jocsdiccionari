
package jocs.dades;

/**
 *
 *
 */
public class GestorDades {

    /**
     * Crea una inatància de les dades del Joc ComencaPer per a la quantitat de
     * jugadors indicada
     *
     * @param numJugadors numero de jugadors que jugaran
     * @return la instancia creada de les dades d'aquest joc
     */
    public DadesPartidaComencaPer crearDadesCP() {
        //creació d'una instància de DadesJoc
        //DadesJocComencaPer dadesJocComencaPer = new DadesJocComencaPer();
        DadesPartidaComencaPer dadesPartidaComencaPer = new DadesPartidaComencaPer();

        //creació de la instancia de DadesJugadors
        //dadesJocComencaPer.dadesJugadors = new DadesJugadors();
        //creació de la instancia de DadesPartida
        //dadesJocComencaPer.dadesPartidaComencaPer = new DadesPartidaComencaPer();
        //Creació dels vector de dades de totes les estructures
        //dadesJocComencaPer.dadesJugadors.nomsJugadors=new String[numJugadors];
        //dadesJocComencaPer.dadesJugadors.puntsJoc=new int;
        dadesPartidaComencaPer.puntsPartida = 15;

        return dadesPartidaComencaPer;
    }

    /**
     * Crea una instància de les dades del Joc LletresBarrejades per a la
     * quantitat de jugadors indicada
     *
     * @param numJugadors numero de jugadors que jugaran
     * @return la instancia creada de les dades d'aquest joc
     */
    public DadesPartidaLletresBarrejades crearDadesLB() {
        //creació d'una instància de DadesJoc
        //DadesJocLletresBarrejades dadesJocLletresBarrejades = new DadesJocLletresBarrejades();
        DadesPartidaLletresBarrejades dadesPartidaLletresBarrejades = new DadesPartidaLletresBarrejades();

        //creació de la instancia de DadesJugadors
        //dadesJocLletresBarrejades.dadesJugadors = new DadesJugadors();
        //creació de la instancia de DadesPartida
        //dadesJocLletresBarrejades.dadesPartidaLletresBarrejades = new DadesPartidaLletresBarrejades();
        //Creació dels vector de dades de totes les estructures
        //dadesJocLletresBarrejades.dadesJugadors.nomsJugadors=new String[numJugadors];
        //dadesJocLletresBarrejades.dadesJugadors.puntsJoc=new int[numJugadors];
        //dadesJocLletresBarrejades.dadesPartidaLletresBarrejades.puntsPartida=0;
        return dadesPartidaLletresBarrejades;
    }

    /**
     * Obtenir les dades dels jugadors, si volem que n'hi hagi més d'un més
     * endavant
     *
     * @param dadesJoc és la instancia on es guarden les dades del joc
     * @return les dades dels jugadors
     */
    //public DadesJugadors obtenirDadesJugadors(DadesJocComencaPer dadesJocComencaPer){
    //  return dadesJocComencaPer.dadesJugadors;
    //}
    /**
     * Obtenir les dades d'una partida
     *
     * @param dadesJoc és la instancia on es guarden les dades del joc
     * @return les dades de la partida
     */
    //public DadesPartidaComencaPer obtenirDadesPartida(DadesPartidaComencaPer dadesPartidaComencaPer){
    //  return dadesPartidaComencaPer.dadesPartidaComencaPer;
    //}
    //public DadesPartidaLletresBarrejades obtenirDadesPartida(DadesJocLletresBarrejades dadesJocLletresBarrejades){
    //  return dadesJocLletresBarrejades.dadesPartidaLletresBarrejades;
    //}
    /**
     * Obtenir els noms dels jugadors
     *
     * @param dadesJugadors és la instancia on es guarden les dades dels
     * jugadors
     * @return el noms
     */
    //public String[] obtenirNomsDelsJugadors(DadesJugadors dadesJugadors){
    //  return dadesJugadors.nomsJugadors;
    //}
    /**
     * Obté el vector de punts aconseguits per cada jugador durant totes les
     * partides jugades
     *
     * @param dadesJugadors és la instancia on es guarden les dades dels
     * jugadors
     * @return el vector de punts
     */
    //public int[] obtenirPuntsJugador(DadesJugadors dadesJugadors){
    //  return dadesJugadors.puntsJoc;
    //}
    /**
     * Obté el vector de punts durant una partida
     *
     * @param dadesPartida és la instancia on es guarden les dades d'una partida
     * @return el vector de punts
     */
    //public int obtenirPuntsPartida(DadesPartidaComencaPer dadesPartida){
    //  return dadesPartida.puntsPartida;
    //}
    /**
     * Acumula els punts d'una ronda durant el transcurs d'una partida
     *
     * @param dadesPartida és la instancia on es guarden les dades d'una partida
     * @param jugador és la posició del jugador on aculular els punts
     * @param puntsAconseguits són els punts aconseguits
     */
    public void acumularPuntsRonda(DadesPartidaLletresBarrejades dadesPartidaLletresBarrejades, int ronda, int puntsAconseguits) {
        //Acumula els punts de la ronda
        dadesPartidaLletresBarrejades.puntsPartida += puntsAconseguits;
    }

    /**
     * Passa a la següent ronda
     *
     * @param dadesPartida és la instancia on es guarden les dades d'una partida
     */
    public void passarSeguentRonda(DadesPartidaLletresBarrejades dadesPartidaLletresBarrejades) {
        dadesPartidaLletresBarrejades.rondaActual++;
    }

    /**
     * Comprova si cal acabar la partida o encara queden torns per jufgar
     *
     * @param dadesPartida és la instancia on es guarden les dades d'una partida
     * @return cert si encara queden torns per jugar i fals en cas contrari
     */
    public boolean esFinalPartida(DadesPartidaLletresBarrejades dadesPartidaLletresBarrejades) {
        //la partida s'ha d'acabar quan s'agi arribat al nombre màxim de torns 
        return dadesPartidaLletresBarrejades.rondaActual == DadesPartidaLletresBarrejades.RONDES_PER_PARTIDA;
    }

    /**
     * inicia les dades de la partida per tal que es pugui començar
     *
     * @param dadesPartida és la instancia on es guarden les dades d'una partida
     */
    public void iniciarPartida(DadesPartidaComencaPer dadesPartida) {
        dadesPartida.puntsPartida = dadesPartida.PUNTUACIO_INICIAL;
    }

    /**
     * inicia les dades de la partida per tal que es pugui començar
     *
     * @param dadesPartida és la instancia on es guarden les dades d'una partida
     */
    public void iniciarPartida(DadesPartidaLletresBarrejades dadesPartida) {
        dadesPartida.rondaActual = 0;
        dadesPartida.puntsPartida = 0;
    }

    /**
     * Afegir un nou jugador a l'estructura de dades
     *
     * @param dadesJugadors és la instancia on es guarden les dades dels
     * jugadors
     * @param nom és el nom del jugador a inserir
     * @param posicio és la posició on cal situra el nou jugador
     */
    //public void afegirJugador(DadesJugadors dadesJugadors, 
    //                                  String nom, 
    //                                int posicio){
    //dadesJugadors.nomsJugadors[posicio]=nom;
    //dadesJugadors.puntsJoc[posicio]=0;
    //}
    /**
     * Acumular punts del joc a cada jugador després d'una partida
     *
     * @param dadesPartida és la instancia on es guarden les dades d'una partida
     * @param punts són els punts aconseguits
     */
    //public void acumularPuntsJoc(DadesJugadors dadesJugadors, int punts){
    //  int numJugadors = dadesJugadors.nomsJugadors.length;
    //for(int i=0; i<numJugadors; i++){
    //  dadesJugadors.puntsJoc[i]+=punts[i];
    //}     
    //}
}
