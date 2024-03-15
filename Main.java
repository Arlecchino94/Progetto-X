public class Main {
    public static void main(String[] args) {
        int n = Lettura.Lettura("Inserire il primo numero");
        String s = Lettura.Segno("Dimmi se vuoi sommare, dividere, moltiplicare o fare la differenza");
        int m = Lettura.Lettura("Inserire il secondo numero");
        operazione.op(s,n,m);
    }
}
