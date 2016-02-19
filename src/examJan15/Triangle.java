package examJan15;

/**
 * Created by arvid on 2016-01-11.
 */

import java.awt.Point;

class Triangle
{
    // triangelns hörn
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;
    // Triangle skapar en triangel med givna hörn
    public Triangle (Point[] vertices)
    {
        this.vertex1 = new Point (vertices[0]);
        this.vertex2 = new Point (vertices[1]);
        this.vertex3 = new Point (vertices[2]);
    }

    public String toString(){

        {
            StringBuilder sb = new StringBuilder ("{ ");
            sb.append (vertex1.toString().substring (14) + " ");
            sb.append (vertex2.toString().substring (14) + " ");
            sb.append (vertex3.toString().substring (14) + " ");
            sb.append ("}");
            return sb.toString();
        }
        //return "{ ["+ this.vertex1.getLocation().x +"," +this.vertex1.getLocation().y +"] }";
    }
    /*public double perimeter(){

        double a = vertex1.distance(vertex2) + vertex2.distance(vertex3)+vertex1.distance(vertex3);

        return a;
    }
    */
    public double distance(){
        double d = 0;
        d+=vertex1.distance(vertex2);
        d+=vertex2.distance(vertex3);
        d+=vertex3.distance(vertex1);

        return d;
    }




    public static void main(String args[]) {

        Point[] p = {new Point(0, 0), new Point(4, 0), new Point(0, 3)};
        Triangle t = new Triangle(p);
        System.out.println(t);
        System.out.println(t.distance());

    }
}