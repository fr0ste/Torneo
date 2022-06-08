/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: interface con todos los servicios disponibles para un torneo   
 * 
 * 
 */

package service;

import java.util.Hashtable;

import pojo.Equipo;
import pojo.Grafica;
import pojo.Jugador;
import pojo.Torneo;

public interface ITorneoService {

	public Torneo crearTorneo(String nombreTorneo, String categoria);

	public void guardarEquipo(Hashtable<String, Equipo> lista, Equipo equipo);

	public void eliminarEquipo(Hashtable<String, Equipo> lista, String idEquipo);

	public void actualizarEquipo(Hashtable<String, Equipo> lista, Equipo equipo);

	public Jugador obtenerUnEquipo(Hashtable<String, Equipo> lista, String idEquipo);

}
