import java.io.*;
import java.util.*;


public class research{

    public static void main( String args[] ) throws Exception{
    Scanner infile = new Scanner(System.in);
    

    
        System.out.print("How long is your strand? \n");
        int size= infile.nextInt();
        String[] array= new String[size];
        for(int i=0; i < size; i++)
        {
            
            System.out.print("Enter a new nucleotide: ");
            String newThing= infile.next();
            newThing=newThing.toUpperCase();
            if(newThing.equals("A") || newThing.equals("T") || newThing.equals("C") || newThing.equals("G") )
            {
                array[i]= newThing;
            }            
            else
            {
                System.out.println("Invalid nucleotide, please use A, T, C, or G");
                i--;
            } 

            
           
        }
        System.out.println();
        System.out.println("Here is the DNA Strand: \n");
        for(int i=0; i < size; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.print("Here is the RNA Strand: \n\n");

        for(int i=0; i< size; i++)
        {
            if(array[i].equals("A"))
            {
                System.out.println("U");
            }
            else if(array[i].equals("T"))
            {
                System.out.println("A");
            }
            else if(array[i].equals("C"))
            {
                System.out.println("G");
            }
            else if(array[i].equals("G"))
            {
                System.out.println("C");
            }
        }
       
    }





}