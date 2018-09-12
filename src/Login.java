import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel mainPanel;
    private JTextField textUserLogin;
    private JPasswordField pwdUserPassword;
    private JButton submitButton;
    private JButton clearButton;

    public Login() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, textUserLogin.getText() + " " + new String(pwdUserPassword.getPassword()));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUserLogin.setText("");
                pwdUserPassword.setText("");
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
