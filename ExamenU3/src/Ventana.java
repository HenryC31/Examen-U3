import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ventana() {
		this.setVisible(true);
		this.setBounds(100, 100, 1200, 750);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciar();
	}

	private void iniciar() {
		JPanel panel = new JPanel();
		panel.setLayout(null);

		JLabel label = new JLabel("Car - Rental");
		label.setLocation(EXIT_ON_CLOSE, ABORT);
		label.setFont(new Font("", Font.BOLD, 20));
		this.add(panel);
	}

}
