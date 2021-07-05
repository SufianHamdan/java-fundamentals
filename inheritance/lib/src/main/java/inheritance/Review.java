package inheritance;

public class Review{

    String body;
    String author;
    int stars;
    Restaurant restaurant; // this is an object of type Restaurant
    private Shop shop; // creating an object of type Shop
    private Theater theater; // creating an object of type Theater
    String movieName;

    /*
        normal constructor to add user review
     */
    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    /*
        constructor to add a review to specific restaurant
        the user must pass the restaurant object and the rest of the values
     */
    public Review(Restaurant restaurant, String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = restaurant;
    }

    /*
       constructor to add a review to specific shop
       the user must pass the shop object and the rest of the values
    */
    public Review(Shop shop, String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.shop = shop;
    }

    /*
       constructor to add a review to specific Theater
       the user must pass the Theater object and the rest of the values
    */
    public Review(Theater theater, String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.theater = theater;
    }

    /*
       this constructor same as above but with name of the movie added
    */
    public Review(Theater theater,String movieName, String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.theater = theater;
        this.movieName = movieName;
    }




    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuther() {
        return author;
    }

    public void setAuther(String auther) {
        this.author = auther;
    }

    public int getStars() {
        return stars;
    }

    public String getMovieName() {
        return movieName;
    }



    /*
        this function convert stars number into star symbol
     */
    public String updatingStars(){
        String starSymbol = "";
        for(int i = 0; i < this.stars; i++){
            starSymbol += "*";
        }
        return starSymbol;
    }

    public String movieName(){
        String print;
        if(movieName == null){
            print = ".";
        }else{
            print = "Movie Name: " + movieName + ".";
        }
        return print;
    }

    @Override
    public String toString() {
        return "Author: " + author + ", Feedback: " + body + ", Stars: " + this.updatingStars() +", " + movieName();
    }
}
