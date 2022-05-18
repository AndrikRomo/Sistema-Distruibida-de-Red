package interfaces;

import objects.TriangleObj;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Shapes extends Remote {

    public TriangleObj getTriangulo(int l1, int l2, int l3, int h) throws RemoteException;

  
   
}
