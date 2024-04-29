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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
public class Window {

	public JFrame frmEditar;

	private JPanel panel = new JPanel();;
	JPanel panelVehiculos = new JPanel();
	JPanel panelRentas = new JPanel();
	JPanel paneles[] = { panel, panelVehiculos, panelRentas };
	ImageIcon imagenBoton = new ImageIcon(getClass().getResource("/media/botonLogin.png"));
	Image boton = imagenBoton.getImage();
	int vista_vehiculo = 0;
	private JButton flecha2;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmEditar.setVisible(true);
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
		frmEditar = new JFrame();
		frmEditar.setVisible(true);
		frmEditar.setBounds(100, 100, 1200, 700);
		frmEditar.getContentPane().setLayout(null);
		frmEditar.setResizable(false);
		frmEditar.setLocationRelativeTo(null);
		frmEditar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frmEditar.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Login");
		mnNewMenu.setBackground(new Color(81, 151, 216));
		mnNewMenu.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
		mnNewMenu.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Lol, q mal");
				for (int i = 0; i < paneles.length; i++) {
					frmEditar.remove(paneles[i]);
				}
				login(frmEditar);
				frmEditar.repaint();
				frmEditar.revalidate();
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
					frmEditar.remove(paneles[i]);
				}
				vehiculos(frmEditar);
			}
		});

		JMenuItem editar = new JMenuItem("Editar");
		editar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vista_vehiculo = 2;
				for (int i = 0; i < paneles.length; i++) {
					frmEditar.remove(paneles[i]);
				}
				vehiculos(frmEditar);
			}
		});

		JMenuItem consultar = new JMenuItem("Consultar");
		consultar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vista_vehiculo = 3;
				for (int i = 0; i < paneles.length; i++) {
					frmEditar.remove(paneles[i]);
				}
				vehiculos(frmEditar);
			}
		});

		JMenuItem eliminar = new JMenuItem("Eliminar");
		eliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vista_vehiculo = 4;
				for (int i = 0; i < paneles.length; i++) {
					frmEditar.remove(paneles[i]);
				}
				vehiculos(frmEditar);
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
					frmEditar.remove(paneles[i]);
				}
				rentas(frmEditar);
				frmEditar.repaint();
				frmEditar.revalidate();
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
//		this.login(frame);
		vista_vehiculo = 1;
		this.consultaIndividual(frmEditar);
