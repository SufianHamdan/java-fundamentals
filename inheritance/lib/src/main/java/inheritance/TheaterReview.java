package inheritance;

public class TheaterReview extends Review{

    private String movieName = "";


    public TheaterReview(String body, String author, int stars) {
        super(body, author, stars);
    }

    public TheaterReview(String body, String author, int stars, String movieName) {
        super(body, author, stars);
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Author: " + author + ", Feedback: " + body + ", Stars: " + this.updatingStars() +", " + "Movie Name: " + this.movieName + ".";
    }
}
