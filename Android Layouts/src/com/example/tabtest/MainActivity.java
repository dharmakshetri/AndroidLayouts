package com.example.tabtest;

import com.example.tabtest.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button btn_frame, btn_linear, btn_relative, btn_table, btn_fragment;
	Button btn_pl, btn_fs, btn_bs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		btn_linear = (Button) findViewById(R.id.btnlinear);
		btn_frame = (Button) findViewById(R.id.btnframe);
		btn_relative = (Button) findViewById(R.id.btnrelative);

		btn_pl = (Button) findViewById(R.id.button1);
		btn_fs = (Button) findViewById(R.id.fonttest);
		btn_bs=(Button) findViewById(R.id.btntest);
		
		btn_pl.setOnClickListener(this);
		btn_linear.setOnClickListener(this);
		btn_relative.setOnClickListener(this);
		btn_frame.setOnClickListener(this);
		btn_fs.setOnClickListener(this);
		btn_bs.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnlinear:
			Intent ilinear = new Intent(MainActivity.this, LinearActivity.class);
			startActivity(ilinear);
			break;
		case R.id.btnframe:
			Intent iframe = new Intent(MainActivity.this, FrameActivity.class);
			startActivity(iframe);
			break;
		case R.id.btnrelative:
			Intent irelative = new Intent(MainActivity.this,
					RelativeActivity.class);
			startActivity(irelative);
			break;
		case R.id.button1:
			Intent ipl = new Intent(MainActivity.this, Programlayout.class);
			startActivity(ipl);
			break;
		case R.id.fonttest:
			Intent ifs = new Intent(MainActivity.this, FontStyleActivity.class);
			startActivity(ifs);
			break;
		case R.id.btntest:
			Intent ibs = new Intent(MainActivity.this, ButtonStyleActivity.class);
			startActivity(ibs);
			break;
		default:
			break;
		}
	}

}
