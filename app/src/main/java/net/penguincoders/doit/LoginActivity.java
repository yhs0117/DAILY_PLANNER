package net.penguincoders.doit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button bt_login = (Button) findViewById(R.id.login_bt1);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        net.penguincoders.doit.MainActivity.class);
                // 다음 화면으로 넘어간다
                startActivity(intent);

            }
        });

        Button bt_login2 = (Button) findViewById(R.id.login_bt2);
        bt_login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        net.penguincoders.doit.MainActivity.class);
                // 다음 화면으로 넘어간다
                startActivity(intent);

            }
        });

        Button join = (Button) findViewById(R.id.join_bt1);
        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        net.penguincoders.doit.JoinActivity.class);
                // 다음 화면으로 넘어간다
                startActivity(intent);

            }
        });
    }

}
