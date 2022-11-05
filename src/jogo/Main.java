package jogo;

import jplay.GameImage;
import jplay.URL;
import jplay.Window;

public class Main {
	public static void main(String[] args) {
		Window janela = new Window(800, 600);
		GameImage plano = new GameImage(URL.sprite("menu.png"));
	}
}
