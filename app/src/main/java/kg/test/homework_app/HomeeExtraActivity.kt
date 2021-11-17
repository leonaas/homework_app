package kg.test.homework_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class HomeeExtraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_extra)

        val menu = findViewById<ImageButton>(R.id.menu)

        menu.setOnClickListener{
            startActivity(Intent(this,MenuActivity::class.java))
            finish()
        }

        val basket = findViewById<ImageView>(R.id.basket)

        basket.setOnClickListener{
            startActivity(Intent(this,BasketActivity::class.java))
            finish()
        }

        val account = findViewById<ImageView>(R.id.account)

        account.setOnClickListener{
            startActivity(Intent(this,AccountActivity::class.java))
            finish()
        }

        val info = findViewById<ImageView>(R.id.info)

        info.setOnClickListener{
            startActivity(Intent(this,InformationActivity::class.java))
            finish()
        }
    }
}