package movimentoStrategy.movimento;

public class MovimentoEixoX implements Movimento {
	
	public long pausa;

	@Override
	public void avancarEixo(long pausa, int distancia) throws InterruptedException {
		for(int i = 0; i <= distancia; i++) {			
			System.out.println("Avançando eixo X " + i + " centimetros.");			
		}
		Thread.sleep(pausa);
		System.out.println("Pausa de segurança de " + pausa/1000 + " segundos.");
					
	}

	@Override
	public void recuarEixo(long pausa, int distancia) throws InterruptedException {
		for(int i = distancia; i >= 0; i--) {			
			System.out.println("Recuando eixo X " + i + " centimetros.");			
		}
		Thread.sleep(pausa);
		System.out.println("Pausa de segurança de " + pausa/1000 + " segundos.");
						
	}
}