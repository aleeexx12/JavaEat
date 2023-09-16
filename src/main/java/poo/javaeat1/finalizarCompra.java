package poo.javaeat1;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javaeat.Restaurante;
import java.util.ArrayList;
import javaeat.Productos;
import javaeat.Venta;
import javaeat.almacenProductos;
import javaeat.almacenRestaurantes;
import poo.javaeat.Cliente;
/**
 *
 * @author alexv
 */
public class finalizarCompra extends javax.swing.JFrame {
    
    
    Venta venta;
    Cliente cliente;
    
    ArrayList<Productos> prod;
    
    
    
    
    private DateTimeFormatter formatoESP = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    
    

    public finalizarCompra(Venta venta, Cliente cliente) {
        
        
        
        initComponents();
        this.venta = venta;
        this.cliente = cliente;
        
        prod = venta.getListaCompra();
        
        
        
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        finalizarCompra = new java.awt.Button();
        label4 = new java.awt.Label();
        seguirComprando = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 51, 255));
        label1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("FINALIZAR COMPRA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        label2.setText("COMPRA REALIZADA CORRECTAMENTE");
        jPanel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, 80));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        label3.setText("PULSAR PARA OBTENER LA FACTURA");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 350, -1));

        finalizarCompra.setActionCommand("FACTURA/TICKET");
        finalizarCompra.setBackground(new java.awt.Color(51, 51, 255));
        finalizarCompra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        finalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        finalizarCompra.setLabel("FACTURA / TICKET");
        finalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarCompraActionPerformed(evt);
            }
        });
        jPanel2.add(finalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 260, 70));

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        label4.setText("Gracias por comprar en JavaEat");
        jPanel2.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 780, 40));

        seguirComprando.setBackground(new java.awt.Color(51, 51, 255));
        seguirComprando.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seguirComprando.setForeground(new java.awt.Color(255, 255, 255));
        seguirComprando.setText("Pulse aqui para seguir comprando");
        seguirComprando.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seguirComprando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguirComprandoActionPerformed(evt);
            }
        });
        jPanel2.add(seguirComprando, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 280, 60));

        salir.setBackground(new java.awt.Color(51, 51, 255));
        salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Pulse aqui  para salir");
        salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 280, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 810, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seguirComprandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguirComprandoActionPerformed
        Pedidos abrir = new Pedidos(cliente);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_seguirComprandoActionPerformed

    private void finalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarCompraActionPerformed

   
    System.out.println("-------------------------------- Factura Producto --------------------------------");
    System.out.println("-------------------------------- Fecha: " + LocalDateTime.now().format(formatoESP) + " -------------------------------");
    System.out.println("--------------------------------Datos del Restaurante:                                 -------------------------------");
    for(Productos p:prod){
            System.out.println(""+p.getTITULO()+"   "+p.getPRECIO()+"€");
   
    }
    System.out.println("");
    System.out.println("Cantidad de platos comprados:" + prod.size());
    System.out.println("Total: " + venta.getTotal() + "€");
    System.out.println("Datos del cliente: "
            + cliente.getCorreo() + ","
            + cliente.getDireccion() + ","
            + cliente.getNombre() + ";"
            + cliente.getTelefono());
    System.out.println("----------------------------------------------------------------------------------");

    }//GEN-LAST:event_finalizarCompraActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button finalizarCompra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JButton salir;
    private javax.swing.JButton seguirComprando;
    // End of variables declaration//GEN-END:variables
}
