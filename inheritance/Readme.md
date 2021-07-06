# Composition and Inheritance

In this lab i implemented the Restaurant and review classes in addition i added an interface for the Resturants
which will work on other classes that are similar to restaurants.

I created a blueprint for restaurants  which will have functions that needs an implementation inside the restaurant class

Restaurant class will have attributes in addition a linked list attribute that will accept an object of type Review
and inside it's constructor i initialized the linked list

also Restaurant class will have the addReview function addReview that will accept an object of type review
and it will be added to the linked list 

Review class:

[Blueprint](./lib/src/main/java/inheritance/bluePrintForResturants.java)
[RestaurantClass](./lib/src/main/java/inheritance/Restaurant.java)
[ReviewClass](./lib/src/main/java/inheritance/Review.java)
[MainClass](./lib/src/main/java/inheritance/Main.java)


## Second Lab 

i renamed the blueprint to be for all (restaurant, shop, theater)

shop class is the same as restaurant class 

theater class :
i created new linkedlist for movies to be added by the user and the rest is the same

Review class :
i added one constructors for shop that will accept an object of type shop
and also added 2 constructors one to accept theater object and another theater object with movie name

if the user want to review a movie he should create a theater object 
then create a review object to pass in the theater object and movie name so it will be specific to which theater and what movie

[ShopClass](./lib/src/main/java/inheritance/Shop.java)
[TheaterClass](./lib/src/main/java/inheritance/Theater.java)

