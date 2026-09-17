# Mein erster Taschenrechner (Update: Dynamische Logik)

Ein konsolenbasierter Taschenrechner in Java, der Benutzereingaben verarbeitet und mathematische Grundoperationen ausführt. 

### Funktionen
- **Grundrechenarten:** Plus (`+`), Minus (`-`), Mal (`*`) und Geteilt (`/`).
- **NEU: Verdopplungs-Funktion (`v`):** Multipliziert die erste Zahl direkt mit 2.
- **Dynamischer Ablauf:** Das Programm erkennt live das gewählte Zeichen. Wird `v` gewählt, wird die Abfrage der zweiten Zahl intelligent übersprungen (Scope- & Kontrollfluss-Optimierung).
- **Fehler-Validierung:** Das Programm fängt das Teilen durch Null (`0`) ab und gibt eine eigene Fehlermeldung aus.

### Gelernte Grundlagen
- Benutzereingaben mit der Klasse `Scanner` verarbeiten
- Kontrollstrukturen (`if`, `else if`, `else`) für verschachtelte Abläufe
- Variablen-Gültigkeitsbereiche (**Variable Scope**) verstehen und anwenden
- Vorzeitiger Programmabbruch mit `return` bei Fehlern

- # Professioneller Taschenrechner (Update: Grafische UI)

Ein Java-Taschenrechner, der sowohl in einer optimierten Konsolen-Version als auch mit einer modernen, grafischen Benutzeroberfläche (UI) läuft.

### Funktionen
- **NEU: Grafische Oberfläche (GUI):** Ein echtes Desktop-Fenster, entwickelt mit `javax.swing` und `java.awt`.
- **Interaktive Buttons:** Nummernfeld (0-9) und Operationsknöpfe (+, -, *, /, v) komplett per Maus bedienbar.
- **Dynamisches Display:** Ein geschütztes Textfeld (`JTextField`) zur Live-Anzeige von Eingaben und Ergebnissen.
- **Verdopplungs-Funktion (`v`):** Multipliziert den aktuellen Displaywert sofort mit 2, ohne eine zweite Zahl abzufragen.
- **Crash-Schutz:** Verhindert die Division durch Null und gibt eine saubere Fehlermeldung auf dem Display aus.
- **Zwischenstands-Speicher:** Das Ergebnis wird für die nächste Rechenoperation als Basis gesichert (wie bei echten Taschenrechnern).

### Gelernte Grundlagen & GUI-Konzepte
- Fensterbau mit `JFrame`, `JPanel` und Layout-Managern (`BorderLayout`, `GridLayout`)
- Ereignisverarbeitung mittels **Event-Listening** (`ActionListener` & `ActionEvent`)
- Dynamische Typkonvertierung von Text zu Zahlen (`Double.parseDouble`)

