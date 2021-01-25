package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAdmin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdmin window = new TelaAdmin();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administra\u00E7\u00E3o");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(301, 11, 117, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton botaoBuscarCliente = new JButton("Buscar cliente");
		botaoBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoBuscarCliente.setBounds(223, 243, 117, 71);
		frame.getContentPane().add(botaoBuscarCliente);
		
		JButton botaoBuscarVeiculo = new JButton("Buscar veiculo");
		botaoBuscarVeiculo.setBounds(387, 243, 117, 71);
		frame.getContentPane().add(botaoBuscarVeiculo);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione uma op\u00E7\u00E3o");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(301, 159, 128, 30);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
