

public class ArrayTest {
private int tireCount;

public static void main(String[] args){


        int[][] a = new int [2][3];

        System.out.println(a.length);
        System.out.println(a[0].length);
        //System.out.println(a[0][0].length);


}
public void setTireCount(int tireCount) throws IllegalArgumentException {
        if (tireCount > 0) {
                this.tireCount = tireCount;
        } else{
                throw new IllegalArgumentException("Autos müssen mindestens ein Rad haben!");
        }
}
}
