/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.javaeat1;

import java.awt.Color;
import javaeat.TarjetaCredito;
import javaeat.almacenClienteParticularEmpresa;
import javax.swing.JOptionPane;
import poo.javaeat.Empresa;
import poo.javaeat.Particular;
/**
 *
 * @author alexv
 */
public class registrarseParticular extends javax.swing.JFrame {

   
    public registrarseParticular() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        registraseParticular = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nombre = new java.awt.Label();
        escribirNombre = new javax.swing.JTextField();
        direccion = new java.awt.Label();
        Calle = new java.awt.Label();
        escribirCalle = new javax.swing.JTextField();
        puerta = new java.awt.Label();
        escribirPuerta = new javax.swing.JTextField();
        codigoPostal = new java.awt.Label();
        escribirCodigoPostal = new javax.swing.JTextField();
        ciudad = new java.awt.Label();
        escribirCiudad = new javax.swing.JTextField();
        tarjetaCredito = new java.awt.Label();
        nombreTitular = new java.awt.Label();
        escribirNombreTitular = new javax.swing.JTextField();
        numero = new java.awt.Label();
        escribirNumero = new javax.swing.JTextField();
        fechaCaducidad = new java.awt.Label();
        escribirFechaCaducidad = new javax.swing.JTextField();
        telefono = new java.awt.Label();
        escribirTelefono = new javax.swing.JTextField();
        cif = new java.awt.Label();
        escribirDni = new javax.swing.JTextField();
        registrase = new javax.swing.JButton();
        escribirCorreo = new javax.swing.JTextField();
        escribirContraseña = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registraseParticular.setBackground(new java.awt.Color(51, 51, 255));
        registraseParticular.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 51, 255));
        label1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("REGISTRARSE COMO PARTICULAR");
        registraseParticular.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 650, 114));
        label1.getAccessibleContext().setAccessibleName("REGISTRATE COMO PARTICULAR");

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
        registraseParticular.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        getContentPane().add(registraseParticular, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nombre.setText("NOMBRE");
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

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
        jPanel2.add(escribirNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 250, -1));

        direccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        direccion.setText("Dirección");
        jPanel2.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        Calle.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        Calle.setText("Calle");
        jPanel2.add(Calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        escribirCalle.setBackground(new java.awt.Color(204, 204, 204));
        escribirCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirCalleActionPerformed(evt);
            }
        });
        escribirCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirCalleKeyTyped(evt);
            }
        });
        jPanel2.add(escribirCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 250, -1));

        puerta.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        puerta.setText("Puerta");
        jPanel2.add(puerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        escribirPuerta.setBackground(new java.awt.Color(204, 204, 204));
        escribirPuerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirPuertaActionPerformed(evt);
            }
        });
        jPanel2.add(escribirPuerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 80, -1));

        codigoPostal.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        codigoPostal.setText("Codigo postal");
        jPanel2.add(codigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        escribirCodigoPostal.setBackground(new java.awt.Color(204, 204, 204));
        escribirCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirCodigoPostalActionPerformed(evt);
            }
        });
        escribirCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirCodigoPostalKeyTyped(evt);
            }
        });
        jPanel2.add(escribirCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 120, -1));

        ciudad.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        ciudad.setText("Ciudad");
        jPanel2.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 250, -1));

        escribirCiudad.setBackground(new java.awt.Color(204, 204, 204));
        escribirCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirCiudadActionPerformed(evt);
            }
        });
        escribirCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirCiudadKeyTyped(evt);
            }
        });
        jPanel2.add(escribirCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 250, -1));

        tarjetaCredito.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        tarjetaCredito.setText("Tarjeta de credito");
        jPanel2.add(tarjetaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 228, 30));

        nombreTitular.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        nombreTitular.setText("Nombre del titular");
        jPanel2.add(nombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 254, -1));

        escribirNombreTitular.setBackground(new java.awt.Color(204, 204, 204));
        escribirNombreTitular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirNombreTitularKeyTyped(evt);
            }
        });
        jPanel2.add(escribirNombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 254, -1));

        numero.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        numero.setText("Número");
        jPanel2.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 254, -1));

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
        jPanel2.add(escribirNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 254, -1));

        fechaCaducidad.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        fechaCaducidad.setText("Fecha de caducidad");
        jPanel2.add(fechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 254, -1));

        escribirFechaCaducidad.setBackground(new java.awt.Color(204, 204, 204));
        escribirFechaCaducidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                escribirFechaCaducidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirFechaCaducidadKeyTyped(evt);
            }
        });
        jPanel2.add(escribirFechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 254, -1));

        telefono.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        telefono.setText("TELÉFONO");
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 254, -1));

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
        jPanel2.add(escribirTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 254, -1));

        cif.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cif.setText("DNI");
        jPanel2.add(cif, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 222, -1));

        escribirDni.setBackground(new java.awt.Color(204, 204, 204));
        escribirDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirDniActionPerformed(evt);
            }
        });
        escribirDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirDniKeyTyped(evt);
            }
        });
        jPanel2.add(escribirDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, -1));

        registrase.setBackground(new java.awt.Color(51, 51, 255));
        registrase.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registrase.setForeground(new java.awt.Color(255, 255, 255));
        registrase.setText("REGISTRARSE");
        registrase.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraseActionPerformed(evt);
            }
        });
        jPanel2.add(registrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 290, 60));

        escribirCorreo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(escribirCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 240, -1));

        escribirContraseña.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(escribirContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 254, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("CORREO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 70, 20));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        texto.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 0, 0));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 260, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 720, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escribirCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirCalleActionPerformed
        String txt = escribirCalle.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce tu calle", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirCalleActionPerformed

    private void escribirPuertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirPuertaActionPerformed
        String txt = escribirPuerta.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce tu calle", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirPuertaActionPerformed

    private void escribirCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirCodigoPostalActionPerformed
        String txt = escribirCodigoPostal.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce tu codigo postal", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirCodigoPostalActionPerformed

    private void escribirNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirNumeroActionPerformed
        String txt = escribirNumero.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce el numero de tu tarjeta de credito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirNumeroActionPerformed

    private void escribirNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirNombreActionPerformed
        String txt = escribirNombre.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce tu nombre completo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirNombreActionPerformed

    private void escribirCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirCiudadActionPerformed
        String txt = escribirCiudad.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce tu ciudad", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirCiudadActionPerformed

    private void escribirDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirDniActionPerformed
        String txt = escribirDni.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce tu DNI", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirDniActionPerformed

    private void registraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraseActionPerformed
        boolean nombreC = false;
        boolean contrasenaC = false;
        boolean direccionC = false;
        boolean correoC = false;
        boolean telefonoC = false;
        boolean dniC = false;
        boolean titularC = false;
        boolean nTarjetaC = false;
        boolean caducidadC = false;

        almacenClienteParticularEmpresa alm = new almacenClienteParticularEmpresa();
        String direccionCompleta = escribirCalle.getText() + " " + escribirPuerta.getText() + " " + escribirCodigoPostal.getText() + " " + escribirCiudad.getText();

        if (escribirNombre.getText().length() != 0) {
            nombreC = true;
        }
        if (escribirContraseña.getText().length() != 0) {
            contrasenaC = true;
        }
        if (direccionCompleta.length() != 0) {
            direccionC = true;
        }
        if (escribirCorreo.getText().length() != 0) {
            correoC = true;
        }
        if (escribirTelefono.getText().length() == 9) {
            telefonoC = true;
        }
        if (escribirDni.getText().length() == 9) {
            dniC = true;
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

        if (nombreC && direccionC && contrasenaC && correoC && dniC && telefonoC && caducidadC && nTarjetaC && titularC) {
            alm.getListaParticulares().add(new Particular(escribirCorreo.getText(), escribirContraseña.getText(),
                    escribirDni.getText(), escribirNombre.getText(), direccionCompleta, escribirTelefono.getText(), escribirNumero.getText(), escribirNombreTitular.getText(), escribirFechaCaducidad.getText()));
            alm.EscribirFichero("src/main/java/data", 1);

            Pagina_Principal abrir = new Pagina_Principal();
            abrir.setVisible(true);
            this.setVisible(false);
        }else{
            texto.setText("los datos están mal o incompletos");
        }


    }//GEN-LAST:event_registraseActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Pagina_Principal abrir = new Pagina_Principal();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

    }//GEN-LAST:event_backActionPerformed

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(Color.gray);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(Color.blue);
    }//GEN-LAST:event_backMouseExited

    private void escribirTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirTelefonoActionPerformed
        String txt = (String) escribirTelefono.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce tu telefono", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_escribirTelefonoActionPerformed

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

    private void escribirCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirCiudadKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isLetter(teclaPulsada) && teclaPulsada != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_escribirCiudadKeyTyped

    private void escribirCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirCalleKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isLetter(teclaPulsada) && teclaPulsada != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_escribirCalleKeyTyped

    private void escribirTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirTelefonoKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (escribirTelefono.getText().length() >= 9) {
            evt.consume();
        }
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_escribirTelefonoKeyTyped

    private void escribirCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirCodigoPostalKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (escribirCodigoPostal.getText().length() >= 5) {
            evt.consume();
        }
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_escribirCodigoPostalKeyTyped

    private void escribirNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirNumeroKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (escribirNumero.getText().length() >= 16) {
            evt.consume();
        }
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
    }//GEN-LAST:event_escribirNumeroKeyTyped

    private void escribirDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirDniKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (escribirDni.getText().length() == 8) {
            if (Character.isLowerCase(teclaPulsada)) {
                evt.setKeyChar(Character.toUpperCase(teclaPulsada));

            }
            if (!Character.isLetter(teclaPulsada)) {
                evt.consume();
            }
        } else if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
        if (escribirDni.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_escribirDniKeyTyped

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Calle;
    private javax.swing.JButton back;
    private java.awt.Checkbox checkbox1;
    private java.awt.Label cif;
    private java.awt.Label ciudad;
    private java.awt.Label codigoPostal;
    private java.awt.Label direccion;
    private javax.swing.JTextField escribirCalle;
    private javax.swing.JTextField escribirCiudad;
    private javax.swing.JTextField escribirCodigoPostal;
    private javax.swing.JTextField escribirContraseña;
    private javax.swing.JTextField escribirCorreo;
    private javax.swing.JTextField escribirDni;
    private javax.swing.JTextField escribirFechaCaducidad;
    private javax.swing.JTextField escribirNombre;
    private javax.swing.JTextField escribirNombreTitular;
    private javax.swing.JTextField escribirNumero;
    private javax.swing.JTextField escribirPuerta;
    private javax.swing.JTextField escribirTelefono;
    private java.awt.Label fechaCaducidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label nombre;
    private java.awt.Label nombreTitular;
    private java.awt.Label numero;
    private java.awt.Label puerta;
    private javax.swing.JButton registrase;
    private javax.swing.JPanel registraseParticular;
    private java.awt.Label tarjetaCredito;
    private java.awt.Label telefono;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
