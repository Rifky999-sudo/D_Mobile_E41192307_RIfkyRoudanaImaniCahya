package com.rifky.tugas_recyclelistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView rvMahasiswa;
    private MahasiswaAdapter adapterMahasiswa;
    private ArrayList<Mahasiswa> mDataMahasiswa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        adapterMahasiswa = new MahasiswaAdapter(mDataMahasiswa);

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(adapterMahasiswa);

    }

    private void addData(){
        mDataMahasiswa = new ArrayList<>();
        mDataMahasiswa.add(new Mahasiswa("Rifky Roudana Imani Cahya", "E41192307", "082244993544"));
        mDataMahasiswa.add(new Mahasiswa("Alpan", "E41192307", "082244993544"));
        mDataMahasiswa.add(new Mahasiswa("Ricky", "E41192307", "082244993544"));
        mDataMahasiswa.add(new Mahasiswa("Tria", "E41192307", "082244993544"));
    }
}