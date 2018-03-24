package com.valle00018316.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView v1;
    TextView v2;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;

    int contador1;
    int contador;
    int aux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = findViewById(R.id.text1);
        v2= findViewById(R.id.text3);
        button = findViewById(R.id.b1);
        button2 = findViewById(R.id.b2);
        button7 = findViewById(R.id.b7);

        contador=0;
        contador1=0;
        aux=0;


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contador==0){
                    contador=contador +15;
                    String t = Integer.toString(contador);
                    v1.setText(t);
                }else if(contador==15){
                    contador=contador +15;
                    String t = Integer.toString(contador);
                    v1.setText(t);
                }
                else if(contador==30){
                    contador=contador +10;
                    String t = Integer.toString(contador);
                    v1.setText(t);
                }
                else if(contador==40 && contador1!=40){

                    String t = "win";
                    v1.setText(t);
                }
               else if(contador1==40 && contador==40){
                    contador=contador +1;
                    String t = "advance";
                    v1.setText(t);
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contador1==0){
                    contador1=contador1 +15;
                    String t = Integer.toString(contador1);
                    v2.setText(t);
                }else if (contador1==15){
                    contador1=contador1 +15;
                    String t = Integer.toString(contador1);
                    v2.setText(t);
                }
                else if(contador1==30){
                    contador1=contador1 +10;
                    String t = Integer.toString(contador1);
                    v2.setText(t);
                }
                else if(contador1==40 && contador!=40){
                    String t = "win";
                    v2.setText(t);
                }
              else if(contador1==40 && contador==40){
                    contador1=contador1 +1;
                    String t = "matchpoint";
                    v2.setText(t);
                }else if(v2.getText()=="matchpoint"){
                    String t = "advance";
                    v2.setText(t);
                }
                else if(v2.getText()=="advance"){
                    String t = "win";
                    v2.setText(t);
                }








            }
        });



        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1=0;
                contador=0;
                String t = Integer.toString(contador1);
                v2.setText(t);
                String t2 = Integer.toString(contador);
                v1.setText(t2);
            }
        });
    }

}