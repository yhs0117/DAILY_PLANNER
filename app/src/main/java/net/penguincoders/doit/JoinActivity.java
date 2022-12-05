package net.penguincoders.doit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        Button join_p = (Button) findViewById(R.id.join_btn1);
        join_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        LoginActivity.class);
                // 다음 화면으로 넘어간다
                startActivity(intent);

            }
        });

        Button join_p2 = (Button) findViewById(R.id.join_btn2);
        join_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        LoginActivity.class);
                // 다음 화면으로 넘어간다
                startActivity(intent);

            }
        });
    }
}
