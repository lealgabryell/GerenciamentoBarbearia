package gerenciamentoBarbeiro;

import java.util.ArrayList;
import java.util.List;

public class Barbearia {

	protected List<Servicos> servicos = new ArrayList<Servicos>();
	protected List<Cliente> fila = new ArrayList<>();
	protected Cliente ultimoAdicionado;
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

	//nao adiciona dinheiro ao caixa
	public void servicoNaoRealizado() {
		fila.remove(0);
	}
	//adiciona dinheiro ao caixa quando um sercico se conclui
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
		int indice = 1;
		for (Servicos s : servicos) {
			String servicoFormatado = String.format( indice +". %-35s | %6s%n", s.getServico(), s.getValor());
			servicosConcat += servicoFormatado;
			indice ++;
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
		ultimoAdicionado = cliente;
	}

	public Cliente getUltimoAdicionado(){
		return ultimoAdicionado;
	}
	public String metodosDePagamento(){
		return "-Pix\n-No ato\n-Em dinheiro\n";
	}
	public void imprimirFila(){
		for (Cliente c : fila) {
			System.out.println(c.toString());
		}
	}
	public void menu(){
		System.out.println(".:.:.:.: Gustavo Braga Barbearia .:.:.:.:\n" +
		"\t1) Marcar um servico\n" +
		"\t2) Tabela de precos e servicos\n" +
		"\t3) Fila do dia\n" +
		"\t4) Sair\nProximo a ser atendido:\n" + proximoDaFila());
	}
}
