import javax.swing.*;

public class Radice {
    public static void radice(String s, double n){
        String output = "";
        double risultato = 0;

        switch (s){
            case "radice":
                risultato = Math.sqrt(n);
                output += risultato;
                break;
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
