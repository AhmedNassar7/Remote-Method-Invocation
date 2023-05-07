
package client;

import Operations.Operations;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
     //الشركة
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        try{
            Operations p = (Operations)Naming.lookup("rmi://192.168.56.1:12345/calculator"); //object from interface 
            int r = p.sum(x, y);
            System.out.println("Result = " + r);
        }catch(Exception e){
            
        }       
    }   
}
