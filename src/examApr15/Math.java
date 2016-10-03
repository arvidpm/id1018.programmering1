package examApr15;

public class Math {

    public static double signum(double x) {
        double signum = 1;
        if (x < 0) {
            signum = -1;
        } else if (x == 0) {
            signum = 0;
        }
        return signum;
    }

    public static double abs(double x) {
        double abs = x;
        if (x < 0) {
            abs = -x;
        }

        return abs;
    }

    public static long floor(double x) {
        long floor = (long) x;

        if (floor > x) {
            floor = floor - 1;
        }

        return floor;

    }

    public static void main(String[] args) {
        double x = -15.99;

        double signum = signum(x);
        double abs = abs(x);
        long floor = floor(x);

        System.out.println(signum + " " + abs);
        System.out.println(floor);
    }

}
