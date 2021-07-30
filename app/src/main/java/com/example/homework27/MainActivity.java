package com.example.homework27;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    RecyclerAdapter adapter;
    RecyclerView rvTask;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btn_add);
        rvTask = findViewById(R.id.rv_recycle);
        adapter = new RecyclerAdapter(this);
        rvTask.setAdapter(adapter);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,100);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 100&&resultCode == RESULT_OK){
            String title = data.getStringExtra("title");
            String description = data.getStringExtra("description");
            TaskModel model = new TaskModel(title,description);
            adapter.addTask(model);

        }
    }
}