package view;

import java.awt.Color;
import javazoom.jlgui.basicplayer.BasicPlayer;
import utilidades.Sound;
import service.TorneoServiceImpl;
import utilidades.Colors;


public class DatosInicio extends javax.swing.JFrame {

    private int xMouse,yMouse;
    private BasicPlayer player = new BasicPlayer();
    private boolean continuar = false;
    
    /**
     * constructor de la ventana inicio
     */
    public DatosInicio() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        barraSuperior = new javax.swing.JLabel();
        logoContenedor = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnDatosTorneo = new javax.swing.JPanel();
        btnDatTorneo = new javax.swing.JLabel();
        logoEquipo = new javax.swing.JLabel();
        jlblCategoria = new javax.swing.JLabel();
        jlblNombreTorneo = new javax.swing.JLabel();
        txtNombreTorneo = new javax.swing.JTextField();
        jSeparatorCategoria = new javax.swing.JSeparator();
        jSeparatorNombreTorn = new javax.swing.JSeparator();
        btnContinuar = new javax.swing.JButton();
        categoriaOpc = new javax.swing.JComboBox<>();
        txtInstrucciones = new javax.swing.JLabel();

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

        barraSuperior.setBackground(new java.awt.Color(255, 0, 51));
        barraSuperior.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        barraSuperior.setForeground(new java.awt.Color(255, 51, 51));
        barraSuperior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barraSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove.png"))); // NOI18N
        barraSuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 860, Short.MAX_VALUE)
                .addComponent(barraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 930, 40));

        logoContenedor.setBackground(new java.awt.Color(48, 76, 134));

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iLogo.png"))); // NOI18N
        logo.setText("Torneos");

        btnDatosTorneo.setBackground(new java.awt.Color(48, 76, 134));

        btnDatTorneo.setBackground(new java.awt.Color(65, 168, 224));
        btnDatTorneo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnDatTorneo.setForeground(new java.awt.Color(255, 255, 255));
        btnDatTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDatTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trophy.png"))); // NOI18N
        btnDatTorneo.setText("Datos del torneo");
        btnDatTorneo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDatTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDatTorneoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDatTorneoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDatosTorneoLayout = new javax.swing.GroupLayout(btnDatosTorneo);
        btnDatosTorneo.setLayout(btnDatosTorneoLayout);
        btnDatosTorneoLayout.setHorizontalGroup(
            btnDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDatTorneo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnDatosTorneoLayout.setVerticalGroup(
            btnDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDatosTorneoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnDatTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout logoContenedorLayout = new javax.swing.GroupLayout(logoContenedor);
        logoContenedor.setLayout(logoContenedorLayout);
        logoContenedorLayout.setHorizontalGroup(
            logoContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDatosTorneo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
        );
        logoContenedorLayout.setVerticalGroup(
            logoContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoContenedorLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDatosTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        background.add(logoContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 160, 570));

        logoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teamLogo.png"))); // NOI18N
        background.add(logoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 350, 310));

        jlblCategoria.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jlblCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jlblCategoria.setText("CATEGORÍA");
        background.add(jlblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        jlblNombreTorneo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jlblNombreTorneo.setForeground(new java.awt.Color(0, 0, 0));
        jlblNombreTorneo.setText("NOMBRE DEL TORNEO");
        background.add(jlblNombreTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        txtNombreTorneo.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreTorneo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombreTorneo.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreTorneo.setText("Ingrese el nombre del torneo");
        txtNombreTorneo.setBorder(null);
        txtNombreTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreTorneoMousePressed(evt);
            }
        });
        background.add(txtNombreTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 350, 30));

        jSeparatorCategoria.setForeground(new java.awt.Color(153, 153, 153));
        background.add(jSeparatorCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 350, 10));

        jSeparatorNombreTorn.setForeground(new java.awt.Color(153, 153, 153));
        jSeparatorNombreTorn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        background.add(jSeparatorNombreTorn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 350, 10));

        btnContinuar.setBackground(new java.awt.Color(65, 168, 224));
        btnContinuar.setForeground(new java.awt.Color(0, 0, 0));
        btnContinuar.setText("continuar");
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        background.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, 30));

        categoriaOpc.setBackground(new java.awt.Color(255, 255, 255));
        categoriaOpc.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        categoriaOpc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Varonil", "Femenil" }));
        categoriaOpc.setToolTipText("");
        categoriaOpc.setBorder(null);
        categoriaOpc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                categoriaOpcMousePressed(evt);
            }
        });
        background.add(categoriaOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 401, 350, 30));

        txtInstrucciones.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        txtInstrucciones.setForeground(new java.awt.Color(51, 51, 51));
        txtInstrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInstrucciones.setText("Ingrese los siguientes datos para crear su torneo.");
        background.add(txtInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 66, 770, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * obtiene las coordenadas del cursor cuando se presiona sobre la barra
     * superior
     * @param evt 
     */
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed
    
    /**
     * le da evento a la barra superior cuando es arrastrada
     * @param evt 
     */
    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    /**
     * boton de salir
     * @param evt 
     */
    private void barraSuperiorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_barraSuperiorMouseClicked

    /**
     * le da evento al campo de texto
     * @param evt 
     */
    private void txtNombreTorneoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreTorneoMousePressed
        
        if (txtNombreTorneo.getText().equals("Ingrese el nombre del torneo")) {
            
            txtNombreTorneo.setText("");
            txtNombreTorneo.setForeground(Color.black);
            
        }
    }//GEN-LAST:event_txtNombreTorneoMousePressed

    /**
     * crea el torneo a partir de los datos ingresados
     * @param evt 
     */
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        
        if(!txtNombreTorneo.getText().equals("Ingrese el nombre del torneo") &&
                !txtNombreTorneo.getText().isEmpty()){
           
            continuar = true;
        }else{
            Sound.error();
            javax.swing.JOptionPane.showMessageDialog(this, "Rellene los campos");
        }
                     
        if(continuar){
            Sound.sucessfull();
            javax.swing.JOptionPane.showMessageDialog(
                    this, txtNombreTorneo.getText() +"\n"+ 
                            categoriaOpc.getSelectedItem().toString());
            new DatosGeneral(new TorneoServiceImpl().crearTorneo(
                    txtNombreTorneo.getText(), 
                    categoriaOpc.getSelectedItem().toString())).setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    /**
     * le da evento al componente cuado el mouse pasa sobre el
     * @param evt 
     */
    private void btnDatTorneoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatTorneoMouseEntered
        btnDatosTorneo.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_btnDatTorneoMouseEntered

    /**
     * le da evento al componente cuado el mouse sale de el
     * @param evt 
     */
    private void btnDatTorneoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatTorneoMouseExited
        btnDatosTorneo.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_btnDatTorneoMouseExited
    
    /**
     * le da evento al componente cuando se le da click
     * @param evt 
     */
    private void categoriaOpcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaOpcMousePressed
        btnContinuar.setForeground(Color.black);
    }//GEN-LAST:event_categoriaOpcMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel barraSuperior;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel btnDatTorneo;
    private javax.swing.JPanel btnDatosTorneo;
    private javax.swing.JComboBox<String> categoriaOpc;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparatorCategoria;
    private javax.swing.JSeparator jSeparatorNombreTorn;
    private javax.swing.JLabel jlblCategoria;
    private javax.swing.JLabel jlblNombreTorneo;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoContenedor;
    private javax.swing.JLabel logoEquipo;
    private javax.swing.JLabel txtInstrucciones;
    private javax.swing.JTextField txtNombreTorneo;
    // End of variables declaration//GEN-END:variables
}
