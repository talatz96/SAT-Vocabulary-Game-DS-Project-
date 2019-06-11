    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sat.preparation.game;

import java.util.Scanner;

/**
 *
 * @author Taimoor
 */
public class LinkedList 
{
 
    public int level = 0;
    Node head = null;
    private int score;
    
    
    public void Insert(int hash)
    {
        Node n = new Node(hash);
        if (head == null)
        {
            head = n;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    
       public Node getNode(int index)
    {
        Node temp = head;
        while (temp != null)
        {
            if (temp.index == index)
            {
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }
    
    
    public void checkAnswer(int index)
    {
        Node n = getNode(index);
        System.out.println("Write your answer:");
        //String w = input.next();
        if (n.word.equals("Abhor"))
            
        {
            level = level + 1;
            score = score + (level * 10);
        }
        else
        {
            Insert(level);
            checkAnswer(n.next.index);
        }
    }
    
    public void DisplayScore()
    {
        System.out.println("Your score is: " + score);
    }
    
    
    public String ToString()
    {
       String str = "";
       Node temp = head;
       while (temp != null)
       {
           str = str + temp.word;
           temp = temp.next;
       }
       return str;
     }
    
    
    

}
