/**
 * Created by Tobias on 29/11/2016.
 */
public class LKW extends Auto {
    private int maxLoad = 0;

    public int getMaximaleLast() {
        return maxLoad;
    }

    public void setMaximaleLast(int last) {
        maxLoad = last;
    }

    public LKW(int tireCount, int speed, int seatCount, int maxLoad) {
        super(tireCount, speed, seatCount);
        this.maxLoad = maxLoad;
    }
}
