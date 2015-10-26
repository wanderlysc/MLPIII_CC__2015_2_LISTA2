import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Inventario {
	
	private ArrayList<Item> colecaoItens = new ArrayList<Item>();

	public ArrayList<Item> getColecaoItens() {
		return colecaoItens;
	}

	public void setColecaoItens(Item colecaoItens) {
		this.colecaoItens.add(colecaoItens);
		Collections.sort(this.colecaoItens);

	}
	
}
