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

import java.util.Hashtable;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

import model.IJugadorModel;
import model.JugadorModelImpl;
import pojo.Equipo;
import pojo.Jugador;

public class JugadorServiceImpl implements IJugadorService {
	IJugadorModel model = new JugadorModelImpl();

    @Override
    public void crearJugador(Hashtable<String, Jugador> lista, Jugador jugador) {
        model.crearJugador(lista, jugador);
    }

    @Override
    public Jugador crearJugador(String id, String nombre, int edad, String direccion, String telefono) {
        return model.crearJugador(id, nombre, edad, direccion, telefono);
    }

    @Override
    public void eliminarJugador(Hashtable<String, Jugador> lista, String idJugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizarJugador(Hashtable<String, Jugador> lista, Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Jugador obtenerUnJugador(Hashtable<String, Jugador> lista, String idJugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Hashtable<String, Jugador> obtenerTodosJugador(Hashtable<String, Jugador> lista, Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarJugadores(Hashtable<String, Equipo> lista, DefaultTableModel modelo) {
        model.mostrarJugadores(lista, modelo);
    }

	

}