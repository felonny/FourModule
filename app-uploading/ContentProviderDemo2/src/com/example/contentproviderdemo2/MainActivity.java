package com.example.contentproviderdemo2;

import android.support.v7.app.ActionBarActivity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.StructuredName;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ContentResolver cr = getContentResolver();
		//相联系人中插入一行数据
		ContentValues values = new ContentValues();
		Uri uri = cr.insert(RawContacts.CONTENT_URI, values);
		//解析uri
		Long raw_contact_id = ContentUris.parseId(uri);
		values.clear();
		values.put(StructuredName.RAW_CONTACT_ID, raw_contact_id);
		values.put(StructuredName.DISPLAY_NAME, "张三三");
		values.put(StructuredName.MIMETYPE, StructuredName.CONTENT_ITEM_TYPE);
		uri = cr.insert(Data.CONTENT_URI, values);
		//插入电话星系
		values.clear();
		values.put(Phone.RAW_CONTACT_ID, raw_contact_id);
		values.put(Phone.NUMBER, "13456789654");
		values.put(Phone.MIMETYPE, Phone.CONTENT_ITEM_TYPE);
		uri = cr.insert(Data.CONTENT_URI, values);
	}

	
}
