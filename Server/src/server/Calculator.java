
package server;

import Operations.Operations;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements Operations{
    //implement methods in interface
    //intilaize methods
    //UnicastRemoteObject must make constractor from class and throws exciption
    //master class that do operation remolty
    //method want it remotly
    //الموظف
    
    Calculator() throws RemoteException{}
    
    @Override
    public int sum(int x, int y) throws RemoteException {
        return x+y;
    }

    @Override
    public int sub(int x, int y) throws RemoteException {
        return x-y;
    }

    @Override
    public int mul(int x, int y) throws RemoteException {
        return x*y;
    }

    @Override
    public int div(int x, int y) throws RemoteException {
        return x/y;
    }
    
}
