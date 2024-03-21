import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n = Lettura.Lettura("Inserire il primo numero");
        String s = "";
        do {
            s = Lettura.Segno("Dimmi se vuoi sommare, dividere, moltiplicare o fare la differenza");
        }
        while (!s.equals("*") && !s.equals("+") && !s.equals("/") && !s.equals("-"));
        int m = Lettura.Lettura("Inserire il secondo numero");
        operazione.op(s,n,m);


    }
}
