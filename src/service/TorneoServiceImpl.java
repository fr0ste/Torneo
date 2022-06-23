/* Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 09/05/2022
 * 
 * Descripción: clase con todos los servicios disponibles para un torneo  
 * 
 * 
 */

package service;

import javax.swing.JPanel;
import model.ITorneoModel;
import model.TorneoModelImpl;
import utilidades.Grafica;
import pojo.Torneo;

public class TorneoServiceImpl implements ITorneoService {

	public static final int maxEquipos = 5;
	private final ITorneoModel torneoModel = new TorneoModelImpl();

        @Override
	public Torneo crearTorneo(String nombreTorneo, String categoria) {

		return torneoModel.crearTorneo(nombreTorneo, categoria);
	}

        @Override
	public void Grafica(Torneo torneo, JPanel label) {
              
           torneoModel.Grafica(torneo, label);
	}

}
