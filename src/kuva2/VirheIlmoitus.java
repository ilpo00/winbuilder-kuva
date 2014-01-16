package kuva2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class VirheIlmoitus extends JFrame {

	private JPanel contentPane;
	private final JButton btnOk = new JButton("OK");
	private final JTextArea txtrTapahtuiVirheYrit = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VirheIlmoitus frame = new VirheIlmoitus();
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
	public VirheIlmoitus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnOk.setBounds(117, 108, 117, 29);
		
		contentPane.add(btnOk);
		txtrTapahtuiVirheYrit.setBackground(UIManager.getColor("Button.background"));
		txtrTapahtuiVirheYrit.setText("Tapahtui virhe! Yrit\u00E4 uudestaan");
		txtrTapahtuiVirheYrit.setBounds(77, 61, 196, 16);
		
		contentPane.add(txtrTapahtuiVirheYrit);
	}
}
