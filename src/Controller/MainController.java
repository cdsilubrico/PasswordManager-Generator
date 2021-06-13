package Controller;

import Model.Account;
import Model.Db.DbConnection;
import Model.Db.DbManipulate;
import View.MainForm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainController implements Main {

    private MainForm mfView;
    private Account aModel;
    DbManipulate dbm = new DbManipulate();
    DbConnection dbc = new DbConnection();

    public MainController(Account aModel, MainForm mfView) {
        this.mfView = mfView;
        this.aModel = aModel;
    }

    public MainController() {

    }

    @Override
    public List<String> getCategory() {
        try {
            dbm.setPs(dbc.dbConnection().prepareStatement(dbm.getCATEGORY_QUERY()));
            dbm.setRs(dbm.getPs().executeQuery());
            aModel.getCategory().add("hello");
            //System.out.println(aModel.getCategory());
//            while (dbm.getRs().next()) {
//                //aModel.getCategory().add("1");
//                aModel.getCategory().add("hello");
//                //aModel.getCategory().add(dbm.getRs().getString("title"));
//                //System.out.println(aModel.getCategory());
//                //aModel.getCategory().add(dbm.getRs().getString("title"));
//                System.out.println(dbm.getRs().getString("title"));
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return aModel.getCategory();
    }

}
