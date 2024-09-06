package one.digitalinnovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {

//	CRIANDO METODO AGRESSIVO
	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}

}
