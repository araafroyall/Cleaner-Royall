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
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class CompatibilityActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private String compatible = "";
	private String rootacess = "";
	private String rmCheck = "";
	private String FstrimCheck = "";
	private String FindCheck = "";
	private String duCheck = "";
	private String textToType = "";
	
	private LinearLayout header;
	private TextView Result;
	private Button checker;
	private LinearLayout outputt;
	private ScrollView vscroll1;
	private ImageView imageview3;
	private TextView headL;
	private ImageView imageview2;
	private HorizontalScrollView hscroll1;
	private TextView output;
	private LinearLayout later;
	private TextView nouse;
	private TextView affects;
	private TextView nousee;
	private TextView solutions;
	
	private TimerTask t;
	private AlertDialog.Builder d3;
	private AlertDialog.Builder d2;
	private Intent web = new Intent();
	private SharedPreferences set;
	private AlertDialog.Builder info;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.compatibility);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		header = findViewById(R.id.header);
		Result = findViewById(R.id.Result);
		checker = findViewById(R.id.checker);
		outputt = findViewById(R.id.outputt);
		vscroll1 = findViewById(R.id.vscroll1);
		imageview3 = findViewById(R.id.imageview3);
		headL = findViewById(R.id.headL);
		imageview2 = findViewById(R.id.imageview2);
		hscroll1 = findViewById(R.id.hscroll1);
		output = findViewById(R.id.output);
		later = findViewById(R.id.later);
		nouse = findViewById(R.id.nouse);
		affects = findViewById(R.id.affects);
		nousee = findViewById(R.id.nousee);
		solutions = findViewById(R.id.solutions);
		d3 = new AlertDialog.Builder(this);
		d2 = new AlertDialog.Builder(this);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		info = new AlertDialog.Builder(this);
		
		checker.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				outputt.setVisibility(View.INVISIBLE);
				later.setVisibility(View.INVISIBLE);
				Result.setText("• 𝐒𝐭𝐚𝐫𝐭𝐢𝐧𝐠 𝐂𝐡𝐞𝐜𝐤");
				Result.setTextColor(0xFF000000);
				checker.setVisibility(View.GONE);
				_Check("su", "\n✔️ Check 1 Passed", "\n✖️ Check 1. Failed");
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("rm", "\n✔️ Check 2 Passed", "\n✖️ Check 2 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(100));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("fstrim", "\n✔️ Check 3 Passed", "\n✖️ Check 3 Failed ");
							}
						});
					}
				};
				_timer.schedule(t, (int)(200));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("find", "\n✔️ Check 4 Passed", "\n✖️ Check 4 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(300));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("du", "\n✔️ Check 5 Passed", "\n✖️ Check 5 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(400));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("pm", "\n✔️ Check 6 Passed", "\n✖️ Check 6 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(500));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("getenforce", "\n✔️ Check 7 Passed", "\n✖️ Check 7 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(600));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("setenforce", "\n✔️ Check 8 Passed", "\n✖️ Check 8 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(700));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("echo", "\n✔️ Check 9 Passed", "\n✖️ Check 9 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(800));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("nohup", "\n✔️ Check 10 Passed", "\n✖️ Check 10 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(900));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("mkdir", "\n✔️ Check 11 Passed", "\n✖️ Check 11 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(1000));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("touch", "\n✔️ Check 12 Passed", "\n✖️ Check 12 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(1100));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_Check("cat", "\n✔️ Check 13 Passed", "\n✖️ Check 13 Failed");
							}
						});
					}
				};
				_timer.schedule(t, (int)(1200));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								outputt.setVisibility(View.VISIBLE);
								if (Result.getText().toString().contains("Failed")) {
									later.setVisibility(View.VISIBLE);
									output.setTextColor(0xFFD50000);
									imageview2.setImageResource(R.drawable.verified_2);
									output.setText("𝗬𝗼𝘂𝗿 𝗗𝗲𝘃𝗶𝗰𝗲 𝗶𝘀 𝗡𝗢𝗧 𝗙𝘂𝗹𝗹𝘆 𝗖𝗼𝗺𝗽𝗮𝘁𝗶𝗯𝗹𝗲");
									_NoSupport("1. Failed", "\n• Root Acess Not Found \n• This App can't work without Root Permission");
									_NoSupport("2 Failed", "\n• \"rm\" filesystem NOT Found in your device /system/bin\nThe app will not work properly without this");
									_NoSupport("3 Failed", "\n• \"fstrim\" filesystem NOT Found in your device /system/xbin\n'Cache & Data' Fstrim option will not work without this");
									_NoSupport("4 Failed", "\n• \"Find\" filesystem not Found in Your Device /system/bin\n'Cache Trim , Logs Cleaner, smart cleaner , Temporary files cleaner , Etc ' will not work without this ");
									_NoSupport("5 Failed", "\n• \"du\" filesystem NOT Found in your device /system/bin\nSize or Storage Usage Calculation may not work on you device");
									_NoSupport("6 Failed", "\n• \"Package Manager\" NOT Found in your device.\n Clear data of apps will not work without this");
									_NoSupport("7 Failed", "\n• \"GetEnforce\" filesystem NOT Found in your device /system/bin\n You will not get SELinux Status without this");
									_NoSupport("8 Failed", "\n• \"SetEnforce\" filesystem NOT Found in your device /system/bin\n You can not change SELinux Status without this");
									_NoSupport("9 Failed", "\n• \"echo\" not found in your system. Prevention of obb folder will not work");
									_NoSupport("10 Failed", "\n• \"nohup\" filesystem NOT Found in your device /system/bin\n You can not use Magisk Module for Cleaning in background");
									_NoSupport("11 Failed", "\n• \"mkdir\" not found in your system. \nMany options will not work without this.");
									_NoSupport("12 Failed", "\n• \"touch\" not found in your system. \nSome storage calculation will not work without this");
									_NoSupport("13 Failed", "\n• \"cat\" not found in your system. \nMagisk Module duration setting can't work without this");
									try {
										    String command = "su"; 
										    Runtime.getRuntime().exec(command);
										 
									} catch (Exception e) {
										solutions.setText(solutions.getText().toString().concat("\n   • Root Your Device by SuperUser or Magisk or KernalSu"));
										info.setTitle("No Root Acess Found");
										info.setMessage("This App Can't work without Root Acess");
										info.setIcon(R.drawable.disagree);
										info.setPositiveButton("OK", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
												
											}
										});
										info.create().show();
									}
									
									if (Result.getText().toString().contains("Failed")) {
										solutions.setText(solutions.getText().toString().concat("\n   • Download & Install 𝗟𝗮𝘁𝗲𝘀𝘁 𝗕𝘂𝘀𝘆𝗯𝗼𝘅 manually to Make your device Fully Compatible with \"Cleaner Lite Pro\"").replaceFirst("\n", ""));
									}
								}
								else {
									imageview2.setImageResource(R.drawable.verified_1);
									final String textToType = "𝗖𝗼𝗻𝗴𝗿𝗮𝘁𝘂𝗹𝗮𝘁𝗶𝗼𝗻𝘀... 𝗬𝗼𝘂𝗿 𝗗𝗲𝘃𝗶𝗰𝗲 𝗶𝘀 𝗙𝘂𝗹𝗹𝘆 𝗖𝗼𝗺𝗽𝗮𝘁𝗶𝗯𝗹𝗲";
									final int[] charIndex = {0};
									
									final Handler handler = new Handler();
									handler.postDelayed(new Runnable() {
										    @Override
										    public void run() {
											        output.setText(textToType.substring(0, charIndex[0]++));
											        if (charIndex[0] <= textToType.length()) {
												            handler.postDelayed(this, 5);
												        }
											    }
									}, 100);
									output.setTextColor(0xFF000000);
								}
							}
						});
					}
				};
				_timer.schedule(t, (int)(1300));
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("📲 𝗖𝗼𝗺𝗽𝗮𝘁𝗶𝗯𝗶𝗹𝗶𝘁𝘆");
		checker.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFC8E6C9));
		outputt.setVisibility(View.INVISIBLE);
		later.setVisibility(View.INVISIBLE);
		if (set.getString("Animation", "").equals("1")) {
			final String textToType = headL.getText().toString();
			final int[] charIndex = {0};
			
			final Handler handler = new Handler();
			handler.postDelayed(new Runnable() {
				    @Override
				    public void run() {
					        headL.setText(textToType.substring(0, charIndex[0]++));
					        if (charIndex[0] <= textToType.length()) {
						            handler.postDelayed(this, 3);
						        }
					    }
			}, 100);
		}
		else {
			
		}
		header.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFC6FF00));
	}
	
	public void _Check(final String _cmd, final String _found, final String _Else) {
		try {
			    String command = _cmd; 
			    Runtime.getRuntime().exec(command);
			Result.setText(Result.getText().toString().concat(_found));
		} catch (Exception e) {
			Result.setText(Result.getText().toString().concat(_Else));
		}
		
	}
	
	
	public void _NotSupport(final String _text) {
		affects.setText(affects.getText().toString().concat(_text).replaceFirst("\n", ""));
	}
	
	
	public void _NoSupport(final String _failed, final String _output) {
		if (Result.getText().toString().contains(_failed)) {
			affects.setText(_output);
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