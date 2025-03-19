import javax.swing.JOptionPane;

public class Ejercicio3{
    public static void main(String[] args){
        int a, b;

        a = Byte.parseByte(JOptionPane.showInputDialog("Ingresa el valor del lado de un cuadrado: "));
        b = a * 4;

        System.out.println("El perimetro es: " + b);
    }
}