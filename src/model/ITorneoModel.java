/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: interface del modelo del torneo  
 * 
 * 
 */

package model;

import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JPanel;

import pojo.Equipo;
import pojo.Jugador;
import pojo.Torneo;

public interface ITorneoModel {

	public Torneo crearTorneo(String nombreTorneo, String categoria);

        public void Grafica(Torneo torneo, JPanel label);

}
