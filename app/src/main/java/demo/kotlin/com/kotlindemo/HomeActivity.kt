package demo.kotlin.com.kotlindemo

import android.app.Activity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import demo.kotlin.com.kotlindemo.extensions.toast

class HomeActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun showToast(view: View) {
        toast("Toast!")
    }
}
