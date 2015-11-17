/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jocsprogramacio;


/**
 *
 * @author solde
 */
public class JocsProgramacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JocsProgramacio program = new JocsProgramacio();
        program.init();
        
    }
    private void init(){
           // TODO code application logic here 
        Tests proves= new Tests();
        //proves.entraNum();
        //proves.entraNumRang();
       // proves.testLinia1();
        proves.testCentrat();
        proves.testTitol();
        }
    
}
