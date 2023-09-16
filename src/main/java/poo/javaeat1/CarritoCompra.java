/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.javaeat1;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import javaeat.Productos;
import javaeat.Venta;
import javaeat.almacenClienteParticularEmpresa;
import javaeat.almacenContra;
import javaeat.almacenProductos;
import javaeat.almacenVentas;
import javaeat.Restaurante;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import poo.javaeat.Cliente;
import javaeat.Restaurante;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import poo.javaeat.Empresa;
/**
 *
 * @author alexv
 */
public class CarritoCompra extends javax.swing.JFrame {

    ArrayList<Productos> prodSel;
    Cliente cliente;
    float total = 0;
    almacenProductos almProductos = new almacenProductos();
    Restaurante restaurante;

    String[] opcionesComboBox = {"Opción 1", "Opción 2", "Opción 3"};
    JComboBox<String> jCcomboBox1 = new JComboBox<>(opcionesComboBox);

    public CarritoCompra(ArrayList<Productos> prodSel, Cliente cliente) {
        initComponents();
        this.prodSel = prodSel;
        this.cliente = cliente;

        for (Productos p : prodSel) {

            total += p.getPRECIO();
        }

        jPrecio.setText(String.valueOf("" + total + " €"));
        
        if (cliente instanceof Empresa) {
            total*=0.9;
            jPrecio.setText(String.valueOf(""+total+" €"));
            texto.setText("Incluye 10% de descuento para Empresas");           
        }else{
            jPrecio.setText(String.valueOf(""+total+" €"));
        }

        llenarTabla();

        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jComboBox1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        seguirComprando = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarro = new javax.swing.JTable();
        finalizarCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPrecio = new javax.swing.JTextField();
        texto = new javax.swing.JLabel();
        CateringCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 51, 255));
        label1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("CARRITO DE LA COMPRA");

        seguirComprando.setBackground(new java.awt.Color(51, 51, 255));
        seguirComprando.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seguirComprando.setForeground(new java.awt.Color(255, 255, 255));
        seguirComprando.setText("ATRÁS");
        seguirComprando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguirComprandoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(seguirComprando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(seguirComprando, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        label2.setText("Tus productos");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 260, -1));

        jTableCarro.setBackground(new java.awt.Color(204, 204, 204));
        jTableCarro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTableCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre del producto", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableCarro.setGridColor(new java.awt.Color(0, 0, 0));
        jTableCarro.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTableCarro.setSelectionForeground(new java.awt.Color(153, 153, 255));
        jScrollPane2.setViewportView(jTableCarro);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 780, 270));

        finalizarCompra.setBackground(new java.awt.Color(51, 51, 255));
        finalizarCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        finalizarCompra.setText("FINALIZAR LA COMPRA");
        finalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(finalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 250, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Precio Total:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, 30));

        jPrecio.setEditable(false);
        jPrecio.setBackground(new java.awt.Color(204, 255, 255));
        jPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(jPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 180, 30));

        texto.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 270, 30));

        CateringCheckBox.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        CateringCheckBox.setText("Catering");
        CateringCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CateringCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(CateringCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 150, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("(SOLO PARA EMPRESAS)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 240, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Numero Camareros:     (800$)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 170, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Numero Cocineros:      (1000$)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 180, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText(" Decoraciones:              (500$)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 170, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Espacio para el evento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 160, -1));

        jComboBox1.setBackground(new java.awt.Color(204, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En la misma Empresa (0$Ç)", "Espacio privado (1000$)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, 180, -1));

        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 180, -1));

        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 180, -1));

        jTextField3.setBackground(new java.awt.Color(204, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 820, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CateringCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CateringCheckBoxActionPerformed
        if (CateringCheckBox.isSelected()) {
    // Si el checkbox está seleccionado, muestra los componentes solo si el cliente es una empresa
           if (cliente instanceof Empresa) {
           jTextField1.setVisible(true);
           jTextField2.setVisible(true);
           jTextField3.setVisible(true);
           jComboBox1.setVisible(true);
        } else {
           jTextField1.setVisible(false);
           jTextField2.setVisible(false);
           jTextField3.setVisible(false);
           jComboBox1.setVisible(false);
          }
        } else {
    // Si el checkbox no esta seleccionado oculta los componentes con setVisible(false)
           jTextField1.setVisible(false);
           jTextField2.setVisible(false);
           jTextField3.setVisible(false);
           jComboBox1.setVisible(false);
        }

    }//GEN-LAST:event_CateringCheckBoxActionPerformed

    private void jPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrecioActionPerformed
        float sumaTotal = 0;

        for (Productos p : prodSel) {
            sumaTotal += p.getPRECIO();
        }


    }//GEN-LAST:event_jPrecioActionPerformed

    private void finalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarCompraActionPerformed
        almacenVentas alm = new almacenVentas();
        Venta venta = new Venta(cliente,restaurante, prodSel,total);
        alm.getVenta().add(new Venta(cliente,restaurante, prodSel, total));
        alm.EscribirFichero("src/main/java/data");
        ;

        finalizarCompra abrir = new finalizarCompra(venta, cliente);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_finalizarCompraActionPerformed

    private void seguirComprandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguirComprandoActionPerformed
        Pedidos abrir = new Pedidos(cliente);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_seguirComprandoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // Obtener la opción seleccionada en el JComboBox
        String opcion = jComboBox1.getSelectedItem().toString();

        // Verificar la opción seleccionada y actualizar el total
        if (opcion.equals("En la misma Empresa (0$)")) {
            // No se añade ningún costo adicional
        } else if (opcion.equals("Espacio privado (1000$)")) {
            total += (1000-(1000*0.1));
        }

        jPrecio.setText(String.valueOf("" + total + " €"));

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        // Obtener el número ingresado en el jTextField1
        String numeroTexto = jTextField1.getText();

        try {
            // Convertir el texto a un número entero
            int numero = Integer.parseInt(numeroTexto);

            // Realizar la multiplicación y actualizar el precio
            total += numero * (800-(800*0.1));
            jPrecio.setText(String.valueOf("" + total + " €"));

            // Limpiar el jTextField1 después de la operación
            jTextField1.setText("");
        } catch (NumberFormatException ex) {
            // Mostrar mensaje de error si no se puede convertir el texto a número
            JOptionPane.showMessageDialog(null, "Ingresa un número válido en el campo");
        }

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        String numeroTexto = jTextField2.getText();

        try {
            // Convertir el texto a un número entero
            int numero = Integer.parseInt(numeroTexto);

            // Realizar la multiplicación y actualizar el precio
            total += numero * (1000-(1000*0.1));
            jPrecio.setText(String.valueOf("" + total + " €"));

            // Limpiar el jTextField1 después de la operacion
            jTextField1.setText("");
        } catch (NumberFormatException ex) {
            // Mostrar mensaje de error si no se puede convertir el texto a número
            JOptionPane.showMessageDialog(null, "Ingresa un número válido en el campo");
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        String numeroTexto = jTextField3.getText();

        try {
            // Convertir el texto a un número entero
            int numero = Integer.parseInt(numeroTexto);

            // Realizar la multiplicación y actualizar el precio
            total += numero * (500-(500*0.1));
            jPrecio.setText(String.valueOf("" + total + " €"));

            // Limpiar el jTextField1 después de la operación
            jTextField1.setText("");
        } catch (NumberFormatException ex) {
            // Mostrar mensaje de error si no se puede convertir el texto a número
            JOptionPane.showMessageDialog(null, "Ingresa un número válido en el campo");
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void llenarTabla() {

        DefaultTableModel modeloDefault = new DefaultTableModel();
        String[] cabecera = new String[]{"Titulo", "Precio", "Cantidad"};
        modeloDefault.setColumnIdentifiers(cabecera);

        jTableCarro.setModel(modeloDefault);

        TableModel modeloDatos = jTableCarro.getModel();

        Object rowData[] = new Object[3];

        for (Productos p : prodSel) {
            rowData[0] = p.getTITULO();
            rowData[1] = p.getPRECIO();
            rowData[2] = p.getINGREDIENTES();

            modeloDefault.addRow(rowData);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CateringCheckBox;
    private javax.swing.JButton finalizarCompra;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPrecio;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarro;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton seguirComprando;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables

}
