package Workshops; 

import java.util.Scanner;

public class Alphabetize
{
    public static void main(String[]args)
    {   Alphabetize obj = new Alphabetize();
        obj.run(); }
    public void run()
    {
        Scanner ask = new Scanner(System.in);// Create Scanner
        int numWords =0; 
        
        do {
        System.out.println("Please enter a number between 2 and 20"); 
        numWords = ask.nextInt(); 
        }   while(!(numWords>=2 && numWords<=20));
        String [] words = new String [ numWords ];
        System.out.println("Please enter "+numWords+" words");
        
        for(int index=0; index<numWords; index++)
        words[index] = ask.next(); 
        
        for(int index2=0; index2<numWords; index2++)
        for(int index=0; index<numWords-1; index++)
        {
            int diff = words[index].compareToIgnoreCase(words[index+1]);
            if(diff>0)
            {
                String interm = words[index];
                words[index]=words[index+1];
                words[index+1]=interm; 
            }
        }
        
        for(int index=0; index<numWords; index++)
        System.out.println(words[index]);
    }
}