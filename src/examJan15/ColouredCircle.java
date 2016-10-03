package examJan15;

import java.awt.Point;

class ColouredCircle extends Circle {
    // cirkels färg
    private String colour;

    // ColouredCircle skapar en färgad cirkel: mittpunkten, radie och
    // färgen är givna
    public ColouredCircle(Point centre, double radius, String colour) {

        super(centre, radius);
        this.colour = colour;
    }

    // toString returnerar cirkelns strängrepresentation
    /*
    public String toString(){
        StringBuilder sb = new StringBuilder("{" + super.toString());
        sb.append(", " + colour + "}");
        return sb.toString();

    }
    */

    // toString returnerar cirkelns strängrepresentation
    public String toString() {

        StringBuilder sb = new StringBuilder("{");
        sb.append(super.toString());
        sb.append(", " + colour + "}");
        return sb.toString();

    }


    // getColour returnerar cirkelns färg
    public String getColour() {
        return colour;
    }

    public static void main(String[] args) {

        Point centre1 = new Point(3, 4);
        Point centre2 = new Point(0, 1);
        Circle c = new Circle(centre1, 2);
        System.out.println(c);
        // System.out.println (c.getColour ()); // (1)
        ColouredCircle cc = new ColouredCircle(centre2, 1, "yellow");
        System.out.println(cc);
        // System.out.println (cc.area ()); // (2)

    }
}