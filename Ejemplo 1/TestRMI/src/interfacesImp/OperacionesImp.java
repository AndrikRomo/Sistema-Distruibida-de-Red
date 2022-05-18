package interfacesImp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import interfaces.Operaciones;

public class OperacionesImp extends UnicastRemoteObject implements Operaciones {

    public OperacionesImp() throws RemoteException {
        super();
    }

    @Override
    public int suma(int a, int b) throws RemoteException {
        
        return a + b ;
    }

    @Override
    public int resta(int a, int b) throws RemoteException {
        
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) throws RemoteException {
        
        return a * b;
    }

    @Override
    public int division(int a, int b) throws RemoteException {
        
        return a / b;
    }
    
}
