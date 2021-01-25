package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import veiculo.BancoVeiculos;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class TelaVeiculo extends TelaCliente {

	private JPanel contentPane;
	protected static BancoVeiculos bancoVeiculos = new BancoVeiculos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVeiculo frame = new TelaVeiculo();
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
	public TelaVeiculo() {
		setTitle("Need For Rent");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaVeiculo.class.getResource("/interfaceGrafica/Images/VeiculoRent.png")));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 323, 420);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton PopularButton = new JButton("Listar Popular");
		PopularButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarPopular popular = new ListarPopular();
				popular.ShowPopulares();
				popular.setVisible(true);
			}
		});
		PopularButton.setBackground(Color.WHITE);
		PopularButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		PopularButton.setIcon(new ImageIcon(TelaVeiculo.class.getResource("/interfaceGrafica/Images/Popular.png")));
		
		JButton LuxoButton = new JButton("Listar Luxo");
		LuxoButton.setBackground(Color.WHITE);
		LuxoButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		LuxoButton.setForeground(Color.BLACK);
		LuxoButton.setIcon(new ImageIcon(TelaVeiculo.class.getResource("/interfaceGrafica/Images/Luxo.png")));
		LuxoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarLuxo luxo = new ListarLuxo();
				luxo.ShowLuxos();
				luxo.setVisible(true);
			}
		});
		
		JButton UtilitarioButton = new JButton("Listar Utilitario");
		UtilitarioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarUtilitario utilitario = new ListarUtilitario();
				utilitario.ShowUtilitarios();
				utilitario.setVisible(true);
			}
		});
		UtilitarioButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		UtilitarioButton.setBackground(Color.WHITE);
		UtilitarioButton.setIcon(new ImageIcon(TelaVeiculo.class.getResource("/interfaceGrafica/Images/Utilitario.png")));
		
		JButton btnNewButton = new JButton("Alugar Veiculo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAlugarVeiculo telaAlugar= new TelaAlugarVeiculo();
				telaAlugar.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setIcon(new ImageIcon(TelaVeiculo.class.getResource("/interfaceGrafica/Images/VeiculoRent.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(UtilitarioButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(PopularButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(LuxoButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
					.addGap(71))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(PopularButton)
					.addGap(18)
					.addComponent(LuxoButton)
					.addGap(18)
					.addComponent(UtilitarioButton)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
