import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args){
        int sueldo;
        sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu sueldo: "));

        if (sueldo>= 3000){
            JOptionPane.showMessageDialog(null,"Tu sueldo es mayor a $3000 debes abonar impuestos");
        }else{
            JOptionPane.showMessageDialog(null,"Tu sueldo es menor a $3000 NO debes abonar impuestos");
        }
    }
}
