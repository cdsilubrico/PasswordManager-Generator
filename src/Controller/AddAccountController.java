package Controller;

import javax.swing.*;

import static Controller.GlobalController.UIChange;

public class AddAccountController {


    private JPanel Contents;
    private JTextField textField1;
    private JTextField textField2;
    private JButton generateButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;

    AddAccountController()
    {

    }


    public static void main(String[] args)
    {
        UIChange();

        JFrame mainFrame = new JFrame("Main");
        mainFrame.setContentPane((new AddAccountController().Contents));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
