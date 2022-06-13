package view;

import java.awt.Color;
import model.IJugadorModel;
import pojo.Jugador;
import pojo.Sound;
import pojo.Torneo;
import service.IJugadorService;
import service.JugadorServiceImpl;


public class DatosJugador extends javax.swing.JFrame {

    private int xMouse,yMouse;
    private Torneo torneo;
    private String idEquipo = "1";
    IJugadorService judadorS = new JugadorServiceImpl();
    /**
     * Creates new form Principal
     */
    public DatosJugador() {
        
        initComponents();
    }
    
    public DatosJugador(Torneo torneo) {
        this.torneo = torneo;
        initComponents();
    }
    
    public DatosJugador(Torneo torneo,String idEquipo) {
        
        initComponents();
        this.torneo = torneo;
        this.idEquipo = idEquipo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnDatosTorneo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDireccionJugador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreJugador = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnContinuar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTelefonoJugador = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroJugador = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(220, 221, 217));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(48, 76, 134));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 0, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove (2).png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 874, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 930, 40));

        jPanel2.setBackground(new java.awt.Color(48, 76, 134));

        logo.setBackground(new java.awt.Color(0, 204, 153));
        logo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iLogo.png"))); // NOI18N
        logo.setText("Torneos");

        btnDatosTorneo.setBackground(new java.awt.Color(48, 76, 134));

        jLabel3.setBackground(new java.awt.Color(245, 246, 243));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trophy.png"))); // NOI18N
        jLabel3.setText("Datos de jugadores");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDatosTorneoLayout = new javax.swing.GroupLayout(btnDatosTorneo);
        btnDatosTorneo.setLayout(btnDatosTorneoLayout);
        btnDatosTorneoLayout.setHorizontalGroup(
            btnDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDatosTorneoLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnDatosTorneoLayout.setVerticalGroup(
            btnDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDatosTorneoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDatosTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDatosTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 160, 570));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DIRECCIÓN");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        txtDireccionJugador.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionJugador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDireccionJugador.setForeground(new java.awt.Color(153, 153, 153));
        txtDireccionJugador.setText("Ingrese la dirección del jugador");
        txtDireccionJugador.setBorder(null);
        txtDireccionJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionJugadorMousePressed(evt);
            }
        });
        txtDireccionJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionJugadorActionPerformed(evt);
            }
        });
        background.add(txtDireccionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 350, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NOMBRE");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        txtNombreJugador.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreJugador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombreJugador.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreJugador.setText("Ingrese el nombre del jugador");
        txtNombreJugador.setBorder(null);
        txtNombreJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreJugadorMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreJugadorMousePressed(evt);
            }
        });
        txtNombreJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreJugadorActionPerformed(evt);
            }
        });
        background.add(txtNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 350, 30));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 350, 10));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 350, 10));

        btnContinuar.setBackground(new java.awt.Color(110, 120, 143));
        btnContinuar.setForeground(new java.awt.Color(0, 0, 0));
        btnContinuar.setText("continuar");
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        background.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TELÉFONO");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        txtTelefonoJugador.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoJugador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTelefonoJugador.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefonoJugador.setText("Ingrese el teléfono del jugador");
        txtTelefonoJugador.setBorder(null);
        txtTelefonoJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoJugadorMousePressed(evt);
            }
        });
        txtTelefonoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoJugadorActionPerformed(evt);
            }
        });
        background.add(txtTelefonoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 350, 30));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 350, 10));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NUMERO DE JUGADOR");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        txtNumeroJugador.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroJugador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNumeroJugador.setForeground(new java.awt.Color(153, 153, 153));
        txtNumeroJugador.setText("Ingrese el número con el que jugará");
        txtNumeroJugador.setBorder(null);
        txtNumeroJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroJugadorMousePressed(evt);
            }
        });
        txtNumeroJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroJugadorActionPerformed(evt);
            }
        });
        background.add(txtNumeroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 350, 30));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 350, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teamLogo.png"))); // NOI18N
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 350, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionJugadorActionPerformed

    private void txtNombreJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreJugadorActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtNombreJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreJugadorMouseClicked

    }//GEN-LAST:event_txtNombreJugadorMouseClicked

    private void txtNombreJugadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreJugadorMousePressed
        
        if (txtNombreJugador.getText().equals("Ingrese el nombre del jugador")) {
            
            txtNombreJugador.setText("");
            txtNombreJugador.setForeground(Color.black);
            
        }
        
        if (txtDireccionJugador.getText().isEmpty()) {
            
            txtDireccionJugador.setText("Ingrese la dirección del jugador");
            txtDireccionJugador.setForeground(Color.gray);
            
        }
        
        if (txtTelefonoJugador.getText().isEmpty()) {
            
            txtTelefonoJugador.setText("Ingrese el teléfono del jugador");
            txtTelefonoJugador.setForeground(Color.gray);
            
        }
        
        if (txtNumeroJugador.getText().isEmpty()) {
            
            txtNumeroJugador.setText("Ingrese el número con el que jugará");
            txtNumeroJugador.setForeground(Color.gray);
            
        }
        
        
    }//GEN-LAST:event_txtNombreJugadorMousePressed

    private void txtDireccionJugadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionJugadorMousePressed
        
        if (txtDireccionJugador.getText().equals("Ingrese la dirección del jugador")) {
            
            txtDireccionJugador.setText("");
            txtDireccionJugador.setForeground(Color.black);
            
        }
        
        if (txtNombreJugador.getText().isEmpty()) {
            
            txtNombreJugador.setText("Ingrese el nombre del jugador");
            txtNombreJugador.setForeground(Color.gray);
            
        }
        
        
        if (txtTelefonoJugador.getText().isEmpty()) {
            
            txtTelefonoJugador.setText("Ingrese el teléfono del jugador");
            txtTelefonoJugador.setForeground(Color.gray);
            
        }
        
        if (txtNumeroJugador.getText().isEmpty()) {
            
            txtNumeroJugador.setText("Ingrese el número con el que jugará");
            txtNumeroJugador.setForeground(Color.gray);
            
        }
        
    }//GEN-LAST:event_txtDireccionJugadorMousePressed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if( !txtNombreJugador.getText().equals("Ingrese el nombre del jugador") && !txtTelefonoJugador.getText().equals("Ingrese el teléfono del jugador") && !txtDireccionJugador.getText().equals("Ingrese la dirección del jugador") && !txtNumeroJugador.getText().equals("Ingrese el número con el que jugará") && !txtNumeroJugador.getText().isEmpty()){
        Sound.sucessfull();
        String idJugador = String.valueOf(torneo.getEquipos().get(idEquipo).getJugadores().size()+1);
        Jugador jugador = judadorS.crearJugador(idJugador, txtNombreJugador.getText(),Integer.parseInt(txtNumeroJugador.getText()) , txtDireccionJugador.getText(), txtTelefonoJugador.getText());
        
        
        torneo.getEquipos().get(idEquipo).setJugador(jugador);
        
        javax.swing.JOptionPane.showMessageDialog(this, "datos guardados");
        new DatosGeneral(torneo).setVisible(true);
        this.hide();
        } else{
            javax.swing.JOptionPane.showMessageDialog(this, "rellene los campos correctamente");
        }
        
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        btnDatosTorneo.setBackground(new Color(65,168,224));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        btnDatosTorneo.setBackground(new Color(48,76,134));
    }//GEN-LAST:event_jLabel3MouseExited

    private void txtTelefonoJugadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoJugadorMousePressed
        if (txtTelefonoJugador.getText().equals("Ingrese el teléfono del jugador")) {
            
            txtTelefonoJugador.setText("");
            txtTelefonoJugador.setForeground(Color.black);
            
        }
        
        if (txtNombreJugador.getText().isEmpty()) {
            
            txtNombreJugador.setText("Ingrese el nombre del jugador");
            txtNombreJugador.setForeground(Color.gray);
            
        }
        
        
        if (txtDireccionJugador.getText().isEmpty()) {
            
            txtDireccionJugador.setText("Ingrese la dirección del jugador");
            txtDireccionJugador.setForeground(Color.gray);
            
        }
        
        if (txtNumeroJugador.getText().isEmpty()) {
            
            txtNumeroJugador.setText("Ingrese el número con el que jugará");
            txtNumeroJugador.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtTelefonoJugadorMousePressed

    private void txtTelefonoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoJugadorActionPerformed

    private void txtNumeroJugadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroJugadorMousePressed
        if (txtNumeroJugador.getText().equals("Ingrese el número con el que jugará")) {
            
            txtNumeroJugador.setText("");
            txtNumeroJugador.setForeground(Color.black);
            
        }
        
        if (txtNombreJugador.getText().isEmpty()) {
            
            txtNombreJugador.setText("Ingrese el nombre del jugador");
            txtNombreJugador.setForeground(Color.gray);
            
        }
        
        
        if (txtDireccionJugador.getText().isEmpty()) {
            
            txtDireccionJugador.setText("Ingrese la dirección del jugador");
            txtDireccionJugador.setForeground(Color.gray);
            
        }
        
        if (txtTelefonoJugador.getText().isEmpty()) {
            
            txtTelefonoJugador.setText("Ingrese el teléfono del jugador");
            txtTelefonoJugador.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_txtNumeroJugadorMousePressed

    private void txtNumeroJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroJugadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JPanel btnDatosTorneo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtDireccionJugador;
    private javax.swing.JTextField txtNombreJugador;
    private javax.swing.JTextField txtNumeroJugador;
    private javax.swing.JTextField txtTelefonoJugador;
    // End of variables declaration//GEN-END:variables
}
