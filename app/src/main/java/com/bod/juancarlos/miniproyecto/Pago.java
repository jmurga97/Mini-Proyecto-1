package com.bod.juancarlos.miniproyecto;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pago extends AppCompatActivity {
    private EditText cvv;
    private EditText numero;
    private EditText fecha;
    private CheckBox credito;
    private Button comprar;
     EditText montoTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);
        numero = findViewById(R.id.numero);
        cvv = findViewById(R.id.cvv);
        fecha = findViewById(R.id.fecha);
        credito = findViewById(R.id.checkBox);

        comprar = findViewById(R.id.comprar);
        montoTotal = findViewById(R.id.monto);

        /**
         * Se recibe el la suma del valor total de elementos seleccionados para realizar el pago del mismo en esta intefaz.
         * */


       final int total = getIntent().getIntExtra("total",0);
        montoTotal.setText(total+" Bs. S");
        montoTotal.setEnabled(false);



        credito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    cvv.setEnabled(true);
                    fecha.setEnabled(true);}
                else{
                    cvv.getText().clear();
                    fecha.getText().clear();
                    cvv.setEnabled(false);
                    fecha.setEnabled(false);
                }
            }
        });

        comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent comprar = new Intent(Pago.this,Exito.class);
              startActivity(comprar);
            }
        });



    }


}
