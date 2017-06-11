package com.qianshang.activitytestdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button bt_father;
	private Button bt_liangchen;
	private Button bt_liangyi;
	private Button bt_liangzhenxuan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("梁氏家族");
		//初始化界面
		initView();
		//初始化事件
		initEvent();
	}
	
	private void initEvent() {
		//为按钮添加点击事件
		bt_father.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, liangwangu.class);
				startActivity(intent);
			}
		});
		//为按钮添加点击事件
		bt_liangchen.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, liangcheng.class);
				startActivity(intent);
			}
		});
		//为按钮添加点击事件
		bt_liangyi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, liangyi.class);
				startActivity(intent);
			}
		});
		//为按钮添加点击事件
		bt_liangzhenxuan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, liangzhenxuan.class);
				startActivity(intent);
			}
		});
		
	}

	private void initView() {
		setContentView(R.layout.activity_main);
		//找到子控件
		bt_father = (Button) findViewById(R.id.button1_father);
		
		bt_liangchen = (Button) findViewById(R.id.button_liangcheng);
		
		bt_liangyi = (Button) findViewById(R.id.button_liangyi);
		
		bt_liangzhenxuan = (Button)findViewById(R.id.button_liangzhenxuan);
	}
}
