package com.harnpowei.CalenderViewExample;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;
import android.app.Activity;
 
public class CalenderViewExampleActivity extends Activity {
	CalendarView calendar;
 
@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			setContentView(R.layout.main);
			calendar = (CalendarView)findViewById(R.id.calendar);
			calendar.setOnDateChangeListener(new OnDateChangeListener(){
@Override
				public void onSelectedDayChange(CalendarView view,int year, int month, int dayOfMonth) {
	 				Toast.makeText(getApplicationContext(),dayOfMonth +"/"+month+"/"+ year,Toast.LENGTH_LONG).show();}});
	}
}
