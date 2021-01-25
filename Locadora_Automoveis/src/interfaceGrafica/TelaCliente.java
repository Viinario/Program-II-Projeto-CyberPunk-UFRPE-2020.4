package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pessoa.Cliente;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class TelaCliente extends SignIn {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	public TelaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCliente.class.getResource("/interfaceGrafica/Images/login69.png")));
		setResizable(false);
		setBounds(100, 100, 443, 284);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton atualizarInfoButton = new JButton("Atualizar Senha");
		atualizarInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		atualizarInfoButton.setBackground(Color.WHITE);
		atualizarInfoButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		atualizarInfoButton.addActionListener(e-> atualizarSenha());
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCliente.class.getResource("/interfaceGrafica/Images/Cliente1.png")));
		
		JButton historicoVeiculoButton = new JButton("Historico Veiculos");
		historicoVeiculoButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		historicoVeiculoButton.setBackground(Color.WHITE);
		historicoVeiculoButton.addActionListener(e -> verHistorico());
		
		JLabel infoCliente = new JLabel(nome);
		infoCliente.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1 = new JLabel("Bem Vindo Cliente:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.BLACK);
		
		JButton AlugarVeiculoButton = new JButton("Alugar Veiculo");
		AlugarVeiculoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVeiculo veiculo = new TelaVeiculo();
				veiculo.setVisible(true);
			}
		});
		AlugarVeiculoButton.setForeground(Color.BLACK);
		AlugarVeiculoButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		AlugarVeiculoButton.setBackground(Color.WHITE);
		AlugarVeiculoButton.setIcon(new ImageIcon(TelaCliente.class.getResource("/interfaceGrafica/Images/VeiculoRent.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
								.addComponent(infoCliente, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(historicoVeiculoButton)
							.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
							.addComponent(AlugarVeiculoButton))
						.addComponent(atualizarInfoButton))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(infoCliente, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel))
					.addGap(18)
					.addComponent(atualizarInfoButton)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(AlugarVeiculoButton)
						.addComponent(historicoVeiculoButton))
					.addGap(56))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void verHistorico() {
		TelaHistoricoVeiculos historicoVeiculos = new TelaHistoricoVeiculos();
		historicoVeiculos.showHistoricoVeiculo();
		historicoVeiculos.setVisible(true);
	}
	public void atualizarSenha() {
		AtualizarSenha atualizar = new AtualizarSenha();
		atualizar.setVisible(true);
	}
}
