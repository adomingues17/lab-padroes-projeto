package movimentoStrategy.movimento;

public class PonteRolante {
	
	private Movimento movimentos;	
	private long pausa;
	private int distancia;
	
	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public long getPausa() {
		return pausa;
	}

	public void setPausa(long pausa) {
		this.pausa = pausa;
	}

	public Movimento getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(Movimento movimentos) {
		this.movimentos = movimentos;
	}
	
	public void avancarEixo(long pausa, int distancia) throws InterruptedException {
		movimentos.avancarEixo(pausa, distancia);		
	}
	
	public void recuarEixo(long pausa, int distancia) throws InterruptedException {
		movimentos.recuarEixo(pausa, distancia);		
	}
}