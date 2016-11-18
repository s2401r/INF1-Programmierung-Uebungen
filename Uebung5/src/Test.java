/**
 * Created by Tobias on 15/11/2016.
 */
public class Test {
    public static void main(String[] args) {

        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("für " + i);
            System.out.println("a)  dowhile: " + SchleifenTypen.a_doWhile(i));
            System.out.println("a)  while:   " + SchleifenTypen.a_while(i));
            System.out.println("a)  for:     " + SchleifenTypen.a_for(i));
            System.out.println();
        }
        //*/

        /*
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

        ///*
        for (int i = 0; i < 100; i++) {

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
        Person theresa = new Person("Theresa", new Person[0]);
        Person thomas = new Person("Thomas", new Person[]{theresa});
        Person michael = new Person("Michael", new Person[]{});
        Person adam = new Person("Adam", new Person[]{michael});
        Person kerstin = new Person("Kerstin", new Person[]{thomas, adam, michael});
        michael.setFreunde(new Person[]{kerstin});

        SozialesNetzwerk sozialesNetzwerk = new SozialesNetzwerk();
        Person[] persons = sozialesNetzwerk.getFreundschaftskette(kerstin, theresa);

        for (Person person : persons) {
            if (person != null) {
                System.out.println(person.getName());
            } else {
                System.out.println("null");
            }
        }
        */
    }
}
