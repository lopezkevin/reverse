/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapplication2;
import java.util.Scanner; 
/**
 *
 * @author k.lopez
 */
public class MonApplication2 {

    /**
     * @param args the command line arguments test
     */
    public static void min(String[] args) {
        
       
        Scanner sc = new Scanner(System.in);
System.out.println("Veuillez saisir un mot :");
String str = sc.nextLine();
       
       String mot=str;
       String motsaisie=mot;
       String inverse ="";
       String temp="";
       int taille = 0;
       int taillemot = mot.length();
       for(int i = 0 ; i < taillemot;++i ){
           
          taille= mot.length();
          inverse = inverse+mot.substring(taille-1);          
          temp = mot.substring(0,taille-1);
          mot=temp;          
 
                 
              
       }
       
       if (motsaisie.equals(inverse))
          
               {   
                   
               
           System.out.println("C'est un PALINDROME");
    
       }
     else               {
        
        System.out.println("Mot normal");
            
    }
           
       
        
        
        // TODO code application logic here
    }
    
}
