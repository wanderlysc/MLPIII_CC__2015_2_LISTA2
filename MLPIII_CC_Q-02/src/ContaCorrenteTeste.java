import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class ContaCorrenteTeste extends TestCase{
	List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
	ContaCorrente conta = new ContaCorrente();
	public void testColecaoVazia()
	{
		assertTrue(contas.isEmpty());
	}
	
	public void testColecaoComUmItem(){
		conta.setIdConta("9087-4");
		conta.setNomeCliente("Wanderly");
		contas.add(conta);
		assertEquals(1, contas.size());
	}
}
