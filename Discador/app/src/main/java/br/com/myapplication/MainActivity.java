package br.com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Botão de limpar
    public void limparNumero(View v){
        Intent it = new Intent();
    }

    //Discar
    public void ligacao(View v){
        Uri uri = Uri.parse("tel:83988599834");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    //Digitar Numeros
    public void adicionarNumero(View v){

        //Salvar numero na caixa de texto
        EditText edtNumeroTelefone = findViewById(R.id.edtNumeroTelefone);

        switch (v.getId()){
            case R.id.btnUm:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"1");
                break;
            case R.id.btnDois:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"2");
                break;
            case R.id.btnTres:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"3");
                break;
            case R.id.btnQuatro:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"4");
                break;
            case R.id.btnCinco:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"5");
                break;
            case R.id.btnSeis:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"6");
                break;
            case R.id.btnSete:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"7");
                break;
            case R.id.btnOuito:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"8");
                break;
            case R.id.btnNove:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"9");
                break;
            case R.id.btnZero:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"0");
                break;
            case R.id.btnJogoDaVelha:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"#");
                break;
            case R.id.btnAsterisco:
                edtNumeroTelefone.setText(edtNumeroTelefone.getText().toString() +"*");
                break;
        }
    }

}