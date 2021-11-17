package kg.test.homework_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,HomeeActivity::class.java))
            finish()
        }

        val edit_account = findViewById<Button>(R.id.edit_account)

        edit_account.setOnClickListener{
            startActivity(Intent(this,AccountEditActivity::class.java))
            finish()
        }

        val zakazy = findViewById<Button>(R.id.zakazy)

        zakazy.setOnClickListener{
            startActivity(Intent(this,BasketActivity::class.java))
            finish()
        }

        val info = findViewById<Button>(R.id.info)

        info.setOnClickListener{
            startActivity(Intent(this,InformationActivity::class.java))
            finish()
        }

        val payment = findViewById<Button>(R.id.payment)

        payment.setOnClickListener{
            startActivity(Intent(this,CardPayActivity::class.java))
            finish()
        }

        val settings = findViewById<Button>(R.id.settings)

        settings.setOnClickListener{
            startActivity(Intent(this,SettingsActivity::class.java))
            finish()
        }
    }
}