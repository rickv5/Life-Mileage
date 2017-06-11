package com.qianshang.activitytestdemo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class liangzhenxuan extends Activity{

	private ViewPager ll_vp_picturelooker;
	private List<ImageView> datas = new ArrayList<>();
	private TextView tv_desc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("梁振轩");
		//初始化界面
		initView();
		
		//初始化数据
		initData();
		
	}
	
	/**
	 * 添加数据到容器中
	 * @param j 图片的地址
	 */
	private void addData(int j) {
		ImageView iv = null;
		for (int i = 1; i < 2; i++) {
			// 1. 创建ImageView
			iv = new ImageView(this);
			// 2. 给ImageView设置数据
			iv.setBackgroundResource(j);
			// 3. 添加数据到容器中
			datas.add(iv);
		}
	}
	
	private void initData() {
		// 创建数据
		ImageView iv = null;
		int j1 = R.drawable.d1;
		int j2 = R.drawable.d2;
		int j3 = R.drawable.e1;
		int j4 = R.drawable.e2;
		int j5 = R.drawable.e3;
		int j6 = R.drawable.e4;
		int j7 = R.drawable.e5;
		int j8 = R.drawable.e6;
		addData(j1);
		addData(j2);
		addData(j3);
		addData(j4);
		addData(j5);
		addData(j6);
		addData(j7);
		addData(j8);
		/*for (int i = 1; i < 2; i++) {
			// 1. 创建ImageView
			iv = new ImageView(this);
			// 2. 给ImageView设置数据
			iv.setBackgroundResource(j1);
			// 3. 添加数据到容器中
			datas.add(iv);
		}
		for (int i = 1; i < 2; i++) {
			// 1. 创建ImageView
			iv = new ImageView(this);
			// 2. 给ImageView设置数据
			iv.setBackgroundResource(j2);
			// 3. 添加数据到容器中
			datas.add(iv);
		}
		for (int i = 1; i < 2; i++) {
			// 1. 创建ImageView
			iv = new ImageView(this);
			// 2. 给ImageView设置数据
			iv.setBackgroundResource(j3);
			// 3. 添加数据到容器中
			datas.add(iv);
		}
		for (int i = 1; i < 2; i++) {
			// 1. 创建ImageView
			iv = new ImageView(this);
			// 2. 给ImageView设置数据
			iv.setBackgroundResource(j4);
			// 3. 添加数据到容器中
			datas.add(iv);
		}
		for (int i = 1; i < 2; i++) {
			// 1. 创建ImageView
			iv = new ImageView(this);
			// 2. 给ImageView设置数据
			iv.setBackgroundResource(j5);
			// 3. 添加数据到容器中
			datas.add(iv);
		}
		for (int i = 1; i < 2; i++) {
			// 1. 创建ImageView
			iv = new ImageView(this);
			// 2. 给ImageView设置数据
			iv.setBackgroundResource(j6);
			// 3. 添加数据到容器中
			datas.add(iv);
		}
		for (int i = 1; i < 2; i++) {
			// 1. 创建ImageView
			iv = new ImageView(this);
			// 2. 给ImageView设置数据
			iv.setBackgroundResource(j7);
			// 3. 添加数据到容器中
			datas.add(iv);
		}
		for (int i = 1; i < 2; i++) {
			// 1. 创建ImageView
			iv = new ImageView(this);
			// 2. 给ImageView设置数据
			iv.setBackgroundResource(j8);
			// 3. 添加数据到容器中
			datas.add(iv);
		}*/

		//給ll_vp_picturelooker设置适配器
		MyAdapter adapter = new MyAdapter();
		ll_vp_picturelooker.setAdapter(adapter);
		
		tv_desc.setText("梁振轩");
	}

	private class MyAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			// 
			return Integer.MAX_VALUE;
		}
		
		/*
		 * view 缓存的View object View的标记
		 */
		@Override
		public boolean isViewFromObject(View view, Object object) {
			// 判断view是否展示
			return view == object;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			// 初始化view数据

			// 1. 从容器中获取ImageView
			ImageView iv = datas.get(position % datas.size());
			// 2. 把iv 添加到ViewPager中 (ViewGroup的子类)

			ll_vp_picturelooker.addView(iv);
			// 3. 返回View的标记

			return iv;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			//  回收view
			container.removeView((View) object);
		}
		
		
	}

	private void initView() {
		//界面的组件获取
		setContentView(R.layout.viewpager);
		
		//1.ViewPager组件获取
		
		ll_vp_picturelooker = (ViewPager) findViewById(R.id.vp_picturelooker);
		
		//2.点的描述信息
		
		tv_desc = (TextView) findViewById(R.id.tv_desc);
		
		//3.点的容器
	}
	
}
