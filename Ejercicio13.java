//Rebe HC
import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static void main(String[] args){
        String password;

        password = JOptionPane.showInputDialog("Ingresa la contraseña: ");

        if(password.equals("tesji123")){
            JOptionPane.showMessageDialog(null,"Correcto");
        }else{
            JOptionPane.showMessageDialog(null,"Error");
        }

    }
}
