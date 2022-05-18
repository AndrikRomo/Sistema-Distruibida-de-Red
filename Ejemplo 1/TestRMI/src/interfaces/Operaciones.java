package interfaces;

import java.rmi.*;


public interface Operaciones extends Remote{

    public int suma (int a, int b) throws RemoteException;

    public int resta (int a, int b) throws RemoteException;
    
    public int multiplicacion (int a, int b) throws RemoteException;

    public int division (int a, int b) throws RemoteException;
    
}