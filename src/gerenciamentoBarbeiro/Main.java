package gerenciamentoBarbeiro;

public class Main {

	public static void main(String[] args) {

		Barbearia barbearia = new Barbearia();

		barbearia.adicionarServicos();
		System.out.println(".:.:.:.:.:.:.:.:Servicos disponiveis:.:.:.:.:.:.:.:.:\n" + barbearia.listarServicos());
		Cliente cliente = new Cliente("Francinaldo", 18, barbearia.getServico(), "Pix");
		barbearia.addCliente(cliente);
		System.out.println(barbearia.proximoDaFila());
		barbearia.servicoConcluido();
		System.out.println(barbearia.proximoDaFila());
	}
}
