package javaBasico.CheckedExceptions;

import javaBasico.CheckedExceptions.Banco;
import javaBasico.CheckedExceptions.DepositoNegativoException;
import javaBasico.CheckedExceptions.SaldoInsuficienteException;
import javaBasico.CheckedExceptions.ValorNegativoException;

public class Aplicacao {

	public static void main(String[] args) {

		Banco banco = new Banco();
		
		try {
			
			banco.realizarOperacao();
		} catch (ValorNegativoException e) {
			System.out.println("Voc� tentou sacar um valor de : " + e.getValor());

		} catch (SaldoInsuficienteException e) {
			System.out.println("Voc� tentou sacar " + e.getValor() + " ,mas seu saldo atual � de:" + e.getSaldo());
		} catch (DepositoNegativoException e) {
			System.out.println("Voc� tentou realizar um deposito de: " + e.getValor()
					+ " n�o � permitido depositos com valores negativos");
		} finally {
			System.out.println("Opera��o finalizada");
		}
	}

}
