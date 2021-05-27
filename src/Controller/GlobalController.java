package Controller;

import javax.swing.*;

public class GlobalController{

    private static final String UITheme = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";

    public static final void UIChange()
    {
        try{
            UIManager.setLookAndFeel(UITheme);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            //
        }
    }
}
