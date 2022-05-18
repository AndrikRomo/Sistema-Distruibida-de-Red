package interfacesImp;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import interfaces.Operaciones;

public class ClientImp {
    public void ConectServer(){
        try {

            int resultado_suma ;
            int resultado_resta;
            int resultado_mult;
            float res_div;
            Registry registry = LocateRegistry.getRegistry("192.168.43.94", 9090);
            Operaciones operaciones = (Operaciones) registry.lookup("Operaciones");
            resultado_suma = operaciones.suma(4,2);
            resultado_resta = operaciones.resta(4,2);
            resultado_mult = operaciones.multiplicacion(4,2);
            res_div = operaciones.division(4,2);
            System.out.println( "Suma:" + resultado_suma);
            System.out.println("Resta:" + resultado_resta);
            System.out.println("Multiplicacion:" + resultado_mult);
            System.out.println("Division:" + res_div);


        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();

           
        }
    }
}
