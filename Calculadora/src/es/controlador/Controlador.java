package es.controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import es.vista.VistaCalculadora;

public class Controlador implements ActionListener {
	
	private float num1;
	private float num2;
	private JLabel labelResultado;
	private VistaCalculadora window;
	
	public void setNum1 (float num1) {
		this.num1 = num1;
	}
	
	public void setNum2 (float num2) {
		this.num2 = num2;
	}
	
	public float suma() {
		return num1 + num2;
	}
	
	public float resta() {
		return num1 - num2;
	}
	
	public float multiplicacion() {
		return num1 * num2;
	}
	
	public float division() {
		return num1 / num2;
	}

	public double raizCubica() {
		return Math.pow(num1, 1/3);
	}

	public void setWindow(VistaCalculadora window) {
		this.window = window;
		labelResultado = window.getLabelResultado();	
	}
	
	public void setVentana(VistaCalculadora window) {
		this.window = window;
		labelResultado = window.getLabelResultado();
		labelResultado.setForeground(Color.red);
	}

	private boolean comprobarCajas() {
		if (window.getBox1().getText().equals("")) {
			labelResultado.setForeground(Color.red);
			labelResultado.setFont(new Font("Arial", Font.BOLD, 20));
			labelResultado.setText("Ingrese número 1");
			return false;
		}
		if (window.getBox2().getText().equals("")) {
			labelResultado.setForeground(Color.red);
			labelResultado.setFont(new Font("Arial", Font.BOLD, 20));
			labelResultado.setText("Ingrese número 2");
			return false;
		}
		try {
			setNum1(Integer.parseInt(window.getBox1().getText()));
			setNum2(Integer.parseInt(window.getBox2().getText()));
			return true;
		} catch (Exception e) {
			labelResultado.setForeground(Color.red);
			labelResultado.setFont(new Font("Arial", Font.BOLD, 20));
			labelResultado.setText("Números incorrectos");
			return false;
		}
	}

	private boolean comprobarCajaRaiz() {
		if (window.getBox1().getText().equals("") && window.getBox2().getText().equals("")) {
			labelResultado.setForeground(Color.red);
			labelResultado.setFont(new Font("Arial", Font.BOLD, 20));
			labelResultado.setText("Escriba un número");
			return false;
		}

		if (!window.getBox1().getText().equals("")) {
			try {
				setNum1(Float.parseFloat(window.getBox1().getText()));
				return true;
			} catch (Exception e) {
				labelResultado.setForeground(Color.red);
				labelResultado.setFont(new Font("Arial", Font.BOLD, 20));
				labelResultado.setText("Número incorrecto");
				return false;

			}
		} else if (!window.getBox2().getText().equals("")) {
			try {
				setNum1(Float.parseFloat(window.getBox2().getText()));
				return true;
			} catch (Exception e) {
				labelResultado.setForeground(Color.red);
				labelResultado.setFont(new Font("Arial", Font.BOLD, 20));
				labelResultado.setText("Número incorrecto");
				return false;
			}
		} else
			return true;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object boton = e.getSource();

		if (boton == window.getButtonRaizCuadrada()) {
			JOptionPane.showMessageDialog(null, "Funcionalidad no disponible", "Raiz Cuadrada",
					JOptionPane.INFORMATION_MESSAGE);
		} else

		if (boton == window.getButtonRaizCubica()) {
			String pass = JOptionPane.showInputDialog("Contraseña:");
			if (pass!=null) {
				if (pass.equals("admin")) {
					if (comprobarCajaRaiz()) {
						labelResultado.setText(String.valueOf(raizCubica()));
					}
				} else {
					labelResultado.setForeground(Color.red);
					labelResultado.setFont(new Font("Arial", Font.BOLD, 20));
					labelResultado.setText("Contraseña incorrecta");
				}
			}else {
				labelResultado.setForeground(Color.red);
				labelResultado.setFont(new Font("Arial", Font.BOLD, 14));
				labelResultado.setText("No se ha introducido contraseña");
			}

		} else

		if (comprobarCajas()) {
			labelResultado.setForeground(new Color(0, 255, 51));
			labelResultado.setFont(new Font("Arial", Font.BOLD, 30));

			if (boton == window.getButtonSumar()) {
				labelResultado.setText(String.valueOf(suma()));
			}

			if (e.getSource() == window.getButtonRestar()) {
				labelResultado.setText(String.valueOf(resta()));
			}

			if (e.getSource() == window.getButtonMultiplicar()) {
				labelResultado.setText(String.valueOf(multiplicacion()));
			}

			if (e.getSource() == window.getButtonDividir()) {
				try {
					labelResultado.setText(String.valueOf(division()));
				} catch (Exception ex) {
					labelResultado.setFont(new Font("Arial", Font.BOLD, 20));
					labelResultado.setForeground(Color.red);
					labelResultado.setText("Error: división por cero");
				}

			}
		}

	}

}
