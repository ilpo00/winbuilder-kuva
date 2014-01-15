package kuva1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.Box;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class paaikkuna extends JFrame {

	private JPanel contentPane;
	private final JButton btnKirjaudu = new JButton("Kirjaudu");
	private final JTextPane txtpnAsiakastietokanta = new JTextPane();
	private final JTextField textField = new JTextField();
	private final JPasswordField passwordField = new JPasswordField();
	private final JTextArea txtrKyttjtunnus = new JTextArea();
	private final JTextArea txtrSalasana = new JTextArea();
	private final JTextArea txtByIlmariAhonen = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paaikkuna frame = new paaikkuna();
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
	public paaikkuna() {
		txtByIlmariAhonen.setBackground(UIManager.getColor("Button.background"));
		txtByIlmariAhonen.setText("Ilmari Ahonen 2014");
		txtByIlmariAhonen.setBounds(298, 256, 146, 16);
		txtByIlmariAhonen.setColumns(10);
		textField.setBounds(44, 114, 134, 28);
		textField.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		btnKirjaudu.setBounds(118, 191, 206, 42);
		btnKirjaudu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnKirjaudu);
		txtpnAsiakastietokanta.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtpnAsiakastietokanta.setBackground(UIManager.getColor("Button.background"));
		txtpnAsiakastietokanta.setText("Asiakastietokanta - Mopal Oy");
		txtpnAsiakastietokanta.setBounds(70, 26, 318, 29);
		
		contentPane.add(txtpnAsiakastietokanta);
		
		contentPane.add(textField);
		passwordField.setBounds(265, 114, 134, 28);
		
		contentPane.add(passwordField);
		txtrKyttjtunnus.setBackground(UIManager.getColor("Button.background"));
		txtrKyttjtunnus.setText("K\u00E4ytt\u00E4j\u00E4tunnus");
		txtrKyttjtunnus.setBounds(47, 100, 110, 16);
		
		contentPane.add(txtrKyttjtunnus);
		txtrSalasana.setText("Salasana");
		txtrSalasana.setBackground(SystemColor.window);
		txtrSalasana.setBounds(269, 100, 62, 16);
		
		contentPane.add(txtrSalasana);
		
		contentPane.add(txtByIlmariAhonen);
	}
}
