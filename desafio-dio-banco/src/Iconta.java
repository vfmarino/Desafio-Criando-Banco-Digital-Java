
public interface Iconta {
	
	// nao precisa adicionar public pois é redundante toda interface já é public.
	 void sacar(double valor) ;
	 void depositar(double valor) ;
	 void transferir(double valor, Conta contaDestino) ;
	 void imprimirExtrato();
}