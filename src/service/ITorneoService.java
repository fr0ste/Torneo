/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: interface con todos los servicios disponibles para un torneo   
 * 
 * 
 */

package service;
import javax.swing.JPanel;
import pojo.Torneo;

public interface ITorneoService {

	public Torneo crearTorneo(String nombreTorneo, String categoria);
        
        public void Grafica(Torneo torneo, JPanel label);

}
