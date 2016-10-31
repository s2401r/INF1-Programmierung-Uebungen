public class Standesamt {

public Person erzeugeStammbaum(){
        Person martina = new Person("Martina");
        Person achim = new Person("Achim");

        Person paul = new Person("Paul");
        Person johanna = new Person("Johanna");

        Person lena = new Person("Lena",martina,achim);
        martina.setKind(lena);
        achim.setKind(lena);

        Person bernd = new Person("Bernd", johanna, paul);
        johanna.setKind(bernd);
        paul.setKind(bernd);

        Person magdalena = new Person("Magdalena", lena, bernd);
        bernd.setKind(magdalena);
        lena.setKind(magdalena);

        return magdalena;
}
}
