
package Operations;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Operations extends Remote{ 
    //method to ecxhange data remotly and 
    //contain abstract function
    //not contain body of funtion
    //connection between server and client
    
    public int sum(int x, int y) throws RemoteException; 
    public int sub(int x, int y) throws RemoteException;
    public int mul(int x, int y) throws RemoteException;
    public int div(int x, int y) throws RemoteException;
    
}
