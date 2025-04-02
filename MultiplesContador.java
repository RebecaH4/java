import javax.swing.*;

public class MultiplesContador {
    public static void main(String[] args) {
        int multiplosDe3 = 0;
        int multiplosDe5 = 0;
        int multiplosDe9 = 0;

        for (int i = 1; i <= 10000; i++) {
            if (i % 3 == 0) {
                multiplosDe3++;
            }
            if (i % 5 == 0) {
                multiplosDe5++;
            }
            if (i % 9 == 0) {
                multiplosDe9++;
            }
        }

        String resultados = "<html><body style='text-align:center;'>"
                + "<h1>Resultados</h1>"
                + "<p>Cantidad de múltiplos de 3: <b>" + multiplosDe3 + "</b></p>"
                + "<p>Cantidad de múltiplos de 5: <b>" + multiplosDe5 + "</b></p>"
                + "<p>Cantidad de múltiplos de 9: <b>" + multiplosDe9 + "</b></p>"
                + "</body></html>";

        JFrame frame = new JFrame("Resultados de los Múltiplos");
        JLabel label = new JLabel(resultados, SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        frame.add(label);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

