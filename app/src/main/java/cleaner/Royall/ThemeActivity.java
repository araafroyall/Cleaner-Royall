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
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.*;
import org.json.*;

public class ThemeActivity extends Activity {
	
	private ArrayList<String> Theme = new ArrayList<>();
	
	private LinearLayout header;
	private LinearLayout linear24;
	private ScrollView vscroll1;
	private ImageView imageview2;
	private TextView headL;
	private LinearLayout samplebt2;
	private LinearLayout samplebt;
	private ImageView imageview6;
	private TextView textview6;
	private ImageView imageview7;
	private TextView textview7;
	private LinearLayout linear25;
	private TextView textview9;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private LinearLayout linear30;
	private TextView textview11;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private TextView textview17;
	private TextView textview18;
	private TextView textview19;
	private TextView textview20;
	private TextView textview21;
	private TextView textview22;
	private TextView textview23;
	private TextView textview24;
	private TextView textview25;
	private TextView textview26;
	private TextView textview27;
	private TextView textview29;
	private TextView textview30;
	private TextView textview31;
	private TextView textview32;
	private TextView textview33;
	private TextView textview34;
	private TextView textview35;
	private TextView textview36;
	private TextView textview37;
	private TextView textview38;
	private TextView textview39;
	private TextView textview40;
	private TextView textview41;
	private TextView textview43;
	private TextView textview44;
	private TextView textview52;
	private TextView textview45;
	private TextView textview46;
	private TextView textview47;
	private TextView textview48;
	private TextView textview49;
	private TextView textview50;
	private TextView textview51;
	private TextView textview53;
	private TextView textview54;
	private EditText html;
	private TextView save;
	private TextView colors;
	private TextView textview28;
	private TextView rds;
	private SeekBar seekbar1;
	
