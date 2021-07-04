package inheritance;

import java.util.LinkedList;

public class Restaurant implements bluePrintForResturants{
    private String name;
    private int priceCategory;
    private LinkedList<Review> reviews; // creating linked list of type Review

    /*
        Constructor that takes in name and the price
        inside it we will initialize our linked list cuz when we construct (create object)
        we should initialize the linked list so we can add to it our object values(Review)
       -- basically we are setting the state of linked list
     */
    public Restaurant (String name, int priceCategory){
        this.name = name;
        this.priceCategory = priceCategory;
        this.reviews = new LinkedList<>();
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

    /*
        method to convert data to string so we can call it and print it
     */
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", priceCategory=" + priceCategory +
                ", reviews=" + reviews +
                '}';
    }
}
