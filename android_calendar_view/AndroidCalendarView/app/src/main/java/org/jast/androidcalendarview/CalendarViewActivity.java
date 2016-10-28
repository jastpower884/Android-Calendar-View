package org.jast.androidcalendarview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import java.util.Calendar;
import java.util.Locale;


/**
 *
 *
 * */
public class CalendarViewActivity extends AppCompatActivity {

    private static final int MAX_DATE_AFTER_TODAY = 7;
    private static final int MIN_DATE_AFTER_TODAY = -1;

    private CalendarView mCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);
        mCalendarView = (CalendarView) findViewById(R.id.calendar_view);


        Calendar maxDate = Calendar.getInstance();
        setCalendarOfTheDayBegin(maxDate);
        maxDate.add(Calendar.DAY_OF_YEAR, MAX_DATE_AFTER_TODAY);


        Calendar minDate = Calendar.getInstance();
        setCalendarOfTheDayBegin(minDate);

        minDate.add(Calendar.DAY_OF_YEAR, MIN_DATE_AFTER_TODAY);


        final long minDateTime = minDate.getTimeInMillis();

        final long maxDateTime = maxDate.getTimeInMillis();


        /*
        *  This thing always make my device crash.
        *  So I decide comment it.
        * */
//        mCalendarView.setMinDate(minDateTime);
//        mCalendarView.setMaxDate(maxDateTime);

    }


    private boolean setCalendarOfTheDayBegin(Calendar calendar) {

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        return true;
    }
}

