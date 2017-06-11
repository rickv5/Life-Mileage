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

public class liangwangu extends Activity{

	private ViewPager ll_vp_picturelooker;
	private List<ImageView> datas = new ArrayList<>();
	private TextView tv_desc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("梁万古");
		//初始化界面
		initView();
		
		//初始化数据
		initData();
		
	}
	
	private void initData() {
		// 创建数据
		ImageView iv = null;
		for (int i = 0; i < 4; i++) {
			// 1. 创建ImageView
			iv = new ImageView(this);
			// 2. 给ImageView设置数据
			iv.setBackgroundResource(R.drawable.a1 + i);
			// 3. 添加数据到容器中
			datas.add(iv);
		}
		//給ll_vp_picturelooker设置适配器
		MyAdapter adapter = new MyAdapter();
		ll_vp_picturelooker.setAdapter(adapter);

	}

	private class MyAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			// 
			return datas.size();
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
			ImageView iv = datas.get(position);
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
