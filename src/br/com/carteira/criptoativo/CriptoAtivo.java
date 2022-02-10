package br.com.carteira.criptoativo;


public class CriptoAtivo {

	private String nomecripto;
	private int quantidade;
	private double saldo;


	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean transfere(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public String getNomecripto() {
		return nomecripto;
	}

	public void setNomecripto(String nomecripto) {
		this.nomecripto = nomecripto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
