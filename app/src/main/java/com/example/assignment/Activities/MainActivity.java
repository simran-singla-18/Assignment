package com.example.assignment.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.assignment.R;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button)findViewById(R.id.btnlogin);
        username=(EditText)findViewById(R.id.editname);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getuser(view);
            }
        });
    }
    public void getuser(View view)
    {
        Intent intent=new Intent(MainActivity.this, UserActivity.class);
        intent.putExtra("name",username.getText().toString());
        startActivity(intent);
    }


}