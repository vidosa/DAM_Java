/************************************************
 * Lanza la aplicacion.
 * Diseña los aspectos graficos
 * Valida y guarda los datos en un objeto Jugador 
 ***********************************************/

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
//importo Jugador ya que esta en otro paquete distinto de la clase principal
import juego.Jugador;

public class Principal extends JFrame {
	// Propiedades de la ventana principal
	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel lblNombre;
	private JLabel lblPrimerApellido;
	private JLabel lblSegundoApellido;
	private JLabel lblEdad;
	private JTextField entrada_Nombre;
	private JTextField entrada_Apellido1;
	private JTextField entrada_Apellido2;
	private JTextField entrada_Edad;
	private JButton btn_aJugar;
	private JTextField salida_Mensaje;

	// Genero un objeto jugador
	Jugador jugador1 = new Jugador();

	/**
	 * Lanza la aplicacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}// FIN DE MAIN

	/**
	 * Crea el marco
	 */
	public Principal() {

		// Buena práctica: inicializar el objeto
		jugador1.setNombre("");
		jugador1.setApellido1("");
		jugador1.setApellido2("");
		jugador1.setEdad(999);

		/*
		 * ASPECTO DE LA VENTANA Y EL CONTENEDOR
		 */

		setFont(new Font("Calibri Light", Font.PLAIN, 60));
		setTitle("MATHDICE");
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 710); //
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/*
		 * ETIQUETAS Y ENTRADAS DE TEXTO
		 */

		// Etiqueta para el titulo del contenedor
		lblTitulo = new JLabel("Datos del Jugador");
		lblTitulo.setForeground(new Color(0, 0, 128));
		lblTitulo.setFont(new Font("Calibri", Font.BOLD, 25));
		lblTitulo.setBounds(283, 27, 222, 22);
		contentPane.add(lblTitulo);

