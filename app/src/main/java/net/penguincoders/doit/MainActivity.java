package net.penguincoders.doit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button diary_pg = (Button) findViewById(R.id.diary_p);
        diary_pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        DiaryActivity.class);
                // 다음 화면으로 넘어간다
                startActivity(intent);

            }
        });

        Button schedule_p = (Button) findViewById(R.id.sche_p);
        schedule_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        net.penguincoders.doit.ScheduleActivity.class);
                startActivity(intent); // 다음 화면으로 넘어간다

            }
        });

        Button todo_list_p = (Button) findViewById(R.id.todo_p);
        todo_list_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        TodoActivity.class);
                startActivity(intent); // 다음 화면으로 넘어간다

            }
        });

        Button logout_b = (Button) findViewById(R.id.logout);
        logout_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        LoginActivity.class);
                startActivity(intent); // 다음 화면으로 넘어간다

            }
        });

    }

}