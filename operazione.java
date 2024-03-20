import javax.swing.*;

public class operazione {
    public static void op(String s, int n, int m) {
        double risultato = 0;
        boolean op = true;
        String output = "";
        if (!s.equals("*") && !s.equals("/") && !s.equals("+") && !s.equals("-")) {
            output += "Il segno è errato";
            return;
        }
        if (op == true) {
           if (s.equals("*")) {
                risultato = n * m;
                output += risultato;
            }
           if (s.equals("/")) {
                risultato = (double) n / m;
                output += risultato;
            }
           if (s.equals("-")) {
                risultato = n - m;
                output += risultato;
            }
           if (s.equals("+")) {
                risultato += n + m;
                output += risultato;
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}

