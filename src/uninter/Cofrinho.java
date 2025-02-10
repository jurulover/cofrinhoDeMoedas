package uninter;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}

	public void adicionarMoeda(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void removerMoeda(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	public void listarMoedas() {
		
		if (this.listaMoedas.isEmpty()) {
			return;
		}
		
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() {
		
		double acum = 0;
		
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		for (Moeda moeda : this.listaMoedas) {
			acum = acum + moeda.converter();
		}
		
		return acum;
		
	}
	
}
