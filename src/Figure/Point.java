package Figure;

/**
 * Created by zzzxxx on 09.05.2017.
 */
public class Point {
    double x;
    double y;
    String Hight = "Вершина";

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getHight() {
        return Hight;
    }

    public void setHight(String hight) {
        Hight = hight;
    }

    public Point(int x, int y, String hight) {
        this.x = x;
        this.y = y;
        Hight = hight;
    }

}
