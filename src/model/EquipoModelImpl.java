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

import pojo.Equipo;

public class EquipoModelImpl implements IEquipoModel {

	@Override
	public Equipo crearEquipo(String nombre, String id) {

		return new Equipo(nombre, id);
	}

}
