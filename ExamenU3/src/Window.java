import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Window {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	
	private JPanel panel=new JPanel();;
	JPanel panelVehiculos = new JPanel();
	JPanel panelRentas = new JPanel();
	JPanel paneles[]= {panel,panelVehiculos,panelRentas};
	ImageIcon imagenBoton = new ImageIcon(getClass().getResource("/media/botonLogin.png"));
	Image boton = imagenBoton.getImage();

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
		panel.setBackground(new Color(255, 255, 255));
		
		panel.setBounds(0, 0, 1184, 638);
		panel.setLayout(null);
//		try {
//			BufferedImage image = ImageIO.read(getClass().getResource("/media/puntos.png"));
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
		JLabel label = new JLabel("Car - Rental");
		label.setFont(new Font("", Font.BOLD, 20));
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				super.paintComponent(create);
				Graphics2D g2d=(Graphics2D)create;
				
				
				g2d.setColor(new Color(43,59,89));
				g2d.fillRect(15, 15, 800,550 );
				
				g2d.setColor(new Color(163,184,210));
				g2d.fillRect(815,15, 295,550 );
				
				g2d.setColor(new Color(1,6,27));
				g2d.fillOval(620, 100, 400, 400);
				
				g2d.setColor(new Color(1,6,27));
				g2d.fillRect(70, 51, 430, 479);
				
				try {
					BufferedImage image= ImageIO.read(getClass().getResource("/media/car.png"));
					g2d.drawImage(image,570,180,500,240,null);
					
				}catch(IOException e) {
					e.printStackTrace();
				}
//				try {
//					BufferedImage image= ImageIO.read(getClass().getResource("/media/circul.png"));
//					g2d.drawImage(image,150,150,500,500,null);
//					
//				}catch(IOException e) {
//					e.printStackTrace();
//				}
			}
		};
		
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(29, 27, 1125, 580);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(163, 184, 210));
		panel_6.setBounds(79, 61, 410, 459);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 40));
		lblNewLabel.setBounds(129, 29, 140, 52);
		panel_6.add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Contraseña");
		lblUsuario.setBackground(new Color(0, 0, 0));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblUsuario.setBounds(53, 230, 155, 38);
		panel_6.add(lblUsuario);
		
		JLabel lblUsuario_1 = new JLabel("Nombre de usuario");
		lblUsuario_1.setBackground(new Color(0, 0, 0));
		lblUsuario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblUsuario_1.setBounds(53, 119, 249, 38);
		panel_6.add(lblUsuario_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(63, 168, 300, 40);
		panel_6.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setBounds(63, 279, 300, 40);
		panel_6.add(passwordField);
		
		JButton btnNewButton = new JButton("",imagenBoton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("login");
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(130, 358, 155, 60);
		panel_6.add(btnNewButton);
		
		JLabel puntos=new JLabel();
		puntos.setBounds(-20, 1, 150, 111);
		puntos.setIcon(new ImageIcon(getClass().getResource("/media/puntos.png")));
		panel.add(puntos);
		
		JLabel puntos2=new JLabel();
		puntos2.setBounds(1053, 527, 150, 111);
		puntos2.setIcon(new ImageIcon(getClass().getResource("/media/puntos.png")));
		panel.add(puntos2);
		
		
		JLabel lblNewLabel_1 = new JLabel("CarRental");
		lblNewLabel_1.setForeground(Color.black);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblNewLabel_1.setBounds(735, 50, 167, 49);
		panel_1.add(lblNewLabel_1);
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
		panelRentas.setBackground(Color.pink);
		panelRentas.setBounds(0, 0, 1184, 638);
		panelRentas.setLayout(null);
		frame.getContentPane().add(panelRentas);
		
	}
}
