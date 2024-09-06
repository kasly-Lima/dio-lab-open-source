package subsistema1.crm;

public class CrmService {

	// Construtor privado para impedir a criação de instâncias desta classe.
	// A classe é utilitária, portanto, todos os seus métodos são estáticos.
	private CrmService() {
		super();
	}

	// Método estático que simula o armazenamento de um cliente no sistema de CRM.
	// Este método exibe as informações do cliente (nome, cep, cidade, estado) no console.
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println(nome);   // Imprime o nome do cliente
		System.out.println(cep);    // Imprime o CEP do cliente
		System.out.println(cidade); // Imprime a cidade do cliente
		System.out.println(estado); // Imprime o estado do cliente
	}
}

