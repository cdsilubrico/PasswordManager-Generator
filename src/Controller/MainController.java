package Controller;

import sun.applet.Main;

import javax.swing.*;

import static Controller.GlobalController.UIChange;


public class MainController {

    private JPanel Contents;

    private JTextField txtPassword;

    private JComboBox comboCategory;
    private JComboBox comboAccountName;
    private JComboBox comboSpecific;
    private JButton btnPasswordCopy;
    private JButton btnLoginIdCopy;
    private JButton btnAddCategory;
    private JButton btnAddAccountName;
    private JLabel lblPassword;
    private JLabel lblLoginId;
    private JLabel lblAccountName;
    private JLabel lblCategory;

    public MainController() {

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
