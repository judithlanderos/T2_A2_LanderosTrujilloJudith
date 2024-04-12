package edu.tecjerez.topicos.vista;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import edu.tecjerez.topicos.figuras.dosdimensiones.Circulo;
import edu.tecjerez.topicos.figuras.dosdimensiones.Elipse;
import edu.tecjerez.topicos.figuras.dosdimensiones.Rombo;
import edu.tecjerez.topicos.figuras.tresdimensiones.Piramide;


public class VentanaInicio extends JFrame implements ActionListener{

	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	JButton btnCirculo,btnElipse,btnRombo,btnCono,btnPiramide;

	public VentanaInicio() {
		getContentPane().setLayout(gbl);
		setBackground(Color.GRAY);
		setSize(350, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Paquetes Figuras");

		btnCirculo = new JButton("CIRCULO");
		estructura(btnCirculo, 0, 0, 1, 1);
		btnCirculo.addActionListener(this);

		btnElipse = new JButton("ELIPSE");
		estructura(btnElipse, 1, 0, 1, 1);
		btnElipse.addActionListener(this);

		btnRombo = new JButton("ROMBO");
		estructura(btnRombo, 2, 0, 1, 1);
		btnRombo.addActionListener(this);

		btnCono = new JButton("CONO");
		estructura(btnCono, 0, 1, 1, 1);
		btnCono.addActionListener(this);

		btnPiramide = new JButton("PIRAMIDE");
		estructura(btnPiramide, 1, 1, 1, 1);
		btnPiramide.addActionListener(this);
		setLocationRelativeTo(null);
		setVisible(true);

	}
	public void estructura(Component a, int gx, int gy, int gw, int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbl.setConstraints(a, gbc);
		add(a);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCirculo) {
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio: "));

			Circulo circ = new Circulo(radio);
			JOptionPane.showMessageDialog(null, "El area es: "+String.valueOf(circ.area())+"\nEl perimetro es: "+String.valueOf(circ.perimetro()));
		
		}else if(e.getSource()==btnRombo) {
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un lado: "));
			double diagmenor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el diagonal menor: "));
			double diagmayor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el diagonal mayor: "));

			Rombo r = new Rombo(lado, diagmayor, diagmenor);
			JOptionPane.showMessageDialog(null, "El area es: "+String.valueOf(r.area())+"\nEl perimetro es: "+String.valueOf(r.perimetro()));
		
		}else if(e.getSource()==btnCono) {
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio: "));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura: "));
			double generatriz = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el generatriz: "));

			Rombo romb = new Rombo(radio, altura, generatriz);
			JOptionPane.showMessageDialog(null, "El area es: "+String.valueOf(romb.area())+"\nEl perimetro es: "+String.valueOf(romb.perimetro()));
		}else if(e.getSource()==btnElipse) {
			double radioMayor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio mayor: "));
			double radioMenor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio menor: "));

			Elipse el = new Elipse(radioMayor, radioMenor);
			JOptionPane.showMessageDialog(null, "El area es: "+String.valueOf(el.area())+"\n El perimetro es: "+String.valueOf(el.perimetro()));
		}else if(e.getSource()== btnPiramide) {
		    double ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la longitud de un lado de la base de la pirámide: "));
		    double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura de la pirámide: "));
		    Piramide pira = new Piramide(ladoBase, altura);
		    
		    double areaTotal = pira.calcularAreaTotal();
		    double volumen = pira.calcularVolumen();
		    
		    JOptionPane.showMessageDialog(null, "El área superficial de la pirámide es: " + String.valueOf(areaTotal) +
		                                  "\nEl volumen de la pirámide es: " + String.valueOf(volumen));
		}	
	}
}

