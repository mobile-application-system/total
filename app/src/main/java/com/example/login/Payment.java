package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);

        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb4.isChecked()){
                    cb1.setChecked(true);
                    cb2.setChecked(true);
                    cb3.setChecked(true);
                }else{
                    cb1.setChecked(false);
                    cb2.setChecked(false);
                    cb3.setChecked(false);
                }
            }
        });
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb4.isChecked()){
                    cb4.setChecked(false);
                }else if(cb1.isChecked()&&cb2.isChecked()&&cb3.isChecked()){
                    cb4.setChecked(true);
                }
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb4.isChecked()){
                    cb4.setChecked(false);
                }else if(cb1.isChecked()&&cb2.isChecked()&&cb3.isChecked()){
                    cb4.setChecked(true);
                }
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb4.isChecked()){
                    cb4.setChecked(false);
                }else if(cb1.isChecked()&&cb2.isChecked()&&cb3.isChecked()){
                    cb4.setChecked(true);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show1();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show3();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb4.isChecked()){
                    next();
                }else{
                    Toast.makeText(getApplicationContext(),"약관에 모두 동의하셔야 합니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void next() {
        Intent intent = new Intent(getApplicationContext(), Confirm.class);
        startActivity(intent);
    }
    public void back(View view) {
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(intent);

    }
    public void show1(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("전자금융거래 이용약관");
        //타이틀설정
        String tv_text = "약관내용 ~~";
        builder.setMessage(tv_text);
        //내용설정
        builder.setPositiveButton("확인",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

        builder.show();
    }
    public void show2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("개인정보수집 및 이용안내");
        //타이틀설정
        String tv_text = "약관내용 ~~";
        builder.setMessage(tv_text);
        //내용설정
        builder.setPositiveButton("확인",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

        builder.show();
    }
    public void show3(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("개인정보제공 및 위탁안내");
        //타이틀설정
        String tv_text = "약관내용 ~~";
        builder.setMessage(tv_text);
        //내용설정
        builder.setPositiveButton("확인",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

        builder.show();
    }

}