package net.penguincoders.doit;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalTime;

public class EventEditActivity extends AppCompatActivity
{
    private EditText eventNameET;
    private TextView eventDateTV, eventTimeTV;

    private LocalTime time;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_edit);
        initWidgets();
        time = LocalTime.now();
        eventDateTV.setText("Date: " + net.penguincoders.doit.CalendarUtils.formattedDate(net.penguincoders.doit.CalendarUtils.selectedDate));
        eventTimeTV.setText("Time: " + net.penguincoders.doit.CalendarUtils.formattedTime(time));
    }

    private void initWidgets()
    {
        eventNameET = findViewById(R.id.eventNameET);
        eventDateTV = findViewById(R.id.eventDateTV);
        eventTimeTV = findViewById(R.id.eventTimeTV);
    }

    public void saveEventAction(View view)
    {
        String eventName = eventNameET.getText().toString();
        net.penguincoders.doit.Event newEvent = new net.penguincoders.doit.Event(eventName, net.penguincoders.doit.CalendarUtils.selectedDate, time);
        net.penguincoders.doit.Event.eventsList.add(newEvent);
        finish();
    }
}