package com.company;
public class Main {

    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (int r = 0; r < myList.length; r++) {
            System.out.println(myList[r] + " ");
        }

        // Summing all elements
        double total = 0;
        for (int r = 0; r < myList.length; r++) {
            total += myList[r];
        }
        System.out.println("Total is " + total);

        //Finding the largest element
        double max = myList[0];
        for (int r = 1; r < myList.length; r++) {
            if (myList[r] > max) max = myList[r];
        }
        System.out.println("Max is " + max);
    }
}
