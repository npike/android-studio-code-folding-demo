package net.npike.android.codefoldingdemo;

/**
 * Created by npike on 12/12/17.
 */

public class EditorFoldJavaDemo {
    private String mFirstName;

    public EditorFoldJavaDemo() {
    }

    //<editor-fold desc="first name stuff">
    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }
    //</editor-fold>

}
