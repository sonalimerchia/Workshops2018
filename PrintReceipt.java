package Workshops;

/* Below is a class that prints out a single food and its price as well as a total price for the reciept. 
 * Modify the code to accept up to 5 grocery items without using arrays. If the user inputs 0 products, output "You did not buy anything"*/
import java.util.Scanner;
public class PrintReceipt
{
    public PrintReceipt()
    {} //This is a default constructor. If you do not explicitly write one, the computer will generate this one upon compilation
    public static void main(String[]args)
    {
        PrintReceipt object = new PrintReceipt(); //Declare and initialize an instance of the class called object
        object.print();                           //Call the method "print"
    }
    public void print()
    {
        Scanner ask = new Scanner(System.in); //Initialize a Scanner
        String food1 = ""; 
        double price1 = 0.0;
        //Write code to make other food/price variables
        
        
        //Input code to prompt the user to tell you the number of products they wish to buy
        int numProd = ask.nextInt(); //Get number of items
        
        System.out.println("For each product, enter its name, hit return, and enter its price.");    //Prompt the user
        if(numProd>=1) //Get information for first product
        {
            food1 = ask.next();             //Get the name of the food
            food1= food1+ask.nextLine();    //Get rid of buffer
            price1 = ask.nextDouble();      //Get the price of the object
        }
        //Add code to get information on other products
        
        System.out.printf("%-20s : %9.2f \n", food1, price1); //Print out a food and its price with proper spacing
        //add code to print out other lines
        
        System.out.printf("%-20s : %9.2f \n", "Total Price", price1); //Print out the total price
    }
}

/* 

Solution: 

    
    public void line(String text, double price)
    {   
        System.out.printf("%-20s : %9.2f \n", text, price); //Prints out every line in same format with less clutter
    }
    public void print()
    {
        String food1, food2, food3, food4, food5;               //declare variables
        double price1, price2, price3, price4, price5, total;
        
        food1=""; food2=""; food3=""; food4=""; food5="";       //initialize variables
        price1=price2=price3=price4=price5=total=0.0;
        
        Scanner ask = new Scanner(System.in);     //make Scanner
        
        System.out.println("How many things are you buying?");  //Get number of items
        int numProd = ask.nextInt();
        if(numProd>5) numProd=5; 
        
        System.out.println("For each product, enter its name, hit return, and enter its price.");    //Prompt the user
        
        if(numProd>=1)  //Get 1st Item
        {
            food1 = ask.next(); 
            food1 = food1+ask.nextLine();
            price1 = ask.nextDouble();
        }
        if(numProd>=2)  //Get 2nd Item
        {
            food2 = ask.next(); 
            food2 = food2+ask.nextLine();
            price2 = ask.nextDouble();
        }
        if(numProd>=3)  //Get 3rd Item
        {
            food3 = ask.next(); 
            food3 = food3+ask.nextLine();
            price3 = ask.nextDouble();
        }
        if(numProd>=4)  //Get 4th Item
        {
            food4 = ask.next(); 
            food4 = food4+ask.nextLine();
            price4 = ask.nextDouble();
        }
        if(numProd==5)    //Get 5th Item
        {
            food5 = ask.next(); 
            food5 = food5+ask.nextLine();
            price5 = ask.nextDouble();
        }
        
        System.out.println(); //Space between input and receipt
        
        if(numProd==0) System.out.println("You didn't buy anything"); //If no products
        if(numProd>=1) line(food1, price1);     //Print 1st line
        if(numProd>=2) line(food2, price2);     //Print 2nd line
        if(numProd>=3) line(food3, price3);     //Print 3rd line
        if(numProd>=4) line(food4, price4);     //Print 4th line
        if(numProd==5) line(food5, price5);     //Print 5th line
        
        System.out.println();  //Space before totals
        
        if(numProd>0) line("Total Price", price1+price2+price3+price4+price5); //Print totals
    }

*/