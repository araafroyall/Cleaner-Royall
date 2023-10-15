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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private String PremiumCheck = "";
	private String delvikSizer = "";
	private String oatSizer = "";
	private String oatcode = "";
	private double converter = 0;
	private double Converter = 0;
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
	private HashMap<String, Object> Cmd = new HashMap<>();
	
	private ImageView imageview1;
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear12;
	private LinearLayout linear9;
	private LinearLayout extra;
	private LinearLayout forDeveloper;
	private Button DailyCleaner;
	private LinearLayout linear2;
	private LinearLayout linear13;
	private Button additional;
	private LinearLayout linear14;
	private Button button23;
	private LinearLayout linear4;
	private TextView result;
	private TextView bt_Calibrate;
	private TextView storageviewer;
	private TextView logclean;
	private TextView delvikclean;
	private TextView cachetrim;
	private TextView fstrimmm;
	private TextView internalStorage;
	private TextView multiUser;
	private TextView OneTap;
	private TextView EmptyFolder_Cleaner;
	private TextView oatclean;
	private TextView wiperapi;
	private TextView cleanertoolbox;
	private TextView tmpfilecleaner;
	private TextView cleanall;
	private TextView Clean;
	private Button button19;
	private Button button31;
	private Button help;
	private Button button45;
	private Button settings;
	private Button dynamicbutton;
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
	private AlertDialog.Builder noRoot;
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
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		imageview1 = findViewById(R.id.imageview1);
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear12 = findViewById(R.id.linear12);
		linear9 = findViewById(R.id.linear9);
		extra = findViewById(R.id.extra);
		forDeveloper = findViewById(R.id.forDeveloper);
		DailyCleaner = findViewById(R.id.DailyCleaner);
		linear2 = findViewById(R.id.linear2);
		linear13 = findViewById(R.id.linear13);
		additional = findViewById(R.id.additional);
		linear14 = findViewById(R.id.linear14);
		button23 = findViewById(R.id.button23);
		linear4 = findViewById(R.id.linear4);
		result = findViewById(R.id.result);
		bt_Calibrate = findViewById(R.id.bt_Calibrate);
		storageviewer = findViewById(R.id.storageviewer);
		logclean = findViewById(R.id.logclean);
		delvikclean = findViewById(R.id.delvikclean);
		cachetrim = findViewById(R.id.cachetrim);
		fstrimmm = findViewById(R.id.fstrimmm);
		internalStorage = findViewById(R.id.internalStorage);
		multiUser = findViewById(R.id.multiUser);
		OneTap = findViewById(R.id.OneTap);
		EmptyFolder_Cleaner = findViewById(R.id.EmptyFolder_Cleaner);
		oatclean = findViewById(R.id.oatclean);
		wiperapi = findViewById(R.id.wiperapi);
		cleanertoolbox = findViewById(R.id.cleanertoolbox);
		tmpfilecleaner = findViewById(R.id.tmpfilecleaner);
		cleanall = findViewById(R.id.cleanall);
		Clean = findViewById(R.id.Clean);
		button19 = findViewById(R.id.button19);
		button31 = findViewById(R.id.button31);
		help = findViewById(R.id.help);
		button45 = findViewById(R.id.button45);
		settings = findViewById(R.id.settings);
		dynamicbutton = findViewById(R.id.dynamicbutton);
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
		noRoot = new AlertDialog.Builder(this);
		agree = new AlertDialog.Builder(this);
		error = new AlertDialog.Builder(this);
		tmp = new AlertDialog.Builder(this);
		dynamic = new AlertDialog.Builder(this);
		empty = new AlertDialog.Builder(this);
		Notice = new AlertDialog.Builder(this);
		oatClean = new AlertDialog.Builder(this);
		
		linear1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		DailyCleaner.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (set.getString("confirm", "").equals("0")) {
					try {
						    final String command = "# perform daily clean"; 
						
						    
						    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
						            .setTitle("⚡ 𝐏𝐞𝐫𝐟𝐨𝐫𝐦𝐢𝐧𝐠 𝐃𝐚𝐢𝐥𝐲 𝐂𝐥𝐞𝐚𝐧")
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
										                   
										                    Toast.makeText(MainActivity.this, "✅ Action Performed", Toast.LENGTH_SHORT).show();
										                } else {
										                    
										                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
										                            .setTitle("❗ 𝗘𝗿𝗿𝗼𝗿")
										                            .setMessage("Something went wrong or Root permission is denied")
										                            .setCancelable(false)
										                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
											                                @Override
											                                public void onClick(DialogInterface dialog, int which) {
												                                    dialog.dismiss();
												                                }
											                            });
										                    AlertDialog errorDialog = errorDialogBuilder.create();
										                    errorDialog.show();
										                }
									            } catch (Exception e) {
									                e.printStackTrace();
									                alertDialog.dismiss(); 
									                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
									                        .setTitle("Error")
									                        .setMessage("Error: " + e.getMessage())
									                        .setCancelable(false)
									                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
										                            @Override
										                            public void onClick(DialogInterface dialog, int which) {
											                                dialog.dismiss();
											                            }
										                        });
									                AlertDialog errorDialog = errorDialogBuilder.create();
									                errorDialog.show();
									            }
								        }
							    }, 100); 
					} catch (Exception e) {
						    e.printStackTrace();
					}
					
				}
				else {
					d.setTitle("🚀 𝗗𝗮𝗶𝗹𝘆 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
					d.setMessage("• It does not affect any data.");
					d.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							try {
								    final String command = "# perform daily clean"; 
								    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
								            .setTitle("⚡ 𝐏𝐞𝐫𝐟𝐨𝐫𝐦𝐢𝐧𝐠 𝐃𝐚𝐢𝐥𝐲 𝐂𝐥𝐞𝐚𝐧")
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
												                  
												SketchwareUtil.showMessage(getApplicationContext(), "✅ Action Performed");
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
					});
					d.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					d.create().show();
				}
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
		
		button23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				h.setTitle("🪆 𝗔𝗯𝗼𝘂𝘁");
				h.setMessage("𝐓𝐡𝐞 𝐌𝐨𝐬𝐭 𝐀𝐝𝐯𝐚𝐧𝐜𝐞 𝐂𝐥𝐞𝐚𝐧𝐞𝐫 𝐥𝐢𝐭𝐞 𝐞𝐯𝐞𝐫 𝐦𝐚𝐝𝐞 𝐢𝐧 𝐀𝐧𝐝𝐫𝐨𝐢𝐝 𝐋𝐢𝐟𝐞.\n\n•••••••••••••••••••••••••••••••••••••\n\n🏷️𝐑𝐞𝐪𝐮𝐢𝐫𝐞𝐦𝐞𝐧𝐭𝐬: \n- Root Acess Only\n\n------------------------------------------\n📑 𝐌𝐚𝐢𝐧 𝐅𝐞𝐚𝐭𝐮𝐫𝐞𝐬:\n• One Click Dynamic Cleaner\n• All Cache/waste cleaner \n• Custom Cleaner\n• Smart Cleaner\n• Battery Callibration \n• Fstrim & Cache Trim\n• No background functionality\n• Dynamic Cleaning Mechanism\n• Cleaner Toolbox \n𝖒𝖔𝖗𝖊 +++\n------------------------------------------\n\n👨‍🎤 Developer : 𝑨𝒓𝒂𝒂𝒇𝑹𝒐𝒚𝒂𝒍𝒍 🇮🇳\nTelegram id : @AraafRoyall\nEmail : araafroyall@digdig.org\nGmail : araafrogall@gmail.com\n\n------------------------------------------\n\n📜 Note :\nThis App never Collect Any data\nThis App is totally Offline\nThis App Never Affect Any Usable Data unless defined\n𝐃𝐞𝐯𝐞𝐥𝐨𝐩𝐞𝐫 𝐢𝐬 𝐧𝐨𝐭 𝐫𝐞𝐬𝐩𝐨𝐧𝐬𝐢𝐛𝐥𝐞 𝐟𝐨𝐫 𝐚𝐧𝐲 𝐝𝐚𝐦𝐚𝐠𝐞 𝐩𝐥𝐞𝐚𝐬𝐞 𝐛𝐞 𝐜𝐚𝐫𝐞𝐟𝐮𝐥𝐥 𝐛𝐞𝐟𝐨𝐫𝐞 𝐮𝐬𝐢𝐧𝐠 𝐭𝐡𝐢𝐬 𝐚𝐩𝐩\n\nA suggestion is most welcome 😊\n[Please Try Premium features too]");
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
		
		bt_Calibrate.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (set.getString("enable", "").contains("battery")) {
					_battery_calibrate();
				}
				else {
					_enable_first();
				}
			}
		});
		
		storageviewer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				b.setClass(getApplicationContext(), StorageusageActivity.class);
				startActivity(b);
			}
		});
		
		logclean.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				new2.setTitle("🛸 𝗟𝗼𝗴𝘀 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝐄𝐧𝐡𝐚𝐧𝐜𝐞𝐝");
				new2.setMessage("This Will Clear All Logs Globally");
				new2.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							   
							    final String command = sspnd.concat("# clean logs dynamically");
							
							    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
							            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐋𝐨𝐠𝐬")
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
													SketchwareUtil.showMessage(getApplicationContext(), "🥏 Cleared Sucessfully");
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
				});
				new2.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				new2.create().show();
			}
		});
		
		delvikclean.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (set.getString("dalvikkkk", "").equals("1")) {
					SketchwareUtil.showMessage(getApplicationContext(), "👨‍💻 This Option is Disabled");
				}
				else {
					_delvik_clean();
				}
			}
		});
		
		cachetrim.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_cache_trim();
			}
		});
		
		fstrimmm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_fstrim();
			}
		});
		
		internalStorage.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				new2.setTitle("📂 𝙄𝙣𝙩𝙚𝙧𝙣𝙖𝙡 𝙎𝙩𝙤𝙧𝙖𝙜𝙚 𝑪𝒍𝒆𝒂𝒏𝒆𝒓");
				new2.setMessage("This Will Clear All unwanted folder and files from Internal storage (𝑺𝒂𝒇𝒆)\n\n𝑵𝒐 𝑫𝒂𝒕𝒂 𝑾𝒊𝒍𝒍 𝑫𝒆𝒍𝒆𝒕𝒆");
				new2.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							    final String command = "# clean internal storage waste"; 
							
							    
							    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
							            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐈𝐧𝐭𝐞𝐫𝐧𝐚𝐥 𝐒𝐭𝐨𝐫𝐚𝐠𝐞")
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
											                   
											                    Toast.makeText(MainActivity.this, "🥏 Cleared Sucessfully", Toast.LENGTH_SHORT).show();
											                } else {
											                    
											                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
											                            .setTitle("❗ 𝗘𝗿𝗿𝗼𝗿")
											                            .setMessage("Something went wrong or Root permission Denied")
											                            .setCancelable(false)
											                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
												                                @Override
												                                public void onClick(DialogInterface dialog, int which) {
													                                    dialog.dismiss();
													                                }
												                            });
											                    AlertDialog errorDialog = errorDialogBuilder.create();
											                    errorDialog.show();
											                }
										            } catch (Exception e) {
										                e.printStackTrace();
										                alertDialog.dismiss(); 
										                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
										                        .setTitle("Error")
										                        .setMessage("Error: " + e.getMessage())
										                        .setCancelable(false)
										                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
											                            @Override
											                            public void onClick(DialogInterface dialog, int which) {
												                                dialog.dismiss();
												                            }
											                        });
										                AlertDialog errorDialog = errorDialogBuilder.create();
										                errorDialog.show();
										            }
									        }
								    }, 100); 
						} catch (Exception e) {
							    e.printStackTrace();
						}
						
					}
				});
				new2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				new2.create().show();
			}
		});
		
		multiUser.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_multi_user_clean();
			}
		});
		
		OneTap.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), OnetapActivity.class);
				startActivity(i);
			}
		});
		
		EmptyFolder_Cleaner.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				empty.setTitle("📁 𝗘𝗺𝗽𝘁𝘆 𝗙𝗼𝗹𝗱𝗲𝗿 𝐂𝐥𝐞𝐚𝐧𝐞𝐫");
				empty.setMessage("Clears All 𝑬𝒎𝒑𝒕𝒚 𝑭𝒐𝒍𝒅𝒆𝒓𝒔 from Internal Storage");
				LinearLayout layuu = new LinearLayout(MainActivity.this);
				layuu.setOrientation(LinearLayout.VERTICAL);
				
				LinearLayout.LayoutParams prm = new LinearLayout.LayoutParams(
				    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
				
				final CheckBox alt = new CheckBox(MainActivity.this);
				alt.setText("Alternate Method");
				alt.setLayoutParams(prm);
				layuu.addView(alt);
				final CheckBox mpty = new CheckBox(MainActivity.this);
				mpty.setText("Multi-User");
				mpty.setLayoutParams(prm);
				layuu.addView(mpty);
				
				empty.setView(layuu);
				alt.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						mpty.setChecked(false);
						if
						((alt.isChecked())){
							
							alt.setChecked(true);
						}
						else
						{
							 
							
						}
					}
				});
				mpty.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						alt.setChecked(false);
						if
						((mpty.isChecked())){
							
							mpty.setChecked(true);
						}
						else
						{
							 
							
						}
					}
				});
				empty.setPositiveButton("🚀 𝐂𝐥𝐞𝐚𝐧", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						if
						((mpty.isChecked())){
							
							_EmptyFolderMultiuser();
						}
						else
						{
							if
							((alt.isChecked())){
								
								cmd = sspnd.concat("# clean empty folder from internal storage");
							}
							else
							{
								cmd = sspnd.concat("# clean empty folder from MultiUser");
								
							}
							_EmptyFolderClean();
							
						}
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
		
		oatclean.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				oat.setTitle("📭 𝗢𝗱𝗲𝘅/𝗩𝗱𝗲𝘅/𝗼𝗮𝘁 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
				oat.setMessage("Clears All oat (usually dex/vdex) files of  user apps.\nNot affect any app functionality");
				oat.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_odex_vdex_etc_cleaner();
					}
				});
				oat.setNeutralButton("💻 Used storage", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_OAT_Storage_Viewer();
					}
				});
				oat.create().show();
			}
		});
		
		wiperapi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_easy_wiper_api();
			}
		});
		
		cleanertoolbox.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				whatsapp.setAction(Intent.ACTION_VIEW);
				whatsapp.setClass(getApplicationContext(), CustomCleanerActivity.class);
				startActivity(whatsapp);
			}
		});
		
		tmpfilecleaner.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("📦 𝐓𝐞𝐦𝐩𝐨𝐫𝐚𝐫𝐲 𝐅𝐢𝐥𝐞𝐬 𝐂𝐥𝐞𝐚𝐧𝐞𝐫");
				d2.setMessage("This Clears All Temporary Files created by many Apps");
				d2.setPositiveButton("🛸 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_TmpFilesCleaner();
					}
				});
				d2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d2.create().show();
			}
		});
		
		cleanall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("🛸 𝐂𝐥𝐞𝐚𝐧𝐀𝐥𝐥");
				d2.setMessage("This Will Perform Clean Mechanism Provided for Developer Only");
				d2.setPositiveButton("𝐂𝐥𝐞𝐚𝐧", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							   
							    final String command = "cleanall";
							
							    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
							            .setTitle("⚡ 𝐏𝐞𝐫𝐟𝐨𝐫𝐦𝐢𝐧𝐠 𝐂𝐥𝐞𝐚𝐧")
							            .setMessage("     Please Wait....")
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
													SketchwareUtil.showMessage(getApplicationContext(), "🥏 Cleared Sucessfully");
													                        }
												                    });
											                } else {
											                    runOnUiThread(new Runnable() {
												                        @Override
												                        public void run() {
													                            result.setText(errorText.toString());
													d1.setTitle("❗𝗘𝗿𝗿𝗼𝗿");
													d1.setMessage("Currently this feature is only for Developer");
													d1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
															@Override
															public void onClick(DialogInterface _dialog, int _which) {
																	 
															}
													});
													d1.create().show();
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
				});
				d2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d2.create().show();
			}
		});
		
		Clean.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("🛸 𝐂𝐥𝐞𝐚𝐧");
				d2.setMessage("This Will Perform Clean Mechanism Provided for Developer Only");
				d2.setPositiveButton("𝐂𝐥𝐞𝐚𝐧", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							   
							    final String command = "clean";
							
							    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
							            .setTitle("⚡ 𝐏𝐞𝐫𝐟𝐨𝐫𝐦𝐢𝐧𝐠 𝐂𝐥𝐞𝐚𝐧")
							            .setMessage("     Please Wait....")
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
													SketchwareUtil.showMessage(getApplicationContext(), "🥏 Cleared Sucessfully");
													                        }
												                    });
											                } else {
											                    runOnUiThread(new Runnable() {
												                        @Override
												                        public void run() {
													                            result.setText(errorText.toString());
													d1.setTitle("❗𝗘𝗿𝗿𝗼𝗿");
													d1.setMessage("Currently this feature is only for Developer");
													d1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
															@Override
															public void onClick(DialogInterface _dialog, int _which) {
																	 
															}
													});
													d1.create().show();
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
				});
				d2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d2.create().show();
			}
		});
		
		button19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ChangeLog();
			}
		});
		
		button31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				list.setTitle("👨‍💻 𝗛𝗲𝗹𝗽 & 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐋𝐢𝐬𝐭");
				list.setMessage("𝐓𝐡𝐢𝐬 𝐀𝐩𝐩 𝐧𝐞𝐯𝐞𝐫 𝐚𝐟𝐟𝐞𝐜𝐭 𝐚𝐧𝐲 𝐮𝐬𝐞𝐫𝐝𝐚𝐭𝐚.\n\n🧑‍💻 𝐃𝐞𝐯𝐞𝐥𝐨𝐩𝐞𝐫 𝐢𝐬 𝐧𝐨𝐭 𝐫𝐞𝐬𝐩𝐨𝐧𝐬𝐢𝐛𝐥𝐞 𝐟𝐨𝐫 𝐚𝐧𝐲 𝐝𝐚𝐦𝐚𝐠𝐞 𝐩𝐥𝐞𝐚𝐬𝐞 𝐛𝐞 𝐜𝐚𝐫𝐞𝐟𝐮𝐥𝐥 𝐛𝐞𝐟𝐨𝐫𝐞 𝐮𝐬𝐢𝐧𝐠 𝐭𝐡𝐢𝐬 𝐚𝐩𝐩.\n\n••••••••••••••••••••••••••••••••••••\n\n🛸 𝗟𝗼𝗴𝘀 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\n• Clears Almost All Apps and system logs \n• It Also clears All Logs in /data and its subdirectories\n• Clears all Logs with extension '.log' Globally\n\nAll Apps logs \nlogcat\n/data log\nlogger files\nruntime.log\nupdate engine log\nLsposed logs\nlsposed old logs\nthanox logs \nfox logs\n𝐂𝐥𝐞𝐚𝐫𝐬 𝐚𝐥𝐥 𝐋𝐨𝐠𝐬 𝐰𝐢𝐭𝐡 𝐞𝐱𝐭𝐞𝐧𝐬𝐢𝐨𝐧 '.𝐥𝐨𝐠'\n𝖒𝖔𝖗𝖊 +++\n------------------------------------------\n🛸 𝗘𝗮𝘀𝘆 𝗖𝗮𝗰𝗵𝗲 𝗪𝗶𝗽𝗲𝗿 𝗔𝗣𝗜\nThis is based on \"Easy Cache Wiper\" app from playstore .\nAnd contains All That Clean Functionality in Single Option.\n\nAll app cache \ncache in internal storage\nbugreports\nLost.dir\ntombstone files\nlogger\ndropbox cache\nusagestatus waste files\n𝖒𝖔𝖗𝖊 +++\n------------------------------------------\n💼 𝗠𝘂𝗹𝘁𝗶-𝗨𝘀𝗲𝗿 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\nClears All Unwanted File and Folder from MultiUsers Spaces Storage\nIt supports All Multi-Space like Island,WorkProfile,Any Dual Apps , MiUi second space and so on...\n\nAll type of .thumbnails\nwastage empty folder \nCache in storage \nwhatsapp wastage \nramdump\ndebug log\n.trash\nfoxlogs\n.shareit\n.android\nlost.dir\n𝖒𝖔𝖗𝖊 +++\n------------------------------------------\n📦 𝐓𝐞𝐦𝐩𝐫𝐨𝐫𝐚𝐫𝐲 𝐅𝐢𝐥𝐞𝐬 𝐂𝐥𝐞𝐚𝐧𝐞𝐫\nThis Clears all (temp or tmp) files created by many apps for temporary work\n--------------------------------------------\n🪆 𝗟𝘂𝗰𝗸𝘆 𝗣𝗮𝘁𝗰𝗵𝗲𝗿 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\nIt simply Contains the downloaded patch cleaner and modified Apps Cleaner to save little storage\n--------------------------------------------\n📫 𝐋𝐎𝐒𝐓.𝐃𝐈𝐑 𝐂𝐥𝐞𝐚𝐧𝐞𝐫\nLOST.DIR files are temporary files created on file tranfer \nClears All LOST.DIR files and Folder from Device including SD Card\n--------------------------------------------\n📂 𝙄𝙣𝙩𝙚𝙧𝙣𝙖𝙡 𝙎𝙩𝙤𝙧𝙖𝙜𝙚 𝑪𝒍𝒆𝒂𝒏𝒆𝒓\nThis Will Clear All unwanted folder and files from Internal storage (𝑺𝒂𝒇𝒆)\nIt is best to add more directories in custom cleaner if you think that some files or folders left from clean\n\nAll type of .thumbnails\nwastage empty folder \nCache in storage \nwhatsapp wastage \nramdump\ndebug log\n.trash\nfoxlogs\n.shareit\n.android\nlost.dir\n𝖒𝖔𝖗𝖊 +++\n-------------------------------------------\n💾 𝗼𝗱𝗲𝘅/𝘃𝗱𝗲𝘅/𝗼𝗮𝘁 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\nThis will clear All oat (usually dex/vdex) files from user Apps including MultiUser.\nThis does not affect any app functionality\nCurrently No Effect on System Apps (impliment later)\n------------------------------------------\n🏮𝗗𝗮𝗹𝘃𝗶𝗸 𝗖𝗮𝗰𝗵𝗲 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\nIt Clears All Dalvik cache dynamically.\nSupports All Android version\n𝒔𝒐𝒎𝒆𝒕𝒊𝒎𝒆 𝒍𝒐𝒘𝒆𝒓 𝑨𝒏𝒅𝒓𝒐𝒊𝒅 𝒗𝒆𝒓𝒔𝒊𝒐𝒏 (𝒖𝒑𝒕𝒐 9) 𝒏𝒆𝒆𝒅𝒔 𝒅𝒐𝒖𝒃𝒍𝒆 𝒓𝒆𝒃𝒐𝒐𝒕 𝒕𝒐 𝒃𝒐𝒐𝒕 𝒚𝒐𝒖𝒓 𝒅𝒆𝒗𝒊𝒄𝒆\n------------------------------------------\n🪀 𝗪𝗵𝗮𝘁𝘀𝗔𝗽𝗽 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 (waste files only)\nIt Clears All unwanted cache, log, file, directories in whatsApp.\nIt Also Include : Status Cleaner , .shared cleaner , and more\n--------------------------------------------\n🪆 𝗖𝗮𝗰𝗵𝗲 𝗧𝗿𝗶𝗺𝗺𝗲𝗿\nAll Apps Cache at system level \ndeep cache cleaner \nDynamically Clears All cache Folder  with its contents Globally\n\n• It clears All App (user+system) cache to 0 KB.\n• It is most effective Cache cleaner in 3 seconds\n• Every Single folder naming 'Cache' or 'cache' with its content will be cleared in one click from device Globally\n-------------------------------------------\n☄️ 𝗙𝘀𝗧𝗿𝗶𝗺\nIt Generally Remove lags from system and data but it is Slow process (Don't use if you don't like)\nuse Cache Trimmer Instead for best result \nIt include /system & /data Fstrim\nRequirement :  𝒃𝒖𝒔𝒚𝒃𝒐𝒙\n-------------------------------------------\n🎛️ .𝐍𝐨𝐦𝐞𝐝𝐢𝐚 𝐂𝐥𝐞𝐚𝐧𝐞𝐫\nClears all nomedia files from device globally \n.nomedia files are used for hide media files from Gallery or other apps to get visible \non Cleaning this may cause all hidden media available in Gallery or similar apps\n--------------------------------------------\n🔋𝗕𝗮𝘁𝘁𝗲𝗿𝘆 𝗖𝗮𝗹𝗹𝗶𝗯𝗿𝗮𝘁𝗲\nCalibrate of battery is rarely needed.\nit is required to be performed when you switch rom and at any other condition.\nThis App Also offers to Revert Battery calibrate file Dynamically in case of Any Issue \n--------------------------------------------\n💻 𝗖𝘂𝘀𝘁𝗼𝗺 𝗖𝗹𝗲𝗮𝗻𝗲𝗿\nIt Allow you to use custom directories to clean\nIt Also include few pre-saved directories to be select from its settings.\nCurrently It Allow you to choose directories only from Internal Storage\n---------------------------------------------\n🔮 𝐎𝐧𝐞𝐓𝐚𝐩 𝐂𝐥𝐞𝐚𝐧𝐞𝐫\nThis option is useful when you Want to clean multiple items in Less time \nJust select the options once , than use as many time as you want\n--------------------------------------------\n🗂️ 𝗘𝗺𝗽𝘁𝘆 𝗙𝗼𝗹𝗱𝗲𝗿 𝐂𝐥𝐞𝐚𝐧𝐞𝐫\n It Can clear All empty folders in one click From Internal Storage\n(MultiUser impliment soon)\n--------------------------------------------\n\n\n𝖒𝖔𝖗𝖊 +++ ( No Enough time to Explain all directories, If you think any missing directory just use custom cleaner or submit a directory , I will add in next update) 👨‍🎤");
				list.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				list.create().show();
			}
		});
		
		help.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), CompatibilityActivity.class);
				startActivity(a);
			}
		});
		
		button45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d3.setTitle("🧩 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝗟𝗶𝘁𝗲 𝗛𝗲𝗹𝗽𝗲𝗿");
				d3.setMessage("To maintain Cleaner lite Pro Size and Offline working All Additional Functions are shifted to Helper App\n𝐈𝐭 𝐈𝐧𝐜𝐥𝐮𝐝𝐞\n• Premium , Payment Methods, Feedback, bug report, Directory Submission, Forums etc.\n\n𝑫𝒐𝒘𝒏𝒍𝒐𝒂𝒅 𝑨𝒑𝒑 or Use Telegram Bot");
				d3.setPositiveButton("🌀 𝐓𝐞𝐥𝐞𝐠𝐫𝐚𝐦 bot", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						download.setAction(Intent.ACTION_VIEW);
						download.setData(Uri.parse("https://t.me/Cleaner_Lite_Robot"));
						startActivity(download);
					}
				});
				d3.setNegativeButton("🌀 𝐓𝐞𝐥𝐞𝐠𝐫𝐚𝐦 Channel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						download.setAction(Intent.ACTION_VIEW);
						download.setData(Uri.parse("https://t.me/cleanerprolite"));
						startActivity(download);
					}
				});
				d3.setNeutralButton("⬇️ 𝐃𝐢𝐫𝐞𝐜𝐭 𝐃𝐨𝐰𝐧𝐥𝐨𝐚𝐝", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						download.setAction(Intent.ACTION_VIEW);
						download.setData(Uri.parse("https://github.com/araafroyall/Cleaner.Lite.Helper/releases/download/Latest/Cleaner.Lite.Helper.Latest.apk"));
						startActivity(download);
					}
				});
				d3.create().show();
			}
		});
		
		settings.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sett.setClass(getApplicationContext(), SettingsActivity.class);
				startActivity(sett);
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
								d1.setTitle("🪄 𝗗𝘆𝗻𝗮𝗺𝗶𝗰 𝗔𝗰𝘁𝗶𝗼𝗻");
								d1.setMessage("• This Allow you to Perform Enhanced Actions Dynamically.\n• Redeem code , Shell commands , settings Changer , Data Modifier, Bugs Fixer etc ...");
								d1.setPositiveButton("⏩ 𝐍𝐞𝐱𝐭", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
										dynamic.setTitle("🪄 𝗗𝘆𝗻𝗮𝗺𝗶𝗰 𝗔𝗰𝘁𝗶𝗼𝗻");
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
		
		button27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d3.setTitle("⬆️ 𝗖𝗵𝗲𝗰𝗸 𝗨𝗽𝗱𝗮𝘁𝗲");
				d3.setMessage("We Provides Continue Updates \nIt is Recommended To Always use Latest Version For best Exprience\n\nHow would you like to get Latest update ?");
				d3.setPositiveButton("🌍 𝗚𝗶𝘁𝗵𝘂𝗯", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						c.setAction(Intent.ACTION_VIEW);
						c.setData(Uri.parse("https://github.com/araafroyall/Cleaner.Lite.Helper"));
						startActivity(c);
					}
				});
				d3.setNegativeButton("▶️ 𝗧𝗲𝗹𝗲𝗴𝗿𝗮𝗺", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						c.setAction(Intent.ACTION_VIEW);
						c.setData(Uri.parse("https://t.me/cleanerprolite"));
						startActivity(c);
					}
				});
				d3.setNeutralButton("⬇️ 𝐃𝐢𝐫𝐞𝐜𝐭 𝐃𝐨𝐰𝐧𝐥𝐨𝐚𝐝", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						c.setAction(Intent.ACTION_VIEW);
						c.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Pro-Lite/releases/download/Latest/Cleaner.Lite.Pro.Latest.apk"));
						startActivity(c);
					}
				});
				d3.create().show();
			}
		});
		
		feedback.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				feed.setTitle("✉️ 𝗙𝗲𝗲𝗱𝗯𝗮𝗰𝗸");
				feed.setMessage("Please give us feedback or suggestion or tell us about the problem which you are facing with this app.\nEvery suggestion is important to make it batter \nUse Helper App or Cleaner bot for Faster & Organized Response\n\nWhat do you want to do ?");
				feed.setPositiveButton("📨 Suggestion or Feedback", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						update.setAction(Intent.ACTION_VIEW);
						update.setData(Uri.parse("https://m.kuku.lu/f.php?bbee3ceedf"));
						startActivity(update);
					}
				});
				feed.setNeutralButton("❗ Report A bug", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						update.setAction(Intent.ACTION_VIEW);
						update.setData(Uri.parse("https://m.kuku.lu/f.php?bcdbee4579"));
						startActivity(update);
					}
				});
				feed.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				feed.create().show();
			}
		});
	}
	
	private void initializeLogic() {
		if (premium.getString("#", "").equals("1")) {
			setTitle("🏅 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝗟𝗶𝘁𝗲 𝗣𝗿𝗲𝗺𝗶𝘂𝗺");
		}
		else {
			setTitle("🌀  Cleaner Pro Lite");
		}
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
		PremiumCheck = "#!/bin/sh\n\n# This variable checks premium purchase ";
		DailyCleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)15, 0xFFFF3D00, 0xFF76FF03));
		sspnd = "#!/bin/sh\n\n# this variable checks App functioning  \n";
		if (set.getString("developer", "").equals("1")) {
			forDeveloper.setVisibility(View.VISIBLE);
		}
		else {
			forDeveloper.setVisibility(View.GONE);
		}
	}
	
	@Override
	public void onBackPressed() {
		finishAffinity();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (!set.getString("theme", "").equals("2")) {
			_color1();
		}
		else {
			_color2();
		}
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						d1.setTitle("⬆️ 𝗨𝗽𝗱𝗮𝘁𝗲 𝗔𝘃𝗮𝗶𝗹𝗮𝗯𝗹𝗲");
						d1.setMessage("Please download latest version");
						d1.setPositiveButton("Download", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								download.setAction(Intent.ACTION_VIEW);
								download.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Pro-Lite/releases/download/Latest/Cleaner.Lite.Pro.Latest.apk"));
								startActivity(download);
							}
						});
						d1.create().show();
					}
				});
			}
		};
		_timer.schedule(t, (int)(4000));
	}
	public void _ChangeLog() {
		changelog.setTitle("💠 𝗖𝗵𝗮𝗻𝗴𝗲𝗹𝗼𝗴... v𝟮.𝟵");
		changelog.setMessage("🚀 :  Globally .nomedia Cleaner\n🚀 : Deleted File count in some option\n🚀 : SpeedUp EmptyFolder Cleaner\n𝗙𝗶𝘅 : Custom Directories Hints\n𝗙𝗶𝘅 : Temporary Files Cleaner Output\n𝗙𝗶𝘅 : Texts & minor information\n𝗙𝗶𝘅 : Notification checkbox in custom cleaner\n𝗙𝗶𝘅 : Fstrim on Android 13\n𝗙𝗶𝘅 : Bugs & Bot Intent issue\n💬 : Bash changed to 'sh' Shell scripting to support Almost All Devices\n💬 : MultiUser EmptyFolder Cleaner now outputs 'user'\n💬 : New Custom Dirs Import Style\n💬 : Premium Price is now fixed to 3$ for upto v2.9.\n💬 : Prevent Obb Folder Clean even if it is Empty\n💬 : Oat cleaner UI changes\n💬 : Theme Stroke option\n💬 : Theme change Dynamically without Restart App\n💬 : Removed Unwanted Options\n••••••••••••••••••••••••••••••••••••••••••.\nv2.8\n🚀 : Smart Clean (Customizable)\n🚀 : Increased Overall Speed\n🚀 : Multi-User EmptyFolder Cleaner\n🚀 : Theme Support now Available\n🚀 : Browser Cache Cleaner\n🚀 : Templates in Smart Cleaner\n𝗙𝗶𝘅 : output of EmptyFolder Cleaner\n𝗙𝗶𝘅 : Dynamic Action Acess Code\n💬 : Suspended storage view on Android 11 below devices\n💬 : Reduced App Size\n💬 : Introducing Custom Directory Hints\n💬 : Smart Cleaner in place of .nomedia cleaner , and this is moved to Cleaner Toolbox\n💬 : Updated java version 1.7>11\n💬 : Updated Dexer from x to 8\n•••••••••••••••••••••••••••••••••••••••\n\n🔸Old ChangeLog is on Github\n\n------------------------------------------\n📳 Known Bugs:\n🔹 Custom Directory may not remove correctly if found multiple name matching\n------------------------------------------\n\n👨‍🎤 𝗗𝗲𝘃𝗲𝗹𝗼𝗽𝗲𝗿 :\n     •  𝑨𝒓𝒂𝒂𝒇𝑹𝒐𝒚𝒂𝒍𝒍  [AR]\nEmail : araafroyall@digdig.org\nGmail : araafroyall@gmail.com\nTelegram : @AraafRoyall\n------------------------------------------\n📜 Note : \n𝐃𝐞𝐯𝐞𝐥𝐨𝐩𝐞𝐫 𝐢𝐬 𝐧𝐨𝐭 𝐫𝐞𝐬𝐩𝐨𝐧𝐬𝐢𝐛𝐥𝐞 𝐟𝐨𝐫 𝐚𝐧𝐲 𝐝𝐚𝐦𝐚𝐠𝐞 𝐩𝐥𝐞𝐚𝐬𝐞 𝐛𝐞 𝐜𝐚𝐫𝐞𝐟𝐮𝐥𝐥 𝐛𝐞𝐟𝐨𝐫𝐞 𝐮𝐬𝐢𝐧𝐠 𝐭𝐡𝐢𝐬 𝐚𝐩𝐩.");
		changelog.setNeutralButton("📃 View All", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				chng.setAction(Intent.ACTION_VIEW);
				chng.setData(Uri.parse("https://github.com/araafroyall/Cleaner-Pro-Lite/blob/ChangeLog/ChangeLog.txt"));
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
	
	
	public void _delvik_clean() {
		try {
			   
			    final String command = "# clean the dalvik dynamically";
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
			            .setTitle("⚡𝗖𝗮𝗹𝗰𝘂𝗹𝗮𝘁𝗶𝗻𝗴 𝗗𝗲𝗹𝘃𝗶𝗸 𝗖𝗮𝗰𝗵𝗲")
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
									variable = result.getText().toString().replace("/data/dalvik-cache/", " ");
									d2.setTitle("🏮𝗗𝗮𝗹𝘃𝗶𝗸 𝗖𝗮𝗰𝗵𝗲 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
									d2.setMessage("\nDalvik Cache size : ".concat(variable));
									d2.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
										@Override
										public void onClick(DialogInterface _dialog, int _which) {
											try {
												    final String command = sspnd.concat("# clean the dalvik dynamically"); 
												
												    
												    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
												            .setTitle("⚡𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐃𝐞𝐥𝐯𝐢𝐤 𝐂𝐚𝐜𝐡𝐞")
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
																                   
																                    Toast.makeText(MainActivity.this, "🥏 Cleared Delvik Cache", Toast.LENGTH_SHORT).show();
																                } else {
																                    
																                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
																                            .setTitle("❗ 𝗘𝗿𝗿𝗼𝗿")
																                            .setMessage("Something went wrong or Root permission Denied")
																                            .setCancelable(false)
																                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
																	                                @Override
																	                                public void onClick(DialogInterface dialog, int which) {
																		                                    dialog.dismiss();
																		                                }
																	                            });
																                    AlertDialog errorDialog = errorDialogBuilder.create();
																                    errorDialog.show();
																                }
															            } catch (Exception e) {
															                e.printStackTrace();
															                alertDialog.dismiss(); 
															                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
															                        .setTitle("Error")
															                        .setMessage("Error: " + e.getMessage())
															                        .setCancelable(false)
															                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
																                            @Override
																                            public void onClick(DialogInterface dialog, int which) {
																	                                dialog.dismiss();
																	                            }
																                        });
															                AlertDialog errorDialog = errorDialogBuilder.create();
															                errorDialog.show();
															            }
														        }
													    }, 100); 
											} catch (Exception e) {
												    e.printStackTrace();
											}
											
										}
									});
									d2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
										@Override
										public void onClick(DialogInterface _dialog, int _which) {
											
										}
									});
									d2.create().show();
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(errorText.toString());
									d1.setTitle("❗ 𝗘𝗿𝗿𝗼𝗿");
									d1.setMessage("Unable to Calculate Delvik Size\nSomething went wrong or Root Permission is denied");
									d1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
													 
											}
									});
									d1.create().show();
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
	
	
	public void _battery_calibrate() {
		d.setTitle("🔋 𝗕𝗮𝘁𝘁𝗲𝗿𝘆 𝗖𝗮𝗹𝗶𝗯𝗿𝗮𝘁𝗼𝗿");
		d.setMessage("### 𝑻𝒉𝒆 𝑶𝒑𝒕𝒊𝒎𝒂𝒍 𝒐𝒓𝒅𝒆𝒓 𝒐𝒇 𝒐𝒑𝒆𝒓𝒂𝒕𝒊𝒐𝒏𝒔 𝒂𝒓𝒆\n𝟬. switch phone ON.\n𝟭. plug phone and charge until it gets to 100% (keep plugged-in).\n𝟮. wait 10+ minutes.\n𝟯. 𝐂𝐚𝐥𝐢𝐛𝐫𝐚𝐭𝐞 and shut down device (keep plugged-in).\n𝟰. wait until the charging screen (when the phone is OFF) will show battery-full too.\n𝟱. wait 10+ minutes.\n𝟲. unplug, power phone ON\n𝟳. Enjoy ... ");
		d.setPositiveButton("🥏 Next ", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				d.setTitle("🔋 𝗕𝗮𝘁𝘁𝗲𝗿𝘆 𝗖𝗮𝗹𝗶𝗯𝗿𝗮𝘁𝗼𝗿");
				d.setMessage("Calibrate of battery is rarely needed.\n\nit is required to be performed when you switch rom or Every 4-6 Months\n[𝑴𝒖𝒔𝒕 𝒇𝒐𝒍𝒍𝒐𝒘 𝒂𝒍𝒍 𝒔𝒕𝒆𝒑𝒔 𝒄𝒂𝒓𝒆𝒇𝒖𝒍𝒍𝒚]\n\nAre you sure to calibrate?");
				d.setPositiveButton("🥏 Calibrate now", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							    final String command = "mount -o rw,remount /data && rm -rf /data/system/batterystats.xyzold && mv /data/system/batterystats.bin /data/system/batterystats.xyzold && rm -rf /data/system/batterystats.bin"; 
							
							    
							    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
							            .setTitle("⚡ 𝐂𝐚𝐥𝐢𝐛𝐫𝐚𝐭𝐢𝐧𝐠")
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
											                   
											                    Toast.makeText(MainActivity.this, "⚡ 𝐂𝐚𝐥𝐢𝐛𝐫𝐚𝐭𝐢𝐧𝐠", Toast.LENGTH_SHORT).show();
											                } else {
											                    
											                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
											                            .setTitle("❗ 𝗘𝗿𝗿𝗼𝗿")
											                            .setMessage("Something went wrong or Root permission Denied")
											                            .setCancelable(false)
											                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
												                                @Override
												                                public void onClick(DialogInterface dialog, int which) {
													                                    dialog.dismiss();
													                                }
												                            });
											                    AlertDialog errorDialog = errorDialogBuilder.create();
											                    errorDialog.show();
											                }
										            } catch (Exception e) {
										                e.printStackTrace();
										                alertDialog.dismiss(); 
										                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
										                        .setTitle("Error")
										                        .setMessage("Error: " + e.getMessage())
										                        .setCancelable(false)
										                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
											                            @Override
											                            public void onClick(DialogInterface dialog, int which) {
												                                dialog.dismiss();
												                            }
											                        });
										                AlertDialog errorDialog = errorDialogBuilder.create();
										                errorDialog.show();
										            }
									        }
								    }, 100); 
						} catch (Exception e) {
							    e.printStackTrace();
						}
						
					}
				});
				d.setNegativeButton("🛠️ Revert", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						d.setTitle("🛠️ 𝗕𝗮𝘁𝘁𝗲𝗿𝘆 𝗖𝗮𝗹𝗶𝗯𝗿𝗮𝘁𝗼𝗿 𝗥𝗲𝘃𝗲𝗿𝘁");
						d.setMessage("• Revert Battery Calibrator is 𝐮𝐧𝐬𝐭𝐚𝐛𝐥𝐞 feture.\nif you ever perform battery calibration by this app than you can revert this changes in case of any issue\n\n𝑮𝒆𝒏𝒆𝒓𝒂𝒍𝒍𝒚 𝑰𝒕 𝒏𝒆𝒗𝒆𝒓 𝑹𝒆𝒒𝒖𝒊𝒓𝒆𝒔 , 𝑷𝒓𝒐𝒄𝒆𝒆𝒅 𝒘𝒊𝒕𝒉 𝒄𝒂𝒖𝒕𝒊𝒐𝒏.");
						d.setPositiveButton("🛠️ Revert Now ", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								try {
									    final String command = "mount -o rw,remount /data && rm -rf /data/system/batterystats.bin && mv /data/system/batterystats.xyzold /data/system/batterystats.bin"; 
									
									    
									    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
									            .setTitle("⚡ 𝐑𝐞𝐯𝐞𝐫𝐭𝐢𝐧𝐠 ")
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
													                   
													                    Toast.makeText(MainActivity.this, " 😇 Battery file is now reverted back. Please Calibrate Again if Found something wrong.", Toast.LENGTH_SHORT).show();
													                } else {
													                    
													                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
													                            .setTitle("❗ 𝗘𝗿𝗿𝗼𝗿")
													                            .setMessage("Something went wrong or Root permission Denied")
													                            .setCancelable(false)
													                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
														                                @Override
														                                public void onClick(DialogInterface dialog, int which) {
															                                    dialog.dismiss();
															                                }
														                            });
													                    AlertDialog errorDialog = errorDialogBuilder.create();
													                    errorDialog.show();
													                }
												            } catch (Exception e) {
												                e.printStackTrace();
												                alertDialog.dismiss(); 
												                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
												                        .setTitle("Error")
												                        .setMessage("Error: " + e.getMessage())
												                        .setCancelable(false)
												                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
													                            @Override
													                            public void onClick(DialogInterface dialog, int which) {
														                                dialog.dismiss();
														                            }
													                        });
												                AlertDialog errorDialog = errorDialogBuilder.create();
												                errorDialog.show();
												            }
											        }
										    }, 100); 
								} catch (Exception e) {
									    e.printStackTrace();
								}
								
							}
						});
						d.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						d.create().show();
					}
				});
				d.create().show();
			}
		});
		d.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d.create().show();
	}
	
	
	public void _fstrim() {
		trim.setTitle("☄️ 𝗙𝘀𝗧𝗿𝗶𝗺");
		trim.setMessage("It Generally removes lags...\n𝑹𝒆𝒒𝒖𝒊𝒓𝒆𝒎𝒆𝒏𝒕 : 𝑩𝒖𝒔𝒚𝒃𝒐𝒙 & 𝑰𝒕 𝒊𝒔 𝑺𝒍𝒐𝒘");
		trim.setPositiveButton("❄️ Fstrim \"/data\"", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				try {
					   
					    final String command = "#fstrim";
					
					    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
					            .setTitle("⚡ 𝐅𝐬𝐓𝐫𝐢𝐦𝐢𝐧𝐠 𝐃𝐚𝐭𝐚")
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
											SketchwareUtil.showMessage(getApplicationContext(), "🥏 Fstrimmed /Data");
											                        }
										                    });
									                } else {
									                    runOnUiThread(new Runnable() {
										                        @Override
										                        public void run() {
											                            result.setText(errorText.toString());
											if (result.getText().toString().contains("inaccessible") || result.getText().toString().contains("not found")) {
												d1.setTitle("❗ 𝗘𝗿𝗿𝗼𝗿");
												d1.setMessage("Something went wrong or BusyBox is not Installed");
												d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
													@Override
													public void onClick(DialogInterface _dialog, int _which) {
														
													}
												});
												d1.create().show();
											}
											else {
												_Error();
											}
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
		});
		trim.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		trim.setNegativeButton("❄️ Fstrim \"/system\"", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				d.setTitle("🪆 𝗙𝘀𝘁𝗿𝗶𝗺 \"/𝘀𝘆𝘀𝘁𝗲𝗺\"");
				d.setMessage("Trim system is Rarely Required");
				d.setPositiveButton("✂️ Trim", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							   
							    final String command = "# fstrim system";
							
							    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
							            .setTitle("⚡ 𝐅𝐬𝐓𝐫𝐢𝐦𝐢𝐧𝐠 𝐒𝐲𝐬𝐭𝐞𝐦")
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
													SketchwareUtil.showMessage(getApplicationContext(), "🥏 Fstrimmed /system");
													                        }
												                    });
											                } else {
											                    runOnUiThread(new Runnable() {
												                        @Override
												                        public void run() {
													                            result.setText(errorText.toString());
													if (result.getText().toString().contains("inaccessible") || result.getText().toString().contains("not found")) {
														d1.setTitle("❗ 𝗘𝗿𝗿𝗼𝗿");
														d1.setMessage("Something went wrong or BusyBox is not Installed");
														d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
															@Override
															public void onClick(DialogInterface _dialog, int _which) {
																
															}
														});
														d1.create().show();
													}
													else {
														_Error();
													}
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
				});
				d.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d.create().show();
			}
		});
		trim.create().show();
	}
	
	
	public void _color1() {
		bt_Calibrate.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		delvikclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		logclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		wiperapi.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		internalStorage.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		oatclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		tmpfilecleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		fstrimmm.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		EmptyFolder_Cleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		storageviewer.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		OneTap.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		Clean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		cleanall.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		multiUser.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		cachetrim.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		cleanertoolbox.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF64FFDA));
	}
	
	
	public void _color2() {
		if (set.getString("stroke", "").equals("1")) {
			bt_Calibrate.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			delvikclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			logclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			wiperapi.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			internalStorage.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			oatclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			tmpfilecleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			fstrimmm.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			EmptyFolder_Cleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			storageviewer.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			OneTap.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			Clean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			cleanall.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			multiUser.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			cachetrim.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFD50000, 0xFF69F0AE));
			cleanertoolbox.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFD50000, 0xFF69F0AE));
		}
		else {
			bt_Calibrate.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			delvikclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			storageviewer.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			logclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			cachetrim.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			fstrimmm.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			wiperapi.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			tmpfilecleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			cleanall.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			Clean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			multiUser.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			OneTap.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			EmptyFolder_Cleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			internalStorage.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			oatclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			cleanertoolbox.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
		}
	}
	
	
	public void _color3() {
		
	}
	
	
	public void _privacy_Agreement() {
		tmp.setTitle("🚀 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝗟𝗶𝘁𝗲 𝗣𝗿𝗼");
		tmp.setMessage("𝐓𝐡𝐞 𝐌𝐨𝐬𝐭 𝐀𝐝𝐯𝐚𝐧𝐜𝐞 𝐂𝐥𝐞𝐚𝐧𝐞𝐫 𝐥𝐢𝐭𝐞 𝐞𝐯𝐞𝐫 𝐦𝐚𝐝𝐞 𝐢𝐧 𝐀𝐧𝐝𝐫𝐨𝐢𝐝 𝐋𝐢𝐟𝐞.\n\nDeveloper : AraafRoyall 🇮🇳\nTelegram : @cleanerprolite.\n@2023-24 All Rights Reserved.\n\n📃 𝐍𝐨𝐭𝐞 :\nThis App never Collect Any data\nThis App is totally Offline\nThis App is Better than Every Cleaner Made till now for Android \n\n🧑‍💻Contact Developer for Any Help\n");
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
				agree.setTitle("🚀 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝗟𝗶𝘁𝗲 𝗣𝗿𝗼");
				agree.setMessage("❣️ 𝑾𝒆𝒍𝒄𝒐𝒎𝒆 𝒕𝒐 𝑻𝒉𝒆 𝑴𝒐𝒔𝒕 𝑨𝒅𝒗𝒂𝒏𝒄𝒆 𝑪𝒍𝒆𝒂𝒏𝒆𝒓 𝑳𝒊𝒕𝒆 𝑬𝒗𝒆𝒓 𝑴𝒂𝒅𝒆 𝒇𝒐𝒓 𝑨𝒏𝒅𝒓𝒐𝒊𝒅\n\nMade with ❤️ In  🇮🇳 by AraafRoyall\n\n📝 𝐀𝐠𝐫𝐞𝐞𝐦𝐞𝐧𝐭\nBy Proceeding Further or using App you Automatically Agree that : \n• Developer is not Responsible for any damage cause Using this App.\n• You(user) self responsible for using this app on your device.\n• A latest data Backup is Strongly Recommended");
				agree.setCancelable(false);
				agree.setPositiveButton("𝗢𝗸", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						SketchwareUtil.showMessage(getApplicationContext(), "❣️ 𝑾𝒆𝒍𝒄𝒐𝒎𝒆");
					}
				});
				agree.create().show();
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
	
	
	public void _odex_vdex_etc_cleaner() {
		try {
			    final String command = "# clean all app oat"; 
			
			    
			    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
			            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐎𝐚𝐭 (𝐕𝐝𝐞𝐱/𝐎𝐝𝐞𝐱)")
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
							                   
							                    Toast.makeText(MainActivity.this, "🥏 Cleared Sucessfully", Toast.LENGTH_SHORT).show();
							                } else {
							                    
							                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
							                            .setTitle("❗ 𝗘𝗿𝗿𝗼𝗿")
							                            .setMessage("Something went wrong or Root permission Denied")
							                            .setCancelable(false)
							                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
								                                @Override
								                                public void onClick(DialogInterface dialog, int which) {
									                                    dialog.dismiss();
									                                }
								                            });
							                    AlertDialog errorDialog = errorDialogBuilder.create();
							                    errorDialog.show();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
						                        .setTitle("Error")
						                        .setMessage("Error: " + e.getMessage())
						                        .setCancelable(false)
						                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
							                            @Override
							                            public void onClick(DialogInterface dialog, int which) {
								                                dialog.dismiss();
								                            }
							                        });
						                AlertDialog errorDialog = errorDialogBuilder.create();
						                errorDialog.show();
						            }
					        }
				    }, 100); 
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _enable_first() {
		enablefirst.setTitle("🪧 𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
		enablefirst.setMessage("    𝑬𝒏𝒂𝒃𝒍𝒆 𝒕𝒉𝒊𝒔 𝒐𝒑𝒕𝒊𝒐𝒏 𝒇𝒓𝒐𝒎 𝒔𝒆𝒕𝒕𝒊𝒏𝒈𝒔");
		enablefirst.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		enablefirst.create().show();
	}
	
	
	public void _easy_wiper_api() {
		wiperapiii.setTitle("🛸 𝗘𝗮𝘀𝘆 𝗖𝗮𝗰𝗵𝗲 𝗪𝗶𝗽𝗲𝗿 𝗔𝗣𝗜");
		wiperapiii.setMessage("This is based on \"𝑬𝒂𝒔𝒚 𝑪𝒂𝒄𝒉𝒆 𝑾𝒊𝒑𝒆𝒓\" App\nand Contains Full Cleaning Functionality in Single Option.");
		wiperapiii.setPositiveButton("📜 View Directories", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				info.setTitle("🛸 𝗖𝗮𝗰𝗵𝗲 𝗪𝗶𝗽𝗲𝗿 𝗔𝗣𝗜 Directories");
				info.setMessage("The Cleaning Directories in Easy Cache Wiper App as follows :\n\n(Star '*')  means All Sub-directories \n\n/data/system/dropbox\n/data/system/usagestats\n/sdcard/bugreports/*\n/sdcard/DCIM/.thumbnails\n/data/log\n/sdcard/Android/data/*/cache\n/data/dalvik-cache/ (𝐬𝐞𝐩𝐚𝐫𝐚𝐭𝐞)\n/data/data/*/cache\n/data/local/tmp/* (𝑭𝒊𝒙𝒆𝒅)\n/data/logger\n/sdcard/LOST.DIR\n/data/anr\n/data/tombstones\n");
				info.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				info.create().show();
			}
		});
		wiperapiii.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		wiperapiii.setNeutralButton("🌀 Clear", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				try {
					    final String command = "# clean above directories"; 
					
					    
					    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
					            .setTitle("⚡ 𝐏𝐞𝐫𝐟𝐨𝐫𝐦𝐢𝐧𝐠 𝐓𝐚𝐬𝐤")
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
									                   
									                    Toast.makeText(MainActivity.this, "🥏 Action Performed", Toast.LENGTH_SHORT).show();
									                } else {
									                    
									                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
									                            .setTitle("❗ 𝗘𝗿𝗿𝗼𝗿")
									                            .setMessage("Something went wrong or Root permission Denied")
									                            .setCancelable(false)
									                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
										                                @Override
										                                public void onClick(DialogInterface dialog, int which) {
											                                    dialog.dismiss();
											                                }
										                            });
									                    AlertDialog errorDialog = errorDialogBuilder.create();
									                    errorDialog.show();
									                }
								            } catch (Exception e) {
								                e.printStackTrace();
								                alertDialog.dismiss(); 
								                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
								                        .setTitle("Error")
								                        .setMessage("Error: " + e.getMessage())
								                        .setCancelable(false)
								                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
									                            @Override
									                            public void onClick(DialogInterface dialog, int which) {
										                                dialog.dismiss();
										                            }
									                        });
								                AlertDialog errorDialog = errorDialogBuilder.create();
								                errorDialog.show();
								            }
							        }
						    }, 100); 
				} catch (Exception e) {
					    e.printStackTrace();
				}
				
			}
		});
		wiperapiii.create().show();
	}
	
	
	public void _multi_user_clean() {
		multi.setTitle("💼 𝗠𝘂𝗹𝘁𝗶-𝗨𝘀𝗲𝗿 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
		multi.setMessage("• Clears All Unwanted File and Folder from MultiUsers Spaces Storage");
		multi.setPositiveButton("🌀 CLEAR", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if (premium.getString("purchased", "").equals("1")) {
					try {
						    final String command = "# clean multiUser storage"; 
						
						    
						    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
						            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐌𝐮𝐥𝐭𝐢-𝐔𝐬𝐞𝐫")
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
										                   
										                    Toast.makeText(MainActivity.this, "🥏 Cleared Sucessfully", Toast.LENGTH_SHORT).show();
										                } else {
										                    
										                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
										                            .setTitle("❗ 𝗘𝗿𝗿𝗼𝗿")
										                            .setMessage("Something went wrong or Root permission Denied or Premium Not Purchased or Not Verified")
										                            .setCancelable(false)
										                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
											                                @Override
											                                public void onClick(DialogInterface dialog, int which) {
												                                    dialog.dismiss();
												                                }
											                            });
										                    AlertDialog errorDialog = errorDialogBuilder.create();
										                    errorDialog.show();
										                }
									            } catch (Exception e) {
									                e.printStackTrace();
									                alertDialog.dismiss(); 
									                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
									                        .setTitle("Error")
									                        .setMessage("Error: " + e.getMessage())
									                        .setCancelable(false)
									                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
										                            @Override
										                            public void onClick(DialogInterface dialog, int which) {
											                                dialog.dismiss();
											                            }
										                        });
									                AlertDialog errorDialog = errorDialogBuilder.create();
									                errorDialog.show();
									            }
								        }
							    }, 100); 
					} catch (Exception e) {
						    e.printStackTrace();
					}
					
				}
				else {
					_RequirePremium();
				}
			}
		});
		multi.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		multi.create().show();
	}
	
	
	public void _cache_trim() {
		trim.setTitle("🪆 𝗖𝗮𝗰𝗵𝗲 𝗧𝗿𝗶𝗺𝗺𝗲𝗿");
		trim.setMessage("𝑪𝒍𝒆𝒂𝒓𝒔 𝑨𝒍𝒍 𝒂𝒑𝒑 𝒄𝒂𝒄𝒉𝒆𝒔 𝒊𝒏 2 𝒔𝒆𝒄𝒐𝒏𝒅");
		trim.setPositiveButton("❄️ Trim Cache", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if (premium.getString("#", "").equals("1")) {
					try {
						    final String command = "# trim caches dynamically"; 
						    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
						            .setTitle("⚡ 𝐓𝐫𝐢𝐦𝐦𝐢𝐧𝐠 𝐂𝐚𝐜𝐡𝐞𝐬")
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
										                  
										_RequirePremium();
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
				else {
					_RequirePremium();
				}
			}
		});
		trim.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		trim.create().show();
	}
	
	
	public void _custom_cleaner() {
		d3.setTitle("💻 𝗖𝘂𝘀𝘁𝗼𝗺 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
		d3.setMessage("This will clear All files and directories added by you ");
		d3.setPositiveButton("🚀 𝗖𝗹𝗲𝗮𝗿", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if (premium.getString("purchased", "").equals("1")) {
					try {
						    final String command = "# custom cleaner"; 
						
						    
						    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
						            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠")
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
										                   
										                    Toast.makeText(MainActivity.this, "🥏 Cleared Sucessfully", Toast.LENGTH_SHORT).show();
										                } else {
										                    
										                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
										                            .setTitle("❗ 𝗘𝗿𝗿𝗼𝗿")
										                            .setMessage("Something went wrong or Root permission Denied or Premium Not Purchased or Not Verified")
										                            .setCancelable(false)
										                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
											                                @Override
											                                public void onClick(DialogInterface dialog, int which) {
												                                    dialog.dismiss();
												                                }
											                            });
										                    AlertDialog errorDialog = errorDialogBuilder.create();
										                    errorDialog.show();
										                }
									            } catch (Exception e) {
									                e.printStackTrace();
									                alertDialog.dismiss(); 
									                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(MainActivity.this)
									                        .setTitle("Error")
									                        .setMessage("Error: " + e.getMessage())
									                        .setCancelable(false)
									                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
										                            @Override
										                            public void onClick(DialogInterface dialog, int which) {
											                                dialog.dismiss();
											                            }
										                        });
									                AlertDialog errorDialog = errorDialogBuilder.create();
									                errorDialog.show();
									            }
								        }
							    }, 100); 
					} catch (Exception e) {
						    e.printStackTrace();
					}
					
				}
				else {
					_RequirePremium();
				}
			}
		});
		d3.setNegativeButton(" ", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d3.setNeutralButton("⚙️ 𝗦𝗲𝘁𝘁𝗶𝗻𝗴𝘀", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				whatsapp.setClass(getApplicationContext(), CustomDirActivity.class);
				startActivity(whatsapp);
			}
		});
		d3.create().show();
	}
	
	
	public void _RequirePremium() {
		prm.setTitle("☣️ 𝐑𝐞𝐪𝐮𝐢𝐫𝐞 𝐏𝐫𝐞𝐦𝐢𝐮𝐦");
		prm.setMessage("This is a premium feature \npurchase premium to use ");
		prm.setPositiveButton("🛸 Premium", new DialogInterface.OnClickListener() {
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
		error.setTitle("❗𝗘𝗿𝗿𝗼𝗿");
		error.setMessage("Something went Wrong OR\n Root permission Denied");
		error.setPositiveButton("ok", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
						 
				}
		});
		error.create().show();
	}
	
	
	public void _OAT_Storage_Viewer() {
		if (set.getString("AndroidVersion", "").contains("1")) {
			if (set.getString("AndroidVersion", "").equals("11+")) {
				oatcode = "# check oat storage for Android 11+";
			}
			if (set.getString("AndroidVersion", "").equals("11-")) {
				oatcode = "# check oat storage for Android 11-";
			}
			try {
				    
				    final String command = oatcode;
				
				    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
				            .setTitle("⚡ 𝗖𝗮𝗹𝗰𝘂𝗹𝗮𝘁𝗶𝗻𝗴 𝗦𝗶𝘇𝗲")
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
							
							                if (exitCode == 0) {
								                    runOnUiThread(new Runnable() {
									                        @Override
									                        public void run() {
										oatSizer = result.getText().toString().replace("\n", "");
										if (oatSizer.length() > 6) {
											converter = Double.parseDouble(result.getText().toString());
											Converter = converter / 1000;
											oatSizer = new DecimalFormat("0.00").format(Converter).concat(" GB");
										}
										else {
											oatSizer = oatSizer.concat(" MB");
											oatcode = "";
										}
										oatClean.setTitle("💽 𝗢𝗮𝘁 𝗦𝘁𝗼𝗿𝗮𝗴𝗲 𝗨𝘀𝗮𝗴𝗲");
										oatClean.setMessage("𝐓𝐨𝐭𝐚𝐥 𝐬𝐢𝐳𝐞 : ".concat(oatSizer));
										oatClean.setNegativeButton("🚀 Clean", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
												_odex_vdex_etc_cleaner();
											}
										});
										oatClean.setPositiveButton("OK", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
												
											}
										});
										oatClean.create().show();
										                        }
									                    });
								                } else {
								                    runOnUiThread(new Runnable() {
									                        @Override
									                        public void run() {
										oatcode = "";
										d1.setTitle("❗𝗘𝗿𝗿𝗼𝗿");
										d1.setMessage("𝐔𝐧𝐚𝐛𝐥𝐞 𝐭𝐨 𝐂𝐚𝐥𝐜𝐮𝐥𝐚𝐭𝐞 𝐒𝐢𝐳𝐞 , 𝐒𝐨𝐦𝐞𝐭𝐡𝐢𝐧𝐠 𝐰𝐞𝐧𝐭 𝐰𝐫𝐨𝐧𝐠\nor Root permission may denied");
										d1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
												@Override
												public void onClick(DialogInterface _dialog, int _which) {
														 
												}
										});
										d1.create().show();
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
		else {
			d1.setTitle("🪧 𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
			d1.setMessage("𝐒𝐞𝐥𝐞𝐜𝐭 𝐀𝐧𝐝𝐫𝐨𝐢𝐝 𝐯𝐞𝐫𝐬𝐢𝐨𝐧 𝐟𝐫𝐨𝐦 𝐬𝐞𝐭𝐭𝐢𝐧𝐠𝐬 𝐭𝐨 𝐮𝐬𝐞 𝐭𝐡𝐢𝐬 𝐟𝐞𝐚𝐭𝐮𝐫𝐞");
			d1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
							 
					}
			});
			d1.create().show();
		}
	}
	
	
	public void _EmptyFolderClean() {
		try {
			   
			    final String command = "# clean empty folder from internal storage";
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
			            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐄𝐦𝐩𝐭𝐲 𝐅𝐨𝐥𝐝𝐞𝐫𝐬")
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
									if (set.getString("liveEmpty", "").equals("1")) {
										if (result.getText().toString().contains("/storage/emulated/0/") || result.getText().toString().contains("/data/media/0/")) {
											d1.setTitle("📁 𝗖𝗹𝗲𝗮𝗿𝗲𝗱 𝗘𝗺𝗽𝘁𝘆 𝗙𝗼𝗹𝗱𝗲𝗿𝘀");
											d1.setMessage("𝑻𝒐𝒕𝒂𝒍 𝒅𝒆𝒍𝒆𝒕𝒆𝒅 : ".concat(counter.concat("\n\n")).concat(variable));
											d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
												@Override
												public void onClick(DialogInterface _dialog, int _which) {
													
												}
											});
											d1.create().show();
											variable = "";
										}
										else {
											d1.setTitle("📁 𝗖𝗹𝗲𝗮𝗿𝗲𝗱 𝗘𝗺𝗽𝘁𝘆 𝗙𝗼𝗹𝗱𝗲𝗿𝘀");
											d1.setMessage("No Empty Folder Found to Clean");
											d1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
													@Override
													public void onClick(DialogInterface _dialog, int _which) {
															 
													}
											});
											d1.create().show();
										}
										result.setText("");
									}
									else {
										SketchwareUtil.showMessage(getApplicationContext(), "🥏 Sucessfully Deleted All Empty Folders");
									}
									result.setText("");
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(errorText.toString());
									_Error();
									result.setText("");
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
	
	
	public void _EmptyFolderMultiuser() {
		if (premium.getString("#", "").equals("1")) {
			try {
				   
				    final String command = "# clean empty folder from multi user";
				
				    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
				            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐄𝐦𝐩𝐭𝐲 𝐅𝐨𝐥𝐝𝐞𝐫𝐬")
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
										if (set.getString("liveEmpty", "").equals("1")) {
											if (result.getText().toString().contains("/data/media/")) {
												d1.setTitle("📁 𝗖𝗹𝗲𝗮𝗿𝗲𝗱 𝗘𝗺𝗽𝘁𝘆 𝗙𝗼𝗹𝗱𝗲𝗿𝘀");
												d1.setMessage("𝑻𝒐𝒕𝒂𝒍 𝒅𝒆𝒍𝒆𝒕𝒆𝒅 : ".concat(counter.concat("\n")).concat(variable));
												d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
													@Override
													public void onClick(DialogInterface _dialog, int _which) {
														
													}
												});
												d1.create().show();
												variable = "";
											}
											else {
												d1.setTitle("📁 𝗖𝗹𝗲𝗮𝗿𝗲𝗱 𝗘𝗺𝗽𝘁𝘆 𝗙𝗼𝗹𝗱𝗲𝗿𝘀");
												d1.setMessage("No Empty Folder Found to Clean");
												d1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
														@Override
														public void onClick(DialogInterface _dialog, int _which) {
																 
														}
												});
												d1.create().show();
											}
											result.setText("");
										}
										else {
											SketchwareUtil.showMessage(getApplicationContext(), "🥏 Sucessfully Deleted");
											result.setText("");
										}
										                        }
									                    });
								                } else {
								                    runOnUiThread(new Runnable() {
									                        @Override
									                        public void run() {
										                            result.setText(errorText.toString());
										_Error();
										result.setText("");
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
		else {
			_RequirePremium();
		}
	}
	
	
	public void _TmpFilesCleaner() {
		try {
			   
			    final String command = "# clean all temporary files";
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
			            .setTitle("⚡ 𝐓𝐞𝐦𝐩𝐨𝐫𝐚𝐫𝐲 𝐅𝐢𝐥𝐞𝐬 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠")
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
									if (set.getString("tmpcleanoutput", "").equals("1")) {
										if (result.getText().toString().contains("tmp") || result.getText().toString().contains("temp")) {
											d1.setTitle("📁 𝗖𝗹𝗲𝗮𝗿𝗲𝗱 𝗧𝗲𝗺𝗽𝗼𝗿𝗮𝗿𝘆 𝗙𝗶𝗹𝗲𝘀");
											d1.setMessage("𝑻𝒐𝒕𝒂𝒍 𝒅𝒆𝒍𝒆𝒕𝒆𝒅 : ".concat(counter.concat("\n\n")).concat(variable));
											d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
												@Override
												public void onClick(DialogInterface _dialog, int _which) {
													
												}
											});
											d1.create().show();
											variable = "";
										}
										else {
											d1.setTitle("📁 𝗖𝗹𝗲𝗮𝗿𝗲𝗱 𝗧𝗲𝗺𝗽𝗼𝗿𝗮𝗿𝘆 𝗙𝗶𝗹𝗲𝘀");
											d1.setMessage("No Temporary File found to clear");
											d1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
													@Override
													public void onClick(DialogInterface _dialog, int _which) {
															 
													}
											});
											d1.create().show();
										}
										result.setText("");
									}
									else {
										SketchwareUtil.showMessage(getApplicationContext(), "🥏 Sucessfully Deleted All Temporary Files");
										result.setText("");
									}
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(errorText.toString());
									_Error();
									result.setText("");
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
	
	
	public void _dynamicAction() {
		if (dynumic.equals("#enable cda")) {
			set.edit().putString("cda", "1").commit();
			SketchwareUtil.showMessage(getApplicationContext(), "✅ Custom Directory Advanced Mode Enabled ");
		}
		if (dynumic.equals("ddalvik")) {
			set.edit().putString("dalvikkkk", "1").commit();
			SketchwareUtil.showMessage(getApplicationContext(), "📃 Disabled Dalvik Cache Cleaner");
		}
		if (dynumic.equals("edalvik")) {
			set.edit().remove("dalvikkkk").commit();
			SketchwareUtil.showMessage(getApplicationContext(), "📃 Enabled Dalvik Cache Cleaner");
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
														d1.setTitle("📃 𝗢𝘂𝘁𝗽𝘂𝘁");
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
		Notice.setTitle("🪧 𝗜𝗺𝗽𝗼𝗿𝘁𝗮𝗻𝘁 𝗡𝗼𝘁𝗶𝗰𝗲");
		Notice.setMessage("Please Understand the Following Points Carefully.\nAnd Check All Tick for Proceed.");
		LinearLayout noticc = new LinearLayout(MainActivity.this);
		noticc.setOrientation(LinearLayout.VERTICAL);
		
		LinearLayout.LayoutParams notec = new LinearLayout.LayoutParams(
		    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		
		final CheckBox notice1 = new CheckBox(MainActivity.this);
		notice1.setText("This App is Totally Offline");
		notice1.setLayoutParams(notec);
		noticc.addView(notice1);
		final CheckBox notice2 = new CheckBox(MainActivity.this);
		notice2.setText("This App Never Collect Any Data");
		notice2.setLayoutParams(notec);
		noticc.addView(notice2);
		final CheckBox notice3 = new CheckBox(MainActivity.this);
		notice3.setText("This App Never Ask for Any Permission (Only Root)");
		notice3.setLayoutParams(notec);
		noticc.addView(notice3);
		final CheckBox notice4 = new CheckBox(MainActivity.this);
		notice4.setText("This App has no Background Functionality");
		notice4.setLayoutParams(notec);
		noticc.addView(notice4);
		final CheckBox notice5 = new CheckBox(MainActivity.this);
		notice5.setText("This App is Most Powerfull Cleaner Ever Made");
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
		_view.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
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