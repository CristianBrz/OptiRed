package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelMenu extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public PanelMenu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
		setResizable(false);
		setTitle("Menu Principal");
		setLocationRelativeTo(null);
	}
	
	private void initComponents() {
		setBounds(100, 100, 1024, 719);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Boton de iniciar
		JButton btnStart = new JButton("Iniciar");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelIngresoLocalidades User = new PanelIngresoLocalidades();
				User.setVisible(true);
				dispose();
			}
		});
		
		btnStart.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 17));
		btnStart.setBounds(340, 188, 312, 59);
		contentPane.add(btnStart);
		
		//Boton de mostrar los miembros
		JButton btnMembers = new JButton("Miembros");
		btnMembers.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Creado por Brizuela Cristian, Regunega Roberto y Zalazar Fernandez Gabriela");
			}
		});
		
		btnMembers.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 17));
		btnMembers.setBounds(340, 258, 312, 65);
		contentPane.add(btnMembers);
		
		//Boton de poner las reglas
		JButton btnRules = new JButton("Información");
		btnRules.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 17));
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "");
			}
		});
		btnRules.setBounds(340, 334, 312, 65);
		contentPane.add(btnRules);
		
		//Boton de salir
		JButton btnExit = new JButton("Salir");
		btnExit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 17));
		btnExit.setBounds(340, 410, 312, 59);
		contentPane.add(btnExit);
	}
}
