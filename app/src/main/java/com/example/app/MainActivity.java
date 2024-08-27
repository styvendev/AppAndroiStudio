package com.example.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Mensaje impreso en la consola
        System.out.println("Start App");

        //metodo para mostrar o llamar una vista
        setContentView(R.layout.activity_main);
    }
}