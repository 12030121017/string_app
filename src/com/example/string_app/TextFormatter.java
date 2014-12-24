package com.example.string_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class TextFormatter extends Activity {
private RadioGroup rgS;
private RadioGroup rgC;
private EditText editString;
//private Checkbox chB;
//private Checkbox chI;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_formatter);
		editString = (EditText) findViewById(R.id.editString);
		rgS = (RadioGroup)findViewById(R.id.rgS);
		rgC = (RadioGroup)findViewById(R.id.rgC);
		
		OnCheckedChangeListener listener=new OnCheckedChangeListener() 
		{
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int radiobuttonId) {
				String size=((RadioButton)findViewById(radiobuttonId)).getText().toString();
				int s=Integer.valueOf(size);
				editString.setTextSize(s);
				
				
			}
		};
		rgS.setOnCheckedChangeListener(listener);
	}

}