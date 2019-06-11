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
public class SATPreparationGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashTable h = new HashTable();
        h.insert(h.Hash(3));
        h.getList(1).checkAnswer(5);
    }
    
}
