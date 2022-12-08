package banco;

// QUESTAO 4

public class Conta {
	protected String numero;
	protected Pessoa cliente;
	protected double saldo;

	public Conta() {
		int n =(int) (Math.random() * 10000 + 1); // pelo menos 1000
		String numConta = "c"+n;
		this.numero = numConta;
	}

	public Conta(Pessoa cliente) {
		this();
		this.cliente = cliente;
	}

	public Conta(Pessoa cliente, double saldo) {
		this(cliente);
		this.saldo = saldo;
	}

	private String mostra() {
		String saida = "--------------";
		saida += "\nCliente: " + this.cliente.getNome();
		saida += "\nNumero: " + this.numero;
		saida = saida + "\nSaldo :" + this.saldo;
		saida += "\n-------------\n";
		return saida;
	}
	
	@Override // estou sobescrevendo esse metodo
	public String toString() {
		return "\n"+ mostra();
	}

	public void creditar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}
	}

	public void debitar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;   /* OU: this.saldo -= valor; */
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public Pessoa getCliente() {
		return this.cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
	public void setCliente(String nome, String sobrenome, int idade) {
		Pessoa cliente = new Pessoa(nome, sobrenome, idade);
		this.cliente = cliente;
	}
}


//so quem cria o objeto é o construtor a partir da estrutura de dados
//construtor é uma funcionalidade para criar um objeto
//set é para modificar, para definir valores
//get para obter informações
//polimorfismo objetos diferentes sendo tratados da mesma forma







