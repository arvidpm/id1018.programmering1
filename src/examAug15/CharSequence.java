package examAug15;

public interface CharSequence
{
    // charAt returnerar det tecken i teckensekvensen som finns på ett givet index
    char charAt (int index);
    // length returnerar längden av teckensekvensen
    int length ();

    boolean startsWith(char c);
}