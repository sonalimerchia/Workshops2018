package Workshops;

import java.io.*;
public class Worksheet
{
    public static void main(String[]args)
    {
        Worksheet obj = new Worksheet();
        obj.start();
    }
    public void start()
    {
        File ws = new File("Worksheet.txt");
        PrintWriter write = null;
        try
        {
            write = new PrintWriter(ws);
        }
        catch(FileNotFoundException e){System.out.println("smell");}
        
        String[]express = {"int x = 123;", "int 2cool = 12;", "int rocks; rocks=12;",  
            "int double = 3;", "int smile = 'A'; ", "char x = 123;", "char letter = \"A\";", "char me = 'A';", 
            "float bob = 1.0;", "long smile = 3;",
            "float sally = 1.0f;","float yay = 1;", "float float = 1.0f;", "float *pie* = 12.0f;", "Float school = 23f;", 
            "byte yay = 123456;", "byte =3;", "Byte school = 12;","byte var = -3;","byte = 3*3;","byte = 0.23;", 
            "long I'mAwesome = 234;", "short variable = new short(4);","short x = 56;","short big = 40000;",
            "short more = 'a';", "boolean smile = true;", "booolean trueFalse = false || true;",
            "boolean trueFalse = false && true;","boolean meeeee = 2==3;","boolean pies = 2=3;", "int yay; \nint yay =12;", 
            "char yay; \nyay = \"HI\";", "char new; \nnew = 'a';", "char initial; \ninitial='b';", "long yay, school;\nschool = 4;", 
            "long pie;\npie = 234567;", "long yay;\nYay=32;","short var;\nvar = 10,000;"};
        
        for(int index=0; index<express.length; index++)
        {
            write.print((index+1)+".) "+express[index]+"\t");
            if(index%5==0) write.println("\n\n\n");
        }
        write.close(); 
    }
}