package com.zainabali.yz.cardviewwithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
Adapter adapter;
ArrayList<String>countryName=new ArrayList<>();
    ArrayList<String>details=new ArrayList<>();
    ArrayList<Integer>image=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        countryName.add("Qatar");
        countryName.add("Turkish");
        countryName.add("Iraq");

        details.add("This is the qatar flag");
        details.add("This is the turkish flag");
        details.add("This is the iraq flag");

        image.add(R.drawable.qatar);
        image.add(R.drawable.turkish);
        image.add(R.drawable.iraq);

        adapter=new Adapter(countryName,details,image,MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}