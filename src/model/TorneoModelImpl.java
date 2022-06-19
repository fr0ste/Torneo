/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: implementacion del modelo de torneo 
 * 
 * 
 */

package model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLabel;

import pojo.Equipo;
import pojo.Grafica;
import pojo.Jugador;
import pojo.Torneo;

public class TorneoModelImpl implements ITorneoModel {

	@Override
	public Torneo crearTorneo(String nombreTorneo, String categoria) {

		return new Torneo(nombreTorneo, categoria);
	}
        
        public void Grafica(Torneo torneo, JPanel label){
            label.removeAll();
            List<JLabel> encuentros;
            List<Equipo> equipos;
            equipos = new ArrayList<>(torneo.getEquipos().values());
            
            Grafica grafica =  new Grafica(equipos);
            encuentros = grafica.getGrafica();
                   
           for(int i =0; i<encuentros.size(); i++){
               
               label.add(encuentros.get(i));
           }
            
            
            
        }

	@Override
	public void guardarEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarEquipo(Hashtable<String, Equipo> lista, String idEquipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Jugador obtenerUnEquipo(Hashtable<String, Equipo> lista, String idEquipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
