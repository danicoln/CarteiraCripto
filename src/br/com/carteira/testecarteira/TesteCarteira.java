package br.com.carteira.testecarteira;

import br.com.carteira.criptoativo.Bitcoin;

public class TesteCarteira {

	public static void main(String[] args) {

		Bitcoin btc = new Bitcoin();
		btc.deposita(0.01);

		System.out.println(" qtde BTC " + btc.getSaldo() );
	}
}