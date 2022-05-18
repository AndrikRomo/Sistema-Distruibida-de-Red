package main;

import interfacesImplementation.shapesImp;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class ServerShapesOperations {
    public static void main(String[] args) {
        try{
            shapesImp figImp = new shapesImp();
            Registry registro = LocateRegistry.createRegistry(9090);
            registro.rebind("RMIShapes", figImp);
            System.out.println("Servidor figuras Activo");

        }catch (RemoteException e){
            System.out.println(e.getMessage());
        }
    }
}
