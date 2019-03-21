
public interface Operacao {
	
	double PI = 3.1416;
	//isso na interface é equivalente a
	// public static final double PI = 3.1416
	
	public double executar(double operador1,double operador2);
	
	public default String getNome(){
		return toString();
	}
	
	public static void teste(){
		System.out.println("testando operacao...");
	}

}
