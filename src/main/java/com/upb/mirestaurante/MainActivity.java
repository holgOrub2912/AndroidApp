package com.upb.mirestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirMenu (View v){
        Intent i; //intent : forma en la que se comunican las clases
        i= new Intent(this, MenuActivity.class); //(actividad actual , a donde quiere ir)
        startActivity(i); //lanzar la actividad
    }

    public void abrirSede (View v){
        Intent i; //intent : forma en la que se comunican las clases
        i= new Intent(this, MapsActivity.class); //(actividad actual , a donde quiere ir)
        startActivity(i); //lanzar la actividad
    }

    public void abrirReserva (View v){
        Intent i; //intent : forma en la que se comunican las clases
        i= new Intent(this, ReservaActivity.class); //(actividad actual , a donde quiere ir)
        startActivity(i); //lanzar la actividad
    }
    public void abrirPedido (View v){
        Intent i; //intent : forma en la que se comunican las clases
        i= new Intent(this, PedidoActivity.class); //(actividad actual , a donde quiere ir)
        startActivity(i); //lanzar la actividad
    }

}