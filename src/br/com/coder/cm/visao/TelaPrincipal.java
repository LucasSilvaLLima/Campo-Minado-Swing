package br.com.coder.cm.visao;

import javax.swing.JFrame;

import br.com.coder.cm.modelo.Tabuleiro;
import java.awt.Color;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{

	public TelaPrincipal() {
		 
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 80);
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		painelTabuleiro.setBackground(Color.WHITE);
		painelTabuleiro.setForeground(Color.CYAN);
		getContentPane().add(painelTabuleiro);
		
		setTitle("Campo Minado");
		setSize(690, 440);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
