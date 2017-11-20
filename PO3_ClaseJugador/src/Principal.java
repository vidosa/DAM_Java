import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jugador.Jugador;//Como jugador esta en otro paquete importo la Clase

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {
	// Propiedades de la ventana principal
	private JPanel contentPane;
	private JTextField entrada_Nombre;
	private JTextField entrada_Apellido1;
	private JTextField entrada_Apellido2;
	private JTextField entrada_Edad;
	private JTextField entrada_Puntuacion;
	private JTextField entrada_Id;
	private JButton btn_aJugar;
	private JTextField salida_Mensaje;	
	//private static Jugador jugador1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// Instancio un objeto de la Clase Jugador
		Jugador jugador1 = new Jugador();
		jugador1.setNombre("Vicente");
		jugador1.setApellido1("Doceda");
		jugador1.setApellido2("Sanchis");
		jugador1.setEdad(50);
		// Muestra los datos del jugador por consola
		System.out.println(jugador1.toString());
		
		// Se lanza la ventana creando un objeto frame de tipo Principal() y se hace visible.		
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
	}// FIN DEL METODO QUE LANZA LA APLICACION

	/**
	 * Create the frame.
	 */
	public Principal() {

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
		JLabel lblTitulo = new JLabel("Datos del Jugador");
		lblTitulo.setForeground(new Color(0, 0, 128));
		lblTitulo.setFont(new Font("Calibri", Font.BOLD, 25));
		lblTitulo.setBounds(283, 27, 222, 22);
		contentPane.add(lblTitulo);
		// Etiqueta para el nombre del jugador
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(0, 0, 255));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(136, 98, 75, 16);
		contentPane.add(lblNombre);
		// Campo de entrada del nombre del jugador
		entrada_Nombre = new JTextField();
		entrada_Nombre.setBounds(293, 95, 278, 22);
		contentPane.add(entrada_Nombre);
		entrada_Nombre.setColumns(10);
		// Etiqueta para el primer apellido del jugador
		JLabel lblPrimerApellido = new JLabel("Primer Apellido");
		lblPrimerApellido.setForeground(new Color(0, 0, 255));
		lblPrimerApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrimerApellido.setBounds(136, 148, 121, 16);
		contentPane.add(lblPrimerApellido);
		// Campo de entrada del primer apellido del jugador
		entrada_Apellido1 = new JTextField();
		entrada_Apellido1.setColumns(10);
		entrada_Apellido1.setBounds(293, 145, 278, 22);
		contentPane.add(entrada_Apellido1);
		// Etiqueta para el segundo apellido del jugador
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido");
		lblSegundoApellido.setForeground(new Color(0, 0, 255));
		lblSegundoApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSegundoApellido.setBounds(136, 198, 145, 16);
		contentPane.add(lblSegundoApellido);
		// Campo de entrada del segundo apellido del jugador
		entrada_Apellido2 = new JTextField();
		entrada_Apellido2.setColumns(10);
		entrada_Apellido2.setBounds(293, 195, 278, 22);
		contentPane.add(entrada_Apellido2);
		// Etiqueta para la edad del jugador
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setForeground(new Color(0, 0, 255));
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdad.setBounds(136, 248, 56, 16);
		contentPane.add(lblEdad);
		// Campo de entrada de la edad del jugador
		entrada_Edad = new JTextField();
		entrada_Edad.setColumns(10);
		entrada_Edad.setBounds(293, 245, 100, 22);
		contentPane.add(entrada_Edad);
		// Etiqueta para la puntuacion del jugador
		JLabel lblPuntuacion = new JLabel("Puntuaci\u00F3n");
		lblPuntuacion.setForeground(new Color(0, 0, 255));
		lblPuntuacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPuntuacion.setBounds(136, 298, 91, 16);
		contentPane.add(lblPuntuacion);
		// Campo de entrada de la puntuación del jugador
		entrada_Puntuacion = new JTextField();
		entrada_Puntuacion.setBounds(293, 295, 100, 22);
		contentPane.add(entrada_Puntuacion);
		entrada_Puntuacion.setColumns(10);
		// Etiqueta para el Id del jugador
		JLabel lblId = new JLabel("Id");
		lblId.setForeground(new Color(0, 0, 255));
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblId.setBounds(136, 348, 56, 16);
		contentPane.add(lblId);
		// Campo de entrada del Id del jugador
		entrada_Id = new JTextField();
		entrada_Id.setBounds(293, 345, 100, 22);
		contentPane.add(entrada_Id);
		entrada_Id.setColumns(10);
		// Boton aJugar
		btn_aJugar = new JButton("A Jugar");
		btn_aJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//jugador1.setNombre(entrada_Nombre.getText());
				//jugador1.setApellido1(entrada_Apellido1.getText());
				//jugador1.setApellido2(entrada_Apellido2.getText());
				/*
				 * Convierto el valor de entrada_Edad que es un String en un Integer ya que el
				 * atributo de la clase Jugador esta declarado como entero. Para ello creo una
				 * variable intermedia edadString de tipo String y le asigon el valor del campo
				 * de texto
				 */
				//String edadString = entrada_Edad.getText();
				//int edad = Integer.valueOf(edadString);
				//jugador1.setEdad(edad);
				//salida_Mensaje.setText(" El jugador " + jugador1.getNombre() + " " + jugador1.getApellido1() + " "
						//+ jugador1.getApellido2() + " " + jugador1.getEdad() + " puede empezar a jugar");
			}
		});

		btn_aJugar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btn_aJugar.setForeground(new Color(245, 245, 245));
		btn_aJugar.setBackground(new Color(0, 0, 128));
		btn_aJugar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_aJugar.setBounds(227, 420, 278, 38);
		contentPane.add(btn_aJugar);
		// Salida de mensajes
		salida_Mensaje = new JTextField();
		salida_Mensaje.setEditable(false);
		salida_Mensaje.setBounds(136, 491, 446, 130);
		contentPane.add(salida_Mensaje);
		salida_Mensaje.setColumns(10);

	}// FIN DEL CONSTRUCTOR
}// FIN DE LA CLASE PRINCIPAL
