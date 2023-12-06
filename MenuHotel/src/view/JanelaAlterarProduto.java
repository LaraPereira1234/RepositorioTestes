package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaAlterarProduto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtCategoria;
	private JTextField txtPreco;
	private JTextField txtIngredientes;
	private JTextField txtAlergenicos;
	private JTextField txtDisponibilidade;
	private JTextField txtTeorAcucar;
	private JTextField txtTeorGordura;
	private JTextField txtCalorias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaAlterarProduto frame = new JanelaAlterarProduto();
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
	public JanelaAlterarProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(237, 237, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSigh = new JLabel("");
		lblSigh.setIcon(new ImageIcon("C:\\Users\\Usuário\\Downloads\\layer1 (1).png"));
		lblSigh.setBounds(21, 11, 71, 105);
		contentPane.add(lblSigh);
		
		JLabel lblAlterar = new JLabel("Alterar Produto");
		lblAlterar.setForeground(new Color(3, 65, 75));
		lblAlterar.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 19));
		lblAlterar.setBounds(327, 37, 150, 14);
		contentPane.add(lblAlterar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(3, 65, 75));
		lblNome.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		lblNome.setBounds(185, 93, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setForeground(new Color(3, 65, 75));
		txtNome.setBounds(185, 112, 122, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setForeground(new Color(3, 65, 75));
		lblDescricao.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		lblDescricao.setBounds(346, 89, 92, 23);
		contentPane.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setForeground(new Color(3, 65, 75));
		txtDescricao.setBounds(346, 112, 155, 36);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setForeground(new Color(3, 65, 75));
		lblCategoria.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		lblCategoria.setBounds(185, 157, 79, 20);
		contentPane.add(lblCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(185, 180, 86, 20);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		JLabel lblPreco = new JLabel("Preço:");
		lblPreco.setForeground(new Color(3, 65, 75));
		lblPreco.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		lblPreco.setBounds(538, 94, 46, 14);
		contentPane.add(lblPreco);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(538, 112, 86, 20);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		JLabel lblIngredientes = new JLabel("Ingredientes:");
		lblIngredientes.setForeground(new Color(3, 65, 75));
		lblIngredientes.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		lblIngredientes.setBounds(315, 158, 86, 18);
		contentPane.add(lblIngredientes);
		
		txtIngredientes = new JTextField();
		txtIngredientes.setBounds(315, 180, 172, 36);
		contentPane.add(txtIngredientes);
		txtIngredientes.setColumns(10);
		
		JLabel lblAlergenicos = new JLabel("Alergênicos:");
		lblAlergenicos.setForeground(new Color(3, 65, 75));
		lblAlergenicos.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		lblAlergenicos.setBounds(523, 157, 79, 20);
		contentPane.add(lblAlergenicos);
		
		txtAlergenicos = new JTextField();
		txtAlergenicos.setBounds(523, 180, 101, 20);
		contentPane.add(txtAlergenicos);
		txtAlergenicos.setColumns(10);
		
		JLabel lblDisponibilidade = new JLabel("Disponibilidade:");
		lblDisponibilidade.setForeground(new Color(3, 65, 75));
		lblDisponibilidade.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		lblDisponibilidade.setBounds(185, 227, 101, 23);
		contentPane.add(lblDisponibilidade);
		
		txtDisponibilidade = new JTextField();
		txtDisponibilidade.setBounds(185, 256, 86, 20);
		contentPane.add(txtDisponibilidade);
		txtDisponibilidade.setColumns(10);
		
		JLabel lblTeorAcucar = new JLabel("Alto teor de açúcar:");
		lblTeorAcucar.setForeground(new Color(3, 65, 75));
		lblTeorAcucar.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		lblTeorAcucar.setBounds(327, 227, 152, 23);
		contentPane.add(lblTeorAcucar);
		
		txtTeorAcucar = new JTextField();
		txtTeorAcucar.setBounds(327, 256, 86, 20);
		contentPane.add(txtTeorAcucar);
		txtTeorAcucar.setColumns(10);
		
		JLabel lblTeorGordura = new JLabel("Alto teor em gordura:");
		lblTeorGordura.setForeground(new Color(3, 65, 75));
		lblTeorGordura.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		lblTeorGordura.setBounds(487, 229, 137, 18);
		contentPane.add(lblTeorGordura);
		
		txtTeorGordura = new JTextField();
		txtTeorGordura.setBounds(487, 256, 92, 20);
		contentPane.add(txtTeorGordura);
		txtTeorGordura.setColumns(10);
		
		JLabel lblCalorias = new JLabel("Número de calorias:");
		lblCalorias.setForeground(new Color(3, 65, 75));
		lblCalorias.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		lblCalorias.setBounds(185, 287, 122, 14);
		contentPane.add(lblCalorias);
		
		txtCalorias = new JTextField();
		txtCalorias.setBounds(185, 309, 86, 20);
		contentPane.add(txtCalorias);
		txtCalorias.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//produtoSelecionado.setNome(txtNome.getText());
				//produtoSelecionado.setDescricao(txtDescricao.getText());
			//	produtoSelecionado.setPreco(txtPreco.getText());
				//produtoSelecionado.setCategoria(txtCategoria.getText());
				//produtoSelecionado.setIngredientes(txtIngredientes.getText());
				//produtoSelecionado.setAlergenicos(txtAlergenicos.getText());
				//produtoSelecionado.setDisponibilidade(txtDisponibilidade.getText());
				//produtoSelecionado.setAcucar(txtTeorAcucar.getText());
			//	produtoSelecionado.setGordura(txtTeorGordura.getText());
			//	produtoSelecionado.setCalorias(txtCalorias.getText());
				
			//	janela.atualizarDadosProduto(produtoSelecionado);
				dispose();
			}
		});
		btnSalvar.setBackground(new Color(3, 65, 75));
		btnSalvar.setForeground(new Color(3, 65, 75));
		btnSalvar.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		btnSalvar.setBounds(288, 356, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setForeground(new Color(3, 65, 75));
		btnCancelar.setFont(new Font("Source Sans Pro", Font.PLAIN, 14));
		btnCancelar.setBounds(421, 356, 89, 23);
		contentPane.add(btnCancelar);
	}

}
