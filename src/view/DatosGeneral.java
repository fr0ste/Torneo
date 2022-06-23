/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creación: 20/06/2022
 * Fecha de modificación: 20/06/2022
 * 
 * Descripción: ventana con las principales opciones para la gestion del torneo.
 * 
 * 
 */

package view;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import pojo.Jugador;
import utilidades.Sound;
import pojo.Torneo;
import service.EquipoServiceImpl;
import service.IEquipoService;
import service.IJugadorService;
import service.ITorneoService;
import service.JugadorServiceImpl;
import service.TorneoServiceImpl;
import utilidades.Colors;
import utilidades.DefaultMsg;
import utilidades.Images;
import utilidades.validacion;

/**
 *
 * @autor fr0ste
 */
public class DatosGeneral extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private Torneo torneo;
    private ITorneoService torneoService;
    private IEquipoService equipoService;
    private DefaultTableModel modelTabla;
    private IJugadorService jugadorService;
    private String idEquipo = "";
    private boolean continuar;

    /**
     * constructor que recibe un torneo para la gestion del mismo
     * @param torneo 
     */
    public DatosGeneral(Torneo torneo) {

        this.torneo = torneo;
        initComponents();
        setLocationRelativeTo(null);

        //instanciamos los objetos y valores predeterminados
        modelTabla = (DefaultTableModel) tablaEquipos.getModel();
        torneoService = new TorneoServiceImpl();
        equipoService = new EquipoServiceImpl();
        jugadorService = new JugadorServiceImpl();
        txtNombreTorneo1.setText(torneo.getNombreTorneo());
        txtCategoria1.setText(torneo.getCategoria());
        btnAgregarJugador.setVisible(false);

    }

    /**
     * constructor por defecto
     */
    public DatosGeneral() {

        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPrincipal = new javax.swing.JPanel();
        barraSuperior = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        barraDeNavegacion = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnInicio = new javax.swing.JPanel();
        jLblBtnInicio = new javax.swing.JLabel();
        btnDatosTorneo = new javax.swing.JPanel();
        jLblBtnDatosTorneo = new javax.swing.JLabel();
        btnDatosEquipo = new javax.swing.JPanel();
        jLblBtnDatosEquipo = new javax.swing.JLabel();
        btnDatosJugadores = new javax.swing.JPanel();
        jLblBtnDatosJugadores = new javax.swing.JLabel();
        btnTablaEncuentro = new javax.swing.JPanel();
        jLblBtnTablaEncuentros = new javax.swing.JLabel();
        contenedorVentanas = new javax.swing.JTabbedPane();
        ventnaInicio = new javax.swing.JPanel();
        informacionPrincipal = new javax.swing.JLabel();
        backgroundViewPrincipal = new javax.swing.JLabel();
        ventanaDatosTorneo = new javax.swing.JPanel();
        jlbNombreTorneo = new javax.swing.JLabel();
        txtNombreTorneo1 = new javax.swing.JTextField();
        jSeparatorNombre = new javax.swing.JSeparator();
        jlbCategoria = new javax.swing.JLabel();
        txtCategoria1 = new javax.swing.JTextField();
        jSeparatorCategoria = new javax.swing.JSeparator();
        logoVentanaInicio = new javax.swing.JLabel();
        ventanaGestionEquipos = new javax.swing.JPanel();
        bgEquipos = new javax.swing.JPanel();
        jScrollPaneEquipos = new javax.swing.JScrollPane();
        tablaEquipos = new javax.swing.JTable();
        btnAgregarEquipo = new javax.swing.JButton();
        ventanaGestionJugadores = new javax.swing.JPanel();
        backgroundEquipos = new javax.swing.JPanel();
        jScrollPaneJugadores = new javax.swing.JScrollPane();
        tablaJugadores = new javax.swing.JTable();
        jScrollPane2Equipos = new javax.swing.JScrollPane();
        tablaEquipos1 = new javax.swing.JTable();
        btnAgregarJugador = new javax.swing.JButton();
        txtInstrucciones = new javax.swing.JLabel();
        ventanaTablaEncuentros = new javax.swing.JPanel();
        jScrollNavegacionJornadas = new javax.swing.JScrollPane();
        bgEncuentros = new javax.swing.JPanel();
        ventanaAgregarJugador = new javax.swing.JPanel();
        btnContinuar = new javax.swing.JButton();
        separadorNumeroJugador = new javax.swing.JSeparator();
        txtNumeroJugador = new javax.swing.JTextField();
        jlblNumeroJugador = new javax.swing.JLabel();
        separadorTelefono = new javax.swing.JSeparator();
        txtTelefonoJugador = new javax.swing.JTextField();
        jlblTelefono = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtDireccionJugador = new javax.swing.JTextField();
        jlblDireccionJugador = new javax.swing.JLabel();
        separadorNombreJugador = new javax.swing.JSeparator();
        txtNombreJugador = new javax.swing.JTextField();
        jlblNombreJugador = new javax.swing.JLabel();
        logoEquipo = new javax.swing.JLabel();
        btnCancelarAltaJugador = new javax.swing.JLabel();
        ventanaAgregarEquipo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        txtNombreEquipo = new javax.swing.JTextField();
        separadorNombreEquipo = new javax.swing.JSeparator();
        btnContinuar1 = new javax.swing.JButton();
        logoVentanaEquipo = new javax.swing.JLabel();
        lblNombreEquipo = new javax.swing.JLabel();
        txtIngresarLogo = new javax.swing.JTextField();
        separadorLogoEquipo = new javax.swing.JSeparator();
        previsualizadorLogo = new javax.swing.JLabel();
        instruccionesAgregarEquipo = new javax.swing.JLabel();
        cargarImagenGenerica = new javax.swing.JLabel();
        cancelarAltaEquipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        backgroundPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSuperior.setBackground(new java.awt.Color(48, 76, 134));
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 0, 51));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 51));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorLayout.createSequentialGroup()
                .addGap(0, 764, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        backgroundPrincipal.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        barraDeNavegacion.setBackground(new java.awt.Color(48, 76, 134));
        barraDeNavegacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iLogo.png"))); // NOI18N
        logo.setText("Torneos");
        barraDeNavegacion.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, 160, -1));

        btnInicio.setBackground(new java.awt.Color(48, 76, 134));

        jLblBtnInicio.setBackground(new java.awt.Color(204, 204, 204));
        jLblBtnInicio.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLblBtnInicio.setForeground(new java.awt.Color(204, 204, 204));
        jLblBtnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLblBtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jLblBtnInicio.setText("Inicio");
        jLblBtnInicio.setToolTipText("");
        jLblBtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblBtnInicio.setMaximumSize(new java.awt.Dimension(30, 20));
        jLblBtnInicio.setMinimumSize(new java.awt.Dimension(30, 20));
        jLblBtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblBtnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblBtnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblBtnInicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblBtnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLblBtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barraDeNavegacion.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 30));

        btnDatosTorneo.setBackground(new java.awt.Color(48, 76, 134));

        jLblBtnDatosTorneo.setBackground(new java.awt.Color(204, 204, 204));
        jLblBtnDatosTorneo.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLblBtnDatosTorneo.setForeground(new java.awt.Color(204, 204, 204));
        jLblBtnDatosTorneo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLblBtnDatosTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trophy.png"))); // NOI18N
        jLblBtnDatosTorneo.setText("Datos del torneo");
        jLblBtnDatosTorneo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblBtnDatosTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblBtnDatosTorneoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblBtnDatosTorneoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblBtnDatosTorneoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDatosTorneoLayout = new javax.swing.GroupLayout(btnDatosTorneo);
        btnDatosTorneo.setLayout(btnDatosTorneoLayout);
        btnDatosTorneoLayout.setHorizontalGroup(
            btnDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDatosTorneoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblBtnDatosTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
        );
        btnDatosTorneoLayout.setVerticalGroup(
            btnDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDatosTorneoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLblBtnDatosTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barraDeNavegacion.add(btnDatosTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, 30));

        btnDatosEquipo.setBackground(new java.awt.Color(48, 76, 134));

        jLblBtnDatosEquipo.setBackground(new java.awt.Color(204, 204, 204));
        jLblBtnDatosEquipo.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLblBtnDatosEquipo.setForeground(new java.awt.Color(204, 204, 204));
        jLblBtnDatosEquipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLblBtnDatosEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team.png"))); // NOI18N
        jLblBtnDatosEquipo.setText("Datos de equipos");
        jLblBtnDatosEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblBtnDatosEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblBtnDatosEquipoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblBtnDatosEquipoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblBtnDatosEquipoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDatosEquipoLayout = new javax.swing.GroupLayout(btnDatosEquipo);
        btnDatosEquipo.setLayout(btnDatosEquipoLayout);
        btnDatosEquipoLayout.setHorizontalGroup(
            btnDatosEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDatosEquipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblBtnDatosEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
        );
        btnDatosEquipoLayout.setVerticalGroup(
            btnDatosEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDatosEquipoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLblBtnDatosEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barraDeNavegacion.add(btnDatosEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 160, 30));

        btnDatosJugadores.setBackground(new java.awt.Color(48, 76, 134));

        jLblBtnDatosJugadores.setBackground(new java.awt.Color(204, 204, 204));
        jLblBtnDatosJugadores.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLblBtnDatosJugadores.setForeground(new java.awt.Color(204, 204, 204));
        jLblBtnDatosJugadores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLblBtnDatosJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        jLblBtnDatosJugadores.setText("Datos de jugadores");
        jLblBtnDatosJugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblBtnDatosJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblBtnDatosJugadoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblBtnDatosJugadoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblBtnDatosJugadoresMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDatosJugadoresLayout = new javax.swing.GroupLayout(btnDatosJugadores);
        btnDatosJugadores.setLayout(btnDatosJugadoresLayout);
        btnDatosJugadoresLayout.setHorizontalGroup(
            btnDatosJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDatosJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblBtnDatosJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
        );
        btnDatosJugadoresLayout.setVerticalGroup(
            btnDatosJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDatosJugadoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLblBtnDatosJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barraDeNavegacion.add(btnDatosJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, 30));

        btnTablaEncuentro.setBackground(new java.awt.Color(48, 76, 134));

        jLblBtnTablaEncuentros.setBackground(new java.awt.Color(204, 204, 204));
        jLblBtnTablaEncuentros.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLblBtnTablaEncuentros.setForeground(new java.awt.Color(204, 204, 204));
        jLblBtnTablaEncuentros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLblBtnTablaEncuentros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vs.png"))); // NOI18N
        jLblBtnTablaEncuentros.setText("Tabla de encuentros");
        jLblBtnTablaEncuentros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblBtnTablaEncuentros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblBtnTablaEncuentrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblBtnTablaEncuentrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblBtnTablaEncuentrosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnTablaEncuentroLayout = new javax.swing.GroupLayout(btnTablaEncuentro);
        btnTablaEncuentro.setLayout(btnTablaEncuentroLayout);
        btnTablaEncuentroLayout.setHorizontalGroup(
            btnTablaEncuentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTablaEncuentroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblBtnTablaEncuentros, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
        );
        btnTablaEncuentroLayout.setVerticalGroup(
            btnTablaEncuentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTablaEncuentroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLblBtnTablaEncuentros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barraDeNavegacion.add(btnTablaEncuentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 160, 30));

        backgroundPrincipal.add(barraDeNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 160, 610));

        contenedorVentanas.setBackground(new java.awt.Color(255, 255, 255));

        ventnaInicio.setBackground(new java.awt.Color(255, 255, 255));
        ventnaInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informacionPrincipal.setFont(new java.awt.Font("Roboto Black", 1, 25)); // NOI18N
        informacionPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        informacionPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        informacionPrincipal.setText("Gestione su torneo con la opciones de lado izquierdo");
        ventnaInicio.add(informacionPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 660, 110));

        backgroundViewPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundViewPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/playerLogo2.png"))); // NOI18N
        ventnaInicio.add(backgroundViewPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 610));

        contenedorVentanas.addTab("tab1", ventnaInicio);

        ventanaDatosTorneo.setBackground(new java.awt.Color(255, 255, 255));

        jlbNombreTorneo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jlbNombreTorneo.setForeground(new java.awt.Color(0, 0, 0));
        jlbNombreTorneo.setText("NOMBRE");

        txtNombreTorneo1.setEditable(false);
        txtNombreTorneo1.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreTorneo1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombreTorneo1.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreTorneo1.setText("Ingrese el nombre del torneo");
        txtNombreTorneo1.setBorder(null);

        jSeparatorNombre.setForeground(new java.awt.Color(153, 153, 153));

        jlbCategoria.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jlbCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jlbCategoria.setText("CATEGORÍA");

        txtCategoria1.setEditable(false);
        txtCategoria1.setBackground(new java.awt.Color(255, 255, 255));
        txtCategoria1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCategoria1.setForeground(new java.awt.Color(153, 153, 153));
        txtCategoria1.setText("Ingrese la categoria");
        txtCategoria1.setBorder(null);

        jSeparatorCategoria.setForeground(new java.awt.Color(153, 153, 153));

        logoVentanaInicio.setBackground(new java.awt.Color(255, 255, 255));
        logoVentanaInicio.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        logoVentanaInicio.setForeground(new java.awt.Color(0, 0, 0));
        logoVentanaInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iLogo.png"))); // NOI18N
        logoVentanaInicio.setText("TORNEOS");

        javax.swing.GroupLayout ventanaDatosTorneoLayout = new javax.swing.GroupLayout(ventanaDatosTorneo);
        ventanaDatosTorneo.setLayout(ventanaDatosTorneoLayout);
        ventanaDatosTorneoLayout.setHorizontalGroup(
            ventanaDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaDatosTorneoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ventanaDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaDatosTorneoLayout.createSequentialGroup()
                        .addGroup(ventanaDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCategoria)
                            .addGroup(ventanaDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(ventanaDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparatorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ventanaDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbNombreTorneo)
                                    .addComponent(txtNombreTorneo1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparatorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaDatosTorneoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoVentanaInicio)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        ventanaDatosTorneoLayout.setVerticalGroup(
            ventanaDatosTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaDatosTorneoLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jlbNombreTorneo)
                .addGap(26, 26, 26)
                .addComponent(txtNombreTorneo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparatorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(logoVentanaInicio)
                .addGap(57, 57, 57)
                .addComponent(jlbCategoria)
                .addGap(18, 18, 18)
                .addComponent(txtCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparatorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        contenedorVentanas.addTab("tab2", ventanaDatosTorneo);

        ventanaGestionEquipos.setBackground(new java.awt.Color(255, 255, 255));

        bgEquipos.setBackground(new java.awt.Color(255, 255, 255));
        bgEquipos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaEquipos.setBackground(new java.awt.Color(65, 168, 224));
        tablaEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneEquipos.setViewportView(tablaEquipos);

        bgEquipos.add(jScrollPaneEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 167, 660, 440));

        btnAgregarEquipo.setBackground(new java.awt.Color(65, 168, 224));
        btnAgregarEquipo.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarEquipo.setText("agregar");
        btnAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEquipoActionPerformed(evt);
            }
        });
        bgEquipos.add(btnAgregarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 20, -1, -1));

        javax.swing.GroupLayout ventanaGestionEquiposLayout = new javax.swing.GroupLayout(ventanaGestionEquipos);
        ventanaGestionEquipos.setLayout(ventanaGestionEquiposLayout);
        ventanaGestionEquiposLayout.setHorizontalGroup(
            ventanaGestionEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaGestionEquiposLayout.createSequentialGroup()
                .addComponent(bgEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ventanaGestionEquiposLayout.setVerticalGroup(
            ventanaGestionEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        contenedorVentanas.addTab("tab3", ventanaGestionEquipos);

        ventanaGestionJugadores.setBackground(new java.awt.Color(255, 255, 255));

        backgroundEquipos.setBackground(new java.awt.Color(255, 255, 255));
        backgroundEquipos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadores.setBackground(new java.awt.Color(65, 168, 224));
        tablaJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "direccion", "telefono", "numero", "equipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaJugadores.setMinimumSize(new java.awt.Dimension(450, 80));
        jScrollPaneJugadores.setViewportView(tablaJugadores);

        backgroundEquipos.add(jScrollPaneJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 660, 400));

        tablaEquipos1.setBackground(new java.awt.Color(65, 168, 224));
        tablaEquipos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEquipos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEquipos1MouseClicked(evt);
            }
        });
        jScrollPane2Equipos.setViewportView(tablaEquipos1);

        backgroundEquipos.add(jScrollPane2Equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 660, 140));

        btnAgregarJugador.setBackground(new java.awt.Color(65, 168, 224));
        btnAgregarJugador.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarJugador.setText("agregar");
        btnAgregarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarJugadorActionPerformed(evt);
            }
        });
        backgroundEquipos.add(btnAgregarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        txtInstrucciones.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtInstrucciones.setForeground(new java.awt.Color(0, 0, 0));
        txtInstrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInstrucciones.setText("Seleccione un equipo para poder agregar jugadores");
        backgroundEquipos.add(txtInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 660, -1));

        javax.swing.GroupLayout ventanaGestionJugadoresLayout = new javax.swing.GroupLayout(ventanaGestionJugadores);
        ventanaGestionJugadores.setLayout(ventanaGestionJugadoresLayout);
        ventanaGestionJugadoresLayout.setHorizontalGroup(
            ventanaGestionJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaGestionJugadoresLayout.setVerticalGroup(
            ventanaGestionJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaGestionJugadoresLayout.createSequentialGroup()
                .addComponent(backgroundEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        contenedorVentanas.addTab("tab4", ventanaGestionJugadores);

        ventanaTablaEncuentros.setBackground(new java.awt.Color(255, 255, 255));
        ventanaTablaEncuentros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgEncuentros.setBackground(new java.awt.Color(255, 255, 255));
        bgEncuentros.setLayout(new java.awt.GridLayout(0, 3, 0, 30));
        jScrollNavegacionJornadas.setViewportView(bgEncuentros);

        ventanaTablaEncuentros.add(jScrollNavegacionJornadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 610));

        contenedorVentanas.addTab("tab5", ventanaTablaEncuentros);

        ventanaAgregarJugador.setBackground(new java.awt.Color(204, 204, 204));
        ventanaAgregarJugador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContinuar.setBackground(new java.awt.Color(65, 168, 224));
        btnContinuar.setForeground(new java.awt.Color(0, 0, 0));
        btnContinuar.setText("continuar");
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        ventanaAgregarJugador.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, 30));

        separadorNumeroJugador.setForeground(new java.awt.Color(153, 153, 153));
        ventanaAgregarJugador.add(separadorNumeroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 280, 10));

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
        ventanaAgregarJugador.add(txtNumeroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 280, 30));

        jlblNumeroJugador.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jlblNumeroJugador.setForeground(new java.awt.Color(0, 0, 0));
        jlblNumeroJugador.setText("NÚMERO DE JUGADOR");
        ventanaAgregarJugador.add(jlblNumeroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        separadorTelefono.setForeground(new java.awt.Color(153, 153, 153));
        ventanaAgregarJugador.add(separadorTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 280, 10));

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
        ventanaAgregarJugador.add(txtTelefonoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 280, 30));

        jlblTelefono.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jlblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jlblTelefono.setText("TELÉFONO");
        ventanaAgregarJugador.add(jlblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 30));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        ventanaAgregarJugador.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 280, 10));

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
        ventanaAgregarJugador.add(txtDireccionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 280, 30));

        jlblDireccionJugador.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jlblDireccionJugador.setForeground(new java.awt.Color(0, 0, 0));
        jlblDireccionJugador.setText("DIRECCIÓN");
        ventanaAgregarJugador.add(jlblDireccionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        separadorNombreJugador.setForeground(new java.awt.Color(153, 153, 153));
        separadorNombreJugador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ventanaAgregarJugador.add(separadorNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 10));

        txtNombreJugador.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreJugador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombreJugador.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreJugador.setText("Ingrese el nombre del jugador");
        txtNombreJugador.setBorder(null);
        txtNombreJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreJugadorMousePressed(evt);
            }
        });
        ventanaAgregarJugador.add(txtNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 280, 30));

        jlblNombreJugador.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jlblNombreJugador.setForeground(new java.awt.Color(0, 0, 0));
        jlblNombreJugador.setText("NOMBRE");
        ventanaAgregarJugador.add(jlblNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        logoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teamLogo.png"))); // NOI18N
        ventanaAgregarJugador.add(logoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 350, -1));

        btnCancelarAltaJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo (2).png"))); // NOI18N
        btnCancelarAltaJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarAltaJugadorMouseClicked(evt);
            }
        });
        ventanaAgregarJugador.add(btnCancelarAltaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        contenedorVentanas.addTab("tab6", ventanaAgregarJugador);

        ventanaAgregarEquipo.setBackground(new java.awt.Color(204, 204, 204));
        ventanaAgregarEquipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 0, 0));
        lblLogo.setText("LOGO DEL EQUIPO");
        ventanaAgregarEquipo.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        txtNombreEquipo.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreEquipo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombreEquipo.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreEquipo.setText("Ingrese el nombre del equipo");
        txtNombreEquipo.setBorder(null);
        txtNombreEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreEquipoMousePressed(evt);
            }
        });
        ventanaAgregarEquipo.add(txtNombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 280, 30));

        separadorNombreEquipo.setForeground(new java.awt.Color(153, 153, 153));
        separadorNombreEquipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ventanaAgregarEquipo.add(separadorNombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 280, 10));

        btnContinuar1.setBackground(new java.awt.Color(65, 168, 224));
        btnContinuar1.setForeground(new java.awt.Color(0, 0, 0));
        btnContinuar1.setText("continuar");
        btnContinuar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuar1ActionPerformed(evt);
            }
        });
        ventanaAgregarEquipo.add(btnContinuar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, 30));

        logoVentanaEquipo.setForeground(new java.awt.Color(0, 0, 0));
        logoVentanaEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teamLogo.png"))); // NOI18N
        ventanaAgregarEquipo.add(logoVentanaEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 350, -1));

        lblNombreEquipo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblNombreEquipo.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreEquipo.setText("NOMBRE");
        ventanaAgregarEquipo.add(lblNombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txtIngresarLogo.setBackground(new java.awt.Color(255, 255, 255));
        txtIngresarLogo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIngresarLogo.setForeground(new java.awt.Color(153, 153, 153));
        txtIngresarLogo.setText("Click aqui para cargar su logo");
        txtIngresarLogo.setBorder(null);
        txtIngresarLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIngresarLogoMousePressed(evt);
            }
        });
        ventanaAgregarEquipo.add(txtIngresarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 280, 30));

        separadorLogoEquipo.setForeground(new java.awt.Color(153, 153, 153));
        separadorLogoEquipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ventanaAgregarEquipo.add(separadorLogoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 280, 10));
        ventanaAgregarEquipo.add(previsualizadorLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 70, 70));

        instruccionesAgregarEquipo.setBackground(new java.awt.Color(51, 51, 51));
        instruccionesAgregarEquipo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        instruccionesAgregarEquipo.setForeground(new java.awt.Color(51, 51, 51));
        instruccionesAgregarEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruccionesAgregarEquipo.setText("Ingrese los datos de su equipo");
        ventanaAgregarEquipo.add(instruccionesAgregarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 660, -1));

        cargarImagenGenerica.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cargarImagenGenerica.setForeground(new java.awt.Color(102, 102, 102));
        cargarImagenGenerica.setText("Click aqui para cargar una imagen generica.");
        cargarImagenGenerica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargarImagenGenerica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargarImagenGenericaMouseClicked(evt);
            }
        });
        ventanaAgregarEquipo.add(cargarImagenGenerica, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 290, 30));

        cancelarAltaEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo (2).png"))); // NOI18N
        cancelarAltaEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarAltaEquipoMouseClicked(evt);
            }
        });
        ventanaAgregarEquipo.add(cancelarAltaEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        contenedorVentanas.addTab("tab7", ventanaAgregarEquipo);

        backgroundPrincipal.add(contenedorVentanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 660, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * cambia a la ventana de gestion de equipos
     * @param evt 
     */
    private void jLblBtnDatosTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnDatosTorneoMouseClicked
        contenedorVentanas.setSelectedIndex(1);
    }//GEN-LAST:event_jLblBtnDatosTorneoMouseClicked

    /**
     * cambia a la ventana de gestion de jugadores
     * @param evt 
     */
    private void jLblBtnDatosEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnDatosEquipoMouseClicked

        modelTabla = (DefaultTableModel) tablaEquipos.getModel();
        equipoService.mostrarEquipos(torneo.getEquipos(), modelTabla);

        txtNombreEquipo.setText(DefaultMsg.IN_NOMBREEQUIPO);
        txtNombreEquipo.setForeground(Color.gray);
        txtIngresarLogo.setText(DefaultMsg.IN_LOGOEQUIPO);
        txtNombreEquipo.setForeground(Color.gray);
        previsualizadorLogo.setIcon(null);
        previsualizadorLogo.updateUI();

        contenedorVentanas.setSelectedIndex(2);


    }//GEN-LAST:event_jLblBtnDatosEquipoMouseClicked

    /**
     * cambia a la ventana de tabla de encuentros
     * @param evt 
     */
    private void jLblBtnTablaEncuentrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnTablaEncuentrosMouseClicked

        int a = torneo.getEquipos().size();
        if (a >= 2) {
            torneoService.Grafica(torneo, bgEncuentros);
        }
        bgEncuentros.updateUI();
        contenedorVentanas.setSelectedIndex(4);
    }//GEN-LAST:event_jLblBtnTablaEncuentrosMouseClicked
    
    /**
     * cierra el programa
     * @param evt 
     */
    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked

        System.exit(0);

    }//GEN-LAST:event_btnExitMouseClicked

    /**
     * permite el movimiento de la ventana por medio de la barra superior
     * @param evt 
     */
    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    /**
     * obtiene la posicion del mouse cuando se le da click a la barra superior
     * @param evt 
     */
    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    /**
     * cambia de color el boton cuando el cursor pasa sobre el
     * @param evt 
     */
    private void jLblBtnDatosTorneoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnDatosTorneoMouseEntered
        Sound.mousePass();
        btnDatosTorneo.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_jLblBtnDatosTorneoMouseEntered

    /**
     *cambia de color el boton cuando el cursor pasa sobre el
     * @param evt 
     */
    private void jLblBtnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnInicioMouseEntered
        Sound.mousePass();
        btnInicio.setBackground(Colors.MOUSE_ENTERED);

    }//GEN-LAST:event_jLblBtnInicioMouseEntered

    /**
     *cambia de color el boton cuando el cursor pasa sale de el
     * @param evt 
     */
    private void jLblBtnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnInicioMouseExited
        btnInicio.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_jLblBtnInicioMouseExited

    /**
     * cambia de color el boton cuando el cursor pasa sale de el
     * @param evt 
     */
    private void jLblBtnDatosTorneoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnDatosTorneoMouseExited
        btnDatosTorneo.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_jLblBtnDatosTorneoMouseExited
    
    /**
     * cambia de color el boton cuando el cursor pasa sobre el
     * @param evt 
     */
    private void jLblBtnDatosEquipoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnDatosEquipoMouseEntered
        Sound.mousePass();
        btnDatosEquipo.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_jLblBtnDatosEquipoMouseEntered
    
    /**
     * cambia de color el boton cuando el cursor sale de el
     * @param evt 
     */
    private void jLblBtnDatosEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnDatosEquipoMouseExited
        btnDatosEquipo.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_jLblBtnDatosEquipoMouseExited
    
    /**
     * cambia de color el boton cuando el cursor pasa sobre de el
     * @param evt 
     */
    private void jLblBtnDatosJugadoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnDatosJugadoresMouseEntered
        Sound.mousePass();
        btnDatosJugadores.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_jLblBtnDatosJugadoresMouseEntered
    
    /**
     * cambia de color el boton cuando el cursor pasa sobre de el
     * @param evt 
     */
    private void jLblBtnDatosJugadoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnDatosJugadoresMouseExited
        btnDatosJugadores.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_jLblBtnDatosJugadoresMouseExited

    /**
     * cambia de color el boton cuando el cursor pasa sobre de el
     * @param evt 
     */
    private void jLblBtnTablaEncuentrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnTablaEncuentrosMouseEntered
        Sound.mousePass();
        btnTablaEncuentro.setBackground(Colors.MOUSE_ENTERED);
    }//GEN-LAST:event_jLblBtnTablaEncuentrosMouseEntered

    /**
     * cambia de color el boton cuando el cursor sale de el
     * @param evt 
     */
    private void jLblBtnTablaEncuentrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnTablaEncuentrosMouseExited
        btnTablaEncuentro.setBackground(Colors.MOUSE_EXITED);
    }//GEN-LAST:event_jLblBtnTablaEncuentrosMouseExited

    /**
     * nos envia a la ventana de inicio
     * @param evt 
     */
    private void jLblBtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnInicioMouseClicked
        contenedorVentanas.setSelectedIndex(0);
    }//GEN-LAST:event_jLblBtnInicioMouseClicked

    /**
     * cambiamos a la ventana de alta de equipos
     * @param evt 
     */
    private void btnAgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEquipoActionPerformed
        contenedorVentanas.setSelectedIndex(6);
        previsualizadorLogo.removeAll();
    }//GEN-LAST:event_btnAgregarEquipoActionPerformed

    /**
     * cambiamos a la ventana de alta de jugadores
     * @param evt 
     */
    private void jLblBtnDatosJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblBtnDatosJugadoresMouseClicked
        modelTabla = (DefaultTableModel) tablaEquipos1.getModel();
        equipoService.mostrarEquipos(torneo.getEquipos(), modelTabla);

        modelTabla = (DefaultTableModel) tablaJugadores.getModel();
        if (!idEquipo.isEmpty()) {

            jugadorService.mostrarJugadores(
                    torneo.getEquipos().get(idEquipo).getJugadores(),
                    modelTabla, idEquipo);
        }

        txtNumeroJugador.setText(DefaultMsg.IN_NUMEROJUGADOR);
        txtNombreJugador.setText("Ingrese el nombre del jugador");
        txtTelefonoJugador.setText("Ingrese el teléfono del jugador");
        txtDireccionJugador.setText("Ingrese la dirección del jugador");

        txtNumeroJugador.setForeground(Color.gray);
        txtNombreJugador.setForeground(Color.gray);
        txtTelefonoJugador.setForeground(Color.gray);
        txtDireccionJugador.setForeground(Color.gray);

        contenedorVentanas.setSelectedIndex(3);
    }//GEN-LAST:event_jLblBtnDatosJugadoresMouseClicked

    /**
     * cambiamos a la ventana de alta de jugadores
     * @param evt 
     */
    private void btnAgregarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarJugadorActionPerformed
        contenedorVentanas.setSelectedIndex(5);
    }//GEN-LAST:event_btnAgregarJugadorActionPerformed
    
    /**
     * obtenemos el id del equipo seleccionado en la tabla de equipos y
     * mostramos la lista de equipos asociado a los mismos.
     * @param evt 
     */
    private void tablaEquipos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquipos1MouseClicked
        idEquipo = tablaEquipos1.getValueAt(tablaEquipos1.getSelectedRow(), 0).toString();

        if (!idEquipo.isEmpty()) {
            btnAgregarJugador.setVisible(true);
            modelTabla = (DefaultTableModel) tablaJugadores.getModel();
            jugadorService.mostrarJugadores(
                    torneo.getEquipos().get(
                            idEquipo).getJugadores(), modelTabla, idEquipo);

        }
    }//GEN-LAST:event_tablaEquipos1MouseClicked

    /**
     * le da evento al campo de texto
     * @param evt 
     */
    private void txtNombreEquipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreEquipoMousePressed

        if (txtNombreEquipo.getText().equals("Ingrese el nombre del equipo")) {

            txtNombreEquipo.setText("");
            txtNombreEquipo.setForeground(Color.black);

        }

    }//GEN-LAST:event_txtNombreEquipoMousePressed

    /**
     * le da evento al boton continuar
     * @param evt 
     */
    private void btnContinuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuar1ActionPerformed
        continuar = false;

        if (!txtNombreEquipo.getText().equals("Ingrese el nombre del equipo")
                && !txtNombreEquipo.getText().isEmpty()
                && !txtIngresarLogo.getText().equals("Click aqui para cargar su logo")) {

            torneo.setEquipos(equipoService.crearEquipo(
                    txtNombreEquipo.getText(),
                    String.valueOf(torneo.getEquipos().size() + 1),
                    txtIngresarLogo.getText())); //fin set equipos

            continuar = true;

        } else {
            Sound.error();
            javax.swing.JOptionPane.showMessageDialog(this, "ingrese un nombre");
        }//fin if

        if (continuar) {
            Sound.sucessfull();

            //restablece los valores por defecto de los campos
            txtNombreEquipo.setText("Ingrese el nombre del equipo");
            txtNombreEquipo.setForeground(Color.gray);
            txtIngresarLogo.setText("Click aqui para cargar su logo");
            txtNombreEquipo.setForeground(Color.gray);
            previsualizadorLogo.setIcon(null);
            previsualizadorLogo.updateUI();
            contenedorVentanas.setSelectedIndex(2);
            equipoService.mostrarEquipos(torneo.getEquipos(), modelTabla);
        }
    }//GEN-LAST:event_btnContinuar1ActionPerformed

    /**
     * le da evento al boton continuar
     * @param evt 
     */
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (!txtNombreJugador.getText().equals(
                DefaultMsg.IN_NOMBREJUGADOR)
                && !txtTelefonoJugador.getText().equals(
                        DefaultMsg.IN_TELEFONOJUGADOR)
                && !txtDireccionJugador.getText().equals(
                        DefaultMsg.IN_DIRECCIONJUGADOR)
                && !txtNumeroJugador.getText().equals(
                        DefaultMsg.IN_NUMEROJUGADOR)
                && !txtNumeroJugador.getText().isEmpty()
                && validacion.isNumeric(txtNumeroJugador.getText())
                && validacion.isNumeric(txtTelefonoJugador.getText())) {
            //inicio if
            
            Sound.sucessfull();
            String idJugador = String.valueOf(torneo.getEquipos().get(idEquipo).getJugadores().size() + 1);
            Jugador jugador = jugadorService.crearJugador(idJugador, txtNombreJugador.getText(), Integer.parseInt(txtNumeroJugador.getText()), txtDireccionJugador.getText(), txtTelefonoJugador.getText());

            torneo.getEquipos().get(idEquipo).setJugador(jugador);
            javax.swing.JOptionPane.showMessageDialog(this, "datos guardados");
            txtNumeroJugador.setText("Ingrese el número con el que jugará");
            txtNombreJugador.setText("Ingrese el nombre del jugador");
            txtTelefonoJugador.setText("Ingrese el teléfono del jugador");
            txtDireccionJugador.setText("Ingrese la dirección del jugador");

            txtNumeroJugador.setForeground(Color.gray);
            txtNombreJugador.setForeground(Color.gray);
            txtTelefonoJugador.setForeground(Color.gray);
            txtDireccionJugador.setForeground(Color.gray);

            contenedorVentanas.setSelectedIndex(3);
            jugadorService.mostrarJugadores(torneo.getEquipos().get(idEquipo).getJugadores(), modelTabla, idEquipo);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "rellene los campos correctamente");
        }

    }//GEN-LAST:event_btnContinuarActionPerformed
    
    /**
     * le da evento al campo de texto
     * @param evt 
     */
    private void txtNumeroJugadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroJugadorMousePressed
        if (txtNumeroJugador.getText().equals("Ingrese el número con el que jugará")) {

            txtNumeroJugador.setText("");
            txtNumeroJugador.setForeground(Color.black);

        }

        if (txtNombreJugador.getText().isEmpty()) {

            txtNombreJugador.setText("Ingrese el nombre del jugador");
            txtTelefonoJugador.setText("Ingrese el teléfono del jugador");
            txtDireccionJugador.setText("Ingrese la dirección del jugador");
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

    /**
     * le da evento al campo de texto
     * @param evt 
     */
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

    /**
     * le da evento al campo de texto
     * @param evt 
     */
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

    /**
     * le da evento al campo de texto
     * @param evt 
     */
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

    /**
     * carga un logo para el equipo
     * @param evt 
     */
    private void txtIngresarLogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresarLogoMousePressed
        JFileChooser selectImage = new JFileChooser();
        String ruta;
        FileNameExtensionFilter filtroBusqueda = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        selectImage.setFileFilter(filtroBusqueda);

        int opcionSeleccionada = selectImage.showOpenDialog(this);

        if (opcionSeleccionada == JFileChooser.APPROVE_OPTION) {

            ruta = selectImage.getSelectedFile().getPath();
            txtIngresarLogo.setText(ruta);
            Image imagenSeleccionada = new ImageIcon(ruta).getImage();

            ImageIcon iconoEquipo = new ImageIcon(
                    imagenSeleccionada.getScaledInstance(previsualizadorLogo.getWidth(),
                            previsualizadorLogo.getHeight(), Image.SCALE_SMOOTH));

            previsualizadorLogo.setIcon(iconoEquipo);

        }
    }//GEN-LAST:event_txtIngresarLogoMousePressed

    /**
     * carga una imagen generica
     * @param evt 
     */
    private void cargarImagenGenericaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarImagenGenericaMouseClicked
        String ruta = Images.LOGOGENERICO;
        txtIngresarLogo.setText(ruta);
        Image imagenSeleccionada = new ImageIcon(ruta).getImage();

        ImageIcon iconoEquipo = new ImageIcon(
                imagenSeleccionada.getScaledInstance(previsualizadorLogo.getWidth(),
                        previsualizadorLogo.getHeight(), Image.SCALE_SMOOTH));

        previsualizadorLogo.setIcon(iconoEquipo);
    }//GEN-LAST:event_cargarImagenGenericaMouseClicked

    /**
     * boton para cancelar la alta de un jugador
     * @param evt 
     */
    private void btnCancelarAltaJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarAltaJugadorMouseClicked

        contenedorVentanas.setSelectedIndex(3);
        txtNumeroJugador.setText("Ingrese el número con el que jugará");
        txtNombreJugador.setText("Ingrese el nombre del jugador");
        txtTelefonoJugador.setText("Ingrese el teléfono del jugador");
        txtDireccionJugador.setText("Ingrese la dirección del jugador");

        txtNumeroJugador.setForeground(Color.gray);
        txtNombreJugador.setForeground(Color.gray);
        txtTelefonoJugador.setForeground(Color.gray);
        txtDireccionJugador.setForeground(Color.gray);
    }//GEN-LAST:event_btnCancelarAltaJugadorMouseClicked

    /**
     * boton para cancelar la alta de un equipo
     * @param evt 
     */
    private void cancelarAltaEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarAltaEquipoMouseClicked
        contenedorVentanas.setSelectedIndex(2);
        txtNombreEquipo.setText("Ingrese el nombre del equipo");
        txtNombreEquipo.setForeground(Color.gray);
        txtIngresarLogo.setText("Click aqui para cargar su logo");
        txtNombreEquipo.setForeground(Color.gray);
        previsualizadorLogo.setIcon(null);
        previsualizadorLogo.updateUI();
    }//GEN-LAST:event_cancelarAltaEquipoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundEquipos;
    private javax.swing.JPanel backgroundPrincipal;
    private javax.swing.JLabel backgroundViewPrincipal;
    private javax.swing.JPanel barraDeNavegacion;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JPanel bgEncuentros;
    private javax.swing.JPanel bgEquipos;
    private javax.swing.JButton btnAgregarEquipo;
    private javax.swing.JButton btnAgregarJugador;
    private javax.swing.JLabel btnCancelarAltaJugador;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnContinuar1;
    private javax.swing.JPanel btnDatosEquipo;
    private javax.swing.JPanel btnDatosJugadores;
    private javax.swing.JPanel btnDatosTorneo;
    private javax.swing.JLabel btnExit;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnTablaEncuentro;
    private javax.swing.JLabel cancelarAltaEquipo;
    private javax.swing.JLabel cargarImagenGenerica;
    private javax.swing.JTabbedPane contenedorVentanas;
    private javax.swing.JLabel informacionPrincipal;
    private javax.swing.JLabel instruccionesAgregarEquipo;
    private javax.swing.JLabel jLblBtnDatosEquipo;
    private javax.swing.JLabel jLblBtnDatosJugadores;
    private javax.swing.JLabel jLblBtnDatosTorneo;
    private javax.swing.JLabel jLblBtnInicio;
    private javax.swing.JLabel jLblBtnTablaEncuentros;
    private javax.swing.JScrollPane jScrollNavegacionJornadas;
    private javax.swing.JScrollPane jScrollPane2Equipos;
    private javax.swing.JScrollPane jScrollPaneEquipos;
    private javax.swing.JScrollPane jScrollPaneJugadores;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparatorCategoria;
    private javax.swing.JSeparator jSeparatorNombre;
    private javax.swing.JLabel jlbCategoria;
    private javax.swing.JLabel jlbNombreTorneo;
    private javax.swing.JLabel jlblDireccionJugador;
    private javax.swing.JLabel jlblNombreJugador;
    private javax.swing.JLabel jlblNumeroJugador;
    private javax.swing.JLabel jlblTelefono;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreEquipo;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoEquipo;
    private javax.swing.JLabel logoVentanaEquipo;
    private javax.swing.JLabel logoVentanaInicio;
    private javax.swing.JLabel previsualizadorLogo;
    private javax.swing.JSeparator separadorLogoEquipo;
    private javax.swing.JSeparator separadorNombreEquipo;
    private javax.swing.JSeparator separadorNombreJugador;
    private javax.swing.JSeparator separadorNumeroJugador;
    private javax.swing.JSeparator separadorTelefono;
    private javax.swing.JTable tablaEquipos;
    private javax.swing.JTable tablaEquipos1;
    private javax.swing.JTable tablaJugadores;
    private javax.swing.JTextField txtCategoria1;
    private javax.swing.JTextField txtDireccionJugador;
    private javax.swing.JTextField txtIngresarLogo;
    private javax.swing.JLabel txtInstrucciones;
    private javax.swing.JTextField txtNombreEquipo;
    private javax.swing.JTextField txtNombreJugador;
    private javax.swing.JTextField txtNombreTorneo1;
    private javax.swing.JTextField txtNumeroJugador;
    private javax.swing.JTextField txtTelefonoJugador;
    private javax.swing.JPanel ventanaAgregarEquipo;
    private javax.swing.JPanel ventanaAgregarJugador;
    private javax.swing.JPanel ventanaDatosTorneo;
    private javax.swing.JPanel ventanaGestionEquipos;
    private javax.swing.JPanel ventanaGestionJugadores;
    private javax.swing.JPanel ventanaTablaEncuentros;
    private javax.swing.JPanel ventnaInicio;
    // End of variables declaration//GEN-END:variables
}
