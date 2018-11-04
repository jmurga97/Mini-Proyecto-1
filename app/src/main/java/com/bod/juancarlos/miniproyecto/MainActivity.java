package com.bod.juancarlos.miniproyecto;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button tienda, comprar;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tienda = findViewById(R.id.button2);
        listView = findViewById(R.id.lista);
        comprar = findViewById(R.id.button5);

        final ArrayList<String> productos = getIntent().getStringArrayListExtra("productos");
        final int total = getIntent().getIntExtra("total",0);

        /**
         *Se crea la rutina para recibir la lista de arreglos, donde se verifica que si la misma no es vacia la misma sea
         * visulizada, se active el boton para comprar y se activen los macanismos para borrar los articulos si se desease.
         * */

        if (productos != null) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, productos);
            listView.setAdapter(adapter);
            comprar.setEnabled(true);



                        
            listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int i, long l) {
                    Toast.makeText(getApplicationContext(), "Articulo Borrado", Toast.LENGTH_SHORT).show();

                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                    mBuilder.setMessage("Quieres borrar de la lista?");
                    mBuilder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo, int id) {
                            productos.remove(i);
                            adapter.notifyDataSetChanged();
                            if (adapter.getCount() == 0 ){comprar.setEnabled(false);}
                        }
                    });
                    mBuilder.setNegativeButton("No", null);
                    Dialog dialog = mBuilder.create();
                    dialog.show();
                    return false;
                }
            });
        }

        /**
         *Se crea el boton para ir a la activity de la tienda.
         * Ademas cuando se le de al boton de comprar se envia el total, para realizar el pago en la intefaz
         * respectiva.
         * */

        tienda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, tienda.class);
                startActivity(intent);
            }
        });



            comprar.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Pago.class);
                    intent.putExtra("total", total);
                    startActivity(intent);
                }
            });
        }
    }
