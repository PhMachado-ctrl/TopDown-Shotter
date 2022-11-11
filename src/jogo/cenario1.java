package jogo;

import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class cenario1 {
	private Window janela;
	private Scene cena;
	
	public void Cenario1(Window window) {
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("cenario1.png"));
		
		run(); //função contem o loop infinito
	}

	private void run() {
		while(true) {
			cena.draw();
		}
		
	}
}
