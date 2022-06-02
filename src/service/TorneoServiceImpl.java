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

import java.util.*;

import model.ITorneoModel;
import model.TorneoModelImpl;
import pojo.Equipo;
import pojo.Grafica;
import pojo.Torneo;

public class TorneoServiceImpl implements ITorneoService {

	private final int maxEquipos = 5;
	private final int minEquipos = 2;
	private ITorneoModel torneo = new TorneoModelImpl();
	private IEquipoService EquipoService = new EquipoServiceImpl();

	@Override
	public Torneo crearTorneo() {

		int i = 0, opc = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("ingrese el nombre del torneo");
		String nombre = scan.nextLine();
		System.out.println("ingrese la categoría del torneo");
		String categoria = scan.nextLine();

		Torneo nTorneo = torneo.crearTorneo(nombre, categoria);

		System.out.println("!NECESITA AL MENOS 2 EQUIPOS PARA GENERAR EL TORNEO!");

		System.out.println("\n +Ingrese los datos del los equipos");
		do {
			System.out.println("\n\n");
			System.out.println("\t\t▀▀▀▀▀▀▀▀▀▀▀▀▀Equipo " + (i + 1) + "▀▀▀▀▀▀▀▀▀▀▀▀▀");
			nTorneo.setEquipos(EquipoService.crearEquipo(String.valueOf(i + 1)));
			i++;

			if (i >= minEquipos) {
				System.out.println("¿desea continuar agregando equipos? 1: si / 2: no");
				opc = scan.nextInt();
			}

		} while (i < maxEquipos && opc != 2);

		return nTorneo;
	}

	@Override
	public void guardarTorneo(Hashtable<String, Equipo> lista, Torneo tiorneo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarTorneo(Hashtable<String, Equipo> lista, String idTorneo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarTorneo(Hashtable<String, Equipo> lista, Torneo torneo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarEquipo(Torneo torneo) {

		// Getting keySets of Hashtable and
		// storing it into Set
		Set<String> setOfKeys = torneo.getEquipos().keySet();

		// Creating an Iterator object to
		// iterate over the given Hashtable
		Iterator<String> itr = setOfKeys.iterator();
		String a = itr.next();

		int i = (int) (Integer.parseInt(a));

		if (i < maxEquipos) {

			System.out.println("\n +Ingrese los datos del los equipos");

			System.out.println("\n\t\t----Equipo " + (i + 1) + "----");
			torneo.setEquipos(EquipoService.crearEquipo(String.valueOf(i + 1)));

		} else {

			System.out.println("***Se ha alcanzado el maximo de equipos***");

		}

	}

	@Override
	public void Grafica(Torneo torneo) {

		// Getting keySets of Hashtable and
		// storing it into Set
		Set<String> setOfKeys = torneo.getEquipos().keySet();

		// Creating an Iterator object to
		// iterate over the given Hashtable
		Iterator<String> itr = setOfKeys.iterator();
		String a = itr.next();

		int n = (int) (Integer.parseInt(a) - 2);

		System.out.println("\n\n");
		System.out.println("*-*-*-*-*-ENCUENTROS-*-*-*-*");
		System.out.println("\n\n");

		torneo.getEquipos().forEach(
				(key, value) -> System.out.println("id : " + key + "\tNombre del equipo : " + value.getNombre()));

		System.out.println("\n\n");
		System.out.println(Grafica.getGrafica(n));

		System.out.println("\n\n");

	}

}
