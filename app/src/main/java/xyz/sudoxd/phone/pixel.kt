package xyz.sudoxd.phone

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import xyz.sudoxd.phone.R

class pixel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pixel)
    }

    private fun goToUrl(url: String) {
        val uriUrl = Uri.parse(url)
        val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
        startActivity(launchBrowser)
    }

    fun gotopixelwebpage(view: View) {
        goToUrl("https://www.android.com/intl/en_au/phones/pixel/")
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }

    fun gotopixelxlwebpage(view: View) {
        goToUrl("https://www.android.com/intl/en_au/phones/pixel/")
        if (Build.VERSION.SDK_INT >= 26) {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(30)
        }
    }
}
