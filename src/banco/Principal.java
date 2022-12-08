package banco;

//QUESTAO 4

public class Principal {
	public static void main(String[] args) {
		Pessoa jeova = new Pessoa("Jeová", "Tavares", 37); // criei um objeto e associei a variavel
		Conta c = new Conta(jeova);
		c.creditar(2000.0);
		c.debitar(100);

		Pessoa samuel = new Pessoa("Samuel", "Rodrigues", 37);
		ContaEspecial c2 =
			new ContaEspecial(samuel, 200);
		c2.debitar(500);
		
		ContaPoupanca c3 = new ContaPoupanca(
				new Pessoa("Agamenon", "Quinderé", 25), 
				10000);
		
		c3.rendeJuros();

		PessoaFisica Raynne = new PessoaFisica("Raynne", "Nogueira", 23);
		Raynne.setCpf("000.000.000-00");
		Raynne.setSobrenome("Nogueira");
		Conta c4 = new Conta(Raynne, 200);
		c4.creditar(3500.0);
		c4.debitar(500);

		PessoaJuridica Maria = new PessoaJuridica("Maria", "Pereira", 50);
		Maria.setCnpj("000.000.000.111-22");
		Maria.setRazaoSocial("#######");
		Conta c5 = new Conta(Maria, 200);
		c5.creditar(2000.0);
		c5.debitar(100);
		
				
		System.out.println(c);

		System.out.println(c2);
		
		System.out.println(c3);
		
		System.out.println(Raynne + c4.toString());

		System.out.println(Maria + c5.toString());
	}
}


