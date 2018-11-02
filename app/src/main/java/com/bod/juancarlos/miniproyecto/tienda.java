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

import java.util.ArrayList;
import java.util.List;


public class tienda extends AppCompatActivity implements View.OnClickListener {
EditText cant1,cant2,cant3,cant4,cant5,cant6,cant7,cant8,cant9,cant10,cant11,cant12,cant13,cant14,cant15,cant16,cant17,cant18,cant19,cant20;
CheckBox chk1,chk2,chk3,chk4,chk5,chk6,chk7,chk8,chk9,chk10,chk11,chk12,chk13,chk14,chk15,chk16,chk17,chk18,chk19,chk20;
Button comprar;
int num, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18, num19, num20;

int total = 0;
int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);

        cant1 = findViewById(R.id.cant1);
        cant2 = findViewById(R.id.cant2);
        cant3 = findViewById(R.id.cant3);
        cant4 = findViewById(R.id.cant4);
        cant5 = findViewById(R.id.cant5);
        cant6 = findViewById(R.id.cant6);
        cant7 = findViewById(R.id.cant7);
        cant8 = findViewById(R.id.cant8);
        cant9 = findViewById(R.id.cant9);
        cant10 = findViewById(R.id.cant10);
        cant11 = findViewById(R.id.cant11);
        cant12 = findViewById(R.id.cant12);
        cant13 = findViewById(R.id.cant13);
        cant14 = findViewById(R.id.cant14);
        cant15 = findViewById(R.id.cant15);
        cant16 = findViewById(R.id.cant16);
        cant17 = findViewById(R.id.cant17);
        cant18 = findViewById(R.id.cant18);
        cant19 = findViewById(R.id.cant19);
        cant20 = findViewById(R.id.cant20);

        chk1= findViewById(R.id.chk1);
        chk2= findViewById(R.id.chk2);
        chk3 = findViewById(R.id.chk3);
        chk4= findViewById(R.id.chk4);
        chk5= findViewById(R.id.chk5);
        chk6= findViewById(R.id.chk6);
        chk7= findViewById(R.id.chk7);
        chk8= findViewById(R.id.chk8);
        chk9= findViewById(R.id.chk9);
        chk10= findViewById(R.id.chk10);
        chk11= findViewById(R.id.chk11);
        chk12= findViewById(R.id.chk12);
        chk13= findViewById(R.id.chk13);
        chk14= findViewById(R.id.chk14);
        chk15= findViewById(R.id.chk15);
        chk16= findViewById(R.id.chk16);
        chk17= findViewById(R.id.chk17);
        chk18= findViewById(R.id.chk18);
        chk19= findViewById(R.id.chk19);
        chk20= findViewById(R.id.chk20);

        comprar = findViewById(R.id.comprar);


        chk1.setOnClickListener(this);
        chk2.setOnClickListener(this);
        chk3.setOnClickListener(this);
        chk4.setOnClickListener(this);
        chk5.setOnClickListener(this);
        chk6.setOnClickListener(this);
        chk7.setOnClickListener(this);
        chk8.setOnClickListener(this);
        chk9.setOnClickListener(this);
        chk10.setOnClickListener(this);
        chk11.setOnClickListener(this);
        chk12.setOnClickListener(this);
        chk13.setOnClickListener(this);
        chk14.setOnClickListener(this);
        chk15.setOnClickListener(this);
        chk16.setOnClickListener(this);
        chk17.setOnClickListener(this);
        chk18.setOnClickListener(this);
        chk19.setOnClickListener(this);
        chk20.setOnClickListener(this);

        }


    @Override
    public void onClick(View view) {
        if (chk1.isChecked()==true){
            cant1.setEnabled(true);

           } else {
            cant1.setText("");
            cant1.setHint("0");
            cant1.setEnabled(false);

        }
        if (chk2.isChecked()==true){
            cant2.setEnabled(true);

           } else {
            cant2.setText("");
            cant2.setHint("0");
            cant2.setEnabled(false);

        }
        if (chk3.isChecked()==true){
            cant3.setEnabled(true);

             } else {
            cant3.setText("");
            cant3.setHint("0");
            cant3.setEnabled(false);

        }
        if (chk4.isChecked()==true){
            cant4.setEnabled(true);

            } else {
            cant4.setText("");
            cant4.setHint("0");
            cant4.setEnabled(false);

        }
        if (chk5.isChecked()==true){
            cant5.setEnabled(true);

            } else {
            cant5.setText("");
            cant5.setHint("0");
            cant5.setEnabled(false);

        }

        if (chk6.isChecked()==true){
                cant6.setEnabled(true);

            } else {
            cant6.setText("");
            cant6.setHint("0");
            cant6.setEnabled(false);
        }

        if (chk7.isChecked()==true){
                cant7.setEnabled(true);

            } else {
            cant7.setText("");
            cant7.setHint("0");
            cant7.setEnabled(false);
        }

        if (chk8.isChecked()==true){
                cant8.setEnabled(true);

            } else {
            cant8.setText("");
            cant8.setHint("0");
            cant8.setEnabled(false);
        }

        if (chk9.isChecked()==true){
                cant9.setEnabled(true);

            } else {
            cant9.setText("");
            cant9.setHint("0");
            cant9.setEnabled(false);
        }

        if (chk10.isChecked() == true) {
                cant10.setEnabled(true);

            } else {
                cant10.setText("");
                cant10.setHint("0");
                cant10.setEnabled(false);


        }


        if (chk11.isChecked()==true){
            cant11.setEnabled(true);

        } else {
            cant11.setText("");
            cant11.setHint("0");
            cant11.setEnabled(false);

        }

        if (chk12.isChecked()==true){
            cant12.setEnabled(true);

        } else {
            cant12.setText("");
            cant12.setHint("0");
            cant12.setEnabled(false);

        }
        if (chk13.isChecked()==true){
            cant13.setEnabled(true);

        } else {
            cant13.setText("");
            cant13.setHint("0");
            cant13.setEnabled(false);

        }
        if (chk14.isChecked()==true){
            cant14.setEnabled(true);

        } else {
            cant14.setText("");
            cant14.setHint("0");
            cant14.setEnabled(false);

        }
        if (chk15.isChecked()==true){
            cant15.setEnabled(true);

        } else {
            cant15.setText("");
            cant15.setHint("0");
            cant15.setEnabled(false);

        }
        if (chk16.isChecked()==true){
            cant16.setEnabled(true);

        } else {
            cant16.setText("");
            cant16.setHint("0");
            cant16.setEnabled(false);

        }
        if (chk17.isChecked()==true){
            cant17.setEnabled(true);

        } else {
            cant17.setText("");
            cant17.setHint("0");
            cant17.setEnabled(false);

        }
        if (chk18.isChecked()==true){
            cant18.setEnabled(true);

        } else {
            cant18.setText("");
            cant18.setHint("0");
            cant18.setEnabled(false);

        }
        if (chk19.isChecked()==true){
            cant19.setEnabled(true);

        } else {
            cant19.setText("");
            cant19.setHint("0");
            cant19.setEnabled(false);

        }
        if (chk20.isChecked()==true){
            cant20.setEnabled(true);

        } else {
            cant20.setText("");
            cant20.setHint("0");
            cant20.setEnabled(false);

        }





        comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verificar();
                if (cont <=10){
                    Toast.makeText(getApplicationContext(),"Excelente",Toast.LENGTH_SHORT).show();
                    llenar();
                } else { Toast.makeText(getApplicationContext(),"Maximo 10 Articulos",Toast.LENGTH_SHORT).show(); cont=0; }
            }
        });
    }


    public void verificar(){

        if(chk1.isChecked()==true) {
            cont++;
        }
        if(chk2.isChecked()==true) {
            cont++;
        }
        if(chk3.isChecked()==true) {
            cont++;
        }
        if(chk4.isChecked()==true) {
            cont++;
        }
        if(chk5.isChecked()==true) {
            cont++;
        }
        if(chk6.isChecked()==true) {
            cont++;
                }
        if(chk7.isChecked()==true) {
            cont++;
        }
        if(chk8.isChecked()==true) {
            cont++;
        }
        if(chk9.isChecked()==true) {
            cont++;
        }
        if(chk10.isChecked()==true) {
            cont++;
        }
        if(chk11.isChecked()==true) {
            cont++;
        }
        if(chk12.isChecked()==true) {
            cont++;
        }
        if(chk13.isChecked()==true) {
            cont++;
        }
        if(chk14.isChecked()==true) {
            cont++;
        }
        if(chk15.isChecked()==true) {
            cont++;
        }
        if(chk16.isChecked()==true) {
            cont++;
        }
        if(chk17.isChecked()==true) {
            cont++;
        }
        if(chk18.isChecked()==true) {
            cont++;
        }
        if(chk19.isChecked()==true) {
            cont++;
        }
        if(chk20.isChecked()==true) {
            cont++;
        }



    }
    public void llenar(){
        ArrayList<String> productos = new ArrayList<>();

        if(cant1.isEnabled()==true  && !cant1.getText().toString().equals("0") && !cant1.getText().toString().equals("")) {
            num= Integer.parseInt(cant1.getText().toString());
            num1 = 10*num;
            total = total + num1;
            productos.add("Caramelo de Chocolate       Cantidad:" +cant1.getText().toString() + "      Precio Subtotal: " + num1 + " Bs.S");

        }
        if(cant2.isEnabled()==true && !cant2.getText().toString().equals("0") && !cant2.getText().toString().equals("")) {
            num= Integer.parseInt(cant2.getText().toString());
            num2 = 10*num;
            total = total + num2;
            productos.add("Caramelo de Fresa           Cantidad:" +cant2.getText().toString() + "      Precio Subtotal: " + num2 + " Bs.S");

        }
        if(cant3.isEnabled()== true && !cant3.getText().toString().equals("0") && !cant3.getText().toString().equals("")) {
            num= Integer.parseInt(cant3.getText().toString());
            num3 = 15*num;
            total = total + num3;
            productos.add("Caramelo de Manzana        Cantidad:" +cant3.getText().toString() + "      Precio Subtotal: " + num3 + " Bs.S");

        }
        if(cant4.isEnabled()==true && !cant4.getText().toString().equals("0") && !cant4.getText().toString().equals("")) {
            num= Integer.parseInt(cant4.getText().toString());
            num4 = 20*num;
            total = total + num4;
            productos.add("Baston de Caramelo         Cantidad:" +cant4.getText().toString() + "      Precio Subtotal: " + num4 + " Bs.S");

        }
        if(cant5.isEnabled()==true && !cant5.getText().toString().equals("0") && !cant5.getText().toString().equals("")) {
            num= Integer.parseInt(cant5.getText().toString());
            num5 = 15*num;
            total = total + num5;
            productos.add("Bolas de Nieve                Cantidad:" +cant5.getText().toString() + "      Precio Subtotal: " + num5 + " Bs.S");

        }
        if(cant6.isEnabled()==true && !cant6.getText().toString().equals("0") && !cant6.getText().toString().equals("")) {
            num= Integer.parseInt(cant6.getText().toString());
            num6 = 10*num;
            total = total + num6;
            productos.add("Caramelo de Cafe              Cantidad:" +cant6.getText().toString() + "      Precio Subtotal: " + num6 + " Bs.S");

        }
        if(cant7.isEnabled()==true && !cant7.getText().toString().equals("0") && !cant7.getText().toString().equals("")) {
            num= Integer.parseInt(cant7.getText().toString());
            num7 = 15*num;
            total = total + num7;
            productos.add("Caramelo de Frambuesa      Cantidad:" +cant7.getText().toString() + "      Precio Subtotal: " + num7 + " Bs.S");

        }
        if(cant8.isEnabled()==true && !cant8.getText().toString().equals("0") && !cant8.getText().toString().equals("")) {
            num= Integer.parseInt(cant8.getText().toString());
            num8 = 10*num;
            total = total + num8;
            productos.add("Caramelo de Miel              Cantidad:" +cant8.getText().toString() + "      Precio Subtotal: " + num8 + " Bs.S");

        }
        if(cant9.isEnabled()==true && !cant9.getText().toString().equals("0") && !cant9.getText().toString().equals("")) {
            num= Integer.parseInt(cant9.getText().toString());
            num9 = 15*num;
            total = total + num9;
            productos.add("Caramelo de Eucalipto      Cantidad:" +cant9.getText().toString() + "      Precio Subtotal: " + num9 + " Bs.S");

        }
        if(cant10.isEnabled()==true && !cant10.getText().toString().equals("0") && !cant10.getText().toString().equals("")) {
            num= Integer.parseInt(cant10.getText().toString());
            num10 = 15*num;
            total = total + num10;
            productos.add("Caramelo de Menta          Cantidad:" +cant10.getText().toString() + "      Precio Subtotal: " + num10 + " Bs.S");

        }
        if(cant11.isEnabled()==true  && !cant11.getText().toString().equals("0") && !cant11.getText().toString().equals("")) {
            num= Integer.parseInt(cant11.getText().toString());
            num11 = 15*num;
            total = total + num11;
            productos.add("Caramelo de Soda              Cantidad:" +cant11.getText().toString() + "           Precio Subtotal: " + num11 + " Bs.S");

        }
        if(cant12.isEnabled()==true  && !cant12.getText().toString().equals("0") && !cant12.getText().toString().equals("")) {
            num= Integer.parseInt(cant12.getText().toString());
            num12 = 15*num;
            total = total + num12;
            productos.add("Caramelo de Cafe Crema     Cantidad:" +cant12.getText().toString() + "           Precio Subtotal: " + num12 + " Bs.S");

        }
        if(cant13.isEnabled()==true  && !cant13.getText().toString().equals("0") && !cant13.getText().toString().equals("")) {
            num= Integer.parseInt(cant13.getText().toString());
            num13 = 15*num;
            total = total + num13;
            productos.add("Caramelo de Dulce de Leche    Cantidad:" +cant13.getText().toString() + "           Precio Subtotal: " + num13 + " Bs.S");

        }
        if(cant14.isEnabled()==true  && !cant14.getText().toString().equals("0") && !cant14.getText().toString().equals("")) {
            num= Integer.parseInt(cant14.getText().toString());
            num14 = 20*num;
            total = total + num14;
            productos.add("Caramelo de Miel y Limon      Cantidad:" +cant14.getText().toString() + "           Precio Subtotal: " + num14 + " Bs.S");

        }
        if(cant15.isEnabled()==true  && !cant15.getText().toString().equals("0") && !cant15.getText().toString().equals("")) {
            num= Integer.parseInt(cant15.getText().toString());
            num15 = 15*num;
            total = total + num15;
            productos.add("Caramelo de Mentol           Cantidad:" +cant15.getText().toString() + "           Precio Subtotal: " + num15 + " Bs.S");

        }
        if(cant16.isEnabled()==true  && !cant16.getText().toString().equals("0") && !cant16.getText().toString().equals("")) {
            num= Integer.parseInt(cant16.getText().toString());
            num16 = 20*num;
            total = total + num16;
            productos.add("Caramelo de Miel y Mentol    Cantidad:" +cant16.getText().toString() + "           Precio Subtotal: " + num16 + " Bs.S");

        }
        if(cant17.isEnabled()==true  && !cant17.getText().toString().equals("0") && !cant17.getText().toString().equals("")) {
            num= Integer.parseInt(cant17.getText().toString());
            num17 = 10*num;
            total = total + num17;
            productos.add("Caramelo de Regaliz        Cantidad:" +cant17.getText().toString() + "           Precio Subtotal: " + num17 + " Bs.S");

        }
        if(cant18.isEnabled()==true  && !cant18.getText().toString().equals("0") && !cant18.getText().toString().equals("")) {
            num= Integer.parseInt(cant18.getText().toString());
            num18 = 25*num;
            total = total + num18;
            productos.add("Chupeta de Frutas          Cantidad:" +cant18.getText().toString() + "           Precio Subtotal: " + num18 + " Bs.S");

        }
        if(cant19.isEnabled()==true  && !cant19.getText().toString().equals("0") && !cant19.getText().toString().equals("")) {
            num= Integer.parseInt(cant19.getText().toString());
            num19 = 15*num;
            total = total + num19;
            productos.add("Caramelo de Frutas         Cantidad:" +cant19.getText().toString() + "           Precio Subtotal: " + num19 + " Bs.S");

        }
        if(cant20.isEnabled()==true  && !cant20.getText().toString().equals("0") && !cant20.getText().toString().equals("")) {
            num= Integer.parseInt(cant20.getText().toString());
            num20 = 25*num;
            total = total + num20;
            productos.add("Chupeta de Fresa           Cantidad:" +cant20.getText().toString() + "           Precio Subtotal: " + num20 + " Bs.S");

        }




        Intent i = new Intent(tienda.this,MainActivity.class);
        i.putExtra("productos",productos);

        startActivity(i);

        /*
        Intent miintent = new Intent(tienda.this,Pago.class);
        miintent.putExtra("total",total);

        startActivity(miintent);
        */

    }
}
