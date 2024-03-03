import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloTextView: TextView = findViewById(R.id.helloTextView)
        val button: Button = findViewById(R.id.button)
        val counterTextView: TextView = findViewById(R.id.counterTextView)

        button.setOnClickListener {
            clickCount++
            counterTextView.text = clickCount.toString()
        }
    }
}
