package gerenciamentoBarbeiro;

public class Cliente {
	private String nome;
	private int idade;
	private Servicos servico;
	private String formaPagamento;

	
	
	public Cliente(String nome, int idade, Servicos servico, String formaPagamento) {
		this.nome = nome;
		this.idade = idade;
		this.servico = servico;
		this.formaPagamento = formaPagamento;
	}

	@Override
	public String toString() {
		String cadeiraUtilizada = this.getIdade()>6? "Cadeira 2 ou 3":"Cadeira 1";
		return String.format("Cliente -> %s - %s\nServico -> %s\nForma de pagamento -> %s", 
				this.getNome(), cadeiraUtilizada, this.getServico(), this.getFormaPagamento());
	}
	public Servicos getServico() {
		return servico;
	}

	public String getNome() {
		return nome;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public int getIdade() {
		return idade;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public void setServico(Servicos servico) {
		this.servico = servico;
	}

}
