package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class Banco {

	public static void main(String[] args) {
		Conta c1 = new Conta("Danilo");
		c1.depositarDinheiro(100);
		c1.setAgencia(6969);
		
		Conta c2 = new Conta("Carla");
		c1.depositarDinheiro(200);
		c1.setAgencia(6449);
		
		Data data = new Data();
		data.dia = 15;
		data.mes = 3;
		data.ano = 2022;
		c1.setData_abertura(data);
		c2.setData_abertura(data);

		c1.recuperaDadosParaImpressao();
		System.out.println();
		c2.recuperaDadosParaImpressao();

	}

}
