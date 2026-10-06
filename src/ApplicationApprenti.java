public class ApplicationApprenti {

    // -----------------------------------------------------------
    // Sujet : Analyse d'un signal Wi-Fi
    // TOPIC: Wi-Fi signal analysis
    // -----------------------------------------------------------

    public static void main(String[] args) {
        // -----------------------------------------------------------
        System.out.println("SUJET : Analyse d'un signal Wi-Fi");
        System.out.println("TOPIC: Wi-Fi signal analysis");
        // -----------------------------------------------------------
        //
        // CONSIGNES EN FRANCAIS
        //
        // 1. Au bon endroit, declarez une constante String nommee NOM_ZONE qui contient
        // le nom
        // de la zone dans laquelle les mesures Wi-Fi sont effectuees.
        // Exemple : "Salle 203"
        //
        // 2. Au bon endroit, declarez une constante entiere nommee NB_MESURES qui
        // represente
        // le nombre de mesures Wi-Fi a effectuer.
        // Valeur : 10
        //
        // 3. Au bon endroit, declarez une constante entiere nommee SIGNAL_MIN qui
        // represente
        // la puissance minimale du signal Wi-Fi pouvant etre generee.
        // Valeur : 30
        //
        // 4. Au bon endroit, declarez une constante entiere nommee SIGNAL_MAX qui
        // represente
        // la puissance maximale du signal Wi-Fi pouvant etre generee.
        // Valeur : 90
        //
        // 5. Au bon endroit, declarez une constante entiere nommee SEUIL_SIGNAL_FAIBLE
        // qui represente
        // la valeur maximale pour un signal Wi-Fi faible.
        // Valeur : 50
        //
        // 6. Au bon endroit, declarez une constante entiere nommee SEUIL_SIGNAL_MOYEN
        // qui represente
        // la valeur maximale pour un signal Wi-Fi moyen.
        // Valeur : 70
        //
        // 7. Creez un tableau d'entiers nomme mesures pouvant contenir toutes les
        // mesures
        // du signal Wi-Fi.
        //
        // 8. Remplissez le tableau de valeurs aléatoires comprise entre SIGNAL_MIN et
        // SIGNAL_MAX
        // Pour rappel, pour generer un nombre entier aleatoire entre MIN et MAX :
        // int nombre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        //
        // 9. Affichez le nom de la zone sous la forme :
        // Wi-Fi signal analysis in area: Salle 203
        //
        // 10. Affichez toutes les mesures contenues dans le tableau sous la forme :
        // Measurement 1: 56 dBm
        // Measurement 2: 72 dBm
        // Measurement 3: 48 dBm
        // ...
        //
        // 11. Declarez trois variables entieres qui comptent combien de mesures sont :
        // - faibles : nombreSignauxFaibles ;
        // - moyennes : nombreSignauxMoyens ;
        // - fortes : nombreSignauxForts.
        //
        // 12. Parcourez le tableau. Pour chaque mesure, declarez une variable entiere
        // nommee etatSignal.
        //
        // Donnez un etat numerique a etatSignal :
        // - 0 si le signal est compris entre SIGNAL_MIN et SEUIL_SIGNAL_FAIBLE inclus ;
        // - 1 si le signal est plus grand que SEUIL_SIGNAL_FAIBLE et inferieur ou egal
        // a SEUIL_SIGNAL_MOYEN ;
        // - 2 si le signal est plus grand que SEUIL_SIGNAL_MOYEN et inferieur ou egal
        // a SIGNAL_MAX.
        //
        // Si vous n'arrivez pas a trouver l'etat, continuez avec la valeur par defaut :
        // etatSignal = 1
        //
        // 13. A l'aide d'un switch sur etatSignal, comptez la mesure dans une des
        // trois categories :
        // - 0 -> signal faible ;
        // - 1 -> signal moyen ;
        // - 2 -> signal fort.
        //
        // 14. Affichez les resultats sous la forme :
        // Signaux Faibles: X (X étant le nombre de signaux faible)
        // Signaux Moyens: Y (Y étant le nombre de signaux moyen)
        // Signaux Forts: Z (Z étant le nombre de signaux fort)
        //
        // 15. Affichez finalement :
        // Fin de l'analyse pour AREA_NAME
        //
        // -----------------------------------------------------------
        // -----------------------------------------------------------
        //
        // INSTRUCTIONS IN ENGLISH
        //
        // 1. In the correct place, declare a String constant named NOM_ZONE that
        // contains the name
        // of the area where the Wi-Fi measurements are made.
        // Example: "Salle 203"
        //
        // 2. In the correct place, declare an integer constant named NB_MESURES that
        // represents
        // the number of Wi-Fi measurements to make.
        // Value: 10
        //
        // 3. In the correct place, declare an integer constant named SIGNAL_MIN that
        // represents
        // the minimum Wi-Fi signal power that can be generated.
        // Value: 30
        //
        // 4. In the correct place, declare an integer constant named SIGNAL_MAX that
        // represents
        // the maximum Wi-Fi signal power that can be generated.
        // Value: 90
        //
        // 5. In the correct place, declare an integer constant named
        // SEUIL_SIGNAL_FAIBLE that represents
        // the maximum value for a weak Wi-Fi signal.
        // Value: 50
        //
        // 6. In the correct place, declare an integer constant named SEUIL_SIGNAL_MOYEN
        // that represents
        // the maximum value for a medium Wi-Fi signal.
        // Value: 70
        //
        // 7. Create an integer array named mesures that can contain all Wi-Fi signal
        // measurements.
        //
        // 8. Fill the array with random values between SIGNAL_MIN and SIGNAL_MAX.
        // To generate a random integer between MIN and MAX:
        // int nombre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        //
        // 9. Display the area name in this format:
        // Wi-Fi signal analysis in area: Salle 203
        //
        // 10. Display all measurements stored in the array in this format:
        // Measurement 1: 56 dBm
        // Measurement 2: 72 dBm
        // Measurement 3: 48 dBm
        // ...
        //
        // 11. Declare three integer variables that count how many measurements are:
        // - weak: nombreSignauxFaibles;
        // - medium: nombreSignauxMoyens;
        // - strong: nombreSignauxForts.
        //
        // 12. Browse the array. For each measurement, declare an integer variable
        // named etatSignal.
        //
        // Give a numeric state to etatSignal:
        // - 0 if the signal is between SIGNAL_MIN and SEUIL_SIGNAL_FAIBLE included;
        // - 1 if the signal is greater than SEUIL_SIGNAL_FAIBLE and less than or
        // equal to SEUIL_SIGNAL_MOYEN;
        // - 2 if the signal is greater than SEUIL_SIGNAL_MOYEN and less than or
        // equal to SIGNAL_MAX.
        //
        // If you cannot find the state, continue with this default value:
        // etatSignal = 1
        //
        // 13. With a switch on etatSignal, count the measurement in one of the
        // three categories:
        // - 0 -> weak signal;
        // - 1 -> medium signal;
        // - 2 -> strong signal.
        //
        // 14. Display the results in this format:
        // Weak signals: X (X is the number of weak signals)
        // Medium signals: Y (Y is the number of medium signals)
        // Strong signals: Z (Z is the number of strong signals)
        //
        // 15. Finally display:
        // End of the analysis for area AREA_NAME

    }

}