package academico;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAvaliacoes {
	
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	
	public void adicionarAvaliacao(Avaliacao avaliacao) {
		
		avaliacoes.add(avaliacao);
	}
	
	public Aluno[] obterAprovados(Disciplina disciplina) {
		
		List<Aluno> alunos = getListaAlunos();
		
		Aluno[] aprovados = new Aluno[10];
		int i = 0;
		
		for (Aluno aluno  : alunos) {
			float soma = 0;
			
			for (Avaliacao avaliacao : avaliacoes) {
				
				if (aluno.getRa() == avaliacao.getAluno().getRa() 
					&& disciplina == avaliacao.getDisciplina()) {
					
					soma += avaliacao.getNota();
				}
			}
			if (soma/4 >= 60) {
				aprovados[i] = aluno;
				i++;
			}
		}
		
		return aprovados;
	}
	
	private List<Aluno> getListaAlunos() {
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		for (Avaliacao avaliacao : avaliacoes) {
			
			Aluno auxiliar = avaliacao.getAluno();
			int igual = 0;
			for (Aluno aluno : listaAlunos) {
				if (aluno == auxiliar) {
					igual = 1;
				}
			}
			if (igual == 0) {
				listaAlunos.add(auxiliar);
			}
		}
		
		return listaAlunos;
		
	}

}
