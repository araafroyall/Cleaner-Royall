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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.*;
import org.json.*;

public class CustomCleanerActivity extends Activity {
	
	private String checkPrmemiumm = "";
	private String sspnd = "";
	private String PremiumCheck = "";
	private String variable = "";
	private String cmd = "";
	private String counter = "";
	
	private ArrayList<String> options = new ArrayList<>();
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout TopLayout;
	private TextView textview4;
	private LinearLayout linear25;
	private LinearLayout linear24;
	private LinearLayout linear100;
	private LinearLayout linear103;
	private LinearLayout linear106;
	private TextView nouse;
	private LinearLayout linear26;
	private TextView textview21;
	private LinearLayout linear27;
	private LinearLayout linear30;
	private TextView result;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private ImageView imageview12;
	private TextView textview12;
	private ImageView imageview16;
	private TextView textview13;
	private ImageView imageview14;
	private TextView textview14;
	private ImageView imageview15;
	private TextView textview16;
	private LinearLayout bt2;
	private LinearLayout bt3;
	private ImageView imageview17;
	private TextView textview18;
	private ImageView imageview18;
	private TextView textview19;
	private LinearLayout bt1;
	private LinearLayout bt4;
	private ImageView imageview6;
	private TextView textview6;
	private ImageView imageview7;
	private TextView textview20;
	private LinearLayout linear101;
	private LinearLayout linear102;
	private ImageView imageview31;
	private TextView textview53;
	private ImageView imageview32;
	private TextView textview55;
	private LinearLayout linear104;
	private LinearLayout linear105;
	private ImageView imageview33;
	private TextView textview56;
	private ImageView imageview34;
	private TextView textview57;
	private LinearLayout linear107;
	private LinearLayout linear108;
	private ImageView imageview35;
	private TextView textview58;
	private ImageView imageview36;
	private TextView textview59;
	private LinearLayout lpatcher2;
	private LinearLayout lpatcher;
	private ImageView imageview19;
	private TextView textview60;
	private ImageView imageview20;
	private TextView textview7;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private ImageView imageview21;
	private TextView textview23;
	private ImageView imageview22;
	private TextView textview24;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private ImageView imageview23;
	private TextView clear;
	
