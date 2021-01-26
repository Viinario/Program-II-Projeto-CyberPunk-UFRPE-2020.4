package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAdmin extends SignIn {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdmin frame = new TelaAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaAdmin() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAdmin.class.getResource("/interfaceGrafica/Images/login69.png")));
		setBounds(100, 100, 454, 241);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Administrar Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaBuscarClientes buscarClientes = new TelaBuscarClientes();
				buscarClientes.setVisible(true);
				buscarClientes.ShowClientes();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 127, 187, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Administrar Veiculo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAdministrarVeiculos adminVeiculo = new TelaAdministrarVeiculos();
				adminVeiculo.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_1.setBounds(241, 127, 176, 56);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo Administrador");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel.setBounds(83, 53, 205, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaAdmin.class.getResource("/interfaceGrafica/Images/Cliente1.png")));
		lblNewLabel_1.setBounds(324, 11, 103, 88);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(TelaAdmin.class.getResource("/interfaceGrafica/Images/login-64.png")));
		lblNewLabel_2.setBounds(28, 66, 46, 14);
		contentPane.add(lblNewLabel_2);
	}
}
