package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import veiculo.Luxo;
import veiculo.Popular;

public class ListarLuxo extends TelaVeiculo {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarLuxo frame = new ListarLuxo();
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
	public ListarLuxo() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 602, 311);
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
				"Fabricante", "Modelo", "Cor", "Placa", "Diaria", "Motor", "Cambio", "Conversivel"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Float.class, String.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, true, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
	}
	
	public void ShowLuxos(){
		DefaultTableModel dtmLuxos = (DefaultTableModel) table.getModel();
		for (Luxo obj: bancoVeiculos.visualizarLuxos()) {
			if (obj.isDisponibilidade() == true) {
				Object[] dados  = {obj.getFabricante(),obj.getModelo(),obj.getCor(),obj.getPlaca(),obj.getDiaria(),obj.getMotor(),obj.getCambio(),obj.isConversivel()};
				dtmLuxos.addRow(dados);
			}
		}
	}

}
