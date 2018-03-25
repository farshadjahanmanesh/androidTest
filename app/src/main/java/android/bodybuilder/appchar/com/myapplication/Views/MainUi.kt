package android.bodybuilder.appchar.com.myapplication.Views

import android.bodybuilder.appchar.com.myapplication.MainActivity
import android.bodybuilder.appchar.com.myapplication.R
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.text.InputType
import android.view.Gravity
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.constraint.layout.constraintLayout

class MainUi : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = ui.apply {
        relativeLayout {
            scrollView {
                lparams(height = matchParent, width = matchParent)

                verticalLayout {

                    lparams(height = matchParent, width = matchParent)
                    val img = imageView {
                        imageResource = R.drawable.ic_login
                    }.lparams {
                        gravity = Gravity.CENTER
                        topMargin = dip(64)
                        width = dip(100)
                        height = dip(100)
                    }

                    val vert = verticalLayout {
                        var username = editText {
                                hint = "Username"
                            setCompoundDrawables(resources.getDrawable(R.drawable.ic_lock),null,null,null)
                            }.lparams {

                                width = matchParent
                                gravity = Gravity.CENTER
                                topMargin = dip(16)
                            }

                        var password = editText {
                            hint = "Password"
                            inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
                        }.lparams {
                            width = matchParent
                            gravity = Gravity.CENTER
                            topMargin = dip(16)
                        }
                        var btnAction = button {
                            text = "Login"
                            textColor = R.color.colorTextLight
                            background = resources.getDrawable(R.drawable.drw_cricle_button)
                        }.lparams {
                            gravity = Gravity.CENTER
                            topMargin = dip(16)
                        }

                    }.lparams {
                        height = matchParent
                        width = matchParent
                        leftMargin = dip(32)
                        rightMargin = dip(32)
                        topMargin = dip(16)
                    }
                }
            }
        }
    }.view
}