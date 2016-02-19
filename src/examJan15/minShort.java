package examJan15;

/**
 * Created by arvid on 2016-01-10.
 */
public class minShort {

    public static int mshort(int a, int b, int c, int d){

        int [] v = {a,b,c,d};
        int y = v[0];

        for(int pos=0;pos<v.length;pos++){

            if(y>v[pos]){
                y = v[pos];
            }
        }
        return y;
    }

    public static void main(String[] args){

        int result = mshort(10,3,7,4);
        System.out.println(result);

        String s = new String("Hej");
        char o = s.charAt(0);
        System.out.println(o);
    }
}
