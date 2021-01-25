package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AtualizarSenha extends TelaCliente {

	private JPanel contentPane;
	private JTextField novaSenhaConfirmarText;
	private JTextField novaSenhaText;
	private JTextField senhaAtualText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarSenha frame = new AtualizarSenha();
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
	public AtualizarSenha() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 296, 304);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Senha:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("Confirmar Senha:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(Color.WHITE);
		
		novaSenhaConfirmarText = new JPasswordField();
		novaSenhaConfirmarText.setColumns(10);
		
		novaSenhaText = new JPasswordField();
		novaSenhaText.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha Atual:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		senhaAtualText = new JPasswordField();
		senhaAtualText.setColumns(10);
		
		JButton btnNewButton = new JButton("Atualizar Senha");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon(AtualizarSenha.class.getResource("/interfaceGrafica/Images/login-64.png")));
		btnNewButton.addActionListener(e-> AtualizarSenha());
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(senhaAtualText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(novaSenhaText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(novaSenhaConfirmarText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(btnNewButton)))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton)
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(senhaAtualText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(novaSenhaText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(novaSenhaConfirmarText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(165, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void AtualizarSenha() {
		if(senhaAtualText.getText().isEmpty() == true || novaSenhaText.getText().isEmpty() == true || novaSenhaConfirmarText.getText().isEmpty() == true) {
			JOptionPane.showMessageDialog(null,"Preencha Todos Os Campos","Warming", JOptionPane.WARNING_MESSAGE);
		}
		else if(clienteLogado.getSenha().equals(senhaAtualText.getText()) != true) {
			JOptionPane.showMessageDialog(null,"Senha Atual Não Coincide","Warming", JOptionPane.WARNING_MESSAGE);
		}else if(novaSenhaText.getText().equals(novaSenhaConfirmarText.getText()) == false) {
			JOptionPane.showMessageDialog(null,"Nova Senha Não Coincide","Warming", JOptionPane.WARNING_MESSAGE);
		}else {
			clienteLogado.setSenha(novaSenhaText.getText());
			JOptionPane.showMessageDialog(null,"Senha Atualizada Com Sucesso");
			
		}
	}
}
