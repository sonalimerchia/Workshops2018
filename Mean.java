package Workshops;

import java.util.Scanner;
public class Mean
{
    public Mean()
    {}//This is the default constructor. If you do not create any, the compiler automatically makes a constructor identical to this one
    public static void main(String[]args)
    {
        Mean java = new Mean(); //Declares and initializes an instance of the class called java
        java.run(); //calls a method called run
    }
    public void run()
    {
        Scanner input = new Scanner(System.in); //Create Scanner named input
        double num1, num2, num3, num4, num5, mean;    //Declare variables
        
        num1 = input.nextDouble();              //Get the 1st number
        //Input code to get other numbers
        
        //Input code to calculate mean
        
        System.out.println("The mean is: "); 
        //Input code to output mean
    }
}