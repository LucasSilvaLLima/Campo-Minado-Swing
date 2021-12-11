package br.com.coder.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.coder.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getLinhas()));
	
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
	
		tabuleiro.resgistrarObservador(e -> {
			
			SwingUtilities.invokeLater(() -> {
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou :) \nAperte em OK para Jogar de Novo");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu :( \nAperte em OK para Jogar de Novo");
				}
				
				tabuleiro.reiniciar();
			});
		});
	}
}
 