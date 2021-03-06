/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: clase de tipo Equipo 
 * 
 * 
 */

package pojo;

import java.util.HashMap;

public class Equipo {

	private String id;
	private String nombre;
        private String LogoRuta;
	private HashMap<String, Jugador> jugadores;

	public Equipo() {
		jugadores = new HashMap<String, Jugador>();
	}

	public Equipo(String nombre, String id, String logo) {

		this.setNombre(nombre);
		this.setId(id);
                this.LogoRuta = logo;
		jugadores = new HashMap<String, Jugador>();

	}

	public String getNombre() {
		return nombre;
	}

    public void setLogoRuta(String LogoRuta) {
        this.LogoRuta = LogoRuta;
    }

    public String getLogoRuta() {
        return LogoRuta;
    }
    
    

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<String, Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugador(Jugador jugador) {
		jugadores.put(jugador.getId(), jugador);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
