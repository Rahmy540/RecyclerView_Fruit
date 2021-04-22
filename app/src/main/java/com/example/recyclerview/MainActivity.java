package com.example.recyclerview;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Fruit> fruits = new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.iv_fruit);
        recyclerView.setHasFixedSize(true);
        fruits.addAll(FruitDataSource.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListFruitAdapter listFruitAdapter = new ListFruitAdapter(fruits);
        recyclerView.setAdapter(listFruitAdapter);

        listFruitAdapter.setOnItemClickCallback(new ListFruitAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Fruit data) {
                showSelectedFruit(data);
            }
        });
    }
    private void showSelectedFruit(Fruit fruit) {
        Toast.makeText(this, "Kamu memilih " + fruit.getName(), Toast.LENGTH_SHORT).show();
    }
}
