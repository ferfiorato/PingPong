package br.com.fiorato.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            netScreen()
        },2000L)
    }

    private fun netScreen() {
        val nextScreen = Intent(this,
        PlayerActivity::class.java)
        startActivity(nextScreen)
        finish()
    }
}
