import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		int resposta = 0;
		String nome, dados;
		long matricula;
		double media;
		Curso curso = new Curso();
		
		do{
            try {
                resposta = Integer.parseInt(JOptionPane.showInputDialog("---------------CURSO DE CAPACITAÇÃO-------------\nEscolha:\n1. Incluir Alunos\n2. Remover Aluno (por nome ou matricula)\n3. Verificar se um aluno esta matriculado (por matricula)\n4. Listar todos os alunos aprovados (media superior a 7,0)\n5. Listar todos os alunos reprovados por falta (faltas superior a 15)\n6. Listar por ordem alfabetica\n7.Sair\n"));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Informe apenas números");
            }
            switch(resposta)
            {
				case 1:
					Aluno aluno = new Aluno();
					aluno.setNome(JOptionPane.showInputDialog("Informe o nome do aluno "));
		            aluno.setMatricula(JOptionPane.showInputDialog("Informar matricula"));
		            aluno.setMedia(Integer.parseInt(JOptionPane.showInputDialog("Informe a media do aluno")));
		            aluno.setFaltas(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de faltas")));
		            curso.setAlunos(aluno);
		            break;
				case 2:
					nome = JOptionPane.showInputDialog("Informe o nome do aluno ou matricula");
					int cont = 0;
					for( Aluno  matriculados: curso.getAlunos())  
			        { 
						if(nome.equals(matriculados.getNome())){
							curso.remove(matriculados);
							JOptionPane.showMessageDialog(null, "Aluno "+matriculados.getNome()+" Removido!!!");
							cont++;
							break;
						}
						if(nome.equals(matriculados.getMatricula())){
							curso.remove(matriculados);
							JOptionPane.showMessageDialog(null, "Aluno "+matriculados.getNome()+" Removido!!!");
							cont++;
							break;
						}
			        }
					if(cont==0)
						JOptionPane.showMessageDialog(null, "Aluno nao encontrado");
					break;
				case 3:
					nome = JOptionPane.showInputDialog("Informe a matricula do aluno");
					int cont1 = 0;
					for( Aluno  matriculados: curso.getAlunos())  
			        { 
						if(nome.equals(matriculados.getMatricula())){
							JOptionPane.showMessageDialog(null, "Aluno "+matriculados.getNome()+" MATRICULADO no Curso!!!");
							cont1++;
							break;
						}
			        }
					if(cont1==0)
						JOptionPane.showMessageDialog(null, "Aluno NAO Matriculado no Curso");
					break;
				case 4:
					dados ="";
					for( Aluno  matriculados: curso.getAlunos())  
			        {
						if(matriculados.getMedia() > 6)
						dados += "--- "+matriculados.getNome()+"\n";           			 
			        }  
					JOptionPane.showMessageDialog(null, "Lista Alunos APROVADOS (media acima de 7,0)\n"+dados);
					break;
				case 5:
					dados ="";
					for( Aluno  matriculados: curso.getAlunos())  
			        {
						if(matriculados.getFaltas() > 14)
						dados += "--- "+matriculados.getNome()+"\n";           			 
			        }  
					JOptionPane.showMessageDialog(null, "Lista Alunos REPROVADOS por falta(faltas acima de 15)\n"+dados);
					break;
				case 6:
					dados ="";
					for( Aluno  matriculados: curso.getAlunos())  
			        {
						dados += "- "+matriculados.getNome()+"---"+matriculados.getMatricula()+"\n";           			 
			        }  
					JOptionPane.showMessageDialog(null, "Lista de alunos Ordem Alfabetica\n"+dados);			
					break;
				case 7:
					//sair
					break;

            }	
		}while (resposta != 7);

	}

}
