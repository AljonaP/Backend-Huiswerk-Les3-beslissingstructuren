package nl.novi.opdrachten.methodes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;



/** DONE
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Check in de methode of deze list 3 entries heeft.
 *
 * Wanneer dit niet zo is: return de foutmelding: "Er zijn te veel of te weinig getallen in de lijst."
 * BONUS: Kun je een foutmelding voor te veel en een foutmelding voor te weinig maken?
 *
 * Wanneer er wel drie getallen in zijn:
 * Return het volgende:
 * Een list met getallen gesorteerd van laag naar hoog.
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class SorteerLijst {

    public static void main(String[] argeblabla) {

        List<Integer> wrongList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
        List<Integer> correctList = new ArrayList<>(Arrays.asList(88, 888, 909909));

        System.out.println(sortList(wrongList));
        System.out.println(sortList(correctList));

    }

    public static String sortList (List<Integer> numbers){
        if(numbers.size() !=3) {
            return "Er zijn te veel of te weinig getallen in de lijst.";}
        //BONUS
//        if(numbers.size() == 3){
//            return "Er zijn 3 entries in de list";
//        } else if(numbers.size() <3 ) {
//            return "Er zijn te weinig entries in de lijst (minder dan 3)";
//        } else {
//            return "Er zijn te veel entries in de lijst (meer dan 3)";
//        }

        if(numbers.get(0) > numbers.get(1)) {
            Collections.swap(numbers, 0, 1);
        }
        if(numbers.get(1) > numbers.get(2)) {
            Collections.swap(numbers, 1, 2);
            if(numbers.get(0) > numbers.get(1)) {
                Collections.swap(numbers, 0, 1);
            }
        }

        StringBuilder stringBuilder = new StringBuilder(); // we gebruiken een StringBuilder, omdat het opracht is "return een string" (reg.38: public status String sortList)
        for (Integer i : numbers) {
            stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString();
    }

}
