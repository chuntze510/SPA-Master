package com.example.massage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class bodylist extends AppCompatActivity {

    List<body> bodyList = new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;
    RecylerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodylist);

        initial();

        recyclerView =(RecyclerView)findViewById(R.id.bodyrecyler);
        adapter = new RecylerViewAdapter(bodyList,getBaseContext());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initial() {
    bodyList.add(new body(R.drawable.c03_1,"腸胃問題"));
    bodyList.add(new body(R.drawable.c03_2,"失眠問題"));
    bodyList.add(new body(R.drawable.c03_3,"失眠問題"));
    bodyList.add(new body(R.drawable.c03_5,"失眠問題"));
    bodyList.add(new body(R.drawable.c03_7,"失眠問題"));
    bodyList.add(new body(R.drawable.c03_8,"失眠問題"));
    bodyList.add(new body(R.drawable.c03_9,"失眠問題"));
    bodyList.add(new body(R.drawable.c03_10,"失眠問題"));
    bodyList.add(new body(R.drawable.c03_14,"失眠問題"));

    }
}
