package Workshops;

import java.util.Scanner; 
public class PassAdder
{
    public PassAdder()
    {} //Default Constructor: If you do not write a constructor, the compiler automatically makes an identical one to this
    public static void main(String[]args)
    {
        PassAdder pass = new PassAdder(); //Declare/Initialize an instance of the class called pass
        pass.start();
    }
    public void start()
    {
        //Write code to make a Scanner and get an origonal int to use
        //pass int to makeDouble()
    }
    public void makeDouble(int num)
    {
        //cast int as double, print, and pass to increment()
    }
    public void increment(double num)
    {
        //add 1 to the double, print, and print passing the double into divide()
    }
    public boolean divide(double num)
    {
        //divide by 2, print, and return if the origonal double was even
        return true; 
    }
}