
public class Conta {
	private String nomeCliente;
	private String idConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getIdConta() {
		return idConta;
	}
	public void setIdConta(String idConta) {
		this.idConta = idConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double novoSaldo, double valorExtra) {
		this.saldo = this.saldo+novoSaldo+valorExtra;
	}
	
	
}
