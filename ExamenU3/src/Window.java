import java.awt.Color;
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
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Window {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	private JPanel panel = new JPanel();;
	JPanel panelVehiculos = new JPanel();
	JPanel panelRentas = new JPanel();
	JPanel paneles[] = { panel, panelVehiculos, panelRentas };
	ImageIcon imagenBoton = new ImageIcon(getClass().getResource("/media/botonLogin.png"));
	Image boton = imagenBoton.getImage();
	int vista_vehiculo = 0;

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
				for (int i = 0; i < paneles.length; i++) {
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

			}
		});
		menuBar.add(mnNewMenu);

		JMenu mnNewMenu_1 = new JMenu("Logout");
		mnNewMenu_1.setBackground(new Color(81, 151, 216));
		mnNewMenu_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

		/*
		 * 
		 * MenúItem Vehículo
		 * 
		 */

		JMenu mnNewMenu_2 = new JMenu("Vehículos");
		mnNewMenu_2.setBackground(new Color(81, 151, 216));
		mnNewMenu_2.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));

		JMenuItem agregar = new JMenuItem("Agregar");
		agregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vista_vehiculo = 1;
				for (int i = 0; i < paneles.length; i++) {
					frame.remove(paneles[i]);
				}
				vehiculos(frame);
			}
		});

		JMenuItem editar = new JMenuItem("Editar");
		editar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vista_vehiculo = 2;
				for (int i = 0; i < paneles.length; i++) {
					frame.remove(paneles[i]);
				}
				vehiculos(frame);
			}
		});

		JMenuItem consultar = new JMenuItem("Consultar");
		consultar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vista_vehiculo = 3;
				for (int i = 0; i < paneles.length; i++) {
					frame.remove(paneles[i]);
				}
				vehiculos(frame);
			}
		});

		JMenuItem eliminar = new JMenuItem("Eliminar");
		eliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vista_vehiculo = 4;
				for (int i = 0; i < paneles.length; i++) {
					frame.remove(paneles[i]);
				}
				vehiculos(frame);
			}
		});

		mnNewMenu_2.add(agregar);
		mnNewMenu_2.add(editar);
		mnNewMenu_2.add(consultar);
		mnNewMenu_2.add(eliminar);

		menuBar.add(mnNewMenu_2);

		JMenu mnNewMenu_3 = new JMenu("Rentas");
		mnNewMenu_3.setBackground(new Color(81, 151, 216));
		mnNewMenu_3.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
		mnNewMenu_3.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Lol, q bien");
				for (int i = 0; i < paneles.length; i++) {
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

			}
		});
		menuBar.add(mnNewMenu_3);
		menuBar.add(mnNewMenu_1);
		this.login(frame);
