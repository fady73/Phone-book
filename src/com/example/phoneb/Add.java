package com.example.phoneb;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Add extends ActionBarActivity {
	EditText name,phone;
	Button add_contact;
	DatabaseHandler db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		
		db=new DatabaseHandler(this);
		name=(EditText)findViewById(R.id.name);
		phone=(EditText)findViewById(R.id.phone);
		add_contact=(Button)findViewById(R.id.add_contact);
		add_contact.setOnClickListener(new OnClickListener() {
  			public void onClick(View view) {
   
  				switch (view.getId()) {
  				case R.id.add_contact:
  					String NAME=name.getText().toString();
  					String PHONE=phone.getText().toString();
  					Contact contact=new Contact();
  					contact.setName(NAME);
  					contact.setPhoneNumber(PHONE);
  					db.addContact(contact);
  					Intent myIntent = new Intent(Add.this,
  	  						SQLiteDemoActivity.class);
  	  				startActivity(myIntent);
  					break;

  				default:
  					break;
  				}
  			}
  		});
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add, menu);
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
