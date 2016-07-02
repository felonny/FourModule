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
		System.out.println("reciver收到消息"+ s);
		//对数据经行处理，如果是普通广播则不能处理，有序可以处理
		Bundle bundle = getResultExtras(true);
		String s1 = bundle.getString("test");
		System.out.println("得到的数据处理结果是"+s1);
	}

}
