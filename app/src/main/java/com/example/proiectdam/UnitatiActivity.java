package com.example.proiectdam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class UnitatiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unitati);
        GridView gv = (GridView) findViewById(R.id.galerietunitati);
        gv.setAdapter(new com.example.proiectdam.UnitatiAdapter(this));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                if(position == 0) {
                    Toast.makeText(getBaseContext(), "Spitalul Orasenesc Sf. Spiridon Mioveni",
                            Toast.LENGTH_SHORT).show();
                }
                if(position == 1) {
                    Toast.makeText(getBaseContext(), "Spitalul Judetean de Urgenta Pitesti ",
                            Toast.LENGTH_SHORT).show();
                }
                if(position == 2) {
                    Toast.makeText(getBaseContext(), "Spitalul de Pediatrie Pitesti",
                            Toast.LENGTH_SHORT).show();
                }
                if(position == 3) {
                    Toast.makeText(getBaseContext(), "Spitalul Municipal Campulung",
                            Toast.LENGTH_SHORT).show();
                }
                if(position == 4) {
                    Toast.makeText(getBaseContext(), "Spitalul de Pneumoftiziologie Valea Iasului",
                            Toast.LENGTH_SHORT).show();
                }
                if(position == 5) {
                    Toast.makeText(getBaseContext(), "Spitalul de Pneumoftiziologie Campulung",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}