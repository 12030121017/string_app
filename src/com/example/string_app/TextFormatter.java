package com.example.string_app;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class TextFormatter extends Activity {
	int B,I;
private RadioGroup rgS;
private RadioGroup rgC;
private EditText editString;
private CheckBox chB;
private CheckBox chI;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_formatter);
		editString = (EditText) findViewById(R.id.editString);
		rgS = (RadioGroup)findViewById(R.id.rgS);
		rgC = (RadioGroup)findViewById(R.id.rgC);
		chB = (CheckBox)findViewById(R.id.chB);
		chI = (CheckBox)findViewById(R.id.chI);
		
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
OnCheckedChangeListener listener2 = new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int radiobuttonId) {
			String c=((RadioButton)findViewById(radiobuttonId)).getText().toString();	
			if(c.equals("Red") ){
			editString.setTextColor(Color.RED);}
			if(c.equals("Green")){
			editString.setTextColor(Color.GREEN);}
			if(c.equals("Blue"))
			editString.setTextColor(Color.BLUE);
			}
		};
		rgC.setOnCheckedChangeListener(listener2);
		android.widget.CompoundButton.OnCheckedChangeListener listener3 = new android.widget.CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				if(arg1==true)
				editString.setTypeface(null, Typeface.BOLD);
				else
				editString.setTypeface(Typeface.DEFAULT);
			}
		};
		chB.setOnCheckedChangeListener(listener3);
		android.widget.CompoundButton.OnCheckedChangeListener listener4 = new android.widget.CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				if(arg1==true)
				{
					Html.fromHtml("<i>"+editString.getText()+"</i>");	
					editString.setText(Html.fromHtml("<i>"+editString.getText()+"</i>"));
				}
				else
					editString.setText(editString.getText().toString().replaceAll("\\<.*?\\>", ""));
			}
		};
		chI.setOnCheckedChangeListener(listener4);
	}
		
	}
