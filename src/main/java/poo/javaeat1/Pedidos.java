/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.javaeat1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

import javaeat.Productos;
import javaeat.almacenProductos;
import javaeat.almacenRestaurantes;
import javaeat.Restaurante;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import poo.javaeat.Cliente;
/**
 *
 * @author alexv
 */
public class Pedidos extends javax.swing.JFrame {

    private ArrayList<Productos> prodSel;
    private ArrayList<Productos> productosFiltrados;
    private int posProsel;
    private TableRowSorter trsfiltro;
    Cliente cliente;
    

    public Pedidos(Cliente cliente) {
        initComponents();
        llenarTabla1();
        llenarTabla2();
        this.cliente = cliente;
        
        this.prodSel = new ArrayList<Productos>();

    }

    public void filtro() {
        trsfiltro.setRowFilter(RowFilter.regexFilter(busqueda.getText(), 0, 1, 2, 3, 4, 5, 6));
    }

    private void llenarTabla1() {
        almacenProductos alm = new almacenProductos();
    almacenRestaurantes almRes = new almacenRestaurantes();

    DefaultTableModel modeloDefault = new DefaultTableModel();
    String[] cabecera = new String[]{"TITULO", "INGREDIENTES", "PRECIO", "FOTO","RESTAURANTE"};
    modeloDefault.setColumnIdentifiers(cabecera);

    jTableProductos.setModel(modeloDefault);

    Object rowData[] = new Object[5];

    // Crear lista de nombres de restaurantes ---
    List<String> nombresRestaurantes = new ArrayList<>();
    for (Restaurante restaurante : almRes.getRestaurante()) {
        nombresRestaurantes.add(restaurante.getNombre());
    }

    for (Productos producto : alm.getProducto()) {
        rowData[0] = producto.getTITULO();
        rowData[1] = producto.getINGREDIENTES();
        rowData[2] = producto.getPRECIO();
        rowData[3] = producto.getFOTO();

        // Obtener el nombre del restaurante para el título de la comida
        String nombreRestaurante = obtenerNombreRestaurante(producto.getTITULO(), nombresRestaurantes);
        rowData[4] = nombreRestaurante;

        modeloDefault.addRow(rowData);
    }
}
    
