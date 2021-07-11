package Homework_0.Task2;

import java.util.ArrayList;
import java.util.List;

class Helper {
    static List highestRat(List films) {
        double rat = 0;
        List<Movie> highestRatMovies = new ArrayList<>();
        for (Object film : films) {
            if (film instanceof Movie) {
                rat = getRat(rat, highestRatMovies, (Movie) film);
            }
        }
        return highestRatMovies;
    }

    private static double getRat(double rat, List<Movie> highestRatMovies, Movie film) {
        if (film.getRating() > rat) {
            rat = film.getRating();
            highestRatMovies.clear();
            highestRatMovies.add(film);
        } else if (film.getRating() == rat) {
            highestRatMovies.add(film);
        }
        return rat;
    }
}
