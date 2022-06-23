/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 20/06/2022
 * Fecha de modificaci�n: 20/06/2022
 * 
 * Descripci�n: clase para generar las graficas.
 * 
 * 
 */

package utilidades;

import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import pojo.Equipo;

/**
 *
 * @autor fr0ste
 */
public class Grafica {
    
    
    private ArrayList<JLabel> encuentros = new ArrayList<>();
    private List<Equipo> equipos;
    private int rondas;
    private final String imagenVersus = Images.VERSUS;
    
    /**
     * constructor que recibe una lista de equipos 
     * @param equipos 
     */
    public Grafica(List<Equipo> equipos) {

        this.equipos = equipos;

    }
    
    /**
     * clase que devuelve una lista de jlabels con una tabla de enfrentamientos
     * pensado en tres columnas por lo que se recomienda usar un grid de tres
     * columnas para que se muestren correctamente.
     * @return
     */
    public ArrayList<JLabel> getGrafica() {

        if (!(this.equipos.size() % 2 == 0)) {

            Equipo equipoFantasma = new Equipo();
            equipoFantasma.setNombre("fantasma");
            this.equipos.add(equipoFantasma);
            rondas = equipos.size()-1;
        }else{
            rondas = equipos.size();
        }

        for (int i = 0; i < rondas; i++) {
            this.encuentros.add(new JLabel());
            JLabel jornada = new JLabel("\t\t\tJORNADA " + (i+1));
            jornada.setFont(new Font("roboto", 1, 18));
            jornada.setBounds(0, 50, 10, 30);
            encuentros.add(jornada);
            this.encuentros.add(new JLabel());
            this.guardarJornada(this.equipos);
            this.combinar(this.equipos);
            
        }
        return encuentros;
    }

    /**
     * realiza la combinacion de equipos de acuerdo al algoritmo de round robin
     * @param equipos 
     */
    public void combinar(List<Equipo> equipos) {
        Equipo buffer = equipos.get(equipos.size() - 1);

        for (int i = equipos.size() - 1; i > 1; i--) {
            equipos.set(i, equipos.get(i - 1));;
        }
        equipos.set(1, buffer);
    }

    /**
     * guarda las jornadas en la lista
     * @param equipos 
     */
    public void guardarJornada(List<Equipo> equipos) {
        for (int i = 0, j = equipos.size() - 1; i < j; i++, j--) {
            JLabel equipo1;
            JLabel equipo2;
            JLabel vs;

            if (equipos.get(j).getNombre().equals("fantasma")) {
                equipo1 = new JLabel();
                Image imagenSeleccionada = new ImageIcon(equipos.get(i).
                        getLogoRuta()).getImage();

                ImageIcon iconoEquipo = new ImageIcon(
                        imagenSeleccionada.getScaledInstance(100,
                                100, Image.SCALE_SMOOTH));
                equipo1.setIcon(iconoEquipo);
                equipo1.setText(equipos.get(i).getNombre());

                this.encuentros.add(equipo1);
                this.encuentros.add(new JLabel(""));
                this.encuentros.add(new JLabel("descansa"));
                
                
            } else if (equipos.get(i).getNombre().equals("fantasma")) {
                equipo1 = new JLabel();
                Image imagenSeleccionada = new ImageIcon(equipos.get(j).getLogoRuta()).getImage();

                ImageIcon iconoEquipo = new ImageIcon(imagenSeleccionada.getScaledInstance(100,100, Image.SCALE_SMOOTH));
                equipo1.setIcon(iconoEquipo);
                equipo1.setText(equipos.get(j).getNombre());

                this.encuentros.add(equipo1);
                this.encuentros.add(new JLabel(""));
                this.encuentros.add(new JLabel("descansa"));
                
           
                
            } else {
                
                //datos del equipo 2
                //datos del equipo 1
                equipo1 = new JLabel();
                Image imagenSeleccionada = new ImageIcon(equipos.get(i).getLogoRuta()).getImage();

                ImageIcon iconoEquipo = new ImageIcon(imagenSeleccionada.getScaledInstance(100,100, Image.SCALE_SMOOTH));
                equipo1.setIcon(iconoEquipo);
                equipo1.setText(equipos.get(i).getNombre());
                
                 this.encuentros.add(equipo1);
                 
                 //agregar imagen del vs
                 vs = new JLabel();
                 Image imagenVs = new ImageIcon(imagenVersus).getImage();

                ImageIcon iconoVs = new ImageIcon(imagenVs.getScaledInstance(100,100, Image.SCALE_SMOOTH));
                vs.setIcon(iconoVs);
                this.encuentros.add(vs);
                
                //datos del equipo 2
                equipo2 = new JLabel();
                Image imagenSeleccionada2 = new ImageIcon(equipos.get(j).getLogoRuta()).getImage();

                ImageIcon iconoEquipo2 = new ImageIcon(imagenSeleccionada2.getScaledInstance(100,100, Image.SCALE_SMOOTH));
                equipo2.setIcon(iconoEquipo2);
                equipo2.setText(equipos.get(j).getNombre());
                
                this.encuentros.add(equipo2);
                
                
               
            }
        }
        
    }
}
