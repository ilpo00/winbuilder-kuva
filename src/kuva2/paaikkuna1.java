package kuva2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;
import fi.jyu.mit.gui.RadioButtonChooser;
import javax.swing.JSplitPane;
import javax.swing.JSpinner;
import javax.swing.JList;
import java.awt.Component;
import javax.swing.AbstractListModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class paaikkuna1 extends JFrame {

	private JPanel contentPane;
	private final JPanel PainikkeetPanel = new JPanel();
	private final JButton btnLisUusiAsiakas = new JButton("Lis\u00E4\u00E4 uusi asiakas");
	private final JButton btnPoistaVanhaAsiakas = new JButton("Poista vanha asiakas");
	private final JButton btnMuokkaaAsiakasta = new JButton("Muokkaa asiakasta");
	private final JPanel InfoPanel = new JPanel();
	private final JTable table = new JTable();
	private final JTextField textField = new JTextField();
	private final JTextArea txtrHaeAsiakkaista = new JTextArea();
	private final JScrollPane ListaPanel = new JScrollPane();
	private final JList list = new JList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paaikkuna1 frame = new paaikkuna1();
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
	public paaikkuna1() {
		textField.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(20000, 20000));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		txtrHaeAsiakkaista.setBackground(UIManager.getColor("Button.background"));
		txtrHaeAsiakkaista.setText("Hae asiakkaista");
		
		contentPane.add(txtrHaeAsiakkaista, "2, 4, left, center");
		
		contentPane.add(textField, "2, 5, 1, 2, left, default");
		
		contentPane.add(InfoPanel, "3, 6, 4, 31, fill, fill");
		InfoPanel.setLayout(new BorderLayout(0, 0));
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		InfoPanel.add(table, BorderLayout.CENTER);
		
		contentPane.add(ListaPanel, "2, 8, 1, 29, fill, fill");
		list.setToolTipText("  ");
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas", "asiakas"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		ListaPanel.setRowHeaderView(list);
		
		contentPane.add(PainikkeetPanel, "1, 38, 6, 3, fill, bottom");
		PainikkeetPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		PainikkeetPanel.add(btnLisUusiAsiakas);
		
		PainikkeetPanel.add(btnPoistaVanhaAsiakas);
		
		PainikkeetPanel.add(btnMuokkaaAsiakasta);
	}
}
