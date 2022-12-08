package estruturadeclasses;

//QUESTAO 3

public class PessoaFisica extends Pessoa {
	
	protected String cpf;
	protected String sobrenome;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", sobrenome=" + sobrenome + "]";
	}
	
	
	
}

