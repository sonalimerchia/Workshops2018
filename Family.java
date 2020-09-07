package Workshops;

import java.util.Scanner; 
public class Family
{
    String name, favAnimal, favColor; //Declare Field Variables
    double weight, height; 
    Family baby, sister, brother, mother, father;
    
    public Family()
    {}
    public Family(String name1) //baby constructor
    {
        name=name1;
    }
    public Family(String name1, String favColor1)//sister constructor
    {
        name=name1;
        favColor=favColor1;
    }
    public Family(String name1, String favColor1, String favAnimal1) //brother constructor
    {
        name=name1;
        favColor=favColor1;
        favAnimal=favAnimal1;
    }
    public Family(String name1, String favColor1, String favAnimal1, double height1) //mother constructor
    {
        name=name1;
        favColor=favColor1;
        favAnimal=favAnimal1;
        height=height1;
    }
    public Family(String name1, String favColor1, String favAnimal1, double height1, double weight1) //father constructor
    {
        name=name1;
        favColor=favColor1;
        favAnimal=favAnimal1;
        height=height1;
        weight=weight1;
    }
    public static void main(String[]args) //main
    {
        Family object = new Family(); //Create instance of class
        object.run();                 //Call method run()
    }
    public void run()
    {
        Scanner scan = new Scanner(System.in); //Create Scanner
        
        System.out.println("What is the baby's name?"); //Prompt
        name = scan.next();      //Get Information
        baby = new Family(name);    //Create object
        
        System.out.println("What is the sister's name and favorite color?"); //Prompt
        name = scan.next();      //Get Information
        favColor = scan.next();
        sister = new Family(name, favColor);    //Create Object

        System.out.println("What is the brother's name, favorite color, and favorite animal?"); //Prompt
        name = scan.next();     //Get Information
        favColor = scan.next();
        favAnimal=scan.next();
        brother = new Family(name, favColor, favAnimal);     //Create Object
        
        System.out.println("What is the mother's name, favorite color, favorite animal, and height?"); //Prompt
        name = scan.next();     //Get Information
        favColor = scan.next();
        favAnimal=scan.next();
        height = scan.nextDouble();
        mother = new Family(name, favColor, favAnimal, height);  //Create Object
        
        System.out.println("What is the father's name, favorite color, favorite animal, height, and weight in inches?"); //Prompt
        name = scan.next();     //Get Information
        favColor = scan.next();
        favAnimal=scan.next();
        height = scan.nextDouble();
        weight = scan.nextDouble();
        father = new Family(name, favColor, favAnimal, height, weight);  //Create Object
        
        
        //Print out information as a table
        
        System.out.printf("%11s %10s %10s %10s %10s %10s \n", "", "name", "color","animal","height","weight"); //print headings
        for(int index=0; index<5; index++)
        printIt(index);
    }
    public void printIt(int num)
    {
        String [] titles = {"baby", "sister", "brother", "mother", "father"};//get name for leftmost column
        Family [] objects = {baby, sister, brother, mother, father};   //pick correct object
        
        System.out.printf("%-10s: %10s ", titles[num], objects[num].name);    //Print title and name
        if(num>0) System.out.printf("%10s", objects[num].favColor);        //print favorite color
        if(num>1) System.out.printf("%10s", objects[num].favAnimal);       //print favorite animal
        if(num>2) System.out.printf("%10.1f", objects[num].height);        //print height
        if(num>3) System.out.printf("%10.1f", objects[num].weight);        //print weight
        System.out.println();   //Return for next row
    }
}
