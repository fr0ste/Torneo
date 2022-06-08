/* Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 09/05/2022
 * 
 * Descripción:
 * 	El programa cuenta con estas opciones:
 *		1.- crear torneos donde es necesario un minimo de 
 *			dos equipos, en la cual cada equipo necisita un minimo
 *			de 5 jugadores y un maximo de 10.
 *			El maximo de equipos es 5.
 *		2.- Dar de alta a un equipo
 *		3.- Ver tabla de juegos
 *		4.- listar todos los equipos
 *			con sus respectivos jugadores.
 *		
 *  
 * 
 * 
 */

package view;

import java.util.Scanner;

import pojo.Torneo;
import service.ITorneoService;
import service.TorneoServiceImpl;

public class main {

	public static void main(String[] args) {

		

		ITorneoService torneoService = new TorneoServiceImpl();
		int opc = 0;
		int opc2 = 0;
		boolean salir = false;
		boolean salir2 = false;


		new DatosInicio().setVisible(true);
                
                

        }

}
