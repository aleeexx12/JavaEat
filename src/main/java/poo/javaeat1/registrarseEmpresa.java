/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.javaeat1;

import java.awt.Color;
import java.time.LocalDate;
import javaeat.TarjetaCredito;
import javaeat.almacenClienteParticularEmpresa;
import javax.swing.JOptionPane;
import poo.javaeat.Empresa;
import poo.javaeat.Particular;

/**
 *
 * @author alexv
 */
public class registrarseEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form registrarseEmpresa
     */
    public registrarseEmpresa() {
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

        jPanel1 = new javax.swing.JPanel();
        titulo = new java.awt.Label();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        direccion = new java.awt.Label();
        puerta = new java.awt.Label();
        Calle = new java.awt.Label();
        escribirCalle = new javax.swing.JTextField();
        registrarse = new javax.swing.JButton();
        escribirCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        escribirContraseña = new javax.swing.JTextField();
        telefono = new java.awt.Label();
        escribirTelefono = new javax.swing.JTextField();
        tarjetaCredito = new java.awt.Label();
        nombreTitular = new java.awt.Label();
        escribirNombreTitular = new javax.swing.JTextField();
        numero = new java.awt.Label();
        escribirNumero = new javax.swing.JTextField();
        fechaCaducidad = new java.awt.Label();
        escribirFechaCaducidad = new javax.swing.JTextField();
        codigoPostal = new java.awt.Label();
        escribirCodigoPostal = new javax.swing.JTextField();
        escribirPuerta = new javax.swing.JTextField();
        escribirCiudad = new javax.swing.JTextField();
        ciudad = new java.awt.Label();
        escribirWeb = new javax.swing.JTextField();
        escribirCif = new javax.swing.JTextField();
        texto = new javax.swing.JLabel();
        cif = new java.awt.Label();
        escribirNombre = new javax.swing.JTextField();
        nombre = new java.awt.Label();
        web = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setAlignment(java.awt.Label.CENTER);
        titulo.setBackground(new java.awt.Color(51, 51, 255));
        titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("REGISTRATE COMO EMPRESA");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 560, 117));

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
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 720, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        direccion.setBackground(new java.awt.Color(204, 204, 204));
        direccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        direccion.setText("DIRECCIÓN");
        jPanel2.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, 30));

        puerta.setBackground(new java.awt.Color(204, 204, 204));
        puerta.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        puerta.setText("Puerta");
        jPanel2.add(puerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 85, -1));

        Calle.setBackground(new java.awt.Color(204, 204, 204));
        Calle.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        Calle.setText("Calle");
        jPanel2.add(Calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 222, -1));

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
        jPanel2.add(escribirCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 222, -1));

        registrarse.setBackground(new java.awt.Color(51, 51, 255));
        registrarse.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        registrarse.setForeground(new java.awt.Color(255, 255, 255));
        registrarse.setText("REGISTRARSE");
        registrarse.setToolTipText("");
        registrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        jPanel2.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 531, 330, 80));

        escribirCorreo.setBackground(new java.awt.Color(204, 204, 204));
        escribirCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(escribirCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 220, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("CORREO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 70, 20));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("CLAVE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 70, -1));

        escribirContraseña.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(escribirContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 254, -1));

        telefono.setBackground(new java.awt.Color(204, 204, 204));
        telefono.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        telefono.setText("TELÉFONO");
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 130, -1));

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
        jPanel2.add(escribirTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 254, -1));

        tarjetaCredito.setBackground(new java.awt.Color(204, 204, 204));
        tarjetaCredito.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        tarjetaCredito.setText("TARJETA DE CRÉDITO");
        jPanel2.add(tarjetaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 210, 30));

        nombreTitular.setBackground(new java.awt.Color(204, 204, 204));
        nombreTitular.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        nombreTitular.setText("Nombre del titular");
        jPanel2.add(nombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 254, 20));

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
        jPanel2.add(escribirNombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 254, -1));

        numero.setBackground(new java.awt.Color(204, 204, 204));
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

        fechaCaducidad.setBackground(new java.awt.Color(204, 204, 204));
        fechaCaducidad.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        fechaCaducidad.setText("Fecha de caducidad");
        jPanel2.add(fechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 254, -1));

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
        jPanel2.add(escribirFechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 254, -1));

        codigoPostal.setBackground(new java.awt.Color(204, 204, 204));
        codigoPostal.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        codigoPostal.setText("Codigo postal");
        jPanel2.add(codigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 110, -1));

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
        jPanel2.add(escribirCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 110, -1));

        escribirPuerta.setBackground(new java.awt.Color(204, 204, 204));
        escribirPuerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirPuertaActionPerformed(evt);
            }
        });
        jPanel2.add(escribirPuerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 85, -1));

        escribirCiudad.setBackground(new java.awt.Color(204, 204, 204));
        escribirCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escribirCiudadKeyTyped(evt);
            }
        });
        jPanel2.add(escribirCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 222, -1));

        ciudad.setBackground(new java.awt.Color(204, 204, 204));
        ciudad.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        ciudad.setText("Ciudad");
        jPanel2.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 222, -1));

        escribirWeb.setBackground(new java.awt.Color(204, 204, 204));
        escribirWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirWebActionPerformed(evt);
            }
        });
        jPanel2.add(escribirWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 254, -1));

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
        jPanel2.add(escribirCif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 222, -1));

        texto.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 0, 0));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 260, 20));

        cif.setBackground(new java.awt.Color(204, 204, 204));
        cif.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cif.setText("CIF");
        jPanel2.add(cif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 30, -1));

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
        jPanel2.add(escribirNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 222, -1));

        nombre.setBackground(new java.awt.Color(204, 204, 204));
        nombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nombre.setText("NOMBRE");
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 33));

        web.setBackground(new java.awt.Color(204, 204, 204));
        web.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        web.setText("WEB");
        jPanel2.add(web, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 50, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 710, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escribirNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirNombreActionPerformed
        String txt = escribirNombre.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce el nombre de tu empresa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirNombreActionPerformed

    private void escribirCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirCalleActionPerformed
        String txt = escribirCalle.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce la calle donde se encuentra tu empresa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirCalleActionPerformed

    private void escribirNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirNumeroActionPerformed
        String txt = escribirNumero.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce el numero de tu empresa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirNumeroActionPerformed

    private void escribirPuertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirPuertaActionPerformed
        String txt = escribirPuerta.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce la puerta", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirPuertaActionPerformed

    private void escribirCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirCodigoPostalActionPerformed
        String txt = escribirCodigoPostal.getText();
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(this, "Introduce el codigo postal", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_escribirCodigoPostalActionPerformed

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
            alm.getListaEmpresa().add(new Empresa(escribirCorreo.getText(), escribirContraseña.getText(), escribirCif.getText(),
            escribirWeb.getText(), escribirNombre.getText(), direccionCompleta, escribirTelefono.getText(),  escribirNumero.getText(), 
            escribirNombreTitular.getText(), escribirFechaCaducidad.getText()));
            // tendras que cambiar la ruta a tu gusto
            alm.EscribirFichero("src/main/java/data", 2);

            Pagina_Principal abrir = new Pagina_Principal();
            abrir.setVisible(true);
            this.setVisible(false);
        } else {
            texto.setText("Datos erroneos");
        }
    }//GEN-LAST:event_registrarseActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Pagina_Principal abrir = new Pagina_Principal();
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

    private void escribirNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirNombreKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isLetter(teclaPulsada) && teclaPulsada != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_escribirNombreKeyTyped

    private void escribirCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirCalleKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isLetter(teclaPulsada) && teclaPulsada != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_escribirCalleKeyTyped

    private void escribirCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escribirCiudadKeyTyped
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isLetter(teclaPulsada) && teclaPulsada != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_escribirCiudadKeyTyped

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
                if (!Character.isDigit(teclaPulsada) && teclaPulsada != '-') {
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
    private java.awt.Label cif;
    private java.awt.Label ciudad;
    private java.awt.Label codigoPostal;
    private java.awt.Label direccion;
    private javax.swing.JTextField escribirCalle;
    private javax.swing.JTextField escribirCif;
    private javax.swing.JTextField escribirCiudad;
    private javax.swing.JTextField escribirCodigoPostal;
    private javax.swing.JTextField escribirContraseña;
    private javax.swing.JTextField escribirCorreo;
    private javax.swing.JTextField escribirFechaCaducidad;
    private javax.swing.JTextField escribirNombre;
    private javax.swing.JTextField escribirNombreTitular;
    private javax.swing.JTextField escribirNumero;
    private javax.swing.JTextField escribirPuerta;
    private javax.swing.JTextField escribirTelefono;
    private javax.swing.JTextField escribirWeb;
    private java.awt.Label fechaCaducidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label nombre;
    private java.awt.Label nombreTitular;
    private java.awt.Label numero;
    private java.awt.Label puerta;
    private javax.swing.JButton registrarse;
    private java.awt.Label tarjetaCredito;
    private java.awt.Label telefono;
    private javax.swing.JLabel texto;
    private java.awt.Label titulo;
    private java.awt.Label web;
    // End of variables declaration//GEN-END:variables
}
