package android.bodybuilder.appchar.com.myapplication

import android.bodybuilder.appchar.com.myapplication.Views.MainUi
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.ctx
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainUi().setContentView(this)
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
    }
}
