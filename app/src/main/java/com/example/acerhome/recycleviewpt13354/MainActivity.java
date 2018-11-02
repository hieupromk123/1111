package com.example.acerhome.recycleviewpt13354;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.acerhome.recycleviewpt13354.adapter.SinhVienAdapter;
import com.example.acerhome.recycleviewpt13354.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private SinhVienAdapter adapter;
private List<SinhVien> sinhViens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
        sinhViens = new ArrayList<>();

        for (int i =0;i <40;i++){
            sinhViens.add(new SinhVien("","Nguyen Van" + i));
        }
        adapter = new SinhVienAdapter(sinhViens);
        recyclerView.setAdapter(adapter);

        //kieu bo cuc hien thi (list,gird)
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }
}
