package homework_1.quick_x_Insertion_sort;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Helper {

    private Helper() {
    }

    static List<Movie> getMovies(List<Film> films){

        List<Movie> movies = new ArrayList<>();

        for (int i = 0; i < films.size() - 1; i++) {
            if(films.get(i) instanceof Movie){
                movies.add((Movie) films.get(i));
            }
        }
        return movies;

    }

    private static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static String generateRandom(int length) {
        Random random = new SecureRandom();
        if (length <= 0) {
            throw new IllegalArgumentException("String length must be a positive integer");
        }

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }
}
