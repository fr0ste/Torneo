/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 20/06/2022
 * Fecha de modificaci�n: 20/06/2022
 * 
 * Descripci�n: clase de validacion de datos. 
 * 
 */


package utilidades;

/**
 *
 * @autor fr0ste
 */
public class validacion {
    
    public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    
}
