package com.example.tareamultiplesfragmentos.Clases;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tareamultiplesfragmentos.Fragmentos.FragmentoRojo;
import com.example.tareamultiplesfragmentos.Fragmentos.FragmentoVerde;
import com.example.tareamultiplesfragmentos.R;

public class Fragmento1  extends AppCompatActivity implements FragmentoRojo.OnFragmentInteractionListener, FragmentoVerde.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmento1);
    }

    @Override
    public void onFragmentInteraction(Uri uri){

    }

}
