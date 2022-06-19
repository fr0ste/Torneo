package pojo;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLabel;

/**
 *
 * @autor fr0ste
 */
public class Grafica {
    
    
    private ArrayList<JLabel> encuentros = new ArrayList<>();
    private List<Equipo> equipos;
    private int rondas;
    private final String imagenVersus= 
            "..\\Torneo\\src\\images\\vs-enfrentamientos.png";

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
            encuentros.add(new JLabel("\t\t\t\tJORNADA " + (i + 1)));
            this.encuentros.add(new JLabel());
            this.mostrar(this.equipos);
            this.combinar(this.equipos);
            
        }
        return encuentros;
    }

   

    public Grafica(List<Equipo> equipos) {

        this.equipos = equipos;

    }

    public void combinar(List<Equipo> equipos) {
        Equipo buffer = equipos.get(equipos.size() - 1);

        for (int i = equipos.size() - 1; i > 1; i--) {
            equipos.set(i, equipos.get(i - 1));;
        }
        equipos.set(1, buffer);
    }

    public void mostrar(List<Equipo> equipos) {
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
