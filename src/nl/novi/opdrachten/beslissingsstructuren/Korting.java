package nl.novi.opdrachten.beslissingsstructuren;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Korting {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Wat is het aankoopbedrag?");
        double aankoopBedrag = userInputScanner.nextDouble();
        int discount1 = 16;
        int discount2 = 10;
        DecimalFormat df = new DecimalFormat("0.00");

//        double roundOffAmountWithDiscount1 = (double)Math.round((aankoopBedrag/100.0)*(100.0-discount1));
        double roundOffAmountWithDiscount1 = (double)Math.round((aankoopBedrag/100.0)*(100.0-discount1));
        double roundOffAmountWithDiscount2 = (double)Math.round((aankoopBedrag/100.0)*(100.0-discount2));
//        System.out.println(roundOffAmountWithDiscount1);
//        System.out.println(roundOffAmountWithDiscount2);
//        System.out.printf("%.2f%n", roundOffAmountWithDiscount1);
        System.out.println(df.format(roundOffAmountWithDiscount1));

        if (aankoopBedrag >= 300.00 ) {
            System.out.println("De klant krijgt " + discount1 + "% korting. Het aankoopbedrag is nu " + Math.round(roundOffAmountWithDiscount1) + "€");
        } else if (aankoopBedrag >= 75.00) {
            System.out.println("De klant krijgt " + discount2 + "% korting. Het aankoopbedrag is nu:" + roundOffAmountWithDiscount2 + "€");
        } else {
            System.out.println("De klant krijgt geen korting. Het aankoopbedrag blijft " + aankoopBedrag + "€");
        }



        /*
        Hierboven is het aankoopbedrag ingevoerd. Het is de bedoeling dat jij de korting bepaalt en het nieuwe bedrag
        uitrekent.

        Wanneer het ingevoerde bedrag onder de 75 is, krijgt de klant geen korting. Print uit:
        "De klant krijgt geen korting. Het aankoopbedrag blijft -HIER HET BEDRAG-"

        Wanneer het ingevoerde bedrag 75,00 of hoger is, maar kleiner of gelijk aan 300.00 dan krijgt de klant 10%
        korting. Print uit:
        "De klant krijgt 10% korting. Het aankoopbedrag is nu: -HIER HET BEDRAG MET KORTING-"

        Wanneer het ingevoerde bedrag 300.01 of hoger is, krijgt de klant 16% korting. Print uit:
        "De klant krijgt 16% korting. Het aankoopbedrag is nu: -HIER HET BEDRAG MET KORTING-"
         */

    }
}
