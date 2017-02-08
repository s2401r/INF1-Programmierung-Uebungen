## Beispiel Soziales Netzwerk

```Java
import java.util.ArrayList;

public class SozialesNetzwerk {

    public int bestsolution = 6;
    public Person[] freundeskette;


    public Person[] getFreundeskette(Person start, Person ende) {
        freundeskette = new Person[6];
        bestsolution = 6;
        if (findPerson(start, ende, 0) == true) {
            return freundeskette;
        } else {
            return new Person[6];


        }
    }

    private boolean findPerson(Person start, Person ende, int depth) {
        boolean found = false;
        if (depth < bestsolution) {
            for (Person p : start.getFreunde()) {
                if (ende.equals(p) && depth < bestsolution) {
                    bestsolution = depth;
                    freundeskette = new Person[6];
                    freundeskette[depth] = p;
                    found = true;
                    break;
                }
                if (findPerson(p, ende, depth + 1)) {
                    freundeskette[depth] = p;
                    found = true;
                }
            }
        }
        return found;
    }
}
```
