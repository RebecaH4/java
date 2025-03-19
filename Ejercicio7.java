import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args){
        double peso, altura, imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso (kg): "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu altura(m): "));

        imc = peso/(altura*altura);

        System.out.println("Tu indice de masa corporal es: "+ imc);
    }
}
