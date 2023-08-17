
import javax.swing.JOptionPane;

public class Validacioejemplo {
    public static void main(String[] args) {
        while (true) {
            int n = obtenerNumeroEntero();
            System.out.println("El numero ingresado es: " + n);
            if (n == 0){
                break;
            }
            
            for (int i = 1;i <=10;i++){
                System.out.println(n+"*"+i+"="+(n*i));
            }
        }
    }
    
    public static int obtenerNumeroEntero() {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número n  \n(Ingrese 0 para salir)"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido.");
            }
        }
    }
}
