package exercises;

import java.util.Scanner;

public class Dvd {
    private Scanner scan = new Scanner(System.in);


    private String name;
    private int releaseYear;
    private String director;

    public Dvd(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }
    public static void main(String[] args) {
        Dvd[] dvdCollection = new Dvd[15];
        Dvd avengersDvd = new Dvd("The avengers",2012,"Joss Whedon");
        Dvd incrediblesDVD = new Dvd("The Incredibles", 2004, "Brad Bird");
        Dvd findingDoryDVD = new Dvd("Finding Dory", 2016, "Andrew Stanton");
        Dvd lionKingDVD = new Dvd("The Lion King", 2019, "Jon Favreau");

dvdCollection[3] = incrediblesDVD;
dvdCollection[9] = findingDoryDVD;
dvdCollection[2] = lionKingDVD;
dvdCollection[7] = avengersDvd;


    }
    @Override
    public String toString(){
        System.out.println(this.name + ", directed by " + this.director + ", released in " + this.releaseYear);
        return this.name + this.director + this.releaseYear;
    }

    }



