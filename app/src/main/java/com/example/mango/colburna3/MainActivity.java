package com.example.mango.colburna3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mesaCollegeButton, googleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtonIDs();
        initButtonListeners();
    }

    public void initButtonIDs(){
        mesaCollegeButton = (Button) findViewById(R.id.buttonGoMesaCollege);
        googleButton = (Button) findViewById(R.id.buttonGoGoogle);
    }

    public void initButtonListeners(){

        mesaCollegeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thisIntent = new Intent(MainActivity.this, WebpageViewerActivity.class);
                thisIntent.putExtra("url", "https://www.sdmesa.edu");
                startActivity(thisIntent);
            }
        });

        googleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent thisIntent = new Intent (MainActivity.this, WebpageViewerActivity.class);
                thisIntent.putExtra("url", "https://www.google.com");
                startActivity(thisIntent);
            }
        });

    }
}
