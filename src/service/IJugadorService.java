/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: interface con todos los servicios disponibles para un jugador  
 * 
 * 
 */

package service;

import java.util.Hashtable;
import javax.swing.table.DefaultTableModel;
import pojo.Equipo;

import pojo.Jugador;

public interface IJugadorService {

	public void crearJugador(Hashtable<String, Jugador> lista, Jugador jugador);

	public Jugador crearJugador(String id, String nombre, int edad, String direccion, String telefono);

	public void eliminarJugador(Hashtable<String, Jugador> lista, String idJugador);

	public void actualizarJugador(Hashtable<String, Jugador> lista, Jugador jugador);

	public Jugador obtenerUnJugador(Hashtable<String, Jugador> lista, String idJugador);

	public Hashtable<String, Jugador> obtenerTodosJugador(Hashtable<String, Jugador> lista, Jugador jugador);
        
        public void mostrarJugadores(Hashtable<String, Jugador> lista, DefaultTableModel modelo, String nombreEquipo);
       
        

}

// public Jugador crearJugador();

/*
 * // CRUD 5 metodos, crear, eliminar, actualizar, leer 1 registro, leer todos
 * los registros
 * 
 * public List<Jugador> eliminarJugador(List<Jugador> lista, String idJugador);
 * public List<Jugador> actualizarJugador(List<Jugador> lista, Jugador jugador);
 * public Jugador obtenerUnJugador(List<Jugador> lista, String idJugador);
 * public List<Jugador> obtenerTodosJugador(List<Jugador> lista, Jugador
 * jugador);
 */
//}
