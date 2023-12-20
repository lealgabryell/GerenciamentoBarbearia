package gerenciamentoBarbeiro.demo.src.main.java.com.example;

public class Main {

	public static void main(String[] args) {
		Barbearia barbearia = new Barbearia();
		Uteis uteis = new Uteis();

		barbearia.adicionarServicos();
		while (true) {
			barbearia.menu();
			int esc = uteis.lerInteiro("Digite sua escolha: ");

			switch (esc) {
				case 1:
					String nome = uteis.lerString("Qual o seu nome?");
					int idade = uteis.lerInteiro("Qual a sua idade?");
					System.out.println(".:.:.:.:.:.:.:.:Servicos disponiveis:.:.:.:.:.:.:.:.:\n"
							+ barbearia.listarServicos());
					int escolhaDeServico = uteis.lerInteiro("Qual servico voce deseja escolher?");
					escolhaDeServico -= 1;
					System.out.println("\n" + barbearia.metodosDePagamento());
					String formaDePagamento = uteis.lerString("Qual sera sua forma de pagamento?");
					switch (escolhaDeServico) {
						case 0:
							Cliente cliente0 = new Cliente(nome, idade, barbearia.servicos.get(0), formaDePagamento);
							barbearia.addCliente(cliente0);
							break;
						case 1:
							Cliente cliente1 = new Cliente(nome, idade, barbearia.servicos.get(1), formaDePagamento);
							barbearia.addCliente(cliente1);
							break;
						case 2:
							Cliente cliente2 = new Cliente(nome, idade, barbearia.servicos.get(2), formaDePagamento);
							barbearia.addCliente(cliente2);
							break;
						case 3:
							Cliente cliente3 = new Cliente(nome, idade, barbearia.servicos.get(3), formaDePagamento);
							barbearia.addCliente(cliente3);
							break;
						case 4:
							Cliente cliente4 = new Cliente(nome, idade, barbearia.servicos.get(4), formaDePagamento);
							barbearia.addCliente(cliente4);
							break;
						case 5:
							Cliente cliente5 = new Cliente(nome, idade, barbearia.servicos.get(5), formaDePagamento);
							barbearia.addCliente(cliente5);
							break;
						case 6:
							Cliente cliente6 = new Cliente(nome, idade, barbearia.servicos.get(6), formaDePagamento);
							barbearia.addCliente(cliente6);
							break;
						case 7:
							Cliente cliente7 = new Cliente(nome, idade, barbearia.servicos.get(7), formaDePagamento);
							barbearia.addCliente(cliente7);
							break;
						case 8:
							Cliente cliente8 = new Cliente(nome, idade, barbearia.servicos.get(8), formaDePagamento);
							barbearia.addCliente(cliente8);
							break;
						default:
							System.out.println("\nEscolha um servico valido!\n");
							break;
					}
					System.out.println(barbearia.getUltimoAdicionado().getNome() + " seu servico de "
							+ barbearia.getUltimoAdicionado().getServico().getServico() + " foi agendado com sucesso!");
					break;
				case 2:
					System.out.println(barbearia.listarServicos());
					break;
				case 3:
					System.out.println("Fila de clientes do dia:\n");
					barbearia.imprimirFila();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Digite uma opcao valida!");
					break;
			}
		}
	}
}
