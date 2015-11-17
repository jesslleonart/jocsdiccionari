/*
 * 
 */
package jocs;

/**
 * Gestiona les crides a funcions relacionades amb el joc LletresBarrejades
 *
 * @author Jessica
 */
public class GestorLletresBarrejades {

    /**
     * Inicialitza el joc, les dades, mostra l'explicació del joc i gestiona les
     * opcions segons les propostes de l'usuari
     *
     * @param dades és l'estructura de dades inicialitzada necessària per passar
     * a les crides
     */
    public void inici(/*EstructuraDades dades*/) {
        String[] diccionari = {
            "a", "abadessa", "abandonat", "abarnegat", "abat", "abatussat", "abissal", "abnegat",
            "abrainat", "abruptesa", "abscissa", "absolut", "abstreure", "acabar", "acampar",
            "accent", "acer", "acerat", "acid", "aclamar", "aclarir", "aclarit", "acrata",
            "acrobacia", "adagi", "adaptar", "adeptes", "adequar", "adequat", "adeu", "adherir",
            "admetre", "adonar", "adormir", "adscriure", "adust", "advers", "advocat", "afanar",
            "afany", "afavorir", "afavorit", "afebleix", "afeblit", "afectat", "afectiu", "afectuos",
            "afegir", "afer", "afilar", "afinar", "afi", "afligir", "afligit", "aflorar", "afluent",
            "afluixar", "agafar", "agalla", "agata", "agencia", "agrair", "agrait", "agrari", "agre",
            "agregar", "agror", "aguila", "ah", "ahir", "aigua", "aiguat", "aire", "aixada", "aixafar",
            "aixecar", "aixeta", "aixella", "aixi", "aixo", "aixovar", "ajeure", "ajornar",
            "ajudar", "ajupir", "ajustar", "ala", "albada", "albi", "ale", "alenar",
            "alevi", "alga", "algid", "algu", "alie", "alla", "alli", "allo", "alma", "alpi",
            "altivesa", "amagar", "amanida", "amanir", "ambre", "amorf", "ample", "ampliar",
            "anar", "anca", "angoixa", "anis", "ansa", "apagar", "apagat", "apercebre",
            "apostata", "arbre", "aristòcrata", "atreure", "audiofon", "autocrata",
            "baixa", "bali", "bandol", "barata", "barbar", "barrera", "bassal", "bata",
            "benveure", "benviure", "bestraure", "bobila", "bossarrera", "bravata", "bufor",
            "cabre", "caixa", "calabre", "calibre", "canelobre", "cantata", "carabassal", "carrera",
            "casal", "caure", "causa", "celebre", "censal", "centaure", "cercavila", "circumscriure",
            "clamar", "clar", "cloure", "codol", "colossal", "columnata", "comensal", "commoure",
            "complaure", "concloure", "condol", "contramarc", "contrapès", "contreure",
            "convilatà", "conviure", "corbata", "correra", "coure", "creure", "cuixa", "culata",
            "data", "decaure", "de", "decebre", "deixa", "descloure", "descriure", "desfilar",
            "deslliurat", "desviure", "detreure", "deure", "distreure", "egagropila", "embeure",
            "emfasi", "empes", "entreploure", "entreveure", "errata", "es", "escandol", "escarlata",
            "escata", "escaure", "espes", "excloure", "extasi", "extreure", "fe", "febre", "fetge",
            "fila", "fluixa", "fragata", "frenopata", "funebre", "gaiata", "gebre", "glabre",
            "gramofon", "heretgia", "hipotesi", "homofon", "horabaixa", "i", "idol", "incloure",
            "inscriure", "jeure", "licorera", "lleure1", "llibre", "lliure", "lúgubre", "magnetofon",
            "malveure", "manobre", "marbre", "membre", "microfon", "minotaure", "moure", "nombre",
            "o", "olla", "onda", "onada", "or", "orca", "orfebre", "pagar", "pagat", "paper", "paraula",
            "pebre", "piga", "plaure", "plorar", "ploure", "pobre", "postdata", "prescriure", "preveure",
            "promoure", "prorrompre", "proscriure", "public", "pulcre", "pupitre", "que", "queixa", "readmetre",
            "recloure", "regata", "reixa", "remoure", "retreure", "rivetaire", "romandre", "sabata", "sabre",
            "safata", "salubre", "serenata", "sobreviure", "sostreure", "subscriure", "tabac", "tabal", "tacar",
            "tacat", "tacit", "tacte", "tactica", "tactil", "talar", "tall", "talla", "tallar", "talos",
            "talp", "tambe", "tampo", "tanca", "tanc", "tapar", "tapat", "tapia", "tarda", "tasca",
            "tassa", "taula", "tauro", "taxa", "tebia", "tecla", "telefon", "timbre", "vaca", "vacu",
            "vaga", "vago", "vall", "vampir", "vandal", "vanova", "vapor", "vaquer", "variar",
            "variat", "vector", "vedell", "vegada", "vei", "veinal", "veinat", "vel", "velada",
            "veler", "vell", "vena", "vencer", "vençut", "venda", "vendre", "venial", "venjar",
            "venjat", "venosa", "vent", "ventar", "ventre", "verb", "verd", "veri", "vers", "veto",
            "veu", "viure", "vorera"
        };
        //A CODIFICAR... mostrar explicació i inicialitzar les dades necessàries:
        //
    }
    /**
     * 
     * @param paraules
     * @param diposit
     * @return 
     */
     public boolean lletresDeParaulesAlDiposit(String[] paraules, char[] diposit) {
        boolean ret = true;
        boolean[] auxiliar = new boolean[diposit.length];
        for (int i = 0; i < diposit.length; i++) {
            auxiliar[i] = false;
        }
        for (String paraula : paraules) {
            for (int i = 0; i < paraula.length(); i++) {
                for (int j = 0; j < auxiliar.length; j++) {
                    if (paraula.charAt(i) == diposit[j]) {
                        if (auxiliar[j] == false) {
                            auxiliar[j] = true;
                            if (i + 1 == paraula.length()) {
                                ret = true;
                                break;
                            }
                            break;
                        }
                    } else {
                        if (j + 1 == auxiliar.length) {
                            ret = false;
                            break;
                        }
                    }

                }

            }

        }

        return ret;
    }

