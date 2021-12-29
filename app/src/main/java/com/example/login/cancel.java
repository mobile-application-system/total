package com.example.login;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class cancel extends AppCompatActivity {
    SharedPreferences spref;
    SharedPreferences.Editor editor;

    Reservation.ConnectedBluetoothThread mThreadConnectedBluetooth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();

        Button btn = (Button)findViewById(R.id.cancel);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spref = getSharedPreferences("gref",MODE_PRIVATE);
                editor = spref.edit();
                if(spref.getBoolean("number",false) == true){
                    editor.putBoolean("number", false);
                    editor.commit();


                    Toast.makeText(getApplicationContext(),"1번 취소 완료",Toast.LENGTH_LONG ).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"취소할 좌석이 없습니다.",Toast.LENGTH_LONG ).show();

                }
            }
        });
        Button btn2 = (Button)findViewById(R.id.cancel2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spref = getSharedPreferences("gref",MODE_PRIVATE);
                editor = spref.edit();
                if(spref.getBoolean("number2",false) == true){
                    editor.putBoolean("number2", false);
                    editor.commit();


                    Toast.makeText(getApplicationContext(),"2번 취소 완료",Toast.LENGTH_LONG ).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"취소할 좌석이 없습니다.",Toast.LENGTH_LONG ).show();

                }
            }
        });


    }

}