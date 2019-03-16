package com.example.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton1, boton2;
    TextView texto1, texto2;
    int cont1,cont2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.boton_entran);
        boton2 = findViewById(R.id.boton_salen);
        texto1 = findViewById(R.id.texto_entran);
        texto2 = findViewById(R.id.texto_salen);
        cont1 = 0;
        cont2 = 0;

        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cont1 = cont1 + 1;
                texto1.setText(String.valueOf(cont1));
        }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cont2 = cont2 + 1;
                texto2.setText(String.valueOf(cont2));
            }
        });

    }
}
