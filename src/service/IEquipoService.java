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

import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import pojo.Equipo;

public interface IEquipoService {

	public Equipo crearEquipo(String nombre, String id,String logo);
        public void mostrarEquipos(
                HashMap<String, Equipo> lista, DefaultTableModel modelo);

}
