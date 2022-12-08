package sobrescrita;

public class Funcionario{
    private String nome;
    private double salario;
    
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario(int horas) {
		return horas*100;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

    //Métodos Setter's..............
    //Métodos Getter's............


}
