import java.rmi.registry.*;
import interfacesImp.OperacionesImp;

public class ServeRMI_test {
    public static void main(String[] args){
        try {
            OperacionesImp operacionesImp = new OperacionesImp();
            
            Registry registry = LocateRegistry.createRegistry(9090);
            registry.rebind("Operaciones", operacionesImp);
            
            System.out.println("Servidor Activo");
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
