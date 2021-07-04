package inheritance;

import javax.crypto.Mac;

public class Main {
    public static void main(String[] args) {
        Restaurant Mac = new Restaurant("Macdonalds", 5);
        Review r1 = new Review("bad Resturant", "Sufian", 1);
        Review r2 = new Review("good Resturant", "Sufian", 4);
        Mac.addReview(r1);
        Mac.addReview(r2);
        System.out.println(Mac.toString());

        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");

        Restaurant KFC = new Restaurant("KFC", 6);
        Review reviewForKFC = new Review(KFC, "Good Resturant", "Jay Jay", 5);
        System.out.println(reviewForKFC.toString());
    }
}
