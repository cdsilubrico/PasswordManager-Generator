package Model;

public class Accounts {

    private int id;
    private String category;
    private String subcategory;
    private int parentID;

    /*
    category:id(6) - pk, nn , ai : name(20) - nn, uq
    accountName:id(6) - pk, nn ,ai : name - nn, uq : parent id - nn, uq
    cred(loginID, password): id(6) - pk, nn : parent id - nn, uq : login id(20) - nn, uq : password(20) - nn, uq
     */



    
}
