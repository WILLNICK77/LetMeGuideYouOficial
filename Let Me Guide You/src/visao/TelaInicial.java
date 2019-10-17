package visao;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class TelaInicial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setForeground(Color.RED);
		getFrame().getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnCadastrar = new JButton("Cadastrar Ponto Tur\u00EDstico");
		btnCadastrar.setBounds(37, 288, 250, 23);
		btnCadastrar.setForeground(Color.GREEN);
		getFrame().getContentPane().add(btnCadastrar);
		
		JButton btnVerPontos = new JButton("Ver Todos Pontos Cadastrados");
		btnVerPontos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FuncoesPontos window = new FuncoesPontos();
				window.getFrame().setVisible(true);
			}
		});
		btnVerPontos.setBounds(61, 322, 212, 33);
		frame.getContentPane().add(btnVerPontos);
		
		JTextPane txtpnOAplicativoLet = new JTextPane();
		txtpnOAplicativoLet.setForeground(new Color(0, 0, 0));
		txtpnOAplicativoLet.setBackground(Color.WHITE);
		txtpnOAplicativoLet.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtpnOAplicativoLet.setText("O aplicativo Let Me Guide You visa a maximiza\u00E7\u00E3o das informa\u00E7\u00F5es sobre os pontos tur\u00EDsticos de uma localidade, ajudando o usu\u00E1rio a se localizar e ter melhor acesso as informa\u00E7\u00F5es de cada ponto tur\u00EDstico.");
		txtpnOAplicativoLet.setBounds(55, 93, 218, 152);
		frame.getContentPane().add(txtpnOAplicativoLet);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro();
				cadastro.getFrame().setVisible(true);
			}
		});
		
		getFrame().setBounds(100, 100, 344, 559);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
