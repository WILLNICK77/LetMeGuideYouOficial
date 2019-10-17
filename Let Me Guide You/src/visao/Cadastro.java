package visao;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controle.PontoTuristicoDAO;
import modelo.PontoTuristico;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtCidade;
	private JTextField txtEstado;


	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(36, 54, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(36, 104, 46, 14);
		frame.getContentPane().add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(36, 159, 46, 14);
		frame.getContentPane().add(lblEstado);
		
		txtNome = new JTextField();
		txtNome.setBounds(79, 51, 86, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(79, 101, 86, 20);
		frame.getContentPane().add(txtCidade);
		txtCidade.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(79, 156, 86, 20);
		frame.getContentPane().add(txtEstado);
		txtEstado.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtNome.getText().isEmpty() || txtCidade.getText().isEmpty() || txtEstado.getText().isEmpty()) {
				
				}else {
					PontoTuristico turistico = new PontoTuristico(txtNome.getText(),txtCidade.getText(), txtEstado.getText());
					PontoTuristicoDAO turisticoDAO = new PontoTuristicoDAO();
					turisticoDAO.inserePonto(turistico);
					
					turistico.setCodigo(turisticoDAO.consultaCodigo(turistico.getNome()));
					
					FuncoesPontos window = new FuncoesPontos();
					frame.dispose();
					window.getFrame().setVisible(true);

				}
			}
		});
		btnCadastrar.setBounds(285, 155, 89, 23);
		frame.getContentPane().add(btnCadastrar);
	}

	public Window getFrame() {

		return frame;
	}
}
