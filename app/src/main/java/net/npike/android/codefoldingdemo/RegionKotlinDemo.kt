package net.npike.android.codefoldingdemo

/**
 * Created by npike on 12/12/17.
 */

internal class RegionKotlinDemo : EditorFoldKotlinDemo() {
    //region "last name stuff"
    var lastName: String? = null
    //endregion

    //region etc
    override fun helloWorld() {
        System.out.println(lastName)
    }
    //endregion
}
