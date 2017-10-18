import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class BailandoTexto extends JFrame {
	// Propiedades de la clase
	private JPanel contenedor;
	private JButton boton1;
	private JTextField cajaIzq;
	private JButton boton2;
	private JTextField cajaDer;

	/**
	 * Metodo principal o main(). Lanza la aplicaci�n.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoTexto frame = new BailandoTexto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * M�todo constructor de la clase.
	 */
	public BailandoTexto() {
		// Ventana
		setTitle("Intercambio de Texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		// Contenedor
		contenedor = new JPanel();
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedor);
		contenedor.setLayout(null);
		// Bot�n superior >>>
		boton1 = new JButton(">>>");
		// Acciones
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Al presionar el bot�n se desencadenan lo eventos que
				 * contiene. El m�todo getTex() pasado como argumento del m�todo
				 * setTex(), coge el texto introducido y el m�todo setTex() lo
				 * coloca en el campo de te texto de la derecha. A continuaci�n,
				 * se ejecuta la siguiente instrucci�n que sustituye el texto
				 * introducido por una cadena vacia borr�ndolo.
				 */
				cajaDer.setText(cajaIzq.getText());
				cajaIzq.setText("");
			}
		});
		boton1.setBounds(168, 50, 97, 25);
		contenedor.add(boton1);
		// Caja de la izquierda
		cajaIzq = new JTextField();
		cajaIzq.setBounds(12, 98, 116, 22);
		contenedor.add(cajaIzq);
		cajaIzq.setColumns(10);
		// Bot�n inferior <<<
		boton2 = new JButton("<<<");
		// Acciones
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Sucede lo mismo que en el bot�n anterior pero en sentido
				 * contrario.
				 */
				cajaIzq.setText(cajaDer.getText());
				cajaDer.setText("");
			}
		});
		boton2.setBounds(168, 142, 97, 25);
		contenedor.add(boton2);
		// Caja de la derecha
		cajaDer = new JTextField();
		cajaDer.setBounds(306, 98, 116, 22);
		contenedor.add(cajaDer);
		cajaDer.setColumns(10);

	}
}
