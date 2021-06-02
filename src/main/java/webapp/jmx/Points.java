package webapp.jmx;


public class Points implements PointsMBean{

    private int countUserPoints = 0;

    @Override
    public void setCountUserPoints(int count) {
        countUserPoints = count;
    }

    @Override
    public int getCountUserPoints() {
        System.out.println(countUserPoints);
        return countUserPoints;
    }


}
