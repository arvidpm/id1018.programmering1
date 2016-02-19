package examAug15;

public class Integer {


    // heltalets värde
    private int value;
    public Integer (int value)
    {
        this.value = value;
    }
    // lessThan returnerar true i fall att det här heltalet
// är mindre än det givna heltalet, annars false.
    public boolean lessThan (Integer p)
    {
        return this.value < p.value;
    }
    public String toString ()
    {
        return "<" + this.value + ">";
    }


    public static Integer[] filter (Integer[] v, Integer p) {

        int resLength = 0;

        for(Integer a : v){
            if(a.lessThan(p)){
                resLength++;
            }
        }

        Integer[] res = new Integer[resLength];
        int pos = 0;

        for(Integer i : v){
            if(i.lessThan(p)){
                res[pos++] = i;
            }
        }
        return res;
    }

    public static void main(String args[]){

        Integer[] intlist = {new Integer(40),new Integer(50),new Integer(10)};
        Integer p = new Integer(60);

        Integer[] res = filter(intlist,p);

        for(Integer i : res){
            System.out.print(i);
        }


    }
}