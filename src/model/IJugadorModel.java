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

import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import pojo.Equipo;

import pojo.Jugador;

public interface IJugadorModel {

	public void crearJugador(
                HashMap<String, Jugador> lista, Jugador jugador);

	public Jugador crearJugador(
                String id, String nombre, int edad, String direccion, String telefono);
        
        public void eliminarJugador(
                HashMap<String, Equipo> lista, String id);
        
        public void mostrarJugadores(HashMap<String, Jugador> lista, DefaultTableModel modelo, String nombreEquipo);

	
}
