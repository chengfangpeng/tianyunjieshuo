package com.zhensan.client.service;

import android.app.Application;

public class MobileApplication extends Application{
	
	
	private static MobileApplication mobileApplication;
	
	
	public static String TAG = "ZhenSan";
	
	
	@Override
	public void onCreate() {
		super.onCreate();
		mobileApplication = this;
	}
		

	
	
	
	

}
