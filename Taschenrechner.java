import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Gib die erste Zahl ein zum rechenen: ");
        double zahl1 = tastatur.nextDouble();
        System.out.println("Gib die zweite zahl ein zum rechenen: ");
        double zahl2 = tastatur.nextDouble();
        System.out.println("Gib eine rechenoperation ein (+, -, *, /): ");
        char zeichen = tastatur.next().charAt(0);
        double ergebnis = 0;

        if (zeichen == '+') {
            ergebnis = zahl1 + zahl2;
        } else if (zeichen == '-') {
            ergebnis = zahl1 - zahl2;
        } else if (zeichen == '*') {
            ergebnis = zahl1 * zahl2;
        } else if (zeichen == '/') {
            if (zahl2 == 0) {
                System.out.println("Fehler: Teilen durch 0 ist mathematisch nicht erlaubt!");
                return;
            } else {
                ergebnis = zahl1 / zahl2;
            }


            System.out.println("Das Ergebnis ist: " + ergebnis);
        }
    }
}