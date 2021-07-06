package inheritance;

import javax.crypto.Mac;

public class Main {
    public static void main(String[] args) {

        Restaurant mac = new Restaurant("Macdonalds", 10);
        Review r1 = new Review("bad Resturant", "Sufian", 1);
        Review r2 = new Review("good Resturant", "Omar", 4);

        mac.addReview(r1);
        mac.addReview(r2);

        Theater t1 = new Theater("tajmall");
        Review f1 = new TheaterReview("bad", "fahed", 1, "asd");
        Review f2 = new TheaterReview("bad", "fahed", 1);

        t1.addReview(f1);
        t1.addReview(f2);
        System.out.println(t1);


        System.out.println(mac);

//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
//
//        Restaurant KFC = new Restaurant("KFC", 6);
//
//        //dynamic review
//        Review reviewForKFC = new Review(KFC, "Good Resturant", "Jay Jay", 5);
//        System.out.println(reviewForKFC.toString());

//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
//
//        Shop Nike = new Shop("Nike", "Great quality of shoes", 5);
//        Review Sam = new Review("Good Clothing Shop", "Sam",5);
//        Nike.addReview(Sam);
//        System.out.println(Nike.toString());
//
//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
//
//
//        //dynamic review
//        Review rs2 = new Review(Nike, "bad shop", "Peter", 1);
//        System.out.println(rs2.toString());
//
//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
//
//        Theater t1 = new Theater("unknown");
//        t1.addMovie("Forest Gumb");
//        t1.addMovie("A Beautiful Mind");
//        t1.addMovie("The Pursuit Of Happiness");
//        Review tr = new Review("bad theater", "Megan", 1);
//
//        System.out.println(t1.toString());
//        System.out.println(t1);
//        t1.addReview(tr);
//        System.out.println(t1.toString());
//
//        Review movie = new Review(t1, "The Pursuit Of Happiness", "was good movie", "Megan", 5);
//        System.out.println(movie.toString());
    }
}
