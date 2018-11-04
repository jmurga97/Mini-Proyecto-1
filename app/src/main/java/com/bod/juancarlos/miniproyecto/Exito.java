package com.bod.juancarlos.miniproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exito extends AppCompatActivity {
    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exito);
        volver = findViewById(R.id.back);

        /**
         * Se anade un boton para regresar al menu principal
         * */

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(Exito.this,MainActivity.class);
                startActivity(volver);
            }
        });
    }
}
