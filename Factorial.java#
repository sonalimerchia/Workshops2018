package Workshops;

public class Factorial
{
    public Factorial(){} //This is a default constuctor. If you do not create any constructors, the compiler will create one identical to this one for you. 
    public static void main(String[]args)
    {
        Factorial suzy = new Factorial(); //Declare and initialize an object variable called "suzy"
        suzy.run(); //Call the method called "run"
    }
    public void run()
    {
        //create a method with a starting number variable and a for loop to find the fatorial of the starting number, a newline, and
        //then the factorial for each number beneath it (example: if 5 is the starting number, print out 5! \n 4! \n 3! \n 2! \n 1! \n 0!)
        int num=6; 
        String big = "";
        for(int index=num; index>=0; index--)
        {
            int result = index; 
            for(int x=index-1; x>0 ; x--)
            result*=x; 
            big = big+result+"\n"; 
        }
        //Print out the result
        System.out.println(big);
    }
}