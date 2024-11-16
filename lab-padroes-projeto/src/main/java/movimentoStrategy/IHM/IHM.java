package movimentoStrategy.IHM;

import movimentoStrategy.movimento.Movimento;
import movimentoStrategy.movimento.MovimentoEixoX;
import movimentoStrategy.movimento.MovimentoEixoY;
import movimentoStrategy.movimento.MovimentoEixoZ;
import movimentoStrategy.movimento.PonteRolante;

public class IHM {
	public static void main(String[] args) throws InterruptedException {
		
		Movimento movimentoEixoX = new MovimentoEixoX();
		Movimento movimentoEixoY = new MovimentoEixoY();
		Movimento movimentoEixoZ = new MovimentoEixoZ();
		
		PonteRolante ponteRolante = new PonteRolante();		
		
		ponteRolante.setMovimentos(movimentoEixoX);
		ponteRolante.avancarEixo(2000, 100);
		
		ponteRolante.setMovimentos(movimentoEixoY);
		ponteRolante.avancarEixo(2000, 100);
		
		ponteRolante.setMovimentos(movimentoEixoZ);
		ponteRolante.avancarEixo(2000, 100);
		
		ponteRolante.setMovimentos(movimentoEixoZ);
		ponteRolante.recuarEixo(2000, 100);
		
		ponteRolante.setMovimentos(movimentoEixoY);
		ponteRolante.recuarEixo(2000, 100);		
		
		ponteRolante.setMovimentos(movimentoEixoX);
		ponteRolante.recuarEixo(2000, 100);		
		
		
		
	}
}