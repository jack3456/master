package com.harnpowei.CalenderViewExample;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Button;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;

public class CalenderViewExampleActivity extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);	
		intitViews();
		}
	
	private CalendarView calendar;
	public void intitViews(){
		calendar = (CalendarView)findViewById(R.id.calendar);
	  		calendar.setOnDateChangeListener(new OnDateChangeListener(){
			@Override
			public void onSelectedDayChange(CalendarView view,int year, int month, int dayOfMonth){
				Intent intent = new Intent();
				intent.setClass(CalenderViewExampleActivity.this, SocialPage.class);
 				startActivity(intent);
			}
		});
		
	}
	
}


