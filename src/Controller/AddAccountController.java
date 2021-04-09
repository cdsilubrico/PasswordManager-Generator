package Controller;

import javax.swing.*;

import java.util.ResourceBundle;

import static Controller.GlobalController.*;

public class AddAccountController {

    //ResourceBundle resrouceBundle;

    private JPanel Contents;
    private JTextField loginTextField;
    private JTextField passwordTextField;
    private JButton generateResourcesViewsPropertiesButton;
    private JComboBox AccountNameComboBox;
    private JButton addResourcesViewsPropertiesButton;
    private JLabel loginIDLabel;
    private JLabel passwordLabel;
    private JComboBox CategoryComboBox;

//    public AddAccountController() {
//        resrouceBundle = ResourceBundle.getBundle(getResources());
//        resrouceBundle.getKeys();
//    }

    void Launch()
    {
        UIChange();
        JFrame addAnAccount = new JFrame("Add an Account");
        addAnAccount.setContentPane((new AddAccountController().Contents));
        //addAnAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