	private SharedPreferences set;
	private AlertDialog.Builder prm;
	private Intent i = new Intent();
	private AlertDialog.Builder testColor;
	private AlertDialog.Builder info;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.theme);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		header = findViewById(R.id.header);
		linear24 = findViewById(R.id.linear24);
		vscroll1 = findViewById(R.id.vscroll1);
		imageview2 = findViewById(R.id.imageview2);
		headL = findViewById(R.id.headL);
		samplebt2 = findViewById(R.id.samplebt2);
		samplebt = findViewById(R.id.samplebt);
		imageview6 = findViewById(R.id.imageview6);
		textview6 = findViewById(R.id.textview6);
		imageview7 = findViewById(R.id.imageview7);
		textview7 = findViewById(R.id.textview7);
		linear25 = findViewById(R.id.linear25);
		textview9 = findViewById(R.id.textview9);
		linear28 = findViewById(R.id.linear28);
		linear29 = findViewById(R.id.linear29);
		linear31 = findViewById(R.id.linear31);
		linear32 = findViewById(R.id.linear32);
		linear33 = findViewById(R.id.linear33);
		linear34 = findViewById(R.id.linear34);
		linear30 = findViewById(R.id.linear30);
		textview11 = findViewById(R.id.textview11);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		textview17 = findViewById(R.id.textview17);
		textview18 = findViewById(R.id.textview18);
		textview19 = findViewById(R.id.textview19);
		textview20 = findViewById(R.id.textview20);
		textview21 = findViewById(R.id.textview21);
		textview22 = findViewById(R.id.textview22);
		textview23 = findViewById(R.id.textview23);
		textview24 = findViewById(R.id.textview24);
		textview25 = findViewById(R.id.textview25);
		textview26 = findViewById(R.id.textview26);
		textview27 = findViewById(R.id.textview27);
		textview29 = findViewById(R.id.textview29);
		textview30 = findViewById(R.id.textview30);
		textview31 = findViewById(R.id.textview31);
		textview32 = findViewById(R.id.textview32);
		textview33 = findViewById(R.id.textview33);
		textview34 = findViewById(R.id.textview34);
		textview35 = findViewById(R.id.textview35);
		textview36 = findViewById(R.id.textview36);
		textview37 = findViewById(R.id.textview37);
		textview38 = findViewById(R.id.textview38);
		textview39 = findViewById(R.id.textview39);
		textview40 = findViewById(R.id.textview40);
		textview41 = findViewById(R.id.textview41);
		textview43 = findViewById(R.id.textview43);
		textview44 = findViewById(R.id.textview44);
		textview52 = findViewById(R.id.textview52);
		textview45 = findViewById(R.id.textview45);
		textview46 = findViewById(R.id.textview46);
		textview47 = findViewById(R.id.textview47);
		textview48 = findViewById(R.id.textview48);
		textview49 = findViewById(R.id.textview49);
		textview50 = findViewById(R.id.textview50);
		textview51 = findViewById(R.id.textview51);
		textview53 = findViewById(R.id.textview53);
		textview54 = findViewById(R.id.textview54);
		html = findViewById(R.id.html);
		save = findViewById(R.id.save);
		colors = findViewById(R.id.colors);
		textview28 = findViewById(R.id.textview28);
		rds = findViewById(R.id.rds);
		seekbar1 = findViewById(R.id.seekbar1);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		prm = new AlertDialog.Builder(this);
		testColor = new AlertDialog.Builder(this);
		info = new AlertDialog.Builder(this);
		
		textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().remove("colorcode").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Default Theme Enabled ");
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#E3F2FD").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#E8EAF6").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#EDE7F6").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#F3E5F5").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FCE4EC").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FFEBEE").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FFFFFF").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FBE9E7").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FFF3E0").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FFFDE7").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#F9FBE7").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#F1F8E9").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#E0F2F1").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#E0F7FA").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#E1F5FE").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FF8A80").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FF5252").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FF80AB").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FF4081").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#EA80FC").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#B388FF").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#7C4DFF").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#80D8FF").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#18FFFF").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#A7FFEB").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#64FFDA").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#1DE9B6").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#B9F6CA").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#CCFF90").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#B2FF59").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FF9E80").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#B2FF59").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#76FF03").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#F4FF81").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview48.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		textview48.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#EEFF41").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#C6FF00").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview50.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FFFF8D").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		textview51.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				set.edit().putString("colorcode", "#FFFF00").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
				_RefreshSample();
			}
		});
		
		html.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.length() > 6) {
					html.setText("");
					SketchwareUtil.showMessage(getApplicationContext(), "There must be a 6 Digit HTML code");
				}
				else {
					
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		save.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (html.getText().toString().length() == 6) {
					testColor.setTitle("𝗖𝘂𝘀𝘁𝗼𝗺 𝗖𝗼𝗹𝗼𝗿");
					testColor.setMessage(" You can use this Color ");
					testColor.setIcon(R.drawable.thumb);
					testColor.setPositiveButton("Save", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							set.edit().putString("colorcode", "#".concat(html.getText().toString())).commit();
							SketchwareUtil.showMessage(getApplicationContext(), "Theme Changed");
							_RefreshSample();
						}
					});
					testColor.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					final AlertDialog testColortestColor = testColor.create();
					testColortestColor.show();
					try {
						String colorCode = "#".concat(html.getText().toString());
						int color = Color.parseColor(colorCode);
						
						String radiusString = "20";
						int radius = Integer.parseInt(radiusString);
						
						((TextView) testColortestColor.findViewById(android.R.id.message)).setBackground(new GradientDrawable() {
							    public GradientDrawable getIns(int a, int b) {
								        setCornerRadius(a);
								        setColor(b);
								        return this;
								    }
						}.getIns(radius, color));
						
					} catch (Exception e) {
						_ERROR("Wrong Color code entered");
						testColortestColor.dismiss();
					}
				}
				else {
					html.setText("");
					SketchwareUtil.showMessage(getApplicationContext(), "There must be a 6 Digit HTML code");
				}
			}
		});
		
		colors.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Pro-Lite/wiki/Color-Codes"));
				startActivity(i);
			}
		});
		
		rds.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				if (_progressValue == 0) {
					set.edit().putString("radius", "20").commit();
					rds.setText("Default");
				}
				else {
					set.edit().putString("radius", String.valueOf((long)(_progressValue))).commit();
					rds.setText(String.valueOf((long)(_progressValue)));
				}
				_RefreshSample();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
	}
	
	private void initializeLogic() {
		if (set.getString("radius", "").length() > 0) {
			seekbar1.setProgress((int)Double.parseDouble(set.getString("radius", "")));
		}
		else {
			set.edit().putString("radius", "20").commit();
		}
		html.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)15, (int)3, 0xFFE0E0E0, Color.TRANSPARENT));
		save.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFC6FF00));
		header.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFC6FF00));
		setTitle("𝗧𝗵𝗲𝗺𝗲 𝗠𝗮𝗻𝗮𝗴𝗲𝗿");
	}
	
	public void _RefreshSample() {
		if (!(set.getString("colorcode", "").length() > 1)) {
			samplebt2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8F5E9));
		}
		else {
			try {
				String colorCode = set.getString("colorcode", "");
				int color = Color.parseColor(colorCode);
				
				String radiusString = set.getString("radius", "");
				int radius = Integer.parseInt(radiusString);
				
				samplebt2.setBackground(new GradientDrawable() {
					    public GradientDrawable getIns(int a, int b) {
						        setCornerRadius(a);
						        setColor(b);
						        return this;
						    }
				}.getIns(radius, color));
				
			} catch (Exception e) {
				 
			}
		}
		if (!(set.getString("colorcode", "").length() > 1)) {
			samplebt.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8F5E9));
		}
		else {
			try {
				String colorCode = set.getString("colorcode", "");
				int color = Color.parseColor(colorCode);
				
				String radiusString = set.getString("radius", "");
				int radius = Integer.parseInt(radiusString);
				
				samplebt.setBackground(new GradientDrawable() {
					    public GradientDrawable getIns(int a, int b) {
						        setCornerRadius(a);
						        setColor(b);
						        return this;
						    }
				}.getIns(radius, color));
				
			} catch (Exception e) {
				 
			}
		}
	}
	
	
	public void _require_premium() {
		prm.setTitle("🧩 𝗥𝗲𝗾𝘂𝗶𝗿𝗲 𝗣𝗿𝗲𝗺𝗶𝘂𝗺");
		prm.setMessage("This is a premium feature \nPurchase premium to use ");
		prm.setPositiveButton("🛸 𝐆𝐞𝐭 𝐏𝐫𝐞𝐦𝐢𝐮𝐦", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), PremiumActivity.class);
				startActivity(i);
			}
		});
		prm.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		prm.create().show();
	}
	
	
	public void _Info_or_Help(final String _Title, final String _Msg) {
		info.setTitle(_Title);
		info.setMessage(_Msg);
		info.setIcon(R.drawable.info_1);
		info.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		info.create().show();
	}
	
	
	public void _ERROR(final String _Error) {
		info.setTitle("𝗘𝗿𝗿𝗼𝗿");
		info.setMessage(_Error);
		info.setIcon(R.drawable.icon_1);
		info.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		final AlertDialog infoinfo = info.create();
		infoinfo.show();
		 
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