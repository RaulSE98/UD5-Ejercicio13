import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero = JOptionPane.showInputDialog("Introduce primer operando");
		int n1 = Integer.parseInt(numero);
		numero = JOptionPane.showInputDialog("Introduce segundo operando");
		int n2 = Integer.parseInt(numero);
		numero = JOptionPane.showInputDialog("Introduce signo aritmetico");
		String signo = numero;
		double div;
		
		switch (signo) {
		case "+":
			JOptionPane.showMessageDialog(null, (n1+n2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, (n1-n2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, (n1*n2));
			break;
		case "/":
			double a = Double.valueOf(n1);
			double b = Double.valueOf(n2);
			JOptionPane.showMessageDialog(null, (div = a / b));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, (n1%n2));
			break;
		case "^":
			JOptionPane.showMessageDialog(null, (Math.pow(n1, n2)));
			break;
		}

	}

}
