package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import veiculo.Popular;
import veiculo.Veiculo;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ListarPopular extends TelaVeiculo {

	private JPanel contentPane;
	private JTable table;
	static Object[] dados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarPopular frame = new ListarPopular();
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
	public ListarPopular() {
		setBounds(100, 100, 675, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 654, 317);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Fabricante", "Modelo", "Placa", "Diaria", "Consumo", "Ar Condicionado", "Cambio", "Cor"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Float.class, Float.class, Boolean.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(5).setPreferredWidth(92);
		scrollPane.setViewportView(table);
	}
	
public void ShowPopulares(){
	DefaultTableModel dtmPopulares = (DefaultTableModel) table.getModel();
	for (Popular obj: bancoVeiculos.visualizarPopulares()) {
		if (obj.isDisponibilidade() == true) {
			Object[] dados  = {obj.getFabricante(),obj.getModelo(),obj.getPlaca(),obj.getDiaria(),obj.getConsumo(),obj.isArCondicionado(),
					obj.getCambio(),obj.getCor()};
			dtmPopulares.addRow(dados);
		}
}
}
}

