package interfaceGrafica;

import interfaces.InterfaceLogin;
import pessoa.BancoPessoas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class SignIn extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static InterfaceLogin bancoPessoas = new BancoPessoas();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setTitle("Need For Rent");
		setForeground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SignIn.class.getResource("/interfaceGrafica/Images/login69.png")));
		setResizable(false);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 448);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SignIn.class.getResource("/interfaceGrafica/Images/login-64.png")));
		lblNewLabel.setBounds(36, 149, 73, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(SignIn.class.getResource("/interfaceGrafica/Images/carro.png")));
		lblNewLabel_1.setBounds(0, 283, 384, 115);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Login:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(147, 172, 59, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(119, 212, 79, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JPasswordField();
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setBounds(208, 211, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setBounds(208, 178, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Don't have account yet?\r\n");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(104, 21, 178, 37);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setSelectedIcon(new ImageIcon(SignIn.class.getResource("/interfaceGrafica/Images/SignUp.png")));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon(SignIn.class.getResource("/interfaceGrafica/Images/SignUp.png")));
		btnNewButton.setBounds(149, 56, 79, 29);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(e -> SignUpPanel());
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(SignIn.class.getResource("/interfaceGrafica/Images/flogo.png")));
		lblNewLabel_5.setBounds(305, 11, 79, 86);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setIcon(new ImageIcon(SignIn.class.getResource("/interfaceGrafica/Images/Signin.png")));
		btnNewButton_1.setBounds(208, 242, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(e -> SignInAction());
	}
	  public void  SignInAction(){
				if(textField.getText().isEmpty() == true || textField_1.getText().isEmpty() == true) {
					JOptionPane.showMessageDialog(null,"Preencha Todos Os Campos","Warming", JOptionPane.WARNING_MESSAGE);
					}
				else {
					if (bancoPessoas.login(textField_1.getText(), textField.getText()) == true){
				}
					else {
						JOptionPane.showMessageDialog(null,"Conta Não Encontrada","Login Error", JOptionPane.WARNING_MESSAGE);
					}
	}
		}
	public void SignUpPanel() {
		SignUp signUp = new SignUp();
		signUp.setVisible(true);
	  }
}

