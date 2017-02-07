package SS2005;

/**
 * Created by Tobias on 06/02/2017.
 */
public class FlughafenTest {

    public static void main(String[] args) {
        new FlughafenTest().test();
    }

    public void test() {
        Flughafen flugHafen1 = new Flughafen("Mallorca");
        Flughafen flugHafen2 = new Flughafen("Berlin");
        Flughafen flugHafen3 = new Flughafen("Frankfurt");
        Flughafen flugHafen4 = new Flughafen("Hamburg");
        Flughafen flugHafen5 = new Flughafen("Düsseldorf");
        Flughafen flugHafen6 = new Flughafen("New York");
        Flughafen flugHafen7 = new Flughafen("Los Angeles");
        Flughafen flugHafen8 = new Flughafen("London");
        Flughafen flugHafen9 = new Flughafen("Münster");
        Flughafen flugHafen10 = new Flughafen("Heek");


        flugHafen1.neuerFlug(flugHafen2, 0, 119);
        flugHafen2.neuerFlug(flugHafen3, 120, 1300);
        flugHafen3.neuerFlug(flugHafen4, 240, 359);
        flugHafen4.neuerFlug(flugHafen5, 360, 479);
        flugHafen5.neuerFlug(flugHafen6, 480, 0);
        flugHafen6.neuerFlug(flugHafen7, 0, 0);
        flugHafen7.neuerFlug(flugHafen8, 0, 0);
        flugHafen8.neuerFlug(flugHafen9, 0, 0);
        flugHafen9.neuerFlug(flugHafen10, 0, 0);
        flugHafen10.neuerFlug(flugHafen1, 0, 0);

        flugHafen2.neuerFlug(flugHafen3, 690, 799);
        flugHafen3.neuerFlug(flugHafen4, 1200, 1299);


        Flug[] connection = flugHafen1.sucheVerbindung(flugHafen4, 0, 4);
        if (connection != null) {
            for (int i = 0; i < connection.length; i++) {
                if (connection[i] != null)
                    System.out.println("Start: " + connection[i].getStart() + ", Ziel: " + connection[i].getZiel()+ ", Startzeit: "+ connection[i].getStartzeit() + ", Dauer: "+ connection[i].getFlugdauer() );
            }
        } else {
            System.out.println("null");
        }

    }

}
