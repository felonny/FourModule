package com.example.broadcastrecieverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class BCR2 extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		String s = intent.getStringExtra("msg");
		System.out.println("reciver�յ���Ϣ"+ s);
		//�����ݾ��д����������ͨ�㲥���ܴ���������Դ���
		Bundle bundle = getResultExtras(true);
		String s1 = bundle.getString("test");
		System.out.println("�õ������ݴ�������"+s1);
	}

}
