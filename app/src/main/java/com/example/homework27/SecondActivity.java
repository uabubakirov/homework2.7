package com.example.homework27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    Button btnSave;
    EditText etTitle,etDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnSave = findViewById(R.id.btn_save);
        etTitle = findViewById(R.id.et_title);
        etDescription = findViewById(R.id.et_description);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = etTitle.getText().toString();
                String description = etDescription.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("title",title);
                intent.putExtra("description",description);
                setResult(RESULT_OK,intent);
                finish();


            }
        });
    }
}