package org.jast.androidcalendarview.CustomView;

import java.util.Calendar;

/**
 * This interface defines what events to be reported to
 * the outside world
 */
public interface CalendarEventHandler {
    void onDayPress(Calendar date);
    void onDayLongPress(Calendar date);
}
