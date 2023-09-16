package javaeat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author alexv
 */
public class almacenVentas implements Serializable {

    private ArrayList<Venta> ventas;

    public almacenVentas() {
        ventas = new ArrayList<>();
        LeerFichero("src/main/java/data");

    }

    public ArrayList<Venta> getVenta() {
        return ventas;
    }

    private void LeerFichero(String ruta) {
        FileInputStream f = null;
        ObjectInputStream obs = null;

        try {
            f = new FileInputStream(ruta + File.separator + "lista_vent.dat");
            obs = new ObjectInputStream(f);
            this.ventas = (ArrayList<Venta>) obs.readObject();

        } catch (IOException e) {
            System.err.println("IO EXCEPTION PRODUCTOS");
        } catch (ClassNotFoundException e2) {
            System.err.println(e2.getMessage());
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
                if (obs != null) {
                    obs.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

    }

    public void EscribirFichero(String ruta) {
        final String SEP_FICHERO = System.getProperty("file.separator");
        FileOutputStream f = null;
        ObjectOutputStream obs = null;

        try {
            f = new FileOutputStream(ruta +  File.separator + "lista_vent.dat");
            obs = new ObjectOutputStream(f);
            obs.writeObject(this.ventas);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
                if (obs != null) {
                    obs.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
              String a = "";

       for (Venta aux : ventas) {
              a = a + aux;

        }
         return a;
        }
}
