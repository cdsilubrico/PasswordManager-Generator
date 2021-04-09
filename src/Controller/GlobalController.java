package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GlobalController{

    private static final String UITheme = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
    private static final String Resources = "resources/ViewsProperties";

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

    public static String getResources() {
        return Resources;
    }
}
