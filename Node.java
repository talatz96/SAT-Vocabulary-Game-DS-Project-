/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sat.preparation.game;

/**
 *
 * @author Taimoor
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Taimoor
 */
public class Node {
    
    String word;
    int index;
    String meaning;
    Node next;
    
    public String[] file(int mod)
    {
    
    Scanner input = new Scanner (System.in);
    BufferedReader br=null;
    String line;
    String[] x = null;
    //int nCount =(int)((Math.random()* 9) + 1) ;
    
    //System.out.println(nCount);
   // String a = String.valueOf(nCount);
    String b = String.valueOf(mod);
    //String index = a+b;
    System.out.println(index);
    String i;
    String ans;
    String hint;
    
            
    
try
{
    br = new BufferedReader(new FileReader("C:\\Users\\Taimoor\\Desktop\\Fall 2017 (3rd semester)\\DS project\\word.txt"));
    while ((line =br.readLine()) !=null)
    {
  
   if (line.contains("10")) 
   {
       x = line.split("-");
     
        i = x[0];
        ans = x[1];
        hint = x[2];        
       System.out.println(line);
    }
 
  
    
    }
}
    catch(FileNotFoundException f1)
    {
    System.out.println(f1.getMessage() +"wrong text file");
    System.exit(0);

    }
    catch (IOException i1)  
    {
    System.out.println(i1.getMessage() +"Error reading file ");

    }
    System.exit(0);
    return x;
}


    
    
    
    
    public Node(int index)
    {
        //String a[] = file(index);
        BufferedReader br=null;
    String line;
    String[] x = null;
    int nCount =(int)((Math.random()* 10) + 1) ;
    
    //System.out.println(nCount);
    String a = String.valueOf(nCount);
    String b = String.valueOf(index);
    int in = (int) (Math.random()*10) + 50;
    String ind = Integer.toString(in);
   // System.out.println(ind);
    String i;
    String ans;
    String hint;
    
            
    
try
{
    br = new BufferedReader(new FileReader("C:\\Users\\Taimoor\\Documents\\NetBeansProjects\\SAT Preparation Game\\word_game.txt"));
    while ((line =br.readLine()) !=null)
    {
  
   if (line.contains(ind)) 
   {
       x = line.split("-");
     
        i = x[0];
        word = x[1];
        meaning = x[2];
        System.out.println("Guess the word!");
        System.out.println(" ");
        System.out.print("Word: " );
        for (int j = 0; j < word.length(); j++)
        {
            System.out.print("_ ");
        }
        System.out.println(" ");
        System.out.println("Meaning: " + meaning);
        System.out.println(" ");
    }
 
  
    
    }
}
    catch(FileNotFoundException f1)
    {
    System.out.println(f1.getMessage() +"wrong text file");
    System.exit(0);

    }
    catch (IOException i1)  
    {
    System.out.println(i1.getMessage() +"Error reading file ");

    }

//    System.exit(0);
   
}
        
       
//Using index, fetch word, meaning and answer and store in respective variables;
    }


