package academico;

public class Avaliacao {
	
	private float nota;
	private Disciplina disciplina;
	private Aluno aluno;
	
	public Avaliacao(Aluno aluno, Disciplina disciplina, float nota) {
		
		if (nota >= 0 && nota <= 100) {
			this.aluno = aluno;
			this.disciplina = disciplina;
			this.nota = nota;
		}
		else {
			throw new RuntimeException("Nota fora do intervalo (0 - 100)");
		}
		
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public float getNota() {
		return nota;
	}
	

}
