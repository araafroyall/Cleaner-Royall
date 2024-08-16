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

public class MainActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private String PremiumCheck = "";
	private String delvikSizer = "";
	private String sspnd = "";
	private String variable = "";
	private double secure = 0;
	private String dynumic = "";
	private String random = "";
	private String Random = "";
	private String decrypted = "";
	private String Runner = "";
	private String cmd = "";
	private String counter = "";
	private double welcome = 0;
	private String cancl = "";
	private String Empty = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout TopLayout;
	private TextView textview18;
	private LinearLayout linear21;
	private LinearLayout linear24;
	private LinearLayout linear10;
	private LinearLayout linear7;
	private LinearLayout linear30;
	private LinearLayout linear32;
	private LinearLayout linear34;
	private LinearLayout dailyclean;
	private LinearLayout linear2;
	private LinearLayout linear14;
	private LinearLayout linear13;
	private Button button23;
	private LinearLayout linear4;
	private TextView result;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private ImageView imageview12;
	private TextView textview12;
	private ImageView imageview13;
	private TextView textview13;
	private ImageView imageview14;
	private TextView textview14;
	private ImageView imageview15;
	private TextView textview16;
	private LinearLayout linear22;
	private LinearLayout wiperap;
	private ImageView imageview4;
	private TextView textview4;
	private ImageView imageview5;
	private TextView textview5;
	private LinearLayout LogCleanbt;
	private LinearLayout EmptyFolderBt;
	private ImageView imageview6;
	private TextView textview6;
	private ImageView imageview7;
	private TextView textview7;
	private LinearLayout cachetrimbt;
	private LinearLayout oatbt;
	private ImageView imageview8;
	private TextView textview8;
	private ImageView imageview9;
	private TextView textview9;
	private LinearLayout internalbt;
	private LinearLayout workbt;
	private ImageView imageview16;
	private TextView textview19;
	private ImageView imageview17;
	private TextView textview20;
	private LinearLayout linear31;
	private LinearLayout trashbt;
	private ImageView imageview18;
	private TextView textview21;
	private ImageView imageview19;
	private TextView textview22;
	private LinearLayout linear11;
	private LinearLayout linear33;
	private ImageView imageview20;
	private TextView textview23;
	private ImageView imageview21;
	private TextView textview24;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private ImageView imageview22;
	private TextView textview25;
	private ImageView imageview23;
	private TextView textview26;
	private ImageView imageview24;
	private TextView textview27;
	private Button button29;
	private Button help;
	private Button settings;
	private Button dynamicbutton;
	private Button additional;
	private Button button27;
	private Button feedback;
	
	private AlertDialog.Builder d;
	private AlertDialog.Builder n;
	private AlertDialog.Builder nnnn;
	private AlertDialog.Builder h;
	private AlertDialog.Builder clear;
	private AlertDialog.Builder new2;
	private AlertDialog.Builder feed;
	private Intent update = new Intent();
	private AlertDialog.Builder list;
	private AlertDialog.Builder onetime;
	private SharedPreferences ot;
	private TimerTask t;
	private AlertDialog.Builder changelog;
	private AlertDialog.Builder donate;
	private AlertDialog.Builder upi;
	private AlertDialog.Builder trx;
	private AlertDialog.Builder btc;
	private TimerTask check;
	private SharedPreferences off;
	private AlertDialog.Builder dd;
	private AlertDialog.Builder expire;
	private AlertDialog.Builder trim;
	private AlertDialog.Builder fix;
	private Intent sett = new Intent();
	private SharedPreferences set;
	private AlertDialog.Builder whatsappadvv;
	private AlertDialog.Builder wac;
	private AlertDialog.Builder dalvik;
	private AlertDialog.Builder oat;
	private AlertDialog.Builder viewstorage;
	private AlertDialog.Builder wiperapiii;
	private AlertDialog.Builder info;
	private AlertDialog.Builder multi;
	private AlertDialog.Builder enablefirst;
	private Intent whatsapp = new Intent();
	private AlertDialog.Builder d2;
	private AlertDialog.Builder d1;
	private AlertDialog.Builder d3;
	private Intent i = new Intent();
	private SharedPreferences premium;
	private AlertDialog.Builder prm;
	private SharedPreferences dir;
	private AlertDialog.Builder d2_1;
	private AlertDialog.Builder soon;
	private AlertDialog.Builder agree;
	private AlertDialog.Builder error;
	private AlertDialog.Builder tmp;
	private Intent a = new Intent();
	private Intent b = new Intent();
	private Intent c = new Intent();
	private TimerTask expired;
	private AlertDialog.Builder dynamic;
	private Intent chng = new Intent();
	private AlertDialog.Builder empty;
	private Intent download = new Intent();
	private AlertDialog.Builder Notice;
	private AlertDialog.Builder oatClean;
	private AlertDialog.Builder storage;
	private AlertDialog.Builder battery;
	private AlertDialog.Builder log;
	private AlertDialog.Builder Errar;
	private AlertDialog.Builder daily;
	private AlertDialog.Builder Temp;
	private AlertDialog.Builder custom;
	private AlertDialog.Builder dalvikk;
	private AlertDialog.Builder exp;
	private AlertDialog.Builder bt2;
	private AlertDialog.Builder lostdir;
	private AlertDialog.Builder Welcome;
	private RequestNetwork updatr;
	private RequestNetwork.RequestListener _updatr_request_listener;
	private AlertDialog.Builder submiting;
	private TimerTask canclr;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		TopLayout = findViewById(R.id.TopLayout);
		textview18 = findViewById(R.id.textview18);
		linear21 = findViewById(R.id.linear21);
		linear24 = findViewById(R.id.linear24);
		linear10 = findViewById(R.id.linear10);
		linear7 = findViewById(R.id.linear7);
		linear30 = findViewById(R.id.linear30);
		linear32 = findViewById(R.id.linear32);
		linear34 = findViewById(R.id.linear34);
		dailyclean = findViewById(R.id.dailyclean);
		linear2 = findViewById(R.id.linear2);
		linear14 = findViewById(R.id.linear14);
		linear13 = findViewById(R.id.linear13);
		button23 = findViewById(R.id.button23);
		linear4 = findViewById(R.id.linear4);
		result = findViewById(R.id.result);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		imageview12 = findViewById(R.id.imageview12);
		textview12 = findViewById(R.id.textview12);
		imageview13 = findViewById(R.id.imageview13);
		textview13 = findViewById(R.id.textview13);
		imageview14 = findViewById(R.id.imageview14);
		textview14 = findViewById(R.id.textview14);
		imageview15 = findViewById(R.id.imageview15);
		textview16 = findViewById(R.id.textview16);
		linear22 = findViewById(R.id.linear22);
		wiperap = findViewById(R.id.wiperap);
		imageview4 = findViewById(R.id.imageview4);
		textview4 = findViewById(R.id.textview4);
		imageview5 = findViewById(R.id.imageview5);
		textview5 = findViewById(R.id.textview5);
		LogCleanbt = findViewById(R.id.LogCleanbt);
		EmptyFolderBt = findViewById(R.id.EmptyFolderBt);
		imageview6 = findViewById(R.id.imageview6);
		textview6 = findViewById(R.id.textview6);
		imageview7 = findViewById(R.id.imageview7);
		textview7 = findViewById(R.id.textview7);
		cachetrimbt = findViewById(R.id.cachetrimbt);
		oatbt = findViewById(R.id.oatbt);
		imageview8 = findViewById(R.id.imageview8);
		textview8 = findViewById(R.id.textview8);
		imageview9 = findViewById(R.id.imageview9);
		textview9 = findViewById(R.id.textview9);
		internalbt = findViewById(R.id.internalbt);
		workbt = findViewById(R.id.workbt);
		imageview16 = findViewById(R.id.imageview16);
		textview19 = findViewById(R.id.textview19);
		imageview17 = findViewById(R.id.imageview17);
		textview20 = findViewById(R.id.textview20);
		linear31 = findViewById(R.id.linear31);
		trashbt = findViewById(R.id.trashbt);
		imageview18 = findViewById(R.id.imageview18);
		textview21 = findViewById(R.id.textview21);
		imageview19 = findViewById(R.id.imageview19);
		textview22 = findViewById(R.id.textview22);
		linear11 = findViewById(R.id.linear11);
		linear33 = findViewById(R.id.linear33);
		imageview20 = findViewById(R.id.imageview20);
		textview23 = findViewById(R.id.textview23);
		imageview21 = findViewById(R.id.imageview21);
		textview24 = findViewById(R.id.textview24);
		linear28 = findViewById(R.id.linear28);
		linear29 = findViewById(R.id.linear29);
		imageview22 = findViewById(R.id.imageview22);
		textview25 = findViewById(R.id.textview25);
		imageview23 = findViewById(R.id.imageview23);
		textview26 = findViewById(R.id.textview26);
		imageview24 = findViewById(R.id.imageview24);
		textview27 = findViewById(R.id.textview27);
		button29 = findViewById(R.id.button29);
		help = findViewById(R.id.help);
		settings = findViewById(R.id.settings);
		dynamicbutton = findViewById(R.id.dynamicbutton);
		additional = findViewById(R.id.additional);
		button27 = findViewById(R.id.button27);
		feedback = findViewById(R.id.feedback);
		d = new AlertDialog.Builder(this);
		n = new AlertDialog.Builder(this);
		nnnn = new AlertDialog.Builder(this);
		h = new AlertDialog.Builder(this);
		clear = new AlertDialog.Builder(this);
		new2 = new AlertDialog.Builder(this);
		feed = new AlertDialog.Builder(this);
		list = new AlertDialog.Builder(this);
		onetime = new AlertDialog.Builder(this);
		ot = getSharedPreferences("ot", Activity.MODE_PRIVATE);
		changelog = new AlertDialog.Builder(this);
		donate = new AlertDialog.Builder(this);
		upi = new AlertDialog.Builder(this);
		trx = new AlertDialog.Builder(this);
		btc = new AlertDialog.Builder(this);
		off = getSharedPreferences("off", Activity.MODE_PRIVATE);
		dd = new AlertDialog.Builder(this);
		expire = new AlertDialog.Builder(this);
		trim = new AlertDialog.Builder(this);
		fix = new AlertDialog.Builder(this);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		whatsappadvv = new AlertDialog.Builder(this);
		wac = new AlertDialog.Builder(this);
		dalvik = new AlertDialog.Builder(this);
		oat = new AlertDialog.Builder(this);
		viewstorage = new AlertDialog.Builder(this);
		wiperapiii = new AlertDialog.Builder(this);
		info = new AlertDialog.Builder(this);
		multi = new AlertDialog.Builder(this);
		enablefirst = new AlertDialog.Builder(this);
		d2 = new AlertDialog.Builder(this);
		d1 = new AlertDialog.Builder(this);
		d3 = new AlertDialog.Builder(this);
		premium = getSharedPreferences("premium", Activity.MODE_PRIVATE);
		prm = new AlertDialog.Builder(this);
		dir = getSharedPreferences("dir", Activity.MODE_PRIVATE);
		d2_1 = new AlertDialog.Builder(this);
		soon = new AlertDialog.Builder(this);
		agree = new AlertDialog.Builder(this);
		error = new AlertDialog.Builder(this);
		tmp = new AlertDialog.Builder(this);
		dynamic = new AlertDialog.Builder(this);
		empty = new AlertDialog.Builder(this);
		Notice = new AlertDialog.Builder(this);
		oatClean = new AlertDialog.Builder(this);
		storage = new AlertDialog.Builder(this);
		battery = new AlertDialog.Builder(this);
		log = new AlertDialog.Builder(this);
		Errar = new AlertDialog.Builder(this);
		daily = new AlertDialog.Builder(this);
		Temp = new AlertDialog.Builder(this);
		custom = new AlertDialog.Builder(this);
		dalvikk = new AlertDialog.Builder(this);
		exp = new AlertDialog.Builder(this);
		bt2 = new AlertDialog.Builder(this);
		lostdir = new AlertDialog.Builder(this);
		Welcome = new AlertDialog.Builder(this);
		updatr = new RequestNetwork(this);
		submiting = new AlertDialog.Builder(this);
		
		linear1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		dailyclean.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (set.getString("confirm", "").equals("0")) {
					_Root(Empty, "⚡𝐏𝐞𝐫𝐟𝐨𝐫𝐦𝐢𝐧𝐠 𝐃𝐚𝐢𝐥𝐲 𝐂𝐥𝐞𝐚𝐧", "✅ Action Performed");
				}
				else {
					daily.setTitle("𝗗𝗮𝗶𝗹𝘆 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
					daily.setIcon(R.drawable.rock);
					daily.setMessage("Optimize Storage & Enhance user Experience");
					daily.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							_Root(Empty, "⚡𝐏𝐞𝐫𝐟𝐨𝐫𝐦𝐢𝐧𝐠 𝐃𝐚𝐢𝐥𝐲 𝐂𝐥𝐞𝐚𝐧", "✅ Action Performed");
						}
					});
					daily.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					final AlertDialog dailydaily = daily.create();
					dailydaily.show();
					((TextView) dailydaily.findViewById(dailydaily.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
					final ImageView R_icon = new ImageView(getApplicationContext()); 
					R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
					R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
					R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
					((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
					R_icon.requestLayout();
					R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
					R_icon.setImageResource(R.drawable.infoo);
					((LinearLayout) dailydaily.findViewById(dailydaily.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
					R_icon.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							_Info_or_Help("𝗗𝗮𝗶𝗹𝘆 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 help", "It Include large number of directories (Can't be mention here , Just Use daily clean for faster and smooth storage management)\n\n• It also include complete patches of Cache trim + Logs cleaner + Lost.dir cleaner + Easy cache wiper api ...& so on...\n\n");
						}
					});
				}
			}
		});
		
		button23.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		button23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				h.setTitle("𝗔𝗯𝗼𝘂𝘁 v3.1");
				h.setIcon(R.drawable.ctd);
				h.setMessage("𝐀 𝐌𝐨𝐬𝐭 𝐀𝐝𝐯𝐚𝐧𝐜𝐞 𝐂𝐥𝐞𝐚𝐧𝐞𝐫 𝐟𝐨𝐫 𝐀𝐧𝐝𝐫𝐨𝐢𝐝.\n\n•••••••••••••••••••••••••••\n🏷️𝐑𝐞𝐪𝐮𝐢𝐫𝐞𝐦𝐞𝐧𝐭𝐬: \n- Root/Magisk & BusyBox Only\n-------------------------------\n📑 𝐌𝐚𝐢𝐧 𝐅𝐞𝐚𝐭𝐮𝐫𝐞𝐬:\n• One Click Dynamic Cleaner\n• All Cache/waste cleaner \n• Custom Cleaner\n• Dynamic Systemless Module\n• Smart Cleaner\n• Battery Callibration \n• Fstrim & Cache Trim\n• No background functionality\n• No Permission Request\n• Dynamic Cleaning Mechanism\n• Cleaner Toolbox \n• Mini-Cleaner\n𝖒𝖔𝖗𝖊 +++\n------------------------------\n\n👨‍🎤\nDeveloper : 𝑨𝒓𝒂𝒂𝒇𝑹𝒐𝒚𝒂𝒍𝒍 🇮🇳\nTelegram id : @AraafRoyall\nGmail : araafroyall@gmail.com\n\n--------------------------------\n\n📜 Note :\nIt 𝐧𝐞𝐯𝐞𝐫 𝐜𝐨𝐥𝐥𝐞𝐜𝐭 Any data\nThis App Never Affect Any Usable Data unless defined\nNo Permission Required , only Root\n\n𝐃𝐞𝐯𝐞𝐥𝐨𝐩𝐞𝐫 𝐢𝐬 𝐧𝐨𝐭 𝐫𝐞𝐬𝐩𝐨𝐧𝐬𝐢𝐛𝐥𝐞 𝐟𝐨𝐫 𝐚𝐧𝐲 𝐝𝐚𝐦𝐚𝐠𝐞 𝐩𝐥𝐞𝐚𝐬𝐞 𝐛𝐞 𝐜𝐚𝐫𝐞𝐟𝐮𝐥𝐥 𝐛𝐞𝐟𝐨𝐫𝐞 𝐮𝐬𝐢𝐧𝐠 𝐭𝐡𝐢𝐬 𝐚𝐩𝐩\n\nA Feedback is most welcome 😊\n[Please Try Premium features too]\n\n");
				h.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				h.create().show();
			}
		});
		
		result.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (set.getString("btCal", "").contains("1")) {
					_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "This Option is Disabled");
				}
				else {
					_battery_calibrate();
				}
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), CustomCleanerActivity.class);
				startActivity(i);
			}
		});
		
		linear19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_fstrim();
			}
		});
		
		linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), StorageusageActivity.class);
				startActivity(i);
			}
		});
		
		linear22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (set.getString("dalvikkkk", "").equals("1")) {
					_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "This Option is Disabled from settings");
				}
				else {
					_delvik_clean();
				}
			}
		});
		
		wiperap.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_easy_wiper_api();
			}
		});
		
		LogCleanbt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				log.setTitle("𝗟𝗼𝗴𝘀 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
				log.setIcon(R.drawable.icon_2);
				log.setMessage("This Will Clear All Logs Globally");
				log.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				log.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				final AlertDialog loglog = log.create();
				loglog.show();
				((TextView) loglog.findViewById(loglog.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
				final ImageView R_icon = new ImageView(getApplicationContext()); 
				R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
				R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
				R_icon.requestLayout();
				R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
				R_icon.setImageResource(R.drawable.infoo);
				((LinearLayout) loglog.findViewById(loglog.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
				R_icon.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝗟𝗼𝗴𝘀 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 Help", "𝐋𝐨𝐠𝐬 𝐂𝐥𝐞𝐚𝐧𝐞𝐫 𝐀𝐜𝐭𝐮𝐚𝐥𝐥𝐲 𝐂𝐥𝐞𝐚𝐧𝐬 𝐓𝐡𝐞 𝐅𝐨𝐥𝐥𝐨𝐰𝐢𝐧𝐠\n\n•Clears All User & system Apps logs\n•Clears All Logs in /data and its subdirectories\n•Clears all Logs with extension '.log' Globally\n\nLogcat (Shifted to Mini Cleaner)\n/data log & logger files\nruntime.log & All apps update engine log\nLsposed logs & its old logs\nthanox & fox logs\n\n• Also Cleans from MultiUser(If Any)\n\n[Enhanced Mode]\n𝐂𝐥𝐞𝐚𝐫𝐬 𝐚𝐥𝐥 𝐋𝐨𝐠𝐬 𝐰𝐢𝐭𝐡 𝐞𝐱𝐭𝐞𝐧𝐬𝐢𝐨𝐧 '.𝐥𝐨𝐠'\n\n𝖒𝖔𝖗𝖊 +++");
					}
				});
			}
		});
		
		EmptyFolderBt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				variable = "0";
				empty.setTitle("𝗘𝗺𝗽𝘁𝘆 𝗙𝗼𝗹𝗱𝗲𝗿 𝐂𝐥𝐞𝐚𝐧𝐞𝐫");
				empty.setIcon(R.drawable.storage_3);
				empty.setMessage("Clears All Empty Folders from Internal Storage");
				LinearLayout layuu = new LinearLayout(MainActivity.this);
				layuu.setOrientation(LinearLayout.VERTICAL);
				
				LinearLayout.LayoutParams prm = new LinearLayout.LayoutParams(
				    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
				
				final CheckBox mpty = new CheckBox(MainActivity.this);
				mpty.setText("Multi-User");
				mpty.setLayoutParams(prm);
				layuu.addView(mpty);
				final CheckBox outp = new CheckBox(MainActivity.this);
				outp.setText("Show Output after clean");
				outp.setLayoutParams(prm);
				layuu.addView(outp);
				((ViewGroup.MarginLayoutParams) mpty.getLayoutParams()).setMargins(60, 0, 0, 0);
				
				((ViewGroup.MarginLayoutParams) outp.getLayoutParams()).setMargins(60, 0, 0, 0);
				
				
				empty.setView(layuu);
				outp.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						if
						((outp.isChecked())){
							
							variable = "1";
						}
						else
						{
							variable = "0";
							
						}
					}
				});
				empty.setPositiveButton("🚀 𝐂𝐥𝐞𝐚𝐧", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				empty.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				empty.create().show();
			}
		});
		
		cachetrimbt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				trim.setTitle("𝗖𝗮𝗰𝗵𝗲 𝗧𝗿𝗶𝗺𝗺𝗲𝗿");
				trim.setMessage("Deeply 𝑪𝒍𝒆𝒂𝒓 𝑨𝒍𝒍 𝒄𝒂𝒄𝒉𝒆𝒔 instantly");
				trim.setIcon(R.drawable.cachr);
				trim.setPositiveButton("❄️ Trim Cache", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				trim.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				final AlertDialog trimtrim = trim.create();
				trimtrim.show();
				((TextView) trimtrim.findViewById(trimtrim.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
				final ImageView R_icon = new ImageView(getApplicationContext()); 
				R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
				R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
				R_icon.requestLayout();
				R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
				R_icon.setImageResource(R.drawable.infoo);
				((LinearLayout) trimtrim.findViewById(trimtrim.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
				R_icon.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝗖𝗮𝗰𝗵𝗲 𝗧𝗿𝗶𝗺𝗺𝗲𝗿 Help", "𝐂𝐚𝐜𝐡𝐞 𝐓𝐫𝐢𝐦𝐦𝐞𝐫 𝐀𝐜𝐭𝐮𝐚𝐥𝐥𝐲 𝐂𝐥𝐞𝐚𝐧𝐬 𝐓𝐡𝐞 𝐅𝐨𝐥𝐥𝐨𝐰𝐢𝐧𝐠\n\n• All Apps Cache at system level \n• Deeply Cleans All cache in /data & its subdirectories\n• Dynamically Clears All cache Folder  with its contents Globally\n\n• It also clears code_cache\n• & cleans Cache from internal storage\n• Also Cleans cache from MultiUser(If Any)\n\n[Enhanced Mode]\n𝑬𝒗𝒆𝒓𝒚 𝑺𝒊𝒏𝒈𝒍𝒆 𝒇𝒐𝒍𝒅𝒆𝒓 𝒏𝒂𝒎𝒊𝒏𝒈 '𝑪𝒂𝒄𝒉𝒆' 𝒐𝒓 '𝒄𝒂𝒄𝒉𝒆' 𝒘𝒊𝒕𝒉 𝒊𝒕𝒔 𝒄𝒐𝒏𝒕𝒆𝒏𝒕 𝒘𝒊𝒍𝒍 𝒃𝒆 𝒄𝒍𝒆𝒂𝒓𝒆𝒅 𝒇𝒓𝒐𝒎 𝒅𝒆𝒗𝒊𝒄𝒆 𝑮𝒍𝒐𝒃𝒂𝒍𝒍𝒚\n\nmore+++");
					}
				});
			}
		});
		
		oatbt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				oat.setTitle("𝗢𝗱𝗲𝘅/𝗩𝗱𝗲𝘅/𝗼𝗮𝘁 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
				oat.setIcon(R.drawable.storage_1);
				oat.setMessage("Clears Oat (dex/vdex) files of All user apps without affecting functionality\n\n𝐓𝐨𝐭𝐚𝐥 𝐬𝐢𝐳𝐞 : Calculating...");
				oat.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				oat.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				final AlertDialog oatoat = oat.create();
				oatoat.show();
				((TextView) oatoat.findViewById(oatoat.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
				final ImageView R_icon = new ImageView(getApplicationContext()); 
				R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
				R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
				R_icon.requestLayout();
				R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
				R_icon.setImageResource(R.drawable.infoo);
				((LinearLayout) oatoat.findViewById(oatoat.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
				R_icon.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝗢𝗱𝗲𝘅/𝗩𝗱𝗲𝘅/𝗼𝗮𝘁 Help", "These files automatically created when you install & Use apps which Results in very large app size. \n\n• Clean this Regularly to maintain all Apps Size");
					}
				});
				try {
					   
					    final String command = "echo \"download original version\"";
					
					
					    final TextView result = findViewById(R.id.result); 
					    new Handler().postDelayed(new Runnable() {
						        @Override
						        public void run() {
							            try {
								                java.lang.Process process = java.lang.Runtime.getRuntime().exec("su");
								                java.io.DataOutputStream outputStream = new java.io.DataOutputStream(process.getOutputStream());
								
								                outputStream.writeBytes(command + "\n");
								                outputStream.flush();
								
								                outputStream.writeBytes("exit\n");
								                outputStream.flush();
								
								                int exitCode = process.waitFor();
								
								                final StringBuilder outputText = new StringBuilder();
								                java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
								                String line;
								                while ((line = reader.readLine()) != null) {
									                    outputText.append(line).append("\n");
									
									                    
									                    runOnUiThread(new Runnable() {
										                        @Override
										                        public void run() {
											                            result.setText(outputText.toString());
											                        }
										                    });
									                }
								
								                final StringBuilder errorText = new StringBuilder();
								                java.io.BufferedReader errorReader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getErrorStream()));
								                while ((line = errorReader.readLine()) != null) {
									                    errorText.append(line).append("\n");
									                }
								
								                if (exitCode == 0) {
									                    runOnUiThread(new Runnable() {
										                        @Override
										                        public void run() {
											((TextView) oatoat.findViewById(android.R.id.message)).setText("Clears Oat (dex/vdex) files of All user apps without affecting functionality\n\n𝐓𝐨𝐭𝐚𝐥 𝐬𝐢𝐳𝐞 : ".concat(result.getText().toString().replace("\n", "")));
											result.setText("");
											                        }
										                    });
									                } else {
									                    runOnUiThread(new Runnable() {
										                        @Override
										                        public void run() {
											                            result.setText(errorText.toString());
											((TextView) oatoat.findViewById(android.R.id.message)).setText("Clears Oat (dex/vdex) files of All user apps without affecting functionality\n\n𝐓𝐨𝐭𝐚𝐥 𝐬𝐢𝐳𝐞 : Unable to Calculate . Something went Wrong");
											try {
												    String cmdxx = "du"; 
												    Runtime.getRuntime().exec(cmdxx);
												_Error();
											} catch (Exception e) {
												_ERROR("Size Calculation Mechanism Not Found in Your Device. Install Busybox to fix this issue");
											}
											
											                        }
										                    });
									                }
								            } catch (Exception e) {
								                e.printStackTrace();
								                
								                final String errorMessage = "Error: " + e.getMessage();
								                runOnUiThread(new Runnable() {
									                    @Override
									                    public void run() {
										                        result.setText(errorMessage);
										                        Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
										                    }
									                });
								            }
							        }
						    }, 100);
				} catch (Exception e) {
					    e.printStackTrace();
				}
				
			}
		});
		
		internalbt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				storage.setTitle("𝙄𝙣𝙩𝙚𝙧𝙣𝙖𝙡 𝙎𝙩𝙤𝙧𝙖𝙜𝙚 𝑪𝒍𝒆𝒂𝒏𝒆𝒓");
				storage.setIcon(R.drawable.folder);
				storage.setMessage("This Will Clear All unwanted folder and files from Internal storage (𝑺𝒂𝒇𝒆)\n");
				storage.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				storage.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				LinearLayout mut = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -1));}};
				Button mtu = new Button(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				mtu.setText("💼 𝗠𝘂𝗹𝘁𝗶-𝗨𝘀𝗲𝗿 STORAGE Cleaner");
				mtu.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFB9F6CA));
				mut.addView(mtu);
				 
				storage.setView(mut);
				final AlertDialog storagestorage = storage.create();
				storagestorage.show();
				((TextView) storagestorage.findViewById(storagestorage.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
				final ImageView R_icon = new ImageView(getApplicationContext()); 
				R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
				R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
				R_icon.requestLayout();
				R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
				R_icon.setImageResource(R.drawable.infoo);
				((LinearLayout) storagestorage.findViewById(storagestorage.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
				R_icon.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝙎𝙩𝙤𝙧𝙖𝙜𝙚 𝑪𝒍𝒆𝒂𝒏𝒆𝒓 Help", "𝑰𝒕𝒔 𝑪𝒍𝒆𝒂𝒏𝒊𝒏𝒈 𝑰𝒕𝒆𝒎𝒔 𝒂𝒓𝒆 :\n\nThumbnails & .Thumbs Files\nCache in /sdcard/Android/\nBugreports File in Storage \nCache and Code_Cache\nUnwanted Files & Folders\nMultiUser Apps Cache at system Level\nGallery Disk Cache (image cache)\nsystem_config file \nDebug Log in Internal Storage\n+ whatsapp Temps\n\nMore +++");
					}
				});
				mtu.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_multi_user_clean();
						storagestorage.dismiss();
					}
				});
			}
		});
		
		workbt.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		workbt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		linear31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				lostdir.setTitle("𝐋𝐎𝐒𝐓.𝐃𝐈𝐑 𝐂𝐥𝐞𝐚𝐧𝐞𝐫");
				lostdir.setIcon(R.drawable.temporary);
				lostdir.setMessage("Clears All LOST.DIR Files and Folder from Device including SD Card");
				lostdir.setPositiveButton("🛸 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				lostdir.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				final AlertDialog lostdirlostdir = lostdir.create();
				lostdirlostdir.show();
				((TextView) lostdirlostdir.findViewById(lostdirlostdir.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
				final ImageView R_icon = new ImageView(getApplicationContext()); 
				R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
				R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
				R_icon.requestLayout();
				R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
				R_icon.setImageResource(R.drawable.infoo);
				((LinearLayout) lostdirlostdir.findViewById(lostdirlostdir.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
				R_icon.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝗟𝗼𝗴𝘀 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 Help", "\"LOST.DIR\" is a system folder on Android that holds recovered files after a system check or unexpected reboot, preventing potential data loss.\n\nIt Also stores cached data when you transfer files using devices");
					}
				});
			}
		});
		
		trashbt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				variable = "0";
				Temp.setTitle("𝐓𝐞𝐦𝐩𝐨𝐫𝐚𝐫𝐲 𝐅𝐢𝐥𝐞𝐬 𝐂𝐥𝐞𝐚𝐧𝐞𝐫");
				Temp.setIcon(R.drawable.img_4);
				LinearLayout layuut = new LinearLayout(MainActivity.this);
				layuut.setOrientation(LinearLayout.VERTICAL);
				
				LinearLayout.LayoutParams prmu = new LinearLayout.LayoutParams(
				    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
				
				final CheckBox outpp = new CheckBox(MainActivity.this);
				outpp.setText("Show Output after clean");
				outpp.setLayoutParams(prmu);
				layuut.addView(outpp);
				((ViewGroup.MarginLayoutParams) outpp.getLayoutParams()).setMargins(60, 0, 0, 0);
				
				
				Temp.setView(layuut);
				outpp.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						if
						((outpp.isChecked())){
							
							variable = "1";
						}
						else
						{
							variable = "0";
							
						}
					}
				});
				Temp.setMessage("This Clears All Temporary Files created by many Apps");
				Temp.setPositiveButton("🛸 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				Temp.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				final AlertDialog TempTemp = Temp.create();
				TempTemp.show();
				((TextView) TempTemp.findViewById(TempTemp.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
				final ImageView R_icon = new ImageView(getApplicationContext()); 
				R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
				R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
				R_icon.requestLayout();
				R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
				R_icon.setImageResource(R.drawable.infoo);
				((LinearLayout) TempTemp.findViewById(TempTemp.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
				R_icon.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝐓𝐞𝐦𝐩𝐨𝐫𝐚𝐫𝐲 𝐂𝐥𝐞𝐚𝐧𝐞𝐫 Help", "This Clears All Temporary Files created by many Apps for their Cached or Temporary work\n\nIt may also include temporary download files , view cache etc...");
					}
				});
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), OnetapActivity.class);
				startActivity(i);
			}
		});
		
		linear33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), MinicleanerActivity.class);
				startActivity(i);
			}
		});
		
		linear28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), SmartCleanActivity.class);
				startActivity(i);
			}
		});
		
		linear29.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				i.setClass(getApplicationContext(), CustomDirActivity.class);
				startActivity(i);
				return true;
			}
		});
		
		linear29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				custom.setTitle("𝗖𝘂𝘀𝘁𝗼𝗺 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
				custom.setIcon(R.drawable.img_1);
				custom.setMessage("This will clear All files and directories added by you ");
				custom.setPositiveButton("🚀 𝗖𝗹𝗲𝗮𝗿", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				custom.setNegativeButton("𝐏𝐫𝐞𝐬𝐞𝐭 𝐂𝐥𝐞𝐚𝐧𝐞𝐫", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				custom.setNeutralButton("⚙️ 𝗦𝗲𝘁𝘁𝗶𝗻𝗴𝘀", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						i.setClass(getApplicationContext(), CustomDirActivity.class);
						startActivity(i);
					}
				});
				custom.create().show();
			}
		});
		
		button29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				changelog.setTitle("𝗖𝗵𝗮𝗻𝗴𝗲𝗹𝗼𝗴... v3.5");
				changelog.setIcon(R.drawable.checklist_3);
				changelog.setMessage("🚀 : Encrypted Strings\n🚀 : Enhanced Security\n🚀 : Inbuilt Update Checker\n-------------------------------\n\n🚀 : Changed Package name , Signature & App Name\n🚀 : Changed github , feedback & other forum links\n🚀 : Updated : New Telegram Bot\n𝗙𝗶𝘅 : Texts & Minor improvements\n💬 :  For Premium user : Please restore your premium or use Permanent Activation key to Activate again.\n💬 : Module name is still old ( & will be changed on next update)\n\n-------------------------------\n\nv3.3\n🚀 : Introducing Systemless auto cleaning Module.\n🚀 : Full Featured Auto Cleaner Module , Like changable interval & Patches.\n🚀 : WhatsApp - Full Featured Cleaner, 30+ Options\n🚀 : Telegram - Full Featured Cleaner\n🚀 : Enhanced Temporary Cleaner\n🚀 : Directory Manager - Custom Cleaner\n🚀 : Introducing PreSets in Custom Cleaner\n🚀 : Backup & Restore PreSets in Custom Cleaner\n🚀 : Clean + Copy + Undo in Directory Manager - Custom Cleaner\n🚀 : Pro Hints Every 4 Second - in Some Pages \n🚀 : Custom Path Support - Smart Cleaner\n🚀 : Smart Cleaner - UI upgrade\n🚀 : Smart Cleaner - save & use custom items later for CleanUp\n🚀 : \"Introduction\" Dialog Changes\n🚀 : Size Calculation Mechanism Upgraded to Support All Android Versions\n🚀 : Storage Usage for directories in MiniCleaner\n🚀 : Updated - $INT Storage directories \n🚀 : Instant Cleaner in Custom Cleaner \n𝗙𝗶𝘅 : Fstrim for Android 14\n𝗙𝗶𝘅 : Compatibility button + Its texts + Enhanced + SpeedUp & Prevent multiple tap while checking\n𝗙𝗶𝘅 : Header themes in some pages\n𝗙𝗶𝘅 : Wiper API Cleaner - Output\n𝗙𝗶𝘅 : Daily Cleaner layout on some devices\n𝗙𝗶𝘅 : Letter 'B' showing in some option in mini cleaner\n𝗙𝗶𝘅 : Texts & Minor Improvements\n𝗙𝗶𝘅 : Logs Cleaner for Multiple Users\n𝗙𝗶𝘅 : Fonts & Styles\n💬 : Changes Backup & Restore Mechanism for Custom Directories. Please Backup your Directories again with this version as old backups are no longer supported.\n💬 : Removed Android version Selector - [No Need : as Oat Size calculation Mechanism Has been Changed] \n💬 : Suspended Alternate method from Empty Folder Cleaner as it is now dynamically integrated & auto switchable\n💬 : Now you can use \"/data/user_de\" directories in Custom Cleaner\n💬 : Removed .Nomedia cleaner from OneTap Cleaner (user Reported)\n💬 : Module supports Magisk & KernalSU ROOT\n\n-------------------------------\nv3.2\n\n🚀 : Brand New UI & Theme\n🚀 : Upgraded info box in all option\n🚀 : Size calculation mechanism upgraded\n🚀 : Reduce Resource usage\n🚀 : Wiper API output\n🚀 : Integrated help & Cleaning list\n🚀 : Premium price reduced\n🚀 : Custom Color Support\n🚀 : Submit forums directly from app\n🚀 : Suspended helper App\n🚀 : Storage usage for some options in mini cleaner\n🚀 : Last Screenshot Remover - Smart Clean\n🚀 : gif cleaner - smart clean\n𝗙𝗶𝘅 : dump log cleaner\n𝗙𝗶𝘅 : texts & styles\n𝗙𝗶𝘅 : some java code structure\n𝗙𝗶𝘅 : bugs & Improvements\n💬 : Many colors given on Github wiki\n💬 : Please purchase Premium & Help or Contribute app development\n\n -------------------------------\nv3.1\n\n🚀 : Simplified Premium Purchase\n𝗙𝗶𝘅 : Hiding of 'Activate' Button is Settings\n𝗙𝗶𝘅 : .thumbnails Cleaner in MiniCleaner\n𝗙𝗶𝘅 : Minor Texts correction\n𝗙𝗶𝘅 : Github Button in Update\n💬 : Reduced Resource Usage for Premium Users in Premium Activity\n(Please Consider Purchasing Premium Version & Contribute to App development)\n\n-------------------------------\nv3.0\n🚀 : Detect Android Version Option\n🚀 : Text Writer Animations\n🚀 : New Dialog UI\n🚀 : Introducing Dialog Icons\n🚀 : Mini Cleaner (10+ mods)\n🚀 : Apps Data Cleaner\n🚀 : Extended Trial upto 6 Month\n🚀 : Permanent Premium Key support\n🚀 : Battery Calibrate revert check\n🚀 : Upgraded Storage Viewer\n𝗙𝗶𝘅 : Outputs of EmptyFolder & Temp\n𝗙𝗶𝘅 : Script in OneTap Cleaner\n𝗙𝗶𝘅 : Remapped OneTap Cleaner\n𝗙𝗶𝘅 : more Accurate output of Error\n𝗙𝗶𝘅 : Layout of some buttons\n𝗙𝗶𝘅 : Dynamic Action\n𝗙𝗶𝘅 : Changelog viewer\n💬 : Premium Upgrade & Fixes\n💬 : Bugs Fixes & Improvements\n💬 : Removed \"http-legacy-28.dex\"\n💬 : Updated + SpeedUp Compatibility Checker\n💬 : Custom directory examples\n💬 : logcat cleaner shifted from log cleaner to Mini cleaner\n-------------------------------\n\n🔸Old ChangeLog is on web\n\n------------------------------\n📳 𝐊𝐧𝐨𝐰𝐧 𝐁𝐮𝐠𝐬 :\n🔹 add or remove directory in custom cleaner if part of name match same\n-------------------------------\n\n👨‍🎤 𝗗𝗲𝘃𝗲𝗹𝗼𝗽𝗲𝗿 :\n     •  𝑨𝒓𝒂𝒂𝒇𝑹𝒐𝒚𝒂𝒍𝒍  ❂ [AR]\nGmail : araafroyall@gmail.com\nTelegram : @AraafRoyall\n--------------------------------\n📜 Note : \n𝐃𝐞𝐯𝐞𝐥𝐨𝐩𝐞𝐫 𝐢𝐬 𝐧𝐨𝐭 𝐫𝐞𝐬𝐩𝐨𝐧𝐬𝐢𝐛𝐥𝐞 𝐟𝐨𝐫 𝐚𝐧𝐲 𝐝𝐚𝐦𝐚𝐠𝐞 𝐩𝐥𝐞𝐚𝐬𝐞 𝐛𝐞 𝐜𝐚𝐫𝐞𝐟𝐮𝐥𝐥 𝐛𝐞𝐟𝐨𝐫𝐞 𝐮𝐬𝐢𝐧𝐠 𝐭𝐡𝐢𝐬 𝐚𝐩𝐩.");
				changelog.setNegativeButton("🪧 𝗼𝗹𝗱", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						chng.setAction(Intent.ACTION_VIEW);
						chng.setData(Uri.parse("https://graph.org/Cleaner-Royall-07-26"));
						startActivity(chng);
					}
				});
				changelog.setNeutralButton("🌎 Github", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						chng.setAction(Intent.ACTION_VIEW);
						chng.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Royall/blob/main/ChangeLog.txt"));
						startActivity(chng);
					}
				});
				changelog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				changelog.create().show();
			}
		});
		
		help.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), CompatibilityActivity.class);
				startActivity(a);
			}
		});
		
		settings.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sett.setClass(getApplicationContext(), SettingsActivity.class);
				startActivity(sett);
			}
		});
		
		dynamicbutton.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		dynamicbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(Random.length() == 6)) {
					random = "1234567890";
					Random = "";
					for (int i = 0; i < 6; i++) {
						Random = Random + random.charAt(new java.util.Random().nextInt(random.length()));
					}
				}
				expired = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								d1.setTitle("𝗗𝘆𝗻𝗮𝗺𝗶𝗰 𝗔𝗰𝘁𝗶𝗼𝗻");
								d1.setIcon(R.drawable.dynam);
								d1.setMessage("• Basically It help in Debug\n• This Allow to Perform Enhanced Actions Dynamically.\n• Shell commands , settings Changer , Data Modifier, Bugs Fixer etc ...");
								d1.setPositiveButton("⏩ 𝐍𝐞𝐱𝐭", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
										dynamic.setTitle("𝗗𝘆𝗻𝗮𝗺𝗶𝗰 𝗔𝗰𝘁𝗶𝗼𝗻");
										dynamic.setIcon(R.drawable.dynam);
										dynamic.setMessage("𝑷𝒂𝒔𝒕𝒆 𝒕𝒉𝒆 𝒕𝒆𝒙𝒕 𝒑𝒓𝒐𝒗𝒊𝒅𝒆𝒅 𝒃𝒚 '𝑨𝒓𝒂𝒂𝒇𝑹𝒐𝒚𝒂𝒍𝒍' 𝒕𝒐 𝒑𝒆𝒓𝒇𝒐𝒓𝒎 𝒓𝒆𝒔𝒑𝒆𝒄𝒕𝒆𝒅 𝑨𝒄𝒕𝒊𝒐𝒏\nAcess Code : ".concat(Random));
										final EditText dynomic = new EditText(MainActivity.this);
										dynomic.setHint("Paste Here...");
										LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
										dynomic.setLayoutParams(lpar);
										dynamic.setView(dynomic);
										dynamic.setPositiveButton("⚡ 𝐏𝐞𝐫𝐟𝐨𝐫𝐦 𝐀𝐜𝐭𝐢𝐨𝐧", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
												dynumic = dynomic.getText().toString();
												_dynamicAction();
											}
										});
										dynamic.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
												
											}
										});
										dynamic.create().show();
									}
								});
								d1.create().show();
							}
						});
					}
				};
				_timer.schedule(expired, (int)(150));
			}
		});
		
		additional.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), PremiumActivity.class);
				startActivity(i);
			}
		});
		
		button27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				updatr.startRequestNetwork(RequestNetworkController.POST, "https://api.telegram.org/bot".concat("Bot-API-here".concat("/sendMessage?chat_id=ID&text=Someone checked for Update from ".concat("v3.5"))), "Telegram", _updatr_request_listener);
				submiting.setTitle("Checking for Update  (5𝒔𝒆𝒄...)");
				submiting.setCancelable(false);
				final AlertDialog submitingsubmiting = submiting.create();
				submitingsubmiting.show();
				canclr = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (cancl.equals("1")) {
									submitingsubmiting.dismiss();
									cancl = "";
									canclr.cancel();
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(canclr, (int)(1000), (int)(100));
			}
		});
		
		feedback.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				feed.setTitle("𝗙𝗲𝗲𝗱𝗯𝗮𝗰𝗸");
				feed.setIcon(R.drawable.technical);
				feed.setMessage("Please give us feedback or suggestion or tell us about the problem which you are facing with this app.\nEvery suggestion is important to make it batter \n\nWhat do you want to do ?\n");
				feed.setPositiveButton("📨 Suggestion or Feedback", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						i.setClass(getApplicationContext(), FeedbackActivity.class);
						startActivity(i);
					}
				});
				feed.setNeutralButton("📂 Submit Directory", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						i.setClass(getApplicationContext(), DirectorySubmitActivity.class);
						startActivity(i);
					}
				});
				LinearLayout fedbk = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
				fedbk.setOrientation(LinearLayout.VERTICAL);
				TextView fedtxt = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				fedtxt.setText(" 🌎 Visit Github issues ");
				fedtxt.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFCCFF90));
				fedbk.addView(fedtxt);
				((ViewGroup.MarginLayoutParams) fedtxt.getLayoutParams()).setMargins(70, 0, 0, 0);
				
				fedtxt.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						update.setAction(Intent.ACTION_VIEW);
						update.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Royall/issues"));
						startActivity(update);
					}
				});
				feed.setView(fedbk);
				feed.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				feed.create().show();
			}
		});
		
		_updatr_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				cancl = "1";
				if (_response.contains("{\"ok\":true,\"result\":") || _response.contains("\"ok\":true,\"")) {
					_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "You are Already using an updated version.");
				}
				else {
					d3.setTitle("𝗨𝗽𝗱𝗮𝘁𝗲 𝗔𝘃𝗮𝗶𝗹𝗮𝗯𝗹𝗲");
					d3.setIcon(R.drawable.updt);
					d3.setMessage("It is Recommended To Always use Latest Version For best Exprience\n\nHow would you like to get Latest update ?");
					d3.setPositiveButton("🌍 𝗚𝗶𝘁𝗵𝘂𝗯", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							c.setAction(Intent.ACTION_VIEW);
							c.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Royall"));
							startActivity(c);
						}
					});
					d3.setNegativeButton("▶️ 𝗧𝗲𝗹𝗲𝗴𝗿𝗮𝗺", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							c.setAction(Intent.ACTION_VIEW);
							c.setData(Uri.parse("https://t.me/cleanerRoyall"));
							startActivity(c);
						}
					});
					d3.setNeutralButton("⬇️ 𝐃𝐢𝐫𝐞𝐜𝐭 𝐃𝐨𝐰𝐧𝐥𝐨𝐚𝐝", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							c.setAction(Intent.ACTION_VIEW);
							c.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Royall/releases/download/Latest/CleanerRoyall.apk"));
							startActivity(c);
						}
					});
					d3.create().show();
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				cancl = "1";
				error.setTitle("𝗘𝗿𝗿𝗼𝗿");
				error.setIcon(R.drawable.icon_1);
				error.setMessage(_message);
				error.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				error.setNegativeButton("⚡ View Downloader", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						d3.setTitle("𝗨𝗽𝗱𝗮𝘁𝗲");
						d3.setIcon(R.drawable.updt);
						d3.setMessage("It is Recommended To Always use Latest Version For best Exprience\n\nHow would you like to get Latest update ?");
						d3.setPositiveButton("🌍 𝗚𝗶𝘁𝗵𝘂𝗯", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								c.setAction(Intent.ACTION_VIEW);
								c.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Royall"));
								startActivity(c);
							}
						});
						d3.setNegativeButton("▶️ 𝗧𝗲𝗹𝗲𝗴𝗿𝗮𝗺", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								c.setAction(Intent.ACTION_VIEW);
								c.setData(Uri.parse("https://t.me/cleanerRoyall"));
								startActivity(c);
							}
						});
						d3.setNeutralButton("⬇️ 𝐃𝐢𝐫𝐞𝐜𝐭 𝐃𝐨𝐰𝐧𝐥𝐨𝐚𝐝", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								c.setAction(Intent.ACTION_VIEW);
								c.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Royall/releases/download/Latest/CleanerRoyall.apk"));
								startActivity(c);
							}
						});
						d3.create().show();
					}
				});
				error.setNeutralButton("👨‍💻", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						i.setAction(Intent.ACTION_VIEW);
						i.setData(Uri.parse("https://t.me/AraafRoyall"));
						startActivity(i);
					}
				});
				error.create().show();
			}
		};
	}
	
	private void initializeLogic() {
		if (set.getString("setu", "").equals("1")) {
			if (set.getString("notice", "").equals("1")) {
				
			}
			else {
				_Note();
			}
		}
		else {
			_privacy_Agreement();
		}
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		PremiumCheck = Empty;
	}
	
	@Override
	public void onBackPressed() {
		finishAffinity();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		_color1();
		dailyclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFE8F5E9));
	}
	public void _delvik_clean() {
		dalvikk.setTitle("𝗗𝗮𝗹𝘃𝗶𝗸 𝗖𝗮𝗰𝗵𝗲 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
		dalvikk.setIcon(R.drawable.img_2);
		dalvikk.setMessage("\nDalvik Cache size : 𝑪𝒂𝒍𝒄𝒖𝒍𝒂𝒕𝒊𝒏𝒈...");
		dalvikk.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		dalvikk.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		final AlertDialog dalvikkdalvikk = dalvikk.create();
		dalvikkdalvikk.show();
		((TextView) dalvikkdalvikk.findViewById(dalvikkdalvikk.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
		final ImageView R_icon = new ImageView(getApplicationContext()); 
		R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
		R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
		R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
		((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
		R_icon.requestLayout();
		R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
		R_icon.setImageResource(R.drawable.infoo);
		((LinearLayout) dalvikkdalvikk.findViewById(dalvikkdalvikk.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
		R_icon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝐃𝐚𝐥𝐯𝐢𝐤 𝐂𝐚𝐜𝐡𝐞 𝐂𝐥𝐞𝐚𝐧𝐞𝐫 Help", "Dalvik cache is an Android system cache that stores optimized bytecode for faster app startup. It's generated everytime when devices boots, Enhancing app performance.\n\n• Clearing it can resolve some performance issues.");
			}
		});
		try {
			   
			    final String command = "du -hcs /data/dalvik-cache | grep total | cut -f 1";
			
			
			    final TextView result = findViewById(R.id.result); 
			    new Handler().postDelayed(new Runnable() {
				        @Override
				        public void run() {
					            try {
						                java.lang.Process process = java.lang.Runtime.getRuntime().exec("su");
						                java.io.DataOutputStream outputStream = new java.io.DataOutputStream(process.getOutputStream());
						
						                outputStream.writeBytes(command + "\n");
						                outputStream.flush();
						
						                outputStream.writeBytes("exit\n");
						                outputStream.flush();
						
						                int exitCode = process.waitFor();
						
						                final StringBuilder outputText = new StringBuilder();
						                java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
						                String line;
						                while ((line = reader.readLine()) != null) {
							                    outputText.append(line).append("\n");
							
							                    
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(outputText.toString());
									                        }
								                    });
							                }
						
						                final StringBuilder errorText = new StringBuilder();
						                java.io.BufferedReader errorReader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getErrorStream()));
						                while ((line = errorReader.readLine()) != null) {
							                    errorText.append(line).append("\n");
							                }
						
						                if (exitCode == 0) {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									variable = result.getText().toString().replace("\n", "").concat("B");
									result.setText("");
									((TextView) dalvikkdalvikk.findViewById(android.R.id.message)).setText("\nDalvik Cache size : ".concat(variable));
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(errorText.toString());
									((TextView) dalvikkdalvikk.findViewById(android.R.id.message)).setText("\nDalvik Cache Size : Unable to Calculate size");
									try {
										    String command = "du"; 
										    Runtime.getRuntime().exec(command);
										_Error();
									} catch (Exception e) {
										_ERROR("Size Calculation Mechanism Not Found in Your Device\n\nInstall Busybox to fix ");
									}
									
									                        }
								                    });
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                
						                final String errorMessage = "Error: " + e.getMessage();
						                runOnUiThread(new Runnable() {
							                    @Override
							                    public void run() {
								                        result.setText(errorMessage);
								                        Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
								                    }
							                });
						            }
					        }
				    }, 100);
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _battery_calibrate() {
		battery.setTitle("𝗕𝗮𝘁𝘁𝗲𝗿𝘆 𝗖𝗮𝗹𝗶𝗯𝗿𝗮𝘁𝗼𝗿");
		battery.setMessage("### 𝑻𝒉𝒆 𝑶𝒑𝒕𝒊𝒎𝒂𝒍 𝒐𝒓𝒅𝒆𝒓 𝒐𝒇 𝒐𝒑𝒆𝒓𝒂𝒕𝒊𝒐𝒏𝒔 𝒂𝒓𝒆\n𝟬. switch phone ON.\n𝟭. plug phone and charge until it gets to 100% (keep plugged-in).\n𝟮. wait 10+ minutes.\n𝟯. 𝐂𝐚𝐥𝐢𝐛𝐫𝐚𝐭𝐞 and shut down device (keep plugged-in).\n𝟰. wait until the charging screen (when the phone is OFF) will show battery-full too.\n𝟱. wait 10+ minutes.\n𝟲. unplug, power phone ON\n𝟳. Enjoy ... ");
		battery.setIcon(R.drawable.battery);
		battery.setPositiveButton("🥏 Next ", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				battery.setTitle("𝗕𝗮𝘁𝘁𝗲𝗿𝘆 𝗖𝗮𝗹𝗶𝗯𝗿𝗮𝘁𝗼𝗿");
				battery.setIcon(R.drawable.battery_1);
				battery.setMessage("Calibrate of battery is rarely needed.\n\nit is required to be performed when you switch rom or Every 4-6 Months\n[𝑴𝒖𝒔𝒕 𝒇𝒐𝒍𝒍𝒐𝒘 𝒂𝒍𝒍 𝒔𝒕𝒆𝒑𝒔 𝒄𝒂𝒓𝒆𝒇𝒖𝒍𝒍𝒚]\n\nAre you sure to calibrate?");
				battery.setPositiveButton("🥏 Calibrate now", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				battery.setNegativeButton("🛠️ Revert", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						bt2.setTitle("𝗕𝗮𝘁𝘁𝗲𝗿𝘆 𝗖𝗮𝗹𝗶𝗯𝗿𝗮𝘁𝗼𝗿 𝗥𝗲𝘃𝗲𝗿𝘁");
						bt2.setIcon(R.drawable.lowbattery);
						bt2.setMessage("This is 𝐮𝐧𝐬𝐭𝐚𝐛𝐥𝐞 Feature.\nif you ever calibrated by this app than you can revert this change in case of any issue\n\n𝑮𝒆𝒏𝒆𝒓𝒂𝒍𝒍𝒚 𝑰𝒕 𝒏𝒆𝒗𝒆𝒓 𝑹𝒆𝒒𝒖𝒊𝒓𝒆𝒔 , 𝑷𝒓𝒐𝒄𝒆𝒆𝒅 𝒘𝒊𝒕𝒉 𝒄𝒂𝒖𝒕𝒊𝒐𝒏.");
						bt2.setPositiveButton("🛠️ Revert Now ", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								_Info_or_Help("Update Required", "Download Latest version to use Features");
							}
						});
						bt2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						LinearLayout btrev = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
						btrev.setOrientation(LinearLayout.VERTICAL);
						TextView btrevert = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
						btrevert.setText(" Check Revert File ");
						btrevert.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF69F0AE));
						btrev.addView(btrevert);
						((ViewGroup.MarginLayoutParams) btrevert.getLayoutParams()).setMargins(65, 0, 0, 0);
						
						btrevert.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
								_Info_or_Help("Update Required", "Download Latest version to use Features");
							}
						});
						bt2.setView(btrev);
						bt2.create().show();
					}
				});
				battery.create().show();
			}
		});
		battery.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		battery.create().show();
	}
	
	
	public void _fstrim() {
		trim.setTitle("𝗙𝘀𝗧𝗿𝗶𝗺");
		trim.setIcon(R.drawable.cache);
		trim.setMessage("It Generally remove lags...");
		trim.setPositiveButton("❄️ Fstrim \"/data\"", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		trim.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		trim.setNegativeButton("❄️ Fstrim \"/system\"", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		final AlertDialog trimtrim = trim.create();
		trimtrim.show();
		((TextView) trimtrim.findViewById(trimtrim.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
		final ImageView R_icon = new ImageView(getApplicationContext()); 
		R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
		R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
		R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
		((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
		R_icon.requestLayout();
		R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
		R_icon.setImageResource(R.drawable.infoo);
		((LinearLayout) trimtrim.findViewById(trimtrim.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
		R_icon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "𝑹𝒆𝒒𝒖𝒊𝒓𝒆𝒎𝒆𝒏𝒕 : Busybox\n𝐒𝐩𝐞𝐞𝐝 𝐨𝐟 𝐓𝐫𝐢𝐦 : Slow\n\nTrim system is Rarely Required");
			}
		});
	}
	
	
	public void _color1() {
		_Themer(linear22);
		_Themer(wiperap);
		_Themer(LogCleanbt);
		_Themer(EmptyFolderBt);
		_Themer(workbt);
		_Themer(oatbt);
		_Themer(cachetrimbt);
		_Themer(trashbt);
		_Themer(linear31);
		_Themer(internalbt);
		_Themer(linear11);
		_Themer(linear28);
		_Themer(linear33);
		_Themer(linear29);
	}
	
	
	public void _privacy_Agreement() {
		tmp.setTitle("𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝗥𝗼𝘆𝗮𝗹𝗹");
		tmp.setIcon(R.drawable.rock);
		tmp.setMessage("𝐀 𝐌𝐨𝐬𝐭 𝐀𝐝𝐯𝐚𝐧𝐜𝐞 𝐂𝐥𝐞𝐚𝐧𝐞𝐫 𝐟𝐨𝐫 𝐀𝐧𝐝𝐫𝐨𝐢𝐝\n\nDeveloper : AraafRoyall 🇮🇳\nTelegram : @CleanerRoyall.\n@2023-24 All Rights Reserved.\n\n🧑‍💻Contact Developer for Any Help\n\n📝 𝐀𝐠𝐫𝐞𝐞𝐦𝐞𝐧𝐭\n• Developer is not Responsible for any damage cause Using this App.\n• You(user) self responsible for using this app on your device.\n• A latest data Backup is Strongly Recommended");
		final CheckBox cb1 = new CheckBox(MainActivity.this);
		cb1.setText("𝗜 𝗔𝗴𝗿𝗲𝗲 : 𝗗𝗼𝗻'𝘁 𝘀𝗵𝗼𝘄 𝗮𝗴𝗮𝗶𝗻");
		LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		cb1.setLayoutParams(lpar);
		tmp.setView(cb1);
		tmp.setPositiveButton("⏩ 𝗡𝗲𝘅𝘁", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if
				((cb1.isChecked())){
					
					set.edit().putString("setu", "1").commit();
				}
				else
				{
					 
					
				}
				Welcome.setTitle("𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝗥𝗼𝘆𝗮𝗹𝗹");
				Welcome.setView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.setup, null));
				Welcome.setIcon(R.drawable.rock);
				Welcome.setPositiveButton("⏩ 𝗡𝗲𝘅𝘁", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				final AlertDialog WelcomeWelcome = Welcome.create();
				WelcomeWelcome.show();
				((TextView) WelcomeWelcome.getWindow().getDecorView().findViewById(R.id.head)).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFCCFF90));
				SketchwareUtil.showMessage(getApplicationContext(), "❣️ 𝑾𝒆𝒍𝒄𝒐𝒎𝒆");
			}
		});
		tmp.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				SketchwareUtil.showMessage(getApplicationContext(), "🪧 You Must Agree to use this App");
				finish();
			}
		});
		tmp.create().show();
	}
	
	
	public void _easy_wiper_api() {
		wiperapiii.setTitle("𝗘𝗮𝘀𝘆 𝗖𝗮𝗰𝗵𝗲 𝗪𝗶𝗽𝗲𝗿 𝗔𝗣𝗜");
		wiperapiii.setIcon(R.drawable.img_3);
		wiperapiii.setMessage("This is based on \"𝑬𝒂𝒔𝒚 𝑪𝒂𝒄𝒉𝒆 𝑾𝒊𝒑𝒆𝒓\" App & Contains Full Cleaning Functionality in Single Option.\n");
		wiperapiii.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		LinearLayout wiperCache = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
		wiperCache.setOrientation(LinearLayout.VERTICAL);
		/*Comment*/
		TextView apiList = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
		apiList.setText(" 📋 Directories List ");
		apiList.setTextColor(0xFFF50057);
		apiList.setTextSize((int)14);
		apiList.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF69F0AE));
		wiperCache.addView(apiList);
		CheckBox wipervox = new CheckBox(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
		wipervox.setText("Show output after clean");
		wiperCache.addView(wipervox);
		((ViewGroup.MarginLayoutParams) apiList.getLayoutParams()).setMargins(60, 0, 0, 0);
		
		((ViewGroup.MarginLayoutParams) wipervox.getLayoutParams()).setMargins(60, 20, 0, 0);
		
		apiList.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗖𝗮𝗰𝗵𝗲 𝗪𝗶𝗽𝗲𝗿 Directories", "(Star '*')  means All Sub-directories \n\n/data/system/dropbox\n/data/system/usagestats\n/sdcard/bugreports/*\n/sdcard/DCIM/.thumbnails\n/data/log\n/sdcard/Android/data/*/cache\n/data/dalvik-cache/ (𝐬𝐞𝐩𝐚𝐫𝐚𝐭𝐞)\n/data/data/*/cache\n/data/local/tmp/* (𝑭𝒊𝒙𝒆𝒅)\n/data/logger\n/sdcard/LOST.DIR\n/data/anr\n/data/tombstones\n");
			}
		});
		wiperapiii.setView(wiperCache);
		wiperapiii.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if
				((wipervox.isChecked())){
					
					_Info_or_Help("Update Required", "Download Latest version to use Features");
				}
				else
				{
					_Info_or_Help("Update Required", "Download Latest version to use Features");
					
				}
			}
		});
		final AlertDialog wiperapiiiwiperapiii = wiperapiii.create();
		wiperapiiiwiperapiii.show();
		
	}
	
	
	public void _multi_user_clean() {
		multi.setTitle("𝗠𝘂𝗹𝘁𝗶-𝗨𝘀𝗲𝗿 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
		multi.setIcon(R.drawable.suitcase);
		multi.setMessage("Clears All Unwanted File & Folder from MultiUsers Spaces Storage");
		multi.setPositiveButton("🌀 CLEAR", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		multi.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		final AlertDialog multimulti = multi.create();
		multimulti.show();
		((TextView) multimulti.findViewById(multimulti.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
		final ImageView R_icon = new ImageView(getApplicationContext()); 
		R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
		R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
		R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
		((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
		R_icon.requestLayout();
		R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
		R_icon.setImageResource(R.drawable.infoo);
		((LinearLayout) multimulti.findViewById(multimulti.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
		R_icon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗠𝘂𝗹𝘁𝗶-𝗨𝘀𝗲𝗿 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 Help", "𝐈𝐭 𝐈𝐧𝐜𝐥𝐮𝐝𝐞 :\n𝐖𝐨𝐫𝐤 𝐏𝐫𝐨𝐟𝐢𝐥𝐞(𝐈𝐬𝐥𝐚𝐧𝐝) , 𝐒𝐞𝐜𝐨𝐧𝐝 𝐒𝐩𝐚𝐜𝐞 , 𝐆𝐮𝐞𝐬𝐭 𝐨𝐫 𝐔𝐬𝐞𝐫𝐬 , 𝐃𝐮𝐚𝐥 𝐀𝐩𝐩𝐬 , 𝐌𝐢𝐔𝐢 𝐒𝐞𝐜𝐨𝐧𝐝 𝐒𝐩𝐚𝐜𝐞 etc...\n\n𝑰𝒕𝒔 𝑪𝒍𝒆𝒂𝒏𝒊𝒏𝒈 𝑰𝒕𝒆𝒎𝒔 𝒂𝒓𝒆 :\nThumbnails & .Thumbs Files\nCache in /sdcard/Android/\nBugreports\nCache and Code_Cache\nUnwanted Files & Folders\nMultiUser Apps Cache at system Level\n\nMore +++\n");
			}
		});
	}
	
	
	public void _RequirePremium() {
		prm.setTitle("𝐑𝐞𝐪𝐮𝐢𝐫𝐞 𝐏𝐫𝐞𝐦𝐢𝐮𝐦");
		prm.setMessage("This is a Premium feature \nPurchase Premium to use ");
		prm.setIcon(R.drawable.img_5);
		prm.setPositiveButton("🛸 Get Premium", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
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
	
	
	public void _Error() {
		if (result.getText().toString().contains("Permission denied")) {
			_ERROR("Root Permission Denied");
		}
		else {
			try {
				    String command = "su"; 
				    Runtime.getRuntime().exec(command);
				if (result.getText().toString().contains("araafroyall")) {
					_ERROR("Something issue in Premium\nOr Trial Expired\n\nActivate Premium to Use App");
				}
				else {
					_ERROR("Something went Wrong");
				}
			} catch (Exception e) {
				_ERROR("Root Acess Not Found or Hidden");
			}
			
		}
		try {
			    String command = "rm"; 
			    Runtime.getRuntime().exec(command);
			 
		} catch (Exception e) {
			_ERROR("Busybox is not Properly Installed");
		}
		
		result.setText("");
	}
	
	
	public void _EmptyFolderClean() {
		_Info_or_Help("Update Required", "Download Latest version to use Features");
	}
	
	
	public void _TmpFilesCleaner() {
		_Info_or_Help("Update Required", "Download Latest version to use Features");
	}
	
	
	public void _dynamicAction() {
		if (dynumic.equals("#enable cda")) {
			set.edit().putString("cda", "1").commit();
			SketchwareUtil.showMessage(getApplicationContext(), "✅ Custom Directory Advanced Mode Enabled ");
		}
		if (dynumic.contains("#enc")) {
			if (dynumic.contains("#enc")) {
				variable = dynumic.replaceFirst("enc", "");
				_DecryptedStringKey(variable, "Royalls");
				expired = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								variable = decrypted;
							}
						});
					}
				};
				_timer.schedule(expired, (int)(150));
			}
			if (dynumic.contains("#enc#once")) {
				variable = dynumic.replaceFirst("#enc#once", "");
				_DecryptedStringKey(variable, "Royalls");
				expired = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (decrypted.contains(Random)) {
									variable = decrypted.replaceFirst(Random, "");
								}
							}
						});
					}
				};
				_timer.schedule(expired, (int)(150));
			}
		}
		else {
			variable = dynumic;
		}
		if (dynumic.contains("6270") || dynumic.contains("6278")) {
			d1.setTitle("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
			d1.setIcon(R.drawable.storage_2);
			d1.setMessage("It Looks like Premium Key.\nGo to premium page to use this key.");
			d1.setPositiveButton("Go", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					i.setClass(getApplicationContext(), PremiumActivity.class);
					startActivity(i);
				}
			});
			d1.create().show();
		}
		if (dynumic.contains("1211")) {
			_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "It looks like upgraded KEY.\nplease use latest version to support\nthis KEY");
		}
		expired = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (variable.contains("#cmd")) {
							Runner = variable.replaceFirst("#cmd", "");
							try {
								    final String command = Runner; 
								    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
								            .setTitle("⚡ 𝗣𝗲𝗿𝗳𝗼𝗿𝗺𝗶𝗻𝗴 𝗔𝗰𝘁𝗶𝗼𝗻")
								            .setMessage("        Please wait...")
								            .setCancelable(false)
								            .create();
								
								    alertDialog.show();
								
								    
								    new Handler().postDelayed(new Runnable() {
									        @Override
									        public void run() {
										            try {
											                java.lang.Process process = java.lang.Runtime.getRuntime().exec("su");
											                java.io.DataOutputStream outputStream = new java.io.DataOutputStream(process.getOutputStream());
											
											                outputStream.writeBytes(command + "\n");
											                outputStream.flush();
											
											                outputStream.writeBytes("exit\n");
											                outputStream.flush();
											
											                int exitCode = process.waitFor();
											
											                alertDialog.dismiss(); 
											
											                if (exitCode == 0) {
												                  
												SketchwareUtil.showMessage(getApplicationContext(), "✅ Action Performed Sucessfully");
												                } else {
												                    
												_Error();
												                }
											            } catch (Exception e) {
											                e.printStackTrace();
											                alertDialog.dismiss(); 
											                Toast.makeText(MainActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
											            }
										        }
									    }, 100); 
							} catch (Exception e) {
								    e.printStackTrace();
							}
							
						}
						if (variable.contains("#cmd#output")) {
							Runner = variable.replaceFirst("#cmd#output", "");
							try {
								   
								    final String command = Runner;
								
								    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
								            .setTitle("⚡ 𝗣𝗲𝗿𝗳𝗼𝗿𝗺𝗶𝗻𝗴 𝗔𝗰𝘁𝗶𝗼𝗻")
								            .setMessage("        Please wait...")
								            .setCancelable(false)
								            .create();
								
								    alertDialog.show();
								
								    final TextView result = findViewById(R.id.result); 
								    new Handler().postDelayed(new Runnable() {
									        @Override
									        public void run() {
										            try {
											                java.lang.Process process = java.lang.Runtime.getRuntime().exec("su");
											                java.io.DataOutputStream outputStream = new java.io.DataOutputStream(process.getOutputStream());
											
											                outputStream.writeBytes(command + "\n");
											                outputStream.flush();
											
											                outputStream.writeBytes("exit\n");
											                outputStream.flush();
											
											                int exitCode = process.waitFor();
											
											                alertDialog.dismiss();
											
											                final StringBuilder outputText = new StringBuilder();
											                java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
											                String line;
											                while ((line = reader.readLine()) != null) {
												                    outputText.append(line).append("\n");
												
												                    
												                    runOnUiThread(new Runnable() {
													                        @Override
													                        public void run() {
														                            result.setText(outputText.toString());
														                        }
													                    });
												                }
											
											                final StringBuilder errorText = new StringBuilder();
											                java.io.BufferedReader errorReader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getErrorStream()));
											                while ((line = errorReader.readLine()) != null) {
												                    errorText.append(line).append("\n");
												                }
											
											                if (exitCode == 0) {
												                    runOnUiThread(new Runnable() {
													                        @Override
													                        public void run() {
														d1.setTitle("𝗢𝘂𝘁𝗽𝘂𝘁 or Result");
														d1.setIcon(R.drawable.listj);
														d1.setMessage(result.getText().toString());
														d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
															@Override
															public void onClick(DialogInterface _dialog, int _which) {
																
															}
														});
														d1.create().show();
														result.setText("");
														                        }
													                    });
												                } else {
												                    runOnUiThread(new Runnable() {
													                        @Override
													                        public void run() {
														                            result.setText(errorText.toString());
														_Error();
														                        }
													                    });
												                }
											            } catch (Exception e) {
											                e.printStackTrace();
											                alertDialog.dismiss(); 
											                final String errorMessage = "Error: " + e.getMessage();
											                runOnUiThread(new Runnable() {
												                    @Override
												                    public void run() {
													                        result.setText(errorMessage);
													                        Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
													                    }
												                });
											            }
										        }
									    }, 100);
							} catch (Exception e) {
								    e.printStackTrace();
							}
							
						}
					}
				});
			}
		};
		_timer.schedule(expired, (int)(400));
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
	
	
	public void _Note() {
		Notice.setTitle("𝗜𝗺𝗽𝗼𝗿𝘁𝗮𝗻𝘁 𝗡𝗼𝘁𝗶𝗰𝗲");
		Notice.setIcon(R.drawable.listj);
		Notice.setMessage("Please Understand the Following Points Carefully.\nAnd Check All Tick for Proceed.\n");
		LinearLayout noticc = new LinearLayout(MainActivity.this);
		noticc.setOrientation(LinearLayout.VERTICAL);
		
		LinearLayout.LayoutParams notec = new LinearLayout.LayoutParams(
		    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		
		final CheckBox notice1 = new CheckBox(MainActivity.this);
		notice1.setText("Some feature may not work on all devices");
		notice1.setLayoutParams(notec);
		noticc.addView(notice1);
		final CheckBox notice2 = new CheckBox(MainActivity.this);
		notice2.setText("Never Collect Any Data");
		notice2.setLayoutParams(notec);
		noticc.addView(notice2);
		final CheckBox notice3 = new CheckBox(MainActivity.this);
		notice3.setText("Never Ask for Any Permission (Only Root)");
		notice3.setLayoutParams(notec);
		noticc.addView(notice3);
		final CheckBox notice4 = new CheckBox(MainActivity.this);
		notice4.setText("No Background work (Except Module)");
		notice4.setLayoutParams(notec);
		noticc.addView(notice4);
		final CheckBox notice5 = new CheckBox(MainActivity.this);
		notice5.setText("Most Powerfull Cleaner Ever Made");
		notice5.setLayoutParams(notec);
		noticc.addView(notice5);
		
		Notice.setView(noticc);
		Notice.setPositiveButton("⏩ Next", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if (((notice1.isChecked() && notice2.isChecked()) && notice3.isChecked()) && (notice4.isChecked() && notice5.isChecked())) {
					set.edit().putString("notice", "1").commit();
					SketchwareUtil.showMessage(getApplicationContext(), "❣️ Thanks For Your Understanding");
				}
				else {
					_Note();
				}
			}
		});
		Notice.create().show();
	}
	
	
	public void _Themer(final View _view) {
		if (!(set.getString("colorcode", "").length() > 1)) {
			_view.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFE8F5E9));
		}
		else {
			try {
				String colorCode = set.getString("colorcode", "");
				int color = Color.parseColor(colorCode);
				
				String radiusString = set.getString("radius", "");
				int radius = Integer.parseInt(radiusString);
				
				_view.setBackground(new GradientDrawable() {
					    public GradientDrawable getIns(int a, int b) {
						        setCornerRadius(a);
						        setColor(b);
						        return this;
						    }
				}.getIns(radius, color));
				
			} catch (Exception e) {
				set.edit().remove("colorcode").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "--- Color Reset ---  \nReason : wrong color code found");
			}
		}
	}
	
	
	public void _Root(final String _cmd, final String _Title, final String _Toast) {
		try {
			   
			    final String command = _cmd;
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
			            .setTitle(_Title)
			            .setMessage("        Please wait...")
			            .setCancelable(false)
			            .create();
			
			    alertDialog.show();
			
			    final TextView result = findViewById(R.id.result); 
			    new Handler().postDelayed(new Runnable() {
				        @Override
				        public void run() {
					            try {
						                java.lang.Process process = java.lang.Runtime.getRuntime().exec("su");
						                java.io.DataOutputStream outputStream = new java.io.DataOutputStream(process.getOutputStream());
						
						                outputStream.writeBytes(command + "\n");
						                outputStream.flush();
						
						                outputStream.writeBytes("exit\n");
						                outputStream.flush();
						
						                int exitCode = process.waitFor();
						
						                alertDialog.dismiss();
						
						                final StringBuilder outputText = new StringBuilder();
						                java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
						                String line;
						                while ((line = reader.readLine()) != null) {
							                    outputText.append(line).append("\n");
							
							                    
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(outputText.toString());
									                        }
								                    });
							                }
						
						                final StringBuilder errorText = new StringBuilder();
						                java.io.BufferedReader errorReader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getErrorStream()));
						                while ((line = errorReader.readLine()) != null) {
							                    errorText.append(line).append("\n");
							                }
						
						                if (exitCode == 0) {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									SketchwareUtil.showMessage(getApplicationContext(), _Toast);
									result.setText("");
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(errorText.toString());
									_Error();
									                        }
								                    });
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                final String errorMessage = "Error: " + e.getMessage();
						                runOnUiThread(new Runnable() {
							                    @Override
							                    public void run() {
								                        result.setText(errorMessage);
								                        Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
								                    }
							                });
						            }
					        }
				    }, 100);
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _ERROR(final String _Error) {
		Errar.setTitle("𝗘𝗿𝗿𝗼𝗿");
		Errar.setMessage(_Error);
		Errar.setIcon(R.drawable.icon_1);
		Errar.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		Errar.create().show();
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
	
	
	public void _WelcomeProfile() {
		Welcome.setTitle("𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝗟𝗶𝘁𝗲 𝗣𝗿𝗼");
		Welcome.setView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.setup, null));
		Welcome.setIcon(R.drawable.rock);
		Welcome.setPositiveButton("⏩ 𝗡𝗲𝘅𝘁", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		Welcome.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				SketchwareUtil.showMessage(getApplicationContext(), "🪧 You Must Agree to use this App");
				finish();
			}
		});
		final AlertDialog WelcomeWelcome = Welcome.create();
		WelcomeWelcome.show();
		((TextView) WelcomeWelcome.getWindow().getDecorView().findViewById(R.id.head)).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFCCFF90));
	}
	
	
	public void _CustomCleaner(final String _SharedPreferance) {
		if (premium.getString("purchased", "").equals("1")) {
			if (dir.getString(_SharedPreferance, "").length() > 5) {
				_Root(Empty, "⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠", "🥏 Cleared Sucessfully");
			}
			else {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Save Some directories first for cleaning");
			}
		}
		else {
			_RequirePremium();
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