    private void llenarTabla2(){
        
       almacenRestaurantes almRes = new almacenRestaurantes();

    DefaultTableModel modeloDefault = new DefaultTableModel();
    String[] cabecera = new String[]{"CIF", "Nombre", "Direccion", "Especialidad", "Calificacion", "gastosEnvio", "tiempomedioEnvio", "Catering"};
    modeloDefault.setColumnIdentifiers(cabecera);

    jTableRestaurante.setModel(modeloDefault);

    TableModel modeloDatos = jTableRestaurante.getModel();

    Object rowData[] = new Object[8];

    for (Restaurante r : almRes.getRestaurante()) {
        rowData[0] = r.getCif();
        rowData[1] = r.getNombre();
        rowData[2] = r.getDireccion();
        rowData[3] = r.getEspecialidad();
        rowData[4] = r.getCalificacion();
        rowData[5] = r.getGastosEnvio();
        rowData[6] = r.getTiempoMedioEnvio();
        rowData[7] = r.isCateringParaEmpresas();

        modeloDefault.addRow(rowData);
    }

    
    }

private String obtenerNombreRestaurante(String tituloComida, List<String> nombresRestaurantes) {
    // Buscar el nombre del restaurante que contenga el título de la comida
    for (String nombreRestaurante : nombresRestaurantes) {
        if (tituloComida.toLowerCase().contains(nombreRestaurante.toLowerCase())) {
            return nombreRestaurante;
        }
    }
    return "";
    }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        VerCompra = new javax.swing.JButton();
        AnadirCarro = new javax.swing.JButton();
        busqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        opinionACEPTAR = new javax.swing.JButton();
        opiniontxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        VerMasRestaurantesBOTON = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRestaurante = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableProductos.setBackground(new java.awt.Color(204, 255, 255));
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TITULO", "INGREDIENTES", "PRECIO", "FOTO",
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProductos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 840, 140));

        VerCompra.setBackground(new java.awt.Color(51, 51, 255));
        VerCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VerCompra.setForeground(new java.awt.Color(255, 255, 255));
        VerCompra.setText("VER COMPRA");
        VerCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCompraActionPerformed(evt);
            }
        });
        jPanel2.add(VerCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 510, 40));

        AnadirCarro.setBackground(new java.awt.Color(51, 51, 255));
        AnadirCarro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AnadirCarro.setForeground(new java.awt.Color(255, 255, 255));
        AnadirCarro.setText("AÑADIR AL CARRITO");
        AnadirCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirCarroActionPerformed(evt);
            }
        });
        jPanel2.add(AnadirCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 510, 40));

        busqueda.setBackground(new java.awt.Color(204, 255, 255));
        busqueda.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                busquedaKeyTyped(evt);
            }
        });
        jPanel2.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 320, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("BUSQUEDA DE COMIDA ESPECIFICA...");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 270, 30));

        opinionACEPTAR.setBackground(new java.awt.Color(51, 51, 255));
        opinionACEPTAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opinionACEPTAR.setForeground(new java.awt.Color(255, 255, 255));
        opinionACEPTAR.setText("Registrar Opinion");
        opinionACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opinionACEPTARActionPerformed(evt);
            }
        });
        jPanel2.add(opinionACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 190, 30));

        opiniontxt.setBackground(new java.awt.Color(204, 255, 255));
        opiniontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opiniontxtActionPerformed(evt);
            }
        });
        jPanel2.add(opiniontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 300, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Introduce una opinion a cerca de la comida:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 310, -1));

        VerMasRestaurantesBOTON.setBackground(new java.awt.Color(51, 153, 255));
        VerMasRestaurantesBOTON.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VerMasRestaurantesBOTON.setForeground(new java.awt.Color(255, 255, 255));
        VerMasRestaurantesBOTON.setText("VER LA INFORMACION DE LOS RESTAURANTE");
        VerMasRestaurantesBOTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMasRestaurantesBOTONActionPerformed(evt);
            }
        });
        jPanel2.add(VerMasRestaurantesBOTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 510, 30));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("MODIFICAR DATOS PERSONALES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 510, 30));
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -10, -1, -1));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));

        jTableRestaurante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableRestaurante);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 840, 150));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vergolinis", "Ochovo`s", "xokEAT`s", "La Brasserie" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 300, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 550));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("         PLATOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 35, 540, 40));

        jPanel6.setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 820, 110));

        jPanel7.setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void VerCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCompraActionPerformed
        CarritoCompra abrir = new CarritoCompra(prodSel, cliente);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VerCompraActionPerformed

    private void AnadirCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirCarroActionPerformed
        almacenProductos alm = new almacenProductos();
        prodSel.add(alm.getProducto().get(posProsel));

    }//GEN-LAST:event_AnadirCarroActionPerformed

    private void jTableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosMouseClicked
        posProsel = jTableProductos.getSelectedRow();

    }//GEN-LAST:event_jTableProductosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (cliente.getClass().getName().equals("poo.javaeat.Empresa")) {
            modificarEmpresa e = new modificarEmpresa(this.cliente);
            e.setVisible(true);
            this.setVisible(false);

        } else {
            modificarParticular p = new modificarParticular(this.cliente);
            p.setVisible(true);
            this.setVisible(false);

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    private void busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyTyped
        busqueda.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (busqueda.getText());
                busqueda.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsfiltro = new TableRowSorter(jTableProductos.getModel());
        jTableProductos.setRowSorter(trsfiltro);

    }//GEN-LAST:event_busquedaKeyTyped

    private void opinionACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opinionACEPTARActionPerformed
               String opinion = opiniontxt.getText();

    DefaultTableModel model = (DefaultTableModel) jTableRestaurante.getModel();
    int numRows = model.getRowCount();
    int numColumns = model.getColumnCount();
    int opinionColumnIndex = -1;
    for (int i = 0; i < numColumns; i++) {
        String columnName = model.getColumnName(i);
        if (columnName.equals("OPINION")) {
            opinionColumnIndex = i;
            break;
        }
    }

    if (opinionColumnIndex == -1) {
        model.addColumn("OPINION");
        opinionColumnIndex = numColumns;
    }

    int selectedRow = jComboBox1.getSelectedIndex();
    if (selectedRow >= 0 && selectedRow < numRows) {
        model.setValueAt(opinion, selectedRow, opinionColumnIndex);
    } else {
        Object[] rowData = new Object[numColumns];
        rowData[opinionColumnIndex] = opinion;
        model.addRow(rowData);

        String nuevoRestaurante = "Restaurante " + (numRows + 1);
        model.setValueAt(opinion, numRows, opinionColumnIndex);
        jComboBox1.addItem(nuevoRestaurante);
    }

    opiniontxt.setText("");
    }//GEN-LAST:event_opinionACEPTARActionPerformed

    private void opiniontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opiniontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opiniontxtActionPerformed

    private void VerMasRestaurantesBOTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMasRestaurantesBOTONActionPerformed
        seleccion_restaurante s_r = new seleccion_restaurante(cliente);
        s_r.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_VerMasRestaurantesBOTONActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnadirCarro;
    private javax.swing.JButton VerCompra;
    private javax.swing.JButton VerMasRestaurantesBOTON;
    private javax.swing.JTextField busqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTable jTableRestaurante;
    private javax.swing.JButton opinionACEPTAR;
    private javax.swing.JTextField opiniontxt;
    // End of variables declaration//GEN-END:variables
}
