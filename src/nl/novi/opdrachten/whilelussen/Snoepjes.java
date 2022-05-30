package nl.novi.opdrachten.whilelussen;

public class Snoepjes {

    public static void main (String[] snoepjes) {
        int aantalSnoepjes = 22;

        // Deze code is uitgecommentarieerd, omdat de code niet compileert zonder dat er aanpassingen plaatsvinden.

        while(aantalSnoepjes > 1 ) { // Voeg hier de conditionele statement toe tussen de haakjes.
            System.out.println("Er zijn nog " + aantalSnoepjes + " snoepjes over. Tijd om er nog een op te eten.");
            aantalSnoepjes--;
             if(aantalSnoepjes == 1) {
                 System.out.println("Er is nog " + aantalSnoepjes + " snoepje over. Tijd om er nog een op te eten.");
             }
            // Zorg er hier voor dat het aantal snoepjes minder wordt.

            //AP: ik heb als extra if-statement toegevoegd voor 1 snoepje. Dis was niet gevraag maar het is logisch als er 1 snoepjE (zonder S)
        }
        System.out.println("De snoepjes zijn op.");
    }
}
