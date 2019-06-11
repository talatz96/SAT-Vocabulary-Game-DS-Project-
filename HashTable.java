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
public class HashTable {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    LinkedList[] Table;
    
    
    public HashTable()
    {
        Table = new LinkedList[10];
        for (int i = 0; i < 10; i++)
        {
            Table [i] = new LinkedList();
        }
    }
    
    /*public void createList(int level)      
    {
        Table = new LinkedList [10];
        Table[level] = new LinkedList();        
    }                   */
     
    
    public int Hash(int key)
    {
        int hash = key % Table.length;
        return hash;
    }
    
    
    public void insert(int hash)
    {
        Table[Hash(hash)].Insert(hash);
    }
    
   
    public LinkedList getList(int level)
    {
        return Table[level];
    }
    
public void displayTable()
    {
        for (int i = 0; i < Table.length; i++)
        {
            System.out.println(Table[i] + " | ");
            System.out.println(Table[i].ToString());   
           
        }
    }



}


