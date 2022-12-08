package estruturadeclasses;

public class Pessoa {
	
	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override 
	// toString serve para trazer uma representação 
	// de uma instância de um objeto.
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}

	
}


// public (+) pode ser acessado por: ela mesma, filhos e outros
// private (-) pode ser acessado por: pai e filhos
// protected (#) pode ser acessador por: pai