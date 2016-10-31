import java.util.ArrayList;

public class Orakeltest {
public static void main(String args[]){
        ArrayList<Gegenstand> gegenStandList = new ArrayList<Gegenstand>();

        gegenStandList.add(new Gegenstand(2500000,"Holz",false));
        gegenStandList.add(new Gegenstand(3500,"Metal",true));
        gegenStandList.add(new Gegenstand(90000,"Fleisch",false));
        gegenStandList.add(new Gegenstand(150,"Plastik",true));
        gegenStandList.add( new Gegenstand(150,"Gummi",false));
        gegenStandList.add(new Gegenstand(42530000,"Wasser",true));
        gegenStandList.add(new Gegenstand(19200000,"Metal",true));
        gegenStandList.add( new Gegenstand(150,"Gummi",true));

        for(Gegenstand gegenStand : gegenStandList) {
                System.out.println(Orakel.wasIstEs(gegenStand));
        }
}
}
