package examJan16;

public class Main {
    public static void main(String args[]) {

        LetterSupplier[] ls = new LetterSupplier[3];
        ls[0] = new LetterSupplierA();
        ls[1] = new LetterSupplierB();
        ls[2] = new LetterSupplierC();

        for (int pos = 0; pos < ls.length; pos++) {
            System.out.print(ls[pos].lowerCaseLetter() + " | ");
            System.out.println(ls[pos].upperCaseLetter());
        }

        LetterSupplierA lsa1 = new LetterSupplierC();

        System.out.println(lsa1.lowerCaseLetter());
        // System.out.println(lsa1.letter());

        // This will NOT work!
        // LetterSupplierA lsa2 = new LetterSupplierB();


    }
}
