/***
 * InterfaceCalculate
 * 
 * interface till slutuppgift OOP KVALIT17.
 * 
 * @author Anna-Maja Lithner
 * @version 1.0
 * @date 2017-12-06
 */
package com.example.maven.measurement_calculator_annamajal;

public interface InterfaceCalculateMeasure {

	/***
	 * metod för omräkning av meter till millimeter.
	 * implementeras i klasen CalculateMeasure.
	 * @param inputValue av typen double.
	 * @return double
	 */
	double mToMm(double inputValue);
	
	/***
	 * metod för omräkning av meter till centimeter.
	 * implementeras i klasen CalculateMeasure.
	 * @param inputValue av typen double.
	 * @return double
	 */
	double mToCm(double inputValue);
	
	/***
	 * metod för omräkning av meter till meter.
	 * implementeras i klasen CalculateMeasure.
	 * @param inputValue av typen double.
	 * @return double
	 */
	double mToM(double inputValue);
	
	/***
	 * metod för omräkning av meter till kilometer.
	 * implementeras i klasen CalculateMeasure.
	 * @param inputValue av typen double.
	 * @return double
	 */
	double mToKm(double inputValue);

	/***
	 * metod för omräkning av meter till inch.
	 * implementeras i klasen CalculateMeasure.
	 * @param inputValue av typen double.
	 * @return double
	 */
	double mToInch(double inputValue);
	
	/***
	 * metod för omräkning av meter till foot.
	 * implementeras i klasen CalculateMeasure.
	 * @param inputValue av typen double.
	 * @return double
	 */
	double mToFoot(double inputValue);

	/***
	 * metod för omräkning av meter till yard.
	 * implementeras i klasen CalculateMeasure.
	 * @param inputValue av typen double.
	 * @return double
	 */
	double mToYard(double inputValue);
	
	/***
	 * metod för omräkning av meter till mile.
	 * implementeras i klasen CalculateMeasure.
	 * @param inputValue av typen double.
	 * @return double
	 */
	double mToMile(double inputValue);

}
