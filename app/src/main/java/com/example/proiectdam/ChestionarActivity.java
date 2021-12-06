package com.example.proiectdam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChestionarActivity extends AppCompatActivity {
    Button login;
    EditText user, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestionar);
        login = (Button) findViewById(R.id.button);
        user = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().equals("chestionar")) {
                    Intent intent = new Intent(getApplicationContext(), IntrebariActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(getBaseContext(), "Login Failed!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
