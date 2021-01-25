package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import interfaces.InterfaceLogin;
import pessoa.BancoPessoas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class SignUp extends SignIn {

	private JPanel contentPane;
	private JTextField nomeText;
	private JTextField cnhText;
	private JTextField loginText;
	private JTextField passText;
	private JTextField ConfPassText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp.class.getResource("/interfaceGrafica/Images/login69.png")));
		setTitle("SignUp");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
		});
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 400, 444);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("CNH:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		
		JLabel lblNewLabel_2 = new JLabel("Login:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_3.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password:");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_4.setForeground(Color.WHITE);
		
		nomeText = new JTextField();
		nomeText.setColumns(10);
		
		cnhText = new JTextField();
		cnhText.setColumns(10);
		
		loginText = new JTextField();
		loginText.setColumns(10);
		
		passText = new JPasswordField();
		passText.setColumns(10);
		
		ConfPassText = new JPasswordField();
		ConfPassText.setColumns(10);
		
		JButton SignUpButton = new JButton("");
		SignUpButton.setBackground(Color.BLACK);
		SignUpButton.setForeground(new Color(0, 0, 0));
		SignUpButton.setIcon(new ImageIcon(SignUp.class.getResource("/interfaceGrafica/Images/SignUp.png")));
		SignUpButton.addActionListener(e -> SignUpAction());
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(SignUp.class.getResource("/interfaceGrafica/Images/flogo.png")));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(SignUp.class.getResource("/interfaceGrafica/Images/login-64.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_4)
									.addGap(6)
									.addComponent(ConfPassText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(18)
									.addComponent(nomeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_1))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(loginText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cnhText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(115)
							.addComponent(SignUpButton))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(85)
							.addComponent(lblNewLabel_6)
							.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(64)
							.addComponent(lblNewLabel_6)))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(nomeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(cnhText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(loginText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(passText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(ConfPassText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addComponent(SignUpButton)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void SignUpAction() {
		if(nomeText.getText().isEmpty() == true || cnhText.getText().isEmpty() == true || loginText.getText().isEmpty() == true
				|| passText.getText().isEmpty() == true || ConfPassText.getText().isEmpty() == true) {
			JOptionPane.showMessageDialog(null,"Preencha Todos Os Campos","Warning", JOptionPane.WARNING_MESSAGE);
		}else if(passText.getText().equals(ConfPassText.getText()) == false){
			JOptionPane.showMessageDialog(null,"Passwords não são iguais","Warning", JOptionPane.WARNING_MESSAGE);
		}else{
			bancoPessoas.registrar(nomeText.getText(), cnhText.getText(),loginText.getText(), passText.getText());
		}
	}
}
