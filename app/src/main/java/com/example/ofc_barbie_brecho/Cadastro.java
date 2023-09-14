package com.example.ofc_barbie_brecho;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Cadastro extends AppCompatActivity {
    public static final String NOME_CADASTRO = "com.example.ofc_barbie_brecho";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    public void btnsobrenos(View s) {
        Intent intent = new Intent(this, QuemSomosNos.class);
        startActivity(intent);
    }
    public void btndoar(View d) {
        Intent intent = new Intent(this, Doar.class);
        startActivity(intent);
    }
    public void btnperfil(View p) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void txtEntrarLogin(View p) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void btncadastrar(View p) {
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }
}