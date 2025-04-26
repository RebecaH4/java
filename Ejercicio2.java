//Rebe 
import javax.swing.JOptionPane;

public class Ejercicio2{
    public static void main(String[] args){
        int a, b, c, d;
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));

        c = a + b;
        d = a * b;

        System.out.println("La suma de los numeros es: " + c + " El producto de los numeros es: "+ d);
    }
}
