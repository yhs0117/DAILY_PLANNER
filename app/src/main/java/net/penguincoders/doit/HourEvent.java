package net.penguincoders.doit;

import java.time.LocalTime;
import java.util.ArrayList;

class HourEvent
{
    LocalTime time;
    ArrayList<net.penguincoders.doit.Event> events;

    public HourEvent(LocalTime time, ArrayList<net.penguincoders.doit.Event> events)
    {
        this.time = time;
        this.events = events;
    }

    public LocalTime getTime()
    {
        return time;
    }

    public void setTime(LocalTime time)
    {
        this.time = time;
    }

    public ArrayList<net.penguincoders.doit.Event> getEvents()
    {
        return events;
    }

    public void setEvents(ArrayList<net.penguincoders.doit.Event> events)
    {
        this.events = events;
    }
}
