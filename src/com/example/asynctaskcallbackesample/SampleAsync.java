package com.example.asynctaskcallbackesample;

import android.os.AsyncTask;

public class SampleAsync extends AsyncTask<Void, Void, String>{

	//interface
	public interface SampleListener{
		public void onPostExecute(String Result); 
	}
	
	SampleListener sampleListener;
	
	//constructor
	public SampleAsync(SampleListener sampleListener){
		this.sampleListener = sampleListener;
	}
	
	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();
	}
	
	@Override
	protected String doInBackground(Void... params) {
		// TODO Auto-generated method stub
		return "B";
	}

	@Override
	protected void onPostExecute(String result) {
		// TODO Auto-generated method stub
		super.onPostExecute(result);
		sampleListener.onPostExecute(result);
	}
}
