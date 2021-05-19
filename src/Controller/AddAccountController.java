package Controller;

import javax.swing.*;

import java.awt.*;
import java.util.ResourceBundle;

import static Controller.GlobalController.*;

public class AddAccountController {

    AddAccountController()
    {
        ResourceBundle res = ResourceBundle.getBundle("Views");
        PalletesController pc = new PalletesController();

        loginTextField.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        passwordTextField.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        loginIDLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        passwordLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        categoryLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        accountNameLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        generateButton.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        addButton.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        CategoryComboBox.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        AccountNameComboBox.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));

    }


    private JPanel Contents;
    private JTextField loginTextField;
    private JTextField passwordTextField;
    private JButton generateButton;
    private JComboBox AccountNameComboBox;
    private JButton addButton;
    private JLabel loginIDLabel;
    private JLabel passwordLabel;
    private JComboBox CategoryComboBox;
    private JLabel categoryLabel;
    private JLabel accountNameLabel;

    void Launch()
    {
        UIChange();
        JFrame addAnAccount = new JFrame("Add an Account");
        addAnAccount.setContentPane((new AddAccountController().Contents));
        addAnAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addAnAccount.pack();
        addAnAccount.setVisible(true);
    }


    public static void main(String[] args)
    {
        UIChange();

        JFrame addAnAccount = new JFrame("Add an Account");
        addAnAccount.setContentPane((new AddAccountController().Contents));
        addAnAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addAnAccount.pack();
        addAnAccount.setVisible(true);
    }
}
