# Vacation Store
Welcome to my Vacation Shop! In this web application, you can add vacations along with excursions to a cart, and create orders.

## PART A

 - Created the Java project using Spring Initializr. Added 4 dependencies: Spring Data JPA, Rest Repositories, MySQL Driver, and Lombok.

## PART B

 - Added spring.io files to src

## PART C

 - Constructed 5 new packages: controllers, entities, dao, services, and config. Located in java.com.example.demo.
 - Added application.properties from LabFiles to src/main/resources.
 - Added RestDataConfig.java from LabFiles to config package.

## PART D

 - Created entities from UML diagram to create classes. Added these to entities package.
 - Imported entities in RestDataConfig.java.
 - Updated mappings of relationships between columns in tables.

## PART E

 - Created dao interfaces: CartItemRepository, CartRepository, CountryRepository, CustomerRepository, DivisionRepository, ExcursionRepository, VacationRepository using @CrossOrigin.
 - Opened pom.xml as a Maven project so project can run now

## PART F

 - Wrote code for the services package that included 3 new classes and an interface.
 - Created CheckoutServiceImpl.java which will generate a random tracking number and paste that onto the checkout screen.
 - Edited cart.java, cartitem.java, and customer.java to handle added cart items and tracking number. 

## PART G

 - Wrote code to include validation to enforce the inputs needed by the Angular front-end.
 - In Customer.java, added nullable = false to customer_id, customer_first_name, customer_last_name, address, postal_code, and phone.

## PART H

 - Wrote code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.
 - Added new class to controllers package, called CheckoutController.java. This will handle the checkout operations in the front-end.

## PART I

 - Created a fake order with two excursions and one vacation, and took screenshots to verify no errors in front-end or database.
