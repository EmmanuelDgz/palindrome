package com.emmanuel.palindrome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Amigos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_amigos);

        // 220 y 284 son amigos

        final EditText num1 = findViewById(R.id.num1);
        final EditText num2 = findViewById(R.id.num2);

        Button btnAmigos = findViewById(R.id.btnAmigos);

        final TextView amigosResult = findViewById(R.id.amigosResult);

        btnAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());

                ArrayList<Integer> divisoresN1 = new ArrayList<>();
                ArrayList<Integer> divisoresN2 = new ArrayList<>();

                for(int i = 1; i <= n1/2; i++) {
                    if(n1 % i == 0) {
                        divisoresN1.add(i);
                    }
                }

                for(int i = 1; i <= n2/2; i++) {
                    if(n2 % i == 0)
                        divisoresN2.add(i);
                }

                int suma1 = 0;
                int suma2 = 0;

                for (int i: divisoresN1) {
                    suma1 = suma1 + i;
                }

                for (int i: divisoresN2) {
                    suma2 = suma2 + i;
                }

                if (suma1 == n2 && suma2 == n1) {
                    amigosResult.setText("Son Amigos");
                }
                else {
                    amigosResult.setText("NO Son Amigos");
                }
            }
        });
    }
}
