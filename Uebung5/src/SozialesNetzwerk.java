import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tobias on 15/11/2016.
 */
public class SozialesNetzwerk {
    public Person[] getFreundschaftskette(Person start, Person ende) {
        Person[] result = new Person[6];
        getFriendMapForTarget(start, ende);
        return null;
    }

    /*
    private Person[] getFreundschaftskette(Person[] result, Person start, Person ende) {
        if (start.isFriendWith(ende)) {
            Person[] tempResult = saveNextPersonInArray(result, start);
            tempResult = saveNextPersonInArray(result, ende);
            return tempResult;
        } else {
            for (Person person : start.getFreunde()) {
                if (person.isFriendWith(ende)) {
                    Person[] tempResult = saveNextPersonInArray(result, person);
                    tempResult = saveNextPersonInArray(result, ende);
                    return tempResult;
                }
            }

            for (Person person : start.getFreunde()) {
                Person[] tempResult = getFreundschaftskette(result, person, ende);
                return tempResult;
            }

            return null;
        }

    }

    private Person[] saveNextPersonInArray(Person[] result, Person toSave) throws IllegalArgumentException {
        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                if (result[i] == null) {
                    result[i] = toSave;

                    return result;
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException("result is null");
        }
    }
    */

    private Map<Person, Integer> getFriendMapForTarget(final Person start, final Person end) {
        Map<Person, Integer> result = new HashMap<Person, Integer>();

        if (start.isFriendWith(end)) {
            result.put(end, 0);
            result.put(start, 1);
        } else {
            for (final Person p : start.getFreunde()) {
                result.putAll(getFriendMapForTarget(p, end));
            }
        }

        return result;
    }
}