package org.jast.androidcalendarview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {

        Intent intent;

        switch (view.getId()) {
            case R.id.button_1:
                intent = new Intent(this, CalendarViewActivity.class);
                startActivity(intent);
                break;
            case R.id.button_2:
                intent = new Intent(this, GridViewCalendarActivity.class);
                startActivity(intent);
                break;
        }

    }
}
