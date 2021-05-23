package app.wakayama.harusame.countday5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        plusButton.setOnClickListener{
            if(countText.text%3 == 0){
                countText.setTextColor(color.pase)
            }else{

            }
            count++
            countText.text = count.toString()
        }
        minusButton.setOnClickListener{
            count--
            countText.text = count.toStoring()
        }
        timesButton.setOnClickListener{
            count *= 3
            countText.text = count.toString()
        }
    }
}