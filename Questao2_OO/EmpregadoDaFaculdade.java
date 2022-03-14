package Questao2_OO;

public class EmpregadoDaFaculdade {

	private String nome;
	private double salario;
	private int horasAula;
	double getGastos(){
	return this.salario+40*horasAula;
	}
	public String getInfo(){
		return "Nome:" + this.nome + " com salário " + String.format("%.2f",(this.salario + 40*horasAula));
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public int getHorasAula() {
			return horasAula;
		}
		public void setHorasAula(int horasAula) {
			this.horasAula = horasAula;
		}
		public String getNome() {
			return nome;
		}
	}
