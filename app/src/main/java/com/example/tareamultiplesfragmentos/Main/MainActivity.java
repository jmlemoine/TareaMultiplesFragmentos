package com.example.tareamultiplesfragmentos.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tareamultiplesfragmentos.Clases.Fragmento1;
import com.example.tareamultiplesfragmentos.Clases.Fragmento2;
import com.example.tareamultiplesfragmentos.R;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);

    }

    public void Fragmento(View v){

        switch (v.getId()){
            case R.id.btn1:
                Intent int1 = new Intent(this, Fragmento1.class);
                startActivity(int1);
                break;

            case R.id.btn2:
                Intent int2 = new Intent(this, Fragmento2.class);
                startActivity(int2);
                break;
        }


        Intent int1 = new Intent(this, Fragmento1.class);
        startActivity(int1);
        finish();

    }

}
