package com.qianshang.playmusicservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class PlayMusicActivity extends Activity {

	private Button bt_start;
	private Button bt_stop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("张晓磊-南山南.mp3");
		//初始化界面
		initView();
		//初始化事件
		initEvent();
	}

	private void initEvent() {
		//用于启动和停止service的intent
		final Intent intent = new Intent("android.qianshang.service.playmusic");
		
		//开始按钮的点击监听
		
		bt_start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Toast.makeText(getApplicationContext(), "开始播放", 0).show();
				startService(intent);
			}
		});
		
		//结束按钮的点击监听
		
		bt_stop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "停止播放", 0).show();
				stopService(intent);
			}
		});
		
	}

	private void initView() {
		setContentView(R.layout.activity_main);
		//开始按钮
		
		bt_start = (Button) findViewById(R.id.bt_start);
		
		//停止按钮
		
		bt_stop = (Button) findViewById(R.id.bt_stop);
		
	}


}
