package com.example.spotbiggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.userNameHolder);

    }
    public void goToHomePage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("userName",et.getText().toString());
        startActivity(intent);
    }


}
