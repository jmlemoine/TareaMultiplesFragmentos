package com.example.tareamultiplesfragmentos.Clases;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.tareamultiplesfragmentos.Fragmentos.FragmentoRojo;
import com.example.tareamultiplesfragmentos.Fragmentos.FragmentoVerde;
import com.example.tareamultiplesfragmentos.R;

public class Fragmento2 extends AppCompatActivity implements FragmentoRojo.OnFragmentInteractionListener, FragmentoVerde.OnFragmentInteractionListener {

    FragmentoRojo fragR;
    FragmentoVerde fragV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmento2);

        fragR = new FragmentoRojo();
        fragV = new FragmentoVerde();

        getSupportFragmentManager().beginTransaction().add(R.id.contFragments, fragR).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri){

    }

    public void onClick(View view){
        FragmentTransaction fragt = getSupportFragmentManager().beginTransaction();
         switch (view.getId()){
             case R.id.btn1:
                 fragt.replace(R.id.contFragments, fragR);
                 break;

             case R.id.btn2:
                 fragt.replace(R.id.contFragments, fragV);
                 break;

         }

         fragt.commit();

    }

}
