package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    private EditText et_id,et_pw;
    private Button btn_login,btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_id = findViewById(R.id.et_id);
        et_pw = findViewById(R.id.et_pw);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);
        //Button btn = (Button)findViewById(R.id.button);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userID = et_id.getText().toString();
                String userPassword = et_pw.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) { //response : 회원가입요청 후 결과값을 제이슨오브잭트로 받는 것임. 서버통신왔다갔다한다음에, 성공여부를 알기 위해서
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            if (success) { //로그인에 성공한 경우
                                String userID = jsonObject.getString("userID"); //서버로부터 유저 아이디, 유저 패스워드를 받아옴,괄호한 변수명 PHP파일이랑 같아야함.
                                String userPassword = jsonObject.getString("userPassword");

                                Toast.makeText(getApplicationContext(),"로그인에 성공하였습니다.",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                                intent.putExtra("userID",userID);
                                intent.putExtra("userPassword",userPassword);
                                startActivity(intent);
                            } else { //로그인에 실패한 경우
                                Toast.makeText(getApplicationContext(),"로그인에 실패하였습니다.",Toast.LENGTH_SHORT).show();
                                return;

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                LoginRequest loginRequest = new LoginRequest(userID,userPassword,responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);

            }
        });
    }
}
