package WS2013_2014;

/**
 * Created by Tobias on 07/02/2017.
 */
public class ZahlTest {
    public static void main(String[] args) {
        System.out.println(((GanzeZahl) new GanzeZahl(2).add(new GanzeZahl(3))).getWert());
        System.out.println(((GanzeZahl) new GanzeZahl(2).mult(new GanzeZahl(3))).getWert());

        System.out.println(((Bruch) new Bruch(new GanzeZahl(2), new GanzeZahl(5)).add(new GanzeZahl(3))).getZaehler().getWert());
        System.out.println(((Bruch) new Bruch(new GanzeZahl(2), new GanzeZahl(5)).add(new GanzeZahl(3))).getNenner().getWert());

        System.out.println(((Bruch) new Bruch(new GanzeZahl(2), new GanzeZahl(5)).mult(new GanzeZahl(3))).getZaehler().getWert());
        System.out.println(((Bruch) new Bruch(new GanzeZahl(2), new GanzeZahl(5)).mult(new GanzeZahl(3))).getNenner().getWert());

        System.out.println(((Bruch) new Bruch(new GanzeZahl(2), new GanzeZahl(5)).add(new Bruch(new GanzeZahl(3), new GanzeZahl(5)))).getZaehler().getWert());
        System.out.println(((Bruch) new Bruch(new GanzeZahl(2), new GanzeZahl(5)).add(new Bruch(new GanzeZahl(3), new GanzeZahl(5)))).getNenner().getWert());

        System.out.println(((Bruch) new Bruch(new GanzeZahl(2), new GanzeZahl(5)).mult(new Bruch(new GanzeZahl(3), new GanzeZahl(5)))).getZaehler().getWert());
        System.out.println(((Bruch) new Bruch(new GanzeZahl(2), new GanzeZahl(5)).mult(new Bruch(new GanzeZahl(3), new GanzeZahl(5)))).getNenner().getWert());
    }
}
