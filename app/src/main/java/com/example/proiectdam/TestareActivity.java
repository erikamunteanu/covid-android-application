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

public class TestareActivity extends AppCompatActivity {
    TestareDatabaseHelper myDb;
    Button submit, results;
    EditText insert_nume, insert_cnp, insert_tel, insert_unit, cnp_res;
    String nume, cnp, tel, unit, cnpres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testare);
        GridView gv = (GridView) findViewById(R.id.galerietestare);
        gv.setAdapter(new com.example.proiectdam.TestareAdapter(this));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                Intent i = new Intent(getApplicationContext(),
                        com.example.proiectdam.TestareFullImageActivity.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });

        submit = (Button) findViewById(R.id.submit);
        insert_nume = (EditText) findViewById(R.id.insert_nume);
        insert_cnp = (EditText) findViewById(R.id.insert_cnp);
        insert_tel = (EditText) findViewById(R.id.insert_tel);
        insert_unit = (EditText) findViewById(R.id.insert_unit);
        myDb = new TestareDatabaseHelper(this);
        addData();
        results = (Button) findViewById(R.id.results);
        cnp_res = (EditText) findViewById(R.id.cnp);
        getResults();
    }
    public void addData() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nume = insert_nume.getText().toString().trim();
                cnp = insert_cnp.getText().toString().trim();
                tel = insert_tel.getText().toString().trim();
                unit = insert_unit.getText().toString().trim();
                if(nume.equals("") || cnp.equals("") || tel.equals("") || unit.equals(""))
                    Toast.makeText(getBaseContext(), "Datele introduse sunt incomplete!",
                            Toast.LENGTH_SHORT).show();
                else if (myDb.insertData(nume, cnp, tel, unit))
                    Toast.makeText(getBaseContext(), "Programarea a fost efectuata cu succes!",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getResults() {
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnpres = cnp_res.getText().toString();
                if(cnpres.equals(""))
                    Toast.makeText(getBaseContext(), "Datele introduse sunt incomplete!",
                        Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getBaseContext(), "Rezultatele testului pentru CNP-ul introdus nu au fost procesate inca!",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }
}