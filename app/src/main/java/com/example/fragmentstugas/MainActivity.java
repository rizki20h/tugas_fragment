package com.example.fragmentstugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    Button btnHome, btnCredit, btnSaran;
    satu fragmentHome;
    dua fragmentCredit;
    tiga fragmentSaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btnHome = findViewById(R.id.btn_home);
    btnCredit = findViewById(R.id.btn_credit);
    btnSaran = findViewById(R.id.btn_saran);

    btnHome.setOnClickListener(this);
    btnCredit.setOnClickListener(this);
    btnSaran.setOnClickListener(this);
    }
    void menuHome(){
        fragmentHome = new satu();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fContainer, fragmentHome);
            ft.commit();
    }
    void menuCredit(){
        fragmentCredit = new dua();
        FragmentTransaction tf = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fContainer, fragmentCredit);
        tf.commit();
    }
    void menuSaran(){
        fragmentSaran = new tiga();
        FragmentTransaction tf = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fContainer, fragmentSaran);
        tf.commit();
    }
    @Override
    public void onClick(View v) {
        if(v == btnHome){
            menuHome();
        }
        if(v == btnCredit){
            menuCredit();
        }
        if( v == btnSaran){
            menuSaran();
        }
    }
}