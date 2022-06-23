/* Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 09/05/2022
 * 
 * Descripción: clase con todos los servicios disponibles para un torneo  
 * 
 * 
 */

package service;

import java.util.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.ITorneoModel;
import model.TorneoModelImpl;
import pojo.Equipo;
import utilidades.Grafica;
import pojo.Jugador;
import pojo.Torneo;

public class TorneoServiceImpl implements ITorneoService {

	public static final int maxEquipos = 5;
	private ITorneoModel torneoModel = new TorneoModelImpl();
	private IEquipoService EquipoService = new EquipoServiceImpl();
        private Grafica grafica;

	public Torneo crearTorneo(String nombreTorneo, String categoria) {

		return torneoModel.crearTorneo(nombreTorneo, categoria);
	}

	public void Grafica(Torneo torneo, JPanel label) {
              
           torneoModel.Grafica(torneo, label);
	}

    @Override
    public void guardarEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarEquipo(Hashtable<String, Equipo> lista, String idEquipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizarEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Jugador obtenerUnEquipo(Hashtable<String, Equipo> lista, String idEquipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
