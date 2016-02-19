package examJan15;

/**
 * Created by arvid on 2016-01-10.
 */
class Country {
    // landets namn och huvudstad
    private String name;
    private String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        return "(" + this.name + ", " + this.capital + ")";
    }


    public static Country[] filter(Country[] countries, char firstLetter) {

        int d = 0;
        int m = 0;

        for (int x = 0; x < countries.length; x++) {
            if (countries[x].name ().charAt(0) == firstLetter) {
                m++;
            }
        }

        Country[] z = new Country[m];
        for (int c = 0; c < countries.length; c++) {

            if (countries[c].name ().charAt(0) == firstLetter) {
                z[d] = countries[c];
                d++;
            }
        }
        return z;

    }
    public static void main(String[] args){

        Country[] lander = {
                new Country("SVERIGE", "Stockholm"),
                new Country("TYSKLAND", "Berlin"),
                new Country("SERBIEN", "Belgrad"),
                new Country("FINLAND", "Helsingfors"),
                new Country("POLEN", "Warszawa")};

        Country[] z = filter(lander,'F');


        for(Country j : z){
            System.out.println(j);
        }
    }

}