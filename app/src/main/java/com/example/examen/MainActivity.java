package com.example.examen;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia al TextView
        TextView signInTextView = findViewById(R.id.signInTextView);

        // Texto completo
        String fullText = "Already have an account? Sign In";
        SpannableStringBuilder spannableString = new SpannableStringBuilder(fullText);

        // Encontrar la posición de "Sign In"
        int startIndex = fullText.indexOf("Sign In");
        int endIndex = startIndex + "Sign In".length();

        // Aplicar color rojo
        spannableString.setSpan(new ForegroundColorSpan(Color.RED), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Aplicar subrayado
        spannableString.setSpan(new UnderlineSpan(), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Aplicar el texto formateado al TextView
        signInTextView.setText(spannableString);
    }
}
