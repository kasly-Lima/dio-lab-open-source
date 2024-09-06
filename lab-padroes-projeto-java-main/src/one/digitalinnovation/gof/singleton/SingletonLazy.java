package one.digitalinnovation.gof.singleton;

// Singleton "preguiçoso" (Lazy Singleton).
// Este padrão de projeto assegura que uma única instância da classe seja criada e usada durante toda a execução do programa.
// O termo "preguiçoso" refere-se ao fato de que a instância só é criada quando for necessária, ao invés de ser criada no carregamento da classe.

public class SingletonLazy {

	// Declaração da instância única da classe, inicialmente nula.
	private static SingletonLazy instancia;

	// Construtor privado para impedir que a classe seja instanciada fora dela mesma.
	private SingletonLazy() {
		super();
	}

	// Método público que fornece o acesso à única instância da classe.
	// Se a instância ainda não foi criada (é nula), cria-se uma nova.
	// Caso contrário, retorna a instância já existente.
	public static SingletonLazy getInstancia() {
		if (instancia == null) { // Verifica se a instância já foi criada.
			instancia = new SingletonLazy(); // Cria a instância se ela for nula (preguiçosa).
		}
		return instancia; // Retorna a instância única.
	}
}
