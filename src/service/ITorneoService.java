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
import pojo.Torneo;

public interface ITorneoService {

	public Torneo crearTorneo();

	public void guardarTorneo(Hashtable<String, Equipo> lista, Torneo torneo);

	public void eliminarTorneo(Hashtable<String, Equipo> lista, String idTorneo);

	public void actualizarTorneo(Hashtable<String, Equipo> lista, Torneo torneo);

	public void agregarEquipo(Torneo torneo);

	public void Grafica(Torneo torneo);

}
