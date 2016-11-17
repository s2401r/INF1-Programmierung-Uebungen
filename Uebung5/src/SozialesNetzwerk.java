/**
 * Created by Tobias on 15/11/2016.
 */
public class SozialesNetzwerk {
    public Person[] getFreundschaftskette(Person start, Person ende) {
        Person[] result = new Person[6];
        getNearestFriend(start, ende);
        return null;
    }

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


    private int getNearestFriend(Person start, Person ende) {
        if (start.isFriendWith(ende)) {
            return 1;
        } else {
            int nearestFriendCount = 0;
            Person nearestFriendHop = null;

            for (Person person : start.getFreunde()) {
                int result = getNearestFriend(person, ende);
                if (result > 0) {
                    if (result > nearestFriendCount) {
                        nearestFriendCount = result;
                        nearestFriendHop = person;
                    }
                }
            }
            return nearestFriendCount;
        }
    }
}