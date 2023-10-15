package cleaner.lite.pro;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
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
import android.widget.Button;
import android.widget.EditText;
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

public class PremiumActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private String GetRandomWords = "";
	private String RandomWords = "";
	private String decrypted = "";
	private String activationKey = "";
	private String Pcoder = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout finalPremium;
	private Button features;
	private Button purchase;
	private LinearLayout linear11;
	private Button Helper;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextView result;
	private ImageView imageview2;
	private HorizontalScrollView hscroll2;
	private TextView output;
	private TextView site;
	private TextView github;
	private TextView codetxt;
	private TextView code;
	private Button copycode;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private Button codeactivator;
	private HorizontalScrollView hscroll1;
	private TextView activation_code_paster;
	private EditText activationCode;
	
	private AlertDialog.Builder d1;
	private AlertDialog.Builder d2;
	private AlertDialog.Builder d3;
	private Intent web = new Intent();
	private TimerTask t;
	private SharedPreferences premium;
	private AlertDialog.Builder soon;
	private SharedPreferences set;
	private AlertDialog.Builder onesteppay;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.premium);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		finalPremium = findViewById(R.id.finalPremium);
		features = findViewById(R.id.features);
		purchase = findViewById(R.id.purchase);
		linear11 = findViewById(R.id.linear11);
		Helper = findViewById(R.id.Helper);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		result = findViewById(R.id.result);
		imageview2 = findViewById(R.id.imageview2);
		hscroll2 = findViewById(R.id.hscroll2);
		output = findViewById(R.id.output);
		site = findViewById(R.id.site);
		github = findViewById(R.id.github);
		codetxt = findViewById(R.id.codetxt);
		code = findViewById(R.id.code);
		copycode = findViewById(R.id.copycode);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		codeactivator = findViewById(R.id.codeactivator);
		hscroll1 = findViewById(R.id.hscroll1);
		activation_code_paster = findViewById(R.id.activation_code_paster);
		activationCode = findViewById(R.id.activationCode);
		d1 = new AlertDialog.Builder(this);
		d2 = new AlertDialog.Builder(this);
		d3 = new AlertDialog.Builder(this);
		premium = getSharedPreferences("premium", Activity.MODE_PRIVATE);
		soon = new AlertDialog.Builder(this);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		onesteppay = new AlertDialog.Builder(this);
		
		features.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d1.setTitle("🛸 𝐏𝐫𝐞𝐦𝐢𝐮𝐦 𝐅𝐞𝐚𝐭𝐮𝐫𝐞𝐬");
				d1.setMessage("▪️ 𝗗𝗮𝗶𝗹𝘆 𝗰𝗹𝗲𝗮𝗻𝗲𝗿 (Enhanced)\n▪️ 𝗖𝗮𝗰𝗵𝗲 𝗧𝗿𝗶𝗺𝗺𝗲𝗿 \n▪️ 𝗖𝘂𝘀𝘁𝗼𝗺 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\n▪️ 𝗠𝘂𝗹𝘁𝗶-𝗨𝘀𝗲𝗿 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\n▪️ 𝗦𝗺𝗮𝗿𝘁 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\n▪️ WhatsApp Full Tools\n▪️ Custom Multi-user directories\n▪️ Custom /data cleaner support\n▪️ Dynamic Actions\n▪️ MultiUser EmptyFolder Cleaner\n▪️ Themes\n▪️ Usage in All Options soon\n▪️ Lucky Patcher Cleaner\n▪️3X Speed \n▪️ 𝗔𝗹𝗹 𝗨𝗽𝗰𝗼𝗺𝗶𝗻𝗴 𝗙𝗲𝗮𝘁𝘂𝗿𝗲𝘀\nmore +++");
				d1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d1.create().show();
			}
		});
		
		purchase.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d3.setTitle("💸 𝗣𝘂𝗿𝗰𝗵𝗮𝘀𝗲 𝗣𝗿𝗲𝗺𝗶𝘂𝗺");
				d3.setMessage("𝑷𝒓𝒊𝒄𝒆 :  𝟯$\n\n𝐏𝐮𝐫𝐜𝐡𝐚𝐬𝐞 𝐏𝐫𝐞𝐦𝐢𝐮𝐦 𝐢𝐧 𝐒𝐢𝐦𝐩𝐥𝐞 𝐒𝐭𝐞𝐩𝐬\n••••••••••••••••••••••••••••••••••••••••••\n𝟏. Pay on Helper app or Bot\n••••••••••••••••••••••••••••••••••••••••••\n𝟐. Fill Forum in Helper app or Bot\n••••••••••••••••••••••••••••••••••••••••••\n𝟑. Get Your Activation Key\n••••••••••••••••••••••••••••••••••••••••••\nEnter The Activation Code &  Enjoy\n");
				d3.setPositiveButton("⬇️ 𝐃𝐨𝐰𝐧𝐥𝐨𝐚𝐝 𝐇𝐞𝐥𝐩𝐞𝐫 𝐀𝐩𝐩", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						web.setAction(Intent.ACTION_VIEW);
						web.setData(Uri.parse("https://github.com/araafroyall/Cleaner.Lite.Helper/releases/download/Latest/Cleaner.Lite.Helper.Latest.apk"));
						startActivity(web);
					}
				});
				d3.setNegativeButton("🌀 𝐓𝐞𝐥𝐞𝐠𝐫𝐚𝐦 bot", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						web.setAction(Intent.ACTION_VIEW);
						web.setData(Uri.parse("https://t.me/Cleaner_Lite_Robot"));
						startActivity(web);
					}
				});
				d3.setNeutralButton("Paypal", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_paypal();
					}
				});
				d3.create().show();
			}
		});
		
		Helper.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d3.setTitle("🧩 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝗟𝗶𝘁𝗲 𝗛𝗲𝗹𝗽𝗲𝗿");
				d3.setMessage("To maintain Cleaner lite Pro Size and Offline working All Additional Functions are shifted to Helper App\n𝐈𝐭 𝐈𝐧𝐜𝐥𝐮𝐝𝐞\n• Premium , Payment Methods, Feedback, bug report, Directory Submission, Forums etc.\n\n𝑫𝒐𝒘𝒏𝒍𝒐𝒂𝒅 𝑨𝒑𝒑 or Use Telegram Bot");
				d3.setPositiveButton("🌀 𝐓𝐞𝐥𝐞𝐠𝐫𝐚𝐦 CHANNEL", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						web.setAction(Intent.ACTION_VIEW);
						web.setData(Uri.parse("https://t.me/cleanerprolite"));
						startActivity(web);
					}
				});
				d3.setNegativeButton("🌎 𝐆𝐢𝐭𝐡𝐮𝐛", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						web.setAction(Intent.ACTION_VIEW);
						web.setData(Uri.parse("https://github.com/araafroyall/Cleaner.Lite.Helper"));
						startActivity(web);
					}
				});
				d3.setNeutralButton("⬇️ 𝐃𝐢𝐫𝐞𝐜𝐭 𝐃𝐨𝐰𝐧𝐥𝐨𝐚𝐝", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						web.setAction(Intent.ACTION_VIEW);
						web.setData(Uri.parse("https://github.com/araafroyall/Cleaner.Lite.Helper/releases/download/Latest/Cleaner.Lite.Helper.Latest.apk"));
						startActivity(web);
					}
				});
				d3.create().show();
			}
		});
		
		result.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		site.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				web.setAction(Intent.ACTION_VIEW);
				web.setData(Uri.parse("https://t.me/Cleaner_Lite_Robot"));
				startActivity(web);
			}
		});
		
		github.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				web.setAction(Intent.ACTION_VIEW);
				web.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Pro-Lite"));
				startActivity(web);
			}
		});
		
		code.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", code.getText().toString()));
				SketchwareUtil.showMessage(getApplicationContext(), "📋 Copied PurchaseCode");
			}
		});
		
		copycode.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (code.getText().toString().length() == 8) {
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", code.getText().toString()));
					if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).equals(code.getText().toString())) {
						SketchwareUtil.showMessage(getApplicationContext(), "📋 Copied Purchase Code to Clipboard");
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "⚠️ Something went Wrong or Clipboard permission denied");
					}
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "⚠️ Something went Wrong");
				}
			}
		});
		
		codeactivator.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_premium_Activator();
			}
		});
		
		activation_code_paster.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("6270")) {
					activationCode.setText(String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "❗ Not a Valid Activation Code in Clipboard");
				}
			}
		});
		
		activationCode.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("🚀 𝐂𝐥𝐞𝐚𝐧𝐞𝐫 𝐥𝐢𝐭𝐞 : Additional");
		_theme1();
		_generate_purchasecode();
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		if (premium.getString("purchased", "").equals("1")) {
			
			linear8.setVisibility(View.GONE);
			purchase.setVisibility(View.GONE);
			
		}
		else {
			finalPremium.setVisibility(View.GONE);
		}
	}
	public void _theme1() {
		codeactivator.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFF48FB1));
		features.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF64FFDA));
		purchase.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFFFFFF00));
		Helper.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFFFFFF00));
		linear9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFF00));
		site.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF64FFDA));
		github.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF64FFDA));
	}
	
	
	public void _generate_purchasecode() {
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (code.getText().toString().equals("GettingCode")) {
							RandomWords = "1234567890";
							GetRandomWords = "";
							for (int i = 0; i < 8; i++) {
								GetRandomWords = GetRandomWords + RandomWords.charAt(new java.util.Random().nextInt(RandomWords.length()));
							}
							code.setText(GetRandomWords);
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "⚠️⚠️⚠️ Something Error");
						}
					}
				});
			}
		};
		_timer.schedule(t, (int)(500));
	}
	
	
	public void _LibEncryptedDecrypted() {
	}
	private javax.crypto.SecretKey generateKey(String pwd) throws Exception {
		
		final java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
		
		byte[] b = pwd.getBytes("UTF-8");
		
		digest.update(b,0,b.length);
		
		byte[] key = digest.digest();
		
		javax.crypto.spec.SecretKeySpec sec = new javax.crypto.spec.SecretKeySpec(key, "AES");
		
		return sec;
	}
	
	
	public void _DecryptedStringKey(final String _string, final String _key) {
		try {
			
			javax.crypto.spec.SecretKeySpec key = (javax.crypto.spec.SecretKeySpec) generateKey(_key);
			
			javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("AES");
			
			c.init(javax.crypto.Cipher.DECRYPT_MODE,key);
			
			byte[] decode = android.util.Base64.decode(_string,android.util.Base64.DEFAULT);
			
			byte[] decval = c.doFinal(decode);
			
			decrypted = new String(decval);
			
		} catch (Exception ex) {
		}
	}
	
	
	public void _premium_Activator() {
		d1.setTitle("⚠️ 𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
		d1.setMessage("Something went wrong . please update app to latest version");
		d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d1.create().show();
	}
	
	
	public void _ComingSoon() {
		soon.setTitle("👨‍💻 𝗖𝗼𝗺𝗶𝗻𝗴 𝗦𝗼𝗼𝗻 ...");
		soon.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		soon.create().show();
	}
	
	
	public void _paypal() {
		onesteppay.setTitle("💲𝗣𝘂𝗿𝗰𝗵𝗮𝘀𝗲 by PayPal");
		onesteppay.setMessage("\n1. Pay or Send 3.5$ on Paypal \n     -----------------------------------------\n2. Send Payment Screenshot to\n    Developer Telegram.\n     ------------------------------------------\n3. Get Activation Key \n     ------------------------------------------\n\nFor more payment options (BTC, Upi, Crypto) Please use Helper App or Bot");
		onesteppay.setPositiveButton("ok", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		onesteppay.setNegativeButton("👨‍💻", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				web.setAction(Intent.ACTION_VIEW);
				web.setData(Uri.parse("https://t.me/AraafRoyall"));
				startActivity(web);
			}
		});
		LinearLayout vie = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));/*This block created by SKK*/}};
		        
		vie.setOrientation(LinearLayout.VERTICAL);
		/*this block created by skk*/
		TextView tv1 = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));/*This block created by SKK*/}};
		        
		tv1.setText(" 📋 Copy Paypal Gmail");
		tv1.setTextColor(0xFFF50057);
		tv1.setTextSize((int)14);
		tv1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFF8D));
		vie.addView(tv1);
		TextView tv3 = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));/*This block created by SKK*/}};
		        
		tv3.setText(" ");
		vie.addView(tv3);
		TextView tv2 = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));/*This block created by SKK*/}};
		        
		tv2.setText(" 📋 Copy Developer Telegram Username");
		tv2.setTextColor(0xFF000000);
		tv2.setTextSize((int)14);
		tv2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFB9F6CA));
		vie.addView(tv2);
		tv1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "araaafroyalls@gmail.com"));
				if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).equals("araaafroyalls@gmail.com")) {
					SketchwareUtil.showMessage(getApplicationContext(), "📋 Copied");
				}
				else {
					d1.setTitle("⚠️ 𝗖𝗼𝗽𝘆 𝗙𝗮𝗶𝗹𝗲𝗱");
					d1.setMessage("Please Send 3.5$ to \naraaafroyalls@gmail.com");
					d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					d1.create().show();
				}
			}
		});
		tv2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", " @AraafRoyall"));
				if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).equals(" @AraafRoyall")) {
					SketchwareUtil.showMessage(getApplicationContext(), "📋 Copied");
				}
				else {
					d1.setTitle("⚠️ 𝗖𝗼𝗽𝘆 𝗙𝗮𝗶𝗹𝗲𝗱");
					d1.setMessage("Contact Directly by This Telegram Username \n\n@AraafRoyall");
					d1.setPositiveButton("👨‍💻", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							web.setAction(Intent.ACTION_VIEW);
							web.setData(Uri.parse("https://t.me/AraafRoyall"));
							startActivity(web);
						}
					});
					d1.create().show();
				}
			}
		});
		onesteppay.setView(vie);
		/*this block created by skk*/
		onesteppay.create().show();
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