package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Theater implements bluePrintForThisExample {
    private String name;
    private ArrayList<String> movie;
    private ArrayList<Review> reviews;

    public Theater(String name) {
        this.name = name;
        this.movie = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMovie() {
        return movie;
    }
    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void addMovie(String movieName){
        movie.add(movieName);
    }
    public void removeMovie(String movieName){
        movie.remove(movieName);
    }

    /*
        this mothed is to convert review list to string
     */
    public String convertReviewsListToString(){
        String print = "";

        for (Review review: reviews){
            print += review.toString() + "\n";
        }
        return print;
    }
    /*
        this mothed is to convert movies list to string
     */
    public String convertMoviesListToString(){
        String print = "";

        for (String m: movie){
            print += m.toString() + ", ";
        }
        return print;
    }


    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movie=" + this.convertMoviesListToString() +
                ", reviews=" + this.convertReviewsListToString() +
                '}';
    }
}
