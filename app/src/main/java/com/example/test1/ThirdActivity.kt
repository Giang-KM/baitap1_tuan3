import com.example.test1.R

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.UnderlineSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() { // Sửa tên class ở đây
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_third_activity)

        val textView = findViewById<TextView> (R.id.textDetail)
        val text = "The quick Brown fox jumps over the lazy dog."
        val spannable = SpannableString(text)

        // Chữ "Brown" màu cam
        spannable.setSpan(ForegroundColorSpan(Color.parseColor("#FF6600")), 10, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Gạch chân chữ "lazy"
        spannable.setSpan(UnderlineSpan(), 30, 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        textView.text = spannable
    }
}