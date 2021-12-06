package com.example.proiectdam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class InformatiiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informatii);
        ArrayList masuriList = getInformatiiListData();
        final ListView lv = (ListView) findViewById(R.id.informatii_list);
        lv.setAdapter(new InformatiiCustomListAdapter(this,
                masuriList));
        ImageView image = (ImageView) findViewById(R.id.statistici2);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://datelazi.ro/"));
                startActivity(intent);
            }
        });

    }
    private ArrayList getInformatiiListData() {
        ArrayList<com.example.proiectdam.InformatiiListItem> results = new
                ArrayList<>();
        com.example.proiectdam.InformatiiListItem masura1 = new
                com.example.proiectdam.InformatiiListItem();
        masura1.setText("➤ Purtati masca!");
        results.add(masura1);
        com.example.proiectdam.InformatiiListItem masura2 = new
                com.example.proiectdam.InformatiiListItem();
        masura2.setText("➤ Spalati-va mainile în mod regulat sau utilizati o solutie hidroalcoolica!");
        results.add(masura2);
        com.example.proiectdam.InformatiiListItem masura3 = new
                com.example.proiectdam.InformatiiListItem();
        masura3.setText("➤ Mentineti o distanta de cel putin un metru fata de altii!");
        results.add(masura3);
        com.example.proiectdam.InformatiiListItem masura4 = new
                com.example.proiectdam.InformatiiListItem();
        masura4.setText("➤ Curatati si suprafetele cu dezinfectanti pe baza de alcool sau clor!");
        results.add(masura4);
        return results;
    }
}