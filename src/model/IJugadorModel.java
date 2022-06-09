/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: interface para el modelo del jugador 
 * 
 * 
 */

package model;

import java.util.Hashtable;
import javax.swing.table.DefaultTableModel;
import pojo.Equipo;

import pojo.Jugador;

public interface IJugadorModel {
	// CRUD 5 metodos, crear, eliminar, actualizar, leer 1 registro, leer todos los
	// registros
	// public Jugador crearJugador();

	public void crearJugador(Hashtable<String, Jugador> lista, Jugador jugador);

	public Jugador crearJugador(String id, String nombre, int edad, String direccion, String telefono);
        
        public void eliminarAlumno(Hashtable<String, Equipo> lista, String id);
        public void actualizarAlumno(Hashtable<String, Equipo> lista, Equipo equipo);
        public void mostrarJugadores(Hashtable<String, Equipo> lista, DefaultTableModel modelo);

	
}
