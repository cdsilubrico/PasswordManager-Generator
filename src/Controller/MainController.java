package Controller;

import sun.applet.Main;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Controller.GlobalController.UIChange;


public class MainController {

    private JPanel Contents;

    private JTextField txtPassword;

    private JComboBox comboCategory;
    private JComboBox comboAccountName;
    private JComboBox comboSpecific;
    private JButton btnPasswordCopy;
    private JButton btnLoginIdCopy;
    private JLabel lblAccountName;
    private JLabel lblCategory;
    private JButton btnAddAnAccount;

    public MainController() {


        btnAddAnAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddAccountController aac = new AddAccountController();
                aac.Launch();
            }
        });
    }

    public static void main(String[] args)
    {
        UIChange();

        JFrame mainFrame = new JFrame("Main");
        mainFrame.setContentPane((new MainController().Contents));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
