/* Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 09/05/2022
 * 
 * Descripción: clase con todos los servicios disponibles para un equipo  
 * 
 * 
 */

package service;

import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

import model.EquipoModelImpl;
import model.IEquipoModel;
import pojo.Equipo;
import pojo.Jugador;

public class EquipoServiceImpl implements IEquipoService {

	IEquipoModel model = new EquipoModelImpl();
	IJugadorService jugadorService = new JugadorServiceImpl();

    @Override
    public Equipo crearEquipo(String nombre, String id) {
        return model.crearEquipo(nombre, id);
        
    }

	
}
