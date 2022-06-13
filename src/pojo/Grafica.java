/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n: clase para las gr�ficas del torneo 
 * 
 * 
 */

package pojo;

public final class Grafica {

	private final static String linea = "----------------";
	private final static String eL = "\t|";
	private final static String e2L = "\n" + eL + eL;
	private final static String e = "\t";

	private final static String grafica[] = {
			("1" + linea + "\n" + eL + "\n" + eL + "\n" + eL + linea + "\n" + eL + "\n" + eL + "\n2" + linea + "\n"),
			("1" + linea + "\n" + eL + "\n" + eL + linea + e2L + e2L + "\n" + "2" + linea + eL + "\n" + e + eL + linea
					+ "\n" + e + eL + "\n" + e + eL + "\n" + e + eL + "\n3" + linea + linea + "\n"),
			("1" + linea + "\n" + eL + "\n" + eL + "\n" + eL + linea + e2L + e2L + "\n2" + linea + eL + "\n" + e + eL
					+ "\n" + e + eL + linea + "\n" + "3" + linea + eL + e2L + e2L + "\n" + eL + linea + "\n" + eL + "\n"
					+ eL + "\n4" + linea + "\n"),
			("1" + linea + "\n" + eL + "\n" + eL + "\n" + eL + linea + e2L + e2L + "\n2" + linea + eL + "\n" + e + eL
					+ "\n" + e + eL + linea + "\n" + "3" + linea + eL + eL + e2L + eL + e2L + eL + "\n" + eL + linea
					+ eL + "\n" + eL + e + eL + linea + "\n" + eL + e + eL + "\n4" + linea + e + eL + "\n" + e + e + eL
					+ "\n" + e + e + eL + "\n" + "5" + linea + linea + linea) };

	public final static String getGrafica(int n) {

		return grafica[n];

	}

}
