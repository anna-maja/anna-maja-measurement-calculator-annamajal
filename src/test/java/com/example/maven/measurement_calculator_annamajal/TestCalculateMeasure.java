package com.example.maven.measurement_calculator_annamajal;

import java.util.logging.Logger;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TestCalculateMeasure {

	CalculateMeasure c = new CalculateMeasure();
	Random random = new Random();
	double localResult = 0.0;
	double localValue = 0.0;
	double methodValue = 0.0;
	double randomValue = 0.0;
	private static final Logger LOG = Logger.getLogger(CalculateMeasure.class.getName());

	// testmetod för set- och get inputValue - 100% coverage.
	@Test
	public void testSetGetInputValue() {

		double randomValue = 0.0;

		for (int i = 0; i < 50; i++) {
			randomValue = random.nextDouble() * 10;
			c.setInputValue(randomValue);
			assertEquals(c.getInputValue(), randomValue, 0.1);
			LOG.info(randomValue + " == " + c.getInputValue());
		}
	}

	// lokala hjälpmetoder
	public double localToMm(double localValue) {
		localResult = localValue * 1000;
		return localResult;
	}

	public double localToCm(double localValue) {
		localResult = localValue * 100;
		return localResult;
	}

	public double localToM(double localValue) {
		localResult = localValue *1;
		return localResult;
	}

	public double localToKm(double localValue) {
		localResult = localValue * 0.001;
		return localResult;
	}

	public double localToInch(double localValue) {
		localResult = localValue * 39.37;
		return localResult;
	}

	public double localToFoot(double localValue) {
		localResult = localValue * 3.281;
		return localResult;
	}

	public double localToYard(double localValue) {
		localResult = localValue * 1.094;
		return localResult;
	}

	public double localToMile(double localValue) {
		localResult = localValue * 0.0006216;
		return localResult;
	}

	// testmetoder med jämförelse av värden från lokal metod och klassmetod.
	// testmetod för mToMm. 100% coverage.
	@Test
	public void testMToMm() {

		double randomValue = 0.0;

		for (int i = 0; i < 50; i++) {

			randomValue = random.nextDouble() * 10;
			LOG.info("Testing the method m with " + randomValue);
			assertEquals(localToMm(randomValue), c.mToMm(randomValue), 0.01);
			LOG.info(localToMm(randomValue) + " == " + c.mToMm(randomValue));
		}
	}
	
	// testmetod för mToCm. 100% coverage.
		@Test
		public void testMToCm() {

			double randomValue = 0.0;

			for (int i = 0; i < 50; i++) {

				randomValue = random.nextDouble() * 10;
				LOG.info("Testing the method mToCm with " + randomValue);
				assertEquals(localToCm(randomValue), c.mToCm(randomValue), 0.01);
				LOG.info(localToCm(randomValue) + " == " + c.mToCm(randomValue));
			}
		}

		// testmetod för mToM. 100% coverage.
			@Test
			public void testMToM() {

				double randomValue = 0.0;

				for (int i = 0; i < 50; i++) {

					randomValue = random.nextDouble() * 10;
					LOG.info("Testing the method mToM with " + randomValue);
					assertEquals(localToM(randomValue), c.mToM(randomValue), 0.01);
					LOG.info(localToM(randomValue) + " == " + c.mToM(randomValue));
				}
			}
			

			// testmetod för mToKm. 100% coverage.
				@Test
				public void testMToKm() {

					double randomValue = 0.0;

					for (int i = 0; i < 50; i++) {

						randomValue = random.nextDouble() * 10;
						LOG.info("Testing the method mToKm with " + randomValue);
						assertEquals(localToKm(randomValue), c.mToKm(randomValue), 0.1);
						LOG.info(localToKm(randomValue) + " == " + c.mToKm(randomValue));
					}
				}
				

				// testmetod för mToInch. 100% coverage.
					@Test
					public void testMToInch() {

						double randomValue = 0.0;

						for (int i = 0; i < 50; i++) {

							randomValue = random.nextDouble() * 10;
							LOG.info("Testing the method mToInch with " + randomValue);
							assertEquals(localToInch(randomValue), c.mToInch(randomValue), 0.01);
							LOG.info(localToInch(randomValue) + " == " + c.mToInch(randomValue));
						}
					}

					// testmetod för mToFoot. 100% coverage.
					@Test
					public void testMToFoot() {

						double randomValue = 0.0;

						for (int i = 0; i < 50; i++) {

							randomValue = random.nextDouble() * 10;
							LOG.info("Testing the method mToFoot with " + randomValue);
							assertEquals(localToFoot (randomValue), c.mToFoot (randomValue), 0.01);
							LOG.info(localToFoot(randomValue) + " == " + c.mToFoot(randomValue));
						}
					}

					// testmetod för mToYard. 100% coverage.
					@Test
					public void testMToYard() {

						double randomValue = 0.0;

						for (int i = 0; i < 50; i++) {

							randomValue = random.nextDouble() * 10;
							LOG.info("Testing the method mToYard with " + randomValue);
							assertEquals(localToYard(randomValue), c.mToYard(randomValue), 0.01);
							LOG.info(localToYard(randomValue) + " == " + c.mToYard(randomValue));
						}
					}

					// testmetod för mToMile. 100% coverage.
					@Test
					public void testMToMile() {

						double randomValue = 0.0;

						for (int i = 0; i < 50; i++) {

							randomValue = random.nextDouble() * 10;
							LOG.info("Testing the method mToMile with" + randomValue);
							assertEquals(localToMile(randomValue), c.mToMile(randomValue), 0.01);
							LOG.info(localToMile(randomValue) + " == " + c.mToMile(randomValue));
						}
					}
					



}
