package com.example.spotbiggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    private TextView tv;
    private String name;
    int count = 0 , num1=0, num2=0,  num3=0, num4=0 , biggest=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        name = intent.getStringExtra("userName");
        tv = findViewById(R.id.Name);
        tv.setText(name);
    }

    public void randomNum() {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Random rand = new Random();
        list.add(new Integer(rand.nextInt(10)+1));
        list.add(new Integer(list.get(0)*3));
        list.add(new Integer(list.get(0)*7));
        list.add(new Integer(list.get(0)*9));

        Collections.shuffle(list);
        num1 = list.get(0);
        num2 = list.get(1);
        num3 = list.get(2);
        num4 = list.get(3);
        String numSt = String.valueOf(num1);
        textView = (findViewById(R.id.randomNum1));
        textView.setText(numSt+"" );
        String numSt2 = String.valueOf(num2);
        textView =(findViewById(R.id.randomNum2));
        textView.setText(numSt2+"" );
        String numSt3 = String.valueOf(num3);
        textView =(findViewById(R.id.randomNum3));
        textView.setText(numSt3+"" );
        String numSt4 = String.valueOf(num4);
        textView = (findViewById(R.id.randomNum4));
        textView.setText(numSt4+"" );
    }
    private void biggestNum(){
        if(num1>num2 && num1>num3 &&num1>num4){
            biggest=num1;
        }
        else if(num2>num1 && num2>num3 &&num2>num4){
            biggest=num2;
        }
        else if(num3>num1 && num3>num2 &&num3>num4){
            biggest=num3;
        }
        else{
            biggest=num4;
        }
    }
    public void pointPlus(){
        Toast.makeText(SecondActivity.this," Correct Answer +1 ",Toast.LENGTH_SHORT).show();
        count++;
        String pointSt = String.valueOf(count);
        textView.setText("Points: "+pointSt );
    }

    public void pointMinus(){
        Toast.makeText(SecondActivity.this," Wrong Answer -1 ",Toast.LENGTH_SHORT).show();
        count--;
        String pointSt = String.valueOf(count);
        textView.setText("Points: "+pointSt );
    }

    public void button1(View view) {
        textView = (TextView)(findViewById(R.id.points));
        biggestNum();
        if(biggest==num1){
            pointPlus();
            randomNum();
        }
        else{
            pointMinus();
            randomNum();
        }
    }

    public void button2(View view) {
        textView = (TextView)(findViewById(R.id.points));
        biggestNum();
        if(biggest==num2){
            pointPlus();
            randomNum();
        }
        else{
            pointMinus();
            randomNum();
        }
    }
    public void button3(View view) {
        textView = (TextView)(findViewById(R.id.points));
        biggestNum();
        if(biggest==num3){
            pointPlus();
            randomNum();
        }
        else{
            pointMinus();
            randomNum();
        }
    }
    public void button4(View view) {
        textView = (TextView)(findViewById(R.id.points));
        biggestNum();
        if(biggest==num4){
            pointPlus();
            randomNum();
        }
        else{
            pointMinus();
            randomNum();
        }
    }


}

