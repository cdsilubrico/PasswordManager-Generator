package Controller;

import javax.swing.*;

import java.awt.*;
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
    private JButton addButton;
    private JLabel loginIDLabel;
    private JLabel passwordLabel;
    private JLabel accountNameLabel;
    private JLabel categoryLabel;

    public MainController() {
        PalletesController pc = new PalletesController();
        addButton.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        accountNameLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        categoryLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        loginIDLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        passwordLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));

        btnLoginIdCopy.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        btnPasswordCopy.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));

        comboCategory.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        comboAccountName.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        comboSpecific.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddAccountController aac = new AddAccountController();
                aac.Launch();
            }
        });

    }

    public static void main(String[] args) {
        UIChange();

        JFrame mainFrame = new JFrame("Main");
        mainFrame.setContentPane((new MainController().Contents));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }
}
