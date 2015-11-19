/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jocs.dades;

/**
 *En aquesta classe guardem les dades necessàries per poder dur a terme una partida
 * tant del joc Comença Per com del joc Lletres Barrejades
 */
public class DadesPartidaLletresBarrejades {   
    public final String[] DICCIONARI = {
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
    
    public static int RONDES_PER_PARTIDA=6;
    public static int PUNTUACIO_INICIAL=0;
    public static int LIMIT = 30;
    public static double PUNTUACIO_RONDA1 = 0.5;
    public static double PUNTUACIO_RONDA2 = 0.2;
    public static double PUNTUACIO_RONDA3 = 0.1;
    
    public char[] diposit = new char[30];
    public String[] paraules;
    public String[] proposta;
    public String paraulaRandom;
    public boolean propostaValida;
   
    
    public int puntsRonda;
    public int puntsPartida;
    public int rondaActual=0;
}


