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
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import java.io.*;
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
	
	private ScrollView vscroll1;
	private LinearLayout linear3;
	private HorizontalScrollView hscroll3;
	private LinearLayout linear8;
	private TextView info;
	private ScrollView vscroll3;
	private LinearLayout linear4;
	private Switch cust_enable;
	private TextView help;
	private Button checklist;
	private TextView textview2;
	private TextView textview3;
	private HorizontalScrollView hscroll7;
	private TextView paste;
	private Button Modify;
	private EditText customdirrr;
	private LinearLayout linear9;
	private TextView template;
	private CheckBox subtitle;
	private CheckBox alarm;
	private CheckBox music;
	private CheckBox movies;
	private CheckBox notificaton;
	private CheckBox audiobooks;
	private CheckBox ringtone;
	private CheckBox lostdir;
	private CheckBox ramdump;
	private CheckBox browser;
	private CheckBox miuiGallerydlt;
	private CheckBox documentsn;
	
	private SharedPreferences dir;
	private AlertDialog.Builder Dir;
	private AlertDialog.Builder d1;
	private AlertDialog.Builder d2;
	private AlertDialog.Builder d3;
	private AlertDialog.Builder soon;
	private AlertDialog.Builder d2_1;
	private TimerTask t;
	private SharedPreferences set;
	private TimerTask infoo;
	private AlertDialog.Builder cust;
	private AlertDialog.Builder br;
	private AlertDialog.Builder restore;
	private TimerTask restored;
	
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
		hscroll3 = findViewById(R.id.hscroll3);
		linear8 = findViewById(R.id.linear8);
		info = findViewById(R.id.info);
		vscroll3 = findViewById(R.id.vscroll3);
		linear4 = findViewById(R.id.linear4);
		cust_enable = findViewById(R.id.cust_enable);
		help = findViewById(R.id.help);
		checklist = findViewById(R.id.checklist);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		hscroll7 = findViewById(R.id.hscroll7);
		paste = findViewById(R.id.paste);
		Modify = findViewById(R.id.Modify);
		customdirrr = findViewById(R.id.customdirrr);
		linear9 = findViewById(R.id.linear9);
		template = findViewById(R.id.template);
		subtitle = findViewById(R.id.subtitle);
		alarm = findViewById(R.id.alarm);
		music = findViewById(R.id.music);
		movies = findViewById(R.id.movies);
		notificaton = findViewById(R.id.notificaton);
		audiobooks = findViewById(R.id.audiobooks);
		ringtone = findViewById(R.id.ringtone);
		lostdir = findViewById(R.id.lostdir);
		ramdump = findViewById(R.id.ramdump);
		browser = findViewById(R.id.browser);
		miuiGallerydlt = findViewById(R.id.miuiGallerydlt);
		documentsn = findViewById(R.id.documentsn);
		dir = getSharedPreferences("dir", Activity.MODE_PRIVATE);
		Dir = new AlertDialog.Builder(this);
		d1 = new AlertDialog.Builder(this);
		d2 = new AlertDialog.Builder(this);
		d3 = new AlertDialog.Builder(this);
		soon = new AlertDialog.Builder(this);
		d2_1 = new AlertDialog.Builder(this);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		cust = new AlertDialog.Builder(this);
		br = new AlertDialog.Builder(this);
		restore = new AlertDialog.Builder(this);
		
		info.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				d1.setTitle("🪧 𝗛𝗶𝗱𝗲 𝗧𝗵𝗶𝘀 𝗛𝗶𝗻𝘁");
				d1.setMessage("It will not shown Next Time When you open Custom Cleaner");
				d1.setPositiveButton("✳️ Hide", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						set.edit().putString("cst hide", "1").commit();
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
					cust_enable.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF69F0AE));
				}
				else {
					cust_enable.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF80AB));
				}
			}
		});
		
		help.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("📜 𝗖𝘂𝘀𝘁𝗼𝗺 𝗗𝗶𝗿𝗲𝗰𝘁𝗼𝗿𝘆 Help");
				d2.setMessage("• Enter The Directory which you wish to add in Custom cleaner \n• Now supports /data directories , use Advance Mode\n• There is 𝑵𝒐 𝒍𝒊𝒎𝒊𝒕 for Custom directories \n• These custom directories will be cleared everytime when you use Custom Cleaner\n• This feature is also useful when some folder or files automatically created on internal storage \n• You can Also use '*' (star) for subdirectories within a directory\n• For Multi-User (use /data/media/USER/PATH)");
				d2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d2.setNegativeButton("📳  Known Bugs", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						d1.setTitle("📳  𝐊𝐧𝐨𝐰𝐧 𝐁𝐮𝐠𝐬 𝐢𝐧 𝐜𝐮𝐬𝐭𝐨𝐦 𝐜𝐥𝐞𝐚𝐧𝐞𝐫");
						d1.setMessage("🔹Removing a directory may cause error due to multiple subdirectories name matching");
						d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						d1.create().show();
					}
				});
				d2.create().show();
			}
		});
		
		checklist.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		checklist.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (dir.getString("custdir", "").length() > 5) {
					d3.setTitle("📜 𝐂𝐮𝐬𝐭𝐨𝐦 𝐃𝐢𝐫𝐞𝐜𝐭𝐨𝐫𝐲 𝐋𝐢𝐬𝐭");
					d3.setMessage(dir.getString("custdir", "").replace(" ", "\n"));
					d3.setPositiveButton("OK", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					d3.setNeutralButton("❎ Delete All", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							d2_1.setTitle("⚠️ 𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
							d2_1.setMessage("This Will Clear All Custom Directories saved by you ");
							d2_1.setPositiveButton("⛔ Delete", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									dir.edit().remove("custdir").commit();
									_Delete_All();
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
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				br.setTitle("🔮 𝐁𝐚𝐜𝐤𝐮𝐩 𝐂𝐮𝐬𝐭𝐨𝐦 𝐃𝐢𝐫𝐞𝐜𝐭𝐨𝐫𝐢𝐞𝐬");
				br.setMessage("You Can Backup Directories on Clipboard to Paste or Upload on Cloud");
				br.setPositiveButton("📋 𝑩𝒂𝒄𝒌𝒖𝒑 𝒕𝒐 𝑪𝒍𝒊𝒑𝒃𝒐𝒂𝒓𝒅", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						if (dir.getString("custdir", "").length() > 10) {
							variable = "Do_not_modify_Anything_".concat(dir.getString("custdir", "").replace(" /storage/emulated/0/", "🚀"));
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", variable));
							if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("Do_not_modify_Anything_")) {
								SketchwareUtil.showMessage(getApplicationContext(), "📋 Directory Backup copied to Clipboard");
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "⚠️ Something went wrong or Clipboard Permission denied");
							}
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "❗ Nothing to Backup Save Directories first");
						}
					}
				});
				br.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				br.create().show();
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				restore.setTitle("🔮 𝐑𝐞𝐬𝐭𝐨𝐫𝐞 𝐂𝐮𝐬𝐭𝐨𝐦 𝐃𝐢𝐫𝐞𝐜𝐭𝐨𝐫𝐢𝐞𝐬");
				restore.setMessage("• You Can Restore Directories From a File or Clipboard");
				final EditText restoreDirs = new EditText(CustomDirActivity.this);
				restoreDirs.setHint("Paste The backedUp Text to Restore");
				LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
				restoreDirs.setLayoutParams(lpar);
				restore.setView(restoreDirs);
				restore.setPositiveButton("⬇️ 𝑹𝒆𝒔𝒕𝒐𝒓𝒆", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						variable = restoreDirs.getText().toString();
						if (Info.equals("1")) {
							d1.setTitle("🪧 𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
							d1.setMessage("Restored Recently\nPlease Try After some time");
							d1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
											 
									}
							});
							d1.create().show();
						}
						else {
							if (variable.contains("Do_not_modify_Anything_")) {
								variable = variable.replace("🚀", " /storage/emulated/0/");
								variable = variable.replace("Do_not_modify_Anything_", "");
								dir.edit().putString("custdir", dir.getString("custdir", "").concat(variable)).commit();
								_checkbox_selector();
								SketchwareUtil.showMessage(getApplicationContext(), "📋 Restored directories from clipboard");
								Info = "1";
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "❗ Paste Valid Backup Text to Restore");
							}
						}
					}
				});
				restore.setNeutralButton("📋  𝑹𝒆𝒔𝒕𝒐𝒓𝒆 𝒇𝒓𝒐𝒎 𝑪𝒍𝒊𝒑𝒃𝒐𝒂𝒓𝒅", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						if (Info.equals("1")) {
							d1.setTitle("🪧 𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
							d1.setMessage("Restored Recently\nPlease Try After some time");
							d1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
											 
									}
							});
							d1.create().show();
						}
						else {
							if (String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).contains("Do_not_modify_Anything_")) {
								variable = String.valueOf(((android.content.ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).getText()).replace("🚀", " /storage/emulated/0/");
								variable = variable.replace("Do_not_modify_Anything_", "");
								dir.edit().putString("custdir", dir.getString("custdir", "").concat(variable)).commit();
								_checkbox_selector();
								SketchwareUtil.showMessage(getApplicationContext(), "📋 Restored directories from clipboard");
								Info = "1";
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "❗ Not A Valid Directory backup in clipboard");
							}
						}
					}
				});
				restore.create().show();
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
		
		Modify.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (set.getString("cda", "").equals("1")) {
					if (((customdirrr.getText().toString().contains("/data/") || customdirrr.getText().toString().contains("/sdcard/")) || customdirrr.getText().toString().contains("/storage/emulated/0/")) && !(customdirrr.getText().toString().contains("\n") || customdirrr.getText().toString().contains(" "))) {
						if ((customdirrr.getText().toString().length() > 6) && !((customdirrr.getText().toString().equals("/data/") || customdirrr.getText().toString().equals("/sdcard/")) || customdirrr.getText().toString().equals("/storage/emulated/0/"))) {
							_custom_directory();
						}
						else {
							d1.setTitle("⚠️ 𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
							d1.setMessage("This Directory is Not Allowed ");
							d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							d1.create().show();
						}
					}
					else {
						d1.setTitle("⚠️ 𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
						d1.setMessage("Enter A valid Directory");
						d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						d1.create().show();
					}
				}
				else {
					if ((customdirrr.getText().toString().contains("/sdcard/") || customdirrr.getText().toString().contains("/storage/emulated/0/")) && !(customdirrr.getText().toString().contains("\n") || customdirrr.getText().toString().contains(" "))) {
						if ((customdirrr.getText().toString().length() > 6) && !(customdirrr.getText().toString().equals("/sdcard/") || customdirrr.getText().toString().equals("/storage/emulated/0/"))) {
							_custom_directory();
						}
						else {
							d1.setTitle("⚠️ 𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
							d1.setMessage("This Directory is Not Allowed ");
							d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							d1.create().show();
						}
					}
					else {
						d1.setTitle("⚠️ 𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
						d1.setMessage("Enter A valid Directory");
						d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						d1.create().show();
					}
				}
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
				if (_charSeq.equals("/sdcard/") || (_charSeq.equals("/storage/emulated/0/") || (_charSeq.equals("/storage/emulated/0") || _charSeq.equals("/sdcard")))) {
					customdirrr.setError("This directory not Allowed");
				}
				if (_charSeq.equals("/sdcard/*") || _charSeq.equals("/storage/emulated/0/*")) {
					customdirrr.setError("This directory not Allowed , It may cause delete of Complete Internal Storage ");
				}
				if (_charSeq.contains("/data/")) {
					if (set.getString("cda", "").contains("1")) {
						if (_charSeq.equals("/data/")) {
							customdirrr.setError("This directory not Allowed");
						}
					}
					else {
						customdirrr.setError("Enable Advance Mode To get '/data' Directory support");
					}
				}
				if (_charSeq.equals("/data")) {
					customdirrr.setError("This directory not Allowed");
				}
				if (_charSeq.contains(" ")) {
					customdirrr.setError("Currently Space Containing directories is not supported");
				}
				if (_charSeq.equals("/data/*")) {
					customdirrr.setError("This is Not Allowed , It can cause unexpected wipe or erase of All your Device data");
				}
				if (_charSeq.contains("\n")) {
					customdirrr.setError("Currently does not support next line input");
				}
				if (_charSeq.contains("**")) {
					customdirrr.setError("Double star not allowed");
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
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
		_color1();
		if (set.getString("cda", "").equals("1")) {
			cust_enable.setChecked(true);
		}
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (dir.getString("onetimesetup", "").equals("1")) {
							
						}
						else {
							_agreement();
						}
					}
				});
			}
		};
		_timer.schedule(t, (int)(500));
	}
	
	@Override
	public void onBackPressed() {
		finish();
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		setTitle("💻 𝗖𝘂𝘀𝘁𝗼𝗺 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
		_checkbox_selector();
		if (set.getString("cst hide", "").contains("1")) {
			info.setVisibility(View.GONE);
		}
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
	}
	public void _custom_directory() {
		cust.setTitle("🔰 𝗖𝘂𝘀𝘁𝗼𝗺 𝗗𝗶𝗿𝗲𝗰𝘁𝗼𝗿𝘆 ");
		cust.setMessage("Select Option For your Directory :\n".concat(customdirrr.getText().toString()));
		cust.setPositiveButton("🔹 Add", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if (!dir.getString("custdir", "").contains(customdirrr.getText().toString())) {
					dir.edit().putString("custdir", dir.getString("custdir", "").concat(" ".concat(customdirrr.getText().toString()))).commit();
					SketchwareUtil.showMessage(getApplicationContext(), "✅ Successfully Added");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "🪧 This Directly is Already Added");
				}
			}
		});
		cust.setNeutralButton("🔸 Remove", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if (dir.getString("custdir", "").contains(customdirrr.getText().toString())) {
					dir.edit().putString("custdir", dir.getString("custdir", "").replaceFirst(" ".concat(customdirrr.getText().toString()), "")).commit();
					SketchwareUtil.showMessage(getApplicationContext(), "✅ Successfully Removed");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "🪧 This Directly is not found");
				}
			}
		});
		cust.create().show();
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
	
	
	public void _agreement() {
		
	}
	
	
	public void _color1() {
		Modify.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFF00));
		checklist.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFF8D));
		if (set.getString("cda", "").equals("1")) {
			cust_enable.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF009688));
		}
		else {
			cust_enable.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF80AB));
		}
	}
	
	
	public void _checkbox_selector() {
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Subtitles")) {
			subtitle.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/DCIM/.globalTrash")) {
			miuiGallerydlt.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Alarms")) {
			alarm.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Music")) {
			music.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Documents")) {
			documentsn.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Movies")) {
			movies.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Ringtones")) {
			ringtone.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Notifications")) {
			notificaton.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/Audiobooks")) {
			audiobooks.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/ramdump")) {
			ramdump.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/LOST.DIR")) {
			lostdir.setChecked(true);
		}
		if (dir.getString("custdir", "").contains("/storage/emulated/0/browser")) {
			browser.setChecked(true);
		}
	}
	
	
	public void _advanceMode() {
		if (Variable == 5) {
			d2.setTitle("🗃️ 𝗔𝗱𝘃𝗮𝗻𝗰𝗲 𝗠𝗼𝗱𝗲");
			d2.setMessage("This Allow you to use \"/data/\" directories\n• 𝐈𝐭 𝐢𝐬 𝐝𝐚𝐧𝐠𝐞𝐫𝐨𝐮𝐬 𝐎𝐩𝐭𝐢𝐨𝐧 𝐛𝐞 𝐬𝐮𝐫𝐞 𝐛𝐞𝐟𝐨𝐫𝐞 𝐮𝐬𝐢𝐧𝐠\n• you will self responsible for Enabling This\n\nSure to Enable ?");
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
			d2.setTitle("🗃️ 𝗔𝗱𝘃𝗮𝗻𝗰𝗲 𝗠𝗼𝗱𝗲");
			d2.setMessage("This Allow you to use \"/data/\" directories\n• 𝐈𝐭 𝐢𝐬 𝐝𝐚𝐧𝐠𝐞𝐫𝐨𝐮𝐬 𝐎𝐩𝐭𝐢𝐨𝐧 𝐛𝐞 𝐬𝐮𝐫𝐞 𝐛𝐞𝐟𝐨𝐫𝐞 𝐮𝐬𝐢𝐧𝐠\n• you will self responsible for Enabling This\n\n𝑪𝒐𝒏𝒇𝒊𝒓𝒎𝒂𝒕𝒊𝒐𝒏𝒔 : ".concat(String.valueOf((long)(Variable)).concat("/5")));
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
	
	
	public void _dis_selector() {
		
	}
	
	
	public void _Delete_All() {
		subtitle.setChecked(false);
		alarm.setChecked(false);
		music.setChecked(false);
		documentsn.setChecked(false);
		movies.setChecked(false);
		miuiGallerydlt.setChecked(false);
		notificaton.setChecked(false);
		audiobooks.setChecked(false);
		ringtone.setChecked(false);
		ramdump.setChecked(false);
		lostdir.setChecked(false);
		browser.setChecked(false);
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