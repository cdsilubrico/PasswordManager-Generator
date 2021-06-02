package View;

import Controller.PalletesController;


import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Controller.GlobalController.UIChange;


public class MainForm {

    private JPanel Contents;

    private JTextField txtPassword;

    private JComboBox comboCategory;
    private JComboBox comboSubCategory;
    private JComboBox comboLoginID;
    private JButton btnPasswordCopy;
    private JButton btnLoginIdCopy;
    private JButton addButton;
    private JLabel loginIDLabel;
    private JLabel passwordLabel;
    private JLabel accountNameLabel;
    private JLabel categoryLabel;

    public MainForm() {

        PalletesController pc = new PalletesController();
        accountNameLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        categoryLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        loginIDLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        passwordLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));

        btnLoginIdCopy.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        btnPasswordCopy.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));

        comboCategory.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        comboSubCategory.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        comboLoginID.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));

        //comboCategory.addItem("ads");

//        try
//        {
//            System.out.println("Test");
//            dbp.setPs(dbc.getConnection().prepareStatement(dbp.getCATEGORY_QUERY()));
//            System.out.println(dbc.getConnection().prepareStatement(dbp.getCATEGORY_QUERY()));
//            dbp.setRs(dbp.getPs().executeQuery());
//
//            while(dbp.getRs().next())
//            {
//                comboCategory.addItem(dbp.getRs().getString(dbp.getCategColName()));
//            }
//        }
//        catch(Exception e)
//        {
//
//        }
//        finally
//        {
//            try
//            {
//                dbc.getConnection().close();
//            }catch(Exception e)
//            {
//
//            }
//        }



        /*
        PreparedStatement ps;
        ResultSet rs;

        try
        {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pwmgdb","root","root");
            ps = con.prepareStatement("select * from category");

            rs = ps.executeQuery();

            while(rs.next())
            {
                    comboCategory.addItem(rs.getString("title"));
            }

            con.close();


        }
        catch(Exception er)
        {
            er.printStackTrace();
        }
        finally {

        }

         */


        comboCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }

    public static void main(String[] args) {
        UIChange();

        JFrame mainFrame = new JFrame("Main");
        mainFrame.setContentPane((new MainForm().Contents));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }
}
