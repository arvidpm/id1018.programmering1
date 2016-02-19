package examApr15;

/**
 * Created by arvid on 2016-01-12.
 */
public abstract class Shape {

    // figurens färg
    private String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    // area returnerar figurens area
    public abstract double area();
}

