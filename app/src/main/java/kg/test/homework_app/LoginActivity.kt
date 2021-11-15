package kg.test.homework_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val voiti = findViewById<Button>(R.id.voiti)

        voiti.setOnClickListener{
            startActivity(Intent(this,HomeeActivity::class.java))
        }
    }
}