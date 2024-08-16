package Cleaner.Royall;

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
	private String string = "";
	private String encrypted = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout finalPremium;
	private Button features;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private Button purchase;
	private LinearLayout PurchaseCode;
	private LinearLayout StringCode;
	private LinearLayout keyInput_Linear;
	private TextView result;
	private Button upgrade;
	private Button support;
	private ImageView vrfyprchs;
	private HorizontalScrollView hscroll2;
	private TextView output;
	private TextView site;
	private TextView github;
	private TextView restorebt;
	private TextView Helper;
	private TextView textview2;
	private TextView prmfrm;
	private TextView codetxt;
	private TextView code;
	private ImageView copy;
	private TextView codetext2;
	private HorizontalScrollView hscroll3;
	private ImageView copy2;
	private TextView stringg;
	private LinearLayout box;
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
	private AlertDialog.Builder ppr;
	private AlertDialog.Builder info;
	private AlertDialog.Builder restore;
	private AlertDialog.Builder upgdra;
	private AlertDialog.Builder prmnprm;
	private AlertDialog.Builder sprt;
	private Intent i = new Intent();
	private AlertDialog.Builder forum;
	private Intent form = new Intent();
	
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
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		purchase = findViewById(R.id.purchase);
		PurchaseCode = findViewById(R.id.PurchaseCode);
		StringCode = findViewById(R.id.StringCode);
		keyInput_Linear = findViewById(R.id.keyInput_Linear);
		result = findViewById(R.id.result);
		upgrade = findViewById(R.id.upgrade);
		support = findViewById(R.id.support);
		vrfyprchs = findViewById(R.id.vrfyprchs);
		hscroll2 = findViewById(R.id.hscroll2);
		output = findViewById(R.id.output);
		site = findViewById(R.id.site);
		github = findViewById(R.id.github);
		restorebt = findViewById(R.id.restorebt);
		Helper = findViewById(R.id.Helper);
		textview2 = findViewById(R.id.textview2);
		prmfrm = findViewById(R.id.prmfrm);
		codetxt = findViewById(R.id.codetxt);
		code = findViewById(R.id.code);
		copy = findViewById(R.id.copy);
		codetext2 = findViewById(R.id.codetext2);
		hscroll3 = findViewById(R.id.hscroll3);
		copy2 = findViewById(R.id.copy2);
		stringg = findViewById(R.id.stringg);
		box = findViewById(R.id.box);
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
		ppr = new AlertDialog.Builder(this);
		info = new AlertDialog.Builder(this);
		restore = new AlertDialog.Builder(this);
		upgdra = new AlertDialog.Builder(this);
		prmnprm = new AlertDialog.Builder(this);
		sprt = new AlertDialog.Builder(this);
		forum = new AlertDialog.Builder(this);
		
		features.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d1.setTitle("𝐏𝐫𝐞𝐦𝐢𝐮𝐦 𝐅𝐞𝐚𝐭𝐮𝐫𝐞𝐬");
				d1.setIcon(R.drawable.storage_2);
				d1.setMessage("Your Premium Key will work Forever for Your Device \n\n▪️ 𝗗𝗮𝗶𝗹𝘆 𝗰𝗹𝗲𝗮𝗻𝗲𝗿 (Enhanced)\n▪️ 𝗖𝗮𝗰𝗵𝗲 𝗧𝗿𝗶𝗺𝗺𝗲𝗿 \n▪️ 𝗖𝘂𝘀𝘁𝗼𝗺 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\n▪️ 𝗠𝘂𝗹𝘁𝗶-𝗨𝘀𝗲𝗿 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\n▪️ 𝗦𝗺𝗮𝗿𝘁 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\n▪️ WhatsApp Full Tools\n▪️ Custom Multi-user directories\n▪️ Custom /data cleaner support\n▪️ Mini Cleaner\n▪️ MultiUser EmptyFolder Cleaner\n▪️ OneTap Cleaner\n▪️ Battery Calibrate Revert\n▪️ Usage in All Options (soon)\n▪️ Lucky Patcher Cleaner\n▪️ Cleaning Templates\n▪️ 3X Speed \n▪️ 𝗔𝗹𝗹 𝗨𝗽𝗰𝗼𝗺𝗶𝗻𝗴 𝗙𝗲𝗮𝘁𝘂𝗿𝗲𝘀\nmore +++");
				d1.setPositiveButton("👑 𝐆𝐞𝐭 𝐏𝐫𝐞𝐦𝐢𝐮𝐦", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						purchase.performClick();
					}
				});
				d1.create().show();
			}
		});
		
		purchase.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		result.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		upgrade.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		support.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		site.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				web.setAction(Intent.ACTION_VIEW);
				web.setData(Uri.parse("https://t.me/CleanerRoyallBot"));
				startActivity(web);
			}
		});
		
		github.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				web.setAction(Intent.ACTION_VIEW);
				web.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Royall"));
				startActivity(web);
			}
		});
		
		restorebt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				restore.setIcon(R.drawable.storage_2);
				restore.setTitle("𝙍𝙚𝙨𝙩𝙤𝙧𝙚 𝙋𝙪𝙧𝙘𝙝𝙖𝙨𝙚");
				restore.setMessage("This Help you to Restore Premium , lost by Clear Data or Uninstall of this App");
				restore.setPositiveButton("🪐𝙍𝙚𝙨𝙩𝙤𝙧𝙚", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				restore.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				LinearLayout rstr = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
				rstr.setOrientation(LinearLayout.VERTICAL);
				TextView rstrbt = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				rstrbt.setText(" Click to Know More ");
				rstrbt.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFB2FF59));
				rstr.addView(rstrbt);
				((ViewGroup.MarginLayoutParams) rstrbt.getLayoutParams()).setMargins(70, 0, 0, 0);
				
				rstrbt.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "If your performed 'Factory Reset' \nUse Permanent Activation Key to Activate Premium again\nOr \nContact Developer on Telegram for Help\n\nDeveloper Telegram Username :\n@AraafRoyall");
					}
				});
				restore.setView(rstr);
				restore.create().show();
			}
		});
		
		Helper.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		prmfrm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PremiumForumActivity.class);
				startActivity(i);
				
			}
		});
		
		code.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (code.getText().toString().length() == 8) {
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", code.getText().toString()));
					if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).equals(code.getText().toString())) {
						SketchwareUtil.showMessage(getApplicationContext(), "📋 Purchase Code Copied to Clipboard");
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
		
		copy.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (code.getText().toString().length() == 8) {
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", code.getText().toString()));
					if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).equals(code.getText().toString())) {
						SketchwareUtil.showMessage(getApplicationContext(), "📋 Purchase Code Copied to Clipboard");
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
		
		codetext2.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				_generate_purchasecode();
				return true;
			}
		});
		
		codetext2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!stringg.getText().toString().equals("GettingCode")) {
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", stringg.getText().toString()));
					if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).equals(stringg.getText().toString())) {
						SketchwareUtil.showMessage(getApplicationContext(), "📋 String Copied to Clipboard");
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
		
		copy2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!stringg.getText().toString().equals("GettingCode")) {
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", stringg.getText().toString()));
					if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).equals(stringg.getText().toString())) {
						SketchwareUtil.showMessage(getApplicationContext(), "📋 String Copied to Clipboard");
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
		
		stringg.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!stringg.getText().toString().equals("GettingCode")) {
					((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", stringg.getText().toString()));
					if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).equals(stringg.getText().toString())) {
						SketchwareUtil.showMessage(getApplicationContext(), "📋 String Copied to Clipboard");
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
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		activation_code_paster.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("6270") || (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("6278") || String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("1211"))) {
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
		_Info_or_Help("Update Required", "Download Latest version to use Features");
		_theme1();
		
		Helper.setVisibility(View.INVISIBLE);
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		if (premium.getString("purchased", "").equals("1")) {
			purchase.setText("🤝 𝗦𝘂𝗽𝗽𝗼𝗿𝘁 𝗗𝗲𝘃𝗲𝗹𝗼𝗽𝗺𝗲𝗻𝘁");
			_Animation();
			keyInput_Linear.setVisibility(View.GONE);
			prmfrm.setVisibility(View.GONE);
			linear12.setVisibility(View.GONE);
		}
		else {
			finalPremium.setVisibility(View.GONE);
		}
		support.setVisibility(View.GONE);
		upgrade.setVisibility(View.GONE);
		
	}
	public void _theme1() {
		purchase.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFFFFFF00));
		site.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF64FFDA));
		github.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF64FFDA));
		restorebt.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF64FFDA));
		Helper.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF64FFDA));
		features.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF64FFDA));
		codeactivator.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFF48FB1));
		box.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFC6FF00));
		upgrade.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF4CAF50));
		support.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF4CAF50));
		prmfrm.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFFFFFF, 0xFF4CAF50));
		textview2.setVisibility(View.INVISIBLE);
	}
	
	
	public void _generate_purchasecode() {
		_Info_or_Help("Update Required", "Download Latest version to use Features");
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
		_Info_or_Help("Update Required", "Download Latest version to use Features");
	}
	
	
	public void _restore_purchase() {
		_Info_or_Help("Update Required", "Download Latest version to use Features");
	}
	
	
	public void _paypal() {
		onesteppay.setTitle("𝗣𝘂𝗿𝗰𝗵𝗮𝘀𝗲 by PayPal");
		onesteppay.setIcon(R.drawable.paypal_1);
		onesteppay.setMessage("\n1. Pay or Send 3.5 $ on Paypal \n     -----------------------------------------\n2. Send Payment Screenshot to\n    Developer Telegram @AraafRoyall\n     ------------------------------------------\n3. Get Activation Key \n     ------------------------------------------\nFor more payment options (BTC, Upi, Crypto) Please use Helper App or Bot");
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
		LinearLayout vie = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));}};
		vie.setOrientation(LinearLayout.VERTICAL);
		/*Comment*/
		TextView tv1 = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
		tv1.setText(" 📋 Copy Paypal Gmail");
		tv1.setTextColor(0xFFF50057);
		tv1.setTextSize((int)14);
		tv1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFF8D));
		vie.addView(tv1);
		TextView tv3 = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
		tv3.setText(" ");
		vie.addView(tv3);
		TextView tv2 = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
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
					d1.setTitle("𝗖𝗼𝗽𝘆 𝗙𝗮𝗶𝗹𝗲𝗱");
					d1.setIcon(R.drawable.info_2);
					d1.setMessage("Send 3.5$ to \naraaafroyalls@gmail.com");
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
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", " @AraafRoyall".trim()));
				if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).equals(" @AraafRoyall".trim())) {
					SketchwareUtil.showMessage(getApplicationContext(), "📋 Copied");
				}
				else {
					d1.setTitle("𝗖𝗼𝗽𝘆 𝗙𝗮𝗶𝗹𝗲𝗱");
					d1.setIcon(R.drawable.info_2);
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
		onesteppay.create().show();
	}
	
	
	public void _Animation() {
		if (set.getString("Animation", "").equals("1")) {
			final String textToType = "Congratulations... Premium is Activated";
			final int[] charIndex = {0};
			
			final Handler handler = new Handler();
			handler.postDelayed(new Runnable() {
				    @Override
				    public void run() {
					        output.setText(textToType.substring(0, charIndex[0]++));
					        if (charIndex[0] <= textToType.length()) {
						            handler.postDelayed(this, 10);
						        }
					    }
			}, 500);
		}
		else {
			output.setText("Congratulations... Premium is Activated");
		}
	}
	
	
	public void _ERROR(final String _Error) {
		d1.setTitle("𝗘𝗿𝗿𝗼𝗿");
		d1.setMessage(_Error);
		d1.setIcon(R.drawable.icon_1);
		d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d1.create().show();
	}
	
	
	public void _Errr() {
		if (result.getText().toString().contains("Permission denied")) {
			_ERROR("Root Permission Denied");
		}
		else {
			try {
				    String command = "su"; 
				    Runtime.getRuntime().exec(command);
				if (result.getText().toString().contains("prm")) {
					if (result.getText().toString().contains("prm npc")) {
						_ERROR("Premium Not Purchased");
					}
					if (result.getText().toString().contains("prm nvrfy")) {
						_ERROR("Premium not Verified");
					}
				}
				else {
					_ERROR("Something went Wrong");
				}
			} catch (Exception e) {
				_ERROR("Root Acess Not Found or Hidden");
			}
			
		}
		result.setText("");
	}
	
	
	public void _EncryptedStringKey(final String _string, final String _key) {
		try {
			
			javax.crypto.SecretKey key = generateKey(_key);
			
			javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("AES");
			
			c.init(javax.crypto.Cipher.ENCRYPT_MODE,key);
			
			byte[] encVal = c.doFinal(_string.getBytes());
			
			encrypted = android.util.Base64.encodeToString(encVal,android.util.Base64.DEFAULT);
			
		} catch (Exception ex) {
			
		}
	}
	
	
	public void _StringGenerator() {
		_Info_or_Help("Update Required", "Download Latest version to use Features");
	}
	
	
	public void _Activate_By_String() {
		_Info_or_Help("Update Required", "Download Latest version to use Features");
	}
	
	
	public void _Info_or_Help(final String _Title, final String _Msg) {
		info.setTitle(_Title);
		info.setMessage(_Msg);
		info.setIcon(R.drawable.information);
		info.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		info.create().show();
	}
	
	
	public void _Permanent_Purchase() {
		prmnprm.setTitle("𝗣𝗲𝗿𝗺𝗮𝗻𝗲𝗻𝘁 𝐏𝐫𝐞𝐦𝐢𝐮𝐦");
		prmnprm.setIcon(R.drawable.storage_2);
		prmnprm.setMessage("𝑷𝒓𝒊𝒄𝒆 :  𝟱$\n\nWhat is 𝗣𝗲𝗿𝗺𝗮𝗻𝗲𝗻𝘁 𝗣𝗿𝗲𝗺𝗶𝘂𝗺 ?\n••••••••••••••••••••••••••••••••••••••••••\nThis Permanent Premium Key can be used even after format your device or Change ROM.\n[The Permanent key is For forever]\n\n𝐓𝐡𝐞 𝐏𝐮𝐫𝐜𝐡𝐚𝐬𝐞 𝐏𝐫𝐨𝐜𝐞𝐝𝐮𝐫𝐞 𝐢𝐬 𝐬𝐚𝐦𝐞\nJust Price is 5$ for This.\n\n\n🧑‍💻 For Any Help, Directly contact Developer on Telegram @AraafRoyall ❂");
		prmnprm.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		LinearLayout prmnlay = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
		prmnlay.setOrientation(LinearLayout.VERTICAL);
		TextView prmntxt = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
		prmntxt.setText(" Click to Know More About this ");
		prmntxt.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFB2FF59));
		prmnlay.addView(prmntxt);
		((ViewGroup.MarginLayoutParams) prmntxt.getLayoutParams()).setMargins(70, 0, 0, 0);
		
		prmntxt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "𝑩𝒂𝒔𝒊𝒄 𝑷𝒓𝒆𝒎𝒊𝒖𝒎\n• It support Restore of Premium in case of Clear data or Re-Install.\n• It Not support Restore after format device or Change ROM .\n• In Basic 2 key will be provided in case of Format device.\n\n𝑷𝒆𝒓𝒎𝒂𝒏𝒆𝒏𝒕 𝑷𝒓𝒆𝒎𝒊𝒖𝒎\n• Its support Activation even after Format device or Change ROM.\n• It Also support restore in case of Clear data or Re-Install.\n• It will work Forever.\n\n𝐍𝐨𝐭𝐞 :\nKeep your Permanent Key at safe place to use in case of format or change ROM");
			}
		});
		prmnprm.setView(prmnlay);
		prmnprm.create().show();
	}
	
	
	public void _After_Purchased() {
		set.edit().remove("expiredd").commit();
		keyInput_Linear.setVisibility(View.GONE);
		finalPremium.setVisibility(View.VISIBLE);
		result.setText("");
		purchase.setText("🤝 𝗦𝘂𝗽𝗽𝗼𝗿𝘁 𝗗𝗲𝘃𝗲𝗹𝗼𝗽𝗺𝗲𝗻𝘁");
		prmfrm.setVisibility(View.GONE);
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