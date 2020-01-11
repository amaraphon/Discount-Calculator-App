package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtPrice = findViewById<EditText>(R.id.edtPrice)
        var edtPercent = findViewById<EditText>(R.id.edtPercent)

        var checkBox = findViewById<CheckBox>(R.id.checkBox)
        var btCal = findViewById<Button>(R.id.btCal)

        var tvResult = findViewById<TextView>(R.id.tvResult)

        btCal.setOnClickListener {

            var num1:Double = edtPrice.text.toString().toDouble()
            var num2:Double = edtPercent.text.toString().toDouble()
            var sum     = 0.0
            var result  = 0.0

            if (checkBox.isChecked){

                sum     = num1*(num2/100)

                result  = sum*(7/100)


            }else{
                result  = num1-((num1*num2)/100)
            }

            tvResult.setText(result.toString())
        }
    }
}
