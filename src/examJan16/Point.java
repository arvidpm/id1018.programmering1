package examJan16;
import java.lang.Math;

public class Point {

    public static final Point ORIGIN = new Point(0, 0);

    private double x;
    private double y;

    public Point(double x, double y){

        this.x = x;
        this.y = y;
    }

    public double distance(Point p){

        return Math.sqrt((this.x - p.x) * (this.x - p.x) +
                (this.y - p.y) * (this.y - p.y));
    }

    public static Point selectPoint(Point p1, Point p2){

        double disP1;
        double disP2;

        disP1 = ORIGIN.distance(p1);
        disP2 = ORIGIN.distance(p2);

        if(disP1 < disP2){
            return p1;
        }
        else{
            return p2;
        }
    }

    public static Point selectPoint(Point p1, Point p2, Point p3, Point p4){

        Point a = selectPoint(p1, p2);
        Point b = selectPoint(p3, p4);
        Point c = selectPoint(a, b);

        return c;


    }

    public static void main(String args[]){

        Point a = new Point(5, 5);
        Point b = new Point(2, 2);
        Point c = new Point(3, 3);
        Point d = new Point(4, 4);

        Point result = selectPoint(a,b, c, d);
        System.out.println(result.x +", "+ result.y);
    }

}
