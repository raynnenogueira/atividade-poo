package sobrecarga;

//Sobrecarga  Ocorre quando existem métodos com o mesmo nome, 
//porém com parâmetros diferentes, ou seja,
//uma diferente ASSINATURA (Nome + Tipos de Parâmetros) do método.                                                                                                                                                        

public class Main {

	public static void main(String[] args) {

		Impressora impressora = new Impressora();
		impressora.imprimir(2.50);
		impressora.imprimir("Feliz");
	}

}

//Crio a classe impressora e defino o método imprimir com diferentes tipos
//de parâmetros a serem recebidos. De acordo com o que envio na minha classe main,
//a classe irá retornar o método que combine com a ordem e os tipos de parâmetros.
