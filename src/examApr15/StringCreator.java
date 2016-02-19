package examApr15;

public class StringCreator {
    // tecken i teckensträngen
    private char[] chars;
    // antalet tecken
    private int charCount;

    // StringCreator skapar en teckensträng utifrån
    // en given teckenvektor.
    public StringCreator(char[] chars) {

        this.chars = new char[chars.length + 1];

        for(int pos = 0; pos<chars.length; pos++){
            this.chars[pos] = chars[pos];
        }
        charCount = chars.length;
    }

    // insert sätter in ett givet tecken på en given position
    // i den här teckensträngen
    public void insert(char c, int pos)
            throws ArrayIndexOutOfBoundsException {
        if (pos > charCount)
            throw new ArrayIndexOutOfBoundsException("bad index: " + pos);

        this.chars[this.chars.length] = c;
        System.out.println(this.chars[this.chars.length]);

        for (int a = this.chars.length; a > this.chars.length;a--){
            this.chars[a-1] = this.chars[a];
        }

    // koden saknas här
    // utöka inte teckenvektorn
    }

    public String toString() {
        return new String(chars, 0, charCount);
    }




    public static void main(String args[]) {

        //En teckensträng skapas och används så här:
        char[] digits = {'1', '2', '3', '4'};
        StringCreator sc = new StringCreator(digits);
        System.out.println(sc);

        int pos = 0;

        sc.insert('+', pos);
        System.out.println(sc);
    }
}