
public class Aluno implements Comparable<Aluno>{
	private String nome;
	private double media;
	private String matricula;
	private int faltas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public int compareTo(Aluno aluno) {
		int result = this.nome.compareTo(aluno.nome);
		if(result > 0){
			 return 1;
		 }
		 else if(result < 0){
			 return -1;
		 }
		return 0;
	}
}
