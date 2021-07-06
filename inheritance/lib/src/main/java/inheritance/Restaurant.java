package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Restaurant implements bluePrintForThisExample {

    private String name;
    private int priceCategory;
    private ArrayList<Review> reviews; // creating Array list of type Review

    /*
        Constructor that takes in name and the price
        inside it we will initialize our linked list cuz when we construct (create object)
        we should initialize the linked list so we can add to it our object values(Review)
       -- basically we are setting the state of linked list
     */
    public Restaurant (String name, int priceCategory){
        this.name = name;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategorey) {
        this.priceCategory = priceCategorey;
    }

    /*
        This function calculate the review stars and give the restaurant the star rate
     */
    private float calcRestauranteStars(){
        float sum = 0;
        for (Review review: reviews){
            sum += review.stars;
        }
        if(sum > 0){
            return sum / reviews.size();
        }
        return 0;
    }

    /*
        method to convert the number into a $
     */
    public String convertPriceToSign(){
        if(this.priceCategory == 0){
            return "It's undefined";
        }

        String sign = "";
        for(int i = 0; i < this.priceCategory; i++){
            sign = sign + "$";
        }
        return sign;
    }

    /*
        method to the review from user which will take an object of type Review
        then we add it to our linked list
     */
    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }

    private String printReviews(){
        String reviewsText = "";
        for (Review review: reviews){
            reviewsText += review + "\n";
        }
        return reviewsText;
    }

    /*
        method to convert data to string so we can call it and print it (This method is from built in toString)
     */

    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", priceCategory=" + this.convertPriceToSign() +
                ", reviews=" + this.printReviews() +
                ", Restaurant Stars=" + this.calcRestauranteStars() +
                '}';
    }
}
