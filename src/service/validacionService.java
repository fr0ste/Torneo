package service;

/**
 *
 * @autor fr0ste
 */
public class validacionService {
    
    public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    
}
