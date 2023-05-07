
package Operations;

import java.rmi.RemoteException;


public interface Operations {
    //same name of interface and pachage
    //must interface in one be in another with name but not methods 
    //database start on it
    
    public int sum(int x, int y) throws RemoteException;
    public int sub(int x, int y) throws RemoteException;
    public int mul(int x, int y) throws RemoteException;
    public int div(int x, int y) throws RemoteException;
}
