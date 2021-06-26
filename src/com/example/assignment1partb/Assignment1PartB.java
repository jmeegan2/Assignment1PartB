package com.example.assignment1partb;
import java.util.Scanner; // include scanner utility for accepting input
public class Assignment1PartB {
    public static double Average(int grades[], int max ) {// Average method begins here
        int sum=0; // initialize variables
        double average=0.0;

        for (int i=1;i<max;i++){ // loop and calculate the Average
            sum+=grades[i];
            average=sum/(i); }
        return average; // return the average after calculation
        }

        public static void main(String[] args) {// begin the main method

            Scanner input=new Scanner(System.in); //create a new Scanner object to use

            int i, grades[]; // initialize variables
            grades=new int[20];

            for (i=0;i<20;i++){
                System.out.printf("Enter Grade: ");
                grades[i]=input.nextInt();// store next integer in grades[i]
                if (grades[i]==-1) break; }
            System.out.printf("%.2f", Average(grades, i-1)); } }