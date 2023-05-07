
package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {


    public static void main(String[] args) {
     
        try{ //handle exiption
            System.out.println("Waiting..");
            Registry r = LocateRegistry.createRegistry(12345); //create class of port no
            Calculator cal = new Calculator(); //calc is class master
            r.rebind("calculator", cal); //other name for calc 1-name 2-object name of master class
        }catch(RemoteException e){
            
        }
        
    }
    
}
