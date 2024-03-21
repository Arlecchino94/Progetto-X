import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double n = Lettura.Lettura1("Inserire il primo numero");
        String s = "";
        do {
            s = Lettura.Segno("Dimmi se vuoi sommare, dividere, moltiplicare o fare la differenza \n Se vuoi fare la radice quadrata di un numero scrivere 'radice'");
        }  while (!s.equals("*") && !s.equals("+") && !s.equals("/") && !s.equals("-") && !s.equals("radice")) ;

        if (s.equals("radice")) {
           operazione.op(s,n,0);
        } else {
            double m = Lettura.Lettura2("Inserire il secondo numero");
            operazione.op(s, n, m);
        }
    }
}
