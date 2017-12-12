package net.npike.android.codefoldingdemo;

/**
 * Created by npike on 12/12/17.
 */

class RegionJavaDemo extends EditorFoldJavaDemo {
    private String mLastName;

    //region "last name stuff"
    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }
    //endregion
}
