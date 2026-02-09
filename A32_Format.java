/**
 * Formatierte Konsolenausgabe
 * @author Benni Wilhelm (ITSE)
 * @version A3.2 Ausgabeformatierung
 */

public class A32_Format {
    public static void main(String[] args) {

        // ===== Aufgabe 1: Sternchen-Raute (ohne Leerzeichen, nur printf) =====
        System.out.println("--- Aufgabe 1 ---");
        System.out.printf("%4s%n", "**");
        System.out.printf("%-1s%5s%n", "*", "*");
        System.out.printf("%-1s%5s%n", "*", "*");
        System.out.printf("%4s%n", "**");

        System.out.println();

        // ===== Aufgabe 2: Temperaturtabelle =====
        System.out.println("--- Aufgabe 2 ---");

        // Überschrift
        System.out.printf("%-12s| %10s%n", "Fahrenheit", "Celsius");
        System.out.println("------------------------");

        // Fahrenheit-Werte
        int[] fahrenheit = {-20, -10, 0, 20, 30};

        for (int f : fahrenheit) {
            double celsius = (f - 32) * 5.0 / 9.0;
            // Fahrenheit: linksbündig, 12 Stellen, mit Vorzeichen
            // Celsius: rechtsbündig, 10 Stellen, 2 Nachkommastellen
            System.out.printf("%-+12d| %10.2f%n", f, celsius);
        }
    }
}
