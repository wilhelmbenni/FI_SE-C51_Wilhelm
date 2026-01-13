/**
 * Programmieraufgaben Verzweigungen
 * @author Benni Wilhelm (SE-C51)
 * @version Verzweigungsaufgaben
 */

// Aufgabe 1 - Gleiche Werte
import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Erste Zahl: ");
        int a = sc.nextInt();
        System.out.print("Zweite Zahl: ");
        int b = sc.nextInt();
        
        if (a == b) {
            System.out.println("Gleiche Werte");
        }
    }
}


// Aufgabe 2 - Reelle Zahlen sortieren
import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Erste Zahl: ");
        double a = sc.nextDouble();
        System.out.print("Zweite Zahl: ");
        double b = sc.nextDouble();
        
        if (a == b) {
            System.out.println(a + " " + b);
        } else if (a < b) {
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(b);
            System.out.println(a);
        }
    }
}


// Aufgabe 3 - Gerade/Ungerade
import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl eingeben: ");
        int zahl = sc.nextInt();
        
        if (zahl % 2 == 0) {
            System.out.println(zahl / 2);
        } else {
            System.out.println("Zahl ungerade");
        }
    }
}


// Aufgabe 4 - Bereich prüfen
import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl (0-100): ");
        int zahl = sc.nextInt();
        
        if (zahl < 0 || zahl > 100) {
            System.out.println("Fehlerhafte Eingabe");
        } else if (zahl > 50) {
            System.out.println("groß");
        } else {
            System.out.println("klein");
        }
    }
}
