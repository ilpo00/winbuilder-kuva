package kuva2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class PoistonVarmistus extends JFrame {

	private JPanel contentPane;
	private final JButton btnKyll = new JButton("Kyll\u00E4");
	private final JButton btnEi = new JButton("Ei");
	private final JTextArea txtrPoistetaankoVarmastiAsiakas = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PoistonVarmistus frame = new PoistonVarmistus();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PoistonVarmistus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtrPoistetaankoVarmastiAsiakas.setBounds(105, 69, 195, 16);
		txtrPoistetaankoVarmastiAsiakas.setBackground(UIManager.getColor("Button.background"));
		txtrPoistetaankoVarmastiAsiakas.setText("Oletko aivan varma?");
		
		contentPane.add(txtrPoistetaankoVarmastiAsiakas);
		btnKyll.setBounds(89, 97, 75, 29);
		
		contentPane.add(btnKyll);
		btnEi.setBounds(176, 97, 75, 29);
		
		contentPane.add(btnEi);
	}

}
