import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Tobias on 29/11/2016.
 */
public class MuenzeTest {
public static void main(String[] args) throws Exception {
        Random rnd = new Random();

        /*for (int i = 0; i < 100; i++) {
            try {
                int randomInt = rnd.nextInt(500), valueInt = 0;

                LinkedList<Muenze> result = Muenze.getMuenzen(randomInt);


                System.out.println("------------------------------------------");
                System.out.println("für : " + randomInt);
                for (Muenze m : result) {
                    valueInt += m.getValue();

                    System.out.println(m);
                }

                System.out.println();
                System.out.println("Ergebnis : " + valueInt);
                System.out.println();
                System.out.println();


                if (randomInt != valueInt) {
                    throw new Exception();
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
           }*/

        System.out.println(((GanzeZahl) new GanzeZahl(2).add(new GanzeZahl(3))).getWert());
        System.out.println(((GanzeZahl) new GanzeZahl(2).mult(new GanzeZahl(3))).getWert());

        System.out.println(((Bruch) new Bruch( new GanzeZahl(2),new GanzeZahl(5)).add(new GanzeZahl(3))).getZaehler().getWert());
        System.out.println(((Bruch) new Bruch( new GanzeZahl(2),new GanzeZahl(5)).add(new GanzeZahl(3))).getNenner().getWert());

        System.out.println(((Bruch) new Bruch( new GanzeZahl(2),new GanzeZahl(5)).mult(new GanzeZahl(3))).getZaehler().getWert());
        System.out.println(((Bruch) new Bruch( new GanzeZahl(2),new GanzeZahl(5)).mult(new GanzeZahl(3))).getNenner().getWert());

        System.out.println(((Bruch) new Bruch( new GanzeZahl(2),new GanzeZahl(5)).add(new Bruch( new GanzeZahl(3),new GanzeZahl(5)))).getZaehler().getWert());
        System.out.println(((Bruch) new Bruch( new GanzeZahl(2),new GanzeZahl(5)).add(new Bruch( new GanzeZahl(3),new GanzeZahl(5)))).getNenner().getWert());

        System.out.println(((Bruch) new Bruch( new GanzeZahl(2),new GanzeZahl(5)).mult(new Bruch( new GanzeZahl(3),new GanzeZahl(5)))).getZaehler().getWert());
        System.out.println(((Bruch) new Bruch( new GanzeZahl(2),new GanzeZahl(5)).mult(new Bruch( new GanzeZahl(3),new GanzeZahl(5)))).getNenner().getWert());



}
}
