package cleaner.lite.pro;

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
import android.widget.CheckBox;
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
	private LinearLayout linear4;
	private Switch multisup;
	private Switch btcall;
	private Switch intrimer;
	private Switch delvikcach;
	private Switch advwhat;
	private Switch lightui;
	private Switch noconfirm;
	private Switch liveEmpty;
	private Switch tempclean;
	private Switch nomedia;
	private Switch developer;
	private LinearLayout linear3;
	private Button GetPremium;
	private TextView textview7;
	private RadioButton belowEleven;
	private RadioButton elevenplus;
	private TextView textview6;
	private LinearLayout linear5;
	private CheckBox stroke;
	private TextView title;
	private RadioButton Preset1;
	private RadioButton Preset2;
	
	private SharedPreferences set;
	private AlertDialog.Builder d;
	private TimerTask t;
	private AlertDialog.Builder user;
	private AlertDialog.Builder Help;
	private AlertDialog.Builder soon;
	private SharedPreferences premium;
	private AlertDialog.Builder prm;
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
		linear4 = findViewById(R.id.linear4);
		multisup = findViewById(R.id.multisup);
		btcall = findViewById(R.id.btcall);
		intrimer = findViewById(R.id.intrimer);
		delvikcach = findViewById(R.id.delvikcach);
		advwhat = findViewById(R.id.advwhat);
		lightui = findViewById(R.id.lightui);
		noconfirm = findViewById(R.id.noconfirm);
		liveEmpty = findViewById(R.id.liveEmpty);
		tempclean = findViewById(R.id.tempclean);
		nomedia = findViewById(R.id.nomedia);
		developer = findViewById(R.id.developer);
		linear3 = findViewById(R.id.linear3);
		GetPremium = findViewById(R.id.GetPremium);
		textview7 = findViewById(R.id.textview7);
		belowEleven = findViewById(R.id.belowEleven);
		elevenplus = findViewById(R.id.elevenplus);
		textview6 = findViewById(R.id.textview6);
		linear5 = findViewById(R.id.linear5);
		stroke = findViewById(R.id.stroke);
		title = findViewById(R.id.title);
		Preset1 = findViewById(R.id.Preset1);
		Preset2 = findViewById(R.id.Preset2);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		d = new AlertDialog.Builder(this);
		user = new AlertDialog.Builder(this);
		Help = new AlertDialog.Builder(this);
		soon = new AlertDialog.Builder(this);
		premium = getSharedPreferences("premium", Activity.MODE_PRIVATE);
		prm = new AlertDialog.Builder(this);
		
		multisup.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				
			}
		});
		
		btcall.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("enable", "battery").commit();
				}
				else {
					set.edit().remove("enable").commit();
				}
			}
		});
		
		intrimer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				
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
					
				}
				else {
					t = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									delvikcach.setChecked(true);
								}
							});
						}
					};
					_timer.schedule(t, (int)(500));
				}
			}
		});
		
		advwhat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("enable5", "whatsapp").commit();
				}
				else {
					set.edit().remove("enable5").commit();
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
		
		liveEmpty.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		liveEmpty.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("liveEmpty", "1").commit();
				}
				else {
					set.edit().remove("liveEmpty").commit();
				}
			}
		});
		
		tempclean.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("tmpcleanoutput", "1").commit();
				}
				else {
					set.edit().remove("tmpcleanoutput").commit();
				}
			}
		});
		
		nomedia.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		nomedia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("nomediaoutput", "1").commit();
				}
				else {
					set.edit().remove("nomediaoutput").commit();
				}
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
		
		GetPremium.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		GetPremium.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), PremiumActivity.class);
				startActivity(i);
			}
		});
		
		belowEleven.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					elevenplus.setChecked(false);
					set.edit().putString("AndroidVersion", "11-").commit();
				}
				else {
					
				}
			}
		});
		
		elevenplus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		elevenplus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					belowEleven.setChecked(false);
					set.edit().putString("AndroidVersion", "11+").commit();
				}
				else {
					
				}
			}
		});
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		stroke.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		stroke.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("stroke", "1").commit();
				}
				else {
					set.edit().remove("stroke").commit();
				}
			}
		});
		
		Preset1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		Preset1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("theme", "1").commit();
					Preset2.setChecked(false);
				}
			}
		});
		
		Preset2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					set.edit().putString("theme", "2").commit();
					Preset1.setChecked(false);
					stroke.setVisibility(View.VISIBLE);
				}
				else {
					stroke.setVisibility(View.GONE);
					if (set.getString("stroke", "").equals("1")) {
						stroke.setChecked(true);
					}
				}
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
		if (set.getString("enable", "").equals("battery")) {
			btcall.setChecked(true);
		}
		if (set.getString("enable5", "").equals("whatsapp")) {
			advwhat.setChecked(true);
		}
		if (set.getString("AndroidVersion", "").equals("11-")) {
			belowEleven.setChecked(true);
		}
		if (set.getString("AndroidVersion", "").equals("11+")) {
			elevenplus.setChecked(true);
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
		if (set.getString("liveEmpty", "").equals("1")) {
			liveEmpty.setChecked(true);
		}
		if (set.getString("tmpcleanoutput", "").equals("1")) {
			tempclean.setChecked(true);
		}
		if (set.getString("nomediaoutput", "").equals("1")) {
			nomedia.setChecked(true);
		}
	}
	public void _comingsoon() {
		soon.setTitle("👨‍💻 𝗖𝗼𝗺𝗶𝗻𝗴 𝗦𝗼𝗼𝗻 ...");
		soon.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		soon.create().show();
	}
	
	
	public void _premiumpurchaseddone() {
		if (premium.getString("#", "").equals("1")) {
			GetPremium.setText("🛸 𝗣𝗿𝗲𝗺𝗶𝘂𝗺 𝗔𝗰𝘁𝗶𝘃𝗮𝘁𝗲𝗱");
		}
		else {
			
		}
	}
	
	
	public void _Theme() {
		GetPremium.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF00E676));
		if (set.getString("theme", "").equals("2")) {
			Preset2.setChecked(true);
			stroke.setVisibility(View.VISIBLE);
			if (set.getString("stroke", "").equals("1")) {
				stroke.setChecked(true);
			}
		}
		else {
			Preset1.setChecked(true);
			stroke.setVisibility(View.GONE);
		}
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