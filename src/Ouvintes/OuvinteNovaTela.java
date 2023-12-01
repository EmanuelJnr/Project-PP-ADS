package Ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import Enums.NomeTela;
import View.TelaCadastroAdmin;
import View.TelaLoginAdmin;
import View.TelaPrincipal;

public abstract class OuvinteNovaTela implements ActionListener{

	public static void proximaTela(JButton botao, JFrame essaTela, NomeTela nomeTela) {

		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				essaTela.dispose();

				switch (nomeTela) {
				case TELA_CADASTRO_ADMIN:
					new TelaCadastroAdmin();
					break;
				case TELA_LOGIN_ADMIN:
					new TelaLoginAdmin();
					break;
				case TELA_PRINCIPAL:
					new TelaPrincipal();
					break;
				} // Fim do switch case
			}
		});
	}// Fim do método
}// Fim da Classe