package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Localidad;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class PanelIngresoLocalidades extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public PanelIngresoLocalidades() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
		setResizable(false);
		setTitle("Conectando Las Localidades A La Velocidad De La Luz");
		setLocationRelativeTo(null);
	}

	private void initComponents() {
		setBounds(100, 100, 1024, 719);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ingrese Localidad");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel.setBounds(197, 145, 167, 33);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Ingrese Provincia");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(197, 208, 167, 33);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Latitud");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(197, 262, 166, 38);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Longitud");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(197, 328, 166, 33);
		contentPane.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(382, 145, 290, 30);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(382, 207, 290, 30);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(382, 266, 290, 30);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(382, 328, 290, 30);
		contentPane.add(textField_3);

		JButton btnNewButton = new JButton("+ Agregar Otra Localidad");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(UIManager.getColor("Button.light"));
		btnNewButton.setBounds(197, 389, 238, 38);
		contentPane.add(btnNewButton);

		JButton btnGrafo = new JButton("Generar Calculo");
		btnGrafo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelMapa Mapa = new PanelMapa();
				Mapa.setVisible(true);
				dispose();
			}
		});
		btnGrafo.setBackground(UIManager.getColor("Button.light"));
		btnGrafo.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnGrafo.setBounds(382, 502, 290, 45);
		contentPane.add(btnGrafo);

	}

	PanelIngresoLocalidades userMenu = this;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
}
