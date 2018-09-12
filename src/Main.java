import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame() ;
        frame.setContentPane(new Login().getMainPanel()) ;
        frame.pack() ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        frame.setVisible(true) ;
    }
}
