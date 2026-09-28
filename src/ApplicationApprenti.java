public class ApplicationApprenti {

    // -----------------------------------------------------------
    // Sujet : Analyse d'un signal Wi-Fi
    // -----------------------------------------------------------

    public static void main(String[] args) {
        // Au bon endroit, déclarez une constante String qui contient le nom de la zone
        // dans laquelle les mesures Wi-Fi sont effectuées.
        // Exemple : "Salle 203"

        // Au bon endroit, déclarez une constante qui représente le nombre de mesures
        // Wi-Fi à effectuer.
        // Valeur : 10

        // Au bon endroit, déclarez une constante qui représente la puissance minimale
        // du signal Wi-Fi pouvant être générée.
        // Valeur : -90

        // Au bon endroit, déclarez une constante qui représente la puissance maximale
        // du signal Wi-Fi pouvant être générée.
        // Valeur : -30

        // Créez un tableau pouvant contenir toutes les mesures du signal Wi-Fi.

        // @formatter:off
        //
        // Pour chaque cellule du tableau :
        //
        //      Générez une puissance de signal aléatoire comprise entre
        //      la puissance minimale et la puissance maximale.
        //
        //      Pour rappel, pour générer un nombre entier aléatoire entre MIN et MAX :
        //
        //      int nombre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        //
        //      Placez la mesure générée dans le tableau.
        //
        // @formatter:on

        // Affichez le nom de la zone sous la forme :
        //
        // Analyse du signal Wi-Fi dans la zone : Salle 203

        // Affichez toutes les mesures contenues dans le tableau sous la forme :
        //
        // Mesure 1 : -56 dBm
        // Mesure 2 : -72 dBm
        // Mesure 3 : -48 dBm
        // ...

        // Parcourez le tableau et calculez la somme de toutes les mesures.

        // Calculez ensuite la puissance moyenne du signal Wi-Fi.
        //
        // Attention : la moyenne doit pouvoir contenir des décimales.

        // Parcourez le tableau afin de rechercher :
        //
        // - la mesure la plus faible
        // - la mesure la plus forte
        //
        // Attention :
        // Avec les dBm, -90 représente un signal plus faible que -40.

        // Affichez les résultats sous la forme :
        //
        // Puissance moyenne : -XX.X dBm
        // Signal le plus faible : -YY dBm
        // Signal le plus fort : -ZZ dBm

        // Déclarez une variable entière nommée qualiteSignal.

        // En fonction de la puissance moyenne, donnez une valeur à qualiteSignal :
        //
        // 0 si la moyenne est inférieure à -75 dBm
        // 1 si la moyenne est comprise entre -75 dBm inclus et -65 dBm exclu
        // 2 si la moyenne est comprise entre -65 dBm inclus et -50 dBm exclu
        // 3 si la moyenne est supérieure ou égale à -50 dBm

        // À l'aide d'un switch sur la variable qualiteSignal, affichez :
        //
        // 0 -> "Signal Wi-Fi très faible"
        // 1 -> "Signal Wi-Fi faible"
        // 2 -> "Signal Wi-Fi correct"
        // 3 -> "Signal Wi-Fi excellent"

        // Affichez finalement :
        //
        // "Fin de l'analyse de la zone NOM_DE_LA_ZONE"

    }

}