/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

/**
 *
 * @author Shayam
 */
public class Rest {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
         Thread t=new Thread();
        for(int i=10;i>=0;i--)
        {
            t.sleep(1000);
            System.out.println(i);
        }
    }
    
}
