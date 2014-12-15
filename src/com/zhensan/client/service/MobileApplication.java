package com.zhensan.client.service;

import com.youku.player.YoukuPlayerApplication;


public class MobileApplication extends YoukuPlayerApplication{
	
	
	private static MobileApplication mobileApplication;
	
	
	public static String TAG = "ZhenSan";
	
	
	@Override
	public void onCreate() {
		super.onCreate();
		mobileApplication = this;
	}
		

	
	
	
	

}
