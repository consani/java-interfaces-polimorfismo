public class Divisao implements Operacao{

	@Override
	public double executar(double operador1, double operador2) {
		return operador1 / operador2;
	}
	
	@Override
	public String toString(){
		return "Divis�o";
	}

}
