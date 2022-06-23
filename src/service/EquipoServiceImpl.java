/* Autor:Figueroa Martínez Joel Francisco
 * 
 *
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 09/05/2022
 * 
 *
 * Descripción: clase con todos los servicios disponibles para un equipo  
 * 
 * 
 */

package service;

import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import model.EquipoModelImpl;
import model.IEquipoModel;
import pojo.Equipo;

public class EquipoServiceImpl implements IEquipoService {

	IEquipoModel model = new EquipoModelImpl();
	IJugadorService jugadorService = new JugadorServiceImpl();

    @Override
    public Equipo crearEquipo(String nombre, String id,String logo) {
        return model.crearEquipo(nombre, id,logo);
        
    }

    @Override
    public void mostrarEquipos(
            HashMap<String, Equipo> lista, DefaultTableModel modelo) {
        model.mostrarEquipo(lista, modelo);
    }

	
}
