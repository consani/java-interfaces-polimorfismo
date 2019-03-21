public class Multicalculadora {
	
	
	public static void calcularTodas
					(double op1, double op2, Operacao ... operacoes){
		
		for (Operacao operacao : operacoes) {
			System.out.println("Executando um(a) " + operacao);
			double resultado = operacao.executar(op1, op2);
			System.out.printf
				("O resultado da %s para %.2f e %.2f é %.2f \n\n",
							operacao,op1,op2,resultado );
		}
		
		System.out.println(Operacao.PI);
		
	}

}
