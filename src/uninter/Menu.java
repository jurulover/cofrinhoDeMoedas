package uninter;

import java.util.Scanner;

public class Menu {

	private Scanner teclado;
	private Cofrinho cofrinho = new Cofrinho();	
	
	public Menu() {
		teclado = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void exibirMenu() {
		System.out.println("COFRINHO DA UNINTER: ");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular Valor Total Convertido Para Real ");
		System.out.println("0 - Encerrar Programa");
		System.out.print("Informe sua escolha: ");

		String escolha = teclado.next();
				
		switch (escolha) {
			
		
			case "0":
				System.out.println("Você selecionou sair do programa!");
				break;
			
			case "1":
				
				exibirSubMenuAdicionarMoedas();
				exibirMenu();
				break;
				
			case "2":
				exibirSubMenuRemoverMoedas();
				exibirMenu();
				break;
				
			case "3":
				cofrinho.listarMoedas();
				exibirMenu();
				break;
				
			case "4":
				double total = cofrinho.totalConvertido();
				String totalConvertidoTexto = String.valueOf(total);
				totalConvertidoTexto = totalConvertidoTexto.replace(".",",");
				
				System.out.println("O valor total é: " + totalConvertidoTexto);
				exibirMenu();
				break;
				
			default:
				System.out.println("Opção inválida! Tente novamente. \n");
				exibirMenu();
				break;
		}
		
	}
	
	private void exibirSubMenuAdicionarMoedas() {
		System.out.println("Informe qual moeda deseja adicionar: ");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");
		System.out.print("Qual sua escolha? ");
		int opcaoMoeda = teclado.nextInt();
		
		System.out.print("Digite o valor: ");
		String valorTextoMoeda = teclado.next();
		valorTextoMoeda = valorTextoMoeda.replace(",",".");
		
		double valor = Double.valueOf(valorTextoMoeda);
		
		Moeda moeda = null;
		
		if (opcaoMoeda == 1) {
			moeda = new Real(valor);
		} else if(opcaoMoeda == 2) {
			moeda = new Dolar(valor);
		} else if(opcaoMoeda == 3) {
			moeda = new Euro(valor);
		} else {
			System.out.println("Você escolheu uma moeda que não existe!");
			exibirMenu();
		}
		
		cofrinho.adicionarMoeda(moeda);
		System.out.println("Ação concluída!");
	}
	
	private void exibirSubMenuRemoverMoedas() {
		System.out.println("Informe qual moeda deseja adicionar: ");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");
		System.out.print("Qual sua escolha? ");
		int opcaoMoeda = teclado.nextInt();
		
		System.out.print("Digite o valor: ");
		String valorTextoMoeda = teclado.next();
		valorTextoMoeda = valorTextoMoeda.replace(",",".");
		
		double valor = Double.valueOf(valorTextoMoeda);
		
		Moeda moeda = null;
		
		if (opcaoMoeda == 1) {
			moeda = new Real(valor);
		} else if(opcaoMoeda == 2) {
			moeda = new Dolar(valor);
		} else if(opcaoMoeda == 3) {
			moeda = new Euro(valor);
		} else {
			System.out.println("Você escolheu uma moeda que não existe!");
			exibirMenu();
		}
		
		cofrinho.removerMoeda(moeda);
	}
	
}
