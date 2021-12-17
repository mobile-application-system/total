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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel);
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
                    Toast.makeText(getApplicationContext(),"취소 완료",Toast.LENGTH_LONG ).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"취소할 게 없어요",Toast.LENGTH_LONG ).show();

                }
            }
        });

    }

}