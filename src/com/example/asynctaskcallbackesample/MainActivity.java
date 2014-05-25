package com.example.asynctaskcallbackesample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.example.asynctaskcallbackesample.SampleAsync.SampleListener;

public class MainActivity extends Activity implements SampleListener{

	TextView etHelloWorld;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etHelloWorld = (TextView) findViewById(R.id.etHelloWorld);
		
		SampleAsync sampleTask =  new SampleAsync(this);
		sampleTask.execute();
	}


	@Override
	public void onPostExecute(String Result) {
		// TODO Auto-generated method stub
		//Toast.makeText(getApplicationContext(), Result, Toast.LENGTH_SHORT).show();
		etHelloWorld.setText(Result);
	}
}
