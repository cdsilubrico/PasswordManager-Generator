package View;

import Controller.Main;
import Controller.MainController;
import Controller.PalletesController;
import Model.Db.DbConnection;


import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static Controller.GlobalController.UIChange;


public class MainForm {

    MainController mc;

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

    public MainForm(MainController mc) {
        this.mc = mc;


        PalletesController pc = new PalletesController();
        accountNameLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        categoryLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        loginIDLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        passwordLabel.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));

        btnLoginIdCopy.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        btnPasswordCopy.setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));

        getComboCategory().setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        getComboSubCategory().setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));
        getComboLoginID().setFont(new Font(pc.getFont(),Font.PLAIN,pc.getSize()));



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









        getComboCategory().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public MainForm() {
        MainController mc = new MainController();
        System.out.println(mc.getCategory().size());





//        DbConnection dbc = new DbConnection();
//        PreparedStatement ps;
//        ResultSet rs;
//
//        try
//        {
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pwmgdb","root","root");
//            ps = dbc.dbConnection().prepareStatement("select * from category");
//            rs = ps.executeQuery();
//
//            while(rs.next())
//            {
//                comboCategory.addItem(rs.getString("title"));
//            }
//
//
//        }
//        catch(Exception er)
//        {
//            er.printStackTrace();
//        }
//        finally {
//
//        }
    }

    public static void main(String[] args) {
        UIChange();

        JFrame mainFrame = new JFrame("Main");
        mainFrame.setContentPane((new MainForm().Contents));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JTextField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JComboBox getComboCategory() {
        return comboCategory;
    }

    public void setComboCategory(JComboBox comboCategory) {
        this.comboCategory = comboCategory;
    }

    public JComboBox getComboSubCategory() {
        return comboSubCategory;
    }

    public void setComboSubCategory(JComboBox comboSubCategory) {
        this.comboSubCategory = comboSubCategory;
    }

    public JComboBox getComboLoginID() {
        return comboLoginID;
    }

    public void setComboLoginID(JComboBox comboLoginID) {
        this.comboLoginID = comboLoginID;
    }
}
