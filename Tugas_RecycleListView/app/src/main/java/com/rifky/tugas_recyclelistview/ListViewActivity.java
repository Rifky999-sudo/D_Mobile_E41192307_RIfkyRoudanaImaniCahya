package com.rifky.tugas_recyclelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView ListViewCountry;
    private ArrayAdapter<CharSequence> adapter;
    private ListView listViewCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListViewCountry = findViewById(R.id.list_view);
        adapter = ArrayAdapter.createFromResource(this, R.array.Country_list, android.R.layout.simple_list_item_1);
        ListViewCountry.setAdapter(adapter);
        ListViewCountry.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show();
    }
}