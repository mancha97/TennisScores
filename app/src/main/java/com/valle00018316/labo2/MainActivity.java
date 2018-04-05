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
    TextView v3;
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
        v3= findViewById(R.id.text4);
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
                    if(contador1==40){
                        String t3= "Deuce";
                        v3.setText(t3);
                    }
                }
                else if(contador==40 && contador1!=40){
                    if(contador==40 && contador1==41){
                        contador1=40;
                        String t = Integer.toString(contador1);
                        String t3= "Deuce";
                        v2.setText(t);
                        v3.setText(t3);
                    }else{
                    String t = "win";
                    String t2="lose";
                    v1.setText(t);
                    v2.setText(t2);}
                }  else if(contador1==40 && contador==40){
                    contador=41;
                    String t="adv";
                    v1.setText(t);
                    String t3= "Matchpoint";
                    v3.setText(t3);
                }
                else if (contador==41 && contador1==40){
                    String t = "win";
                    String t2="lose";
                    v1.setText(t);
                    v2.setText(t2);
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
                    if(contador==40){
                        String t3= "Deuce";
                        v3.setText(t3);
                    }
                }
                else if(contador1==40 && contador!=40){
                    if(contador1==40 && contador==41){
                        contador=40;
                        String t = Integer.toString(contador);
                        v1.setText(t);
                        String t3= "Deuce";
                        v3.setText(t3);
                    }else{
                    String t = "win";
                    String t2="lose";
                    v2.setText(t);
                    v1.setText(t2);}
                }
                else if(contador1==40 && contador==40){
                    contador1=41;
                    String t="adv";
                    v2.setText(t);
                    String t3= "Matchpoint";
                    v3.setText(t3);
                }
                else if (contador1==41 && contador==40){
                    String t = "win";
                    String t2="lose";
                    v2.setText(t);
                    v1.setText(t2);
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