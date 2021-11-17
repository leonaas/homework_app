package kg.test.homework_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

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

        val lenta = findViewById<Button>(R.id.lenta)

        lenta.setOnClickListener{
            startActivity(Intent(this,HomeeActivity::class.java))
            finish()
        }

        val shop = findViewById<Button>(R.id.shop)

        shop.setOnClickListener{
            startActivity(Intent(this,HomeeExtraActivity::class.java))
            finish()
        }

        val zakazy = findViewById<Button>(R.id.zakazy)

        zakazy.setOnClickListener{
            startActivity(Intent(this,BasketActivity::class.java))
            finish()
        }

        val accountt = findViewById<Button>(R.id.accountt)

        accountt.setOnClickListener{
            startActivity(Intent(this,AccountActivity::class.java))
            finish()
        }

        val settings = findViewById<Button>(R.id.settings)

        settings.setOnClickListener{
            startActivity(Intent(this,SettingsActivity::class.java))
            finish()
        }

        val info = findViewById<Button>(R.id.info)

        info.setOnClickListener{
            startActivity(Intent(this,InformationActivity::class.java))
            finish()
        }
    }
}