package Workshops;

import java.util.Scanner; 
public class Array
{
    public Array(){}
    public static void main(String[] args)
    {
        Array obj = new Array();
        obj.run();
    }
    public void run()
    {
        
        Scanner ask = new Scanner(System.in); 
        
        System.out.println("How many names do you have?");
        int numNames = ask.nextInt();
        
        String[] names = new String[numNames];
        System.out.println("Please enter your names");
        
        for(int index=0; index<numNames; index++)
        names[index] = ask.next(); 

        int max = 0; 
        for(int index=0; index<numNames; index++)
        if(names[index].length()>max) max=names[index].length(); 
        
        for(int index = 0; index<max; index++)
        {
            for(int index2 = 0; index2< names.length; index2++)
            {
                if(index < names[index2].length())
                System.out.print(names[index2].charAt(index));
                else System.out.print(" ");
            }
            System.out.println(); 
        }
    }
}

// nameOfArray [ index ] ; 