		// Etiqueta para el nombre del jugador
		lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(0, 0, 255));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(136, 98, 75, 16);
		contentPane.add(lblNombre);

		// Etiqueta para el primer apellido del jugador
		lblPrimerApellido = new JLabel("Primer Apellido");
		lblPrimerApellido.setForeground(new Color(0, 0, 255));
		lblPrimerApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrimerApellido.setBounds(136, 148, 121, 16);
		contentPane.add(lblPrimerApellido);

		// Etiqueta para el segundo apellido del jugador
		lblSegundoApellido = new JLabel("Segundo Apellido");
		lblSegundoApellido.setForeground(new Color(0, 0, 255));
		lblSegundoApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSegundoApellido.setBounds(136, 198, 145, 16);
		contentPane.add(lblSegundoApellido);

		// Etiqueta para la edad del jugador
		lblEdad = new JLabel("Edad");
		lblEdad.setForeground(new Color(0, 0, 255));
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdad.setBounds(136, 248, 56, 16);
		contentPane.add(lblEdad);

		// Campo de entrada del nombre del jugador
		entrada_Nombre = new JTextField();
		entrada_Nombre.setBounds(293, 97, 278, 22);
		contentPane.add(entrada_Nombre);
		entrada_Nombre.setColumns(10);
		// Listener sobre el campo de texto entrada_Nombre
		entrada_Nombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Presionando enter se rellena el nombre del jugador
				jugador1.setNombre(entrada_Nombre.getText());
			}
		});

		// Campo de entrada del primer apellido del jugador
		entrada_Apellido1 = new JTextField();
		entrada_Apellido1.setColumns(10);
		entrada_Apellido1.setBounds(293, 145, 278, 22);
		contentPane.add(entrada_Apellido1);
		// Listener sobre el campo de texto entrada_Apellido1
		entrada_Apellido1.addActionListener(new ActionListener() {
			// Presionando enter se rellena el primer apellido del jugador
			public void actionPerformed(ActionEvent arg0) {
				jugador1.setApellido1(entrada_Apellido1.getText());
			}
		});

		// Campo de entrada del segundo apellido del jugador
		entrada_Apellido2 = new JTextField();
		entrada_Apellido2.setColumns(10);
		entrada_Apellido2.setBounds(293, 195, 278, 22);
		contentPane.add(entrada_Apellido2);
		// Listener sobre el campo de texto entrada_Apellido2
		entrada_Apellido2.addActionListener(new ActionListener() {
			// Presionando enter se rellena el segundo apellido del jugado
			public void actionPerformed(ActionEvent arg0) {
				jugador1.setApellido2(entrada_Apellido2.getText());
			}
		});

		// Campo de entrada de la edad del jugador
		entrada_Edad = new JTextField();
		entrada_Edad.setColumns(10);
		entrada_Edad.setBounds(293, 245, 278, 22);
		contentPane.add(entrada_Edad);
		// Listener sobre el campo de texto entrada_Edad
		entrada_Edad.addActionListener(new ActionListener() {
			/*
			 * En el listener de la edad del jugador se realizan varias acciones. Cuando se
			 * hace intro se rellena el campo edad. Con el if se comprueba si la cadena de
			 * texto es numerica llamando al metodo isNumeric. Si lo es, el String numerico
			 * se convierte en entro (daria un error) ya el metodo setEdad() espera un
			 * entero, esto se consigue con el metodo parseInt() de la clase Integer. Con el
			 * else, de no cumplirse el if, se rellena con una edad no posible.
			 */
			public void actionPerformed(ActionEvent arg0) {

				if (jugador1.isNumeric(entrada_Edad.getText()) == true) {
					jugador1.setEdad(Integer.parseInt(entrada_Edad.getText()));
				} else {
					jugador1.setEdad(999);
				}

			}
		});

		// Configuracion salida de mensajes
		salida_Mensaje = new JTextField();
		salida_Mensaje.setEditable(false);
		salida_Mensaje.setBounds(136, 491, 446, 130);
		contentPane.add(salida_Mensaje);
		salida_Mensaje.setColumns(10);

		// Asignacion de datos
		/*jugador1.setNombre(entrada_Nombre.getText());
		jugador1.setApellido1(entrada_Apellido1.getText());
		jugador1.setApellido2(entrada_Apellido2.getText());*/

		/*
		 * String edadString = entrada_Edad.getText(); int edad =
		 * Integer.valueOf(edadString); jugador1.setEdad(edad);
		 */
		salida_Mensaje.setText(" CADA VEZ QUE INTRODUZCAS UN DATO PRESIONA ENTER");
		// Boton aJugar
		btn_aJugar = new JButton("A Jugar");
		btn_aJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (jugador1.sonEspacios1(jugador1.getNombre()))
					salida_Mensaje.setText("El nombre no es correcto o falta. Pulse enter");
				else if (jugador1.sonEspacios1(jugador1.getApellido1()))
					salida_Mensaje.setText("El primer apellido no es correcto o falta. Pulse enter");
				else if (jugador1.sonEspacios1(jugador1.getApellido2()))
					salida_Mensaje.setText("El segundo apellido no es correcto o falta. Pulse enter");
				else if (jugador1.getEdad() == 999)
					salida_Mensaje.setText("La edad no es correcta o falta. Pulse enter");

				else
					salida_Mensaje.setText("Nuevo Jugador :" + " " + jugador1.getNombre() + " " + jugador1.getApellido1()
							+ " " + jugador1.getApellido2() +  " de edad " + jugador1.getEdad()
							+ " puede comenzar a jugar.");

			}
		});

		btn_aJugar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btn_aJugar.setForeground(new Color(245, 245, 245));
		btn_aJugar.setBackground(new Color(0, 0, 128));
		btn_aJugar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_aJugar.setBounds(227, 420, 278, 38);
		contentPane.add(btn_aJugar);

	}// FIN DEL CONSTRUCTOR
}// FIN DE LA CLASE PRINCIPAL
