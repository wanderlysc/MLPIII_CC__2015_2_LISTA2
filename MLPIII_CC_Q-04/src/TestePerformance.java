//Criada para testes de performance 
public class TestePerformance implements Comparable<TestePerformance>{
	private int size;
	
	public TestePerformance(int s) {
		size = s;
	}
	public String toString() { 
		return size + ""; 
	}
	public int compareTo(TestePerformance o) { 
		return size - o.size; 
	}

}