    /**
     * Genera el dipòsit de lletres amb el que jugarà l'usuari
     *
     * @param dades és l'estructura de dades iniicalitzada necessària per fer
     * l'acció
     */
    public char[] diposit(/*EstructuraDades dades*/) {
        char ret[] = null;
        //A CODIFICAR... obtenirParaulesALAtzar, barrejar lletres... fins que tinguem el dipòsit
        return ret;
    }
    /**
     * 
     * @param diccionari
     * @param NOM_LLETRES
     * @return 
     */
    public String[] obtenirParaulesALAtzar(String[] diccionari, int NOM_LLETRES) {
        String[] intermig = new String[NOM_LLETRES], ret = null; //Ens assegurem que el Array temporal serà prou gran
        int ind;
        int total = 0;
        int i = 0;
        while (total != NOM_LLETRES) {
            ind = (int) Math.floor(Math.random() * diccionari.length);

            intermig[i] = diccionari[ind];

            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    total = intermig[j].length();
                } else {
                    total += intermig[j].length();
                }

            }
            if (total < NOM_LLETRES) {
                i++;
                ret = new String[i + 1];
            } else if (total == NOM_LLETRES) {

                System.arraycopy(intermig, 0, ret, 0, i + 1);
            } else {
                i = 0;
            }

        }
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
        // comparar la proposta de l'usuari amb el dipòsit 
        return ret;
    }

    /**
     * Actualitza les lletres disponibles del dipòsit després de la proposta de
     * l'usuari
     *
     * @param dades inclou la proposta de l'usuari si ha estat validada
     * @return el nou dipòsit
     */
    public char[] actualitzarDiposit(/*EstructuraDades dades*/) {
        char[] ret = null;
        return ret;
    }

    /**
     * Resta o suma els punts depenent de la proposta de l'usuari
     *
     * @param puntsActuals que té l'usuari
     * @param dades necessitem saber el torn en el que estem i les lletres
     * utilitzades en la proposta
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
