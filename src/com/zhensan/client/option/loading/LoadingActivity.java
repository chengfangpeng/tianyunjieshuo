package com.zhensan.client.option.loading;

import java.net.HttpURLConnection;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import com.ab.view.slidingmenu.SlidingFragmentActivity;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HttpStack;
import com.zhensan.client.MainActivity;
import com.zhensan.client.R;
import com.zhensan.client.parentclass.ParentActivity;
import com.zhensan.client.service.ClientTask;
import com.zhensan.client.service.MobileApplication;

public class LoadingActivity extends ParentActivity{
	
	private SharedPreferences sPreferences;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		sPreferences = getSharedPreferences(MobileApplication.TAG, MODE_PRIVATE);
//		threadTask();
		intentToMain();

	}

	private void intentToMain() {
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				startActivity(new Intent(LoadingActivity.this,MainActivity.class));
				finish();
			}
				
		}, 2000);
		
		
		
	}

	@Override
	protected int getLayoutId() {
		return R.layout.loading;
	}

	@Override
	protected void setupViews() {
		
	}

	@Override
	protected void initialized() {
		
	}

	@Override
	protected void threadTask() {
		
	}

}
