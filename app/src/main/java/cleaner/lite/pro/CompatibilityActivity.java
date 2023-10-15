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
	
	private TextView help;
	private TextView Result;
	private Button checker;
	private LinearLayout outputt;
	private ScrollView vscroll1;
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
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.compatibility);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		help = findViewById(R.id.help);
		Result = findViewById(R.id.Result);
		checker = findViewById(R.id.checker);
		outputt = findViewById(R.id.outputt);
		vscroll1 = findViewById(R.id.vscroll1);
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
		
		checker.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				outputt.setVisibility(View.INVISIBLE);
				later.setVisibility(View.INVISIBLE);
				Result.setText("• 𝐒𝐭𝐚𝐫𝐭𝐢𝐧𝐠 𝐂𝐡𝐞𝐜𝐤");
				try {
					    String command = "su"; 
					    Runtime.getRuntime().exec(command);
					Result.setTextColor(0xFF000000);
					Result.setText(Result.getText().toString().concat("\n✔️ Check 1 Passed"));
					rootacess = "";
				} catch (Exception e) {
					Result.setTextColor(0xFFD50000);
					Result.setText(Result.getText().toString().concat("\n✖️ Check 1 Failed"));
					rootacess = "1";
				}
				
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								try {
									    String command = "rm"; 
									    Runtime.getRuntime().exec(command);
									Result.setTextColor(0xFF000000);
									Result.setText(Result.getText().toString().concat("\n✔️ Check 2 Passed"));
									rmCheck = "";
								} catch (Exception e) {
									rmCheck = "1";
									Result.setTextColor(0xFFD50000);
									Result.setText(Result.getText().toString().concat("\n✖️ Check 2 Failed "));
								}
								
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
								try {
									    String command = "fstrim"; 
									    Runtime.getRuntime().exec(command);
									Result.setTextColor(0xFF000000);
									Result.setText(Result.getText().toString().concat("\n✔️ Check 3 Passed"));
									FstrimCheck = "";
								} catch (Exception e) {
									FstrimCheck = "1";
									Result.setTextColor(0xFFD50000);
									Result.setText(Result.getText().toString().concat("\n✖️ Check 3 Failed "));
								}
								
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
								try {
									    String command = "find"; 
									    Runtime.getRuntime().exec(command);
									Result.setTextColor(0xFF000000);
									Result.setText(Result.getText().toString().concat("\n✔️ Check 4 Passed"));
									FindCheck = "";
								} catch (Exception e) {
									FindCheck = "1";
									Result.setText(Result.getText().toString().concat("\n✖️ Check 4 Failed"));
									Result.setTextColor(0xFFD50000);
								}
								
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
								try {
									    String command = "du"; 
									    Runtime.getRuntime().exec(command);
									Result.setTextColor(0xFF000000);
									Result.setText(Result.getText().toString().concat("\n✔️ Check 5 Passed"));
									duCheck = "";
								} catch (Exception e) {
									duCheck = "1";
									Result.setText(Result.getText().toString().concat("\n✖️ Check 5 Failed"));
									Result.setTextColor(0xFFD50000);
								}
								
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
								checker.setVisibility(View.GONE);
								outputt.setVisibility(View.VISIBLE);
								if (duCheck.equals("1") || (rootacess.equals("1") || (FindCheck.equals("1") || (rmCheck.equals("1") || FstrimCheck.equals("1"))))) {
									later.setVisibility(View.VISIBLE);
									output.setTextColor(0xFFD50000);
									imageview2.setImageResource(R.drawable.verifier_2);
									output.setText("𝗬𝗼𝘂𝗿 𝗗𝗲𝘃𝗶𝗰𝗲 𝗶𝘀 𝗡𝗢𝗧 𝗙𝘂𝗹𝗹𝘆 𝗖𝗼𝗺𝗽𝗮𝘁𝗶𝗯𝗹𝗲");
									t = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													if (rootacess.equals("1")) {
														affects.setText(affects.getText().toString().concat("\n• Root Acess Not Found \n• This App can't work without Root Permission"));
													}
													if (FindCheck.equals("1")) {
														affects.setText(affects.getText().toString().concat("\n• \"Find\" filesystem not Found in Your Device /system/bin\n'Cache Trim , Logs Cleaner, Temporary files cleaner , Etc ' will not work without this "));
													}
													if (rmCheck.equals("1")) {
														affects.setText(affects.getText().toString().concat("\n• \"rm\" filesystem NOT Found in your device /system/bin\nThe app will not work properly without this"));
													}
													if (FstrimCheck.equals("1")) {
														affects.setText(affects.getText().toString().concat("\n• \"fstrim\" filesystem NOT Found in your device /system/xbin\n'Cache & Data' Fstrim option will not work without this"));
													}
													if (rootacess.equals("1")) {
														solutions.setText(solutions.getText().toString().concat("\n   • Root Your Device by SuperUser or Magisk"));
													}
													if (duCheck.equals("1")) {
														solutions.setText(solutions.getText().toString().concat("\n• \"du\" filesystem NOT Found in your device /system/bin\nSize or Storage Usage Calculation may not work on you device"));
													}
													if (duCheck.equals("1") || (FindCheck.equals("1") || (rmCheck.equals("1") || FstrimCheck.equals("1")))) {
														solutions.setText(solutions.getText().toString().concat("\n   • Download & Install 𝗟𝗮𝘁𝗲𝘀𝘁 𝗕𝘂𝘀𝘆𝗯𝗼𝘅 manually to Make your device Fully Compitible with \"Cleaner Lite Pro\""));
													}
												}
											});
										}
									};
									_timer.schedule(t, (int)(1000));
								}
								else {
									imageview2.setImageResource(R.drawable.verifier_1);
									output.setText("𝗖𝗼𝗻𝗴𝗿𝗮𝘁𝘂𝗹𝗮𝘁𝗶𝗼𝗻𝘀... 𝗬𝗼𝘂𝗿 𝗗𝗲𝘃𝗶𝗰𝗲 𝗶𝘀 𝗙𝘂𝗹𝗹𝘆 𝗖𝗼𝗺𝗽𝗮𝘁𝗶𝗯𝗹𝗲");
									output.setTextColor(0xFF000000);
								}
							}
						});
					}
				};
				_timer.schedule(t, (int)(900));
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("📲 𝗖𝗼𝗺𝗽𝗮𝘁𝗶𝗯𝗶𝗹𝗶𝘁𝘆");
		help.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFF00));
		checker.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFF69F0AE));
		outputt.setVisibility(View.INVISIBLE);
		later.setVisibility(View.INVISIBLE);
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