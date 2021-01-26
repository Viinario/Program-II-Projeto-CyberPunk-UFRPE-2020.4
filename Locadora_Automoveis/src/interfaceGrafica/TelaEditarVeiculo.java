package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import veiculo.Veiculo;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class TelaEditarVeiculo extends TelaVeiculo {

	private JPanel contentPane;
	private JTextField diariaText;
	private JTextField placaText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEditarVeiculo frame = new TelaEditarVeiculo();
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
	public TelaEditarVeiculo() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 340, 270);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		placaText = new JTextField();
		placaText.setBounds(125, 56, 113, 20);
		contentPane.add(placaText);
		placaText.setColumns(10);
		
		diariaText = new JTextField();
		diariaText.setBounds(175, 184, 104, 20);
		contentPane.add(diariaText);
		diariaText.setColumns(10);
		
		JRadioButton rdbtnNaoDisponivel = new JRadioButton("N\u00E3o disponivel");
		rdbtnNaoDisponivel.setBackground(Color.WHITE);
		rdbtnNaoDisponivel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		rdbtnNaoDisponivel.setBounds(171, 136, 127, 23);
		contentPane.add(rdbtnNaoDisponivel);
		
		JRadioButton rdbtnDisponivel = new JRadioButton("Disponivel");
		rdbtnDisponivel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		rdbtnDisponivel.setBackground(Color.WHITE);
		rdbtnDisponivel.setBounds(171, 110, 127, 23);
		contentPane.add(rdbtnDisponivel);
		
		ButtonGroup g = new ButtonGroup();
		g.add(rdbtnDisponivel);
		g.add(rdbtnNaoDisponivel);
		
		JButton btnNewButton = new JButton("Disponibilidade");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDisponivel.isSelected() == false && rdbtnDisponivel.isSelected() == false) {
					JOptionPane.showMessageDialog(null,"Selecione uma das Opções (Disponivel / Não Disponivel)","Edit Error", JOptionPane.WARNING_MESSAGE);
				}
				else if(bancoVeiculos.BuscarVeiculo(placaText.getText()) == null) {
					JOptionPane.showMessageDialog(null,"Veiculo Não Encontrado","Edit Error", JOptionPane.WARNING_MESSAGE);
				}else {
					Veiculo carro = bancoVeiculos.BuscarVeiculo(placaText.getText());
					if(rdbtnNaoDisponivel.isSelected() == true) {
						carro.setDisponibilidade(false);
						JOptionPane.showMessageDialog(null,"Alteração Realizada Com Sucesso");
						System.out.println(carro);
						
					}
					else if(rdbtnDisponivel.isSelected() == true) {
						carro.setDisponibilidade(true);
						JOptionPane.showMessageDialog(null,"Alteração Realizada Com Sucesso");
					}
				}
				}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 110, 155, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pre\u00E7o Diaria");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(placaText.getText() == null) {
					JOptionPane.showMessageDialog(null,"Ensira a Placa do Veiculo","Edit Error", JOptionPane.WARNING_MESSAGE);
				}else if(bancoVeiculos.BuscarVeiculo(placaText.getText()) == null) {
					JOptionPane.showMessageDialog(null,"Veiculo Não Encontrado","Edit Error", JOptionPane.WARNING_MESSAGE);
				}else {
					Veiculo carro = bancoVeiculos.BuscarVeiculo(placaText.getText());
					carro.setDiaria(Float.parseFloat(diariaText.getText()));
					JOptionPane.showMessageDialog(null,"Alteração Realizada Com Sucesso");
				}
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_1.setBounds(10, 182, 155, 23);
		contentPane.add(btnNewButton_1);
		
		
		JLabel lblNewLabel = new JLabel("Placa Veiculo:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(26, 54, 113, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Editar Veiculo");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(96, 11, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaEditarVeiculo.class.getResource("/interfaceGrafica/Images/Popular.png")));
		lblNewLabel_2.setBounds(238, 11, 71, 31);
		contentPane.add(lblNewLabel_2);
		
		
		
	}
}
