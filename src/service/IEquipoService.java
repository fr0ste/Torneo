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
import javax.swing.table.DefaultTableModel;

import pojo.Equipo;
import pojo.Jugador;

public interface IEquipoService {

	public Equipo crearEquipo(String nombre, String id,String logo);
         public void eliminarAlumno(Hashtable<String, Equipo> lista, String id);
        public void actualizarAlumno(Hashtable<String, Equipo> lista, Equipo equipo);
        public void mostrarEquipos(Hashtable<String, Equipo> lista, DefaultTableModel modelo);


}
