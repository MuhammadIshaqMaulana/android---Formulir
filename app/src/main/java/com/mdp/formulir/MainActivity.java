package com.mdp.formulir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_daftar=findViewById(R.id.btn_daftar);
        btn_daftar.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                //tampilkan toast"Anda Berhasil"
                Toast.makeText(MainActivity.this,"Anda Berhasil Terdaftar",Toast.LENGTH_LONG).show();
            }
        }));
    }
}