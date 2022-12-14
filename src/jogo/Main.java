package jogo;

import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class Main {
	public static void main(String[] args) {
		Window janela = new Window(800, 600);
		GameImage plano = new GameImage(URL.sprite("menu.png"));
		Keyboard teclado = janela.getKeyboard();
		
		while(true) {
			plano.draw(); // draw the menu.png in screen
			janela.update();
			
			if(teclado.keyDown(Keyboard.ENTER_KEY)) {
				JOptionPane.showMessageDialog(null, "Funcinando");
			}
		}
	}
}
