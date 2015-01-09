package com.example.quiz_app;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class Start_Up extends Activity {

	MediaPlayer song;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startup);
		
		//song = MediaPlayer.create(Start_Up.this, R.raw.om);
		
		SharedPreferences getpref = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		boolean music = getpref.getBoolean("check", true);
		if(music == true){
		song.start();
		}
		
		Thread timer = new Thread(){
			public void run(){
				
				try {
					sleep(5000);
					
				} catch (InterruptedException e){
					e.printStackTrace();
					
				}finally {
					Intent start = new Intent("com.example.quiz_app.WelcomeActivity");
					startActivity(start);
				}

			}
		};
		timer.start();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.release();
		finish();
	}
}

