package javaeat;

import java.io.Serializable;
import java.util.ArrayList;
import poo.javaeat.Cliente;
/**
 *
 * @author alexv
 */
public class Venta  implements Serializable{

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurantee) {
        this.restaurante = restaurantee;
    }

    private Cliente cliente;
    
    private Restaurante restaurante;
    
     


    private ArrayList<Productos> listaCompra;

    private float total;

    public Venta(Cliente usuario,Restaurante restaurante, ArrayList<Productos> listaCompra, float total) {
        this.restaurante = restaurante;
        this.cliente = usuario;
        this.listaCompra = listaCompra;
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<Productos> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(ArrayList<Productos> listaCompra) {
        this.listaCompra = listaCompra;
    }
    
   

    public Cliente getUsuario() {
        return cliente;
    }

    public void setUsuario(Cliente usuario) {
        this.cliente = usuario;
    }

    @Override
    public String toString() {
        return "Venta-->{" + "usuario=" + cliente + ", listaCompra=" + listaCompra + ", total=" + total + '}';
    }

    
}
