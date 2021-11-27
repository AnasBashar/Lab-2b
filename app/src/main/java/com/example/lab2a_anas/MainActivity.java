package com.example.lab2a_anas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        String[] values = new String[] {
             "MALAYSIA",
             "UITM DIHATIKU",
                "ICT602",
                "SEMESTER 3",
                "KITA BELUM MENANG",
                "PATUHI SOP",
                "PAKAI MASK",
                "ODL 4.0",
                "JGN PUTUS ASA"


        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,android.R.id.text1, values);
        listView.setAdapter(adapter);
    }
}