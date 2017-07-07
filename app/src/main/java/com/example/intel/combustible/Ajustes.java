package com.example.intel.combustible;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class Ajustes extends AppCompatActivity {


    //Botones nombres

    private Button CambIdi1;
    private Button CambIdi2;
    private Button PYP;
    private Button CS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);



        //Botones con acciones

        CS = (Button) findViewById(R.id.cerrarsesion);

        CS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });

        PYP = (Button) findViewById(R.id.politicas);

        PYP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               //agregar mensaje
            }
        });


        CambIdi1= (Button) findViewById(R.id.English);
        CambIdi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Locale localizacion = new Locale("en", "EN");
                    Locale.setDefault(localizacion);
                    Configuration config = new Configuration();
                    config.locale = localizacion;
                    getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

                    RestarActivity();

            }
            });

        CambIdi2= (Button) findViewById(R.id.Español);
        CambIdi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Locale localizacion = new Locale("es", "ES");
                Locale.setDefault(localizacion);
                Configuration config = new Configuration();
                config.locale = localizacion;
                getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

                RestarActivity();

            }
        });


    }


    //  funciones ;)
    private void launchActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
     private void RestarActivity(){
         Intent refrescar = new Intent(this, Ajustes.class);
         startActivity(refrescar);
         finish();

     }


    }



