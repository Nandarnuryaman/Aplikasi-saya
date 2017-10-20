package com.dhiyaulhaqza.amikomlatihan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView lvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lvList = (ListView) findViewById(R.id.lv_list);
        List<String> listStr = new ArrayList<>();
        listStr.add("Informatika");
        listStr.add("Sistem Informasi");
        listStr.add("Manajemen Informatika");
        listStr.add("Teknik Komputer");
        listStr.add("Teknik Informasi");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listStr);
        lvList.setAdapter(adapter);
    }
}
