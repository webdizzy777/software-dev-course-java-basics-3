package org.example;

public class LoopExercises {
    public int sum(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // (use a for loop)
        int total = 1;
        for (int i = 0; i < n; i++){
            total += n;
        }
        return  n;
    }

    public int sumUntilEven(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        // (use a while loop with a sum variable and a counter variable)
        int sum = 0;
        int counter = 0;
        while (counter <= n){
            sum +=n;
            if (sum % 2 == 0){
                break;
            }
            counter ++;
        }
        return n;
    }
}
