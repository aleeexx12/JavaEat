/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.javaeat1;

import java.awt.Color;
import javaeat.almacenClienteParticularEmpresa;
import javax.swing.JOptionPane;
import poo.javaeat.Cliente;
import poo.javaeat.Empresa;
import poo.javaeat.Particular;

/**
 *
 * @author alexv
 */
public class modificarEmpresaAdmin extends javax.swing.JFrame {

    Cliente cliente;

    public modificarEmpresaAdmin(Cliente cliente) {
        initComponents();
        setVariables(cliente);
        this.cliente = cliente;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new java.awt.Label();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        direccion = new java.awt.Label();
        escribirDireccion = new javax.swing.JTextField();
        registrarse = new javax.swing.JButton();
        escribirCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        escribirContraseña = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        aux = new javax.swing.JTextArea();
        cif = new java.awt.Label();
        escribirCif = new javax.swing.JTextField();
        escribirFechaCaducidad = new javax.swing.JTextField();
        texto = new javax.swing.JLabel();
        escribirTelefono = new javax.swing.JTextField();
        escribirWeb = new javax.swing.JTextField();
        web = new java.awt.Label();
        telefono = new java.awt.Label();
        escribirNumero = new javax.swing.JTextField();
        escribirNombreTitular = new javax.swing.JTextField();
        nombreTitular = new java.awt.Label();
        numero = new java.awt.Label();
        fechaCaducidad = new java.awt.Label();
        tarjetaCredito = new java.awt.Label();
        escribirNombre = new javax.swing.JTextField();
        nombre = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setAlignment(java.awt.Label.CENTER);
        titulo.setBackground(new java.awt.Color(51, 51, 255));
        titulo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("MODIFICAR DATOS DE LA EMPRESA");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 650, 117));

        back.setBackground(new java.awt.Color(51, 51, 255));
        back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back.setText("ATRÁS");
        back.setBorder(null);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 719, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        direccion.setBackground(new java.awt.Color(204, 204, 204));
        direccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        direccion.setText("DIRECCIÓN");
        jPanel2.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 222, 30));

        escribirDireccion.setBackground(new java.awt.Color(204, 204, 204));
        escribirDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirDireccionActionPerformed(evt);
            }
        });
        jPanel2.add(escribirDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 222, -1));

        registrarse.setBackground(new java.awt.Color(51, 51, 255));
        registrarse.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        registrarse.setForeground(new java.awt.Color(255, 255, 255));
        registrarse.setText("MODIFICAR");
        registrarse.setToolTipText("");
        registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarseMousePressed(evt);
            }
        });
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        jPanel2.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 620, 80));

        escribirCorreo.setBackground(new java.awt.Color(204, 204, 204));
        escribirCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(escribirCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 220, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("CORREO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 70, 20));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        escribirContraseña.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(escribirContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 220, -1));

        aux.setColumns(20);
        aux.setRows(5);
        jScrollPane1.setViewportView(aux);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 1, 1));

        cif.setBackground(new java.awt.Color(204, 204, 204));
        cif.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cif.setText("CIF");
        jPanel2.add(cif, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 222, -1));

        escribirCif.setBackground(new java.awt.Color(204, 204, 204));
        escribirCif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirCifActionPerformed(evt);
            }
        });
        escribirCif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirCifKeyTyped(evt);
            }
        });
        jPanel2.add(escribirCif, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 222, -1));

        escribirFechaCaducidad.setBackground(new java.awt.Color(204, 204, 204));
        escribirFechaCaducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirFechaCaducidadActionPerformed(evt);
            }
        });
        escribirFechaCaducidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                escribirFechaCaducidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirFechaCaducidadKeyTyped(evt);
            }
        });
        jPanel2.add(escribirFechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 254, -1));

        texto.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 0, 0));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 260, 20));

        escribirTelefono.setBackground(new java.awt.Color(204, 204, 204));
        escribirTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirTelefonoActionPerformed(evt);
            }
        });
        escribirTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(escribirTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 254, -1));

        escribirWeb.setBackground(new java.awt.Color(204, 204, 204));
        escribirWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirWebActionPerformed(evt);
            }
        });
        jPanel2.add(escribirWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 254, -1));

        web.setBackground(new java.awt.Color(204, 204, 204));
        web.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        web.setText("WEB");
        jPanel2.add(web, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 254, -1));

        telefono.setBackground(new java.awt.Color(204, 204, 204));
        telefono.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        telefono.setText("TELÉFONO");
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 254, -1));

        escribirNumero.setBackground(new java.awt.Color(204, 204, 204));
        escribirNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirNumeroActionPerformed(evt);
            }
        });
        escribirNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirNumeroKeyTyped(evt);
            }
        });
        jPanel2.add(escribirNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 254, -1));

        escribirNombreTitular.setBackground(new java.awt.Color(204, 204, 204));
        escribirNombreTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirNombreTitularActionPerformed(evt);
            }
        });
        escribirNombreTitular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirNombreTitularKeyTyped(evt);
            }
        });
        jPanel2.add(escribirNombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 254, -1));

        nombreTitular.setBackground(new java.awt.Color(204, 204, 204));
        nombreTitular.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        nombreTitular.setText("Nombre del titular");
        jPanel2.add(nombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 254, -1));

        numero.setBackground(new java.awt.Color(204, 204, 204));
        numero.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        numero.setText("Número");
        jPanel2.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 254, -1));

        fechaCaducidad.setBackground(new java.awt.Color(204, 204, 204));
        fechaCaducidad.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        fechaCaducidad.setText("Fecha de caducidad");
        jPanel2.add(fechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 254, -1));

        tarjetaCredito.setBackground(new java.awt.Color(204, 204, 204));
        tarjetaCredito.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        tarjetaCredito.setText("TARJETA DE CRÉDITO");
        jPanel2.add(tarjetaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 228, 42));

        escribirNombre.setBackground(new java.awt.Color(204, 204, 204));
        escribirNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirNombreActionPerformed(evt);
            }
        });
        escribirNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirNombreKeyTyped(evt);
            }
        });
        jPanel2.add(escribirNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 222, -1));

        nombre.setBackground(new java.awt.Color(204, 204, 204));
        nombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nombre.setText("NOMBRE");
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 222, 33));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 680, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escribirNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirNombreActionPerformed
        String txt = escribirNombre.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce el nombre de tu empresa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirNombreActionPerformed

    private void escribirDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirDireccionActionPerformed
        String txt = escribirDireccion.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce la calle donde se encuentra tu empresa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirDireccionActionPerformed

    private void escribirNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirNumeroActionPerformed
        String txt = escribirNumero.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce el numero de tu empresa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirNumeroActionPerformed

    private void escribirNombreTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirNombreTitularActionPerformed
        String txt = escribirNombreTitular.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce el nombre del titular de la tarjeta de credito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirNombreTitularActionPerformed

    private void escribirFechaCaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirFechaCaducidadActionPerformed
        String txt = escribirFechaCaducidad.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce la fecha de caducidad de tu tarjeta de credito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirFechaCaducidadActionPerformed

    private void escribirTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirTelefonoActionPerformed
        String txt = escribirTelefono.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce un telefono movil", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirTelefonoActionPerformed

    private void escribirWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirWebActionPerformed
        String txt = escribirWeb.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce la web de tu empresa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirWebActionPerformed

    private void escribirCifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirCifActionPerformed
        String txt = escribirCif.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce el CIF de tu empresa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirCifActionPerformed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
       
    }//GEN-LAST:event_registrarseActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Admin abrir = new Admin();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(Color.gray);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(Color.red);
    }//GEN-LAST:event_backMouseExited

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void escribirCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escribirCorreoActionPerformed

    private void registrarseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMousePressed

        boolean nombreC = false;
        boolean contrasenaC = false;
        boolean direccionC = false;
        boolean correoC = false;
        boolean telefonoC = false;
        boolean cifC = false;
        boolean webC = false;
        boolean titularC = false;
        boolean nTarjetaC = false;
        boolean caducidadC = false;

        almacenClienteParticularEmpresa alm = new almacenClienteParticularEmpresa();

        if (escribirNombre.getText().length() != 0) {
            nombreC = true;
        }
        if (escribirContraseña.getText().length() != 0) {
            contrasenaC = true;
        }
        if (escribirDireccion.getText().length() != 0) {
            direccionC = true;
        }
        if (escribirCorreo.getText().length() != 0) {
            correoC = true;
        }
        if (escribirTelefono.getText().length() == 9) {
            telefonoC = true;
        }
        if (escribirCif.getText().length() == 10) {
            cifC = true;
        }
        if (escribirWeb.getText().length() != 0) {
            webC = true;
        }
        if (escribirNombreTitular.getText().length() != 0) {
            titularC = true;
        }
        if (escribirNumero.getText().length() == 16) {
            nTarjetaC = true;
        }
        if (escribirFechaCaducidad.getText().length() == 10) {
            caducidadC = true;
        }

        if (nombreC && direccionC && contrasenaC && correoC && cifC && webC && telefonoC && caducidadC && nTarjetaC && titularC) {

            Empresa e = new Empresa(escribirCorreo.getText(), escribirContraseña.getText(), escribirCif.getText(), escribirWeb.getText(), escribirNombre.getText(), escribirDireccion.getText(), escribirTelefono.getText(), escribirNumero.getText(), escribirNombreTitular.getText(), escribirFechaCaducidad.getText());
            
            for (Empresa empresa : alm.getListaEmpresa()) {

                if (empresa.getCorreo().equals(cliente.getCorreo()) && empresa.getContraseña().equals(cliente.getContraseña())) {
                    
                    alm.getListaEmpresa().remove(empresa);

                    alm.getListaEmpresa().add(e);
                }

                alm.EscribirFichero("src/main/java/data", 2);

                for (Cliente cli : alm.getListaClientes()) {
                    if (e.getCorreo().equals(cli.getCorreo()) && e.getContraseña().equals(cli.getContraseña())) {
                        
                        Admin abrir = new Admin();
                        abrir.setVisible(true);
                        this.setVisible(false);
                        
                        break;
                    }
                }
            }
        } else {
            texto.setText("Datos incorrectos");
        }
        
    }//GEN-LAST:event_registrarseMousePressed

    private void escribirNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirNombreKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isLetter(teclaPulsada) && teclaPulsada != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_escribirNombreKeyTyped

    private void escribirNombreTitularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirNombreTitularKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isLetter(teclaPulsada) && teclaPulsada != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_escribirNombreTitularKeyTyped

    private void escribirTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirTelefonoKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (escribirTelefono.getText().length() >= 9) {
            evt.consume();
        }
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_escribirTelefonoKeyTyped

    private void escribirNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirNumeroKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (escribirNumero.getText().length() >= 16) {
            evt.consume();
        }
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_escribirNumeroKeyTyped

    private void escribirCifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirCifKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (escribirCif.getText().length() == 9) {
            if (Character.isLowerCase(teclaPulsada)) {
                evt.setKeyChar(Character.toUpperCase(teclaPulsada));

            }
            if (!Character.isLetter(teclaPulsada)) {
                evt.consume();
            }
        } else if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
        if (escribirCif.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_escribirCifKeyTyped

    private void escribirFechaCaducidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirFechaCaducidadKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (escribirFechaCaducidad.getText().length() >= 10) {
            evt.consume();
        }
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_escribirFechaCaducidadKeyTyped

    private void escribirFechaCaducidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirFechaCaducidadKeyReleased
        char teclaPulsada = evt.getKeyChar();

        if (Character.isDigit(teclaPulsada))
            if (evt.getKeyCode() != java.awt.event.KeyEvent.VK_BACK_SPACE) {
                if (!Character.isDigit(teclaPulsada) && teclaPulsada != '/') {
                    evt.consume();
                }
                if (escribirFechaCaducidad.getText().length() == 4 || escribirFechaCaducidad.getText().length() == 7) {
                    escribirFechaCaducidad.setText(escribirFechaCaducidad.getText() + "-");
                }
            }
    }//GEN-LAST:event_escribirFechaCaducidadKeyReleased

    private void setVariables(Cliente c) {
        Empresa e;
        almacenClienteParticularEmpresa alm = new almacenClienteParticularEmpresa();
        for (Empresa empresa : alm.getListaEmpresa()) {

            if (empresa.getCorreo().equals(c.getCorreo()) && empresa.getContraseña().equals(c.getContraseña())) {
                e = empresa;

                escribirNombre.setText(e.getNombre());
                escribirContraseña.setText(e.getContraseña());
                escribirCorreo.setText(e.getCorreo());
                escribirTelefono.setText(e.getTelefono());
                escribirCif.setText(e.getCIF());
                escribirDireccion.setText(e.getDireccion());
                escribirWeb.setText(e.getWEB());
                escribirNombreTitular.setText(e.getTitularTj());
                escribirNumero.setText(e.getNumeroTj());
                escribirFechaCaducidad.setText(e.getFechaCad());
               
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aux;
    private javax.swing.JButton back;
    private java.awt.Label cif;
    private java.awt.Label direccion;
    private javax.swing.JTextField escribirCif;
    private javax.swing.JTextField escribirContraseña;
    private javax.swing.JTextField escribirCorreo;
    private javax.swing.JTextField escribirDireccion;
    private javax.swing.JTextField escribirFechaCaducidad;
    private javax.swing.JTextField escribirNombre;
    private javax.swing.JTextField escribirNombreTitular;
    private javax.swing.JTextField escribirNumero;
    private javax.swing.JTextField escribirTelefono;
    private javax.swing.JTextField escribirWeb;
    private java.awt.Label fechaCaducidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label nombre;
    private java.awt.Label nombreTitular;
    private java.awt.Label numero;
    private javax.swing.JButton registrarse;
    private java.awt.Label tarjetaCredito;
    private java.awt.Label telefono;
    private javax.swing.JLabel texto;
    private java.awt.Label titulo;
    private java.awt.Label web;
    // End of variables declaration//GEN-END:variables

}
