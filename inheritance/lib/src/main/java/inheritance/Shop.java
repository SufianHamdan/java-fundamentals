package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
/*
    cuz the shop has the same functionality as restaurant we implemented the same interface and
    it works exactly like restaurant class
 */
public class Shop implements bluePrintForThisExample {

    private String name;
    private String description;
    private int priceCategory;
    private ArrayList<Review> reviews;

    public Shop(String name, String description, int priceCategory){
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }


    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSign=" + convertPriceToSign() +
                ", reviews=" + reviews +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfDollarSign() {
        return priceCategory;
    }

    public void setNumberOfDollarSign(int numberOfDollarSign) {
        this.priceCategory = numberOfDollarSign;
    }

    /*
        method to convert the PriceNumber into a $
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
        This function calculate the review stars and give the Shop the star rate
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
}
