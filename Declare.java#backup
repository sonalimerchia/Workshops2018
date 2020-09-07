package Workshops;

public class Declare
{
    public Declare()
    {} //This is the default constructor. If you do not write it, the compilier will automatically make it
    public static void main(String[]args)
    {
        Declare var = new Declare(); //Declare and Initialize an instance called var
        
        System.out.println("Guess if each declaration/initialization will cause an error. Then try to run them.");
        System.out.println("Type the expression in question in the method called tryIt(). \nIt will be at the bottom of your terminal window when you print");
        System.out.println("If you don't understand the instructions, wave your hands around like a maniac.");
        System.out.println("If you don't understand an error, raise your hand like a sane person :D ");
        System.out.println();
        
        
        //Comment out all but one of these. When you finish with that section, switch what is running
        String[]express = var.ints();
        //String[]express = var.chars();
        //String[]express = var.floats();
        //String[]express = var.bytes();
        //String[]express = var.longs();
        //String[]express = var.shorts();
        //String[]express = var.booleans();
        
        for(int index = 0; index<express.length; index++)
        {
            System.out.println((index+1)+".)");
            System.out.println(express[index]+"\n");
        }
        
        //Do not comment this out:
        var.tryIt(); 
    }
    public void tryIt()
    {
        System.out.println();
    }
    public String[] ints()
    {
        System.out.println("Int Section:\n ");
        String[]express = {"int x = 123;", "int 2cool = 12;", "int rocks; \nrocks=12;", "int yay; \nint yay =12;", "int double = 3;", "int smile = 'A'; "};
        return express; 
    }
    public String[] chars()
    {
        System.out.println("Char Section:\n ");
        String[]express = {"char x = 123;", "char letter = \"A\";", "char me = 'A';", "char yay; \nyay = \"HI\";", "char new; \nnew = 'a';", "char initial; \ninitial='b';"};
        return express; 
    }
    public String[] floats()
    {
        System.out.println("Float Section:\n ");
        String[] express = {"float bob = 1.0;", "float sally = 1.0f;","float yay = 1;", "float float = 1.0f;", "float *pie* = 12.0f;", "Float school = 23f;"};
        return express; 
    }
    public String[] bytes()
    {
        System.out.println("Byte Section:\n ");
        String[] express = {"byte yay = 123456;", "byte =3;", "Byte school = 12;","byte var = -3;","byte = 3*3;","byte = 0.23;"};
        return express; 
    }
    public String[] longs()
    {
        System.out.println("Long Section:\n ");
        String[]express = {"long yay, school;\nschool = 4;", "long smile = 3;", "long pie;\npie = 234567;", "long yay;\nYay=32;", "long I'mAwesome = 234;"};
        return express; 
    }
    public String[] shorts()
    {
        System.out.println("Short Section:\n ");
        String[]express = {"short variable = new short(4);","short x = 56;","short big = 40000;","short var;\nvar = 10,000;","short more = 'a';"};
        return express; 
    }
    public String[] booleans()
    {
        System.out.println("Short Section:\n ");
        String []express = {"boolean smile = true;", "booolean trueFalse = false || true;","boolean trueFalse = false && true;","boolean meeeee = 2==3;","boolean pies = 2=3;"}; 
        return express; 
    }
}