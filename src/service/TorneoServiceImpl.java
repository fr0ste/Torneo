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

import model.ITorneoModel;
import model.TorneoModelImpl;
import pojo.Equipo;
import pojo.Grafica;
import pojo.Jugador;
import pojo.Torneo;

public class TorneoServiceImpl implements ITorneoService {

	public static final int maxEquipos = 5;
	private ITorneoModel torneo = new TorneoModelImpl();
	private IEquipoService EquipoService = new EquipoServiceImpl();

	public Torneo crearTorneo(String nombreTorneo, String categoria) {

		return torneo.crearTorneo(nombreTorneo, categoria);
	}

	public void Grafica(Torneo torneo) {

		// Getting keySets of Hashtable and
		// storing it into Set
		Set<String> setOfKeys = torneo.getEquipos().keySet();

		// Creating an Iterator object to
		// iterate over the given Hashtable
		Iterator<String> itr = setOfKeys.iterator();
		String a = itr.next();

		int n = (int) (Integer.parseInt(a) - 2);

		System.out.println("\n\n");
		System.out.println("*-*-*-*-*-ENCUENTROS-*-*-*-*");
		System.out.println("\n\n");

		torneo.getEquipos().forEach(
				(key, value) -> System.out.println("id : " + key + "\tNombre del equipo : " + value.getNombre()));

		System.out.println("\n\n");
		System.out.println(Grafica.getGrafica(n));

		System.out.println("\n\n");

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
