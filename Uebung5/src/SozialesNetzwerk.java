import java.util.ArrayList;

public class SozialesNetzwerk {

    public Person[] getFreundeskette(Person start, Person ende) {

        ArrayList<Person> besucht = new ArrayList<Person>();
        ArrayList<Person[]> wege = new ArrayList<Person[]>();

        return getShortestFriendPath(wege, besucht, start, ende);
    }

    public Person[] getShortestFriendPath(ArrayList<Person[]> paths, ArrayList<Person> alreadyCheckedPersons, Person start, Person end) {
        if (paths.isEmpty()) {
            paths.add(new Person[6]);
        }

        Person[] result = paths.get(getShortestPathOutOfArrayList(paths));
        paths.remove(getShortestPathOutOfArrayList(paths));
        int indexOfLastElementinResultArray = getIndexOfLastElementInArray(result);


        for (int i = 0; i < start.getFreunde().length; i++) {
            if (start.getFreunde()[i].equals(end)) {
                result[indexOfLastElementinResultArray + 1] = end;
                return result;
            }

            if (!(alreadyCheckedPersons.contains(start.getFreunde()[i])) && (start.getFreunde()[i] != null)) {

                Person[] temp = result.clone();
                temp[indexOfLastElementinResultArray + 1] = start.getFreunde()[i];
                paths.add(temp);
                alreadyCheckedPersons.add(start.getFreunde()[i]);
            }

        }

        int indexOfShortestPath = getShortestPathOutOfArrayList(paths);
        return getShortestFriendPath(paths, alreadyCheckedPersons, paths.get(indexOfShortestPath)[getIndexOfLastElementInArray(paths.get(indexOfShortestPath))], end);
    }

    public int getIndexOfLastElementInArray(Person[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) return i - 1;
        }
        return 5;
    }

    public int getShortestPathOutOfArrayList(ArrayList<Person[]> paths) {

        int min = 7;
        int minpos = 0;
        for (Person[] path : paths) {
            if (getIndexOfLastElementinArray(path) < min) {
                minpos = paths.indexOf(path);
                min = getIndexOfLastElementinArray(path);
            }
        }
        return minpos;
    }
}



