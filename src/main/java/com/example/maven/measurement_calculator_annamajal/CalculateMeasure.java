/***
 * CalculateMeasure
 * 
 * klassen CalculateMeasure i projektet measurement-calculator-annamajal
 * samlar alla metoder som sen används i GUI. 
 * 
 * @author Anna-Maja Lithner  
 * @version 1.0
 * @date 2017-12-06
 */

package com.example.maven.measurement_calculator_annamajal;

import java.text.DecimalFormat;

public class CalculateMeasure implements InterfaceCalculateMeasure {

	// attribute for the class
	double inputValue = 0.0;
	double result = 0.0;

	/**
	 * 
	 * @param inputValue
	 *            inmatning från tangentbord i textfält tfInput i klassen
	 *            GUICalculateMeasure
	 */
	public void setInputValue(double inputValue) {
		this.inputValue = inputValue;
	}

	/**
	 * 
	 * @return inputValue
	 */
	public double getInputValue() {
		return inputValue;
	}

	// beräkningsmetoder
	/**
	 * implementation av metoden mToMm() från interface. Metoden räknar om ett värde
	 * i meter till millimeter.
	 * 
	 * @return result
	 */
	public double mToMm(double inputValue) {
		DecimalFormat df = new DecimalFormat("#.##");
		result = inputValue * 1000;
		return Double.parseDouble(df.format(result));

	}

	/**
	 * implementation av metoden mToCm() från interface. Metoden räknar om ett värde
	 * i meter till centimeter.
	 * 
	 * @return result
	 */
	public double mToCm(double inputValue) {
		DecimalFormat df = new DecimalFormat("#.##");
		result = inputValue * 100;
		return Double.parseDouble(df.format(result));

	}

	/**
	 * implementation av metoden mToM() från interface. Metoden genererar samma
	 * värde som inmatningen.
	 * 
	 * @return result
	 */
	public double mToM(double inputValue) {
		DecimalFormat df = new DecimalFormat("#.##");
		result = inputValue * 1;
		return Double.parseDouble(df.format(result));
	}

	/**
	 * implementation av metoden mToKm() från interface. Metoden räknar om ett värde
	 * i meter till kilometer.
	 * 
	 * @return result
	 */
	public double mToKm(double inputValue) {
		DecimalFormat df = new DecimalFormat("#.###");
		result = inputValue * 0.001;
		return Double.parseDouble(df.format(result));
	}

	/**
	 * implementation av metoden mToInch() från interface. Metoden räknar om ett
	 * värde i meter till inch.
	 * 
	 * @return result
	 */
	public double mToInch(double inputValue) {
		DecimalFormat df = new DecimalFormat("#.##");
		result = inputValue * 39.37;
		return Double.parseDouble(df.format(result));
	}

	/**
	 * implementation av metoden mToFoot() från interface. Metoden räknar om ett
	 * värde i meter till foot.
	 * 
	 * @return result
	 */
	public double mToFoot(double inputValue) {
		DecimalFormat df = new DecimalFormat("#.##");
		result = inputValue * 3.281;
		return Double.parseDouble(df.format(result));
	}

	/**
	 * implementation av metoden mToYard() från interface. Metoden räknar om ett
	 * värde i meter till yard.
	 * 
	 * @return result
	 */
	public double mToYard(double inputValue) {
		DecimalFormat df = new DecimalFormat("#.##");
		result = inputValue * 1.094;
		return Double.parseDouble(df.format(result));
	}

	/**
	 * implementation av metoden mToMile() från interface. Metoden räknar om ett
	 * värde i meter till mile.
	 * 
	 * @return result
	 */
	public double mToMile(double inputValue) {
		DecimalFormat df = new DecimalFormat("#.###");
		result = inputValue * 0.0006216;
		return Double.parseDouble(df.format(result));
	}

}
