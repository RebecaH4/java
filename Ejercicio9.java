import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args){
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));

        if(n1>n2){
            JOptionPane.showMessageDialog(null, "El numero "+n1+" es mayor que "+ n2);
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+n2+" es mayor que "+ n1);
        }
    }
}
