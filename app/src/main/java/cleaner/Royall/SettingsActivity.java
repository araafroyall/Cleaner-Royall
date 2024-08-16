package Cleaner.Royall;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class SettingsActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private Switch multisup;
	private Switch intrimer;
	private Switch module;
	private Switch switch1;
	private Switch developer;
	private Switch lightui;
	private Switch delvikcach;
	private Switch btcall;
	private Switch disramm;
	private Switch noconfirm;
	private Switch NoAnim;
	private LinearLayout linear3;
	private Button GetPremium;
	private TextView textview6;
	
	private SharedPreferences set;
	private AlertDialog.Builder d;
	private TimerTask t;
	private SharedPreferences premium;
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settings);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		multisup = findViewById(R.id.multisup);
		intrimer = findViewById(R.id.intrimer);
		module = findViewById(R.id.module);
		switch1 = findViewById(R.id.switch1);
		developer = findViewById(R.id.developer);
		lightui = findViewById(R.id.lightui);
		delvikcach = findViewById(R.id.delvikcach);
		btcall = findViewById(R.id.btcall);
		disramm = findViewById(R.id.disramm);
		noconfirm = findViewById(R.id.noconfirm);
		NoAnim = findViewById(R.id.NoAnim);
		linear3 = findViewById(R.id.linear3);
		GetPremium = findViewById(R.id.GetPremium);
		textview6 = findViewById(R.id.textview6);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		d = new AlertDialog.Builder(this);
		premium = getSharedPreferences("premium", Activity.MODE_PRIVATE);
		
		multisup.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				
			}
		});
		
		intrimer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				
			}
		});
		
		developer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		developer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("developer", "1").commit();
				}
				else {
					set.edit().remove("developer").commit();
				}
			}
		});
		
		lightui.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		lightui.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("lite", "1").commit();
				}
				else {
					set.edit().remove("lite").commit();
				}
			}
		});
		
		delvikcach.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		delvikcach.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("dalvikkkk", "1").commit();
				}
				else {
					set.edit().remove("dalvikkkk").commit();
				}
			}
		});
		
		btcall.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("btCal", "1").commit();
				}
				else {
					set.edit().remove("btCal").commit();
				}
			}
		});
		
		disramm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("disrm", "1").commit();
				}
				else {
					set.edit().remove("disrm").commit();
				}
			}
		});
		
		noconfirm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		noconfirm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("confirm", "0").commit();
				}
				else {
					set.edit().remove("confirm").commit();
				}
			}
		});
		
		NoAnim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("Animation", "1").commit();
				}
				else {
					set.edit().remove("Animation").commit();
				}
			}
		});
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ThemeActivity.class);
				startActivity(i);
			}
		});
		
		GetPremium.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				if (premium.getString("purchased", "").equals("1")) {
					d.setTitle("𝗛𝗶𝗱𝗲 𝗧𝗵𝗶𝘀 𝗛𝗶𝗻𝘁");
					d.setIcon(R.drawable.help1);
					d.setMessage("It will not shown Next Time When you open Custom Cleaner");
					d.setPositiveButton("✳️ Hide", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							set.edit().putString("prmbt", "1").commit();
							GetPremium.setVisibility(View.GONE);
						}
					});
					d.create().show();
				}
				return true;
			}
		});
		
		GetPremium.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PremiumActivity.class);
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("⚙️ 𝗦𝗲𝘁𝘁𝗶𝗻𝗴𝘀");
		_premiumpurchaseddone();
		_Theme();
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		if (set.getString("btCal", "").equals("1")) {
			btcall.setChecked(true);
		}
		if (set.getString("lite", "").equals("1")) {
			lightui.setChecked(true);
		}
		if (set.getString("confirm", "").equals("0")) {
			noconfirm.setChecked(true);
		}
		if (set.getString("developer", "").equals("1")) {
			developer.setChecked(true);
		}
		if (set.getString("Animation", "").equals("1")) {
			NoAnim.setChecked(true);
		}
		if (set.getString("dalvikkkk", "").equals("1")) {
			delvikcach.setChecked(true);
		}
		if (set.getString("disrm", "").equals("1")) {
			disramm.setChecked(true);
		}
	}
	public void _comingsoon() {
		d.setTitle("👨‍💻 𝗖𝗼𝗺𝗶𝗻𝗴 𝗦𝗼𝗼𝗻 ...");
		d.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d.create().show();
	}
	
	
	public void _premiumpurchaseddone() {
		
	}
	
	
	public void _Theme() {
		GetPremium.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF00E676));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}