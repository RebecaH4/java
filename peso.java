import javax.swing.*;

public class PesoPiezas {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Ingrese el número de piezas a capturar:");
        
        int numeroPiezas;
        try {
            numeroPiezas = Integer.parseInt(entrada);
            if (numeroPiezas <= 0) {
                JOptionPane.showMessageDialog(null, "El número de piezas debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int entre1_8y5_2 = 0;
        int masDe5_2 = 0;

        for (int i = 1; i <= numeroPiezas; i++) {
            String pesoEntrada = JOptionPane.showInputDialog("Ingrese el peso de la pieza #" + i + " (en kg):");
            
            try {
                double peso = Double.parseDouble(pesoEntrada);

                if (peso >= 1.8 && peso <= 5.2) {
                    entre1_8y5_2++;
                } else if (peso > 5.2) {
                    masDe5_2++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un peso válido.", "Error", JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }

        String mensaje = "Resultados:\n"
                + "Piezas entre 1.8 kg y 5.2 kg: " + entre1_8y5_2 + "\n"
                + "Piezas con más de 5.2 kg: " + masDe5_2 + "\n"
                + "Total de piezas procesadas: " + numeroPiezas;

        JOptionPane.showMessageDialog(null, mensaje, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}

