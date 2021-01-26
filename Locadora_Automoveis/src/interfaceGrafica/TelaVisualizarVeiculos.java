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
import veiculo.Veiculo;

public class TelaVisualizarVeiculos extends TelaVeiculo {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisualizarVeiculos frame = new TelaVisualizarVeiculos();
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
	public TelaVisualizarVeiculos() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
				"Disponivel", "Diaria", "Cor", "Fabricante", "Modelo", "Placa"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Float.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
	}
	public void ShowVeiculos(){
		DefaultTableModel dtmLuxos = (DefaultTableModel) table.getModel();
		for (Veiculo obj: bancoVeiculos.visualizarTodosVeiculos()) {
				Object[] dados  = {obj.isDisponibilidade(),obj.getDiaria(),obj.getCor(),obj.getFabricante(),obj.getModelo(),obj.getPlaca()};
				dtmLuxos.addRow(dados);
			}
		}
	}
