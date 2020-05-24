package kr.ptus.androidbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFirstBtn.setOnClickListener {

            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)

        }

        goToSecondBtn.setOnClickListener {

            val secondIntent = Intent(this, SecondActivity::class.java)
            startActivity(secondIntent)


        }

        goToThirdBtn.setOnClickListener {

            val inputContent = phoneNum.text.toString()

            val thirdIntent = Intent(this, ThirdActivity::class.java)

            thirdIntent.putExtra("number", inputContent)

            startActivity(thirdIntent)

        }


    }
}
