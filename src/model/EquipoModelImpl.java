/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: implementaciones para el modelo de equipo.
 * 
 * 
 */

package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import pojo.Equipo;

public class EquipoModelImpl implements IEquipoModel {

	@Override
	
    public Equipo crearEquipo(String nombre, String id, String logo) {

		return new Equipo(nombre, id, logo);
	}

        @Override
    public void eliminarEquipo(HashMap<String, Equipo> lista, String id){
        
        lista.remove(id);
        }    
    
        @Override
    public void mostrarEquipo(
            HashMap<String, Equipo> lista, DefaultTableModel modelo){
        modelo.setRowCount(0);
        
        ArrayList<Equipo> lEquipos = new ArrayList<>(lista.values());
        
        for (int i = 0; i < lista.size(); i++) {
            Object []fila = new Object[2]; // la dimensión corresponde a las
                                           //columnas
            
           fila[0] = lEquipos.get(i).getId();
           fila[1] = lEquipos.get(i).getNombre();
            
            modelo.addRow(fila);
        }
    }
    
}
    
