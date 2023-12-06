package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Produto;
import view.ProdutoJTableModel;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdItem;
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtPreco;
	private JTextField txtCategoria;
	private JTextField txtIngredientes;
	private JTextField txtAlergenicos;
	private JTextField txtDisponibilidade;
	private JTextField txtCalorias;
	ArrayList<Produto> listaProdutos = new ArrayList<Produto>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1083);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(237, 237, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblMenu = new JLabel("");
		lblMenu.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Group 3.png"));
		
		JLabel lblBarra = new JLabel("");
		lblBarra.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Location.png"));
		
		JLabel lblBarra2 = new JLabel("");
		lblBarra2.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Hero block.png"));
		
		JLabel lblIdItem = new JLabel("Id do Item:");
		lblIdItem.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		txtIdItem = new JTextField();
		txtIdItem.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		
		JLabel lblPreco = new JLabel("Preço:");
		lblPreco.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		
		JLabel lblIngredientes = new JLabel("Ingredientes:");
		lblIngredientes.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		txtIngredientes = new JTextField();
		txtIngredientes.setColumns(10);
		
		JLabel lblAlergenicos = new JLabel("Alergênicos:");
		lblAlergenicos.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		txtAlergenicos = new JTextField();
		txtAlergenicos.setColumns(10);
		
		JLabel lblDisponibilidade = new JLabel("Disponibilidade:");
		lblDisponibilidade.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		txtDisponibilidade = new JTextField();
		txtDisponibilidade.setColumns(10);
		
		JLabel lblTeorAcucar = new JLabel("Alto teor de açúcar:");
		lblTeorAcucar.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		JLabel lblTeorGordura = new JLabel("Alto teor em gordura saturada:");
		lblTeorGordura.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		JLabel lblCalorias = new JLabel("Número de calorias:");
		lblCalorias.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		
		txtCalorias = new JTextField();
		txtCalorias.setColumns(10);
		
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
			
		});
		btnAdicionar.setBackground(Color.BLACK);
		btnAdicionar.setForeground(new Color(255, 255, 255));
		btnAdicionar.setFont(new Font("Source Sans Pro", Font.PLAIN, 14));
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setForeground(new Color(255, 255, 255));
		JanelaPrincipal estaJanela = this;
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnAlterar.setBackground(Color.DARK_GRAY);
		btnAlterar.setFont(new Font("Source Sans Pro", Font.PLAIN, 14));
	
		
		
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}

			
		});
		btnExcluir.setBackground(new Color(192, 192, 192));
		btnExcluir.setFont(new Font("Source Sans Pro", Font.PLAIN, 14));
		
		JRadioButton rdbtnAcucarSim = new JRadioButton("Sim");
		
		JRadioButton rdbtnAcucarNao = new JRadioButton("Não");
		
		JRadioButton rdbtnGorduraSim = new JRadioButton("Sim");
		
		JRadioButton rdbtnGorduraNao = new JRadioButton("Não");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(417)
					.addComponent(lblBarra))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(438)
					.addComponent(lblBarra2))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(462)
					.addComponent(lblIdItem, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblDescricao, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(lblCategoria, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(txtIngredientes, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(535))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(462)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAlergenicos, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtAlergenicos, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(lblDisponibilidade, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(137)
							.addComponent(rdbtnGorduraSim, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(137)
							.addComponent(lblTeorGordura, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTeorAcucar, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(344)
							.addComponent(lblCalorias, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(725)
					.addComponent(rdbtnAcucarNao, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(rdbtnGorduraNao, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(535)
					.addComponent(btnAdicionar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(88)
					.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(97)
					.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(1079)
					.addComponent(txtCalorias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(1141)
					.addComponent(txtCategoria, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(461)
					.addComponent(txtIdItem, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(1014)
					.addComponent(lblPreco, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addComponent(lblMenu)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(1255)
					.addComponent(lblIngredientes, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(610)
					.addComponent(txtDisponibilidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(725)
					.addComponent(rdbtnAcucarSim, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblBarra)
					.addGap(51)
					.addComponent(lblBarra2)
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIdItem, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDescricao, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(16)
									.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(17)
							.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(lblCategoria, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(17)
							.addComponent(txtIngredientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAlergenicos, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(17)
							.addComponent(txtAlergenicos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblDisponibilidade, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(16)
							.addComponent(rdbtnGorduraSim))
						.addComponent(lblTeorGordura, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTeorAcucar, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCalorias, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnAcucarNao)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(rdbtnGorduraNao)))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAdicionar)
						.addComponent(btnAlterar)
						.addComponent(btnExcluir)))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(359)
					.addComponent(txtCalorias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(300)
					.addComponent(txtCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(300)
					.addComponent(txtIdItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(284)
					.addComponent(lblPreco, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 1083, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(284)
					.addComponent(lblIngredientes, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(359)
					.addComponent(txtDisponibilidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(358)
					.addComponent(rdbtnAcucarSim))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	}



