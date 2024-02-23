<strong> **DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>
# WESTERN GOVERNOR UNIVERSITY 
## D288 – BACK-END PROGRAMMING
Welcome to Back-End Programming! This is an opportunity for students to develop object-oriented applications that can be integrated with relational databases, write code for object-oriented applications using Spring framework, and implements design patterns for object-oriented applications. 
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will be building your project using IntelliJ IDEA (Ultimate Edition) in a WGU-provided lab environment. You will be working with an existing MySQL database and Angular front-end, which are supplied for you in the lab environment. You will share this project to a private external GitLab repository and backup regularly. If you wish to work on it on your local machine, you will also need to download the Angular front-end application and create your own MySQL database. Use the links on your course page to install the integrated development environments (IDE), MySQL WorkBench, and IntelliJ IDEA, and pull the project from the lab environment.  


## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!

## PART A

 - Cloned repository from GitLab and created new "working_branch" branch.
 - Created the Java project using Spring Initializr. Added 4 dependencies: Spring Data JPA, Rest Repositories, MySQL Driver, and Lombok.

## PART B

 - Added spring.io files to src (d288-back-end-programming).

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

 - 
