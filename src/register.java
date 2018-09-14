import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register {
    private JPanel panel1;
    private JTextField txtUsername;
    private JTextField txtEmail;
    private JPasswordField pwdPassword;
    private JPasswordField pwdPassConfirm;
    private JButton OKButton;
    private JButton backButton;
    public register() {
        main main = new main();
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(new String(pwdPassword.getPassword()).equals(new String(pwdPassConfirm.getPassword()))){
                    main.input(txtUsername.getText(),txtEmail.getText(),new String(pwdPassword.getPassword()));
                    JOptionPane.showMessageDialog(null,"Success","--",JOptionPane.OK_CANCEL_OPTION);
                }else{
                    JOptionPane.showMessageDialog(null,"false","--",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
