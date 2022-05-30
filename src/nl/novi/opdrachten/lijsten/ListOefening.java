package nl.novi.opdrachten.lijsten;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        toPrintList(clubNames); // DONE Vraag - 1
        printListWithPositionNr(clubNames); // DONE Vraag 0

        // Vraag 1
        addNewClub(clubNames, "DOSC");
        System.out.println("New List with added DOSC club from 'Vraag 1' :" + clubNames);

        // DONE Vraag 2
        int position = showListPosition(clubNames, "DOSC");
        System.out.println("Show position nr of the club from 'Vraag 2': " + position);

        // DONE Vraag 3
        //We voegen eerst de nieuwe clubs aan clubNames:
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");
        System.out.println(clubNames);

        sortClubNamesWithAjaxFirst(clubNames);
        System.out.println("New list with clubNames with added 3 clubs and with Ajax on 1st place from 'Vraag 3': ");
        printListWithPositionNr(clubNames);

        // DONE Vraag 4
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");
        System.out.println("Vraag 4. Updated club's list with added 2 new clubs: " + clubNames);

        System.out.println("PSV last: ");
        clubNames = sortClubNamesWithPSVlast(clubNames);
        System.out.println("List after sorting and PSV Last:");
        printListWithPositionNr(clubNames);

    }


    // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.
    public static void toPrintList(List<String> clubs) {
        System.out.println("The list with football clubs: ");
        for (String club : clubs) {
            System.out.println(club);
        }
    }

    // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
    // Bovenstaande list zou dan dit zijn:
    // 0 - Ajax
    // 1 - PSv
    // etc...

    public static void printListWithPositionNr(List<String> clubs) {
        System.out.println("The list with position numbers: ");
        for (int i = 0; i < clubs.size(); i++) {
            System.out.println(i + " : " + clubs.get(i));
        }
    }

    // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
//
//    public static void addNewClub(List<String> clubs, String clubName) {
//        for (String club : clubs) {
//            if (clubName == clubs.club) {
//                System.out.println("Here is the clubs name you have searched: " + clubName);
//            }
//            clubs.add(clubName);
//        }

    public static void addNewClub(List<String> clubs, String clubName) {
        if (isUnique(clubs, clubName)) {
            clubs.add(clubName);
        }
    }

    //deze methode wordt gebruikt in de Vraag 1 en Vraag 2
    public static boolean isUnique(List<String> clubs, String clubName) {
        for (String club : clubs) {
            if (club.equalsIgnoreCase(clubName)) {
                return false;
            }
        }
        return true;
    }

    // DONE Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
    public static int showListPosition(List<String> clubs, String clubName) {
        if (!isUnique(clubs, clubName)) {
            for (int i = 0; i < clubs.size(); i++) {
                if (clubName.equalsIgnoreCase(clubs.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
    // clubs die voor Ajax staan verwijderd worden.
//    // We voegen nog wat clubs toe om de code te kunnen testen.
//        clubNames.add("AA Aachen");
//        clubNames.add("AFC Amsterdam");
//        clubNames.add("AFC");

    public static void sortClubNamesWithAjaxFirst(List<String> clubs) {
        Collections.sort(clubs);

        while (showListPosition(clubs, "Ajax") !=0) {
            clubs.remove(0);
        }
    }

    // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
//        clubNames.add("Zlotty FC");
//        clubNames.add("SC Eindhoven");
    public static List<String> sortClubNamesWithPSVlast(List<String> clubs) {
        Collections.sort(clubs);

        int positionPSV = showListPosition(clubs, "psv");
        System.out.println("index position of PSV club: " + positionPSV);

        List<String> tempList = new ArrayList<>();

        for (int i = 0; i < clubs.size(); i++){
            if(i <= positionPSV){
                tempList.add(clubs.get(i));
            }
        }
        return tempList;
    }
}

