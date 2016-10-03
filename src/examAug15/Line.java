package examAug15;

class Line {
    // linjesegmentets startpunkt och slutpunkt
    private Point startPoint;
    private Point endPoint;

    // Line skapar ett linjesegment: startpunkten och slutpunkten är givna.
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = new Point(startPoint.x, startPoint.y);
        this.endPoint = new Point(endPoint.x, endPoint.y);
    }

    public String toString() {
        return "{" + this.startPoint + "," + this.endPoint + "}";
    }

    public double length() {

        return this.startPoint.distance(this.endPoint);
    }

    public Point midPoint() {

        double xMid;
        double yMid;
        xMid = (this.startPoint.x + this.endPoint.x) / 2;
        yMid = (this.startPoint.y + this.endPoint.y) / 2;

        return new Point(xMid, yMid);

    }

    public static void main(String args[]) {

        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);
        Line line = new Line(p1, p2);
        System.out.println(line);
        System.out.println(line.length());
        System.out.println(line.midPoint());
    }
}