package com.example.tabtest;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Programlayout extends Activity {
	Button btn_frame, btn_linear, btn_relative, btn_table, btn_fragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.main);

		TextView tv1 = new TextView(this);
		tv1.setText("FIRST");
		tv1.setTextSize(50);
		tv1.setGravity(Gravity.CENTER);
		
		TextView tv2 = new TextView(this);
		tv2.setTextSize(50);
		tv2.setGravity(Gravity.CENTER);
		tv2.setText("MIDDLE");
		
		TextView tv3 = new TextView(this);
		tv3.setTextSize(50);
		tv3.setGravity(Gravity.CENTER);
		tv3.setText("LAST");
		
		LinearLayout ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.VERTICAL);
		ll.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT));
		ll.setGravity(Gravity.LEFT);
		ll.addView(tv1);
		ll.addView(tv2);
		ll.addView(tv3);
		setContentView(ll);

	}

}
