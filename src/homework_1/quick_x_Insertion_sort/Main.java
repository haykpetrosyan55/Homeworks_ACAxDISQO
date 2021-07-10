package homework_1.quick_x_Insertion_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Film> films = new ArrayList<>();

        Random r = new Random();


        for (int i = 0; i < 100000; i++) {
            double rat;
            rat = Math.abs(r.nextInt() % 100);
            rat = rat / 10;
            films.add(new Movie(Helper.generateRandom(20),rat));
            films.add(new Cartoon(Helper.generateRandom(19),rat));
            //System.out.println(films.get(i).toString());
        }

        List<Movie> movies = Helper.getMovies(films);

        SortingUtil.quickSort(movies);

           // Or we can use insertionSort
        //SortingUtil.insertionSort(movies);

        for (int i = 0; i < movies.size() - 1; i++) {
            System.out.println(movies.get(i).toString());
        }

    }

}
