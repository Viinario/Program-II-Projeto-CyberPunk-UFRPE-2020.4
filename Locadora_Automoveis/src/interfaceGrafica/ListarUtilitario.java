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
import veiculo.Utilitario;

public class ListarUtilitario extends TelaVeiculo {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarUtilitario frame = new ListarUtilitario();
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
	public ListarUtilitario() {
		setBounds(100, 100, 715, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Fabricante", "Modelo", "Cor", "Placa", "Diaria", "Assentos", "Carga Maxima", "Quatro Por Quatro"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Float.class, Integer.class, Integer.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(6).setPreferredWidth(89);
		table.getColumnModel().getColumn(7).setPreferredWidth(121);
		scrollPane.setViewportView(table);
	}
	public void ShowUtilitarios(){
		DefaultTableModel dtmPopulares = (DefaultTableModel) table.getModel();
		for (Utilitario obj: bancoVeiculos.visualizarUtilitarios()) {
			if (obj.isDisponibilidade() == true) {
				Object[] dados  = {obj.getFabricante(),obj.getModelo(),obj.getCor(),obj.getPlaca(),obj.getDiaria(),obj.getAssentos(),
						obj.getCargaMaxima(),obj.isQuatroXquatro()};
				dtmPopulares.addRow(dados);
			}
		}
	}
}
