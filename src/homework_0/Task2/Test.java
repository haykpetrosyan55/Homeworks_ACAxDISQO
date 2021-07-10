package homework_0.Task2;

import java.util.ArrayList;
import java.util.List;

public class Test {

    //Task 2
    //Design two classes named Movie and Cartoon, both with properties
    //- title
    //- rating
    //Create 5 Movie and 6 Cartoon objects, give them titles and
    //random ratings in range (0 - 10).
    //Add created objects to the same collection.
    //Determine the highest rated movie(s), cartoons excluded, from
    //the collection and display its titles.

    public static void main(String[] args) {

        List<Object> films = new ArrayList<>();

        Movie movie1 = new Movie("The Shawshank Redemption", 9.8);
        Movie movie2 = new Movie("Interstellar", 9.2);
        Movie movie3 = new Movie("Ford v Ferrari", 9.1);
        Movie movie4 = new Movie("The Green Mile", 9.8);
        Movie movie5 = new Movie("Inception", 8.8);
        Cartoon cartoon1 = new Cartoon("Tom and Jerry", 8.8);
        Cartoon cartoon2 = new Cartoon("Ratatouille", 9.7);
        Cartoon cartoon3 = new Cartoon("How to Train Your Dragon", 9.4);
        Cartoon cartoon4 = new Cartoon("WALL-E", 9.5);
        Cartoon cartoon5 = new Cartoon("Klaus", 9.5);
        Cartoon cartoon6 = new Cartoon("Despicable Me", 9.0);

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);
        films.add(movie4);
        films.add(movie5);
        films.add(cartoon1);
        films.add(cartoon2);
        films.add(cartoon3);
        films.add(cartoon4);
        films.add(cartoon5);
        films.add(cartoon6);


        for (Object movie : Helper.highestRat(films)) {
            System.out.println(((Movie) movie).getTitle());
        }

    }
}