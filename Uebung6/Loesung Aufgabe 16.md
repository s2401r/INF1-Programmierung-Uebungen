### Lösung Aufagabe 16

#### Berechenbar.java

- Keine Fehler

#### Zahl.java

- Fehler im Konstruktor:
  - Fehler der zum Absturz führt:
    - Konstruktor wird im Konstruktor erneut aufgerufen, daraus resultiert eine Dauerschleife. (StackOverflowException)
  - Fehler der das Compilieren des Projekts verhindert:
    - Ein Konstruktor hat kein Rückgabewert und kann deswegen kein Object zurückgeben.

#### Summe.java

- Fehler in der Klasse:
  - Fehler der das Compilieren des Projekts verhindert:
    - Die Klasse muss, da sie vom Interface Berechenbar erbt, ihre Methode "berechnen()" implementieren. Die Klasse Summe implementiert jedoch lediglich die Methode "berechnen(double alle)".


- Fehler in der Methode "berechnen(double alle)":
  - Fehler der das Compilieren des Projekts verhindert:
    - In der Methode werden if-Verzweigungen genutzt die mehrere Befehle ausführen sollen. Wenn eine if-Verzweigung jedoch mehrere Befehle ausführen soll müssen diese in geschweiften Klammern (--> {  } ) stehen.
    - return ist keine gültige Bezeichnung für eine Variable.

#### Addition.java

  - Keine Fehler

#### Aufgabe.java

- Fehler in der Klasse:
  - Fehler der das Compilieren des Projekts verhindert:
    - Java achtet auf Groß- und Kleinschreibung, deswegen muss "Berechenbar" großgeschrieben sein, damit es vom Compiler erkannt wird.
    - Hinter einer Klassendeklaration "public class Aufgabe implements berechenbar(){}" dürfen keine Klammern stehen. Die Parameter werden im Konstruktor der Klasse angegeben.


- Fehler in der Methode "berechnen(double alle)":
  - Fehler der das Compilieren des Projekts verhindert:
    - In der Methode wird die Variable 2 nicht instanziert.
