package net.npike.android.codefoldingdemo

/**
 * Created by npike on 12/12/17.
 */

open class EditorFoldKotlinDemo {
    //<editor-fold desc="first name stuff">
    var firstName: String? = null
    //</editor-fold>

    //<editor-fold desc="etc">
    open fun helloWorld() {
        System.out.println(firstName)
    }
    //endregion
}
