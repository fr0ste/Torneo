package model;

import java.util.Hashtable;
import javax.swing.table.DefaultTableModel;
import pojo.Equipo;

public interface IEquipoModel {
	// CRUD 5 metodos, crear, eliminar, actualizar, leer 1 registro, leer todos los
	// registros
	// public Jugador crearJugador();

	public Equipo crearEquipo(String nombre, String id,String logo);
        
        public void eliminarAlumno(Hashtable<String, Equipo> lista, String id);
        public void actualizarAlumno(Hashtable<String, Equipo> lista, Equipo equipo);
        public void mostrarEquipos(Hashtable<String, Equipo> lista, DefaultTableModel modelo);

}



