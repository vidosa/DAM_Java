import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiPerfil extends JFrame {
	// Propiedades,atributos o variables de la clase
	private JPanel contenedor;
	private JLabel etiquetaNombre;
	private JTextField cajaNombre;
	private JLabel etiquetaAPellidos;
	private JTextField cajaApellidos;
	private JLabel etiquetaEdad;
	private JTextField cajaEdad;
	private JLabel etiquetaMail;
	private JTextField cajaMail;

	/**
	 * Método main() que lanza la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPerfil frame = new MiPerfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}// Fin del método main

	/**
	 * Método constructor de la clase
	 */
	public MiPerfil() {
		// Variables
		String nombre = "Vicent Enric";
		String apellidos = "Doceda i Sanchis";
		int edad = 56;
		String email = "vicent.doceda@gmail.com";
		// Configuración de la ventana
		setTitle("PERFIL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 350);
		// Creación y configuracion del contenedor
		contenedor = new JPanel();
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedor);
		contenedor.setLayout(null);
		// Configuracion de etiquetas y cajas de texto
		etiquetaNombre = new JLabel("Nombre");
		etiquetaNombre.setBounds(12, 24, 56, 16);
		contenedor.add(etiquetaNombre);

		cajaNombre = new JTextField();
		cajaNombre.setBounds(12, 47, 116, 22);
		contenedor.add(cajaNombre);
		cajaNombre.setColumns(10);
		cajaNombre.setText(nombre);

		etiquetaAPellidos = new JLabel("Apellidos");
		etiquetaAPellidos.setBounds(12, 79, 56, 16);
		contenedor.add(etiquetaAPellidos);

		cajaApellidos = new JTextField();
		cajaApellidos.setBounds(12, 104, 116, 22);
		contenedor.add(cajaApellidos);
		cajaApellidos.setColumns(10);
		cajaApellidos.setText(apellidos);

		etiquetaEdad = new JLabel("Edad");
		etiquetaEdad.setBounds(12, 139, 56, 16);
		contenedor.add(etiquetaEdad);

		cajaEdad = new JTextField();
		cajaEdad.setBounds(12, 165, 33, 22);
		contenedor.add(cajaEdad);
		cajaEdad.setColumns(10);
		cajaEdad.setText(String.valueOf(edad));
		
		etiquetaMail= new JLabel("Mail");
		etiquetaMail.setBounds(12, 200, 116, 16);
		contenedor.add(etiquetaMail);
		
		cajaMail = new JTextField();
		cajaMail.setBounds(12, 229, 170, 22);
		contenedor.add(cajaMail);
		cajaMail.setColumns(10);
		cajaMail.setText(email);

	}// Fin del constructor
}// Fin de la clase
