package examApr15;

public class Word
{
    // ordet på svenska
    private String sWord;
    // ordet på engelska
    private String eWord;

    public Word (String sWord, String eWord) {

        this.sWord = sWord;
        this.eWord = eWord;
    }
    public String wordSw () {
        return this.sWord;
    }
    public String wordEn () {
        return this.eWord;
    }
    public String toString () {
        return this.sWord + " | " + this.eWord;
    }

    public static Word[] merge (Word[] words1, Word[] words2) {
        int w1 = 0;
        int wlen = words1.length+words2.length;
        Word[] words3 = new Word[wlen];

        for(int i=0;i<words1.length;i++){
            words3[w1]=words1[i];
            w1++;
        }
        for(int i=0;i<words2.length;i++){
            words3[w1]=words2[i];
            w1++;
        }
        return words3;
    }

    public static void main(String[] args){
        Word[] words1 = {new Word("Hej","Hello")};
        Word[] words2 = {new Word("LåL", "LOL")};

        Word[] res = merge(words1,words2);

        for(Word i : res){
            System.out.println(i);
        }

    }

}
