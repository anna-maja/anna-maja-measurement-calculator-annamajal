/***
 * GUICalculateMeasure
 * 
 * klassen GUICalculateMeasure i projektet measurement-calculator-annamajal
 * samlar alla metoder som bygger upp GUI. 
 * 
 * @author Anna-Maja Lithner  
 * @version 1.0
 * @date 2017-12-06
 */
package com.example.maven.measurement_calculator_annamajal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class GUICalculateMeasure {

	/**
	 * Constructors - alla konstruktorer för klassen. Skapade globalt för att vara
	 * nåbara i alla metoder.
	 */
	private CalculateMeasure c = new CalculateMeasure();
	private JFrame frmRknareFrOmvandling = new JFrame();

	private JTextField tfInput = new JTextField();
	private JTextField tfOutput = new JTextField();

	private JLabel lblInstruction = new JLabel("Skriv in längden i meter:");
	private JLabel lblInstructionChoose = new JLabel("Välj önskad måttenhet för omräkning.");
	private JLabel lblInformation = new JLabel("Det motsvarar");

	private JButton btnMm = new JButton("mm");
	private JButton btnCm = new JButton("cm");
	private JButton btnM = new JButton("m");
	private JButton btnKm = new JButton("km");
	private JButton btnInch = new JButton("inch");
	private JButton btnYard = new JButton("yard");
	private JButton btnFoot = new JButton("foot");
	private JButton btnMile = new JButton("mile");

	/**
	 * metoden GUICalculateMeasure - innehåller anrop för metoderna initialize,
	 * addComponents och addActionListeners.
	 */
	public GUICalculateMeasure() {
		initialize();
		addComponents();
		addActionListeners();
	}

	/**
	 * metoden initialize - innehåller samtliga setters för alla egenskaper i alla
	 * enheter (labels, text fields, buttons).
	 */
	public void initialize() {
		// sets properties for frame

		frmRknareFrOmvandling.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		frmRknareFrOmvandling.setTitle("OMVANDLING AV LÄNGDMÅTT");
		frmRknareFrOmvandling.setBounds(100, 100, 450, 436);
		frmRknareFrOmvandling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblInstruction.setBounds(117, 12, 189, 15);

		tfInput.setHorizontalAlignment(SwingConstants.CENTER);
		tfInput.setFont(new Font("Dialog", Font.PLAIN, 20));
		tfInput.setBounds(149, 39, 114, 40);
		tfInput.setColumns(10);

		lblInstructionChoose.setBounds(79, 93, 300, 25);
		lblInformation.setBounds(149, 259, 114, 25);

		tfOutput.setHorizontalAlignment(SwingConstants.CENTER);
		tfOutput.setFont(new Font("Dialog", Font.PLAIN, 20));
		tfOutput.setBounds(119, 296, 169, 47);
		tfOutput.setColumns(10);

		btnMm.setBounds(23, 130, 71, 35);
		btnCm.setBounds(133, 130, 71, 35);
		btnM.setBounds(250, 130, 71, 35);
		btnKm.setBounds(357, 130, 71, 35);
		btnInch.setBounds(23, 199, 71, 35);
		btnFoot.setBounds(133, 199, 71, 35);
		btnYard.setBounds(250, 199, 71, 35);
		btnMile.setBounds(357, 199, 71, 35);
		frmRknareFrOmvandling.setVisible(true);
	}

	/**
	 * metoden addComponents - innehåller samtliga getters för alla egenskaper i
	 * alla enheter (labels, text fields, buttons).
	 */
	public void addComponents() {
		// adds all properties
		frmRknareFrOmvandling.getContentPane().setLayout(null);
		frmRknareFrOmvandling.getContentPane().add(lblInstruction);
		frmRknareFrOmvandling.getContentPane().add(tfInput);
		frmRknareFrOmvandling.getContentPane().add(lblInstructionChoose);
		frmRknareFrOmvandling.getContentPane().add(lblInformation);
		frmRknareFrOmvandling.getContentPane().add(tfOutput);
		frmRknareFrOmvandling.getContentPane().add(btnMm);
		frmRknareFrOmvandling.getContentPane().add(btnCm);
		frmRknareFrOmvandling.getContentPane().add(btnM);
		frmRknareFrOmvandling.getContentPane().add(btnKm);
		frmRknareFrOmvandling.getContentPane().add(btnInch);
		frmRknareFrOmvandling.getContentPane().add(btnFoot);
		frmRknareFrOmvandling.getContentPane().add(btnYard);
		frmRknareFrOmvandling.getContentPane().add(btnMile);

	}

	/**
	 * metod addActionListeners - innehåller samtliga metoder för aktiviteter
	 * baserade på knapptryckning.
	 * Förutsätter numerisk inmatning - finns ingen implementation för att hantera ickenumerisk inmatning.
	 * 
	 * 
	 */
	public void addActionListeners() {
		
		btnMm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				double inputValue = Double.parseDouble(tfInput.getText().toString());
				double result = c.mToMm(inputValue);
				tfOutput.setText(result + " mm");
			}
		});

		btnCm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				double inputValue = Double.parseDouble(tfInput.getText().toString());
				double result = c.mToCm(inputValue);
				tfOutput.setText(result + " cm");
			}
		});

		btnM.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				double inputValue = Double.parseDouble(tfInput.getText().toString());
				double result = c.mToM(inputValue);
				tfOutput.setText(result + " m");
			}
		});

		btnKm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				double inputValue = Double.parseDouble(tfInput.getText().toString());
				double result = inputValue * 0.001;
				tfOutput.setText(result + " km");
			}
		});

		btnInch.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				double inputValue = Double.parseDouble(tfInput.getText().toString());
				double result = c.mToInch(inputValue);
				tfOutput.setText(result + " inch");
			}
		});

		btnFoot.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				double inputValue = Double.parseDouble(tfInput.getText().toString());
				double result = c.mToFoot(inputValue);
				tfOutput.setText(result + " foot");
			}
		});

		btnYard.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				double inputValue = Double.parseDouble(tfInput.getText().toString());
				double result = c.mToYard(inputValue);
				tfOutput.setText(result + " yard");
			}
		});

		btnMile.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				double inputValue = Double.parseDouble(tfInput.getText().toString());
				double result = c.mToMile(inputValue);
				tfOutput.setText(result + " mile");
			}
		});
	}
}
