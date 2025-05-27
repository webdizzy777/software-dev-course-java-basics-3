# Java Basics - Loops and Conditionas

## Introduction

In this exercise, you will use loops and conditionals to solve a series of problems. You will use provided unit tests to
verify that your solutions are correct.

There are two sets of required exercises in this project: conditional exercises and loop exercises. You will find the
exercises in the `src/main/java/org/example` folder.

There is also an optional set of challenges that involve extending a simple program called `JavaCafe`. You will find the
JavaCafe class in the `src/main/java/org/example` folder.

## Conditional Exercises (Required)

You will find the conditional exercises in the `src/main/java/org/example/ConditionalExercises.java` file.

Each method in this class is a conditional exercise. You will need to implement the method to solve the problem
described in the comments within the method.

1. `lessThanFive(int number)` - Given a number, return true if the number is less than 5, false otherwise.
2. `getAgeGroup(int age)` - Given an age, return the age group based on the following criteria:
    - 0-12: Child
    - 13-19: Teen
    - 20-64: Adult
3. `isValidPassword(String password)` - Given a password, return true if the password is valid, false otherwise. A valid
password must:
    - Be at least 8 characters long

## Loop Exercises (Required)

You will find the loop exercises in the `src/main/java/org/example/LoopExercises.java` file.

Each method in this class is a loop exercise. You will need to implement the method to solve the problem described in
the comments within the method.

1. `sum(int n)` - Given a number n, return the sum of all numbers from 1 to n.
2. `sumUntilEven(int n)` - Given a number n, return the sum of all numbers from 1 to n, stopping when an even number is
reached.

Once you have completed the exercises, run the tests in the `src/test/java/org/example/LoopExercisesTests.java` file to
verify that your solutions are correct.

You can run these tests in the same way as the conditional exercises described above.

You can also run ALL tests in this project by right-clicking on the `java` folder and selecting `Run 'All Tests'`.

![Java](doc-resources/java.jpg) ## Java Cafe Challenges (Optional)

A class named `JavaCafe` is included in this project to show a larger example of loops and conditionals to create a
simple nested menu system for a restaurant.  If you right-click on the `Main` class and select `Run 'Main'`, you can see
the program in action.

You are encouraged to explore and review the JavaCafe class to see how loops and conditionals can be used together to
create a more complex program. Notice the use of loops to create a menu that repeats until the user chooses to exit, and
the use of conditionals to handle different user choices.

Listed below are some optional challenges that you can take on to extend the JavaCafe program.  These challenges are
optional and are meant to be more challenging than the exercises above. These challenges are meant to stretch your
understanding and application of the concepts so far.  Do not be discouraged if you find them difficult or fail to
complete them.  The important thing is to try and learn from the experience.

### Challenge #1

Add a new menu item to the JavaCafe class that allows the user to browse and add desserts to their order.  You will need
to add a new method to the JavaCafe class to handle this new menu item. 

> [!NOTE]
> As you take on this challenge, you will likely end up solving it in a way that involves copying or referencing code
> that is already present.  You may even find that some of the syntax or logic that you are copying is not code that you
> fully understand.  This is normal! An important part of learning to code is to sometimes work with unfamiliar code and
> concepts and to learn by doing.

### Challenge #2

Add a variable to the JavaCafe class that keeps track of the total cost of the user's order. Update the program to
display a cost on each item, and track the total cost as the user adds items to their order.

### Challenge #3

Add a new menu item to the JavaCafe class that allows the user to remove items from their order. Don't forget to update
the total cost when an item is removed.
