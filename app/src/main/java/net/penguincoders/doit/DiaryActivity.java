package net.penguincoders.doit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class DiaryActivity extends AppCompatActivity {

    DatePicker dp;
    EditText editDiary;
    Button btnWrite;
    String fileName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        setTitle("Diary");
        dp = (DatePicker)findViewById(R.id.datePicker1);
        editDiary = (EditText)findViewById(R.id.edtDiary);
        btnWrite = (Button)findViewById(R.id.btnWrite);

        Button diary_main = (Button) findViewById(R.id.button_bmain);
        diary_main.setOnClickListener(new View.OnClickListener() {
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

        //Todo 데이트피커 설정
        Calendar cal = Calendar.getInstance();
        int cYear = cal.get(Calendar.YEAR);
        int cMonth = cal.get(Calendar.MONTH);
        int cDay = cal.get(Calendar.DAY_OF_MONTH);

        dp.init(cYear, cMonth, cDay, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                fileName = Integer.toString(year) + "_" + Integer.toString(monthOfYear + 1) + "_" + Integer.toString(dayOfMonth) + ".txt";
                // month는 0부터 시작이 되어서 우리가 10을 선택해도 9가 되기때문에 1을 더해줬다
                String str = readDiary(fileName); // 현재 날짜의 파일을 읽어오는 메소드
                editDiary.setText(str);
                btnWrite.setEnabled(true);
            }
        });
        //Todo 버튼 클릭 리스너
        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    FileOutputStream outFs = openFileOutput(fileName, Context.MODE_PRIVATE);
                    String str = editDiary.getText().toString();
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(),fileName+" 이 저장됨", Toast.LENGTH_SHORT).show();
                    readDiary(fileName);
                } catch (IOException e) {

                }
            }
        });
    }
    //Todo 현재 날짜의 파일을 얻어 일기 내용을 반환
    String readDiary(String fName) {
        String diaryStr = null;
        FileInputStream inputStream;
        try {
            inputStream = openFileInput(fName);
            byte[] txt = new byte[500];
            inputStream.read(txt);
            inputStream.close();
            diaryStr = (new String(txt)).trim();
            btnWrite.setText("Save");
        } catch (IOException e) {
            editDiary.setHint("Write Diary");
            btnWrite.setText("New");
        }
        return diaryStr;
    }

}