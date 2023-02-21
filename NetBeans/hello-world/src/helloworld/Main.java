/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author denis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!\n");
        
        // Nums from 20 to 40 that % 2
        for(int i = 20; i<=40; i++){
            if(i%2==0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
