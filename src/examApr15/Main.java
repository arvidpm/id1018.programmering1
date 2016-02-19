package examApr15;

public class Main {
    public static void main(String args[]){

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle ("blue", 10);
        //shapes[1] = new Rectangle ("yellow", 3, 4);
        //shapes[2] = new Rectangle ("yellow", 4, 5);
        shapes[1] = new Circle ("red", 5);


        //shapes[0] = new java.lang.String ("red"); // (1)
        for (Shape shape : shapes)
        {
            double ar = shape.area ();
            System.out.println (shape + " : " + ar);
        }

    }
}
