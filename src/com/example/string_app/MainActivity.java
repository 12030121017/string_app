package com.example.string_app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText editString;
	private RadioGroup rgCase;
	private TextView txtString;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editString = (EditText) findViewById(R.id.editString);
		rgCase = (RadioGroup)findViewById(R.id.rgCase);
		txtString = (TextView)findViewById(R.id.txtString);
		
		OnCheckedChangeListener listener = new OnCheckedChangeListener()
		{
			
			@Override
			public void onCheckedChanged(RadioGroup group,int radioButtonId ) {
				switch(radioButtonId)
				{
				case R.id.lCase:
					txtString.setText(editString.getText().toString().toLowerCase());
					break;
				case R.id.uCase:
					txtString.setText(editString.getText().toString().toUpperCase());
					break;
				}
				
			}
			
		};
		rgCase.setOnCheckedChangeListener(listener);
	}
	
}	
	
