package wtf.log.materialbuttontransparenttint

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private var color = Color.RED

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: AppCompatButton = findViewById(R.id.button)
        button.setOnClickListener {
            // does not appear at all
            val altColor = 0x00000000
            // blends with red, result is purple
            // val altColor = 0x660000FF
            val nextColor = if (color == Color.RED) altColor else Color.RED
            button.backgroundTintList = ColorStateList.valueOf(nextColor)
            color = nextColor
        }
    }
}
