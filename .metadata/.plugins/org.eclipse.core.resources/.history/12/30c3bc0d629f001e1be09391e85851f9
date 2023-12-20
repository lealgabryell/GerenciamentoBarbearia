package gerenciamentoBarbeiro;

public class Servicos {
	
	// atributos
	private String servico;
	private double valor;

	public Servicos(String servico, double valor) {
		this.servico = servico;
		this.valor = valor;
	}
	
	public Servicos(String servico1, String servico2, double valor) {
		this.servico = servico1 + " e " + servico2;
		this.valor = valor;
	}
	public Servicos(String servico1, String servico2, String servico3, double valor) {
		this.servico = servico1 + ", " + servico2 + " e "+ servico3;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return String.format("%s - R$%.2f", this.getServico(), this.getValor());
	}
	public String getServico() {
		return servico;
	}

	public double getValor() {
		return valor;
	}
}
