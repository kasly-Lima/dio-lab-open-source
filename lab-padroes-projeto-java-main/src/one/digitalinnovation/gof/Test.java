package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {

		// Teste do padrão Singleton
		// Utilizando o Singleton Lazy (preguiçoso)
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy); // Imprime a instância
		lazy = SingletonLazy.getInstancia(); // Obtém novamente a mesma instância
		System.out.println(lazy); // Imprime a mesma instância, pois o Singleton garante isso

		// Utilizando o Singleton Eager (apressado)
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager); // Imprime a instância criada no início
		eager = SingletonEager.getInstancia(); // Obtém novamente a mesma instância
		System.out.println(eager); // Novamente, a mesma instância

		// Utilizando o Singleton Lazy Holder (lazy com classe interna estática)
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder); // Imprime a instância criada pela classe interna
		lazyHolder = SingletonLazyHolder.getInstancia(); // Obtém a mesma instância
		System.out.println(lazyHolder); // Imprime novamente a mesma instância

		// Teste do padrão Strategy
		// Criando diferentes comportamentos para o robô
		Comportamento defensivo = new ComportamentoDefensivo(); // Comportamento defensivo
		Comportamento normal = new ComportamentoNormal(); // Comportamento normal
		Comportamento agressivo = new ComportamentoAgressivo(); // Comportamento agressivo

		// Instanciando o robô e definindo comportamentos
		Robo robo = new Robo();
		robo.setComportamento(normal); // Define o comportamento normal
		robo.mover(); // Robô se move de forma normal
		robo.mover(); // Move novamente no mesmo modo

		robo.setComportamento(defensivo); // Altera para comportamento defensivo
		robo.mover(); // Robô se move defensivamente

		robo.setComportamento(agressivo); // Altera para comportamento agressivo
		robo.mover(); // Robô se move agressivamente
		robo.mover(); // Continua no modo agressivo
		robo.mover(); // Continua no modo agressivo

		// Teste do padrão Facade
		// Utilizando a fachada para simplificar a migração de clientes
		Facade facade = new Facade();
		facade.migrarCliente("Clodoaldo", "40028922"); // Migra o cliente utilizando o Facade
	}

}
