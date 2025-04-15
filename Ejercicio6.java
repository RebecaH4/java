//Rebe HC
import javax.swing.JOptionPane;

public class Ejercicio6{
    public static void main(String[] args){
        int a , b, total;

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio del producto: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de productos: "));

        total = a * b;
        System.out.println("El comprador debe pagar $" + total + " pesos");
    }
}  
