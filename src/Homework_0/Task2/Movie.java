package Homework_0.Task2;

public class Movie {
    private String title;
    private double rating;

    Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    String getTitle() {
        return title;
    }

    double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
