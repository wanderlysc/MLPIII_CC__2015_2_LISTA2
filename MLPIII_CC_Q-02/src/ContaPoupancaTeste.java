import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;


public class ContaPoupancaTeste extends TestCase{
	List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
	ContaPoupanca conta = new ContaPoupanca();

	public void testColecaoComUmItem(){
		conta.setIdConta("9087-4");
		conta.setNomeCliente("Wanderly");
		contas.add(conta);
		assertNotNull(null, contas.size());
	}
	public void testColecaoRemocao(){
		conta = null;
		assertNull(conta);
	}
	public void testColecaoComparacao(){
		ContaPoupanca conta1 = new ContaPoupanca();
		ContaPoupanca conta2 = new ContaPoupanca();
		
		conta1.setIdConta("9087-4");
		conta1.setNomeCliente("Wanderly");
		contas.add(conta1);
		
		conta2.setIdConta("9087-4");
		conta2.setNomeCliente("Thiago");
		contas.add(conta2);
		
		assertSame(conta1.getIdConta(), conta2.getIdConta());
		assertNotSame(conta1.getNomeCliente(), conta2.getNomeCliente());
		
		if(contas == null)
			fail();
	}
}
