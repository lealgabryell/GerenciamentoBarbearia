package gerenciamentoBarbeiro;

public class Main {

	public static void main(String[] args) {
		Barbearia barbearia = new Barbearia();
		barbearia.adicionarServicos();
		System.out.println(".:.:.:.:.:.:.:.:Servicos disponiveis:.:.:.:.:.:.:.:.:\n" + barbearia.listarServicos());

		System.out.println(barbearia.proximoDaFila());
		barbearia.servicoConcluido();
		barbearia.servicoNaoRealizado();
	}
}
