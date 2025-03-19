import javax.swing.JOptionPane;

public class Ejercicio5{
    public static void main(String[] args){
        int a,b,c,d,suma;
        double prom;

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer numero: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el cuarto numero: "));

        suma = a + b + c + d ;
        prom = suma/4;

        System.out.println("La suma de los numeros es: "+suma+" Y el promedio es: "+prom);
    }
}