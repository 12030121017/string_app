package com.example.string_app;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity {
	private Button b0;
	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;
	private Button b6;
	private Button b7;
	private Button b8;
	private Button b9;
	private Button bDot;
	private Button bPlus;
	private Button bMinus;
	private Button bMultiply;
	private Button bDivide;
	private Button bEquals;
	private Button bClr;
	private Button bBck;
	private EditText Disp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);
		b4 = (Button) findViewById(R.id.b4);
		b5 = (Button) findViewById(R.id.b5);
		b6 = (Button) findViewById(R.id.b6);
		b7 = (Button) findViewById(R.id.b7);
		b8 = (Button) findViewById(R.id.b8);
		b9 = (Button) findViewById(R.id.b9);
		b0 = (Button) findViewById(R.id.b0);
		bDot = (Button) findViewById(R.id.bDot);
		bEquals = (Button) findViewById(R.id.bEquals);
		bClr = (Button) findViewById(R.id.bClr);
		bBck = (Button) findViewById(R.id.bBck);
		bPlus = (Button) findViewById(R.id.bPlus);
		bMinus = (Button) findViewById(R.id.bMinus);
		bMultiply = (Button) findViewById(R.id.bMultiply);
		bDivide = (Button) findViewById(R.id.bDivide);
		Disp=(EditText)findViewById(R.id.Disp);
	
	OnClickListener listener= new OnClickListener() {
		
		@Override
		public void onClick(View v) {
		Disp.setText("");
			
		}
		};
	bClr.setOnClickListener(listener);
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

}
