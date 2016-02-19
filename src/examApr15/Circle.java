package examApr15;

import java.lang.*;

/**
 * Created by arvid on 2016-01-12.
 */
class Circle extends Shape
{
    // cirkelns radie
    private double radius;

    // Circle skapar en cirkel - cirkelns färg och radie är givna
    public Circle (String colour, double radius)
    {
        super (colour);
        this. radius = radius;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.getColour()+" | ");
        sb.append("("+this.radius+")");
        sb.append("]");

        return sb.toString();

    }

    public double area(){

        return this.radius * this.radius * java.lang.Math.PI;
    }
}