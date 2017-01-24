package org.jast.androidcalendarview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.jast.androidcalendarview.CustomView.CalendarView;
import org.jast.androidcalendarview.CustomView.CustomCalendarView;

import java.util.Calendar;

public class GridViewCalendarActivity extends AppCompatActivity {

    private static final int MAX_DATE_AFTER_TODAY = 7;
    private static final int MIN_DATE_AFTER_TODAY = -1;

    CalendarView mCustomCalendarVie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_calendar);

        mCustomCalendarVie = (CalendarView) findViewById(R.id.calendar_view);


        Calendar maxDate = Calendar.getInstance();
        setCalendarOfTheDayBegin(maxDate);
        maxDate.add(Calendar.DAY_OF_MONTH, MAX_DATE_AFTER_TODAY);


        Calendar minDate = Calendar.getInstance();
        setCalendarOfTheDayBegin(minDate);

        minDate.add(Calendar.DAY_OF_MONTH, MIN_DATE_AFTER_TODAY);


        final long minDateTime = minDate.getTimeInMillis();

        final long maxDateTime = maxDate.getTimeInMillis();


        mCustomCalendarVie.setMinDate(minDateTime);
        mCustomCalendarVie.setMaxDate(maxDateTime);

    }


    private boolean setCalendarOfTheDayBegin(Calendar calendar) {

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        return true;
    }
}
