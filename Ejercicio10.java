import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args){
        int n1, n2;
        double  a,b;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));

        if(n1>n2){
            a = n1 + n2;
            b = n1 - n2;
            JOptionPane.showMessageDialog(null, "La suma de los numeros es: "+a);
            JOptionPane.showMessageDialog(null, "La diferencia de los numeros es: "+b);
        }else{
            a = n2 * n1;
            b = n2 / n1;
            JOptionPane.showMessageDialog(null, "El producto de los numeros es: "+a);
            JOptionPane.showMessageDialog(null, "La division de los numeros es: "+b);
        }
    }
}
