public class Potenciacao implements Operacao{

	@Override
	public double executar(double operador1, double operador2) {
		return Math.pow(operador1, operador2);
	}
	
	@Override
	public String toString(){
		return "Potenciacao";
	}

}
