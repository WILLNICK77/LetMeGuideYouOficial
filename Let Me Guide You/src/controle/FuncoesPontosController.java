package controle;

import javax.swing.AbstractListModel;
import javax.swing.JList;

public class FuncoesPontosController {
	
	public JList InicializaPontos() {
		JList list_1 = new JList();
		
		list_1.setModel(model);
		
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"hdasdhas", "asjdbsakjdbsajk", "sahdbasa"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		return list_1;
		
	}

}