//		this.rentas(frame);
	}

	public void login(JFrame frame) {
		frame.setTitle("Login");
		panel.setBackground(new Color(0, 0, 0));
		
		panel.setBounds(0, 0, 1184, 638);
		panel.setLayout(null);

	
		JLabel label = new JLabel("Car - Rental");
		label.setFont(new Font("", Font.BOLD, 20));
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				super.paintComponent(create);
				Graphics2D g2d=(Graphics2D)create;
				
				
				g2d.setColor(new Color(163,184,210));
				g2d.fillRect(815,0, 310,580 );
				
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
			}
		};
		
		panel_1.setBackground(new Color(43, 59, 89));
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
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(63, 279, 300, 40);
		panel_6.add(passwordField);
		
		JLabel lblUsuario_1 = new JLabel("Nombre de usuario");
		lblUsuario_1.setBackground(new Color(0, 0, 0));
		lblUsuario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblUsuario_1.setBounds(53, 119, 249, 38);
		panel_6.add(lblUsuario_1);
		
		JTextField respCliente = new JTextField();
		respCliente.setBackground(new Color(255, 255, 255));
		respCliente.setBounds(63, 168, 300, 40);
		panel_6.add(respCliente);
		respCliente.setColumns(10);
		
		JButton btnNewButton = new JButton("",imagenBoton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("login");
				String passw = new String(passwordField.getPassword());
		        String nom=respCliente.getText();
		       ;
				
				
				if(nom.length()<=0)
				{
					respCliente.setBorder(BorderFactory.createLineBorder(Color.red, 2));
					
				}
				else
				{
					respCliente.setBorder(BorderFactory.createLineBorder(Color.green, 2));
				}
				if(!passw.equals(""))
				{
					passwordField.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					
				}
				else
				{
					passwordField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
					
				}
			
				
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(130, 358, 155, 60);
		panel_6.add(btnNewButton);

		
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
		/*
		 * 
		 * Case Añadir Vehículo
		 * 
		 */
		case 1:
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
						BufferedImage image = ImageIO.read(getClass().getResource("/media/auto-misterioso.png"));
						g2d.drawImage(image, 550, 150, 580, 300, null);

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
			agregar_tag.setBounds(5, 2, 380, 45);
			panel_formulario_agregar.add(agregar_tag);

			JLabel marca_tag = new JLabel("Marca");
			marca_tag.setBackground(new Color(0, 0, 0));
			marca_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			marca_tag.setBounds(50, 64, 100, 20); // x + 10, y + 15
			panel_formulario_agregar.add(marca_tag);

			JTextField marca_txtfield = new JTextField();
			marca_txtfield.setBackground(new Color(255, 255, 255));
			marca_txtfield.setBounds(50, 85, 300, 30); // y + 15
			marca_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			panel_formulario_agregar.add(marca_txtfield);
			marca_txtfield.setColumns(10);

			JLabel modelo_tag = new JLabel("Modelo");
			modelo_tag.setBackground(new Color(0, 0, 0));
			modelo_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			modelo_tag.setBounds(50, 120, 100, 20); // x + 10, y + 15
			panel_formulario_agregar.add(modelo_tag);

			JTextField modelo_txtfield = new JTextField();
			modelo_txtfield.setBackground(new Color(255, 255, 255));
			modelo_txtfield.setBounds(50, 141, 300, 30); // y + 15
			modelo_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			panel_formulario_agregar.add(modelo_txtfield);

			JLabel matricula_tag = new JLabel("Matrícula");
			matricula_tag.setBackground(new Color(0, 0, 0));
			matricula_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			matricula_tag.setBounds(50, 175, 100, 20); // x + 10, y + 15
			panel_formulario_agregar.add(matricula_tag);

			JTextField matricula_txtfield = new JTextField();
			matricula_txtfield.setBackground(new Color(255, 255, 255));
			matricula_txtfield.setBounds(50, 195, 300, 30); // y + 15
			matricula_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			panel_formulario_agregar.add(matricula_txtfield);

			JLabel año_tag = new JLabel("Año");
			año_tag.setBackground(new Color(0, 0, 0));
			año_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			año_tag.setBounds(50, 230, 100, 20); // y + 60
			panel_formulario_agregar.add(año_tag);

			JTextField año_txtfield = new JTextField();
			año_txtfield.setBackground(new Color(255, 255, 255));
			año_txtfield.setBounds(50, 250, 130, 30); // y + 60
			año_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			panel_formulario_agregar.add(año_txtfield);

			JLabel color_tag = new JLabel("Color");
			color_tag.setBackground(new Color(0, 0, 0));
			color_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			color_tag.setBounds(200, 230, 100, 20); // x + 10, y + 60
			panel_formulario_agregar.add(color_tag);

			String[] colores = { "Rojo", "Negro" };
			JComboBox color_txtfield = new JComboBox(colores);
			color_txtfield.setBackground(new Color(255, 255, 255));
			color_txtfield.setBounds(200, 250, 150, 30); // y + 60
			color_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			panel_formulario_agregar.add(color_txtfield);

			JLabel trans_tag = new JLabel("Transmisión");
			trans_tag.setBackground(new Color(0, 0, 0));
			trans_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente reducido a 12
			trans_tag.setBounds(50, 280, 150, 20); // x + 10, y - 10
			panel_formulario_agregar.add(trans_tag);

			String[] transmision = { "Automática", "Manual" };
			JComboBox trans_txtfield = new JComboBox(transmision);
			trans_txtfield.setBackground(new Color(255, 255, 255));
			trans_txtfield.setBounds(50, 301, 300, 30); // Ajuste en las coordenadas para alinear con la etiqueta
			trans_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
			panel_formulario_agregar.add(trans_txtfield);

			JLabel costo_tag = new JLabel("Costo (Por día)");
			costo_tag.setBackground(new Color(0, 0, 0));
			costo_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente reducido a 12
			costo_tag.setBounds(50, 335, 200, 20); // x + 10, y - 10
			panel_formulario_agregar.add(costo_tag);

			JTextField costo_txtfield = new JTextField();
			costo_txtfield.setBackground(new Color(255, 255, 255));
			costo_txtfield.setBounds(50, 356, 300, 30); // Ajuste en las coordenadas para alinear con la etiqueta
			costo_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
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

		/*
		 * 
		 * Case Editar Vehículo
		 * 
		 */
		case 2:
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
//					Imágen carro
						BufferedImage image = ImageIO.read(getClass().getResource("/media/auto-misterioso.png"));
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

			JPanel panel_formulario_editar = new JPanel();
			panel_formulario_editar.setBackground(new Color(163, 184, 210));
			panel_formulario_editar.setBounds(79, 61, 410, 459);
			panel_editar_vehiculo.add(panel_formulario_editar);
			panel_formulario_editar.setLayout(null);

			JLabel editar_tag = new JLabel("Editar Vehículo");
			editar_tag.setBackground(new Color(0, 0, 0));
			editar_tag.setHorizontalAlignment(SwingConstants.CENTER);
			editar_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 35));
			editar_tag.setBounds(5, 2, 380, 45);
			panel_formulario_editar.add(editar_tag);

			marca_tag = new JLabel("Marca");
			marca_tag.setBackground(new Color(0, 0, 0));
			marca_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			marca_tag.setBounds(50, 64, 100, 20); // x + 10, y + 15
			marca_tag.setVisible(false);
			panel_formulario_editar.add(marca_tag);

			marca_txtfield = new JTextField();
			marca_txtfield.setBackground(new Color(255, 255, 255));
			marca_txtfield.setBounds(50, 85, 300, 30); // y + 15
			marca_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			marca_txtfield.setVisible(false);
			panel_formulario_editar.add(marca_txtfield);
			marca_txtfield.setColumns(10);

			modelo_tag = new JLabel("Modelo");
			modelo_tag.setBackground(new Color(0, 0, 0));
			modelo_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			modelo_tag.setBounds(50, 120, 100, 20); // x + 10, y + 15
			modelo_tag.setVisible(false);
			panel_formulario_editar.add(modelo_tag);

			modelo_txtfield = new JTextField();
			modelo_txtfield.setBackground(new Color(255, 255, 255));
			modelo_txtfield.setBounds(50, 141, 300, 30); // y + 15
			modelo_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			modelo_txtfield.setVisible(false);
			panel_formulario_editar.add(modelo_txtfield);

			matricula_tag = new JLabel("Matrícula");
			matricula_tag.setBackground(new Color(0, 0, 0));
			matricula_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			matricula_tag.setBounds(50, 175, 100, 20); // x + 10, y + 15
			panel_formulario_editar.add(matricula_tag);

			matricula_txtfield = new JTextField();
			matricula_txtfield.setBackground(new Color(255, 255, 255));
			matricula_txtfield.setBounds(50, 195, 300, 30); // y + 15
			matricula_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			panel_formulario_editar.add(matricula_txtfield);

			año_tag = new JLabel("Año");
			año_tag.setBackground(new Color(0, 0, 0));
			año_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			año_tag.setBounds(50, 230, 100, 20); // y + 60
			año_tag.setVisible(false);
			panel_formulario_editar.add(año_tag);

			año_txtfield = new JTextField();
			año_txtfield.setBackground(new Color(255, 255, 255));
			año_txtfield.setBounds(50, 250, 130, 30); // y + 60
			año_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			año_txtfield.setVisible(false);
			panel_formulario_editar.add(año_txtfield);

			color_tag = new JLabel("Color");
			color_tag.setBackground(new Color(0, 0, 0));
			color_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			color_tag.setBounds(200, 230, 100, 20); // x + 10, y + 60
			color_tag.setVisible(false);
			panel_formulario_editar.add(color_tag);

			String[] col = { "Rojo", "Negro" };
			color_txtfield = new JComboBox(col);
			color_txtfield.setBackground(new Color(255, 255, 255));
			color_txtfield.setBounds(200, 250, 150, 30); // y + 60
			color_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente 12
			color_txtfield.setVisible(false);
			panel_formulario_editar.add(color_txtfield);

			trans_tag = new JLabel("Transmisión");
			trans_tag.setBackground(new Color(0, 0, 0));
			trans_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente reducido a 12
			trans_tag.setBounds(50, 280, 150, 20); // x + 10, y - 10
			trans_tag.setVisible(false);
			panel_formulario_editar.add(trans_tag);

			String[] trans = { "Manual", "Automática" };
			trans_txtfield = new JComboBox(trans);
			trans_txtfield.setBackground(new Color(255, 255, 255));
			trans_txtfield.setBounds(50, 301, 300, 30); // Ajuste en las coordenadas para alinear con la etiqueta
			trans_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
			trans_txtfield.setVisible(false);
			panel_formulario_editar.add(trans_txtfield);

			costo_tag = new JLabel("Costo (Por día)");
			costo_tag.setBackground(new Color(0, 0, 0));
			costo_tag.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12)); // Tamaño de fuente reducido a 12
			costo_tag.setBounds(50, 335, 200, 20); // x + 10, y - 10
			costo_tag.setVisible(false);
			panel_formulario_editar.add(costo_tag);

			costo_txtfield = new JTextField();
			costo_txtfield.setBackground(new Color(255, 255, 255));
			costo_txtfield.setBounds(50, 356, 300, 30); // Ajuste en las coordenadas para alinear con la etiqueta
			costo_txtfield.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
			costo_txtfield.setVisible(false);
			panel_formulario_editar.add(costo_txtfield);

			JButton btn_guardar = new JButton("Guardar");
			JButton btn_Buscar = new JButton("Buscar");
			btn_Buscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn_guardar.setVisible(true);
					marca_tag.setVisible(true);
					marca_txtfield.setVisible(true);
					modelo_tag.setVisible(true);
					modelo_txtfield.setVisible(true);
					año_tag.setVisible(true);
					año_txtfield.setVisible(true);
					color_tag.setVisible(true);
					color_txtfield.setVisible(true);
					trans_tag.setVisible(true);
					trans_txtfield.setVisible(true);
					costo_tag.setVisible(true);
					costo_txtfield.setVisible(true);
					btn_Buscar.setVisible(false);

				}
			});

			btn_Buscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn_Buscar.setBounds(151, 261, 89, 23);
			panel_formulario_editar.add(btn_Buscar);

			btn_guardar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(panel_formulario_editar, "Vehículo modificado con éxito:)");
					for (int i = 0; i < paneles.length; i++) {
						frame.remove(paneles[i]);
					}
					vehiculos(frame);
					frame.repaint();
					frame.revalidate();
				}
			});

			btn_guardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btn_guardar.setBounds(151, 410, 89, 23);
			btn_guardar.setVisible(false);
			panel_formulario_editar.add(btn_guardar);

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

		frame.getContentPane().add(panelVehiculos);
		frame.repaint();
		frame.revalidate();
		frame.setTitle("Vehiculos");

	}

	
	
	
	public void  carros (JFrame frame) {
		frame.setTitle("Carros");
		JPanel panelCarros=new JPanel();
		panelCarros.setBackground(new Color(0, 0, 0));
		panelCarros.setBounds(0, 0, 1184, 638);
		panelCarros.setLayout(null);
		
		frame.getContentPane().add(panelCarros);
		
		JPanel panel_1 = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				super.paintComponent(create);
				Graphics2D g2d=(Graphics2D)create;
			}
		};
		
		panel_1.setBackground(new Color(163, 184, 210));
		panel_1.setBounds(29, 27, 1125, 580);
		panelCarros.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Vehículos");
		lblNewLabel_4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 40));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(465, 1, 200, 69);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(1, 6, 27));
		lblNewLabel_3.setBounds(10, 10, 1105, 50);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(0, 0, 1125, 70);
		panel_1.add(lblNewLabel_2);
		
		
		
		JButton ferButton=new JButton();
		ferButton.setContentAreaFilled(false);
		ferButton.setBorderPainted(false);
		ferButton.setBounds(60, 106, 200, 198);
		ferButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ferrari");
			}
		});
		panel_1.add(ferButton);
		
		JButton masButton=new JButton();
		masButton.setContentAreaFilled(false);
		masButton.setBorderPainted(false);
		masButton.setBounds(326, 106, 200, 198);
		masButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Maserati");
			}
		});
		panel_1.add(masButton);
		
		JButton bmwButton=new JButton();
		bmwButton.setContentAreaFilled(false);
		bmwButton.setBorderPainted(false);
		bmwButton.setBounds(591, 106, 200, 198);
		bmwButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BMW");
			}
		});
		panel_1.add(bmwButton);
		
		JButton mcButton=new JButton();
		mcButton.setContentAreaFilled(false);
		mcButton.setBorderPainted(false);
		mcButton.setBounds(859, 106, 200, 198);
		mcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("MClaren");
			}
		});
		panel_1.add(mcButton);
		
		JButton porButton=new JButton();
		porButton.setContentAreaFilled(false);
		porButton.setBorderPainted(false);
		porButton.setBounds(61, 348, 198, 200);
		porButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Porsche");
			}
		});
		panel_1.add(porButton);
		
		JButton lamboButton=new JButton();
		lamboButton.setContentAreaFilled(false);
		lamboButton.setBorderPainted(false);
		lamboButton.setBounds(326,348 , 200, 200);
		lamboButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Lamborghini");
			}
		});
		panel_1.add(lamboButton);
		
		JButton bugaButton=new JButton();
		bugaButton.setContentAreaFilled(false);
		bugaButton.setBorderPainted(false);
		bugaButton.setBounds(591, 348, 200, 198);
		bugaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bugatti");
			}
		});
		panel_1.add(bugaButton);
		
		JButton bentButton=new JButton();
		bentButton.setContentAreaFilled(false);
		bentButton.setBorderPainted(false);
		bentButton.setBounds(860, 348, 200, 198);
		bentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bentley");
			}
		});
		panel_1.add(bentButton);
		
		JLabel ferrari = new JLabel("Ferrari");
		ferrari.setForeground(new Color(255, 255, 255));
		ferrari.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		ferrari.setBounds(116, 266, 91, 25);
		panel_1.add(ferrari);
		
		JLabel imgFerr=new JLabel();
		imgFerr.setIcon(new ImageIcon(getClass().getResource("/media/ferrari.png")));
		imgFerr.setBounds(72, 117, 200, 150);
		panel_1.add(imgFerr);
		
		JLabel maserati = new JLabel("Maserati");
		maserati.setForeground(new Color(255, 255, 255));
		maserati.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		maserati.setBounds(372, 266, 115, 25);
		panel_1.add(maserati);
		
		JLabel imgMas=new JLabel();
		imgMas.setIcon(new ImageIcon(getClass().getResource("/media/maserati.png")));
		imgMas.setBounds(335, 117, 200, 150);
		panel_1.add(imgMas);
		
		JLabel bmw = new JLabel("BMW");
		bmw .setForeground(new Color(255, 255, 255));
		bmw .setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		bmw .setBounds(656, 267, 76, 25);
		panel_1.add(bmw );
		
		JLabel imgBMW=new JLabel();
		imgBMW.setIcon(new ImageIcon(getClass().getResource("/media/bmw.png")));
		imgBMW.setBounds(599, 115, 200, 150);
		panel_1.add(imgBMW);
		
		JLabel mcLaren = new JLabel("McLaren");
		mcLaren .setForeground(new Color(255, 255, 255));
		mcLaren.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		mcLaren.setBounds(905, 266, 129, 25);
		panel_1.add(mcLaren);
		

		JLabel imgMac=new JLabel();
		imgMac.setIcon(new ImageIcon(getClass().getResource("/media/maclaren.png")));
		imgMac.setBounds(873, 117, 200, 150);
		panel_1.add(imgMac);
		
		JLabel porsche = new JLabel("Porsche");
		porsche.setForeground(new Color(255, 255, 255));
		porsche.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		porsche.setBounds(108, 507, 106, 34);
		panel_1.add(porsche);
		
		JLabel imgPor=new JLabel();
		imgPor.setIcon(new ImageIcon(getClass().getResource("/media/porsche.png")));
		imgPor.setBounds(68, 356, 200, 150);
		panel_1.add(imgPor);
		
		JLabel lambo = new JLabel("Lamborghini");
		lambo .setForeground(new Color(255, 255, 255));
		lambo.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		lambo.setBounds(347, 506, 160, 34);
		panel_1.add(lambo);
		
		JLabel imgLambo=new JLabel();
		imgLambo.setIcon(new ImageIcon(getClass().getResource("/media/lambo.png")));
		imgLambo.setBounds(335, 356, 200, 150);
		panel_1.add(imgLambo);
		
		JLabel bugatti = new JLabel("Bugatti");
		bugatti .setForeground(new Color(255, 255, 255));
		bugatti.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		bugatti.setBounds(643, 506, 106, 34);
		panel_1.add(bugatti);
		
		JLabel imgBug=new JLabel();
		imgBug.setIcon(new ImageIcon(getClass().getResource("/media/bugatti.png")));
		imgBug.setBounds(601, 356, 200, 150);
		panel_1.add(imgBug);
		
		JLabel bentley = new JLabel("Bentley");
		bentley .setForeground(new Color(255, 255, 255));
		bentley.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		bentley.setBounds(915, 506, 129, 34);
		panel_1.add(bentley);
		
		JLabel imgBen=new JLabel();
		imgBen.setIcon(new ImageIcon(getClass().getResource("/media/bentley.png")));
		imgBen.setBounds(871, 356, 200, 150);
		panel_1.add(imgBen);
		
		JLabel item1=new JLabel();
		item1.setIcon(new ImageIcon(getClass().getResource("/media/item1.png")));
		item1.setBounds(326, 90, 230, 230);
		panel_1.add(item1);
		
		JLabel item2=new JLabel();
		item2.setIcon(new ImageIcon(getClass().getResource("/media/item2.png")));
		item2.setBounds(60, 90, 200, 230);
		panel_1.add(item2);
		
		JLabel item3=new JLabel();
		item3.setIcon(new ImageIcon(getClass().getResource("/media/item1.png")));
		item3.setBounds(860, 90, 230, 230);
		panel_1.add(item3);
		
		JLabel item4=new JLabel();
		item4.setIcon(new ImageIcon(getClass().getResource("/media/item2.png")));
		item4.setBounds(591, 90, 230, 230);
		panel_1.add(item4);
		
		JLabel item5=new JLabel();
		item5.setIcon(new ImageIcon(getClass().getResource("/media/item2.png")));
		item5.setBounds(326, 332, 230, 230);
		panel_1.add(item5);
		
		JLabel item6=new JLabel();
		item6.setIcon(new ImageIcon(getClass().getResource("/media/item1.png")));
		item6.setBounds(60,332 , 200, 230);
		panel_1.add(item6);
		
		JLabel item7=new JLabel();
		item7.setIcon(new ImageIcon(getClass().getResource("/media/item2.png")));
		item7.setBounds(860, 332, 230, 230);
		panel_1.add(item7);
		
		JLabel item8=new JLabel();
		item8.setIcon(new ImageIcon(getClass().getResource("/media/item1.png")));
		item8.setBounds(591, 332, 230, 230);
		panel_1.add(item8);
	
		
	}
	
	private void rentas(JFrame frame) {
		frame.setTitle("Rentas");
		JPanel rentaPanel=new JPanel();
		rentaPanel.setBackground(new Color(0, 0, 0));
		
		rentaPanel.setBounds(0, 0, 1184, 638);
		rentaPanel.setLayout(null);
	
		String carro="Bugatti";
		JLabel label = new JLabel(carro);
		label.setFont(new Font("", Font.BOLD, 20));
		frame.getContentPane().add(rentaPanel);
		
		JPanel panel_1 = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				super.paintComponent(create);
				Graphics2D g2d=(Graphics2D)create;
				
				g2d.setColor(new Color(163,184,210));
				g2d.fillRect(850,0, 310,580 );
				
				g2d.setColor(new Color(1,6,27));
				g2d.fillOval(690, 118, 320, 320);
				
				g2d.setColor(new Color(1,6,27));
				g2d.fillRect(21, 21, 506, 539);
				
				try {
					BufferedImage image= ImageIO.read(getClass().getResource("/media/car.png"));
					g2d.drawImage(image,610,170,450,200,null);
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			
			}
		};
		
		panel_1.setBackground(new Color(43, 59, 89));
		panel_1.setBounds(29, 27, 1125, 580);
		rentaPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(163, 184, 210));
		panel_6.setBounds(34, 35, 479, 514);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Renta");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 40));
		lblNewLabel.setBounds(164, 21, 140, 52);
		panel_6.add(lblNewLabel);
		
		JLabel fechaInicial = new JLabel("Fecha inicial");
		fechaInicial.setBackground(new Color(0, 0, 0));
		fechaInicial.setHorizontalAlignment(SwingConstants.CENTER);
		fechaInicial.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		fechaInicial.setBounds(93, 159, 149, 38);
		panel_6.add(fechaInicial);
		
		JLabel nomCliente = new JLabel("Nombre del cliente");
		nomCliente.setBackground(new Color(0, 0, 0));
		nomCliente.setHorizontalAlignment(SwingConstants.CENTER);
		nomCliente.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		nomCliente.setBounds(82, 73, 249, 38);
		panel_6.add(nomCliente);
		
		JTextField respCliente = new JTextField();
		respCliente.setBackground(new Color(255, 255, 255));
		respCliente.setBounds(93, 112, 300, 40);
		panel_6.add(respCliente);
		respCliente.setColumns(10);
		
		JButton vaciar = new JButton();
		vaciar.setIcon(new ImageIcon(getClass().getResource("/media/vaciar.png")));
		vaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("vaciar");
			}
		});
		vaciar.setContentAreaFilled(false);
		vaciar.setBorderPainted(false);
		vaciar.setBounds(57, 428, 140, 50);
		panel_6.add(vaciar);
		
		JButton guardar = new JButton();
		guardar.setIcon(new ImageIcon(getClass().getResource("/media/rentar.png")));
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("rentar");
			}
		});
		guardar.setContentAreaFilled(false);
		guardar.setBorderPainted(false);
		guardar.setBounds(253, 428, 140, 50);
		panel_6.add(guardar);
		
		JButton atras = new JButton("");
		atras.setIcon(new ImageIcon(getClass().getResource("/media/volver.png")));
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("atras");
			}
		});
		atras.setContentAreaFilled(false);
		atras.setBorderPainted(false);
		atras.setBounds(0, 3, 72, 65);
		panel_6.add(atras);
		
		JLabel iconPersona = new JLabel("");
		iconPersona.setIcon(new ImageIcon(getClass().getResource("/media/persona.png")));
		iconPersona.setOpaque(false);
		iconPersona.setBounds(52, 112, 36, 36);
		panel_6.add(iconPersona);
		
		JLabel iconFecha1 = new JLabel("");
		iconFecha1.setIcon(new ImageIcon(getClass().getResource("/media/fecha1.png")));
		iconFecha1.setOpaque(false);
		iconFecha1.setBounds(52, 202, 36, 36);
		panel_6.add(iconFecha1);
		
		JLabel iconFecha2 = new JLabel("");
		iconFecha2.setIcon(new ImageIcon(getClass().getResource("/media/fecha2.png")));
		iconFecha2.setOpaque(false);
		iconFecha2.setBounds(52, 281, 36, 36);
		panel_6.add(iconFecha2);

		JLabel iconMonto = new JLabel("");
		iconMonto.setIcon(new ImageIcon(getClass().getResource("/media/monto.png")));
		iconMonto.setOpaque(false);
		iconMonto.setBounds(52, 362, 36, 36);
		panel_6.add(iconMonto);
		
		
		
		
		JTextField inicialRespuesta = new JTextField();
		inicialRespuesta.setColumns(10);
		inicialRespuesta.setBackground(Color.WHITE);
		inicialRespuesta.setBounds(93, 199, 300, 40);
		panel_6.add(inicialRespuesta);
		
		JButton rentar = new JButton("", null);
		rentar.setContentAreaFilled(false);
		rentar.setBorderPainted(false);
		rentar.setBounds(218, 443, 155, 60);
		panel_6.add(rentar);
		
		JLabel fechaFinal = new JLabel("Fecha final");
		fechaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		fechaFinal.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		fechaFinal.setBackground(new Color(255, 255, 255));
		fechaFinal.setBounds(82, 243, 155, 38);
		panel_6.add(fechaFinal);
		
		JTextField finalResp = new JTextField();
		finalResp.setColumns(10);
		finalResp.setBackground(Color.WHITE);
		finalResp.setBounds(93, 281, 300, 40);
		panel_6.add(finalResp);
		
		JLabel costoFinal = new JLabel("Costo total");
		costoFinal.setHorizontalAlignment(SwingConstants.CENTER);
		costoFinal.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		costoFinal.setBackground(Color.BLACK);
		costoFinal.setBounds(87, 321, 155, 38);
		panel_6.add(costoFinal);
		
		JLabel costoResp = new JLabel("82398");
		costoResp.setOpaque(true);
		costoResp.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp.setBackground(new Color(255, 255, 255));
		costoResp.setBounds(96, 358, 297, 40);
		panel_6.add(costoResp);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(1, 6, 21));
		panel_2.setBounds(611, 35, 479, 74);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setForeground(new Color(255, 255, 255));
		lblModelo.setBounds(0, 9, 126, 30);
		lblModelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblModelo.setBackground(Color.BLACK);
		panel_2.add(lblModelo);
		
		JLabel nomCliente_1_1 = new JLabel("Color");
		nomCliente_1_1.setForeground(new Color(255, 255, 255));
		nomCliente_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		nomCliente_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		nomCliente_1_1.setBackground(Color.BLACK);
		nomCliente_1_1.setBounds(10, 36, 85, 30);
		panel_2.add(nomCliente_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(169, 9, 300, 25);
		panel_2.add(comboBox);
		
		JLabel costoResp_1 = new JLabel("82398");
		costoResp_1.setBounds(169, 39, 300, 25);
		panel_2.add(costoResp_1);
		costoResp_1.setOpaque(true);
		costoResp_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_1.setBackground(Color.WHITE);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(1, 6, 21));
		panel_2_1.setBounds(611, 446, 479, 103);
		panel_1.add(panel_2_1);
		
		JLabel lblCostoPorDa = new JLabel("Costo por día");
		lblCostoPorDa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoPorDa.setForeground(Color.WHITE);
		lblCostoPorDa.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblCostoPorDa.setBackground(Color.BLACK);
		lblCostoPorDa.setBounds(0, 6, 168, 30);
		panel_2_1.add(lblCostoPorDa);
		
		JLabel nomCliente_1_1_1 = new JLabel("Año");
		nomCliente_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		nomCliente_1_1_1.setForeground(Color.WHITE);
		nomCliente_1_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		nomCliente_1_1_1.setBackground(Color.BLACK);
		nomCliente_1_1_1.setBounds(0, 36, 72, 30);
		panel_2_1.add(nomCliente_1_1_1);
		
		JLabel costoResp_1_1 = new JLabel("82398");
		costoResp_1_1.setOpaque(true);
		costoResp_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_1_1.setBackground(Color.WHITE);
		costoResp_1_1.setBounds(169, 39, 300, 25);
		panel_2_1.add(costoResp_1_1);
		
		JLabel nomCliente_1_1_1_1 = new JLabel("Transmisión");
		nomCliente_1_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		nomCliente_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		nomCliente_1_1_1_1.setForeground(Color.WHITE);
		nomCliente_1_1_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		nomCliente_1_1_1_1.setBackground(Color.BLACK);
		nomCliente_1_1_1_1.setBounds(10, 66, 141, 30);
		panel_2_1.add(nomCliente_1_1_1_1);
		
		JLabel costoResp_1_1_1 = new JLabel("82398");
		costoResp_1_1_1.setOpaque(true);
		costoResp_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_1_1_1.setBackground(Color.WHITE);
		costoResp_1_1_1.setBounds(169, 69, 300, 25);
		panel_2_1.add(costoResp_1_1_1);
		
		JLabel costoResp_1_1_2 = new JLabel("82398");
		costoResp_1_1_2.setOpaque(true);
		costoResp_1_1_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_1_1_2.setBackground(Color.WHITE);
		costoResp_1_1_2.setBounds(169, 9, 300, 25);
		panel_2_1.add(costoResp_1_1_2);
		
		
		JButton flecha2 = new JButton();
		flecha2.setContentAreaFilled(false);
		flecha2.setBorderPainted(false);
		flecha2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("1");
			}
		});
		flecha2.setIcon(new ImageIcon(getClass().getResource("/media/flecha2.png")));
		flecha2.setBounds(611, 375, 50, 60);
		panel_1.add(flecha2);
		
		JButton flecha1 = new JButton();
		flecha1.setIcon(new ImageIcon(getClass().getResource("/media/flecha1.png")));
		flecha1.setContentAreaFilled(false);
		flecha1.setBorderPainted(false);
		flecha1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("2");
			}
		});
		flecha1.setBounds(1040, 375, 50, 60);
		panel_1.add(flecha1);
		
		JLabel colorCoche = new JLabel("Negro");
		colorCoche.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		colorCoche.setVerticalAlignment(SwingConstants.BOTTOM);
		colorCoche.setForeground(new Color(255, 255, 255));
		colorCoche.setBounds(813, 395, 73, 30);
		panel_1.add(colorCoche);
		
		JLabel marcaCarro = new JLabel("Buggatti");
		marcaCarro.setVerticalAlignment(SwingConstants.BOTTOM);
		marcaCarro.setForeground(Color.WHITE);
		marcaCarro.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		marcaCarro.setBounds(801, 130, 106, 30);
		panel_1.add(marcaCarro);
		
	}
	private void editar(JFrame frame) {
		frame.setTitle("Editar");
		JPanel editarPanel=new JPanel();
		editarPanel.setBackground(new Color(0, 0, 0));
		
		editarPanel.setBounds(0, 0, 1184, 638);
		editarPanel.setLayout(null);
	
		String carro="Bugatti";
		JLabel label = new JLabel(carro);
		label.setFont(new Font("", Font.BOLD, 20));
		frame.getContentPane().add(editarPanel);
		
		JPanel panel_1 = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				super.paintComponent(create);
				Graphics2D g2d=(Graphics2D)create;
				
				g2d.setColor(new Color(163,184,210));
				g2d.fillRect(850,0, 310,580 );
				
				g2d.setColor(new Color(1,6,27));
				g2d.fillOval(690, 118, 320, 320);
				
				g2d.setColor(new Color(1,6,27));
				g2d.fillRect(21, 21, 506, 539);
				
				try {
					BufferedImage image= ImageIO.read(getClass().getResource("/media/car.png"));
					g2d.drawImage(image,610,170,450,200,null);
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			
			}
		};
		
		panel_1.setBackground(new Color(43, 59, 89));
		panel_1.setBounds(29, 27, 1125, 580);
		editarPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(163, 184, 210));
		panel_6.setBounds(34, 35, 479, 514);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Editar");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 40));
		lblNewLabel.setBounds(164, 21, 140, 52);
		panel_6.add(lblNewLabel);
		
		JLabel fechaInicial = new JLabel("Fecha inicial");
		fechaInicial.setBackground(new Color(0, 0, 0));
		fechaInicial.setHorizontalAlignment(SwingConstants.CENTER);
		fechaInicial.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		fechaInicial.setBounds(93, 159, 149, 38);
		panel_6.add(fechaInicial);
		
		JLabel nomCliente = new JLabel("Nombre del cliente");
		nomCliente.setBackground(new Color(0, 0, 0));
		nomCliente.setHorizontalAlignment(SwingConstants.CENTER);
		nomCliente.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		nomCliente.setBounds(82, 73, 249, 38);
		panel_6.add(nomCliente);
		
		JTextField respCliente = new JTextField();
		respCliente.setBackground(new Color(255, 255, 255));
		respCliente.setBounds(93, 112, 300, 40);
		panel_6.add(respCliente);
		respCliente.setColumns(10);
		
		JButton eliminar = new JButton();
		eliminar.setIcon(new ImageIcon(getClass().getResource("/media/eliminar.png")));
		eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Eliminar cambios");
			}
		});
		eliminar.setContentAreaFilled(false);
		eliminar.setBorderPainted(false);
		eliminar.setBounds(57, 428, 140, 50);
		panel_6.add(eliminar);
		
		JButton guardar = new JButton();
		guardar.setIcon(new ImageIcon(getClass().getResource("/media/guardarCambios.png")));
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Eliminar cambios");
			}
		});
		guardar.setContentAreaFilled(false);
		guardar.setBorderPainted(false);
		guardar.setBounds(253, 428, 140, 50);
		panel_6.add(guardar);
		
		JButton atras = new JButton("");
		atras.setIcon(new ImageIcon(getClass().getResource("/media/volver.png")));
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("atras");
			}
		});
		atras.setContentAreaFilled(false);
		atras.setBorderPainted(false);
		atras.setBounds(0, 3, 72, 65);
		panel_6.add(atras);
		
		JLabel iconPersona = new JLabel("");
		iconPersona.setIcon(new ImageIcon(getClass().getResource("/media/persona.png")));
		iconPersona.setOpaque(false);
		iconPersona.setBounds(52, 112, 36, 36);
		panel_6.add(iconPersona);
		
		JLabel iconFecha1 = new JLabel("");
		iconFecha1.setIcon(new ImageIcon(getClass().getResource("/media/fecha1.png")));
		iconFecha1.setOpaque(false);
		iconFecha1.setBounds(52, 202, 36, 36);
		panel_6.add(iconFecha1);
		
		JLabel iconFecha2 = new JLabel("");
		iconFecha2.setIcon(new ImageIcon(getClass().getResource("/media/fecha2.png")));
		iconFecha2.setOpaque(false);
		iconFecha2.setBounds(52, 281, 36, 36);
		panel_6.add(iconFecha2);

		JLabel iconMonto = new JLabel("");
		iconMonto.setIcon(new ImageIcon(getClass().getResource("/media/monto.png")));
		iconMonto.setOpaque(false);
		iconMonto.setBounds(52, 362, 36, 36);
		panel_6.add(iconMonto);
		
		
		
		
		JTextField inicialRespuesta = new JTextField();
		inicialRespuesta.setColumns(10);
		inicialRespuesta.setBackground(Color.WHITE);
		inicialRespuesta.setBounds(93, 199, 300, 40);
		panel_6.add(inicialRespuesta);
		
		JButton rentar = new JButton("", null);
		rentar.setContentAreaFilled(false);
		rentar.setBorderPainted(false);
		rentar.setBounds(218, 443, 155, 60);
		panel_6.add(rentar);
		
		JLabel fechaFinal = new JLabel("Fecha final");
		fechaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		fechaFinal.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		fechaFinal.setBackground(new Color(255, 255, 255));
		fechaFinal.setBounds(82, 243, 155, 38);
		panel_6.add(fechaFinal);
		
		JTextField finalResp = new JTextField();
		finalResp.setColumns(10);
		finalResp.setBackground(Color.WHITE);
		finalResp.setBounds(93, 281, 300, 40);
		panel_6.add(finalResp);
		
		JLabel costoFinal = new JLabel("Costo total");
		costoFinal.setHorizontalAlignment(SwingConstants.CENTER);
		costoFinal.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		costoFinal.setBackground(Color.BLACK);
		costoFinal.setBounds(87, 321, 155, 38);
		panel_6.add(costoFinal);
		
		JLabel costoResp = new JLabel("82398");
		costoResp.setOpaque(true);
		costoResp.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp.setBackground(new Color(255, 255, 255));
		costoResp.setBounds(96, 358, 297, 40);
		panel_6.add(costoResp);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(1, 6, 21));
		panel_2.setBounds(611, 35, 479, 74);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setForeground(new Color(255, 255, 255));
		lblModelo.setBounds(0, 9, 126, 30);
		lblModelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblModelo.setBackground(Color.BLACK);
		panel_2.add(lblModelo);
		
		JLabel nomCliente_1_1 = new JLabel("Color");
		nomCliente_1_1.setForeground(new Color(255, 255, 255));
		nomCliente_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		nomCliente_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		nomCliente_1_1.setBackground(Color.BLACK);
		nomCliente_1_1.setBounds(10, 36, 85, 30);
		panel_2.add(nomCliente_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(169, 9, 300, 25);
		panel_2.add(comboBox);
		
		JLabel costoResp_1 = new JLabel("82398");
		costoResp_1.setBounds(169, 39, 300, 25);
		panel_2.add(costoResp_1);
		costoResp_1.setOpaque(true);
		costoResp_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_1.setBackground(Color.WHITE);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(1, 6, 21));
		panel_2_1.setBounds(611, 446, 479, 103);
		panel_1.add(panel_2_1);
		
		JLabel lblCostoPorDa = new JLabel("Costo por día");
		lblCostoPorDa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoPorDa.setForeground(Color.WHITE);
		lblCostoPorDa.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblCostoPorDa.setBackground(Color.BLACK);
		lblCostoPorDa.setBounds(0, 6, 168, 30);
		panel_2_1.add(lblCostoPorDa);
		
		JLabel nomCliente_1_1_1 = new JLabel("Año");
		nomCliente_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		nomCliente_1_1_1.setForeground(Color.WHITE);
		nomCliente_1_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		nomCliente_1_1_1.setBackground(Color.BLACK);
		nomCliente_1_1_1.setBounds(0, 36, 72, 30);
		panel_2_1.add(nomCliente_1_1_1);
		
		JLabel costoResp_1_1 = new JLabel("82398");
		costoResp_1_1.setOpaque(true);
		costoResp_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_1_1.setBackground(Color.WHITE);
		costoResp_1_1.setBounds(169, 39, 300, 25);
		panel_2_1.add(costoResp_1_1);
		
		JLabel nomCliente_1_1_1_1 = new JLabel("Transmisión");
		nomCliente_1_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		nomCliente_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		nomCliente_1_1_1_1.setForeground(Color.WHITE);
		nomCliente_1_1_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		nomCliente_1_1_1_1.setBackground(Color.BLACK);
		nomCliente_1_1_1_1.setBounds(10, 66, 141, 30);
		panel_2_1.add(nomCliente_1_1_1_1);
		
		JLabel costoResp_1_1_1 = new JLabel("82398");
		costoResp_1_1_1.setOpaque(true);
		costoResp_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_1_1_1.setBackground(Color.WHITE);
		costoResp_1_1_1.setBounds(169, 69, 300, 25);
		panel_2_1.add(costoResp_1_1_1);
		
		JLabel costoResp_1_1_2 = new JLabel("82398");
		costoResp_1_1_2.setOpaque(true);
		costoResp_1_1_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_1_1_2.setBackground(Color.WHITE);
		costoResp_1_1_2.setBounds(169, 9, 300, 25);
		panel_2_1.add(costoResp_1_1_2);
		
		
		JButton flecha2 = new JButton();
		flecha2.setContentAreaFilled(false);
		flecha2.setBorderPainted(false);
		flecha2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("1");
			}
		});
		flecha2.setIcon(new ImageIcon(getClass().getResource("/media/flecha2.png")));
		flecha2.setBounds(611, 375, 50, 60);
		panel_1.add(flecha2);
		
		JButton flecha1 = new JButton();
		flecha1.setIcon(new ImageIcon(getClass().getResource("/media/flecha1.png")));
		flecha1.setContentAreaFilled(false);
		flecha1.setBorderPainted(false);
		flecha1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("2");
			}
		});
		flecha1.setBounds(1040, 375, 50, 60);
		panel_1.add(flecha1);
		
		JLabel colorCoche = new JLabel("Negro");
		colorCoche.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		colorCoche.setVerticalAlignment(SwingConstants.BOTTOM);
		colorCoche.setForeground(new Color(255, 255, 255));
		colorCoche.setBounds(813, 395, 73, 30);
		panel_1.add(colorCoche);
		
		JLabel marcaCarro = new JLabel("Buggatti");
		marcaCarro.setVerticalAlignment(SwingConstants.BOTTOM);
		marcaCarro.setForeground(Color.WHITE);
		marcaCarro.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		marcaCarro.setBounds(801, 130, 106, 30);
		panel_1.add(marcaCarro);
		
	}
	
	private void consultar(JFrame frame) {
		frame.setTitle("Consultar");
		JPanel panelConsulta=new JPanel();
		panelConsulta.setBackground(new Color(0, 0, 0));
		panelConsulta.setBounds(0, 0, 1184, 638);
		panelConsulta.setLayout(null);
		
		frame.getContentPane().add(panelConsulta);
		
		JPanel panel_1 = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				super.paintComponent(create);
				Graphics2D g2d=(Graphics2D)create;
			}
		};
		
		panel_1.setBackground(new Color(163, 184, 210));
		panel_1.setBounds(29, 27, 1125, 580);
		panelConsulta.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Consultar");
		lblNewLabel_4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 40));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(465, 1, 200, 69);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(1, 6, 27));
		lblNewLabel_3.setBounds(10, 10, 1105, 50);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(0, 0, 1125, 70);
		panel_1.add(lblNewLabel_2);
		
		
		
		
		
		String tableTitle[]={"No. de renta", "Cliente", "Fecha inicial", "Fecha final", "Costo total", "Placas","Marca","Modelo", "Color", "Costo por día", "Año", "Transmisión"};
		String tableData[][]={
			    {"1", "Ehileen", "2024/04/01", "2024/04/10", "1500.0", "ABC123", "Ferrari", "Modelo1", "Rojo", "50.0", "2020", "Automática"},
			    {"2", "Henry", "2024/04/05", "2024/04/15", "2000.0", "XYZ789", "Maserati", "Modelo2", "Negro", "60.0", "2019", "Manual"},
			    {"3", "Kevin", "2024/04/10", "2024/04/20", "1800.0", "DEF456", "Porsche", "Modelo3", "Rojo", "55.0", "2021", "Automática"},
			    {"4", "Omar", "2024/04/15", "2024/04/25", "2200.0", "GHI789", "Lamborghini", "Modelo4", "Negro", "65.0", "2018", "Manual"},
			    {"5", "Roberto", "2024/04/20", "2024/04/30", "1700.0", "JKL012", "Bugatti", "Modelo5", "Rojo", "70.0", "2022", "Automática"},
			    {"6", "Melissa", "2024/04/25", "2024/05/05", "2500.0", "MNO345", "Bentley", "Modelo6", "Negro", "75.0", "2017", "Manual"},
			    {"7", "Heriberto", "2024/04/30", "2024/05/10", "1900.0", "PQR678", "BMW", "Modelo7", "Rojo", "55.0", "2023", "Automática"},
			    {"8", "Manuel", "2024/05/05", "2024/05/15", "2300.0", "STU901", "MacLaren", "Modelo8", "Negro", "80.0", "2016", "Manual"},
			    {"9", "Karim", "2024/05/10", "2024/05/20", "2100.0", "VWX234", "Ferrari", "Modelo9", "Rojo", "75.0", "2020", "Automática"},
			    {"10", "Ariel", "2024/05/15", "2024/05/25", "2400.0", "YZA567", "Maserati", "Modelo10", "Negro", "65.0", "2019", "Manual"},
			    {"11", "Hannia", "2024/05/20", "2024/05/30", "1800.0", "BCD890", "Porsche", "Modelo11", "Rojo", "60.0", "2021", "Automática"},
			    {"12", "Oscar", "2024/05/25", "2024/06/05", "2600.0", "EFG123", "Lamborghini", "Modelo12", "Negro", "70.0", "2018", "Manual"},
			    {"13", "Armando", "2024/05/30", "2024/06/10", "2000.0", "HIJ456", "Bugatti", "Modelo13", "Rojo", "80.0", "2022", "Automática"},
			    {"14", "Jassiel", "2024/06/04", "2024/06/14", "2900.0", "KLM789", "Bentley", "Modelo14", "Negro", "85.0", "2017", "Manual"},
			    {"15", "Gamaliel", "2024/06/09", "2024/06/19", "2200.0", "NOP012", "BMW", "Modelo15", "Rojo", "70.0", "2023", "Automática"},
			    {"16", "Ernesto", "2024/06/14", "2024/06/24", "2400.0", "OPQ345", "Ferrari", "Modelo16", "Rojo", "80.0", "2020", "Automática"},
			    {"17", "Zanhia", "2024/06/19", "2024/06/29", "2600.0", "RST678", "Maserati", "Modelo17", "Negro", "90.0", "2019", "Manual"},
			    {"18", "Michelle", "2024/06/24", "2024/07/04", "1900.0", "UVW901", "Porsche", "Modelo18", "Rojo", "85.0", "2021", "Automática"},
			    {"19", "Soon", "2024/06/29", "2024/07/09", "2800.0", "XYZ234", "Lamborghini", "Modelo19", "Negro", "95.0", "2018", "Manual"},
			    {"20", "Irais", "2024/07/04", "2024/07/14", "2200.0", "ABC567", "Bugatti", "Modelo20", "Rojo", "100.0", "2022", "Automática"},
			    {"21", "Elvia", "2024/07/09", "2024/07/19", "3000.0", "DEF890", "Bentley", "Modelo21", "Negro", "110.0", "2017", "Manual"},
			    {"22", "Juan", "2024/07/14", "2024/07/24", "2500.0", "GHI123", "BMW", "Modelo22", "Rojo", "95.0", "2023", "Automática"},
			    {"23", "Cristopher", "2024/07/19", "2024/07/29", "3200.0", "JKL456", "MacLaren", "Modelo23", "Negro", "120.0", "2016", "Manual"},
			    {"24", "Iram", "2024/07/24", "2024/08/03", "2700.0", "MNO789", "Ferrari", "Modelo24", "Rojo", "105.0", "2020", "Automática"},
			    {"25", "Christian", "2024/07/29", "2024/08/08", "3400.0", "PQR012", "Maserati", "Modelo25", "Negro", "115.0", "2019", "Manual"},
			    {"26", "Daniel", "2024/08/03", "2024/08/13", "2900.0", "STU345", "Porsche", "Modelo26", "Rojo", "110.0", "2021", "Automática"},
			    {"27", "Adan", "2024/08/08", "2024/08/18", "3800.0", "VWX678", "Lamborghini", "Modelo27", "Negro", "125.0", "2018", "Manual"},
			    {"28", "Carlos", "2024/08/13", "2024/08/23", "3100.0", "YZA901", "Bugatti", "Modelo28", "Rojo", "130.0", "2022", "Automática"},
			    {"29", "Joshua", "2024/08/18", "2024/08/28", "4000.0", "BCD234", "Bentley", "Modelo29", "Negro", "140.0", "2017", "Manual"},
			    {"30", "Alex", "2024/08/23", "2024/09/02", "3300.0", "EFG567", "BMW", "Modelo30", "Rojo", "125.0", "2023", "Automática"}
			};

		
		JTable productoTable= new JTable(tableData, tableTitle);
		productoTable.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
		
		 productoTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    int selectedRow = productoTable.getSelectedRow();
	                    if (selectedRow != -1) { 
	                        System.out.println("Fila seleccionada: " + selectedRow);
	                        
	                    }
	                }
	            }
	        });
		
		JScrollPane tableScroll=new JScrollPane(productoTable);
		tableScroll.setBounds(10, 97, 1105, 387);
		panel_1.add(tableScroll);
		
		
		JButton select= new JButton();
		select.setIcon(new ImageIcon(getClass().getResource("/media/seleccionar.png")));
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("selec");
				int selectedRow = productoTable.getSelectedRow();
                if (selectedRow != -1) {
				String[] rowData = new String[tableTitle.length];
		        for (int i = 0; i < tableTitle.length; i++)
		        {
		            rowData[i] = productoTable.getValueAt(selectedRow, i).toString();
		        }
		        System.out.println("Datos de la fila seleccionada:");
		        for (String data : rowData) {
		            System.out.print(data + " ");
		        }
		        System.out.println();
			}
			}
		});
		select.setContentAreaFilled(false);
		select.setBorderPainted(false);
		select.setBounds(657, 507, 140, 50);
		panel_1.add(select);
		
	
		JButton regresar = new JButton();
		regresar.setIcon(new ImageIcon(getClass().getResource("/media/regresar.png")));
		regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("vaciar");
			}
		});
		regresar.setContentAreaFilled(false);
		regresar.setBorderPainted(false);
		regresar.setBounds(324, 507, 140, 50);
		panel_1.add(regresar);
	
		
	}
	
	private void consultaIndividual(JFrame frame) {
		frame.setTitle("Consulta individual");
		JPanel consultaIndiPanel=new JPanel();
		consultaIndiPanel.setBackground(new Color(0, 0, 0));
		
		consultaIndiPanel.setBounds(0, 0, 1184, 638);
		consultaIndiPanel.setLayout(null);
	
		String carro="Bugatti";
		JLabel label = new JLabel(carro);
		label.setFont(new Font("", Font.BOLD, 20));
		frame.getContentPane().add(consultaIndiPanel);
		
		JPanel panel_1 = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				super.paintComponent(create);
				Graphics2D g2d=(Graphics2D)create;
				
				g2d.setColor(new Color(163,184,210));
				g2d.fillRect(820,0, 340,580 );
				
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
			
			}
		};
		
		panel_1.setBackground(new Color(43, 59, 89));
		panel_1.setBounds(29, 27, 1125, 580);
		consultaIndiPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(163, 184, 210));
		panel_6.setBounds(34, 35, 479, 514);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta individual");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 35));
		lblNewLabel.setBounds(52, 11, 418, 52);
		panel_6.add(lblNewLabel);
		
		JButton eliminar = new JButton();
		eliminar.setIcon(new ImageIcon(getClass().getResource("/media/elim.png")));
		eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Eliminar cambios");
			}
		});
		eliminar.setContentAreaFilled(false);
		eliminar.setBorderPainted(false);
		eliminar.setBounds(68, 457, 140, 50);
		panel_6.add(eliminar);
		
		JButton guardar = new JButton();
		guardar.setIcon(new ImageIcon(getClass().getResource("/media/editar.png")));
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Eliminar cambios");
			}
		});
		guardar.setContentAreaFilled(false);
		guardar.setBorderPainted(false);
		guardar.setBounds(259, 457, 140, 50);
		panel_6.add(guardar);
		
		JButton atras = new JButton("");
		atras.setIcon(new ImageIcon(getClass().getResource("/media/volver.png")));
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("atras");
			}
		});
		atras.setContentAreaFilled(false);
		atras.setBorderPainted(false);
		atras.setBounds(0, 3, 72, 65);
		panel_6.add(atras);
		
		JButton rentar = new JButton("", null);
		rentar.setContentAreaFilled(false);
		rentar.setBorderPainted(false);
		rentar.setBounds(218, 443, 155, 60);
		panel_6.add(rentar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 72, 460, 156);
		panel_6.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel nomCliente = new JLabel("Cliente");
		nomCliente.setBounds(2, 38, 92, 24);
		panel_3.add(nomCliente);
		nomCliente.setBackground(new Color(0, 0, 0));
		nomCliente.setHorizontalAlignment(SwingConstants.CENTER);
		nomCliente.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		
		JLabel costoResp_2 = new JLabel("82398");
		costoResp_2.setBounds(175, 10, 275, 21);
		panel_3.add(costoResp_2);
		costoResp_2.setOpaque(true);
		costoResp_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2.setBackground(Color.WHITE);
		
		JLabel fechaInicial = new JLabel("Fecha inicial");
		fechaInicial.setBounds(4, 66, 149, 24);
		panel_3.add(fechaInicial);
		fechaInicial.setBackground(new Color(0, 0, 0));
		fechaInicial.setHorizontalAlignment(SwingConstants.CENTER);
		fechaInicial.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		
		JLabel fechaFinal = new JLabel("Fecha final");
		fechaFinal.setBounds(6, 88, 129, 38);
		panel_3.add(fechaFinal);
		fechaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		fechaFinal.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		fechaFinal.setBackground(new Color(255, 255, 255));
		
		JLabel costoFinal = new JLabel("Costo total");
		costoFinal.setBounds(2, 115, 139, 38);
		panel_3.add(costoFinal);
		costoFinal.setHorizontalAlignment(SwingConstants.CENTER);
		costoFinal.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		costoFinal.setBackground(Color.BLACK);
		
		JLabel costoResp_2_1 = new JLabel("82398");
		costoResp_2_1.setOpaque(true);
		costoResp_2_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_1.setBackground(Color.WHITE);
		costoResp_2_1.setBounds(175, 38, 275, 21);
		panel_3.add(costoResp_2_1);
		
		JLabel costoResp_2_1_1 = new JLabel("82398");
		costoResp_2_1_1.setOpaque(true);
		costoResp_2_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_1_1.setBackground(Color.WHITE);
		costoResp_2_1_1.setBounds(175, 66, 275, 21);
		panel_3.add(costoResp_2_1_1);
		
		JLabel costoResp_2_1_1_1 = new JLabel("82398");
		costoResp_2_1_1_1.setOpaque(true);
		costoResp_2_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_1_1_1.setBackground(Color.WHITE);
		costoResp_2_1_1_1.setBounds(175, 97, 275, 21);
		panel_3.add(costoResp_2_1_1_1);
		
		JLabel lblNoDeRenta = new JLabel("No. de Renta");
		lblNoDeRenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoDeRenta.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblNoDeRenta.setBackground(Color.BLACK);
		lblNoDeRenta.setBounds(5, 8, 159, 24);
		panel_3.add(lblNoDeRenta);
		
		JLabel costoResp_2_1_1_1_1 = new JLabel("82398");
		costoResp_2_1_1_1_1.setOpaque(true);
		costoResp_2_1_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_1_1_1_1.setBackground(Color.WHITE);
		costoResp_2_1_1_1_1.setBounds(175, 125, 275, 21);
		panel_3.add(costoResp_2_1_1_1_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(1, 6, 26));
		panel_3_1.setBounds(10, 242, 460, 207);
		panel_6.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setForeground(new Color(255, 255, 255));
		lblMatricula.setBounds(0, 6, 118, 30);
		lblMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatricula.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblMatricula.setBackground(Color.BLACK);
		panel_3_1.add(lblMatricula);
		
		JLabel lblModelo_1 = new JLabel("Modelo");
		lblModelo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo_1.setForeground(Color.WHITE);
		lblModelo_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblModelo_1.setBackground(Color.BLACK);
		lblModelo_1.setBounds(0, 64, 97, 30);
		panel_3_1.add(lblModelo_1);
		
		JLabel lblModelo_1_1 = new JLabel("Año");
		lblModelo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo_1_1.setForeground(Color.WHITE);
		lblModelo_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblModelo_1_1.setBackground(Color.BLACK);
		lblModelo_1_1.setBounds(0, 90, 52, 30);
		panel_3_1.add(lblModelo_1_1);
		
		JLabel lblModelo_1_1_1 = new JLabel("Transmisión");
		lblModelo_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo_1_1_1.setForeground(Color.WHITE);
		lblModelo_1_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblModelo_1_1_1.setBackground(Color.BLACK);
		lblModelo_1_1_1.setBounds(0, 115, 146, 30);
		panel_3_1.add(lblModelo_1_1_1);
		
		JLabel lblModelo_1_1_1_1 = new JLabel("Color");
		lblModelo_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo_1_1_1_1.setForeground(Color.WHITE);
		lblModelo_1_1_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblModelo_1_1_1_1.setBackground(Color.BLACK);
		lblModelo_1_1_1_1.setBounds(0, 143, 72, 30);
		panel_3_1.add(lblModelo_1_1_1_1);
		
		JLabel lblModelo_1_2 = new JLabel("Marca");
		lblModelo_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo_1_2.setForeground(Color.WHITE);
		lblModelo_1_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblModelo_1_2.setBackground(Color.BLACK);
		lblModelo_1_2.setBounds(0, 35, 79, 30);
		panel_3_1.add(lblModelo_1_2);
		
		JLabel lblModelo_1_1_1_1_1 = new JLabel("Precio por día");
		lblModelo_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo_1_1_1_1_1.setForeground(Color.WHITE);
		lblModelo_1_1_1_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		lblModelo_1_1_1_1_1.setBackground(Color.BLACK);
		lblModelo_1_1_1_1_1.setBounds(0, 168, 167, 30);
		panel_3_1.add(lblModelo_1_1_1_1_1);
		
		JLabel costoResp_2_2 = new JLabel("82398");
		costoResp_2_2.setOpaque(true);
		costoResp_2_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_2.setBackground(Color.WHITE);
		costoResp_2_2.setBounds(175, 11, 275, 21);
		panel_3_1.add(costoResp_2_2);
		
		JLabel costoResp_2_2_1 = new JLabel("82398");
		costoResp_2_2_1.setOpaque(true);
		costoResp_2_2_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_2_1.setBackground(Color.WHITE);
		costoResp_2_2_1.setBounds(175, 38, 275, 21);
		panel_3_1.add(costoResp_2_2_1);
		
		JLabel costoResp_2_2_1_1 = new JLabel("82398");
		costoResp_2_2_1_1.setOpaque(true);
		costoResp_2_2_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_2_1_1.setBackground(Color.WHITE);
		costoResp_2_2_1_1.setBounds(175, 64, 275, 21);
		panel_3_1.add(costoResp_2_2_1_1);
		
		JLabel costoResp_2_2_1_1_1 = new JLabel("82398");
		costoResp_2_2_1_1_1.setOpaque(true);
		costoResp_2_2_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_2_1_1_1.setBackground(Color.WHITE);
		costoResp_2_2_1_1_1.setBounds(175, 90, 275, 21);
		panel_3_1.add(costoResp_2_2_1_1_1);
		
		JLabel costoResp_2_2_1_1_1_1 = new JLabel("82398");
		costoResp_2_2_1_1_1_1.setOpaque(true);
		costoResp_2_2_1_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_2_1_1_1_1.setBackground(Color.WHITE);
		costoResp_2_2_1_1_1_1.setBounds(175, 117, 275, 21);
		panel_3_1.add(costoResp_2_2_1_1_1_1);
		
		JLabel costoResp_2_2_1_1_1_1_1 = new JLabel("82398");
		costoResp_2_2_1_1_1_1_1.setOpaque(true);
		costoResp_2_2_1_1_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_2_1_1_1_1_1.setBackground(Color.WHITE);
		costoResp_2_2_1_1_1_1_1.setBounds(175, 144, 275, 21);
		panel_3_1.add(costoResp_2_2_1_1_1_1_1);
		
		JLabel costoResp_2_2_1_1_1_1_1_1 = new JLabel("82398");
		costoResp_2_2_1_1_1_1_1_1.setOpaque(true);
		costoResp_2_2_1_1_1_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 23));
		costoResp_2_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		costoResp_2_2_1_1_1_1_1_1.setBounds(175, 171, 275, 21);
		panel_3_1.add(costoResp_2_2_1_1_1_1_1_1);
		
	}
}


