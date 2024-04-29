import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Window {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	
	private JPanel panel=new JPanel();;
	JPanel panelVehiculos = new JPanel();
	JPanel panelRentas = new JPanel();
	JPanel paneles[]= {panel,panelVehiculos,panelRentas};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 1200, 700);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Login");
		mnNewMenu.setBackground(new Color(81, 151, 216));
		mnNewMenu.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
		mnNewMenu.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Lol, q mal");
				for (int i=0;i<paneles.length;i++) {
					frame.remove(paneles[i]);
				}
				login(frame);
				frame.repaint();
				frame.revalidate();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Logout");
		mnNewMenu_1.setBackground(new Color(81, 151, 216));
		mnNewMenu_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Vehículos");
		mnNewMenu_2.setBackground(new Color(81, 151, 216));
		mnNewMenu_2.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
		mnNewMenu_2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Lol, q bien");
				for (int i=0;i<paneles.length;i++) {
					frame.remove(paneles[i]);
				}
				vehiculos(frame);
				frame.repaint();
				frame.revalidate();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		menuBar.add(mnNewMenu_2);
		JMenu mnNewMenu_3 = new JMenu("Rentas");
		mnNewMenu_3.setBackground(new Color(81, 151, 216));
		mnNewMenu_3.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
		mnNewMenu_3.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Lol, q bien");
				for (int i=0;i<paneles.length;i++) {
					frame.remove(paneles[i]);
				}
				rentas(frame);
				frame.repaint();
				frame.revalidate();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		menuBar.add(mnNewMenu_3);
		this.login(frame);
//		this.vehiculos(frame);
//		this.rentas(frame);
	}
	public void login(JFrame frame) {
		frame.setTitle("Login");
		
		panel.setBounds(0, 0, 1184, 638);
		panel.setLayout(new BorderLayout());
	
		JLabel label = new JLabel("Car - Rental");
		label.setFont(new Font("", Font.BOLD, 20));
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				super.paintComponent(create);
				Graphics2D g2d=(Graphics2D)create;
				
				
				g2d.setColor(new Color(81,151,216));
				g2d.fillRect(0, 0, 850,650 );
				g2d.setColor(Color.black);
				g2d.fillOval(650, 100, 400, 400);
				g2d.setColor(new Color(217,217,217));
				g2d.fillRect(75, 25, 435, 570);
			}
		};
		
		panel_1.setBackground(new Color(205,236,242));
		panel_1.setBounds(10, 0, 10, 10);
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBounds(87, 40, 410, 540);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblNewLabel.setBounds(139, 49, 140, 45);
		panel_6.add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Contraseña");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblUsuario.setBounds(57, 238, 155, 38);
		panel_6.add(lblUsuario);
		
		JLabel lblUsuario_1 = new JLabel("Nombre de usuario");
		lblUsuario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_1.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblUsuario_1.setBounds(63, 123, 226, 38);
		panel_6.add(lblUsuario_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(221, 239, 255));
		textField.setBounds(65, 172, 300, 40);
		panel_6.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(221, 239, 255));
		passwordField.setBounds(67, 287, 300, 40);
		panel_6.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(81, 151, 216));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		btnNewButton.setBounds(139, 425, 130, 38);
		panel_6.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("CarRental");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblNewLabel_1.setBounds(773, 56, 167, 45);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(0, 21, 10, 10);
		panel.add(panel_2,BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(0, 48, 10, 10);
		panel.add(panel_3,BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		panel_4.setBounds(10, 79, 10, 10);
		panel.add(panel_4,BorderLayout.EAST);
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 0));
		panel_5.setBounds(10, 79, 10, 10);
		panel.add(panel_5,BorderLayout.WEST);
	}
	
	public void  vehiculos (JFrame frame) {
		frame.repaint();
		frame.revalidate();
		frame.setTitle("Vehiculos");
		panelVehiculos.setBackground(Color.pink);
		panelVehiculos.setBounds(0, 0, 1184, 638);
		panelVehiculos.setLayout(null);
		frame.getContentPane().add(panelVehiculos);
	}
	
	private void rentas(JFrame frame) {
		frame.setTitle("Rentas");
		panelRentas.setBounds(0, 0, 1184, 638);
		panelRentas.setLayout(null);
		
	}
}
