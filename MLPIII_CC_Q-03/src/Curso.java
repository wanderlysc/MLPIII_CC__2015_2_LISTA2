import java.util.ArrayList;
import java.util.Collections;


public class Curso {
	private String nomeCurso;
	private long numIdentificacao;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private Professor professor;
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso() {
		this.nomeCurso = "Curso de JAVA";
	}
	public long getNumIdentificacao() {
		return numIdentificacao;
	}
	public void setNumIdentificacao() {
		this.numIdentificacao = 1010102015;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno alunos) {
		this.alunos.add(alunos);
		Collections.sort(this.alunos);
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public void remove(Aluno aluno) {
		this.alunos.remove(aluno);
		Collections.sort(this.alunos);
	}
	
}
