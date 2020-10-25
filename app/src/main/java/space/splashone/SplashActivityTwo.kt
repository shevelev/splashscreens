package space.splashone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(5000) // 1

        setTheme(R.style.AppTheme) // 2

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_two)
    }
}