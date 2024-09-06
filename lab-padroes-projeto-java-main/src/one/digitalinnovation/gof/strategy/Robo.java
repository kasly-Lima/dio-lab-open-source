package one.digitalinnovation.gof.strategy;

public class Robo {

	// Atributo que armazena o comportamento atual do robô.
	private Comportamento comportamento;

	// Método para definir o comportamento do robô dinamicamente.
	// Este método segue o padrão Strategy, permitindo que o comportamento do robô seja alterado em tempo de execução.
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	// Método que faz o robô se mover, delegando a lógica do movimento ao comportamento atual.
	// A chamada do método mover() será diferente dependendo da estratégia de comportamento (defensivo, agressivo, normal).
	public void mover() {
		comportamento.mover(); // O comportamento atual define como o robô irá se mover.
	}
}
