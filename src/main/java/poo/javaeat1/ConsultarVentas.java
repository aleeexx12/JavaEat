/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.javaeat1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javaeat.Productos;
import javaeat.Venta;
import javaeat.almacenClienteParticularEmpresa;
import javaeat.almacenVentas;
import javax.sql.RowSetMetaData;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import poo.javaeat.Cliente;
import poo.javaeat.Empresa;
import poo.javaeat.Particular;
/**
 *
 * @author alexv
 */
public class ConsultarVentas extends javax.swing.JFrame {

    private static DateTimeFormatter formatoESP = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public ConsultarVentas() {
        initComponents();
        almacenVentas alm = new almacenVentas();

        for (Venta venta : alm.getVenta()) {

            panelVentas.append("************************* Factura Producto *******************************");
            panelVentas.append("\n");
            panelVentas.append("-------------------------------- Fecha: " + LocalDateTime.now().format(formatoESP) + " -------------------------------");
            panelVentas.append("\n");
            panelVentas.append("----" +venta.getUsuario()+ "-----" );
            panelVentas.append("\n");
            int totalComidas = 0;
            for (Productos p : venta.getListaCompra()) {
                panelVentas.append("" + p.getTITULO() + "   " + p.getPRECIO() + "€");
                panelVentas.append("\n");
                totalComidas++;
            }
            panelVentas.append("\n");
            panelVentas.append("Total comidas compradas: " + totalComidas + ","); // Mostrar el número total de comidas compradas           
            panelVentas.append("Total:" + venta.getTotal() + "€");
            panelVentas.append("\n");
            panelVentas.append("----------------------------------------------------------------------------------");
            panelVentas.append("\n");

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelVentas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 51, 255));
        label1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("CONSULTA DE VENTAS");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 720, 130));

        back.setBackground(new java.awt.Color(51, 51, 255));
        back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back.setText("ATRÁS");
        back.setBorder(null);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 130));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 357, 142, 18));

        panelVentas.setColumns(20);
        panelVentas.setRows(5);
        jScrollPane1.setViewportView(panelVentas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 740, 360));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 830, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Admin abrir = new Admin();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTextArea panelVentas;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
