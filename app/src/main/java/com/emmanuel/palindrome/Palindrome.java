package com.emmanuel.palindrome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Palindrome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        final Button btnVerify = findViewById(R.id.btnVerifyPalindrome);
        final EditText inputText = findViewById(R.id.inputText);
        final TextView labelPalResult = findViewById(R.id.labelPalResult);
        final TextView lenght = findViewById(R.id.cantidad);
        final TextView alreves = findViewById(R.id.alreves);
        final TextView masrepetido = findViewById(R.id.masrepetido);

        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ingresedText = inputText.getText().toString().replace(" ","");
                Boolean palindrome = true;

                int centro = ingresedText.length() / 2;

                for (int i = 0; i <= centro; i++) {
                    if (ingresedText.charAt(i) != ingresedText.charAt(ingresedText.length()-i-1)) {
                        palindrome = false;
                        break;
                    }
                }

                if (palindrome)
                    labelPalResult.setText("ES PALÍNDROME");
                else
                    labelPalResult.setText("NO ES PALÍNDROME");

                lenght.setText(""+ingresedText.length());

                StringBuilder builder = new StringBuilder(ingresedText);
                alreves.setText(builder.reverse().toString());

                char ptm = 'a';
                int c1 = 0; // más repetido

                for(int i=0; i<ingresedText.length(); i++) {
                    int c2 = 0;
                    char letra = ingresedText.charAt(i);
                    for(int j=0; j<ingresedText.length(); j++) {
                        if (letra == ingresedText.charAt(j))
                            c2++;
                    }
                    if(c2 > c1) {
                        c1 = c2;
                        ptm = letra;
                    }
                }

                masrepetido.setText(Character.toString(ptm));
            }
        });
    }
}
