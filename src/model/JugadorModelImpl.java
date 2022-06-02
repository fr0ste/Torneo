/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: implementacion del modelo de jugador 
 * 
 * 
 */

package model;

import java.util.Hashtable;
import pojo.Jugador;

public class JugadorModelImpl implements IJugadorModel {

	@Override
	public void crearJugador(Hashtable<String, Jugador> lista, Jugador jugador) {
		lista.put(jugador.getId(), jugador);
	}

	@Override
	public void eliminarJugador(Hashtable<String, Jugador> lista, String idJugador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarJugador(Hashtable<String, Jugador> lista, Jugador jugador) {
		// TODO Auto-generated method stub

	}

	@Override
	public Jugador obtenerUnJugador(Hashtable<String, Jugador> lista, String idJugador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hashtable<String, Jugador> obtenerTodosJugador(Hashtable<String, Jugador> lista, Jugador jugador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jugador crearJugador(String id, String nombre, int edad, String direccion, String telefono) {

		return new Jugador(id, nombre, edad, direccion, telefono);

	}
}
