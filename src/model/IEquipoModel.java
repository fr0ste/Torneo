/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: interface para el modelo de equipo.
 * 
 * 
 */
package model;

import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import pojo.Equipo;

public interface IEquipoModel {

	public Equipo crearEquipo(String nombre, String id,String logo);
        
        public void eliminarEquipo(HashMap<String, Equipo> lista, String id);
        public void mostrarEquipo(
                HashMap<String, Equipo> lista, DefaultTableModel modelo);

}



