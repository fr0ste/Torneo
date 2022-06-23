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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import pojo.Equipo;
import pojo.Jugador;

public class JugadorModelImpl implements IJugadorModel {

	@Override
	public void crearJugador(
                HashMap<String, Jugador> lista, Jugador jugador) {
		lista.put(jugador.getId(), jugador);
	}
        
        @Override
	public Jugador crearJugador(
                String id, String nombre, int edad, String direccion,
                String telefono) {

		return new Jugador(id, nombre, edad, direccion, telefono);

	}

	public void eliminarJugador(HashMap<String, Equipo> lista, String id){
        
        lista.remove(id);
        }
        
	

    @Override
    public void mostrarJugadores(
            HashMap<String, Jugador> lista, 
            DefaultTableModel modelo, String nombreEquipo) {
        
        modelo.setRowCount(0);     
        
            
            ArrayList<Jugador> lJugador;
            lJugador = new ArrayList<>(lista.values());
            
            if(!lJugador.isEmpty()){
            
                for(int j=0;j<lJugador.size();j++){
                Object []fila = new Object[6]; // la dimensión corresponde a las
                                           //columnas
            
           fila[0] = lJugador.get(j).getId();
           fila[1] = lJugador.get(j).getNombre();
           fila[2] = lJugador.get(j).getDireccion();
            fila[3] =lJugador.get(j).getTelefono();
            fila[4] = lJugador.get(j).getEdad();
            fila[5] = nombreEquipo;
                           
           
            
            modelo.addRow(fila);
            }
        }
        
    }
        
    
}
