package com.example.app;

// Importar paquetes
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Mensaje impreso en la consola
        System.out.println("Start App");

        //metodo para mostrar o llamar una vista
        setContentView(R.layout.activity_main);

        ImageView container = findViewById(R.id.imgLogo);
        Animation animacion = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        View vista = findViewById(R.id.imgLogo);
        vista.startAnimation(animacion);
    }
}