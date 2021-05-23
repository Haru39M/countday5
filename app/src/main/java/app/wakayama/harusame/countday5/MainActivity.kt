package app.wakayama.harusame.countday5

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0
        var text = ""
        countText.text = count.toString()

        plusButton.setOnClickListener{
            count++
            countText.text = count.toString()
            text = countText.text.toString()
            if(text.toInt()%3 == 0){
                countText.setTextColor(Color.parseColor("#00FF00"))
            }else{
                countText.setTextColor(Color.parseColor("#000000"))
            }

        }
        minusButton.setOnClickListener{
            count--
            countText.text = count.toString()
            text = countText.text.toString()
            if(text.toInt()%3 == 0){
                countText.setTextColor(Color.parseColor("#00FF00"))
            }else{
                countText.setTextColor(Color.parseColor("#000000"))
            }

        }
        timesButton.setOnClickListener{
            count *= 3
            countText.text = count.toString()
            text = countText.text.toString()
            if(text.toInt()%3 == 0){
                countText.setTextColor(Color.parseColor("#00FF00"))
            }else{
                countText.setTextColor(Color.parseColor("#000000"))
            }

        }
    }
}