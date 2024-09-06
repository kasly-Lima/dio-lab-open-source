package subsistema2.cep;

public class CepApi {

	// Instância única da classe CepApi, seguindo o padrão Singleton (Eager).
	private static CepApi instancia = new CepApi();

	// Construtor privado para impedir a criação de novas instâncias da classe.
	// A instância é criada de forma "apressada" (Eager), ou seja, assim que a classe é carregada.
	private CepApi() {
		super();
	}

	// Método que retorna a instância única da classe (Singleton).
	public static CepApi getInstancia() {
		return instancia; // Retorna a única instância de CepApi.
	}

	// Método simulado que retorna a cidade com base no CEP.
	// No caso real, este método poderia fazer uma chamada a uma API externa ou consultar um banco de dados.
	public String recuperarCidade(String cep) {
		return "Araraquara"; // Retorna a cidade fictícia "Araraquara" para qualquer CEP.
	}

	// Método simulado que retorna o estado com base no CEP.
	// Assim como o método anterior, em uma aplicação real poderia buscar essas informações de uma fonte de dados real.
	public String recuperarEstado(String cep) {
		return "SP"; // Retorna o estado fictício "SP" (São Paulo) para qualquer CEP.
	}
}
