/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: clase con todos los servicios disponibles para un jugador  
 * 
 * 
 */

package service;

import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

import model.IJugadorModel;
import model.JugadorModelImpl;
import pojo.Jugador;

public class JugadorServiceImpl implements IJugadorService {
	IJugadorModel model = new JugadorModelImpl();
    

    @Override
    public Jugador crearJugador(
            String id, String nombre, int edad, String direccion, 
            String telefono) {
        return model.crearJugador(
                id, nombre, edad, direccion, telefono);
    }

    @Override
    public void mostrarJugadores(
            HashMap<String, Jugador> lista,
            DefaultTableModel modelo, String nombreEquipo) {
        model.mostrarJugadores(lista, modelo,nombreEquipo);
    }

	

}