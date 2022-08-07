
public class Poupanca extends Conta{
	
	public Poupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("Extrato da Conta Poupança");
		super.imprimirMetodosDoExtrato();
	}
}
