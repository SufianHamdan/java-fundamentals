# Composition and Inheritance

In this lab i implemented the Restaurant and review classes in addition i added an interface for the Resturants
which will work on other classes will behave like restaurants.

I created a blueprint for restaurants  which will have functions that needs an implementation inside the restaurant class

Restaurant class will have attributes in addition a linked list attribute that will accept an object of type Review
and inside it's constructor i initialized the linked list

also Restaurant class will have the addReview function addReview that will accept an object of type review
and it will be added to the linked list 

Review class has two constructors one to add a normal review to be added to addReview function
the other constructor to add review to a specific restaurant (it will accept an object of type restaurant)