package examJan15;

/**
 * Created by arvid on 2016-01-11.
 */
public class Uppgift1 {
    public static void main(String args[]) {

        int[][] u = {{1, 2, 3},
                {2, 3, 4},
                {3, 4, 5},
                {4, 5, 6}};

        int[] v = new int[u.length];
        int pos = 0;

        for (int row = 0; row < u.length; row++) {
            for (int column = 0; column < u[row].length; column++)
                v[pos] += u[row][column];
            pos++;
        }

        for (int i : v) {
            System.out.print(i + " ");
        }
    }
}
