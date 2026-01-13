/**
 * BMI Rechner
 * @author Benni Wilhelm (SE-C51)
 * @version A4.23 BMI Berechnung
 */

import java.util.Scanner;

public class A423_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Eingabe Körpergröße
        System.out.print("Bitte geben Sie Ihre Körpergröße in cm an:");
        double groesseCm = sc.nextDouble();
        
        // Eingabe Gewicht
        System.out.print("Bitte geben Sie jetzt Ihr Gewicht in kg an:");
        double gewicht = sc.nextDouble();
        
        // Eingabe Geschlecht
        System.out.print("Als letztes geben Sie bitte Ihr Geschlecht an m/w:");
        String geschlecht = sc.next();
        
        // BMI Berechnung
        double groesseMeter = groesseCm / 100;
        double bmi = gewicht / (groesseMeter * groesseMeter);
        
        // Klassifikation
        if (geschlecht.equals("w")) {
            // Frauen
            if (bmi < 19) {
                System.out.println("Sie haben Untergewicht");
            } else if (bmi <= 24) {
                System.out.println("Sie haben Normalgewicht");
            } else {
                System.out.println("Sie haben Übergewicht");
            }
        } else {
            // Männer
            if (bmi < 20) {
                System.out.println("Sie haben Untergewicht");
            } else if (bmi <= 25) {
                System.out.println("Sie haben Normalgewicht");
            } else {
                System.out.println("Sie haben Übergewicht");
            }
        }
        
        // BMI Ausgabe formatiert
        System.out.printf("BMI: %.2f", bmi);
        
        sc.close();
    }
}
