package Workshops;

import java.util.Scanner; 
public class ToDo
{
    Scanner ask = new Scanner(System.in); //Declaring an object/variable here will allow you to access it from anywhere in the class
    public ToDo()
    {}//This is the default constructor. If you do not type an instructor, the compiler will automatically make one identical to this
    public static void main(String[]args)
    {
        ToDo object = new ToDo(); //Declares an initializes an instance called object
        
        //ask if they would like to make endless list, a list of specific length, or add one list item at a time
        
        String list = "";
        //create three methods that each make a type of list and run the appropriate one
        
        System.out.println(list);
    }
    public String endless()
    {
        //Create a method that uses a while loop to collect each line of text until the user types "stop"
        //Return a string that holds all the list items with appropriate newlines
        String big = "";
        String text = "";
        while(!text.equalsIgnoreCase("STOP"))
        {
            text = ask.nextLine();
            if(!text.equalsIgnoreCase("STOP"))
            big = big+text+"\n";
        }
        return big; 
    }
    public String setList()
    {
        //Create a method that uses a for loop that takes in a certain number of list items according to the number of items the user claims to have
        //Return a string that holds all the list items with appropriate newlines
        String big = "";
        System.out.println("How many things do you have to do?");
        int max = ask.nextInt();
        
        for(int num=0; num<max; num++)
        big = big+ask.nextLine()+"\n";
        return big; 
    }
    public String addList()
    {
        //Create a method that uses a do...while loop to ask for a list item, collect the item, and ask the user if they have another item
        //Return a string that holds all the list items with appropriate newlines
        String big = "";
        boolean cont = true; 
        do
        {
            System.out.println("What do you have to do?");
            big=big+ask.nextLine()+"\n";
            System.out.println("Would you like to add another list item? \n(1)Yes (2)No");
            if(ask.nextInt()==2) cont=false; 
        }
        while(cont);
        return big; 
    }
}