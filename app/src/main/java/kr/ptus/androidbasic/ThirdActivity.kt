package kr.ptus.androidbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val myContent = intent.getStringExtra("number")
        inputPhoneNumber.text= myContent

        thirdBackBtn.setOnClickListener {

            finish()

        }

    }
}
