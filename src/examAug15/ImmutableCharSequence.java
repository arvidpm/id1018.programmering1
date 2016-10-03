package examAug15;

class ImmutableCharSequence implements CharSequence {
    // tecken i teckensträngen
    private char[] chars;

    public ImmutableCharSequence(char[] chars) {
        this.chars = new char[chars.length];
        for (int pos = 0; pos < chars.length; pos++)
            this.chars[pos] = chars[pos];
    }

    // startsWith returnerar true om teckensekvensen börjar på ett givet tecken, annars false
    public boolean startsWith(char c) {
        boolean b = false;
        if (this.chars.length > 0 && c == this.chars[0])
            b = true;
        return b;
    }

    public String toString() {
        return new String(this.chars);
    }

    public char charAt(int index) {
        return this.chars[index];
    }

    public int length() {
        return this.chars.length;
    }


    public static void main(String args[]) {

        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        CharSequence cs = new ImmutableCharSequence(letters);
        System.out.println(cs);
        char c = cs.charAt(4);
        int len = cs.length();
        System.out.println(c + " " + len);

        boolean b = cs.startsWith('a'); // (1)
        System.out.println(b);


    }
}

