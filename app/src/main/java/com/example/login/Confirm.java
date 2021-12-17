package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm);


    }
    public void yes(View view){
// 초기화면 또는 예약내역?
        Toast.makeText(getApplicationContext(),"예약이 완료 되었습니다.",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(intent);

    }
    public void no(View view){
// 결제창 또는 초기화면으로
        Intent intent = new Intent(getApplicationContext(), Payment.class);
        startActivity(intent);
    }
}