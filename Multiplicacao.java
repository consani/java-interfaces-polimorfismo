public class Multiplicacao implements Operacao{

	@Override
	public double executar(double operador1, double operador2) {
		return operador1 * operador2;
	}
	
	@Override
	public String toString(){
		return "Multiplicacao";
	}

}
