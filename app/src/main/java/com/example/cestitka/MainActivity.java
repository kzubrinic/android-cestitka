package com.example.cestitka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pozdrav(View v){
        Toast.makeText(getApplicationContext(), "Sretan ti rođendan!", Toast.LENGTH_SHORT).show();

    }
}
