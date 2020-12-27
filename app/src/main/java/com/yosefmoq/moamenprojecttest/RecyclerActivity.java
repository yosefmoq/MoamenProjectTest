package com.yosefmoq.moamenprojecttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.yosefmoq.moamenprojecttest.adapter.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
        private static final int DATASET_COUNT = 50;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_recycler);
                RecyclerView recyclerView =  findViewById(R.id.recyclerView);

                LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(layoutManager);

                List<String> dataSet = new ArrayList<>(DATASET_COUNT);
                for (int i = 0; i < DATASET_COUNT; i++) {
                        dataSet.add(getString(R.string.item_element_text) + i);
                }
                RecyclerAdapter adapter = new RecyclerAdapter(dataSet, getApplicationContext());
                recyclerView.setAdapter(adapter);

        }
}