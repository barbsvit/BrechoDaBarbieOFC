package com.example.ofc_barbie_brecho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }
    public void btncadastrar(View p) {
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }
}