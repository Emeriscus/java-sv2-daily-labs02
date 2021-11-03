package day05;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Ponyvaregény", 1994);

        movie.setAndGetAverageRating(3);
        System.out.println(movie.getAverageRating());

        Viewer viewer = new Viewer();

        viewer.watcMovie(movie, 5);
        System.out.println(movie.getAverageRating());

        viewer.watcMovie(movie, 4);
        System.out.println(movie.getAverageRating());

    }
}
