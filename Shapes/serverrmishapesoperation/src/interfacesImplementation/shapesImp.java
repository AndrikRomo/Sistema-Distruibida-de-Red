package interfacesImplementation;

import interfaces.Shapes;
import objects.TriangleObj;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class shapesImp extends UnicastRemoteObject implements Shapes {

    public shapesImp() throws RemoteException{
        super();
    }

    @Override
    public TriangleObj getTriangulo(int l1, int l2, int l3, int h) throws RemoteException {
        return new TriangleObj(l1,l2,l3, h);
    }


    

   
}
