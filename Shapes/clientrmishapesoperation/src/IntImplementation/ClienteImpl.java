package IntImplementation;


import interfaces.Shapes;
import objects.TriangleObj;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteImpl {
    public void connectServer() {
        try {
            TriangleObj triangulo;
            float perimeter;
            float area;

            Registry registro = LocateRegistry.getRegistry("192.168.43.94", 9090);
            Shapes interfaz = (Shapes) registro.lookup("RMIShapes");
            triangulo =(TriangleObj) interfaz.getTriangulo(3, 3, 3, 4);
            perimeter = (float) triangulo.getLado1() + triangulo.getLado2() + triangulo.getLado3();
            area = (float) (triangulo.getLado1() * triangulo.getAltura())/2;
            System.out.println("El perimetro  es: " + perimeter);
            System.out.println("El area  es: " + area);
           
        } catch (RemoteException | NotBoundException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}
