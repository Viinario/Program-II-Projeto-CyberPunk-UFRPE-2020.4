package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TelaBuscarCliente extends TelaAdmin{

	private JFrame frmBuscaDeCliente;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBuscarCliente window = new TelaBuscarCliente();
					window.frmBuscaDeCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaBuscarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBuscaDeCliente = new JFrame();
		frmBuscaDeCliente.setTitle("Busca de Cliente");
		frmBuscaDeCliente.setBounds(100, 100, 720, 500);
		frmBuscaDeCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBuscaDeCliente.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(164, 128, 311, 32);
		frmBuscaDeCliente.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Busca por nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(42, 127, 109, 32);
		frmBuscaDeCliente.getContentPane().add(lblNewLabel);
		
		JButton voltarAoAdmin = new JButton("Voltar");
		voltarAoAdmin.setBounds(22, 31, 89, 23);
		frmBuscaDeCliente.getContentPane().add(voltarAoAdmin);
		
		JButton procurarNome = new JButton("Pesquisar");
		procurarNome.setBounds(504, 133, 89, 23);
		frmBuscaDeCliente.getContentPane().add(procurarNome);
	}
}
