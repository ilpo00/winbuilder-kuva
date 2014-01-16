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
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class UusiAsiakas extends JFrame {

	private JPanel contentPane;
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JTextField textField_4 = new JTextField();
	private final JTextField textField_5 = new JTextField();
	private final JTextField textField_6 = new JTextField();
	private final JTextField textField_7 = new JTextField();
	private final JTextField textField_8 = new JTextField();
	private final JTextArea txtrNimi = new JTextArea();
	private final JTextArea txtrOsoite = new JTextArea();
	private final JTextArea txtrPuhNumero = new JTextArea();
	private final JTextArea txtrShkposti = new JTextArea();
	private final JTextArea txtrYtunnus = new JTextArea();
	private final JTextArea txtrLiikevaihto = new JTextArea();
	private final JTextArea txtrHenkilstmr = new JTextArea();
	private final JTextArea txtrToimiala = new JTextArea();
	private final JTextArea txtrPerustamisvuosi = new JTextArea();
	private final JCheckBox chckbxLaskuMaksettu = new JCheckBox("Lasku maksettu");
	private final JTextField textField_9 = new JTextField();
	private final JTextField textField_10 = new JTextField();
	private final JTextField textField_11 = new JTextField();
	private final JTextArea txtrViimevuosi = new JTextArea();
	private final JTextArea txtrVuottaSitten = new JTextArea();
	private final JTextArea txtrVuottaSitten_1 = new JTextArea();
	private final JTextField textField_12 = new JTextField();
	private final JTextField textField_13 = new JTextField();
	private final JTextField textField_14 = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UusiAsiakas frame = new UusiAsiakas();
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
	public UusiAsiakas() {
		textField_14.setColumns(10);
		textField_13.setColumns(10);
		textField_12.setColumns(10);
		textField_11.setColumns(10);
		textField_10.setColumns(10);
		textField_9.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		contentPane.add(chckbxLaskuMaksettu, "4, 4");
		txtrViimevuosi.setText("Viimevuosi");
		
		contentPane.add(txtrViimevuosi, "6, 4, fill, fill");
		txtrVuottaSitten.setText("2 vuotta sitten");
		
		contentPane.add(txtrVuottaSitten, "8, 4, fill, fill");
		txtrVuottaSitten_1.setText("3 vuotta sitten");
		
		contentPane.add(txtrVuottaSitten_1, "10, 4, fill, fill");
		txtrNimi.setText("Nimi");
		
		contentPane.add(txtrNimi, "2, 6, fill, fill");
		textField.setColumns(10);
		
		contentPane.add(textField, "4, 6, fill, default");
		txtrOsoite.setText("Osoite");
		
		contentPane.add(txtrOsoite, "2, 8, fill, fill");
		textField_1.setColumns(10);
		
		contentPane.add(textField_1, "4, 8, fill, default");
		txtrPuhNumero.setText("Puh. numero");
		
		contentPane.add(txtrPuhNumero, "2, 10, fill, fill");
		textField_2.setColumns(10);
		
		contentPane.add(textField_2, "4, 10, fill, default");
		txtrShkposti.setText("S\u00E4hk\u00F6posti");
		
		contentPane.add(txtrShkposti, "2, 12, fill, fill");
		textField_3.setColumns(10);
		
		contentPane.add(textField_3, "4, 12, fill, default");
		txtrYtunnus.setText("Y-Tunnus");
		
		contentPane.add(txtrYtunnus, "2, 14, fill, fill");
		textField_4.setColumns(10);
		
		contentPane.add(textField_4, "4, 14, fill, default");
		txtrLiikevaihto.setText("Liikevaihto");
		
		contentPane.add(txtrLiikevaihto, "2, 16, fill, fill");
		textField_5.setColumns(10);
		
		contentPane.add(textField_5, "4, 16, fill, default");
		
		contentPane.add(textField_9, "6, 16, fill, default");
		
		contentPane.add(textField_10, "8, 16, fill, default");
		
		contentPane.add(textField_11, "10, 16, fill, default");
		txtrHenkilstmr.setText("Henkil\u00F6st\u00F6m\u00E4\u00E4r\u00E4");
		
		contentPane.add(txtrHenkilstmr, "2, 18, fill, fill");
		textField_6.setColumns(10);
		
		contentPane.add(textField_6, "4, 18, fill, default");
		
		contentPane.add(textField_12, "6, 18, fill, default");
		
		contentPane.add(textField_13, "8, 18, fill, default");
		
		contentPane.add(textField_14, "10, 18, fill, default");
		txtrToimiala.setText("Toimiala");
		
		contentPane.add(txtrToimiala, "2, 20, fill, fill");
		textField_7.setColumns(10);
		
		contentPane.add(textField_7, "4, 20, fill, default");
		txtrPerustamisvuosi.setText("Perustamisvuosi");
		
		contentPane.add(txtrPerustamisvuosi, "2, 22, fill, fill");
		textField_8.setColumns(10);
		
		contentPane.add(textField_8, "4, 22, fill, default");
	}

}