	private AlertDialog.Builder two;
	private AlertDialog.Builder wac;
	private AlertDialog.Builder n;
	private SharedPreferences set;
	private SharedPreferences premium;
	private AlertDialog.Builder prm;
	private Intent i = new Intent();
	private AlertDialog.Builder d2;
	private AlertDialog.Builder info;
	private AlertDialog.Builder d1;
	private AlertDialog.Builder Nomedia;
	private AlertDialog.Builder Errar;
	private AlertDialog.Builder luckyp;
	private AlertDialog.Builder brows;
	private AlertDialog.Builder clearData;
	private AlertDialog.Builder seLinux;
	private AlertDialog.Builder whatsapp;
	private AlertDialog.Builder obb;
	private AlertDialog.Builder cleaner;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.custom_cleaner);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		TopLayout = findViewById(R.id.TopLayout);
		textview4 = findViewById(R.id.textview4);
		linear25 = findViewById(R.id.linear25);
		linear24 = findViewById(R.id.linear24);
		linear100 = findViewById(R.id.linear100);
		linear103 = findViewById(R.id.linear103);
		linear106 = findViewById(R.id.linear106);
		nouse = findViewById(R.id.nouse);
		linear26 = findViewById(R.id.linear26);
		textview21 = findViewById(R.id.textview21);
		linear27 = findViewById(R.id.linear27);
		linear30 = findViewById(R.id.linear30);
		result = findViewById(R.id.result);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		imageview12 = findViewById(R.id.imageview12);
		textview12 = findViewById(R.id.textview12);
		imageview16 = findViewById(R.id.imageview16);
		textview13 = findViewById(R.id.textview13);
		imageview14 = findViewById(R.id.imageview14);
		textview14 = findViewById(R.id.textview14);
		imageview15 = findViewById(R.id.imageview15);
		textview16 = findViewById(R.id.textview16);
		bt2 = findViewById(R.id.bt2);
		bt3 = findViewById(R.id.bt3);
		imageview17 = findViewById(R.id.imageview17);
		textview18 = findViewById(R.id.textview18);
		imageview18 = findViewById(R.id.imageview18);
		textview19 = findViewById(R.id.textview19);
		bt1 = findViewById(R.id.bt1);
		bt4 = findViewById(R.id.bt4);
		imageview6 = findViewById(R.id.imageview6);
		textview6 = findViewById(R.id.textview6);
		imageview7 = findViewById(R.id.imageview7);
		textview20 = findViewById(R.id.textview20);
		linear101 = findViewById(R.id.linear101);
		linear102 = findViewById(R.id.linear102);
		imageview31 = findViewById(R.id.imageview31);
		textview53 = findViewById(R.id.textview53);
		imageview32 = findViewById(R.id.imageview32);
		textview55 = findViewById(R.id.textview55);
		linear104 = findViewById(R.id.linear104);
		linear105 = findViewById(R.id.linear105);
		imageview33 = findViewById(R.id.imageview33);
		textview56 = findViewById(R.id.textview56);
		imageview34 = findViewById(R.id.imageview34);
		textview57 = findViewById(R.id.textview57);
		linear107 = findViewById(R.id.linear107);
		linear108 = findViewById(R.id.linear108);
		imageview35 = findViewById(R.id.imageview35);
		textview58 = findViewById(R.id.textview58);
		imageview36 = findViewById(R.id.imageview36);
		textview59 = findViewById(R.id.textview59);
		lpatcher2 = findViewById(R.id.lpatcher2);
		lpatcher = findViewById(R.id.lpatcher);
		imageview19 = findViewById(R.id.imageview19);
		textview60 = findViewById(R.id.textview60);
		imageview20 = findViewById(R.id.imageview20);
		textview7 = findViewById(R.id.textview7);
		linear28 = findViewById(R.id.linear28);
		linear29 = findViewById(R.id.linear29);
		imageview21 = findViewById(R.id.imageview21);
		textview23 = findViewById(R.id.textview23);
		imageview22 = findViewById(R.id.imageview22);
		textview24 = findViewById(R.id.textview24);
		linear31 = findViewById(R.id.linear31);
		linear32 = findViewById(R.id.linear32);
		imageview23 = findViewById(R.id.imageview23);
		clear = findViewById(R.id.clear);
		two = new AlertDialog.Builder(this);
		wac = new AlertDialog.Builder(this);
		n = new AlertDialog.Builder(this);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		premium = getSharedPreferences("premium", Activity.MODE_PRIVATE);
		prm = new AlertDialog.Builder(this);
		d2 = new AlertDialog.Builder(this);
		info = new AlertDialog.Builder(this);
		d1 = new AlertDialog.Builder(this);
		Nomedia = new AlertDialog.Builder(this);
		Errar = new AlertDialog.Builder(this);
		luckyp = new AlertDialog.Builder(this);
		brows = new AlertDialog.Builder(this);
		clearData = new AlertDialog.Builder(this);
		seLinux = new AlertDialog.Builder(this);
		whatsapp = new AlertDialog.Builder(this);
		obb = new AlertDialog.Builder(this);
		cleaner = new AlertDialog.Builder(this);
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "This Also Support Many WhatsApp Mods versions");
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				seLinux.setTitle("𝗦𝗘 𝗟𝗶𝗻𝘂𝘅");
				seLinux.setIcon(R.drawable.whatsapp_3);
				seLinux.setMessage("Current Mode : Getting Status...");
				seLinux.setPositiveButton("⭕ 𝐒𝐞𝐭 𝐏𝐞𝐫𝐦𝐢𝐬𝐬𝐢𝐯𝐞", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							    String command = "setenforce"; 
							    Runtime.getRuntime().exec(command);
							_Root("setenforce 0", "⚡ 𝐒𝐰𝐢𝐭𝐜𝐡𝐢𝐧𝐠 𝐒𝐄𝐋𝐢𝐧𝐮𝐱 𝐌𝐨𝐝𝐞", "✅ Changed to Permissive Mode");
						} catch (Exception e) {
							_ERROR("Busybox is not Properly Installed");
						}
						
					}
				});
				seLinux.setNegativeButton("⭕ 𝐒𝐞𝐭 𝐄𝐧𝐟𝐨𝐫𝐜𝐞", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							    String command = "setenforce"; 
							    Runtime.getRuntime().exec(command);
							_Root("setenforce 1", "⚡ 𝐒𝐰𝐢𝐭𝐜𝐡𝐢𝐧𝐠 𝐒𝐄𝐋𝐢𝐧𝐮𝐱 𝐌𝐨𝐝𝐞", "✅ Changed to Enforcing Mode");
						} catch (Exception e) {
							_ERROR("Busybox is not Properly Installed");
						}
						
					}
				});
				final AlertDialog seLinuxseLinux = seLinux.create();
				seLinuxseLinux.show();
				try {
					   
					    final String command = "getenforce";
					
					
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
											((TextView) seLinuxseLinux.findViewById(android.R.id.message)).setText("Current Mode : ".concat(result.getText().toString().replace("\n", "")));
											                        }
										                    });
									                } else {
									                    runOnUiThread(new Runnable() {
										                        @Override
										                        public void run() {
											                            result.setText(errorText.toString());
											((TextView) seLinuxseLinux.findViewById(android.R.id.message)).setText("Failed to Calculate Size.");
											try {
												    String command = "getenforce"; 
												    Runtime.getRuntime().exec(command);
												_Err();
											} catch (Exception e) {
												_ERROR("Busybox is not Properly Installed");
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
										                        Toast.makeText(CustomCleanerActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
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
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				two.setTitle("𝐌𝐨𝐮𝐧𝐭 /𝐝𝐚𝐭𝐚");
				two.setIcon(R.drawable.mount);
				two.setMessage("If you think some features not working than you may use this");
				two.setPositiveButton("🧩 𝑴𝒐𝒖𝒏𝒕", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Root("mount -o rw,remount /data", "⚡ 𝗠𝗼𝘂𝗻𝘁𝗶𝗻𝗴 /𝗱𝗮𝘁𝗮", "✅ Mounted /data Sucessfully");
					}
				});
				two.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				two.create().show();
			}
		});
		
		linear19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				two.setTitle("𝐅𝐢𝐱 /𝐝𝐚𝐭𝐚/𝐥𝐨𝐜𝐚𝐥/𝐭𝐦𝐩");
				two.setIcon(R.drawable.mount);
				two.setMessage("This folder Used by many App/ADB For temporary work.\n\nFixing it can resolve various issues");
				two.setPositiveButton("❄️ 𝗙𝗶𝘅", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				two.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				final AlertDialog twotwo = two.create();
				twotwo.show();
				((TextView) twotwo.findViewById(twotwo.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
				final ImageView R_icon = new ImageView(getApplicationContext()); 
				R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
				R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
				R_icon.requestLayout();
				R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
				R_icon.setImageResource(R.drawable.infoo);
				((LinearLayout) twotwo.findViewById(twotwo.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
				R_icon.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "If you ever Got Bootloop just try Deleting \n\"/data/local/\" Folder from Recovery\n\nIt needs to be deleted in some cases.");
					}
				});
			}
		});
		
		linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				obb.setTitle("𝐅𝐢𝐱 𝐎𝐛𝐛");
				obb.setIcon(R.drawable.molecul);
				obb.setMessage("Use this option when $INT/Android/Obb folder is causing issue for your device\n1. Reboot\n2. Try this fix once");
				obb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				obb.setPositiveButton("Fix", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				final AlertDialog obbobb = obb.create();
				obbobb.show();
				 
			}
		});
		
		bt2.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		bt2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		bt3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		bt1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Coming Soon in Next Update");
			}
		});
		
		bt4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Coming Soon in Next Update");
			}
		});
		
		linear101.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Coming Soon in Next Update");
			}
		});
		
		linear102.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Coming Soon in Next Update");
			}
		});
		
		linear104.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Coming Soon in Next Update");
			}
		});
		
		linear105.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Coming Soon in Next Update");
			}
		});
		
		linear107.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Coming Soon in Next Update");
			}
		});
		
		linear108.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Coming Soon in Next Update");
			}
		});
		
		lpatcher2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				luckyp.setTitle("𝐂𝐮𝐬𝐭𝐨𝐦 𝐏𝐚𝐭𝐜𝐡𝐞𝐬 Cleaner");
				luckyp.setIcon(R.drawable.smiling);
				luckyp.setMessage("It Will Clear All Custom Patches Downloaded in Lucky Patcher App");
				luckyp.setPositiveButton("🚀 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				luckyp.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				luckyp.create().show();
			}
		});
		
		lpatcher.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				luckyp.setTitle("𝗠𝗼𝗱𝗶𝗳𝗶𝗲𝗱 𝗔𝗽𝗽𝘀 Cleaner");
				luckyp.setMessage("It Will Clear All Modified/Patched apps by lucky patcher");
				luckyp.setIcon(R.drawable.smiling);
				luckyp.setPositiveButton("🚀 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				luckyp.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				luckyp.create().show();
			}
		});
		
		linear28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		linear29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Nomedia.setTitle(".𝐍𝐨𝐦𝐞𝐝𝐢𝐚 𝐂𝐥𝐞𝐚𝐧𝐞𝐫");
				Nomedia.setIcon(R.drawable.thumb);
				Nomedia.setMessage("Clears All .Nomedia Files From Internal Storage");
				final CheckBox nomed = new CheckBox(CustomCleanerActivity.this);
				nomed.setText("Clean Globally From '/data'");
				LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
				nomed.setLayoutParams(lpar);
				Nomedia.setView(nomed);
				Nomedia.setPositiveButton("🛸 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				Nomedia.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				final AlertDialog NomediaNomedia = Nomedia.create();
				NomediaNomedia.show();
				((TextView) NomediaNomedia.findViewById(NomediaNomedia.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
				final ImageView R_icon = new ImageView(getApplicationContext()); 
				R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
				R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
				R_icon.requestLayout();
				R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
				R_icon.setImageResource(R.drawable.infoo);
				((LinearLayout) NomediaNomedia.findViewById(NomediaNomedia.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
				R_icon.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "These files are generally used to hide media from being detected in apps");
					}
				});
			}
		});
		
		linear31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				clear.performClick();
			}
		});
		
		clear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				clearData.setTitle("𝗔𝗽𝗽𝘀 𝗗𝗮𝘁𝗮 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
				clearData.setMessage("It Can Clean any App data by Package Name");
				clearData.setIcon(R.drawable.checklist_2);
				clearData.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				LinearLayout Cldata = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
				Cldata.setOrientation(LinearLayout.VERTICAL);
				EditText cledt = new EditText(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
				cledt.setHint("Enter Package Name here");
				cledt.setTextColor(0xFFF50057);
				cledt.setHintTextColor(0xFF2196F3);
				Cldata.addView(cledt);
				LinearLayout opt = new LinearLayout(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));}};
				opt.setOrientation(LinearLayout.HORIZONTAL);
				CheckBox clch = new CheckBox(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				clch.setText("I confirm ; Deleted data will not recover ");
				opt.addView(clch);
				ImageView img = new ImageView(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				img.setImageResource(R.drawable.ic_error_black);
				opt.addView(img);
				Cldata.addView(opt);
				Button clbt = new Button(getApplication()){{setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));}};
				clbt.setText("Clean");
				clbt.setTextColor(0xFF000000);
				clbt.setTextSize((int)12);
				clbt.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFB9F6CA));
				Cldata.addView(clbt);
				((ViewGroup.MarginLayoutParams) clbt.getLayoutParams()).setMargins(30, 0, 0, 0);
				
				img.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Some apps like Thanox/X-APM can prevent apps data to be deleted.\nTo delete such prevented data ; first disable their Protection mechanism for respected app");
					}
				});
				clbt.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				clearData.setView(Cldata);
				clearData.create().show();
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("🧩 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝗧𝗼𝗼𝗹𝗯𝗼𝘅");
	}
	
	@Override
	public void onBackPressed() {
		finish();
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		
	}
	
	@Override
	public void onStart() {
		super.onStart();
		_color1();
	}
	public void _color1() {
		
		_Themer(bt1);
		_Themer(bt4);
		_Themer(bt2);
		_Themer(bt3);
		_Themer(linear28);
		_Themer(linear29);
		_Themer(linear31);
		_Themer(lpatcher);
		_Themer(lpatcher2);
		_Themer(linear101);
		_Themer(linear102);
		_Themer(linear104);
		_Themer(linear105);
		_Themer(linear107);
		_Themer(linear108);
	}
	
	
	public void _NoMediaClean() {
		_Info_or_Help("Update Required", "Download Latest version to use Features");
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
				 
			}
		}
	}
	
	
	public void _Err() {
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
	
	
	public void _Root(final String _cmd, final String _Title, final String _Toast) {
		try {
			   
			    final String command = _cmd;
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
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
									_Err();
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
								                        Toast.makeText(CustomCleanerActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
								                    }
							                });
						            }
					        }
				    }, 100);
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _RequirePremium() {
		prm.setTitle("𝐑𝐞𝐪𝐮𝐢𝐫𝐞 𝐏𝐫𝐞𝐦𝐢𝐮𝐦");
		prm.setMessage("This is a premium feature \npurchase premium to use ");
		prm.setIcon(R.drawable.img_5);
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
	
	
	public void _rooot(final String _Title, final String _cmd, final String _Title2, final String _Storage, final String _Replace, final String _info, final String _msg) {
		cleaner.setTitle(_Title);
		cleaner.setMessage(_Title2.concat("\n\n  𝐓𝐨𝐭𝐚𝐥 𝐬𝐢𝐳𝐞 : Calculating..."));
		cleaner.setIcon(R.drawable.star);
		cleaner.setPositiveButton("🚀 𝘾𝙡𝙚𝙖𝙣", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				_Root(_cmd, _Title2, "🔰 Sucessfully Cleaned");
			}
		});
		final AlertDialog cleanercleaner = cleaner.create();
		cleanercleaner.show();
		((TextView) cleanercleaner.findViewById(cleanercleaner.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
		final ImageView R_icon = new ImageView(getApplicationContext()); 
		R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
		R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
		R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
		((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
		R_icon.requestLayout();
		R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
		R_icon.setImageResource(R.drawable.infoo);
		((LinearLayout) cleanercleaner.findViewById(cleanercleaner.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
		try {
			   
			    final String command = _Storage;
			
			
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
									((TextView) cleanercleaner.findViewById(android.R.id.message)).setText(_Title2.concat("\n\n  𝐓𝐨𝐭𝐚𝐥 𝐬𝐢𝐳𝐞 : ").concat(variable));
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(errorText.toString());
									((TextView) cleanercleaner.findViewById(android.R.id.message)).setText("\n  𝐓𝐨𝐭𝐚𝐥 𝐬𝐢𝐳𝐞 : ⚠️");
									try {
										    String cmdxx = "du"; 
										    Runtime.getRuntime().exec(cmdxx);
										_Err();
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
								                        Toast.makeText(CustomCleanerActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
								                    }
							                });
						            }
					        }
				    }, 100);
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
		R_icon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", _msg);
			}
		});
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