//		this.vehiculos(frame);
//		this.rentas(frame);
	}

	public void login(JFrame frame) {
		frame.setTitle("Login");
		panel.setBackground(new Color(255, 255, 255));

		panel.setBounds(0, 0, 1184, 638);
		panel.setLayout(null);

		frame.getContentPane().add(panel);

		JPanel panel_1 = new JPanel() {
			@Override
			public void paintComponent(Graphics create) {
				super.paintComponent(create);
				Graphics2D g2d = (Graphics2D) create;

				// Fondo azul oscuro
				g2d.setColor(new Color(43, 59, 89));
				g2d.fillRect(15, 15, 800, 550);

				// Fondo azul claro
				g2d.setColor(new Color(163, 184, 210));
				g2d.fillRect(815, 15, 295, 550);

				// Círculo de fondo
				g2d.setColor(new Color(1, 6, 27));
				g2d.fillOval(620, 100, 400, 400);

				// Sombra panel login
				g2d.setColor(new Color(1, 6, 27));
				g2d.fillRect(70, 51, 430, 479);

				try {
//					Imágen carro
					BufferedImage image = ImageIO.read(getClass().getResource("/media/car.png"));
					g2d.drawImage(image, 570, 180, 500, 240, null);

				} catch (IOException e) {
					e.printStackTrace();
				}
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

		JButton btnNewButton = new JButton("", imagenBoton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("login");
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(130, 358, 155, 60);
		panel_6.add(btnNewButton);

		JLabel puntos = new JLabel();
		puntos.setBounds(-20, 1, 150, 111);
		puntos.setIcon(new ImageIcon(getClass().getResource("/media/puntos.png")));
		panel.add(puntos);

		JLabel puntos2 = new JLabel();
		puntos2.setBounds(1053, 527, 150, 111);
		puntos2.setIcon(new ImageIcon(getClass().getResource("/media/puntos.png")));
		panel.add(puntos2);

		JLabel lblNewLabel_1 = new JLabel("CarRental");
		lblNewLabel_1.setForeground(Color.black);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblNewLabel_1.setBounds(735, 50, 167, 49);
		panel_1.add(lblNewLabel_1);
	}

	public void vehiculos(JFrame frame) {
		panelVehiculos.setBounds(0, 0, 1184, 638);
		panelVehiculos.setLayout(null);

		switch (vista_vehiculo) {
		case 1: // Case Añadir Vehículo
			System.out.println("Añadir");
			panelVehiculos.removeAll();
			JPanel panel_agregar_vehiculo = new JPanel() {
				@Override
				public void paintComponent(Graphics create) {
					super.paintComponent(create);
					Graphics2D g2d = (Graphics2D) create;

					// Fondo azul oscuro
					g2d.setColor(new Color(43, 59, 89));
					g2d.fillRect(15, 15, 800, 550);

					// Fondo azul claro
					g2d.setColor(new Color(163, 184, 210));
					g2d.fillRect(815, 15, 295, 550);

					// Círculo de fondo
					g2d.setColor(new Color(1, 6, 27));
					g2d.fillOval(620, 100, 400, 400);

					// Sombra panel login
					g2d.setColor(new Color(1, 6, 27));
					g2d.fillRect(70, 51, 430, 479);

					try {
//						Imágen carro
						BufferedImage image = ImageIO.read(getClass().getResource(""));
						g2d.drawImage(image, 570, 180, 500, 240, null);

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};

			panel_agregar_vehiculo.setBackground(new Color(0, 0, 0));
			panel_agregar_vehiculo.setBounds(29, 27, 1125, 580);
			panel_agregar_vehiculo.setLayout(null);
			panelVehiculos.add(panel_agregar_vehiculo);

			JPanel panel_formulario_agregar = new JPanel();
			panel_formulario_agregar.setBackground(new Color(163, 184, 210));
			panel_formulario_agregar.setBounds(79, 61, 410, 459);
			panel_agregar_vehiculo.add(panel_formulario_agregar);
			panel_formulario_agregar.setLayout(null);

			JLabel agregar_tag = new JLabel("Agregar Vehículo");
			agregar_tag.setBackground(new Color(0, 0, 0));
			agregar_tag.setHorizontalAlignment(SwingConstants.CENTER);
			agregar_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 35));
			agregar_tag.setBounds(15, 2, 380, 45);
			panel_formulario_agregar.add(agregar_tag);

			JLabel marca_tag = new JLabel("Marca");
			marca_tag.setBackground(new Color(0, 0, 0));
			marca_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
			marca_tag.setBounds(50, 55, 100, 30); // x + 10, y - 10
			panel_formulario_agregar.add(marca_tag);

			JTextField marca_txtfield = new JTextField();
			marca_txtfield.setBackground(new Color(255, 255, 255));
			marca_txtfield.setBounds(50, 87, 300, 30); // x + 10, y - 10
			panel_formulario_agregar.add(marca_txtfield);
			marca_txtfield.setColumns(10);

			JLabel modelo_tag = new JLabel("Modelo");
			modelo_tag.setBackground(new Color(0, 0, 0));
			modelo_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
			modelo_tag.setBounds(50, 120, 100, 30); // x + 10, y - 10
			panel_formulario_agregar.add(modelo_tag);

			JTextField modelo_txtfield = new JTextField();
			modelo_txtfield.setBackground(new Color(255, 255, 255));
			modelo_txtfield.setBounds(50, 152, 300, 30); // x + 10, y - 10
			panel_formulario_agregar.add(modelo_txtfield);

			JLabel año_tag = new JLabel("Año");
			año_tag.setBackground(new Color(0, 0, 0));
			año_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
			año_tag.setBounds(50, 185, 100, 30); // x + 10, y - 10
			panel_formulario_agregar.add(año_tag);

			JTextField año_txtfield = new JTextField();
			año_txtfield.setBackground(new Color(255, 255, 255));
			año_txtfield.setBounds(50, 217, 300, 30); // x + 10, y - 10
			panel_formulario_agregar.add(año_txtfield);

			JLabel trans_tag = new JLabel("Transmisión");
			trans_tag.setBackground(new Color(0, 0, 0));
			trans_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
			trans_tag.setBounds(50, 250, 150, 30); // x + 10, y - 10
			panel_formulario_agregar.add(trans_tag);

			String[] transmision = { "Automática", "Manual" };
			JComboBox trans_txtfield = new JComboBox(transmision);
			trans_txtfield.setBackground(new Color(255, 255, 255));
			trans_txtfield.setBounds(50, 282, 300, 30); // x + 10, y - 10
			panel_formulario_agregar.add(trans_txtfield);

			JLabel costo_tag = new JLabel("Costo (Por día)");
			costo_tag.setBackground(new Color(0, 0, 0));
			costo_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
			costo_tag.setBounds(50, 315, 200, 30); // x + 10, y - 10
			panel_formulario_agregar.add(costo_tag);

			JTextField costo_txtfield = new JTextField();
			costo_txtfield.setBackground(new Color(255, 255, 255));
			costo_txtfield.setBounds(50, 347, 300, 30); // x + 10, y - 10
			panel_formulario_agregar.add(costo_txtfield);

			JButton boton_agregar = new JButton("Agregar");
			boton_agregar.setBounds(130, 400, 150, 40);
			boton_agregar.setContentAreaFilled(false);
			boton_agregar.setBorderPainted(false);
			try {
				boton_agregar.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/media/botonAgregar.png"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			panel_formulario_agregar.add(boton_agregar);

			frame.repaint();
			frame.revalidate();
			break;

		case 2: // Case Editar Vehículo
			System.out.println("Editar");
			panelVehiculos.removeAll();

			JPanel panel_editar_vehiculo = new JPanel() {
				@Override
				public void paintComponent(Graphics create) {
					super.paintComponent(create);
					Graphics2D g2d = (Graphics2D) create;

					// Fondo azul oscuro
					g2d.setColor(new Color(43, 59, 89));
					g2d.fillRect(15, 15, 800, 550);

					// Fondo azul claro
					g2d.setColor(new Color(163, 184, 210));
					g2d.fillRect(815, 15, 295, 550);

					// Círculo de fondo
					g2d.setColor(new Color(1, 6, 27));
					g2d.fillOval(620, 100, 400, 400);

					// Sombra panel login
					g2d.setColor(new Color(1, 6, 27));
					g2d.fillRect(70, 51, 430, 479);

					try {
//						Imágen carro
						BufferedImage image = ImageIO.read(getClass().getResource("/media/car.png"));
						g2d.drawImage(image, 570, 180, 500, 240, null);

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};
			panel_editar_vehiculo.setBackground(new Color(0, 0, 0));
			panel_editar_vehiculo.setBounds(29, 27, 1125, 580);
			panel_editar_vehiculo.setLayout(null);
			panelVehiculos.add(panel_editar_vehiculo);

			frame.repaint();
			frame.revalidate();
			break;

		case 3: // Case Consultar - Vehículo
			System.out.println("Consultar");
			panelVehiculos.removeAll();

			frame.repaint();
			frame.revalidate();
			break;

		case 4: // Case Eliminar
			System.out.println("Eliminar");
			panelVehiculos.removeAll();

			frame.repaint();
			frame.revalidate();
			break;
		}

		frame.add(panelVehiculos);
		frame.repaint();
		frame.revalidate();
		frame.setTitle("Vehiculos");

	}

	private void rentas(JFrame frame) {
		frame.setTitle("Rentas");
		panelRentas.setBackground(Color.pink);
		panelRentas.setBounds(0, 0, 1184, 638);
		panelRentas.setLayout(null);
		frame.getContentPane().add(panelRentas);

	}
}
