package com.example.broadcastrecieverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class BCR1 extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		String s = intent.getStringExtra("msg");
		System.out.println("reciver�յ���Ϣ"+ s);
		Bundle bundle = new Bundle();
		bundle.putString("test", "�㲥���������");
		setResultExtras(bundle);
	}

}
