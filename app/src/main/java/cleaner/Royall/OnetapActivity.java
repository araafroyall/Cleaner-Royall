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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class OnetapActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private String a = "";
	private String b = "";
	private String c = "";
	private String d = "";
	private String e = "";
	private String f = "";
	private String g = "";
	private String h = "";
	private String i = "";
	private String j = "";
	private String sspnd = "";
	private String premiumCheck = "";
	private String k = "";
	
	private LinearLayout header;
	private CheckBox logclean;
	private CheckBox wiper;
	private CheckBox dalvik;
	private CheckBox internal;
	private CheckBox oatt;
	private CheckBox additional;
	private CheckBox cacheteim;
	private CheckBox empty;
	private CheckBox customcleaner;
	private CheckBox multuser;
	private Button OneTapClean;
	private ScrollView vscroll1;
	private ImageView imageview1;
	private TextView textview1;
	private TextView Result;
	
	private SharedPreferences dir;
	private SharedPreferences onetap;
	private SharedPreferences premium;
	private TimerTask next;
	private AlertDialog.Builder error;
	private AlertDialog.Builder d2;
	private AlertDialog.Builder Errar;
	private AlertDialog.Builder info;
	private SharedPreferences set;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.onetap);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		header = findViewById(R.id.header);
		logclean = findViewById(R.id.logclean);
		wiper = findViewById(R.id.wiper);
		dalvik = findViewById(R.id.dalvik);
		internal = findViewById(R.id.internal);
		oatt = findViewById(R.id.oatt);
		additional = findViewById(R.id.additional);
		cacheteim = findViewById(R.id.cacheteim);
		empty = findViewById(R.id.empty);
		customcleaner = findViewById(R.id.customcleaner);
		multuser = findViewById(R.id.multuser);
		OneTapClean = findViewById(R.id.OneTapClean);
		vscroll1 = findViewById(R.id.vscroll1);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		Result = findViewById(R.id.Result);
		dir = getSharedPreferences("dir", Activity.MODE_PRIVATE);
		onetap = getSharedPreferences("onetap", Activity.MODE_PRIVATE);
		premium = getSharedPreferences("premium", Activity.MODE_PRIVATE);
		error = new AlertDialog.Builder(this);
		d2 = new AlertDialog.Builder(this);
		Errar = new AlertDialog.Builder(this);
		info = new AlertDialog.Builder(this);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		
		logclean.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		logclean.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					onetap.edit().putString("a", "1").commit();
				}
				else {
					onetap.edit().remove("a").commit();
					a = "print skipping";
				}
			}
		});
		
		wiper.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		wiper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					onetap.edit().putString("b", "1").commit();
				}
				else {
					b = "print skipping";
					onetap.edit().remove("b").commit();
				}
			}
		});
		
		dalvik.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					onetap.edit().putString("c", "1").commit();
				}
				else {
					onetap.edit().remove("c").commit();
					c = "print skipping";
				}
			}
		});
		
		internal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		internal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					onetap.edit().putString("e", "1").commit();
				}
				else {
					e = "print skipping";
					onetap.edit().remove("e").commit();
				}
			}
		});
		
		oatt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		oatt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					onetap.edit().putString("f", "1").commit();
				}
				else {
					f = "print skipping";
					onetap.edit().remove("f").commit();
				}
			}
		});
		
		additional.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		additional.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					onetap.edit().putString("k", "1").commit();
				}
				else {
					k = "print skipping";
					onetap.edit().remove("k").commit();
				}
			}
		});
		
		cacheteim.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		cacheteim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					onetap.edit().putString("d", "1").commit();
				}
				else {
					d = "print skipping";
					onetap.edit().remove("d").commit();
				}
			}
		});
		
		empty.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					onetap.edit().putString("g", "1").commit();
				}
				else {
					g = "print skipping";
					onetap.edit().remove("g").commit();
				}
			}
		});
		
		customcleaner.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					onetap.edit().putString("h", "1").commit();
				}
				else {
					onetap.edit().remove("h").commit();
					h = "print skipping";
				}
			}
		});
		
		multuser.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		multuser.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					onetap.edit().putString("i", "1").commit();
				}
				else {
					i = "print skipping";
					onetap.edit().remove("i").commit();
				}
			}
		});
		
		OneTapClean.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("𝗢𝗻𝗲𝗧𝗮𝗽 𝗖𝗹𝗲𝗮𝗻");
				d2.setIcon(R.drawable.shuttle_1);
				d2.setMessage("It Can Perform Multiple Functions at a Time");
				d2.setPositiveButton("🛸 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
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
	}
	
	private void initializeLogic() {
		setTitle("🚀 𝗢𝗻𝗲𝗧𝗮𝗽 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
		if (set.getString("Animation", "").equals("1")) {
			final String textToType = "𝐒𝐞𝐥𝐞𝐜𝐭 𝐭𝐡𝐞 𝐅𝐮𝐧𝐜𝐭𝐢𝐨𝐧𝐬 𝐟𝐨𝐫 𝐨𝐧𝐞𝐓𝐚𝐩 𝐂𝐥𝐞𝐚𝐧𝐞𝐫 , The unselected will be skipped\n(𝐘𝐨𝐮𝐫 𝐏𝐫𝐞𝐟𝐞𝐫𝐚𝐧𝐜𝐞 𝐰𝐢𝐥𝐥 𝐛𝐞 𝐬𝐚𝐯𝐞𝐝 𝐟𝐨𝐫 𝐥𝐚𝐭𝐞𝐫 𝐮𝐬𝐞)";
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
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		next = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (onetap.getString("a", "").equals("1")) {
							logclean.setChecked(true);
						}
						else {
							logclean.setChecked(false);
						}
						if (onetap.getString("b", "").equals("1")) {
							wiper.setChecked(true);
						}
						else {
							wiper.setChecked(false);
						}
						if (onetap.getString("c", "").equals("1")) {
							dalvik.setChecked(true);
						}
						else {
							dalvik.setChecked(false);
						}
						if (onetap.getString("e", "").equals("1")) {
							internal.setChecked(true);
						}
						else {
							internal.setChecked(false);
						}
						if (onetap.getString("f", "").equals("1")) {
							oatt.setChecked(true);
						}
						else {
							oatt.setChecked(false);
						}
						if (onetap.getString("d", "").equals("1")) {
							cacheteim.setChecked(true);
						}
						else {
							cacheteim.setChecked(false);
						}
						if (onetap.getString("g", "").equals("1")) {
							empty.setChecked(true);
						}
						else {
							empty.setChecked(false);
						}
						if (onetap.getString("h", "").equals("1")) {
							customcleaner.setChecked(true);
						}
						else {
							customcleaner.setChecked(false);
						}
						if (onetap.getString("i", "").equals("1")) {
							multuser.setChecked(true);
						}
						else {
							multuser.setChecked(false);
						}
						if (onetap.getString("k", "").equals("1")) {
							additional.setChecked(true);
						}
						else {
							additional.setChecked(false);
						}
					}
				});
			}
		};
		_timer.schedule(next, (int)(500));
	}
	
	@Override
	public void onStart() {
		super.onStart();
		_Theme();
	}
	public void _log() {
		try {
			    final String command = a; 
			    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
			            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐋𝐨𝐠𝐬")
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
							                  
							if (onetap.getString("a", "").equals("1")) {
								Result.setText(Result.getText().toString().concat("\n• Cleared All Logs"));
							}
							else {
								Result.setText(Result.getText().toString().concat("\n• Skipping Logs Cleaner"));
							}
							next = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											_delvik();
										}
									});
								}
							};
							_timer.schedule(next, (int)(300));
							                } else {
							                    
							_Error();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
						            }
					        }
				    }, 100); 
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _delvik() {
		try {
			    final String command = c; 
			    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
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
							                  
							if (onetap.getString("c", "").equals("1")) {
								Result.setText(Result.getText().toString().concat("\n• Cleared Delvik Cache"));
							}
							else {
								Result.setText(Result.getText().toString().concat("\n• Skipping Dalvik Cleaner"));
							}
							next = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											_internalstorage();
										}
									});
								}
							};
							_timer.schedule(next, (int)(300));
							                } else {
							                    
							_Error();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
						            }
					        }
				    }, 100); 
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _internalstorage() {
		try {
			    final String command = e; 
			    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
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
							                  
							if (onetap.getString("e", "").equals("1")) {
								Result.setText(Result.getText().toString().concat("\n• Cleared Internal Storage Wastes"));
							}
							else {
								Result.setText(Result.getText().toString().concat("\n• Skipping Internal Storage cleaner"));
							}
							next = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											_wiperApi();
										}
									});
								}
							};
							_timer.schedule(next, (int)(300));
							                } else {
							                    
							_Error();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
						            }
					        }
				    }, 100); 
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _wiperApi() {
		try {
			    final String command = b; 
			    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
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
							                  
							if (onetap.getString("b", "").equals("1")) {
								Result.setText(Result.getText().toString().concat("\n• Performed Easy Cache Wiper API"));
							}
							else {
								Result.setText(Result.getText().toString().concat("\n• Skipping Cache Wiper API"));
							}
							next = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											_additionals();
										}
									});
								}
							};
							_timer.schedule(next, (int)(300));
							                } else {
							                    
							_Error();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
						            }
					        }
				    }, 100); 
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _Error() {
		Result.setText(Result.getText().toString().concat("\n• 𝗦𝗼𝗺𝗲𝘁𝗵𝗶𝗻𝗴 𝗪𝗲𝗻𝘁 𝘄𝗿𝗼𝗻𝗴 or Root Permission Denied"));
		if (Result.getText().toString().contains("Permission denied")) {
			_ERROR("Root Permission Denied");
		}
		else {
			try {
				    String command = "su"; 
				    Runtime.getRuntime().exec(command);
				if (Result.getText().toString().contains("araafroyall")) {
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
		
		Result.setText("");
	}
	
	
	public void _oat() {
		try {
			    final String command = f; 
			    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
			            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐨𝐚𝐭 (𝐨𝐝𝐞𝐱/𝐯𝐝𝐞𝐱)")
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
							                  
							if (onetap.getString("f", "").equals("1")) {
								Result.setText(Result.getText().toString().concat("\n• Cleaner oat (odex/vdex) of user Apps"));
							}
							else {
								Result.setText(Result.getText().toString().concat("\n• Skipping oat Cleaner"));
							}
							next = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											_premiumCheckpoint();
										}
									});
								}
							};
							_timer.schedule(next, (int)(300));
							                } else {
							                    
							_Error();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
						            }
					        }
				    }, 100); 
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _premiumCheckpoint() {
		if (premium.getString("purchased", "").equals("1")) {
			try {
				    final String command = premiumCheck; 
				    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
				            .setTitle("⚡𝗖𝗵𝗲𝗰𝗸𝗶𝗻𝗴 𝗣𝗿𝗲𝗺𝗶𝘂𝗺")
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
								                  
								next = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												_cacheTrim();
											}
										});
									}
								};
								_timer.schedule(next, (int)(300));
								                } else {
								                    
								_Error();
								                }
							            } catch (Exception e) {
							                e.printStackTrace();
							                alertDialog.dismiss(); 
							                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
							            }
						        }
					    }, 100); 
			} catch (Exception e) {
				    e.printStackTrace();
			}
			
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), "✅ Sucessfully Performed OneTap Action");
			Result.setText(Result.getText().toString().concat("\n• 𝕆𝕟𝕖𝕋𝕒𝕡 ℂ𝕝𝕖𝕒𝕟𝕖𝕣 ℙ𝕖𝕣𝕗𝕠𝕣𝕞𝕖𝕕 𝕊𝕦𝕔𝕖𝕤𝕤𝕗𝕦𝕝𝕝𝕪"));
		}
	}
	
	
	public void _cacheTrim() {
		try {
			    final String command = d; 
			    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
			            .setTitle("⚡ 𝗧𝗿𝗶𝗺𝗺𝗶𝗻𝗴 𝗖𝗮𝗰𝗵𝗲𝘀")
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
							                  
							if (onetap.getString("d", "").equals("1")) {
								Result.setText(Result.getText().toString().concat("\n• Trimmed Caches"));
							}
							else {
								Result.setText(Result.getText().toString().concat("\n• Skipping Cache Trim"));
							}
							next = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											_Emptyfolder();
										}
									});
								}
							};
							_timer.schedule(next, (int)(300));
							                } else {
							                    
							_Error();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
						            }
					        }
				    }, 100); 
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _Emptyfolder() {
		try {
			    final String command = g; 
			    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
			            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐄𝐦𝐩𝐭𝐲 𝐅𝐨𝐥𝐝𝐞𝐫𝐬")
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
							                  
							if (onetap.getString("g", "").equals("1")) {
								Result.setText(Result.getText().toString().concat("\n•  Cleared Empty Folders"));
							}
							else {
								Result.setText(Result.getText().toString().concat("\n• Skipping Empty Folder Cleaner"));
							}
							next = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											_CustonCleaner();
										}
									});
								}
							};
							_timer.schedule(next, (int)(300));
							                } else {
							                    
							_Error();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
						            }
					        }
				    }, 100); 
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _CustonCleaner() {
		try {
			    final String command = h; 
			    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
			            .setTitle("⚡𝐏𝐞𝐫𝐟𝐨𝐫𝐦𝐢𝐧𝐠 𝐂𝐮𝐬𝐭𝐨𝐦 𝐜𝐥𝐞𝐚𝐧")
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
							                  
							if (onetap.getString("h", "").equals("1")) {
								Result.setText(Result.getText().toString().concat("\n• Performed Custom Clean"));
							}
							else {
								Result.setText(Result.getText().toString().concat("\n• Skipping Custom Clean"));
							}
							next = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											_MultiUserClean();
										}
									});
								}
							};
							_timer.schedule(next, (int)(300));
							                } else {
							                    
							_Error();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
						            }
					        }
				    }, 100); 
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _MultiUserClean() {
		try {
			    final String command = i; 
			    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
			            .setTitle("⚡ 𝐏𝐞𝐫𝐟𝐨𝐫𝐦𝐢𝐧𝐠 𝐌𝐮𝐥𝐭𝐢𝐔𝐬𝐞𝐫 𝐜𝐥𝐞𝐚𝐧")
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
							                  
							if (onetap.getString("e", "").equals("1")) {
								Result.setText(Result.getText().toString().concat("\n• Performed MultiUser Clean"));
							}
							else {
								Result.setText(Result.getText().toString().concat("\n• Skipping MultiUser Clean"));
							}
							next = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											SketchwareUtil.showMessage(getApplicationContext(), "✅ Sucessfully Performed OneTap Action");
											Result.setText(Result.getText().toString().concat("\n• OneTap Cleaner Performed Sucessfully"));
										}
									});
								}
							};
							_timer.schedule(next, (int)(300));
							                } else {
							                    
							_Error();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
						            }
					        }
				    }, 100); 
		} catch (Exception e) {
			    e.printStackTrace();
		}
		
	}
	
	
	public void _additionals() {
		try {
			    final String command = k; 
			    final AlertDialog alertDialog = new AlertDialog.Builder(OnetapActivity.this)
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
							                  
							if (onetap.getString("k", "").equals("1")) {
								Result.setText(Result.getText().toString().concat("\n• Performed Tmp, .nomedia, LOST.DIR cleaner"));
							}
							else {
								Result.setText(Result.getText().toString().concat("\n• Skipping Tmp, .nomedia, LOST.DIR cleaner"));
							}
							next = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											_oat();
										}
									});
								}
							};
							_timer.schedule(next, (int)(300));
							                } else {
							                    
							_Error();
							                }
						            } catch (Exception e) {
						                e.printStackTrace();
						                alertDialog.dismiss(); 
						                Toast.makeText(OnetapActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
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
	
	
	public void _Theme() {
		header.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFE8F5E9));
		OneTapClean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFB9F6CA));
		header.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFC6FF00));
	}
	
	
	public void _Info_or_Help(final String _Title, final String _Msg) {
		info.setTitle(_Title);
		info.setMessage(_Msg);
		info.setIcon(R.drawable.info_1);
		info.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		info.create().show();
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