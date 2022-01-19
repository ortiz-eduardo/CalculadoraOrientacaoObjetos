package app;

import fabricas.FabricaCalculadorMatematico;
import interfaces.CalculadorMatematico;

public class Programa {

	public static void main(String[] args) {
		String calcula = "-";
		int numero1 = 2;
		int numero2 = 3;

		FabricaCalculadorMatematico fabrica = new FabricaCalculadorMatematico();
		CalculadorMatematico calculo = fabrica.criarCalculador(numero1, numero2, calcula);
		if(calculo != null) {
			System.out.println(numero1 +" "+ calcula + " "+ numero2 + " = " + calculo.calcular());
		} else {
			System.out.println("Calculo Inválido!");
		}
		
		
	}

}
