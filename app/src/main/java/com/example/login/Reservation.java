package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Reservation extends AppCompatActivity {
    boolean flag;
    SharedPreferences spref;
    SharedPreferences.Editor editor;
    Button seat1;
    Button seat2;
    Button seat3;
    Button seat4;
    Button seat5;
    Button seat6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        Intent intent = getIntent();

    }

    public void onClickHandler1(View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("선택").setMessage("예약하시겠습니까?");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                seat1 = findViewById(R.id.seat1);
                spref = getSharedPreferences("gref",MODE_PRIVATE);
                editor = spref.edit();
                if(spref.getBoolean("number",false) == true){
                    //seat1.setBackgroundColor(Color.DKGRAY);
                    Toast.makeText(getApplicationContext(),"이미 예약된 자리입니다.",Toast.LENGTH_LONG ).show();
                }
                else{
                    editor.putBoolean("number", true);
                    editor.commit();
                    Intent intent = new Intent(getApplicationContext(), Payment.class);
                    intent.putExtra("number", 1);
                    startActivity(intent);
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }


    public void onClickHandler2(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("선택").setMessage("예약하시겠습니까?");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                seat2 = findViewById(R.id.seat2);
                spref = getSharedPreferences("gref",MODE_PRIVATE);
                editor = spref.edit();
                if(spref.getBoolean("number2",false) == true){
                    //seat1.setBackgroundColor(Color.DKGRAY);
                    Toast.makeText(getApplicationContext(),"이미 예약된 자리입니다.",Toast.LENGTH_LONG ).show();
                }
                else{
                    editor.putBoolean("number2", true);
                    editor.commit();
                    Intent intent = new Intent(getApplicationContext(), Payment.class);
                    intent.putExtra("number2", 1);
                    startActivity(intent);
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void onClickHandler3(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("선택").setMessage("예약하시겠습니까?");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                seat3 = findViewById(R.id.seat3);
                spref = getSharedPreferences("gref",MODE_PRIVATE);
                editor = spref.edit();
                if(spref.getBoolean("number3",false) == true){
                    //seat1.setBackgroundColor(Color.DKGRAY);
                    Toast.makeText(getApplicationContext(),"이미 예약된 자리입니다.",Toast.LENGTH_LONG ).show();
                }
                else{
                    editor.putBoolean("number3", true);
                    editor.commit();
                    Intent intent = new Intent(getApplicationContext(), Payment.class);
                    intent.putExtra("number3", 1);
                    startActivity(intent);
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }



    public void onClickHandler4(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("선택").setMessage("예약하시겠습니까?");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                seat4 = findViewById(R.id.seat4);
                spref = getSharedPreferences("gref",MODE_PRIVATE);
                editor = spref.edit();
                if(spref.getBoolean("number4",false) == true){
                    //seat1.setBackgroundColor(Color.DKGRAY);
                    Toast.makeText(getApplicationContext(),"이미 예약된 자리입니다.",Toast.LENGTH_LONG ).show();
                }
                else{
                    editor.putBoolean("number4", true);
                    editor.commit();
                    Intent intent = new Intent(getApplicationContext(), Payment.class);
                    intent.putExtra("number4", 1);
                    startActivity(intent);
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void onClickHandler5(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("선택").setMessage("예약하시겠습니까?");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                seat5 = findViewById(R.id.seat5);
                spref = getSharedPreferences("gref",MODE_PRIVATE);
                editor = spref.edit();
                if(spref.getBoolean("number5",false) == true){
                    //seat1.setBackgroundColor(Color.DKGRAY);
                    Toast.makeText(getApplicationContext(),"이미 예약된 자리입니다.",Toast.LENGTH_LONG ).show();
                }
                else{
                    editor.putBoolean("number5", true);
                    editor.commit();
                    Intent intent = new Intent(getApplicationContext(), Payment.class);
                    intent.putExtra("number5", 1);
                    startActivity(intent);
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void onClickHandler6(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("선택").setMessage("예약하시겠습니까?");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                seat6 = findViewById(R.id.seat6);
                spref = getSharedPreferences("gref",MODE_PRIVATE);
                editor = spref.edit();
                if(spref.getBoolean("number6",false) == true){
                    //seat1.setBackgroundColor(Color.DKGRAY);
                    Toast.makeText(getApplicationContext(),"이미 예약된 자리입니다.",Toast.LENGTH_LONG ).show();
                }
                else{
                    editor.putBoolean("number6", true);
                    editor.commit();
                    Intent intent = new Intent(getApplicationContext(), Payment.class);
                    intent.putExtra("number6", 1);
                    startActivity(intent);
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
