package com.thxllez.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = findViewById(R.id.btnJogar);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instanciando intent para classe ResultadoActivity.class
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                //gerando numero aleatório (0 ou 1)
                int numero = new Random().nextInt(2);

                //passar dados para próxima activity
                intent.putExtra("numero",numero);

                //chamando próxima activity
                startActivity(intent);
            }
        });
    }
}
