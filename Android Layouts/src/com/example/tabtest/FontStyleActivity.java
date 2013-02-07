package com.example.tabtest;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FontStyleActivity extends Activity {
	TextView f1,f2,f3,f4,f5;
	Typeface t1, t2, t3, t4, t5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fontstyle);
		
		f1=(TextView)findViewById(R.id.font1);
		f2=(TextView)findViewById(R.id.font3);
		f3=(TextView)findViewById(R.id.font3);
		f4=(TextView)findViewById(R.id.font4);
		f5=(TextView)findViewById(R.id.font5);
		
		t1=Typeface.createFromAsset(getAssets(),"fonts/eurof75.ttf");
		f1.setTypeface(t1);
		
		
		t2=Typeface.createFromAsset(getAssets(),"fonts/notepad.ttf");
		f2.setTypeface(t2);
		
		t3=Typeface.createFromAsset(getAssets(),"fonts/saginawmedium.ttf");
		f3.setTypeface(t3);
		
		t4=Typeface.createFromAsset(getAssets(),"fonts/accid.ttf");
		f4.setTypeface(t4);
		
		t5=Typeface.createFromAsset(getAssets(),"fonts/wds.ttf");
		f5.setTypeface(t5);
	}
}
