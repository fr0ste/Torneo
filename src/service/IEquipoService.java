/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: interface con todos los servicios disponibles para un equipo  
 * 
 * 
 */

package service;

import java.util.Hashtable;
import java.util.List;

import pojo.Equipo;
import pojo.Jugador;

public interface IEquipoService {

	public Equipo crearEquipo(String id);

	public void guardarEquipo(Hashtable<String, Equipo> lista, Equipo equipo);

	public void eliminarEquipo(Hashtable<String, Equipo> lista, String idEquipo);

	public void actualizarEquipo(Hashtable<String, Equipo> lista, Equipo equipo);

	public Jugador obtenerUnEquipo(Hashtable<String, Equipo> lista, String idEquipo);

	public List<Jugador> obtenerTodosEquipo(Hashtable<String, Equipo> lista, Equipo equipo);

}
