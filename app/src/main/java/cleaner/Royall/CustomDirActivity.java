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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
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

public class CustomDirActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private String decrypted = "";
	private double Variable = 0;
	private String variable = "";
	private String Info = "";
	private String approve = "";
	private String approve2 = "";
	private String approve3 = "";
	private String PremiumCheck = "";
	private String slot = "";
	private String data = "";
	private String preset1 = "";
	private String preset2 = "";
	private String preset3 = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear3;
	private LinearLayout header;
	private TextView info;
	private HorizontalScrollView hscroll3;
	private LinearLayout box;
	private LinearLayout linear10;
	private ScrollView vscroll3;
	private ImageView imageview2;
	private TextView headL;
	private LinearLayout linear4;
	private Switch cust_enable;
	private ImageView helpp;
	private TextView backup0;
	private TextView restore0;
	private LinearLayout linear8;
	private TextView error;
	private LinearLayout layooo;
	private HorizontalScrollView hscroll7;
	private ImageView paste;
	private ImageView adder;
	private EditText customdirrr;
	private TextView textview1;
	private TextView clean;
	private TextView dirlist;
	private TextView dirmanegr;
	private TextView presetManager;
	private LinearLayout linear9;
	private TextView template;
	private CheckBox subtitle;
	private CheckBox alarm;
	private CheckBox music;
	private CheckBox movies;
	private CheckBox notificaton;
	private CheckBox audiobooks;
	private CheckBox lostdir;
	private CheckBox ringtone;
	private CheckBox ramdump;
	private CheckBox browser;
	private CheckBox miuiGallerydlt;
	private CheckBox documentsn;
	private TextView result;
	
	private SharedPreferences dir;
	private AlertDialog.Builder Dir;
	private AlertDialog.Builder d1;
	private AlertDialog.Builder d2;
	private AlertDialog.Builder d3;
	private AlertDialog.Builder d2_1;
	private SharedPreferences set;
	private AlertDialog.Builder cust;
	private AlertDialog.Builder br;
	private AlertDialog.Builder restore;
	private AlertDialog.Builder help;
	private TimerTask t;
	private AlertDialog.Builder exmple;
	private AlertDialog.Builder list;
	private AlertDialog.Builder DirOptions;
	private AlertDialog.Builder Errar;
	private AlertDialog.Builder preset;
	private Intent i = new Intent();
	private AlertDialog.Builder prm;
	private SharedPreferences premium;
	private AlertDialog.Builder PreSetManager;
	private AlertDialog.Builder sucess;
	private AlertDialog.Builder psbkp;
	private AlertDialog.Builder one;
	private AlertDialog.Builder AllRestore;
	private AlertDialog.Builder two;
	private TimerTask tt;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.custom_dir);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear3 = findViewById(R.id.linear3);
		header = findViewById(R.id.header);
		info = findViewById(R.id.info);
		hscroll3 = findViewById(R.id.hscroll3);
		box = findViewById(R.id.box);
		linear10 = findViewById(R.id.linear10);
		vscroll3 = findViewById(R.id.vscroll3);
		imageview2 = findViewById(R.id.imageview2);
		headL = findViewById(R.id.headL);
		linear4 = findViewById(R.id.linear4);
		cust_enable = findViewById(R.id.cust_enable);
		helpp = findViewById(R.id.helpp);
		backup0 = findViewById(R.id.backup0);
		restore0 = findViewById(R.id.restore0);
		linear8 = findViewById(R.id.linear8);
		error = findViewById(R.id.error);
		layooo = findViewById(R.id.layooo);
		hscroll7 = findViewById(R.id.hscroll7);
		paste = findViewById(R.id.paste);
		adder = findViewById(R.id.adder);
		customdirrr = findViewById(R.id.customdirrr);
		textview1 = findViewById(R.id.textview1);
		clean = findViewById(R.id.clean);
		dirlist = findViewById(R.id.dirlist);
		dirmanegr = findViewById(R.id.dirmanegr);
		presetManager = findViewById(R.id.presetManager);
		linear9 = findViewById(R.id.linear9);
		template = findViewById(R.id.template);
		subtitle = findViewById(R.id.subtitle);
		alarm = findViewById(R.id.alarm);
		music = findViewById(R.id.music);
		movies = findViewById(R.id.movies);
		notificaton = findViewById(R.id.notificaton);
		audiobooks = findViewById(R.id.audiobooks);
		lostdir = findViewById(R.id.lostdir);
		ringtone = findViewById(R.id.ringtone);
		ramdump = findViewById(R.id.ramdump);
		browser = findViewById(R.id.browser);
		miuiGallerydlt = findViewById(R.id.miuiGallerydlt);
		documentsn = findViewById(R.id.documentsn);
		result = findViewById(R.id.result);
		dir = getSharedPreferences("dir", Activity.MODE_PRIVATE);
		Dir = new AlertDialog.Builder(this);
		d1 = new AlertDialog.Builder(this);
		d2 = new AlertDialog.Builder(this);
		d3 = new AlertDialog.Builder(this);
		d2_1 = new AlertDialog.Builder(this);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		cust = new AlertDialog.Builder(this);
		br = new AlertDialog.Builder(this);
		restore = new AlertDialog.Builder(this);
		help = new AlertDialog.Builder(this);
		exmple = new AlertDialog.Builder(this);
		list = new AlertDialog.Builder(this);
		DirOptions = new AlertDialog.Builder(this);
		Errar = new AlertDialog.Builder(this);
		preset = new AlertDialog.Builder(this);
		prm = new AlertDialog.Builder(this);
		premium = getSharedPreferences("premium", Activity.MODE_PRIVATE);
		PreSetManager = new AlertDialog.Builder(this);
		sucess = new AlertDialog.Builder(this);
		psbkp = new AlertDialog.Builder(this);
		one = new AlertDialog.Builder(this);
		AllRestore = new AlertDialog.Builder(this);
		two = new AlertDialog.Builder(this);
		
		info.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				d1.setTitle("𝗛𝗶𝗱𝗲 𝗧𝗵𝗶𝘀 𝗛𝗶𝗻𝘁");
				d1.setIcon(R.drawable.help1);
				d1.setMessage("It will not shown Next Time When you open Custom Cleaner");
				d1.setPositiveButton("✳️ Hide", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						set.edit().putString("cst hid", "1").commit();
						info.setVisibility(View.GONE);
					}
				});
				d1.create().show();
				return true;
			}
		});
		
		info.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear4.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		cust_enable.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Variable = 0;
				if (!cust_enable.isChecked()) {
					set.edit().remove("cda").commit();
				}
				else {
					cust_enable.setChecked(false);
					_advanceMode();
				}
			}
		});
		
		cust_enable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					cust_enable.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFCCFF90));
				}
				else {
					cust_enable.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF80AB));
				}
			}
		});
		
		helpp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				help.setTitle("𝗖𝘂𝘀𝘁𝗼𝗺 𝗗𝗶𝗿𝗲𝗰𝘁𝗼𝗿𝘆 Help");
				help.setIcon(R.drawable.info_1);
				help.setMessage("• Enter The Directory which you wish to add in Custom cleaner\n• These custom directories will be cleared everytime when you use Custom Cleaner\n• There is 𝑵𝒐 𝒍𝒊𝒎𝒊𝒕 for Custom directories\n• This feature is also useful when some folder or files automatically created on Internal storage \n• You can Also use '*' (star) for subdirectories within a directory\n• To supports /data directories , use Advance Mode\n• For Multi-User (use /data/media/USER/PATH)\n• You Can use PreSets as Template for Different working Profiles\n• You can also use this feature for clearing data of Multiple Apps ...");
				help.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				help.setNegativeButton("📳  Known Bugs", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						exmple.setTitle("𝐊𝐧𝐨𝐰𝐧 𝐁𝐮𝐠𝐬 𝐢𝐧 𝐜𝐮𝐬𝐭𝐨𝐦 𝐜𝐥𝐞𝐚𝐧𝐞𝐫");
						exmple.setIcon(R.drawable.bug);
						exmple.setMessage("Removing or adding a directory may cause error if multiple subdirectories name matching found.\n\n𝐓𝐞𝐦𝐩𝐨𝐫𝐚𝐫𝐲 𝐒𝐨𝐥𝐮𝐭𝐢𝐨𝐧 : \nRemove All such Directory Than Add again\nFirst add small length directory or main directory than sub-directories");
						LinearLayout exmp = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
						TextView xmpl = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
						xmpl.setText(" Example ");
						xmpl.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFC6FF00));
						exmp.addView(xmpl);
						((ViewGroup.MarginLayoutParams) xmpl.getLayoutParams()).setMargins(75, 15, 0, 0);
						
						xmpl.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
								_Info_or_Help("𝗘𝘅𝗮𝗺𝗽𝗹𝗲", "Suppose you have following directories \n\nA/B/C/D\nA/B/\nA/B/C\nA/B/C/D/E\n\n𝐔𝐬𝐞 𝐚𝐬\n\nA/B\nA/B/C\nA/B/C/D\nA/B/C/D/E\n\n• First use shorter length directory than Longer name");
							}
						});
						exmple.setView(exmp);
						exmple.setPositiveButton("OK", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						exmple.create().show();
					}
				});
				help.create().show();
			}
		});
		
		backup0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				br.setTitle("𝐁𝐚𝐜𝐤𝐮𝐩 𝐂𝐮𝐬𝐭𝐨𝐦 𝐃𝐢𝐫𝐞𝐜𝐭𝐨𝐫𝐢𝐞𝐬");
				br.setIcon(R.drawable.submit);
				br.setMessage("You Can Backup Directory list via Clipboard\n");
				LinearLayout bckkp = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
				TextView hnt = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				hnt.setText("𝗕𝗮𝗰𝗸𝘂𝗽 𝗣𝗿𝗲𝗦𝗲𝘁 :");
				bckkp.addView(hnt);
				TextView bkp1 = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				bkp1.setText(" PreSet1 ");
				bkp1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFCCFF90));
				bckkp.addView(bkp1);
				TextView bkp2 = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				bkp2.setText(" PreSet2 ");
				bkp2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFCCFF90));
				bckkp.addView(bkp2);
				TextView bkp3 = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				bkp3.setText(" PreSet3 ");
				bkp3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFCCFF90));
				bckkp.addView(bkp3);
				((ViewGroup.MarginLayoutParams) hnt.getLayoutParams()).setMargins(60, 0, 10, 0);
				
				((ViewGroup.MarginLayoutParams) bkp1.getLayoutParams()).setMargins(5, 0, 10, 0);
				
				((ViewGroup.MarginLayoutParams) bkp3.getLayoutParams()).setMargins(10, 0, 0, 0);
				
				bkp1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Backup("custdir1", "𝟭", "1");
					}
				});
				bkp2.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Backup("custdir2", "𝟮", "2");
					}
				});
				bkp3.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Backup("custdir3", "𝟯", "3");
					}
				});
				br.setView(bckkp);
				br.setPositiveButton("📋 𝑩𝒂𝒄𝒌𝒖𝒑 𝒕𝒐 𝑪𝒍𝒊𝒑𝒃𝒐𝒂𝒓𝒅", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_BackUp("custdir");
					}
				});
				br.create().show();
				
			}
		});
		
		restore0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				restore.setTitle("𝐑𝐞𝐬𝐭𝐨𝐫𝐞 𝐂𝐮𝐬𝐭𝐨𝐦 𝐃𝐢𝐫𝐞𝐜𝐭𝐨𝐫𝐢𝐞𝐬");
				restore.setIcon(R.drawable.backup);
				restore.setMessage("You Can Restore Directories From a File or Clipboard");
				LinearLayout svv = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
				svv.setOrientation(LinearLayout.VERTICAL);
				HorizontalScrollView hvv = new HorizontalScrollView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
				 
				svv.addView(hvv);
				EditText text = new EditText(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
				text.setHint("Paste Or Enter BackUp Text Here...");
				hvv.addView(text);
				TextView paste = new TextView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				paste.setText(" 📋Paste ");
				paste.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFE1BEE7));
				svv.addView(paste);
				((ViewGroup.MarginLayoutParams) paste.getLayoutParams()).setMargins(60, 3, 0, 0);
				
				((ViewGroup.MarginLayoutParams) text.getLayoutParams()).setMargins(60, 0, 50, 0);
				
				paste.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("Heading=CustomDirectories")) {
							text.setText(String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()));
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "❗ Not a Valid Text found in Clipboard ");
						}
					}
				});
				restore.setView(svv);
				restore.setPositiveButton("⬇️ 𝑹𝒆𝒔𝒕𝒐𝒓𝒆", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							variable = text.getText().toString();
							if (variable.length() > 8) {
								if (variable.contains("ID=Single")) {
									_DirectoryRestoreSingle();
								}
								else {
									_DirectoriesRestorer();
								}
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "No BackUp Text Found");
							}
						} catch (Exception e) {
							 
						}
					}
				});
				restore.setNeutralButton("📋  𝑹𝒆𝒔𝒕𝒐𝒓𝒆 𝒇𝒓𝒐𝒎 𝑪𝒍𝒊𝒑𝒃𝒐𝒂𝒓𝒅", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("Heading=CustomDirectories")) {
							variable = String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText());
							if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("ID=Single")) {
								_DirectoryRestoreSingle();
							}
							else {
								_DirectoriesRestorer();
							}
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "❗ Not a Valid Text found in Clipboard ");
						}
					}
				});
				final AlertDialog restorerestore = restore.create();
				restorerestore.show();
				 
			}
		});
		
		paste.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("/") && (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("sdcard") || String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("emulated"))) && !(String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("\n") || String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains(" "))) {
					customdirrr.setText(String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "❗ Not a Valid Directory in Clipboard");
				}
			}
		});
		
		adder.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		customdirrr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		customdirrr.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				String itemsX = "/sdcard/\n/sdcard/*\n/storage/emulated/0/*\n/storage/emulated/0/\n/data/\n/data/*\n/data/media\n/data/media/\n/data/media/*\n/data/media/0\n/data/media/0/\n/data/media/0/*\n/data/data\n/data/data/\n/data/data/*\n/data/user\n/data/user/\n/data/user/*\n/data/user/0\n/data/user/0/\n/data/user/0/*\n/data/user_de\n/data/user_de/\n/data/user_de/*\n/data/user_de/0\n/data/user_de/0/\n/data/user_de/0/*";
				
				String[] itemArray = itemsX.split("\n");
				
				if (Arrays.asList(itemArray).contains(_charSeq)) {
					customdirrr.setError("This directory not Allowed");
					approve = "no";
				} else {
					approve = "yes";
				}
				
				String itemsY = "/data/vendor\n/data/system\n/data/app\n/data/dalvik-cache\n/data/extm\n/data/gsi\n/data/misc\n/data/misc_de\n/data/misc_ce\n/data/adb\n/data/property\n/data/recovery\n/data/system_ce\n/data/system_de\n/data/unencrypted\n/data/vendor_ce\n/data/vendor_de"; 
				
				String[] itemarray = itemsY.split("\n");
				
				if (Arrays.stream(itemarray).anyMatch(_charSeq::contains)) {
					customdirrr.setError("Working on This directory is NOT Allowed");
					approve2 = "no";
				} else {
					approve2 = "yes";
				}
				
				String arlyarly = "/sdcard/\n/storage/emulated/0/\n/data/"; 
				
				String[] arly = arlyarly.split("\n");
				
				if (Arrays.stream(arly).anyMatch(_charSeq::contains)) {
					approve3 = "yes";
				} else {
					approve2 = "no";
				}
				
				_CharRemover(_charSeq, " ", "Currently 'spaces' not allowed so Removed");
				_CharRemover(_charSeq, "\n", "Next line not allowed , so Removed");
				_CharRemover(_charSeq, "**", "Double 'star' not allowed , so Removed");
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Variable = 12;
				_CustomDir("𝗖𝘂𝘀𝘁𝗼𝗺 𝗗𝗶𝗿𝗲𝗰𝘁𝗼𝗿𝘆", "custdir");
			}
		});
		
		clean.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (customdirrr.getText().toString().length() > 5) {
					Variable = 11;
					preset.setTitle("Add to 𝗖𝘂𝘀𝘁𝗼𝗺 𝗣𝗿𝗲𝗦𝗲𝘁");
					preset.setMessage("Select PreSet for Your Directory : \n".concat(customdirrr.getText().toString()));
					preset.setIcon(R.drawable.multiple_1);
					preset.setPositiveButton("𝙋𝙧𝙚𝙎𝙚𝙩 1", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							_CustomDir("𝗖𝘂𝘀𝘁𝗼𝗺 𝗣𝗿𝗲𝗦𝗲𝘁 1", "custdir1");
						}
					});
					preset.setNegativeButton("𝙋𝙧𝙚𝙎𝙚𝙩 2", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							_CustomDir("𝗖𝘂𝘀𝘁𝗼𝗺 𝗣𝗿𝗲𝗦𝗲𝘁 2", "custdir2");
						}
					});
					preset.setNeutralButton("𝙋𝙧𝙚𝙎𝙚𝙩 3", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							_CustomDir("𝗖𝘂𝘀𝘁𝗼𝗺 𝗣𝗿𝗲𝗦𝗲𝘁 3", "custdir3");
						}
					});
					preset.create().show();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "🪧 Write any Directory First to Add");
				}
			}
		});
		
		dirlist.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (dir.getString("custdir", "").length() > 5) {
					d3.setTitle("𝐂𝐮𝐬𝐭𝐨𝐦 𝐃𝐢𝐫𝐞𝐜𝐭𝐨𝐫𝐲 𝐋𝐢𝐬𝐭");
					d3.setIcon(R.drawable.list);
					d3.setMessage(dir.getString("custdir", "").replace(" ", "\n"));
					d3.setPositiveButton("OK", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					d3.setNeutralButton("❎ Delete All", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							d2_1.setTitle("𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
							d2_1.setIcon(R.drawable.info_2);
							d2_1.setMessage("This Will Clear All Custom Directories saved by you ");
							d2_1.setPositiveButton("⛔ Delete", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									dir.edit().remove("custdir").commit();
									_checkbox_selector();
									SketchwareUtil.showMessage(getApplicationContext(), "❗ All Directories are Deleted");
								}
							});
							d2_1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							d2_1.create().show();
						}
					});
					d3.create().show();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "🪧 The Custom Directory List is Empty");
				}
			}
		});
		
		dirmanegr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_CustomView("custdir", "𝗗𝗶𝗿𝗲𝗰𝘁𝗼𝗿𝘆 𝗠𝗮𝗻𝗮𝗴𝗲𝗿");
			}
		});
		
		presetManager.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				PreSetManager.setTitle("𝗣𝗿𝗲𝗦𝗲𝘁 𝗠𝗮𝗻𝗮𝗴𝗲𝗿");
				PreSetManager.setMessage("Select a PreSet to Manage");
				PreSetManager.setIcon(R.drawable.multiple_2);
				PreSetManager.setPositiveButton("𝙋𝙧𝙚𝙎𝙚𝙩 1", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_CustomView("custdir1", "𝗣𝗿𝗲𝗦𝗲𝘁 1 𝗠𝗮𝗻𝗮𝗴𝗲𝗿");
					}
				});
				PreSetManager.setNegativeButton("𝙋𝙧𝙚𝙎𝙚𝙩 2", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_CustomView("custdir2", "𝗣𝗿𝗲𝗦𝗲𝘁 2 𝗠𝗮𝗻𝗮𝗴𝗲𝗿");
					}
				});
				PreSetManager.setNeutralButton("𝙋𝙧𝙚𝙎𝙚𝙩 3", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_CustomView("custdir3", "𝗣𝗿𝗲𝗦𝗲𝘁 3 𝗠𝗮𝗻𝗮𝗴𝗲𝗿");
					}
				});
				PreSetManager.create().show();
			}
		});
		
		subtitle.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		subtitle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/Subtitles")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/Subtitles"))).commit();
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/Subtitles"), "")).commit();
				}
			}
		});
		
		alarm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/Alarms")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/Alarms"))).commit();
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/Alarms"), "")).commit();
				}
			}
		});
		
		music.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/Music")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/Music"))).commit();
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/Music"), "")).commit();
				}
			}
		});
		
		movies.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/Movies")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/Movies"))).commit();
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/Movies"), "")).commit();
				}
			}
		});
		
		notificaton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/Notifications")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/Notifications"))).commit();
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/Notifications"), "")).commit();
				}
			}
		});
		
		audiobooks.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		audiobooks.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/Audiobooks")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/Audiobooks"))).commit();
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/Audiobooks"), "")).commit();
				}
			}
		});
		
		lostdir.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/LOST.DIR")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/LOST.DIR"))).commit();
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/LOST.DIR"), "")).commit();
				}
			}
		});
		
		ringtone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/Ringtones")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/Ringtones"))).commit();
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/Ringtones"), "")).commit();
				}
			}
		});
		
		ramdump.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/ramdump")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/ramdump"))).commit();
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/ramdump"), "")).commit();
				}
			}
		});
		
		browser.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/browser")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/browser"))).commit();
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/browser"), "")).commit();
				}
			}
		});
		
		miuiGallerydlt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		miuiGallerydlt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/DCIM/.globalTrash")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/DCIM/.globalTrash"))).commit();
						SketchwareUtil.showMessage(getApplicationContext(), "🪧 Sensitive Directory added");
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/DCIM/.globalTrash"), "")).commit();
				}
			}
		});
		
		documentsn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					if (dir.getString("custdir", "").contains("/storage/emulated/0/Documents")) {
						
					}
					else {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat("/storage/emulated/0/Documents"))).commit();
						SketchwareUtil.showMessage(getApplicationContext(), "🪧 Sensitive Directory added");
					}
				}
				else {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat("/storage/emulated/0/Documents"), "")).commit();
				}
			}
		});
	}
	
	private void initializeLogic() {
		if (set.getString("cda", "").equals("1")) {
			cust_enable.setChecked(true);
		}
		if (!set.getString("customSetup", "").equals("1")) {
			helpp.performClick();
			set.edit().putString("customSetup", "1").commit();
		}
		_color1();
		header.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFC6FF00));
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		setTitle("💻 𝗖𝘂𝘀𝘁𝗼𝗺 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
		_checkbox_selector();
		if (set.getString("cst hid", "").contains("1")) {
			info.setVisibility(View.GONE);
		}
		error.setVisibility(View.GONE);
		dirlist.setVisibility(View.GONE);
		_Animation();
	}
	public void _color1() {
		if (set.getString("cda", "").equals("1")) {
			cust_enable.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFCCFF90));
		}
		else {
			cust_enable.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF80AB));
		}
		box.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)35, (int)3, 0xFF5D4037, 0xFFFFFDE7));
		_Themer(textview1);
		_Themer(clean);
		dirlist.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFCCFF90));
		presetManager.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFCCFF90));
		dirmanegr.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFCCFF90));
		backup0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFCCFF90));
		restore0.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFCCFF90));
	}
	
	
	public void _checkbox_selector() {
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Subtitles")) {
			subtitle.setChecked(true);
		}
		else {
			subtitle.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/DCIM/.globalTrash")) {
			miuiGallerydlt.setChecked(true);
		}
		else {
			miuiGallerydlt.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Alarms")) {
			alarm.setChecked(true);
		}
		else {
			alarm.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Music")) {
			music.setChecked(true);
		}
		else {
			music.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Documents")) {
			documentsn.setChecked(true);
		}
		else {
			documentsn.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Movies")) {
			movies.setChecked(true);
		}
		else {
			movies.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Ringtones")) {
			ringtone.setChecked(true);
		}
		else {
			ringtone.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Notifications")) {
			notificaton.setChecked(true);
		}
		else {
			notificaton.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Audiobooks")) {
			audiobooks.setChecked(true);
		}
		else {
			audiobooks.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/ramdump")) {
			ramdump.setChecked(true);
		}
		else {
			ramdump.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/LOST.DIR")) {
			lostdir.setChecked(true);
		}
		else {
			lostdir.setChecked(false);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/browser")) {
			browser.setChecked(true);
		}
		else {
			browser.setChecked(false);
		}
		
	}
	
	
	public void _advanceMode() {
		if (Variable == 3) {
			d2.setTitle("𝗔𝗱𝘃𝗮𝗻𝗰𝗲 𝗠𝗼𝗱𝗲");
			d2.setIcon(R.drawable.checklist_2);
			d2.setMessage("Are you sure to Enable \"/data\" directories support for Custom Cleaner ?");
			d2.setPositiveButton("⭕ Enable", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					set.edit().putString("cda", "1").commit();
					cust_enable.setChecked(true);
					SketchwareUtil.showMessage(getApplicationContext(), "✅ Sucessfully Enabled Advanced Mode");
				}
			});
			d2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			d2.create().show();
		}
		else {
			d2.setTitle("𝗔𝗱𝘃𝗮𝗻𝗰𝗲 𝗠𝗼𝗱𝗲");
			d2.setIcon(R.drawable.checklist_2);
			d2.setMessage("This Allow you to use \"/data/\" directories\n• It may be risky if you don't use carefully.\n\n𝑪𝒐𝒏𝒇𝒊𝒓𝒎𝒂𝒕𝒊𝒐𝒏𝒔 : ".concat(String.valueOf((long)(Variable)).concat("/3")));
			d2.setPositiveButton("⏩ NEXT", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					Variable++;
					_advanceMode();
				}
			});
			d2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			d2.create().show();
		}
	}
	
	
	public void _Animation() {
		if (set.getString("Animation", "").equals("1")) {
			final String textToType = headL.getText().toString();
			final int[] charIndex = {0};
			
			final Handler handler = new Handler();
			handler.postDelayed(new Runnable() {
				    @Override
				    public void run() {
					        headL.setText(textToType.substring(0, charIndex[0]++));
					        if (charIndex[0] <= textToType.length()) {
						            handler.postDelayed(this, 10);
						        }
					    }
			}, 100);
		}
		else {
			
		}
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						try {
							info.setText("𝗣𝗿𝗼 𝗧𝗶𝗽 : ".concat(String.valueOf(new String[]{"Enter The Directory which you wish to add in Custom cleaner\nThese custom directories will be cleared everytime when you use Custom Cleaner\nThere is 𝑵𝒐 𝒍𝒊𝒎𝒊𝒕 for Custom directories\nThis feature is also useful when some folder or files automatically created on Internal storage\nYou can Also use '*' (star) for subdirectories within a directory\nTo supports /data directories , use Advance Mode\nFor Multi-User (use /data/media/USER/PATH)\nYou Can use PreSets as Template for Different working Profiles\nYou can also use this feature for clearing data of Multiple Apps\nYou are self responsible for which directory or Path used"}[new java.util.Random().nextInt(1)].split("\n")[new java.util.Random().nextInt("Enter The Directory which you wish to add in Custom cleaner\nThese custom directories will be cleared everytime when you use Custom Cleaner\nThere is 𝑵𝒐 𝒍𝒊𝒎𝒊𝒕 for Custom directories\nThis feature is also useful when some folder or files automatically created on Internal storage\nYou can Also use '*' (star) for subdirectories within a directory\nTo supports /data directories , use Advance Mode\nFor Multi-User (use /data/media/USER/PATH)\nYou Can use PreSets as Template for Different working Profiles\nYou can also use this feature for clearing data of Multiple Apps\nYou are self responsible for which directory or Path used".split("\n").length)])));
						} catch (Exception e) {
							info.setText("⚠️ Something went Wrong. Unable to load Helping statement");
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(t, (int)(0), (int)(4000));
	}
	
	
	public void _Info_or_Help(final String _Title, final String _Msg) {
		d1.setTitle(_Title);
		d1.setMessage(_Msg);
		d1.setIcon(R.drawable.information);
		d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d1.create().show();
	}
	
	
	public void _CharRemover(final String _chr, final String _rmv, final String _output) {
		if (_chr.contains(_rmv)) {
			customdirrr.setText(customdirrr.getText().toString().replace(_rmv, ""));
			error.setVisibility(View.VISIBLE);
			error.setText("        ⚠️  ".concat(_output));
			t = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							error.setVisibility(View.GONE);
						}
					});
				}
			};
			_timer.schedule(t, (int)(1500));
		}
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
	
	
	public void _Errr() {
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
	
	
	public void _CustomDir(final String _Title, final String _SharedPreferances) {
		try {
			if (approve2.equals("yes") && (approve.equals("yes") && approve3.equals("yes"))) {
				if (customdirrr.getText().toString().contains("/data/")) {
					if (set.getString("cda", "").equals("1")) {
						if (!dir.getString(_SharedPreferances, "").contains(customdirrr.getText().toString())) {
							dir.edit().putString(_SharedPreferances, dir.getString(_SharedPreferances, "").concat(" ".concat(customdirrr.getText().toString()))).commit();
							_Toast("Successfully Added ");
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "🪧 This Directly is Already Added");
						}
					}
					else {
						_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Enable 'Advance Mode' to support \"/data\" directories");
					}
				}
				else {
					if (!dir.getString(_SharedPreferances, "").contains(customdirrr.getText().toString())) {
						dir.edit().putString(_SharedPreferances, dir.getString(_SharedPreferances, "").concat(" ".concat(customdirrr.getText().toString()))).commit();
						_Sucess("Successfully Added");
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "🪧 This Directly is Already Added");
					}
				}
			}
			else {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Enter a supported directory to proceed");
			}
		} catch (Exception e) {
			_ERROR("Something went wrong\n\n      Try Again ");
		}
	}
	
	
	public void _require_premium() {
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
	
	
	public void _CustomView(final String _SharedPref, final String _Title) {
		if (dir.getString(_SharedPref, "").length() > 5) {
			list.setTitle(_Title);
			list.setView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.custom, null));
			list.setIcon(R.drawable.list);
			list.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			list.setNeutralButton("❎ Remove All", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					d2_1.setTitle("𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
					d2_1.setIcon(R.drawable.info_2);
					d2_1.setMessage("This Will Remove All Custom Directories saved by you ");
					d2_1.setPositiveButton("⛔ Delete", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							dir.edit().remove(_SharedPref).commit();
							_checkbox_selector();
							SketchwareUtil.showMessage(getApplicationContext(), "❗ All Directories are Deleted");
						}
					});
					d2_1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					d2_1.create().show();
				}
			});
			final AlertDialog listlist = list.create();
			listlist.show();
			try {
				    String allTexts = dir.getString(_SharedPref, "").replace(" ", "\n").replaceFirst("\n", "").toString();
				
				    
				    String[] lines = allTexts.split("\n");
				
				    ArrayList<String> listItems = new ArrayList<String>();
				    for (String line : lines) {
					        listItems.add(line);
					    }
				
				    ArrayAdapter<String> adapter = new ArrayAdapter<String>(CustomDirActivity.this, android.R.layout.simple_list_item_1, listItems);
				
				    ((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).setAdapter(adapter);
				    ((BaseAdapter)((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).getAdapter()).notifyDataSetChanged();
			} catch (Exception e) {
				    e.printStackTrace();
			}
			((TextView) listlist.getWindow().getDecorView().findViewById(R.id.coppy)).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFCCFF90));
			((TextView) listlist.getWindow().getDecorView().findViewById(R.id.cleanall)).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFCCFF90));
			((TextView) listlist.getWindow().getDecorView().findViewById(R.id.undo)).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFCCFF90));
			((TextView) listlist.getWindow().getDecorView().findViewById(R.id.undo)).setVisibility(View.GONE);
			((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
				    @Override
				    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
					       
					        String variable = (String) parent.getItemAtPosition(position);
					       
					DirOptions.setTitle("𝘿𝙞𝙧𝙚𝙘𝙩𝙤𝙧𝙮 𝙈𝙖𝙣𝙖𝙜𝙚𝙧");
					DirOptions.setIcon(R.drawable.listj);
					DirOptions.setMessage("Select An Option For your Directory :\n".concat(variable));
					DirOptions.setPositiveButton("⚡ Clean", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							_Info_or_Help("Update Required", "Download Latest version to use Features");
						}
					});
					DirOptions.setNegativeButton("🗑️ Remove", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							if (dir.getString(_SharedPref, "").contains(variable)) {
								((TextView) listlist.getWindow().getDecorView().findViewById(R.id.undo)).setVisibility(View.VISIBLE);
								dir.edit().putString(_SharedPref, dir.getString(_SharedPref, "").replaceFirst(" ".concat(variable), "")).commit();
								SketchwareUtil.showMessage(getApplicationContext(), "✅ Successfully Removed");
								_checkbox_selector();
								if (dir.getString(_SharedPref, "").length() > 5) {
									try {
										    String allTexts = dir.getString(_SharedPref, "").replace(" ", "\n").replaceFirst("\n", "").toString();
										
										    
										    String[] lines = allTexts.split("\n");
										
										    ArrayList<String> listItems = new ArrayList<String>();
										    for (String line : lines) {
											        listItems.add(line);
											    }
										
										    ArrayAdapter<String> adapter = new ArrayAdapter<String>(CustomDirActivity.this, android.R.layout.simple_list_item_1, listItems);
										
										    ((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).setAdapter(adapter);
										    ((BaseAdapter)((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).getAdapter()).notifyDataSetChanged();
									} catch (Exception e) {
										    e.printStackTrace();
									}
								}
								else {
									listlist.dismiss();
								}
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "🪧 This Directly is not found");
							}
						}
					});
					DirOptions.setNeutralButton("📃 Copy", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", variable));
							SketchwareUtil.showMessage(getApplicationContext(), "✅ Copied to Clipboard");
						}
					});
					DirOptions.create().show();
					((TextView) listlist.getWindow().getDecorView().findViewById(R.id.undo)).setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							if (!dir.getString(_SharedPref, "").contains(variable) && (variable.length() > 5)) {
								dir.edit().putString(_SharedPref, dir.getString(_SharedPref, "").concat(" ".concat(variable))).commit();
								_checkbox_selector();
								try {
									    String allTexts = dir.getString(_SharedPref, "").replace(" ", "\n").replaceFirst("\n", "").toString();
									
									    
									    String[] lines = allTexts.split("\n");
									
									    ArrayList<String> listItems = new ArrayList<String>();
									    for (String line : lines) {
										        listItems.add(line);
										    }
									
									    ArrayAdapter<String> adapter = new ArrayAdapter<String>(CustomDirActivity.this, android.R.layout.simple_list_item_1, listItems);
									
									    ((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).setAdapter(adapter);
									    ((BaseAdapter)((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).getAdapter()).notifyDataSetChanged();
								} catch (Exception e) {
									    e.printStackTrace();
								}
								SketchwareUtil.showMessage(getApplicationContext(), "✅ Successfully UnRemoved");
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "🗒️ Nothing to Undo OR Directory Already Exist");
							}
							((TextView) listlist.getWindow().getDecorView().findViewById(R.id.undo)).setVisibility(View.GONE);
						}
					});
					    }
			});
			((TextView) listlist.getWindow().getDecorView().findViewById(R.id.coppy)).setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					try {
						((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", dir.getString(_SharedPref, "").replace(" ", "\n")));
						SketchwareUtil.showMessage(getApplicationContext(), "✅ Copied to Clipboard ");
					} catch (Exception e) {
						SketchwareUtil.showMessage(getApplicationContext(), "⚠️ Something went wrong or Clipboard Permission Denied");
					}
				}
			});
			((TextView) listlist.getWindow().getDecorView().findViewById(R.id.cleanall)).setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					_Info_or_Help("Update Required", "Download Latest version to use Features");
				}
			});
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), "🪧 The Custom Directory List is Empty");
		}
	}
	
	
	public void _Sucess(final String _Msg) {
		sucess.setTitle(_Msg);
		sucess.setIcon(R.drawable.check);
		sucess.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		sucess.create().show();
	}
	
	
	public void _Toast(final String _Toast) {
		SketchwareUtil.CustomToastWithIcon(getApplicationContext(), _Toast, 0xFF388E3C, 14, 0xFFCCFF90, 30, SketchwareUtil.BOTTOM, R.drawable.check);
	}
	
	
	public void _BackUp(final String _SharedPref) {
		if (dir.getString(_SharedPref, "").length() > 10) {
			variable = "Do_not_modify_Anything_".concat(dir.getString(_SharedPref, "").replace(" /storage/emulated/0/", "🚀"));
			try {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "Heading=CustomDirectories\nVersion=1\nComment=None\nID=Single\nSlot=0\ndata=".concat(dir.getString(_SharedPref, ""))));
				_Sucess("Successfully Copied to Clipboard");
			} catch (Exception e) {
				_ERROR("Something went wrong or Clipboard Permission denied");
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), "❗ Nothing to Backup ; Save Directories first");
		}
	}
	
	
	public void _Backup(final String _SharedPref, final String _preset, final String _Preset) {
		psbkp.setTitle("𝗕𝗮𝗰𝗸𝘂𝗽 𝗣𝗿𝗲𝘀𝗲𝘁 ".concat(_preset));
		psbkp.setIcon(R.drawable.submit);
		psbkp.setMessage("Backup PreSet ".concat(_Preset.concat(" Directories via Clipboard ")));
		psbkp.setPositiveButton("📋 𝑩𝒂𝒄𝒌𝒖𝒑 𝒕𝒐 𝑪𝒍𝒊𝒑𝒃𝒐𝒂𝒓𝒅", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if (dir.getString(_SharedPref, "").length() > 10) {
					try {
						((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "Heading=CustomDirectories\nVersion=1\nComment=None\nID=Single\nSlot=".concat(_Preset.concat("\ndata=".concat(dir.getString(_SharedPref, ""))))));
						_Sucess("Successfully Copied to Clipboard");
					} catch (Exception e) {
						_ERROR("Something went wrong or Clipboard Permission denied");
					}
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "❗ Nothing to Backup ; Save Directories first");
				}
			}
		});
		psbkp.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		psbkp.create().show();
	}
	
	
	public void _DirectoriesRestorer() {
		AllRestore.setTitle("𝗥𝗲𝘀𝘁𝗼𝗿𝗲 𝗢𝘃𝗲𝗿𝗩𝗶𝗲𝘄");
		AllRestore.setView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.drsrstr, null));
		AllRestore.setIcon(R.drawable.backup);
		AllRestore.setPositiveButton("Restore", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				try {
					if (data.length() > 8) {
						dir.edit().putString("custdir", dir.getString("custdir", "").concat(data)).commit();
					}
					if (preset1.length() > 8) {
						dir.edit().putString("custdir1", dir.getString("custdir1", "").concat(preset1)).commit();
					}
					if (preset2.length() > 8) {
						dir.edit().putString("custdir2", dir.getString("custdir2", "").concat(preset2)).commit();
					}
					if (preset3.length() > 8) {
						dir.edit().putString("custdir3", dir.getString("custdir3", "").concat(preset3)).commit();
					}
					_Sucess("Sucessfully Restored All Directories");
				} catch (Exception e) {
					 
				}
			}
		});
		final AlertDialog AllRestoreAllRestore = AllRestore.create();
		AllRestoreAllRestore.show();
		try {
			    String input = variable;
			    
			    String[] lines = input.split("\n");
			
			    for (String line : lines) {
				        if (line.startsWith("Version=")) {
					            
					((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.ver)).setText(line.substring("Version=".length()));
					            break;
					        }
				    }
		} catch (Exception e) {
			    e.printStackTrace();
		}
		try {
			    String input = variable;
			    
			    String[] lines = input.split("\n");
			
			    for (String line : lines) {
				        if (line.startsWith("Comment=")) {
					            
					((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.cmt)).setText(line.substring("Comment=".length()));
					            break;
					        }
				    }
		} catch (Exception e) {
			    e.printStackTrace();
		}
		try {
			    String input = variable;
			    
			    String[] lines = input.split("\n");
			
			    for (String line : lines) {
				        if (line.startsWith("MainBackup=")) {
					            
					((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.bkp)).setText(line.substring("MainBackup=".length()));
					            break;
					        }
				    }
		} catch (Exception e) {
			    e.printStackTrace();
		}
		try {
			    String input = variable;
			    
			    String[] lines = input.split("\n");
			
			    for (String line : lines) {
				        if (line.startsWith("Slot1=")) {
					            
					((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.prst1)).setText(line.substring("Slot1=".length()));
					            break;
					        }
				    }
		} catch (Exception e) {
			    e.printStackTrace();
		}
		try {
			    String input = variable;
			    
			    String[] lines = input.split("\n");
			
			    for (String line : lines) {
				        if (line.startsWith("Slot2=")) {
					            
					((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.prst2)).setText(line.substring("Slot2=".length()));
					            break;
					        }
				    }
		} catch (Exception e) {
			    e.printStackTrace();
		}
		try {
			    String input = variable;
			    
			    String[] lines = input.split("\n");
			
			    for (String line : lines) {
				        if (line.startsWith("Slot3=")) {
					            
					((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.prst3)).setText(line.substring("Slot3=".length()));
					            break;
					        }
				    }
		} catch (Exception e) {
			    e.printStackTrace();
		}
		((Button) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.button1)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				slot = ((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.slot)).getText().toString();
				data = ((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.bkp)).getText().toString();
				preset1 = ((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.prst1)).getText().toString();
				preset2 = ((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.prst2)).getText().toString();
				preset3 = ((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.prst3)).getText().toString();
			}
		});
	}
	
	
	public void _DirectoryRestoreSingle() {
		AllRestore.setTitle("𝗥𝗲𝘀𝘁𝗼𝗿𝗲 𝗢𝘃𝗲𝗿𝗩𝗶𝗲𝘄");
		AllRestore.setView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.singlerestore, null));
		AllRestore.setIcon(R.drawable.backup);
		AllRestore.setPositiveButton("Restore", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if ((data.length() > 8) && slot.contains("0")) {
					dir.edit().putString("custdir", dir.getString("custdir", "").concat(data)).commit();
					_Sucess("Sucessfully Restored Main Directories");
					_checkbox_selector();
				}
				if ((data.length() > 8) && slot.contains("1")) {
					dir.edit().putString("custdir1", dir.getString("custdir1", "").concat(data)).commit();
					_Sucess("Sucessfully Restored PreSet1 Directories");
				}
				if ((data.length() > 8) && slot.contains("2")) {
					dir.edit().putString("custdir2", dir.getString("custdir2", "").concat(data)).commit();
					_Sucess("Sucessfully Restored PreSet2 Directories");
				}
				if ((data.length() > 8) && slot.contains("3")) {
					dir.edit().putString("custdir3", dir.getString("custdir3", "").concat(data)).commit();
					_Sucess("Sucessfully Restored PreSet3 Directories");
				}
			}
		});
		final AlertDialog AllRestoreAllRestore = AllRestore.create();
		AllRestoreAllRestore.show();
		try {
			    String input = variable;
			    
			    String[] lines = input.split("\n");
			
			    for (String line : lines) {
				        if (line.startsWith("Version=")) {
					            
					((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.ver)).setText(line.substring("Version=".length()));
					            break;
					        }
				    }
		} catch (Exception e) {
			    e.printStackTrace();
		}
		try {
			    String input = variable;
			    
			    String[] lines = input.split("\n");
			
			    for (String line : lines) {
				        if (line.startsWith("Comment=")) {
					            
					((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.cmt)).setText(line.substring("Comment=".length()));
					            break;
					        }
				    }
		} catch (Exception e) {
			    e.printStackTrace();
		}
		try {
			    String input = variable;
			    
			    String[] lines = input.split("\n");
			
			    for (String line : lines) {
				        if (line.startsWith("Slot=")) {
					            
					((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.slot)).setText(line.substring("Slot=".length()));
					            break;
					        }
				    }
		} catch (Exception e) {
			    e.printStackTrace();
		}
		try {
			    String input = variable;
			    
			    String[] lines = input.split("\n");
			
			    for (String line : lines) {
				        if (line.startsWith("data=")) {
					            
					((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.bkp)).setText(line.substring("data=".length()));
					            break;
					        }
				    }
		} catch (Exception e) {
			    e.printStackTrace();
		}
		slot = ((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.slot)).getText().toString();
		data = ((TextView) AllRestoreAllRestore.getWindow().getDecorView().findViewById(R.id.bkp)).getText().toString();
	}
	
	
	public void _Root(final String _cmd, final String _Title, final String _Toast) {
		try {
			   
			    final String command = _cmd;
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(CustomDirActivity.this)
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
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(errorText.toString());
									_Errr();
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
								                        Toast.makeText(CustomDirActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
								                    }
							                });
						            }
					        }
				    }, 100);
		} catch (Exception e) {
			    e.printStackTrace();
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