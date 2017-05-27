package com.example.phoneb;

import java.util.ArrayList;
import java.util.List;

import com.example.phoneb.Contact;
import com.example.phoneb.DatabaseHandler;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Show extends Activity {
	ArrayList<String>names= new ArrayList<String>();
	ArrayList<Integer>id= new ArrayList<Integer>();
	ListView list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show);
		
		list=(ListView)findViewById(R.id.listView1);
		DatabaseHandler db = new DatabaseHandler(this);

		 List<Contact> contacts = db.getAllContacts();       
		 
	        for (Contact cn : contacts) {
	        	names.add(cn.getName());
	        	id.add(cn.getID());
	    }
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	                android.R.layout.simple_list_item_1, names);    
	        list.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
