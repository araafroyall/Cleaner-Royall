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
import android.widget.Button;
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
	private TextView help;
	private LinearLayout linear13;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private LinearLayout linear21;
	private LinearLayout linear23;
	private LinearLayout linear25;
	private Button Calculate;
	private TextView result;
	private LinearLayout linear14;
	private TextView system;
	private TextView textview12;
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
	
	private SharedPreferences set;
	private AlertDialog.Builder d1;
	private TimerTask t;
	private AlertDialog.Builder notify;
	
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
		help = findViewById(R.id.help);
		linear13 = findViewById(R.id.linear13);
		linear17 = findViewById(R.id.linear17);
		linear19 = findViewById(R.id.linear19);
		linear21 = findViewById(R.id.linear21);
		linear23 = findViewById(R.id.linear23);
		linear25 = findViewById(R.id.linear25);
		Calculate = findViewById(R.id.Calculate);
		result = findViewById(R.id.result);
		linear14 = findViewById(R.id.linear14);
		system = findViewById(R.id.system);
		textview12 = findViewById(R.id.textview12);
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
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		d1 = new AlertDialog.Builder(this);
		notify = new AlertDialog.Builder(this);
		
		help.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d1.setTitle("🪧 𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
				d1.setMessage("• On Certain Devices , This Feature may show inaccurate storage usage due to some system components\n• On upcoming updates , This Option may include all features storage view\n• Please provide feedback to Developer if found inaccurate information via \"Cleaner Lite Helper App\"");
				d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d1.create().show();
			}
		});
		
		Calculate.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_oatStorage();
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
				d1.setTitle("🪧 𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
				d1.setMessage("It Shows the total size of Multi users Internal Storage including Device Internal storage usage");
				d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d1.create().show();
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("💽 𝗦𝘁𝗼𝗿𝗮𝗴𝗲 𝗨𝘀𝗮𝗴𝗲");
		help.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFF00));
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		Calculate.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)10, 0xFFFF3D00, 0xFF00E676));
		if (set.getString("storageviewer", "").contains("1")) {
			
		}
		else {
			notify.setTitle("🪧 𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
			notify.setMessage("This Feature is NOT completed yet and may work inaccurately.\nIt Gets Completed in UpComing Updates\n");
			LinearLayout setup2done = new LinearLayout(StorageusageActivity.this);
			setup2done.setOrientation(LinearLayout.VERTICAL);
			
			LinearLayout.LayoutParams p2done = new LinearLayout.LayoutParams(
			    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
			
			final CheckBox setup2check = new CheckBox(StorageusageActivity.this);
			setup2check.setText("Don't Show Again");
			setup2check.setLayoutParams(p2done);
			setup2done.addView(setup2check);
			
			notify.setView(setup2done);
			notify.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					if
					((setup2check.isChecked())){
						
						set.edit().putString("storageviewer", "1").commit();
					}
					else
					{
						 
						
					}
				}
			});
			notify.create().show();
		}
	}
	public void _oatStorage() {
		if (set.getString("AndroidVersion", "").contains("1")) {
			if (set.getString("AndroidVersion", "").equals("11+")) {
				oatcode = "# size checker";
				try {
					    
					    final String command = oatcode;
					
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
											oat.setText(oatSizer);
											t = new TimerTask() {
												@Override
												public void run() {
													runOnUiThread(new Runnable() {
														@Override
														public void run() {
															_delvikstorage();
														}
													});
												}
											};
											_timer.schedule(t, (int)(300));
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
			if (set.getString("AndroidVersion", "").equals("11-")) {
				d1.setTitle("🪧 𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
				d1.setMessage("This Feature is Suspended for lower Android Versions due to wrong calculation of size");
				d1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
								 
						}
				});
				d1.create().show();
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
	
	
	public void _delvikstorage() {
		try {
			   
			    final String command = "# size checker";
			
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
									variable = result.getText().toString().replace("/data/dalvik-cache/", " ");
									variable = variable.replace("3.5K", "0 KB");
									variable = variable.replace("M", " MB");
									variable = variable.replace("\n", "");
									variable = variable.replace("Result", "");
									delvik.setText(variable);
									t = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													_magiskStorage();
												}
											});
										}
									};
									_timer.schedule(t, (int)(300));
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
			    
			    final String command = "# size checker";
			
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
									magisk.setText(variable);
									t = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													_systemstorage();
												}
											});
										}
									};
									_timer.schedule(t, (int)(300));
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
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
	
	
	public void _internalStorage() {
		try {
			    
			    final String command = "# size checker";
			
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
									internal.setText(variable);
									t = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													_multiInternall();
												}
											});
										}
									};
									_timer.schedule(t, (int)(300));
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
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
	
	
	public void _systemstorage() {
		try {
			    
			    final String command = "# size checker";
			
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
									system.setText(variable);
									t = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													_internalStorage();
												}
											});
										}
									};
									_timer.schedule(t, (int)(300));
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
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
			    
			    final String command = "# size checker";
			
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
									multiInternal.setText(variable);
									t = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													_lastTask();
												}
											});
										}
									};
									_timer.schedule(t, (int)(300));
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
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
			    
			    final String command = "# size checker";
			
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
									t = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													
												}
											});
										}
									};
									_timer.schedule(t, (int)(300));
									                        }
								                    });
							                } else {
							                    runOnUiThread(new Runnable() {
								                        @Override
								                        public void run() {
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
	
	
	public void _lastTask() {
		SketchwareUtil.showMessage(getApplicationContext(), "🥏 Sucessfully Calculated ");
		Calculate.setVisibility(View.INVISIBLE);
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