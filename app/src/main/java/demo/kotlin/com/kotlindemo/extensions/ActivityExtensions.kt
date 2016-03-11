package demo.kotlin.com.kotlindemo.extensions

import android.app.Activity
import android.widget.Toast

/**
 * Created by sewl on 3/11/16.
 */
class ActivityExtensions

fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}
