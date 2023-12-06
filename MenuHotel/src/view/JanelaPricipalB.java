package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class JanelaPricipalB extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPricipalB frame = new JanelaPricipalB();
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
	public JanelaPricipalB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1083);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 420, 1083);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Group 3.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(421, 0, 1700, 60);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Location.png"));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Hero block.png"));
		lblNewLabel_2.setBounds(444, 93, 1442, 95);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Id do Item:");
		lblNewLabel_3.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(542, 257, 100, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(542, 281, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nome:");
		lblNewLabel_4.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(795, 259, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(795, 281, 150, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Descrição:");
		lblNewLabel_5.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(1047, 259, 100, 17);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(1047, 281, 180, 55);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Categoria:");
		lblNewLabel_6.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(1381, 259, 100, 17);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(1381, 280, 100, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("Ingredientes:");
		lblNewLabel_7.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(1618, 259, 100, 17);
		contentPane.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(1618, 281, 180, 55);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Alergênicos:");
		lblNewLabel_8.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(542, 377, 100, 17);
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(542, 400, 150, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Disponibilidade:");
		lblNewLabel_9.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(816, 380, 140, 17);
		contentPane.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(816, 400, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}
