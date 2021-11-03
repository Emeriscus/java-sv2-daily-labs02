package day05;

public class Movie {

    String title;
    private int productionYear;
    private double averageRating;
    private int numberOfRating;
    private int sumNumberOfRating;

    public Movie(String title, int productionYear) {
        this.title = title;
        this.productionYear = productionYear;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getNumberOfRating() {
        return numberOfRating;
    }

    public int getSumNumberOfRating() {
        return sumNumberOfRating;
    }

    public double setAndGetAverageRating(int rate) {
        numberOfRating++;
        sumNumberOfRating += rate;
        averageRating = (double) sumNumberOfRating / numberOfRating;
        return averageRating;

    }
}
