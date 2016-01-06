package com.luke.testlistview;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnItemClickListener,OnItemLongClickListener{

	private ListView mListView;
	private List<String> map = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		mListView = new ListView(this);
		mListView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,getData()));
		mListView.setOnItemClickListener(this);
		mListView.setOnItemLongClickListener(this);
		
		setContentView(mListView);
	}

	private List<String> getData(){
		
		map.add("line1");
		map.add("line2");
		map.add("line3");
		map.add("line4");
		map.add("line5");
		return map;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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

	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		if(map.get(arg2).equals("line1")){
			Toast.makeText(this, "element 1 selected", Toast.LENGTH_SHORT).show();
		}
		if(map.get(arg2).equals("line2")){
			Toast.makeText(this, "element 2 selected", Toast.LENGTH_SHORT).show();
		}
		if(map.get(arg2).equals("line3")){
			Toast.makeText(this, "element 3 selected", Toast.LENGTH_SHORT).show();
		}
		if(map.get(arg2).equals("line4")){
			Toast.makeText(this, "element 4 selected", Toast.LENGTH_SHORT).show();
		}
		if(map.get(arg2).equals("line5")){
			Toast.makeText(this, "element 5 selected", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		
		if(map.get(arg2).equals("list1")){
			Toast.makeText(this, "element 1 selected Deeply", Toast.LENGTH_SHORT).show();	
		}
		
		return true;
	}
	
	
}
