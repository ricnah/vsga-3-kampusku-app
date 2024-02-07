package com.example.kampusku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDataMahasiswa;
    Button btnInputData;
    Button btnInformsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDataMahasiswa = (Button) findViewById(R.id.btnLihat);
        btnDataMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toData = new Intent(MainActivity.this, DataMahasiswa.class);
                startActivity(toData);
            }
        });

        btnInputData = (Button) findViewById(R.id.btnInput);
        btnInputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toInput = new Intent(MainActivity.this, InputData.class);
                startActivity(toInput);
            }
        });

        btnInformsi = (Button) findViewById(R.id.btnInfo);
        btnInformsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toInfo = new Intent(MainActivity.this, Informasi.class);
                startActivity(toInfo);
            }
        });
    }
}