/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaeat;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import poo.javaeat.Empresa;
import poo.javaeat.Particular;
import javaeat.Productos;
import javaeat.Restaurante;
import poo.javaeat1.finalizarCompra;
import javaeat.almacenRestaurantes;
/**
 *
 * @author alexv
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        almacenProductos Prod = new almacenProductos();
        almacenRestaurantes almRes = new almacenRestaurantes();

        Prod.borrarDatos();
        
        
       

        Productos p1 = new Productos("Plato de pasta", "pasta, salsa de tomate, queso", 10);        
        Productos p2 = new Productos("Ensalada de verduras", "lechuga, tomate, pepino, aderezo", 8);
        Productos p3 = new Productos("Pizza margarita", "masa de pizza, salsa de tomate, queso mozzarella, albahaca", 12);
        Productos p4 = new Productos("Hamburguesa con queso", "carne de res, pan de hamburguesa, queso cheddar, lechuga,tomate", 15);
        Productos p5 = new Productos("Sopa de pollo", " pollo, zanahoria, apio, fideos, caldo de pollo", 6);
        Productos p6 = new Productos("Sushi variado", "arroz, pescado crudo, alga nori, salsa de soja", 20);
        Productos p7 = new Productos("Taco", "carne de cerdo marinada, tortilla de maíz, piña, cilantro", 3);
        Productos p8 = new Productos("Pastel de chocolate", "harina, azúcar, cacao en polvo, mantequilla, huevos", 18);
        Productos p9 = new Productos("Café americano", "café, agua,leche", 4);
        Productos p10 = new Productos("Helado de vainilla", "leche, crema, azúcar, vainilla", 5);
        Productos p11 = new Productos("Enchiladas verdes", "tortillas de maíz, pollo, salsa verde, crema, queso", 9);
        Productos p12 = new Productos("Galletas de avena y pasas", "harina, azúcar, pasas, mantequilla, huevo", 7);
        Productos p13 = new Productos("Agua de horchata", "arroz, azúcar, canela, leche, agua", 3);
        Productos p14 = new Productos("Pizza barbacoa", "masa de pizza, salsa de tomate, queso, bacon, pollo,barbacoa", 9);
        Productos p15 = new Productos("Sushi de salmón", "arroz de sushi, salmón, algas, salsa de soja", 15);
        Productos p16 = new Productos("Ensalada César", "lechuga, pollo, pan tostado, queso", 10);
        Productos p17 = new Productos("Tortilla de patatas", "patatas, cebolla, aceite", 8);

        
        Prod.getProducto().add(p1);
        Prod.getProducto().add(p2);
        Prod.getProducto().add(p3);
        Prod.getProducto().add(p4);
        Prod.getProducto().add(p5);
        Prod.getProducto().add(p6);
        Prod.getProducto().add(p7);
        Prod.getProducto().add(p8);
        Prod.getProducto().add(p9);
        Prod.getProducto().add(p10);
        Prod.getProducto().add(p11);
        Prod.getProducto().add(p12);
        Prod.getProducto().add(p13);
        Prod.getProducto().add(p14);
        Prod.getProducto().add(p15);
        Prod.getProducto().add(p16);
        Prod.getProducto().add(p17);

        Prod.EscribirFichero("src/main/java/data");

        almRes.borrarDatos();
        Restaurante restaurante1 = new Restaurante("A00000008", "Vergolini", "Madrid C/Finisterre, 23, 28050", "Pizzas", 7.3, 7, 25, true);
        Restaurante restaurante2 = new Restaurante("P32675318", "Ochovos", "Madrid C/Valverde, 00, 28801", "Carnes", 9, 5, 21, true);
        Restaurante restaurante3 = new Restaurante("R93483482", "XokEAT's", "Barcelona C/Gaudi, 18, 08005", "Postres", 5.2, 5, 32, true);
        Restaurante restaurante4 = new Restaurante("O84002471", "La Brasserie", "Valdemoro C/Río Manzanares, 12, 28340", "Mariscos", 8.2, 10, 30, false);
        
        
        
        // Obtener la lista de comidas de almProd
        List<Productos> comidasRestaurante1 = new ArrayList<>();
        List<Productos> comidasRestaurante2 = new ArrayList<>();
        List<Productos> comidasRestaurante3 = new ArrayList<>();
        List<Productos> comidasRestaurante4 = new ArrayList<>();

        // Verificar que hay suficientes comidas en la lista general de productos
        if (Prod.getProducto().size() >= 16) {
            // Agregar las primeras 4 comidas a cada lista de restaurante
            for (int i = 0; i < 4; i++) {
                comidasRestaurante1.add(Prod.getProducto().get(i));
                comidasRestaurante2.add(Prod.getProducto().get(i + 4));
                comidasRestaurante3.add(Prod.getProducto().get(i + 8));
                comidasRestaurante4.add(Prod.getProducto().get(i + 12));
            }
        } else {
            System.out.println("No hay suficientes comidas en la lista  de productos.");
        }

        // Asignar las listas de comidas a cada restaurante
        restaurante1.setComidas(comidasRestaurante1);
        restaurante2.setComidas(comidasRestaurante2);
        restaurante3.setComidas(comidasRestaurante3);
        restaurante4.setComidas(comidasRestaurante4);
        
        //Para que se guarden cada lista de comidas en cada restaurante
        
        almRes.getRestaurante().add(restaurante1);
        almRes.getRestaurante().add(restaurante2);
        almRes.getRestaurante().add(restaurante3);
        almRes.getRestaurante().add(restaurante4);
        
         almRes.EscribirFichero("src/main/java/data");
        System.out.println(restaurante3.getComidas());

        

    }

}
