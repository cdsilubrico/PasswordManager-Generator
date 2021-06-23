package Model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    //       1 -> many      1 -> many
    //category -> subcategory -> credentials







    //*TABLES*
    //category - id, title
    //subcategory - id,title,parentid
    //credentials - id,loginid,password,parentid
    private int id;

    private List<String> category = new ArrayList<String>();
    private String title;
    private String subcategory;
    private int parentid;

    //credentials
    private String loginid;
    private String password;

    public Account(int id, List<String> category, String title, String subcategory, int parentid, String loginid, String password)
    {
        this.id = id;
        this.category = category;
        this.title = title;
        this.subcategory = subcategory;
        this.parentid = parentid;
        this.loginid = loginid;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }
}
