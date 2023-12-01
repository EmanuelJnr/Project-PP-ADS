package View;

import javax.swing.JFrame;

public abstract class TelaPadrao extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public TelaPadrao(String nome) {
		super(nome);
		setSize(800, 600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
}