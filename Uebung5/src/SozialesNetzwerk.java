import java.util.ArrayList;

/**
 * @author Name: <a href="mailto:t_hoge03@wwu.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 */
public class SozialesNetzwerk {

    /**
     * Gets the shortest path between two persons
     *
     * @param start The person where the path starts
     * @param ende  The person where the path ends
     * @return The shortest path between two persons
     */
    public Person[] getFreundeskette(Person start, Person ende) {

        ArrayList<Person> besucht = new ArrayList<Person>();
        ArrayList<Person[]> wege = new ArrayList<Person[]>();

        return getShortestFriendPath(wege, besucht, start, ende);
    }

    /**
     * Gets the shortest path between two persons
     *
     * @param paths                 ArrayList which contains all possible paths
     * @param alreadyCheckedPersons ArrayList which contains all already checked persons
     * @param start                 The person where the path starts
     * @param end                   The person where the path ends
     * @return The shortest path between two persons
     */
    public Person[] getShortestFriendPath(ArrayList<Person[]> paths, ArrayList<Person> alreadyCheckedPersons, Person start, Person end) {
        if (paths.isEmpty()) {
            paths.add(new Person[6]);
        }

        Person[] result = paths.get(getShortestPathOutOfArrayList(paths));
        paths.remove(getShortestPathOutOfArrayList(paths));
        int indexOfLastElementInResultArray = getIndexOfLastElementInArray(result);

        for (int i = 0; i < start.getFreunde().length; i++) {
            if (start.getFreunde()[i].equals(end)) {
                result[indexOfLastElementInResultArray + 1] = end;
                return result;
            }

            if (!(alreadyCheckedPersons.contains(start.getFreunde()[i])) && (start.getFreunde()[i] != null)) {
                Person[] temp = result.clone();
                temp[indexOfLastElementInResultArray + 1] = start.getFreunde()[i];
                paths.add(temp);
                alreadyCheckedPersons.add(start.getFreunde()[i]);
            }
        }

        int indexOfShortestPath = getShortestPathOutOfArrayList(paths);
        return getShortestFriendPath(paths, alreadyCheckedPersons, paths.get(indexOfShortestPath)[getIndexOfLastElementInArray(paths.get(indexOfShortestPath))], end);
    }

    /**
     * Gets the index of the last element in an array
     *
     * @param array The array which will be used
     * @return The index of the last element in an array
     */
    public int getIndexOfLastElementInArray(Person[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return i - 1;
            }
        }
        return 5;
    }

    /**
     * Gets the index of an array with fewest entries out of an arraylist filled with arrays
     *
     * @param paths The ArrayList filled with arrays which will be used
     * @return The index of an array with fewest entries
     */
    public int getShortestPathOutOfArrayList(ArrayList<Person[]> paths) {

        int minCount = 7;
        int minCountIndex = 0;
        for (Person[] path : paths) {
            if (getIndexOfLastElementInArray(path) < minCount) {
                minCountIndex = paths.indexOf(path);
                minCount = getIndexOfLastElementInArray(path);
            }
        }
        return minCountIndex;
    }
}


public class SocialNetworkLösung {

    public int bestsolution = 6;
    public Person[] freundeskette;

    public static void main(String[] args) {

    }


    public Person[] getFreundschaftskette(Person start, Person ende) {
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
