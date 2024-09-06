package one.digitalinnovation.gof.singleton;

// Singleton "apressado" (Eager Singleton).
// Este padrão de projeto garante que uma única instância da classe seja criada e usada durante toda a execução do programa.
// O termo "apressado" refere-se ao fato de que a instância é criada assim que a classe é carregada, independentemente de ser utilizada ou não.

public class SingletonEager {

	// Cria a única instância da classe SingletonEager de forma "apressada" (no momento do carregamento da classe).
	private static SingletonEager instancia = new SingletonEager();

	// Construtor privado para impedir que a classe seja instanciada de fora da classe.
	private SingletonEager() {
		super();
	}

	// Método público para fornecer acesso à instância única da classe.
	public static SingletonEager getInstancia() {
		return instancia; // Retorna a única instância criada.
	}
}
