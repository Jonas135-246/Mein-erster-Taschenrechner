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
