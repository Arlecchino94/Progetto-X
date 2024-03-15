import javax.swing.*;

public class Lettura {
    public static int Lettura(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    public static String Segno(String s){
        return JOptionPane.showInputDialog(s);
    }
}
