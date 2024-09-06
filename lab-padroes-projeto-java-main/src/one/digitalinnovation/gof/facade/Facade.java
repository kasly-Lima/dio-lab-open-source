package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

	// Método que simplifica o processo de migração de um cliente.
	// O Facade oculta a complexidade dos subsistemas (CRM e CEP) e fornece uma interface simples para o cliente.
	public void migrarCliente(String nome, String cep) {
		// Usa a API de CEP para recuperar a cidade e o estado baseado no CEP fornecido.
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);

		// Chama o serviço de CRM para gravar as informações do cliente, agora com a cidade e o estado.
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
