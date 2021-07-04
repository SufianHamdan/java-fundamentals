package inheritance;

public class Review{

    String body;
    String auther;
    int stars;
    Restaurant restaurant; // this is an object of type Restaurant

    /*
        normal constructor to add user review
     */
    public Review(String body, String auther, int stars) {
        this.body = body;
        this.auther = auther;
        this.stars = stars;
    }

    /*
        constructor to add a review to specific restaurant
        the user must pass the restaurant object and the rest of the values
     */
    public Review(Restaurant restaurant, String body, String auther, int stars) {
        this.body = body;
        this.auther = auther;
        this.stars = stars;
        this.restaurant = restaurant;
    }



    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {

        if(stars <= 5 && stars >= 0){
            this.stars = stars;

        }else{
            System.out.println("The stars should be between 0 - 5");
        }

    }

    @Override
    public String toString() {
        return "Review{" +
                restaurant +
                ", body='" + body + '\'' +
                ", auther='" + auther + '\'' +
                ", stars=" + stars +
                '}';
    }
}
