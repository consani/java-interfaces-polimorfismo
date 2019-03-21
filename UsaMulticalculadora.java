public class UsaMulticalculadora {
	
	public static void main(String[] args) {
		
		Operacao oper1 = new Adicao();
		Operacao oper3 = new Multiplicacao();
		Operacao oper4 = new MOD();
		Operacao oper2 = new Adicao();
		Operacao oper5 = new Subtracao();
		Operacao oper6 = new Subtracao();
		Operacao oper7 = new Potenciacao();
		Operacao oper8 = new Divisao();
		Operacao oper9 = new Potenciacao();
		Operacao oper10 = new MOD();
		
		Multicalculadora.calcularTodas(30, 10, oper1,oper2,oper3,oper4,
											    oper5,oper6,oper7,
											    oper8,oper9,oper10);
		
		
	}

}
