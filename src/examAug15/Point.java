package examAug15;

class Point {
    // punktens koordinater
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x)
                + (p.y - this.y) * (p.y - this.y));
    }

    public String toString() {

        return "(" + this.x + ", " + this.y + ")";
    }
}

