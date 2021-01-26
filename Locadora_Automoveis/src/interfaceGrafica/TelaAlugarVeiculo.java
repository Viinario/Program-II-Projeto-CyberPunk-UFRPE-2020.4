package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import veiculo.Veiculo;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAlugarVeiculo extends TelaVeiculo {

	private JPanel contentPane;
	private JTextField placaText;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlugarVeiculo frame = new TelaAlugarVeiculo();
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
	public TelaAlugarVeiculo() {
		setBounds(100, 100, 406, 263);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Alugar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (placaText.getText().isEmpty() == true|| textField_1.getText().isEmpty() == true){
					JOptionPane.showMessageDialog(null,"Preencha Todos os Campos","Warming", JOptionPane.WARNING_MESSAGE);
					
				}else if (bancoVeiculos.BuscarVeiculo(placaText.getText()) == null) {
					JOptionPane.showMessageDialog(null,"Veiculo Não Encontrado","Warming", JOptionPane.WARNING_MESSAGE);
				}
				else{
					Veiculo carro1 = bancoVeiculos.BuscarVeiculo(placaText.getText());
					clienteLogado.registrarVeiculoHistorico(carro1);
					carro1.setDisponibilidade(false);
					JOptionPane.showMessageDialog(null,"Veiculo Locado Com Sucesso");
					dispose();
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(TelaAlugarVeiculo.class.getResource("/interfaceGrafica/Images/VeiculoRent.png")));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JLabel lblNewLabel = new JLabel("Placa:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		
		placaText = new JTextField();
		placaText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Dias:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		
		JLabel ValorTotal = new JLabel("00.00");
		ValorTotal.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btnNewButton_1 = new JButton("Calcular Valor:");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (placaText.getText().isEmpty() == true|| textField_1.getText().isEmpty() == true){
					JOptionPane.showMessageDialog(null,"Preencha Todos os Campos","Warming", JOptionPane.WARNING_MESSAGE);
					
				}else if (bancoVeiculos.BuscarVeiculo(placaText.getText()) == null) {
					JOptionPane.showMessageDialog(null,"Veiculo Não Encontrado","Warming", JOptionPane.WARNING_MESSAGE);
				}
				else{
					Float preço = bancoVeiculos.BuscarVeiculo(placaText.getText()).getDiaria();
					int dias = Integer.parseInt(textField_1.getText());
					double precoFinal = preço * dias;
					String PrecoString = Double.toString(precoFinal);
					ValorTotal.setText(PrecoString);
				}
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton_1.setForeground(Color.BLACK);
		
		JLabel lblNewLabel_2 = new JLabel("R$:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaAlugarVeiculo.class.getResource("/interfaceGrafica/Images/Cliente1.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton_1)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(placaText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
									.addComponent(lblNewLabel_1)))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ValorTotal))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(41))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(placaText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(ValorTotal)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
