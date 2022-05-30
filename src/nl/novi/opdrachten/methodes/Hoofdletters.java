package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * DONE
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * DONE
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 *
 *
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class Hoofdletters {

    public static void main(String[] args) {
        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");

        // Maak een methode die een List als parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
        for (int i = 0; i < customerNames.size(); i++) {
            String tempName = customerNames.get(i);
            System.out.println("tempName " + tempName);

            String[] splitNames = tempName.split(" "); //met String[] split methode wordt de string "voornaam achternaam" gesplitst in {"voornaam", "achternaam"} o.b.v. regex " "
            for (int j = 0; j < splitNames.length; j++) { //bepalen de lengte van elke element (string) van object (String tempName), in dit geval "voornaam" en "achternaam"
                if (!isTussenVoegsel(splitNames[j])) { //las er geen tussenvoegsel is
                    String newName = splitNames[j].substring(0, 1).toUpperCase() + splitNames[j].substring(1);
                    splitNames[j] = newName;
                }
            }
            tempName = String.join(" ", splitNames);
            customerNames.set(i, tempName);
        }

        for (String customerName : customerNames) {
            System.out.println(customerName);
        }
    }

        public static boolean isTussenVoegsel (String word){
            List<String> tussenvoegsels = Arrays.asList("van", "de", "den");
            for (String tussenvoegsel : tussenvoegsels) {
                if (word.equalsIgnoreCase(tussenvoegsel)) {
                    return true;
                }
            }
            return false;
        }
}




