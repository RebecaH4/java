import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args){
        double n1, n2, n3,sum, prom;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingesa tu primera nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingesa tu segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingesa tu tercera nota: "));

        sum = n1 + n2 + n3;
        prom = sum/3;

        if(prom>=7){
            JOptionPane.showMessageDialog(null, "Aprobado");
        }
    }
}
