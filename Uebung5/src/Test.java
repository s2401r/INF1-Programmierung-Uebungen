/**
 * Created by Tobias on 15/11/2016.
 */
public class Test {
    public static void main(String[] args) {

        ///*
        for (int i = 0; i < 10; i++) {
            System.out.println("für " + i);
            System.out.println("a)  dowhile: " + SchleifenTypen.a_doWhile(i));
            System.out.println("a)  while:   " + SchleifenTypen.a_while(i));
            System.out.println("a)  for:     " + SchleifenTypen.a_for(i));
            System.out.println();
        }
        //*/

        ///*
        for (int i = 0; i < 10; i++) {

            System.out.println("für " + i);
            System.out.println("a)  dowhile: " + SchleifenTypen.b_doWhile(i));
            System.out.println("a)  while:   " + SchleifenTypen.b_while(i));
            System.out.println("a)  for:     " + SchleifenTypen.b_for(i));
            System.out.println();
        }
        //*/

        //System.out.println(MathFormel.fakultät(5));

        //System.out.println(MathFormel.exponentiation(25,-7));

        /*
        for (int i = 0; i < 10000; i++) {

            double result1 = Math.sin(i);

            MathFormel mathFormel = new MathFormel();
            double result2 = mathFormel.loeseRekursiv(i);
            double result3 = mathFormel.loeseSchleife(i);

            System.out.println("Result for: " + i);
            System.out.println("Math    " + result1);
            System.out.println("Reku    " + result2);
            System.out.println("Loop    " + result3);
            System.out.println();
        }
        //*/

        /*
        Person stephan = new Person("Stephan", new Person[0]);
        Person tobias = new Person("Tobias", new Person[]{stephan});
        Person max = new Person("Max", new Person[0]);

        Person theresa = new Person("Theresa", new Person[0]);
        Person thomas = new Person("Thomas", new Person[]{theresa});
        Person michael = new Person("Michael", new Person[]{});
        Person adam = new Person("Adam", new Person[]{michael, max});
        Person verena = new Person("Verena", new Person[]{adam});

        Person kerstin = new Person("Kerstin", new Person[]{thomas, adam, michael});

        michael.setFreunde(new Person[]{kerstin});
        theresa.setFreunde(new Person[]{tobias});
        max.setFreunde(new Person[]{kerstin});

        SozialesNetzwerk sozialesNetzwerk = new SozialesNetzwerk();
        Person[] persons = sozialesNetzwerk.getFreundeskette(adam, stephan);

        for (Person person : persons) {
            if (person != null) {
                System.out.println(person.getName());
            } else {
                System.out.println("null");
            }
        }
        //*/
    }
}



/*

public static double factorial(double x) {
    int result = 1;
    for (int i = 1; i <= x; i++) {
        result *= i;
    }
    return result;
}

public static double exponentiation(double base, double exponent) {
        double result = 1;

        if (exponent > 0) {
            while (exponent > 0) {
                result *= base;
                exponent--;
            }
        } else if (exponent < 0) {
            while (exponent < 0) {
                result /= base;
                exponent++;
            }
        }
        return result;
    }

public double getSine(double x, int i) {
        double numerator = exponentiation(x, (2 * i) + 1);
        double denominator = factorial((2 * i) + 1);
        double multiplicand = exponentiation(-1, i);

        double result = multiplicand * (numerator / denominator);

        if (Double.isNaN(result)) {
            return result;
        }

        if (result > exponentiation(-10, -7) && result < exponentiation(10, -7)) {
            return result;
        } else {
            return getSine(x, i + 1) + result;
        }
    }

*/


/*
public class SozialesNetzwerk {
    public Person[] getFreundschaftskette(Person start, Person ende) {
        Person[] result = new Person[6];
        Map<Person, Integer> friendMap = getFriendMapForTarget(start, ende);


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


    List<Person> alreadyChecked = new ArrayList<Person>();

    private Map<Person, Integer> getFriendMapForTarget(final Person start, final Person end) {
        Map<Person, Integer> result = new HashMap<Person, Integer>();

        if (alreadyChecked.contains(start)) {

        } else {
            alreadyChecked.add(start);

            if (start.isFriendWith(end)) {
                result.put(end, 0);
                result.put(start, 1);
            } else {
                for (final Person p : start.getFreunde()) {

                    Map<Person, Integer> tempResult = getFriendMapForTarget(p, end);
                    if (tempResult.containsKey(end)) {
                        result.putAll(tempResult);
                        if (tempResult.containsKey(p)) {
                            result.put(start, tempResult.get(p) + 1);
                        }
                    }
                }
            }
        }

        return result;
    }


    public int getShortest() {
        int min = 7;
        int minpos = 0;

        for (Person[] a : wege) {
            if (getLastPersonPos(a) < min) {
                minpos = wege.indexOf(a);
                min = getLastPersonPos(a);
            }
        }
        return minpos;
    }


    public int getLastPersonPos(Person[] p) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] == null) {
                return i - 1;
            }
        }
        return 5;
    }
}
 */