//Rebe HC
import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args){
        int num1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero de 1 o 2 digitos: "));

        if(num1>0 && num1<=99){
            if(num1<=9){
                JOptionPane.showMessageDialog(null,"El numero tiene 1 digito");
            }else{
                JOptionPane.showMessageDialog(null,"El numero tiene 2 digitos");
            }

        }
    }
}
