package kg.test.homework_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class HomeeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homee)

        val menu = findViewById<ImageButton>(R.id.menu)

        menu.setOnClickListener{
            startActivity(Intent(this,kg.test.homework_app.MenuActivity::class.java))
            finish()
        }

        val basket = findViewById<ImageView>(R.id.basket)

        basket.setOnClickListener{
            startActivity(Intent(this,kg.test.homework_app.BasketActivity::class.java))
            finish()
        }

        val account = findViewById<ImageView>(R.id.account)

        account.setOnClickListener{
            startActivity(Intent(this,AccountActivity::class.java))
            finish()
        }
    }
}