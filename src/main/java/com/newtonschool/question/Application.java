package com.newtonschool.question;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Application {
    public static List<String[]> readFromFile(String fileName) {
        List<String[]> books = new ArrayList<>();
        
        return books;
    }

    // Method to calculate the average price of books
    public static double calculateAveragePrice(List<String[]> books) {
        // Dummy return statement
       return 0.0;
    }

    // Example main method to use the functions
    public static void main(String[] args) {
        List<String[]> books = readFromFile("dummy.txt");
        double averagePrice = calculateAveragePrice(books);
        System.out.println("Average Price: " + averagePrice);
    }
}
