package gerenciamentoBarbeiro;

import java.util.ArrayList;
import java.util.List;

public class Barbearia {

	private List<Servicos> servicos = new ArrayList<Servicos>();
	private List<Cliente> fila = new ArrayList<>();
	private double caixa;

	public String proximoDaFila() {
		// fila.add(new Cliente("Francinaldo", 18, servicos.get(0), "Pix"));
		String clienteDaVez = "";
		if (fila.isEmpty()) {
			clienteDaVez = "Nenhum cliente na fila";
		} else {
			clienteDaVez = fila.get(0).toString();
		}
		return clienteDaVez;
	}

	public Servicos getServico() {
		return servicos.get(0);
	}

	public void servicoNaoRealizado() {
		fila.remove(0);
	}

	public void servicoConcluido() {
		double valorDoServico = fila.get(0).getServico().getValor();
		this.setCaixa(this.getCaixa() + valorDoServico);
		fila.remove(0);
	}

	public void adicionarServicos() {
		Servicos servico1 = new Servicos("Corte", 30.0);
		servicos.add(servico1);
		Servicos servico2 = new Servicos("Barba", 25.0);
		servicos.add(servico2);
		Servicos servico3 = new Servicos("Sobrancelha", 15.0);
		servicos.add(servico3);
		Servicos servico4 = new Servicos("Redutora/Selagem", 50.0);
		servicos.add(servico4);
		Servicos combo1 = new Servicos("Corte", "barba", 50.0);
		servicos.add(combo1);
		Servicos combo2 = new Servicos("Corte", "sobrancelha", 40.0);
		servicos.add(combo2);
		Servicos combo3 = new Servicos("Sobrancelha", "barba", 35.0);
		servicos.add(combo3);
		Servicos combo4 = new Servicos("Corte", "barba", "redutora/Selagem", 95.0);
		servicos.add(combo4);
	}

	public String listarServicos() {
		String servicosConcat = "";
		for (Servicos s : servicos) {
			String servicoFormatado = String.format("%-35s | %6s%n", s.getServico(), s.getValor());
			servicosConcat += servicoFormatado;
		}
		return servicosConcat;
	}

	public double getCaixa() {
		return caixa;
	}

	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}

	public void addCliente(Cliente cliente) {
		fila.add(cliente);
	}

}
