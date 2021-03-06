package kg.test.homework_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout

class PayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        val card = findViewById<ConstraintLayout>(R.id.card)

        card.setOnClickListener{
            startActivity(Intent(this,CardPayActivity::class.java))
            finish()
        }

        val cash = findViewById<ConstraintLayout>(R.id.cash)

        cash.setOnClickListener{
            startActivity(Intent(this,CashPayActivity::class.java))
            finish()
        }

        val back = findViewById<ImageButton>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,PayActivity::class.java))
            finish()
        }
    }
}