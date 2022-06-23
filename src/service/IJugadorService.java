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

import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

import pojo.Jugador;

public interface IJugadorService {

	public Jugador crearJugador(
                String id, String nombre, 
                int edad, String direccion, String telefono);
        
        public void mostrarJugadores(
                HashMap<String, Jugador> lista, 
                DefaultTableModel modelo, String nombreEquipo);
       
        

}