import javax.swing.*;

public class operazione {
    public static void op(String s, int n, int m) {
        double risultato = 0;
        String output = "";
        switch (s) {
            case "*":
                risultato = n * m;
                output += risultato;
                break;
            case "/":
                risultato = (double) n / m;
                output += risultato;
                break;
            case "+":
                risultato = n + m;
                output += risultato;
                break;
            case "-":
                risultato = n - m;
                output += risultato;
                break;
            case "%":
                risultato = n % m;
                output+= risultato;
                break;

            default:
                output += "Il segno è errato";
                break;
        }
        JOptionPane.showMessageDialog(null, output);
    }
}

