package es.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import es.controlador.Controlador;

public class VistaCalculadora extends JFrame{
	
	private JLabel label1;
	private JLabel label2;
	private JTextField box1;
	private JTextField box2;
	private JLabel logo;
	
	private JButton buttonSumar;
	private JButton buttonRestar;
	private JButton buttonMultiplicar;
	private JButton buttonDividir;
	private JButton buttonRaizCuadrada;
	private JButton buttonRaizCubica;
	
	private JLabel labelFinal;
	private JLabel labelResultado;
	
	
	public VistaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 450);
		setLocationRelativeTo(null);
		setTitle("Mi Calculadora");
		getContentPane().setLayout(null);
		setResizable(false);
		init();
		setVisible(true);
	}
	
	private void init() {
		logo = new JLabel(new ImageIcon("images\\Logo.png"));
		logo.setBounds(44, 18, 240, 80);
		getContentPane().add(logo);
		
		getContentPane().setBackground(Color.lightGray);
		
		label1 = new JLabel ("Numero 1: ");
		label1.setFont(new Font("TimesRoman", Font.BOLD, 12));
		label1.setForeground(new Color(0,0,0));
		label1.setBounds(50, 109, 70, 20);
		getContentPane().add(label1);
		
		label2 = new JLabel ("Numero 2: ");
		label2.setFont(new Font("TimesRoman", Font.BOLD, 12));
		label2.setForeground(new Color(0,0,0));
		label2.setBounds(50, 140, 70, 20);
		getContentPane().add(label2);
		
		box1 = new JTextField();
		box1.setFont(new Font("Verdana", Font.BOLD, 12));
		box1.setForeground(new Color(0, 0, 15));
		box1.setBounds(160, 109, 124, 26);
		getContentPane().add(box1);
		
		box2 = new JTextField();
		box2.setFont(new Font("Verdana", Font.BOLD, 12));
		box2.setForeground(new Color(0, 0, 15));
		box2.setBounds(160, 140, 124, 25);
		getContentPane().add(box2);
		
		buttonSumar = new JButton("Sumar");
		buttonSumar.setBounds(50, 187, 100, 35);	
		buttonSumar.setBackground(new Color(0, 0, 80));
		buttonSumar.setForeground(Color.WHITE);
		buttonSumar.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(buttonSumar);
		
		buttonRestar = new JButton("Restar");
		buttonRestar.setBounds(160, 187, 100, 35);	
		buttonRestar.setBackground(new Color(0, 0, 80));
		buttonRestar.setForeground(Color.WHITE);
		buttonRestar.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(buttonRestar);
		
		buttonMultiplicar = new JButton("Multiplicar");
		buttonMultiplicar.setBounds(51, 232, 100, 35);	
		buttonMultiplicar.setBackground(new Color(0, 0, 80));
		buttonMultiplicar.setForeground(Color.WHITE);
		buttonMultiplicar.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(buttonMultiplicar);
		
		buttonDividir = new JButton("Dividir");
		buttonDividir.setBounds(162, 231, 100, 35);	
		buttonDividir.setBackground(new Color(0, 0, 80));
		buttonDividir.setForeground(Color.WHITE);
		buttonDividir.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(buttonDividir);
		
		buttonRaizCuadrada = new JButton("Raiz 2");
		buttonRaizCuadrada.setBounds(53, 274, 100, 35);	
		buttonRaizCuadrada.setBackground(new Color(0, 0, 80));
		buttonRaizCuadrada.setForeground(Color.WHITE);
		buttonRaizCuadrada.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(buttonRaizCuadrada);
		
		buttonRaizCubica = new JButton("Raiz 3");
		buttonRaizCubica.setBounds(162, 273, 100, 35);	
		buttonRaizCubica.setBackground(new Color(0, 0, 80));
		buttonRaizCubica.setForeground(Color.WHITE);
		buttonRaizCubica.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(buttonRaizCubica);
		
		labelFinal = new JLabel("Resultado:");
		labelFinal.setForeground(new Color(0, 0, 80));
		labelFinal.setBounds(44, 342, 80, 30);
		labelFinal.setFont(new Font("Verdana", Font.BOLD, 12));
		getContentPane().add(labelFinal);
		
		labelResultado = new JLabel("   ");
		labelResultado.setForeground(new Color(0, 0, 50));
		labelResultado.setBounds(140, 337, 141, 35);
		labelResultado.setFont(new Font("Verdana", Font.BOLD, 14));
		labelResultado.setBackground(new Color(0, 0, 68));
		getContentPane().add(labelResultado);
		
	}
	
	public void setControlador(Controlador controlador) {
		buttonSumar.addActionListener((ActionListener)controlador);
		buttonRestar.addActionListener((ActionListener)controlador);
		buttonMultiplicar.addActionListener((ActionListener)controlador);
		buttonDividir.addActionListener((ActionListener)controlador);
		buttonRaizCuadrada.addActionListener((ActionListener)controlador);
		buttonRaizCubica.addActionListener((ActionListener)controlador);
	}

	public JTextField getBox1() {
		return box1;
	}

	public JTextField getBox2() {
		return box2;
	}

	public JButton getButtonSumar() {
		return buttonSumar;
	}

	public JButton getButtonRestar() {
		return buttonRestar;
	}

	public JButton getButtonMultiplicar() {
		return buttonMultiplicar;
	}

	public JButton getButtonDividir() {
		return buttonDividir;
	}

	public JButton getButtonRaizCuadrada() {
		return buttonRaizCuadrada;
	}

	public JButton getButtonRaizCubica() {
		return buttonRaizCubica;
	}

	public JLabel getLabelResultado() {
		return labelResultado;
	}
	
	
	
	
	
	
	
}
