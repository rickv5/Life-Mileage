package com.qianshang.playmusicservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class PlayMusicService extends Service {

	private MediaPlayer mMediapalyer;

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
		//装载音乐
		
		mMediapalyer = MediaPlayer.create(this, R.raw.nanshannan);
		
		//开始播放
		mMediapalyer.start();
		//循环播放音乐
		mMediapalyer.setLooping(true);
		
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		
		//停止播放
		mMediapalyer.stop();
	}

}
