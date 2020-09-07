package Workshops;

public class PrintStuff
{
    public PrintStuff()
    {} //An empty constructor. If you do not type out any contructor, the program will automatically make an empty one like this one. 
    public static void main(String[]args)
    {
        PrintStuff object = new PrintStuff(); //Declare and initialize an instance of the class called object and call the associated constructor
        object.printer();                     //Call the method "printer"
    }
    public void printer()
    {
        System.out.printf("%50s", "Hello World 1"); //Print out a 50-space, right aligned text block
        System.out.printf("%-50s", "Hello World 2"); //Print out a 50-space, left aligned text block
        
        System.out.println("Hello World 3"); //Print out Hello World and hit return
        System.out.print("Hello World 4"); //Print out Hello World
    }
}