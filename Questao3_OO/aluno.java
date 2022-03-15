package Questao3_OO;

public class aluno {
	private String nome;
	private Integer matricula;
	private double notaAV1;
	private double notaAV2;
	private double notaAE;
	private String curso;
	private Integer periodo;

	public aluno(String nome, Integer matricula, String curso, Integer periodo) {
	this.nome = nome;
	this.matricula = matricula;
	this.curso = curso;
	this.periodo = periodo;
}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public Double getnotaAV1() {
		return notaAV1;
	}

	public void setNotaAv1(Double notaAV1) {
		this.notaAV1 = notaAV1;
	}

	public Double getNotaAV2() {
		return notaAV2;
	}

	public void setnotaAV2(Double notaAV2) {
		this.notaAV2 = notaAV2;
	}

	public Double getnotaAE() {
		return notaAE;
	}

	public void setnotaAE(Double notaAE) {
		this.notaAE = notaAE;
	}
	public String avaliarAluno() {
		double sum = notaAV1+notaAV2;
		
		if (sum >= 60) {
			return "Aprovado";
		}
		else {
			return "Recuperação";
		}
		
	}
	
	
	
	
	public String avaliarRecuperacao() {
		double avg = (notaAV1+notaAV2+notaAE)/3;
		if (avg >= 60) {
			return "Aprovado";
		}
		else {
			return "Reprovado";
		}
	}
	}
