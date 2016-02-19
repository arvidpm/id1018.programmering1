package examJan14;

public class sifferSumma {
    public static int sifferSumma(String s){

        int sum = 0;
        int len = s.length();

        for(int pos=0; pos < len ; pos++){
            sum += s.charAt (pos);
        }
        return sum;
    }

    public static void main(String args[]){

        String s = "32524598345998";
        int result = sifferSumma(s);
        System.out.println(result);
    }

}
