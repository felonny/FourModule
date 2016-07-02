package com.example.broadcastrecieverdemo;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {
	private BCR3 bcr3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//IntentFilter intentfilter = new IntentFilter();
		//BCR2 bcr2 = new BCR2();
		//registerReceiver(bcr2, intentfilter);
	}
	
	public void doClick(View v){
		switch (v.getId()) {
		//��ͨ�㲥�������ܴ���㲥�����͵�����
		case R.id.send1:
			Intent intent = new Intent();
			intent.putExtra("msg", "����һ����ͨ�㲥");
			intent.setAction("BC_1");
			sendBroadcast(intent);
			break;
		//����㲥���Ա��ض�
		case R.id.send2:
			Intent intent2 = new Intent();
			intent2.putExtra("msg", "����һ������㲥");
			intent2.setAction("BC_1");
			sendOrderedBroadcast(intent2, null);
			break;
		case R.id.send3:
			Intent intent3 = new Intent();
			intent3.putExtra("msg", "����һ���첽�㲥");
			intent3.setAction("BC_3");
			sendStickyBroadcast(intent3);
			IntentFilter intentfilter = new IntentFilter();
			 bcr3 = new BCR3();
			registerReceiver(bcr3, intentfilter);
			break;
		default:
			break;
		}
	}
	//�����̬ע���˵Ļ�һ��Ҫ���ٵ�
@Override
protected void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();
	unregisterReceiver(bcr3);
}
	
}
