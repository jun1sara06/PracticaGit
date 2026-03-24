import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUITraductor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Pal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITraductor frame = new GUITraductor();
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
	public GUITraductor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Pal = new JTextField();
		Pal.setBounds(174, 10, 86, 20);
		contentPane.add(Pal);
		Pal.setColumns(10);
		
		JButton btnTraducir = new JButton("Traducir");
		btnTraducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i<Lista.getListaPalabras().length; i++) {
					if (Pal.getText().equals(Lista.getPalabra(i))) {
						Pal.setText(Lista.getPalabraIngles(i));
					}
				}
				
			}
		});
		btnTraducir.setBounds(10, 9, 89, 23);
		contentPane.add(btnTraducir);
		
		JButton btnImg = new JButton("Mostrar imágen");
		btnImg.setBounds(10, 55, 120, 23);
		contentPane.add(btnImg);
	}
}
