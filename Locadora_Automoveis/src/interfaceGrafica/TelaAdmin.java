package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TelaAdmin extends SignIn{

	private JFrame frmAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdmin window = new TelaAdmin();
					window.frmAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdmin = new JFrame();
		frmAdmin.setTitle("Admin");
		frmAdmin.setBounds(100, 100, 720, 500);
		frmAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdmin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administra\u00E7\u00E3o");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(301, 11, 117, 36);
		frmAdmin.getContentPane().add(lblNewLabel);
		
		JButton botaoBuscarCliente = new JButton("Buscar cliente");
		botaoBuscarCliente.setBounds(177, 243, 150, 48);
		frmAdmin.getContentPane().add(botaoBuscarCliente);
		botaoBuscarCliente.addActionListener(e -> clientSearch());
		
		JButton botaoBuscarVeiculo = new JButton("Buscar ve\u00EDculo");
		botaoBuscarVeiculo.setBounds(363, 243, 150, 48);
		frmAdmin.getContentPane().add(botaoBuscarVeiculo);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione uma op\u00E7\u00E3o");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(301, 159, 128, 30);
		frmAdmin.getContentPane().add(lblNewLabel_1);
	}
	
	public void clientSearch() {
		TelaBuscarCliente buscarCliente = new TelaBuscarCliente();
		buscarCliente.setVisible(true);
	}

} 
