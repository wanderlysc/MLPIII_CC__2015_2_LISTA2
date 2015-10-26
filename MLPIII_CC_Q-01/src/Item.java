

public class Item implements Comparable<Item>{
	
	private String codigoItem;
	private String descricaoItem;
	
	public String getCodigoItem() {
		return codigoItem;
	}
	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}
	public String getDescricaoItem() {
		return descricaoItem;
	}
	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	
	public int compareTo(Item item) {
	    int result = this.codigoItem.compareTo(item.codigoItem);
		if(result > 0){
			 return 1;
		 }
		 else if(result < 0){
			 return -1;
		 }
		return 0;
	
	}


}
