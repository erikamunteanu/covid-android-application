package com.example.proiectdam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IntrebariActivity extends AppCompatActivity {
    Button raspA,raspB;
    TextView tvScor,tvIntrebare;
    private Intrebari vectIntrebari = new Intrebari();
    private String rasp;
    private int scor = 0;
    private int nrIntrebari = vectIntrebari.vectIntreb.length;
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrebari);
        raspA=findViewById(R.id.btnRaspA);
        raspB=findViewById(R.id.btnRaspB);
        tvIntrebare=findViewById(R.id.tvIntrebare);
        index=0;
        actIntrebare(index);
        raspA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(raspA.getText()==rasp){
                    scor++;
                    if(index < nrIntrebari) {
                        index++;
                        if(index == nrIntrebari) {
                            index--;
                            if(scor > 3)
                                Toast.makeText(getBaseContext(), "Va recomandam sa va programati pentru un test COVID-19!",
                                    Toast.LENGTH_SHORT).show();
                            else
                                Toast.makeText(getBaseContext(), "Momentan nu este necesar sa va programati pentru un test COVID-19!",
                                        Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }
                        actIntrebare(index);
                    }
                }
                else {
                    if(index < nrIntrebari) {
                        index++;
                        if(index == nrIntrebari) {
                            index--;
                            if(scor > 3)
                                Toast.makeText(getBaseContext(), "Va recomandam sa va programati pentru un test COVID-19!",
                                        Toast.LENGTH_SHORT).show();
                            else
                                Toast.makeText(getBaseContext(), "Momentan nu este necesar sa va programati pentru un test COVID-19!",
                                        Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }
                        actIntrebare(index);
                    }
                }
            }
        });
        raspB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(raspB.getText()==rasp){
                    scor++;
                    tvScor.setText("Scor: "+scor);
                    if(index < nrIntrebari) {
                        index++;
                        if(index == nrIntrebari) {
                            index--;
                            Toast.makeText(getBaseContext(), "Felicitari! Ati obtinut scorul: " + scor + " / 10",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }
                        actIntrebare(index);
                    }
                }
                else {
                    if(index < nrIntrebari) {
                        index++;
                        if(index == nrIntrebari) {
                            index--;
                            Toast.makeText(getBaseContext(), "Felicitari! Ati obtinut scorul: " + scor + " / 10",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }
                        actIntrebare(index);
                    }
                }
            }
        });
    }
    private void actIntrebare(int i){
        tvIntrebare.setText(vectIntrebari.getIntrebare(i));
        raspA.setText(vectIntrebari.getRaspA(0));
        raspB.setText(vectIntrebari.getRaspB(0));
        rasp=vectIntrebari.getRaspCorect(0);
    }
}
