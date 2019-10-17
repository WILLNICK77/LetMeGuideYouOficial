package visao;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTree;

import controle.FuncoesPontosController;
import controle.PontoTuristicoDAO;
import modelo.PontoTuristico;

import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.AbstractListModel;

public class FuncoesPontos {

	private JFrame frame;
	private JTextField textField;
	private FuncoesPontosController funcoesPontosController = new FuncoesPontosController();
	private ArrayList<PontoTuristico> dados= new ArrayList<>();
	private PontoTuristicoDAO pontoDAO = new PontoTuristicoDAO(); 
	/**
	 * Create the application.
	 */
	public FuncoesPontos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(Color.GRAY);
		getFrame().getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 48, 207, 20);
		getFrame().getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		   
			}
		});
		
		
		btnNewButton.setBounds(229, 47, 89, 23);
		getFrame().getContentPane().add(btnNewButton);
		
		JFormattedTextField frmtdtxtfldCidadeOndeMe = new JFormattedTextField();
		frmtdtxtfldCidadeOndeMe.setBounds(38, 48, 169, 20);
		frmtdtxtfldCidadeOndeMe.setText("Cidade onde me encontro...");
		getFrame().getContentPane().add(frmtdtxtfldCidadeOndeMe);
		
		JList list = new JList();
		list.setBounds(164, 296, 154, -126);
		getFrame().getContentPane().add(list);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 121, 306, 230);
		getFrame().getContentPane().add(panel);
		panel.setLayout(null);
		
		JList listagemPontos = new JList();
		listagemPontos.setBounds(10, 219, 286, -203);
		panel.add(listagemPontos);
		
		dados = pontoDAO.consultaPontoTuristico();
		
		JList list_1 = new JList();

	
		
		
//		list_1 = funcoesPontosController.InicializaPontos();
		list_1.setBounds(10, 11, 286, 208);
		
		list_1.setListData();
		
		
		
		PontoTuristico p = new PontoTuristico("Cida", "DAsd", "coco");
	
		panel.add(list_1);
		
		
		
		JButton btnCadastrar = new JButton("Cadastrar Outro Ponto");
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro();
				cadastro.getFrame().setVisible(true);
			}
		});
		
		
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setBackground(Color.GREEN);
		btnCadastrar.setBounds(56, 427, 214, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(38, 379, 89, 23);
		frame.getContentPane().add(btnExcluir);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(181, 379, 89, 23);
		frame.getContentPane().add(btnEditar);
		
		JButton btnVoltarAoIncio = new JButton("Voltar ao In\u00EDcio");
		btnVoltarAoIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial window= new TelaInicial();
				window.getFrame().setVisible(true);
				frame.dispose();
				
			}
		});
		btnVoltarAoIncio.setBounds(105, 461, 122, 23);
		frame.getContentPane().add(btnVoltarAoIncio);
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
