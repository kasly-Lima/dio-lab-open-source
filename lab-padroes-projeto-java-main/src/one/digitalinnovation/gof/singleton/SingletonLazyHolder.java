package one.digitalinnovation.gof.singleton;

// Singleton "Lazy Holder".
// Este padrão de projeto é uma variação do Singleton que utiliza a técnica de "inner static class" (classe interna estática).
// A vantagem desse método é que ele combina a inicialização preguiçosa com a segurança de thread-safe sem a necessidade de sincronização explícita.

public class SingletonLazyHolder {

	// Classe estática interna que contém a instância única do Singleton.
	// Esta classe só será carregada e inicializada quando o método getInstancia() for chamado pela primeira vez.
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}

	// Construtor privado para impedir a criação de instâncias externas.
	private SingletonLazyHolder() {
		super();
	}

	// Método público que retorna a instância única.
	// Quando chamado, o método carrega a classe InstanceHolder e, consequentemente, inicializa a instância de SingletonLazyHolder.
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia; // Retorna a instância única.
	}
}
