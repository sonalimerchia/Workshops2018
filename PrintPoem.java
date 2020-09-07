package Workshops;

/*The following is a program which types out a poem center aligned over a field of 50 spaces
 Edit the following code to print it so that the lines are staggered such that the 
 first line is left aligned, the middle is center aligned, the third is right aligned 
 and then the pattern  repeats. 

 example: 

 Line 1
      Line 2
            Line 3
 Line 4
      Line 5
            Line 6
 ...

   */ 
public class PrintPoem
{
    public PrintPoem()
    {} //An empty constructor. If you do not type out any contructor, the program will automatically make an empty one like this one. 
    public static void main(String[]args)
    {
        PrintPoem sally = new PrintPoem(); //Declare and initialize an instance of the class called sally and call the associated constructor
        sally.printVerse();                //Call the method PrintVerse
    }
    public void printVerse()
    {
//This method prints the poem center aligned
        for(int index = 1; index<=16; index++) //Go through every line
        {
            for(int num = numSpaces(getLine(index)); num>0; num--) //Get the number of spaces needed to center align and print them out
            System.out.print(" ");
            System.out.println(getLine(index)); //Print out poem line
        }   
    }
    public String getLine(int num)
    {
//This method returns the text of the poem according to the index passed in
        if(num==1) return "Life is a computer"; 
        if(num==2) return "At times slow";
        if(num==3) return "And annoying with";
        if(num==4) return "Pop ups black outs";
        if(num==5) return "Viruses but also is";
        if(num==6) return "very good with Facebook";
        if(num==7) return "Myspace twitter and you";
        if(num==8) return "Can get all your information";
        if(num==9) return "You can read a thousand";
        if(num==10) return "Books with a click of a mouse";
        if(num==11) return "Right at your fingertips";
        if(num==12) return "So there are always pop ups";
        if(num==13) return "But all you have to do is keep";
        if(num==14) return "Going and they will go away";
        if(num==15) return "Just remember that";
        return "Life is a computer";
    }
    public int numSpaces(String text)
    {
        //This method returns the number of spaces before and after the line passed into it
        
        int spaces = 50;            //The max number of spaces
        spaces-= text.length();     //remove the number of characters in each line
        spaces/= 2;                 //split the number of spaces in half (front and back)
        return spaces;              //Return the number of spaces
    }
}

/* 
Solution: 

Replace printVerse() contents with:
for(int index = 1; index<=16; i; index++) 
{
    int x = numSpaces(getLine(index));
    if(index%3==1)x=0;
    else if(index%3==0) x*=2; 
      for(int num = x; num>0; num--)
      System.out.print(" ");
      System.out.println(getLine(index)); 
}   

*/