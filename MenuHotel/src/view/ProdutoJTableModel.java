package view;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Produto;

public class ProdutoJTableModel extends AbstractTableModel {
	
	private ArrayList<Produto> lista;
	private String[] colunas = {"IdItem", "Nome", "Descricao", "Preco", "Categoria", "Ingredientes", "Alergenicos", "Disponibilidade", "TeorAcucar", "TeorGordura", "Calorias"};
	
	public ProdutoJTableModel(ArrayList<Produto> lista) {
		this.lista = lista;
	}
	

	public int getRowCount() {
		return this.lista.size();
	}


	public int getColumnCount() {
		return colunas.length;
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		Produto p = lista.get(rowIndex);
		if(columnIndex == 0) {
			return p.getId();
		}
		if(columnIndex == 1) {
			return p.getNome();
		}
		if(columnIndex == 2) {
			return p.getDescricao();
		}
		if(columnIndex == 3) {
			return p.getPreco();
		}
		if(columnIndex == 4) {
			return p.getCategoria();
		}
		if(columnIndex == 5) {
			return p.getIngrediente();
		}
		if(columnIndex == 6) {
			return p.getAlergenicos();
		}
		if(columnIndex == 7) {
			return p.getDisponibilidade();
		}
		if(columnIndex == 8) {
			return p.getAcucar();
		}
		if(columnIndex == 9) {
			return p.getGordura();
		}
		else if(columnIndex == 10) {
			return p.getCalorias();
		}
		return null;
	}

	public String getColumnName(int column) {
		return colunas[column];
	}

}
