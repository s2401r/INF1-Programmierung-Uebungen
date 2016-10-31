public class Main {
    private static Fahrrad meinFahrrad;
    private static Felge meineFelge;
    private static Reifen meinReifen;
    private static Rahmen meinRahmen;

    private static Rad meinHinterrad;
    private static Rad meinVorderrad;


    public static void main(String[] args) {

        meineFelge = new Felge(5);
        meinReifen = new Reifen(3);

        meinRahmen = new Rahmen(10);

        meinHinterrad = new Rad(meineFelge, meinReifen);
        meinVorderrad = new Rad(meineFelge, meinReifen);
        meinFahrrad = new Fahrrad(meinVorderrad, meinHinterrad, meinRahmen);

        System.out.println(meinFahrrad.getKosten());
    }
}
