//Rebe HC
import javax.swing.JOptionPane;

public class Ejercicio4{
    public static void main(String[] args){
        int a,b,c,d,suma, produc;

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer numero: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el cuarto numero: "));

        suma = a + b;
        produc = c +d;

        System.out.println("La suma de los primeros dos numeros es: "+suma+" Y el producto de los otros dos es: "+produc);
    }
}
