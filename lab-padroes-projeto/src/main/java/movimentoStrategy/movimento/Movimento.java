package movimentoStrategy.movimento;

public interface Movimento {
	void avancarEixo(long pausa, int distancia) throws InterruptedException;
	void recuarEixo(long pausa, int distancia) throws InterruptedException;
}