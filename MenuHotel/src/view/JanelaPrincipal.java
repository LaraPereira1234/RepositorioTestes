package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Produto;
import view.ProdutoJTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

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
	private JTextField txtTeorAcucar;
	private JTextField txtTeorGordura;
	private JTextField txtCalorias;
	ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	private JTable table;

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
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("");
		lblMenu.setIcon(new ImageIcon("C:\\Users\\Usuário\\Downloads\\Group 3.png"));
		lblMenu.setBounds(1, -3, 420, 1087);
		contentPane.add(lblMenu);
		
		JLabel lblBarra = new JLabel("");
		lblBarra.setIcon(new ImageIcon("C:\\Users\\Usuário\\Downloads\\Location.png"));
		lblBarra.setBounds(418, 2, 1500, 62);
		contentPane.add(lblBarra);
		
		JLabel lblBarra2 = new JLabel("");
		lblBarra2.setIcon(new ImageIcon("C:\\Users\\Usuário\\Downloads\\Hero block.png"));
		lblBarra2.setBounds(439, 115, 1455, 126);
		contentPane.add(lblBarra2);
		
		JLabel lblIdItem = new JLabel("Id do Item:");
		lblIdItem.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblIdItem.setBounds(463, 280, 94, 14);
		contentPane.add(lblIdItem);
		
		txtIdItem = new JTextField();
		txtIdItem.setBounds(462, 297, 58, 20);
		contentPane.add(txtIdItem);
		txtIdItem.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblNome.setBounds(566, 281, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(566, 297, 104, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblDescricao.setBounds(708, 281, 74, 20);
		contentPane.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(706, 297, 263, 20);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblPreco = new JLabel("Preço:");
		lblPreco.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblPreco.setBounds(1015, 281, 46, 20);
		contentPane.add(lblPreco);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(1015, 297, 86, 20);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblCategoria.setBounds(1142, 281, 74, 20);
		contentPane.add(lblCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(1142, 297, 94, 20);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		JLabel lblIngredientes = new JLabel("Ingredientes:");
		lblIngredientes.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblIngredientes.setBounds(1256, 281, 104, 20);
		contentPane.add(lblIngredientes);
		
		txtIngredientes = new JTextField();
		txtIngredientes.setBounds(1274, 297, 109, 20);
		contentPane.add(txtIngredientes);
		txtIngredientes.setColumns(10);
		
		JLabel lblAlergenicos = new JLabel("Alergênicos:");
		lblAlergenicos.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblAlergenicos.setBounds(463, 339, 86, 20);
		contentPane.add(lblAlergenicos);
		
		txtAlergenicos = new JTextField();
		txtAlergenicos.setBounds(463, 356, 104, 20);
		contentPane.add(txtAlergenicos);
		txtAlergenicos.setColumns(10);
		
		JLabel lblDisponibilidade = new JLabel("Disponibilidade:");
		lblDisponibilidade.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblDisponibilidade.setBounds(594, 339, 126, 20);
		contentPane.add(lblDisponibilidade);
		
		txtDisponibilidade = new JTextField();
		txtDisponibilidade.setBounds(611, 356, 86, 20);
		contentPane.add(txtDisponibilidade);
		txtDisponibilidade.setColumns(10);
		
		JLabel lblTeorAcucar = new JLabel("Alto teor de açúcar:");
		lblTeorAcucar.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblTeorAcucar.setBounds(736, 339, 150, 20);
		contentPane.add(lblTeorAcucar);
		
		txtTeorAcucar = new JTextField();
		txtTeorAcucar.setBounds(736, 356, 86, 20);
		contentPane.add(txtTeorAcucar);
		txtTeorAcucar.setColumns(10);
		
		JLabel lblTeorGordura = new JLabel("Alto teor em gordura saturada:");
		lblTeorGordura.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblTeorGordura.setBounds(873, 339, 217, 20);
		contentPane.add(lblTeorGordura);
		
		txtTeorGordura = new JTextField();
		txtTeorGordura.setBounds(873, 356, 86, 20);
		contentPane.add(txtTeorGordura);
		txtTeorGordura.setColumns(10);
		
		JLabel lblCalorias = new JLabel("Número de calorias:");
		lblCalorias.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		lblCalorias.setBounds(1080, 339, 156, 14);
		contentPane.add(lblCalorias);
		
		txtCalorias = new JTextField();
		txtCalorias.setBounds(1080, 356, 86, 20);
		contentPane.add(txtCalorias);
		txtCalorias.setColumns(10);
		
		table = new JTable();
		table.setBounds(763, 643, 263, 0);
		contentPane.add(table);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txtIdItem.getText();
				if(id.length() == 0) {
					JOptionPane.showMessageDialog(null, "Campo Id do Item é obrigatório!");
				return;
			}
			
			String nome = txtNome.getText();
			if(nome.length() == 0){
				JOptionPane.showMessageDialog(null, "Campo Nome é obrigatório!");
				return;
			}
			
			String descricao = txtDescricao.getText();
			String preco = txtPreco.getText();
			String categoria = txtCategoria.getText();
			String ingredientes = txtIngredientes.getText();
			String alergenicos = txtAlergenicos.getText();
			String disponibilidade = txtDisponibilidade.getText();
			String acucar = txtTeorAcucar.getText();
			String gordura = txtTeorGordura.getText();
			
			Produto p = new Produto();
		//	p.setId(id);
			p.setNome(nome);
			p.setDescricao(descricao);
		//	p.setPreco(preco);
			p.setCategoria(categoria);
			p.setIngrediente(ingredientes);
			p.setAlergenicos(alergenicos);
		//	p.setDisponibilidade(disponibilidade);
			p.setAcucar(acucar);
			p.setGordura(gordura);
			
			listaProdutos.add(p);
			
		//	atualizarJTableModel();
		//	limparCampos();
			
			}
			
		});
		btnAdicionar.setBackground(Color.BLACK);
		btnAdicionar.setForeground(Color.BLACK);
		btnAdicionar.setFont(new Font("Source Sans Pro", Font.PLAIN, 14));
		btnAdicionar.setBounds(536, 414, 109, 27);
		contentPane.add(btnAdicionar);
		
		JButton btnAlterar = new JButton("Alterar");
		JanelaPrincipal estaJanela = this;
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int linha = table.getSelectedRow();
				Produto produtoSelecionado = listaProdutos.get(linha);
				
		//		JanelaAlterarProduto janelaAlterar = new JanelaAlterarProduto(produtoSelecionado, estaJanela);
		//		janelaAlterar.setVisible(true);
			}
	//	});
	//	btnAlterar.setBackground(Color.DARK_GRAY);
	//	btnAlterar.setFont(new Font("Source Sans Pro", Font.PLAIN, 14));
	//	btnAlterar.setBounds(733, 414, 109, 27);
	//	contentPane.add(btnAlterar);
	
		public void atualizarJTableModel() {
			table.setModel(new ProdutoJTableModel(listaProdutos));
		}
		
		public void limparCampos() {
			txtIdItem.setText("");
			txtNome.setText("");
			txtDescricao.setText("");
			txtPreco.setText("");
			txtCategoria.setText("");
			txtIngredientes.setText("");
			txtAlergenicos.setText("");
			txtDisponibilidade.setText("");
			txtTeorAcucar.setText("");
			txtTeorGordura.setText("");
			txtCalorias.setText("");
		}
		
		public void atualizarDadosProduto(Produto produto) {
			int linhaSelecionada = table.getSelectedRow();
			listaProdutos.set(linhaSelecionada, produto); 
			atualizarJTableModel();
		//}
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				if(idx_linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione a pessoa para excluir!");
					return;
				}
				
				listaProdutos.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}

			
		});
		btnExcluir.setBackground(Color.LIGHT_GRAY);
		btnExcluir.setFont(new Font("Source Sans Pro", Font.PLAIN, 14));
		btnExcluir.setBounds(939, 414, 109, 27);
		contentPane.add(btnExcluir);
		
	//}
	}
}

