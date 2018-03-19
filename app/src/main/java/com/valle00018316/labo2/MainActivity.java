package com.valle00018316.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ftextview,stextview;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChangeText(View v){
        String aux;
        ftextview=findViewById(R.id.ftextview);
        stextview=findViewById(R.id.stextview);
        aux=ftextview.getText().toString();
        ftextview.setText(stextview.getText());
        stextview.setText(aux);

    }
}
