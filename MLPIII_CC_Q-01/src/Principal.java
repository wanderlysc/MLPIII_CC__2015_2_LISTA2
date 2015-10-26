import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int resposta = 0;
		String itens="", dados="";
		Inventario inventario = new Inventario();
		
		do{
            try {
                resposta = Integer.parseInt(JOptionPane.showInputDialog("---------------COLECAO-------------\nEscolha:\n1. Teste se a Colecao esta Vazia\n2. Buscar na Colecao\n3. Inserir Item na Colecao\n4. Consultar Inventario\n5. Sair\n"));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Informe apenas números");
            }
            switch(resposta)
            {
				case 1:
					boolean teste = true;
					for( Item  colecao: inventario.getColecaoItens() )  
			        { 
						teste = false;
			        }
					if(teste)
						JOptionPane.showMessageDialog(null, "Colecao VAZIA");
					else 
						JOptionPane.showMessageDialog(null, "Existem Itens na Colecao");
					break;
				case 2:
					int cont = 0;
					itens = JOptionPane.showInputDialog("Informe o codigo para buscar o ITEM");
					for( Item  colecao: inventario.getColecaoItens() )  
			        { 
						if(itens.equals(colecao.getCodigoItem())){
							JOptionPane.showMessageDialog(null, "Inventario\n"+colecao.getCodigoItem()+"---"+colecao.getDescricaoItem());
							cont++;
							break;
						}
			        }
					if(cont==0)
						JOptionPane.showMessageDialog(null, "Codigo nao encontrado");
					break;
				case 3:
					Item item = new Item();
					item.setCodigoItem(JOptionPane.showInputDialog("Informe o codigo do Item"));
					item.setDescricaoItem(JOptionPane.showInputDialog("Informe a descricao do Item"));
					inventario.setColecaoItens(item);
					break;
				case 4:
					dados ="";
					for( Item  colecao: inventario.getColecaoItens() )  
			        { 
						dados += colecao.getCodigoItem()+"---"+colecao.getDescricaoItem()+"\n";           			 
			        }  
					JOptionPane.showMessageDialog(null, "INVENTARIO Ordenado pelo Codigo\n"+dados);
					break;
				case 5:
					//sair
					break;
            }	
		}while (resposta != 5);
	}
}
