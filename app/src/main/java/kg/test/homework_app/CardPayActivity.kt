package kg.test.homework_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class CardPayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_payment)

        val buy = findViewById<Button>(R.id.buy)

        buy.setOnClickListener{
            startActivity(Intent(this,HomeeActivity::class.java))
            finish()
        }

        val back = findViewById<ImageButton>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,PayActivity::class.java))
            finish()
        }
    }
}