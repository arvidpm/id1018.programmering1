package examJan15;
import java.awt.Point;

class Circle
{
    // cirkelns mittpunkt och radie
    private Point centre;
    private double radius;
    // Circle skapar en cirkel: mittpunkten och radie är givna
    public Circle (Point centre, double radius)
    {
        this.centre = new Point (centre);
        this.radius = radius;
    }
    // toString returnerar cirkelns strängrepresentation
    public String toString ()
    {
        StringBuilder sb = new StringBuilder ("[");
        sb.append (centre.toString ().substring (14) + ", ");
        sb.append (radius);
        sb.append ("]");
        return sb.toString ();
    }
    // area returnerar cirkelns area
    public double area ()
    {
        return Math.PI * radius * radius;
    }
}