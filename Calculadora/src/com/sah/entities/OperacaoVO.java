package com.sah.entities;

import javax.swing.JOptionPane;

public class OperacaoVO implements IOperacoes {

	private double resultado = 0.0;
	
	@Override
	public void adicao(double num1, double num2) {
		resultado = num1 + num2;
		
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + resultado);
	}

	@Override
	public void divisao(double num1, double num2) {
		try {
			resultado = num1 / num2;
			JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + resultado);	
		} catch (ArithmeticException  e) {
			JOptionPane.showMessageDialog(null, "ERRO: Divisão por 0.");	
		}
	}

	@Override
	public void multiplicacao(double num1, double num2) {
		resultado = num1 * num2;
		
		JOptionPane.showMessageDialog(null, num1 + " x " + num2 + " = " + resultado);
	}

	@Override
	public void subtracao(double num1, double num2) {
		resultado = num1 - num2;
		
		JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + resultado);
	}

}
