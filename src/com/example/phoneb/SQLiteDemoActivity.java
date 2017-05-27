package com.example.phoneb;

import android.R.integer;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class SQLiteDemoActivity extends ActionBarActivity {
	   Button startButton2;
	   Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_demo);
        
         startButton = (Button) findViewById(R.id.button1);
         startButton2 = (Button) findViewById(R.id.button2);
         startButton.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
  
 				// Start NewActivity.class
 				Intent myIntent = new Intent(SQLiteDemoActivity.this,
 						Show.class);
 				startActivity(myIntent);
 			}
 		});
         startButton2.setOnClickListener(new OnClickListener() {
  			public void onClick(View arg0) {
   
  				// Start NewActivity.class
  				Intent myIntent = new Intent(SQLiteDemoActivity.this,
  						Add.class);
  				startActivity(myIntent);
  			}
  		});
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sqlite_demo, menu);
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
