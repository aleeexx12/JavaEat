package javaeat;


import poo.javaeat.Empresa;
import poo.javaeat.Cliente;
import poo.javaeat.Particular;
import java.io.*; 
import java.util.ArrayList;
/**
 *
 * @author alexv
 */
public class almacenClienteParticularEmpresa implements Serializable {

    private ArrayList<Particular> ListaParticulares;
    private ArrayList<Empresa> ListaEmpresa;

    public almacenClienteParticularEmpresa() {
        ListaParticulares = new ArrayList<>();
        ListaEmpresa = new ArrayList<>();

   
        LeerFichero("src/main/java/data", 1);
        LeerFichero("src/main/java/data", 2);
    }

    public void EscribirFichero(String ruta, int i) {
        final String SEP_FICHERO = System.getProperty("file.separator");
        FileOutputStream f = null;
        ObjectOutputStream obs = null;

        try {
            switch (i) {
                case 1 -> {
                    f = new FileOutputStream(ruta + SEP_FICHERO + "lista_parti.dat");
                    obs = new ObjectOutputStream(f);
                    obs.writeObject(this.ListaParticulares);
                }
                case 2 -> {
                    f = new FileOutputStream(ruta + SEP_FICHERO + "lista_empr.dat");
                    obs = new ObjectOutputStream(f);
                    obs.writeObject(this.ListaEmpresa);

                }
                default -> {
                    System.err.println(" Introduzca una opcion valida:almacenParticulares");
                }
            }

        } catch (IOException e) {
            System.err.println("IO Exception - Write");
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

    public ArrayList<Cliente> getListaClientes() {
        ArrayList <Cliente> lista = new ArrayList<>();
        lista.addAll(ListaParticulares);
        lista.addAll(ListaEmpresa);
        
        return lista;
    }

    public ArrayList<Particular> getListaParticulares() {
        return ListaParticulares;
    }

    public ArrayList<Empresa> getListaEmpresa() {
        return ListaEmpresa;
    }

    private void LeerFichero(String ruta, int i) {

        FileInputStream f = null;
        ObjectInputStream obs = null;
    

        try {
            switch (i) {
                case 1 -> {
                    f = new FileInputStream(ruta + File.separator + "lista_parti.dat");
                    obs = new ObjectInputStream(f);
                    this.ListaParticulares = (ArrayList<Particular>) obs.readObject();

                }
                case 2 -> {
                    f = new FileInputStream(ruta + File.separator + "lista_empr.dat");
                    obs = new ObjectInputStream(f);
                    this.ListaEmpresa = (ArrayList<Empresa>) obs.readObject();
                }
                default -> {
                    System.err.println(" Introduzca una opcion valida:almacenParticulares");
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
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
}
