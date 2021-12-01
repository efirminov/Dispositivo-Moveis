package br.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    //Abrir outra tela
    public void abrirMain2(View v){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }

    public void abrirMain3(View v){
        Intent it = new Intent(this, Main3Activity.class);
        startActivity(it);
    }

    public void abrirMain4(View v){
        Intent it = new Intent(this, Main4Activity.class);
        startActivity(it);
    }
}
