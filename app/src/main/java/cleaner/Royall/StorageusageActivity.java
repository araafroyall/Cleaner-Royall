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
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
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
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class StorageusageActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private double converter = 0;
	private double Converter = 0;
	private String oatcode = "";
	private String oatSizer = "";
	private String variable = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout header;
	private LinearLayout linear31;
	private LinearLayout linear45;
	private LinearLayout linear13;
	private LinearLayout linear41;
	private LinearLayout linear39;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private LinearLayout linear21;
	private LinearLayout linear23;
	private LinearLayout linear25;
	private LinearLayout linear33;
	private LinearLayout linear35;
	private LinearLayout linear57;
	private LinearLayout linear59;
	private TextView result;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear32;
	private TextView totalfree;
	private TextView textview30;
	private ImageView imageview3;
	private LinearLayout linear46;
	private TextView freeav;
	private TextView textview44;
	private LinearLayout linear14;
	private TextView system;
	private TextView textview12;
	private LinearLayout linear42;
	private TextView systemusage;
	private TextView textview40;
	private LinearLayout linear40;
	private TextView datausage;
	private TextView textview38;
	private LinearLayout linear18;
	private TextView magisk;
	private TextView textview16;
	private LinearLayout linear20;
	private TextView internal;
	private TextView textview18;
	private LinearLayout linear22;
	private TextView delvik;
	private TextView textview20;
	private LinearLayout linear24;
	private TextView oat;
	private TextView textview22;
	private LinearLayout linear26;
	private TextView multiInternal;
	private TextView textview24;
	private ImageView imageview2;
	private LinearLayout linear34;
	private TextView log;
	private TextView textview32;
	private ImageView imageview4;
	private LinearLayout linear36;
	private TextView vendor;
	private TextView textview34;
	private LinearLayout linear58;
	private TextView vendoru;
	private TextView textview56;
	private LinearLayout linear60;
	private TextView sysext;
	private TextView textview58;
	
	private SharedPreferences set;
	private AlertDialog.Builder d1;
	private TimerTask t;
	private AlertDialog.Builder notify;
	private AlertDialog.Builder info;
	private AlertDialog.Builder Errar;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.storageusage);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		header = findViewById(R.id.header);
		linear31 = findViewById(R.id.linear31);
		linear45 = findViewById(R.id.linear45);
		linear13 = findViewById(R.id.linear13);
		linear41 = findViewById(R.id.linear41);
		linear39 = findViewById(R.id.linear39);
		linear17 = findViewById(R.id.linear17);
		linear19 = findViewById(R.id.linear19);
		linear21 = findViewById(R.id.linear21);
		linear23 = findViewById(R.id.linear23);
		linear25 = findViewById(R.id.linear25);
		linear33 = findViewById(R.id.linear33);
		linear35 = findViewById(R.id.linear35);
		linear57 = findViewById(R.id.linear57);
		linear59 = findViewById(R.id.linear59);
		result = findViewById(R.id.result);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		linear32 = findViewById(R.id.linear32);
		totalfree = findViewById(R.id.totalfree);
		textview30 = findViewById(R.id.textview30);
		imageview3 = findViewById(R.id.imageview3);
		linear46 = findViewById(R.id.linear46);
		freeav = findViewById(R.id.freeav);
		textview44 = findViewById(R.id.textview44);
		linear14 = findViewById(R.id.linear14);
		system = findViewById(R.id.system);
		textview12 = findViewById(R.id.textview12);
		linear42 = findViewById(R.id.linear42);
		systemusage = findViewById(R.id.systemusage);
		textview40 = findViewById(R.id.textview40);
		linear40 = findViewById(R.id.linear40);
		datausage = findViewById(R.id.datausage);
		textview38 = findViewById(R.id.textview38);
		linear18 = findViewById(R.id.linear18);
		magisk = findViewById(R.id.magisk);
		textview16 = findViewById(R.id.textview16);
		linear20 = findViewById(R.id.linear20);
		internal = findViewById(R.id.internal);
		textview18 = findViewById(R.id.textview18);
		linear22 = findViewById(R.id.linear22);
		delvik = findViewById(R.id.delvik);
		textview20 = findViewById(R.id.textview20);
		linear24 = findViewById(R.id.linear24);
		oat = findViewById(R.id.oat);
		textview22 = findViewById(R.id.textview22);
		linear26 = findViewById(R.id.linear26);
		multiInternal = findViewById(R.id.multiInternal);
		textview24 = findViewById(R.id.textview24);
		imageview2 = findViewById(R.id.imageview2);
		linear34 = findViewById(R.id.linear34);
		log = findViewById(R.id.log);
		textview32 = findViewById(R.id.textview32);
		imageview4 = findViewById(R.id.imageview4);
		linear36 = findViewById(R.id.linear36);
		vendor = findViewById(R.id.vendor);
		textview34 = findViewById(R.id.textview34);
		linear58 = findViewById(R.id.linear58);
		vendoru = findViewById(R.id.vendoru);
		textview56 = findViewById(R.id.textview56);
		linear60 = findViewById(R.id.linear60);
		sysext = findViewById(R.id.sysext);
		textview58 = findViewById(R.id.textview58);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		d1 = new AlertDialog.Builder(this);
		notify = new AlertDialog.Builder(this);
		info = new AlertDialog.Builder(this);
		Errar = new AlertDialog.Builder(this);
		
		header.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "•On some devices , Few options may show 𝗪𝗿𝗼𝗻𝗴 𝗖𝗮𝗹𝗰𝘂𝗹𝗮𝘁𝗶𝗼𝗻\n• If any of these option not works for you, Don't try to use again.\n\n(In upcoming updates this feature may have each storage viewer with accurately output)");
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "This is Totall Fixed Storage which can be used to store data\nIt does 𝐍𝐨𝐭 include Partition like system , vendor etc");
			}
		});
		
		freeav.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		magisk.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_magiskStorage();
			}
		});
		
		internal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_InternalStorage();
			}
		});
		
		delvik.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_delvikstorage();
			}
		});
		
		oat.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_oatStorage();
			}
		});
		
		multiInternal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_multiInternall();
			}
		});
		
		textview24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "It Shows the total size of Multi users Internal Storage, including /storage/emulated/0/\nIf no MultiUser found than it will show storage usage of /storage/emulated/0/\nIt Also Includes External SD Card Storage Usage ");
			}
		});
		
		log.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					   
					    final String command = "#!/bin/sh\n\nfind /data -type f -name \"*.log\" -exec du -csh {} + | awk '/total/ {print $1}'";
					
					
					    final TextView log = findViewById(R.id.log); 
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
											                            log.setText(outputText.toString());
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
											log.setText(log.getText().toString().concat("B"));
											                        }
										                    });
									                } else {
									                    runOnUiThread(new Runnable() {
										                        @Override
										                        public void run() {
											                            log.setText(errorText.toString());
											_Errr();
											                        }
										                    });
									                }
								            } catch (Exception e) {
								                e.printStackTrace();
								                
								                final String errorMessage = "Error: " + e.getMessage();
								                runOnUiThread(new Runnable() {
									                    @Override
									                    public void run() {
										                        log.setText(errorMessage);
										                        Toast.makeText(StorageusageActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
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
		
		textview32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "It shows the Total size of *.𝒍𝒐𝒈 Extentions Only\nIt means the size of log files name ending with .log will be calculated.\n\n𝗡𝗼𝘁𝗲 : \n'Logs Cleaner' Cleans 𝑨𝒍𝒍 logs with or without extension as mentioned in 'help & Directory list'.");
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("💽 𝗦𝘁𝗼𝗿𝗮𝗴𝗲 𝗨𝘀𝗮𝗴𝗲");
		header.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFC6FF00));
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		if (set.getString("strgvr", "").contains("1")) {
			
		}
		else {
			notify.setTitle("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
			notify.setIcon(R.drawable.info_1);
			notify.setMessage("This Feature is Still in Beta stage & have some inaccuracy or slighty mismatch sizes\n\nThis feature may give you 𝗪𝗿𝗼𝗻𝗴 𝗖𝗮𝗹𝗰𝘂𝗹𝗮𝘁𝗶𝗼𝗻 as it is not fully verified for works on All devices");
			LinearLayout setup2done = new LinearLayout(StorageusageActivity.this);
			setup2done.setOrientation(LinearLayout.VERTICAL);
			
			LinearLayout.LayoutParams p2done = new LinearLayout.LayoutParams(
			    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
			
			final CheckBox setup2check = new CheckBox(StorageusageActivity.this);
			setup2check.setText("I Understand : Don't Show Again");
			setup2check.setLayoutParams(p2done);
			setup2done.addView(setup2check);
			
			notify.setView(setup2done);
			notify.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					if
					((setup2check.isChecked())){
						
						set.edit().putString("strgvr", "1").commit();
					}
					else
					{
						 
						
					}
				}
			});
			notify.create().show();
		}
		_Animation();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		try {
			java.io.File internalStorage = android.os.Environment.getDataDirectory();
			android.os.StatFs stat = new android.os.StatFs(internalStorage.getPath());
			long blockSize = stat.getBlockSizeLong();
			long totalBlocks = stat.getBlockCountLong();
			long totalAvailableBytes = totalBlocks * blockSize;
			
			double totalAvailableGB = (double) totalAvailableBytes / (1024 * 1024 * 1024);
			
			totalAvailableGB = Math.round(totalAvailableGB * 100.0) / 100.0;
			
			totalfree.setText(totalAvailableGB + " GB");
		} catch (Exception e) {
			 
		}
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						try {
							java.io.File systemPartition = new java.io.File("/system");
							android.os.StatFs stat = new android.os.StatFs(systemPartition.getPath());
							long blockSize = stat.getBlockSizeLong();
							long totalBlocks = stat.getBlockCountLong();
							long availableBlocks = stat.getAvailableBlocksLong();
							
							long totalSystemPartitionSize = totalBlocks * blockSize;
							long systemPartitionUsage = (totalBlocks - availableBlocks) * blockSize;
							
							double totalSystemPartitionGB = (double) totalSystemPartitionSize / (1024 * 1024 * 1024);
							totalSystemPartitionGB = Math.round(totalSystemPartitionGB * 100.0) / 100.0;
							
							double systemPartitionUsageGB = (double) systemPartitionUsage / (1024 * 1024 * 1024);
							systemPartitionUsageGB = Math.round(systemPartitionUsageGB * 100.0) / 100.0;
							
							system.setText(totalSystemPartitionGB + " GB");
							
							systemusage.setText(systemPartitionUsageGB + " GB");
						} catch (Exception e) {
							 
						}
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
						try {
							java.io.File dataPartition = new java.io.File("/data");
							android.os.StatFs stat = new android.os.StatFs(dataPartition.getPath());
							long blockSize = stat.getBlockSizeLong();
							long totalBlocks = stat.getBlockCountLong();
							long availableBlocks = stat.getAvailableBlocksLong();
							
							long totalDataPartitionSize = totalBlocks * blockSize;
							long dataPartitionUsage = (totalBlocks - availableBlocks) * blockSize;
							
							double totalDataGB = (double) totalDataPartitionSize / (1024 * 1024 * 1024);
							totalDataGB = Math.round(totalDataGB * 100.0) / 100.0;
							
							double dataUsageGB = (double) dataPartitionUsage / (1024 * 1024 * 1024);
							dataUsageGB = Math.round(dataUsageGB * 100.0) / 100.0;
							
							
							datausage.setText(dataUsageGB + " GB");
						} catch (Exception e) {
							 
						}
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
						try {
							String internalStoragePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
							android.os.StatFs stat = new android.os.StatFs(internalStoragePath);
							long blockSize = stat.getBlockSizeLong();
							long totalBlocks = stat.getBlockCountLong();
							long availableBlocks = stat.getAvailableBlocksLong();
							
							String sdCardPath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
							
							long totalInternalStorageSize = totalBlocks * blockSize;
							long internalStorageUsage = (totalBlocks - availableBlocks) * blockSize;
							
							double totalInternalStorageGB = (double) totalInternalStorageSize / (1024 * 1024 * 1024);
							totalInternalStorageGB = Math.round(totalInternalStorageGB * 100.0) / 100.0;
							
							double internalStorageUsageGB = (double) internalStorageUsage / (1024 * 1024 * 1024);
							internalStorageUsageGB = Math.round(internalStorageUsageGB * 100.0) / 100.0;
							
							freeav.setText(+ (totalInternalStorageGB - internalStorageUsageGB) + " GB");
						} catch (Exception e) {
							 
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
							java.io.File systemPartition = new java.io.File("/vendor");
							android.os.StatFs stat = new android.os.StatFs(systemPartition.getPath());
							long blockSize = stat.getBlockSizeLong();
							long totalBlocks = stat.getBlockCountLong();
							long availableBlocks = stat.getAvailableBlocksLong();
							
							long totalSystemPartitionSize = totalBlocks * blockSize;
							long systemPartitionUsage = (totalBlocks - availableBlocks) * blockSize;
							
							double totalSystemPartitionGB = (double) totalSystemPartitionSize / (1024 * 1024 * 1024);
							totalSystemPartitionGB = Math.round(totalSystemPartitionGB * 100.0) / 100.0;
							
							double systemPartitionUsageGB = (double) systemPartitionUsage / (1024 * 1024 * 1024);
							systemPartitionUsageGB = Math.round(systemPartitionUsageGB * 100.0) / 100.0;
							
							vendor.setText(totalSystemPartitionGB + " GB");
							
							vendoru.setText(systemPartitionUsageGB + " GB");
						} catch (Exception e) {
							 
						}
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
						try {
							java.io.File systemPartition = new java.io.File("/system_ext");
							android.os.StatFs stat = new android.os.StatFs(systemPartition.getPath());
							long blockSize = stat.getBlockSizeLong();
							long totalBlocks = stat.getBlockCountLong();
							long availableBlocks = stat.getAvailableBlocksLong();
							
							long totalSystemPartitionSize = totalBlocks * blockSize;
							long systemPartitionUsage = (totalBlocks - availableBlocks) * blockSize;
							
							double totalSystemPartitionGB = (double) totalSystemPartitionSize / (1024 * 1024 * 1024);
							totalSystemPartitionGB = Math.round(totalSystemPartitionGB * 100.0) / 100.0;
							
							double systemPartitionUsageGB = (double) systemPartitionUsage / (1024 * 1024 * 1024);
							systemPartitionUsageGB = Math.round(systemPartitionUsageGB * 100.0) / 100.0;
							
							sysext.setText(systemPartitionUsageGB + " GB");
						} catch (Exception e) {
							 
						}
						_magiskStorage();
					}
				});
			}
		};
		_timer.schedule(t, (int)(500));
	}
	public void _oatStorage() {
		try {
			    
			    final String command = "mkdir -p /data/app/oat/oat/oat > /dev/null 2>&1\nmkdir -p /data/app/oat/oat > /dev/null 2>&1\n\ndu -hcs /data/app/*/*/oat /data/app/*/oat | grep total | cut -f 1\n\nrm -rf /data/app/oat/oat/oat > /dev/null 2>&1\nrm -rf /data/app/oat/oat > /dev/null 2>&1";
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(StorageusageActivity.this)
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
									variable = result.getText().toString().replace("\n", "").concat("B");
									result.setText("");
									oat.setText(variable);
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									oat.setText("⚠️");
									try {
										    String cmdxx = "du"; 
										    Runtime.getRuntime().exec(cmdxx);
										_Errr();
									} catch (Exception e) {
										_ERROR("Size Calculation Mechanism Not Found in Your Device. Install Busybox to fix this issue");
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
								                        Toast.makeText(StorageusageActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
								                    }
							                });
						            }
					        }
				    }, 100);
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _delvikstorage() {
		try {
			   
			    final String command = "du -hcs /data/dalvik-cache | grep total | cut -f 1";
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(StorageusageActivity.this)
			            .setTitle("⚡𝗖𝗮𝗹𝗰𝘂𝗹𝗮𝘁𝗶𝗻𝗴 𝗦𝗶𝘇𝗲")
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
									variable = result.getText().toString().replace("\n", "").concat("B");
									result.setText("");
									delvik.setText(variable);
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(errorText.toString());
									delvik.setText("⚠️");
									try {
										    String cmdxx = "du"; 
										    Runtime.getRuntime().exec(cmdxx);
										_Errr();
									} catch (Exception e) {
										_ERROR("Size Calculation Mechanism Not Found in Your Device. Install Busybox to fix this issue");
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
								                        Toast.makeText(StorageusageActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
								                    }
							                });
						            }
					        }
				    }, 100);
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _magiskStorage() {
		try {
			   
			    final String command = "du -hcs /data/adb | grep total | cut -f 1";
			
			
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
									magisk.setText(variable);
									_InternalStorage();
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(errorText.toString());
									magisk.setText("⚠️");
									try {
										    String cmdxx = "du"; 
										    Runtime.getRuntime().exec(cmdxx);
										_Errr();
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
								                        Toast.makeText(StorageusageActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
								                    }
							                });
						            }
					        }
				    }, 100);
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _multiInternall() {
		try {
			    
			    final String command = "#!/bin/sh\n\nif [ -d \"/data/media\" ]; then\n    du -hcs /data/media/ | grep total | cut -f 1\nelse\n    araafroyall\n    exit 1\nfi";
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(StorageusageActivity.this)
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
									variable = result.getText().toString().replace("\n", "").concat("B");
									result.setText("");
									multiInternal.setText(variable);
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									multiInternal.setText("⚠️");
									if (result.getText().toString().contains("araafroyall")) {
										_ERROR("MultiUser Internal Storage Path not Detected for your device . Please Contact Developer for Help");
									}
									else {
										try {
											    String cmdxx = "du"; 
											    Runtime.getRuntime().exec(cmdxx);
											_Errr();
										} catch (Exception e) {
											_ERROR("Size Calculation Mechanism Not Found in Your Device. Install Busybox to fix this issue");
										}
										
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
								                        Toast.makeText(StorageusageActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
								                    }
							                });
						            }
					        }
				    }, 100);
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _Logsizer() {
		try {
			    
			    final String command = "find /data -type f -name \"*.log\" -exec du -csh {} + | awk 'END {print}'";
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(StorageusageActivity.this)
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
									variable = result.getText().toString().replace("\n", "");
									if (variable.length() > 6) {
										converter = Double.parseDouble(result.getText().toString());
										Converter = converter / 1000;
										variable = new DecimalFormat("0.00").format(Converter).concat(" GB");
									}
									else {
										variable = variable.concat(" MB");
									}
									variable = variable.replace("total", "").trim();
									log.setText(variable);
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
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
								                        Toast.makeText(StorageusageActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
								                    }
							                });
						            }
					        }
				    }, 100);
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
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
	
	
	public void _Animation() {
		if (set.getString("Animation", "").equals("1")) {
			final String textToType = "𝐓𝐡𝐢𝐬 𝐅𝐞𝐚𝐭𝐮𝐫𝐞 𝐇𝐞𝐥𝐩 𝐘𝐨𝐮 𝐭𝐨 𝐆𝐞𝐭 𝐭𝐡𝐞 𝐬𝐢𝐳𝐞 𝐨𝐟 𝐬𝐨𝐦𝐞 𝐝𝐢𝐫𝐞𝐜𝐭𝐨𝐫𝐢𝐞𝐬";
			final int[] charIndex = {0};
			
			final Handler handler = new Handler();
			handler.postDelayed(new Runnable() {
				    @Override
				    public void run() {
					        textview1.setText(textToType.substring(0, charIndex[0]++));
					        if (charIndex[0] <= textToType.length()) {
						            handler.postDelayed(this, 10);
						        }
					    }
			}, 200);
		}
		else {
			
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
				_ERROR("Something went Wrong\nUnable to Calculate");
			} catch (Exception e) {
				_ERROR("Root Acess Not Found or Hidden");
			}
			
		}
		try {
			    String command = "du"; 
			    Runtime.getRuntime().exec(command);
			 
		} catch (Exception e) {
			_ERROR("Busybox is not Properly Installed");
		}
		
		try {
			    String command = "Find"; 
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
	
	
	public void _InternalStorage() {
		try {
			   
			    final String command = "#!/bin/sh\n\nif [ -d \"/storage/emulated/0/\" ]; then\n    du -hcs /storage/emulated/0/ | grep total | cut -f 1\nelif [ -d \"/data/media/0/\" ]; then\n    du -hcs /data/media/0/ | grep total | cut -f 1\nelse\n    araafroyall\n    exit 1\nfi";
			
			
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
									internal.setText(variable);
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
									                            result.setText(errorText.toString());
									internal.setText("⚠️");
									if (result.getText().toString().contains("araafroyall")) {
										_ERROR("Internal Storage Path not Detected for your device . Please Contact Developer for Help");
									}
									else {
										try {
											    String cmdxx = "du"; 
											    Runtime.getRuntime().exec(cmdxx);
											_Errr();
										} catch (Exception e) {
											_ERROR("Size Calculation Mechanism Not Found in Your Device. Install Busybox to fix this issue");
										}
										
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
								                        Toast.makeText(StorageusageActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
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