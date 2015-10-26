import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;


public class Principal {

	public static void main(String[] args) {
		Random r = new Random();
		long inicioTempo, fimTempo, duracao1, duracao2;
		TreeSet<TestePerformance> treeSet = new TreeSet<TestePerformance>();
		LinkedHashSet<TestePerformance> linkedSet = new LinkedHashSet<TestePerformance>();
	
		//teste com TREESET-----------------------------------------------------
		// inicio do tempo
		inicioTempo = System.nanoTime(); 
		for (int i = 0; i < 10000; i++) { 
			int num = r.nextInt(10000 - 10) + 10; 
			treeSet.add(new TestePerformance(num)); 
		} 
		// fim do tempo
		fimTempo = System.nanoTime();
		duracao1 = fimTempo - inicioTempo;
		System.out.println("Tempo ---- TreeSet: " + duracao1); 
		
		//teste com LINKEHASHSET-----------------------------------------------------
		// inicio do tempo
		inicioTempo = System.nanoTime(); 
		for (int i = 0; i < 10000; i++) { 
			int num = r.nextInt(10000 - 10) + 10; 
			linkedSet.add(new TestePerformance(num)); 
		} 
		// fim do tempo 
		fimTempo = System.nanoTime(); 
		duracao2 = fimTempo - inicioTempo; 
		System.out.println("Tempo ---- LinkedHashSet: " + duracao2);

		
		if(duracao1<duracao2)
			System.out.println("\nTreeSet CAMPEAO - Mais rapido!!!");
		else
			System.out.println("\nLinkedHashSet CAMPEAO - Mais rapido!!!");

	}
}