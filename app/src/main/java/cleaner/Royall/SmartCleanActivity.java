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
import android.widget.TextView;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class SmartCleanActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private String dir = "";
	private String name = "";
	private String FinalCmd = "";
	private String user = "";
	private String PremiumCheck = "";
	private String variable = "";
	private String counter = "";
	private HashMap<String, Object> setting = new HashMap<>();
	private double custompath = 0;
	private String variable2 = "";
	private String Temproray = "";
	
	private LinearLayout header;
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private CheckBox sensitive;
	private LinearLayout layooo;
	private LinearLayout linear9;
	private TextView textview4;
	private LinearLayout linear6;
	private LinearLayout linear8;
	private TextView result;
	private ImageView imageview2;
	private TextView headL;
	private TextView textview1;
	private LinearLayout linear2;
	private RadioButton internal;
	private RadioButton userr;
	private TextView customPath;
	private TextView textview2;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear4;
	private RadioButton folder;
	private RadioButton file;
	private ImageView imageview1;
	private TextView textview3;
	private HorizontalScrollView hscroll3;
	private EditText smart;
	private TextView view;
	private TextView clean;
	private TextView textview17;
	private TextView textview18;
	private HorizontalScrollView hscroll4;
	private LinearLayout linear7;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview15;
	private TextView textview14;
	private TextView textview13;
	private TextView textview16;
	
	private AlertDialog.Builder d1;
	private SharedPreferences set;
	private TimerTask t;
	private AlertDialog.Builder d2;
	private Intent i = new Intent();
	private AlertDialog.Builder prm;
	private SharedPreferences premium;
	private AlertDialog.Builder d21;
	private AlertDialog.Builder Errar;
	private AlertDialog.Builder info;
	private AlertDialog.Builder lastscreenshot;
	private AlertDialog.Builder custom;
	private AlertDialog.Builder CustomPath;
	private AlertDialog.Builder dd;
	private SharedPreferences smmt;
	private AlertDialog.Builder list;
	private AlertDialog.Builder dtwo;
	private AlertDialog.Builder d3;
	private AlertDialog.Builder mn;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.smart_clean);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		header = findViewById(R.id.header);
		linear1 = findViewById(R.id.linear1);
		linear3 = findViewById(R.id.linear3);
		linear5 = findViewById(R.id.linear5);
		sensitive = findViewById(R.id.sensitive);
		layooo = findViewById(R.id.layooo);
		linear9 = findViewById(R.id.linear9);
		textview4 = findViewById(R.id.textview4);
		linear6 = findViewById(R.id.linear6);
		linear8 = findViewById(R.id.linear8);
		result = findViewById(R.id.result);
		imageview2 = findViewById(R.id.imageview2);
		headL = findViewById(R.id.headL);
		textview1 = findViewById(R.id.textview1);
		linear2 = findViewById(R.id.linear2);
		internal = findViewById(R.id.internal);
		userr = findViewById(R.id.userr);
		customPath = findViewById(R.id.customPath);
		textview2 = findViewById(R.id.textview2);
		hscroll2 = findViewById(R.id.hscroll2);
		linear4 = findViewById(R.id.linear4);
		folder = findViewById(R.id.folder);
		file = findViewById(R.id.file);
		imageview1 = findViewById(R.id.imageview1);
		textview3 = findViewById(R.id.textview3);
		hscroll3 = findViewById(R.id.hscroll3);
		smart = findViewById(R.id.smart);
		view = findViewById(R.id.view);
		clean = findViewById(R.id.clean);
		textview17 = findViewById(R.id.textview17);
		textview18 = findViewById(R.id.textview18);
		hscroll4 = findViewById(R.id.hscroll4);
		linear7 = findViewById(R.id.linear7);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		textview15 = findViewById(R.id.textview15);
		textview14 = findViewById(R.id.textview14);
		textview13 = findViewById(R.id.textview13);
		textview16 = findViewById(R.id.textview16);
		d1 = new AlertDialog.Builder(this);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		d2 = new AlertDialog.Builder(this);
		prm = new AlertDialog.Builder(this);
		premium = getSharedPreferences("premium", Activity.MODE_PRIVATE);
		d21 = new AlertDialog.Builder(this);
		Errar = new AlertDialog.Builder(this);
		info = new AlertDialog.Builder(this);
		lastscreenshot = new AlertDialog.Builder(this);
		custom = new AlertDialog.Builder(this);
		CustomPath = new AlertDialog.Builder(this);
		dd = new AlertDialog.Builder(this);
		smmt = getSharedPreferences("smmt", Activity.MODE_PRIVATE);
		list = new AlertDialog.Builder(this);
		dtwo = new AlertDialog.Builder(this);
		d3 = new AlertDialog.Builder(this);
		mn = new AlertDialog.Builder(this);
		
		header.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "This Feature Help you Find Files , Folders by name or extension or partial names from a partition\nYou can Also Clean or delete that\n\n𝐔𝐬𝐞 𝐨𝐧𝐥𝐲 𝐢𝐟 𝐲𝐨𝐮 𝐤𝐧𝐨𝐰 𝐰𝐡𝐚𝐭 𝐚𝐜𝐭𝐮𝐚𝐥𝐥𝐲 𝐭𝐡𝐢𝐬 𝐟𝐞𝐚𝐭𝐮𝐫𝐞 𝐢𝐬.");
			}
		});
		
		sensitive.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					name = "-iname ";
				}
				else {
					name = "-name ";
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
					userr.setChecked(false);
					user = "/storage/emulated/0/";
					customPath.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFCDD2));
					customPath.setTextColor(0xFFD50000);
					custompath = 0;
				}
			}
		});
		
		userr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		userr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					internal.setChecked(false);
					user = "/data/media/";
					customPath.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFCDD2));
					customPath.setTextColor(0xFFD50000);
					custompath = 0;
				}
			}
		});
		
		customPath.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (custompath == 1) {
					CustomPath.setTitle("𝗖𝘂𝘀𝘁𝗼𝗺 𝗣𝗮𝘁𝗵");
					CustomPath.setIcon(R.drawable.folde);
					CustomPath.setMessage("Your Entered Path : \n".concat(user));
					CustomPath.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					CustomPath.setNegativeButton("Edit", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							user = "";
							custompath = 0;
							customPath.performClick();
							customPath.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFCDD2));
							customPath.setTextColor(0xFFD50000);
							userr.setChecked(false);
							internal.setChecked(false);
						}
					});
					CustomPath.create().show();
				}
				else {
					custom.setTitle("𝗘𝗻𝘁𝗲𝗿 𝗣𝗮𝘁𝗵");
					custom.setIcon(R.drawable.folde);
					custom.setMessage("Currently It Supports Only Internal Storage + Multi-User");
					final EditText custPath = new EditText(SmartCleanActivity.this);
					custPath.setHint("Enter Custom Path Here ...");
					LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
					custPath.setLayoutParams(lpar);
					custom.setView(custPath);
					custom.setPositiveButton("Use", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							user = custPath.getText().toString();
							
							String[] chkr = "/data/media/\n/sdcard/\n/storage/emulated/".split("\n");
							
							if (Arrays.stream(chkr).anyMatch(user::contains)) {
								    SketchwareUtil.showMessage(getApplicationContext(), "Custom Path Applied");
								customPath.setTextColor(0xFF43A047);
								customPath.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)5, 0xFF3E2723, 0xFFB9F6CA));
								userr.setChecked(false);
								internal.setChecked(false);
								custompath = 1;
							} else {
								    user = "";
								SketchwareUtil.showMessage(getApplicationContext(), "Incorrect or Unsupported Path");
								customPath.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFCDD2));
								customPath.setTextColor(0xFFD50000);
							}
							
						}
					});
					custom.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					final AlertDialog customcustom = custom.create();
					customcustom.show();
					((ViewGroup.MarginLayoutParams) custPath.getLayoutParams()).setMargins(50, 0, 30, 0);
					
				}
			}
		});
		
		folder.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		folder.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					smart.setHint("Enter the Folder Name");
					dir = " d ";
					file.setChecked(false);
				}
			}
		});
		
		file.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		file.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					smart.setHint("Enter the File or Extension Name ");
					dir = " f ";
					folder.setChecked(false);
				}
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "You may Enter Full or Partial name \n\n𝑬𝒙𝒂𝒎𝒑𝒍𝒆 \n\n𝐅𝐮𝐥𝐥 𝐍𝐚𝐦𝐞 : CleanerLitePro.apk\n𝐏𝐚𝐫𝐭𝐢𝐚𝐥 𝐧𝐚𝐦𝐞𝐬\nCleaner*.apk\nCleanerlit*.apk\nCleanerLite*\n*LitePro.apk\n\nFor Extenstion use \n*.xyz\n\n𝐘𝐨𝐮 𝐜𝐚𝐧 𝐮𝐬𝐞 * 𝐅𝐨𝐫 𝐒𝐮𝐜𝐡 𝐌𝐞𝐜𝐡𝐚𝐧𝐢𝐬𝐦");
			}
		});
		
		smart.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		smart.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.contains(" ") || _charSeq.contains("\n")) {
					smart.setError("Space & Next line not supported");
				}
				if (_charSeq.contains(".sh")) {
					smart.setError("Shell Script Files not Supported");
					view.setVisibility(View.INVISIBLE);
					clean.setVisibility(View.INVISIBLE);
				}
				else {
					view.setVisibility(View.VISIBLE);
					clean.setVisibility(View.VISIBLE);
				}
				variable2 = _charSeq;
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		view.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((dir.length() > 0) && ((user.length() > 2) && (smart.getText().toString().length() > 2))) {
					t = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									try {
										   
										    final String command = "find ".concat(user.concat(" -type")).concat(dir.concat(name.concat(smart.getText().toString())));
										
										    final AlertDialog alertDialog = new AlertDialog.Builder(SmartCleanActivity.this)
										            .setTitle("⚡ 𝗚𝗲𝘁𝘁𝗶𝗻𝗴 𝗢𝘂𝘁𝗽𝘂𝘁")
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
																variable = result.getText().toString().replace("/data/media/", "💾 𝐮𝐬𝐞𝐫 : ");
																variable = variable.replace("/storage/emulated/0", "💾");
																String inputcount = variable;
																String outputcount = "💾";
																
																int count = 0;
																int lastIndex = 0;
																
																while (lastIndex != -1) {
																	    lastIndex = inputcount.indexOf(outputcount, lastIndex);
																	
																	    if (lastIndex != -1) {
																		        count++;
																		        lastIndex = lastIndex + 1;
																		    }
																}
																
																counter = String.valueOf(count);
																if (variable.contains("💾")) {
																	d1.setTitle("𝗢𝘂𝘁𝗽𝘂𝘁 or Viewer");
																	d1.setIcon(R.drawable.listj);
																	d1.setMessage("𝑻𝒐𝒕𝒂𝒍 𝑭𝒊𝒍𝒆𝒔 : ".concat(counter.concat("\n\n")).concat(variable));
																	d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
																		@Override
																		public void onClick(DialogInterface _dialog, int _which) {
																			
																		}
																	});
																	d1.create().show();
																}
																else {
																	if (folder.isChecked()) {
																		SketchwareUtil.showMessage(getApplicationContext(), "🪧 No Such Folder or Directory Found");
																	}
																	if (file.isChecked()) {
																		SketchwareUtil.showMessage(getApplicationContext(), "🪧 No Such File or Extension Found");
																	}
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
															                        Toast.makeText(SmartCleanActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
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
						}
					};
					_timer.schedule(t, (int)(200));
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "⚠️ Some Entry Missing");
				}
			}
		});
		
		clean.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Info_or_Help("Update Required", "Download Latest version to use Features");
			}
		});
		
		textview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (smmt.getString("smrt", "").length() > 2) {
					list.setTitle("𝗦𝗮𝘃𝗲𝗱 𝗜𝘁𝗲𝗺𝘀");
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
							dtwo.setTitle("𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
							dtwo.setIcon(R.drawable.info_2);
							dtwo.setMessage("This Will Remove All items Saved by You");
							dtwo.setPositiveButton("⛔ Delete", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									smmt.edit().remove("smrt").commit();
									variable = "";
									variable2 = "";
									try {
										   
										    final String command = "rm -rf /data/data/cleaner.lite.pro/shared_prefs/smmt.xml > /dev/null 2>&1";
										
										
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
																SketchwareUtil.showMessage(getApplicationContext(), "✅ Sucessfully Deleted");
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
													                
													                final String errorMessage = "Error: " + e.getMessage();
													                runOnUiThread(new Runnable() {
														                    @Override
														                    public void run() {
															                        result.setText(errorMessage);
															                        Toast.makeText(SmartCleanActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
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
							dtwo.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							dtwo.create().show();
						}
					});
					final AlertDialog listlist = list.create();
					listlist.show();
					try {
						    String allTexts = smmt.getString("smrt", "").replaceFirst("\n", "").toString();
						
						    
						    String[] lines = allTexts.split("\n");
						
						    ArrayList<String> listItems = new ArrayList<String>();
						    for (String line : lines) {
							        listItems.add(line);
							    }
						
						    ArrayAdapter<String> adapter = new ArrayAdapter<String>(SmartCleanActivity.this, android.R.layout.simple_list_item_1, listItems);
						
						    ((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).setAdapter(adapter);
						    ((BaseAdapter)((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).getAdapter()).notifyDataSetChanged();
					} catch (Exception e) {
						    e.printStackTrace();
					}
					((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
						    @Override
						    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
							       
							        String variable = (String) parent.getItemAtPosition(position);
							       
							mn.setTitle("𝗦𝗮𝘃𝗲𝗱 𝗜𝘁𝗲𝗺 𝗠𝗮𝗻𝗮𝗴𝗲𝗿");
							mn.setIcon(R.drawable.listj);
							mn.setMessage("Select An Option For your item :\n".concat(variable));
							mn.setPositiveButton("⚡ 𝐂𝐥𝐞𝐚𝐧", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									_Info_or_Help("Update Required", "Download Latest version to use Features");
								}
							});
							mn.setNegativeButton("🗑️ Remove", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									smmt.edit().remove(variable).commit();
									smmt.edit().putString("smrt", smmt.getString("smrt", "").replaceFirst("\n".concat(variable), "")).commit();
									SketchwareUtil.showMessage(getApplicationContext(), "✅ Sucessfully Removed");
									if (smmt.getString("smrt", "").length() > 2) {
										try {
											    String allTexts = smmt.getString("smrt", "").replaceFirst("\n", "").toString();
											
											    
											    String[] lines = allTexts.split("\n");
											
											    ArrayList<String> listItems = new ArrayList<String>();
											    for (String line : lines) {
												        listItems.add(line);
												    }
											
											    ArrayAdapter<String> adapter = new ArrayAdapter<String>(SmartCleanActivity.this, android.R.layout.simple_list_item_1, listItems);
											
											    ((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).setAdapter(adapter);
											    ((BaseAdapter)((ListView) listlist.getWindow().getDecorView().findViewById(R.id.listview1)).getAdapter()).notifyDataSetChanged();
										} catch (Exception e) {
											    e.printStackTrace();
										}
									}
									else {
										listlist.dismiss();
										SketchwareUtil.showMessage(getApplicationContext(), "🪧 The Saved list become Empty");
									}
								}
							});
							mn.create().show();
							    }
					});
					((HorizontalScrollView) listlist.getWindow().getDecorView().findViewById(R.id.laytt)).setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "🪧 The List is Empty \n      Save Something first ");
				}
			}
		});
		
		textview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					variable2 = smmt.getString("smrt", "");
					if ((dir.length() > 0) && ((user.length() > 2) && (smart.getText().toString().length() > 2))) {
						t = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										dd.setTitle("𝗦𝗺𝗮𝗿𝘁 𝗣𝗿𝗲𝗳𝗲𝗿𝗲𝗻𝗰𝗲𝘀 𝗦𝗮𝘃𝗲𝗿");
										dd.setIcon(R.drawable.storage_3);
										dd.setMessage("Save Your Preferences itmes to use later");
										final EditText edtt = new EditText(SmartCleanActivity.this);
										edtt.setHint("Provide a Name to Save ...");
										LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
										edtt.setLayoutParams(lpar);
										dd.setView(edtt);
										dd.setPositiveButton("𝐒𝐚𝐯𝐞", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
												variable = edtt.getText().toString();
												t = new TimerTask() {
													@Override
													public void run() {
														runOnUiThread(new Runnable() {
															@Override
															public void run() {
																if ((variable.length() > 2) && (20 > variable.length())) {
																	if (!("\n" + variable2 + "\n").contains("\n" + variable + "\n")) {
																		    smmt.edit().putString("smrt", smmt.getString("smrt", "").concat("\n".concat(variable))).commit();
																		smmt.edit().putString(variable, "find ".concat(user.concat(" -type")).concat(dir.concat(name.concat(smart.getText().toString().concat(" -delete"))))).commit();
																		SketchwareUtil.showMessage(getApplicationContext(), "✅ Sucessfully Saved ");
																	} else {
																		    _ERROR("Duplicate name Detected,\nTry saving with different Name.");
																	}
																}
																else {
																	_ERROR("Make sure Your Entered Name Must have 3 to 20 Digits only");
																}
															}
														});
													}
												};
												_timer.schedule(t, (int)(200));
											}
										});
										dd.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
												
											}
										});
										final AlertDialog dddd = dd.create();
										dddd.show();
										((TextView) dddd.findViewById(dddd.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
										final ImageView R_icon = new ImageView(getApplicationContext()); 
										R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
										R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
										R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
										((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
										R_icon.requestLayout();
										R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
										R_icon.setImageResource(R.drawable.infoo);
										((LinearLayout) dddd.findViewById(dddd.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
										((ViewGroup.MarginLayoutParams) edtt.getLayoutParams()).setMargins(60, 0, 060, 0);
										
									}
								});
							}
						};
						_timer.schedule(t, (int)(200));
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "⚠️ Some Entry Missing");
					}
				} catch (Exception e) {
					 
				}
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("Apk", "*.apk");
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("mkv", "*.mkv");
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("png", "*.png");
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("jpg", "*.jpg");
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("pdf", "*.pdf");
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("webm", "*.webm");
			}
		});
		
		textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("7z", "*.7z");
			}
		});
		
		textview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("zip", "*.zip");
			}
		});
		
		textview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("gif", "*.gif");
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("mp3", "*.mp3");
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_TemplateClean("mp4", "*.mp4");
			}
		});
		
		textview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				lastscreenshot.setTitle("𝗟𝗮𝘀𝘁 𝘀𝗰𝗿𝗲𝗲𝗻𝘀𝗵𝗼𝘁");
				lastscreenshot.setMessage("This will delete last captured screenshot");
				lastscreenshot.setIcon(R.drawable.info_2);
				lastscreenshot.setPositiveButton("clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Info_or_Help("Update Required", "Download Latest version to use Features");
					}
				});
				final AlertDialog lastscreenshotlastscreenshot = lastscreenshot.create();
				lastscreenshotlastscreenshot.show();
				((TextView) lastscreenshotlastscreenshot.findViewById(lastscreenshotlastscreenshot.getContext().getResources().getIdentifier("alertTitle", "id", "android"))).setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));
				final ImageView R_icon = new ImageView(getApplicationContext()); 
				R_icon.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
				R_icon.getLayoutParams().width = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				R_icon.getLayoutParams().height = (int) (((float)32) * getResources().getDisplayMetrics().density + 0.5f);
				((LinearLayout.LayoutParams) R_icon.getLayoutParams()).setMargins(24, 0, 4, 0);
				R_icon.requestLayout();
				R_icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
				R_icon.setImageResource(R.drawable.infoo);
				((LinearLayout) lastscreenshotlastscreenshot.findViewById(lastscreenshotlastscreenshot.getContext().getResources().getIdentifier("title_template", "id", "android"))).addView(R_icon);
				R_icon.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_Info_or_Help("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻", "Used PATH = /sdcard/Pictures/Screenshot.\n\nSupported Format = jpg & png");
					}
				});
			}
		});
	}
	
	private void initializeLogic() {
		_color1();
		setTitle("🛰️ 𝗦𝗺𝗮𝗿𝘁 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
		name = "-name ";
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		try {
			    String command = "find"; 
			    Runtime.getRuntime().exec(command);
			_Animation();
		} catch (Exception e) {
			d1.setTitle("𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
			d1.setIcon(R.drawable.info_2);
			d1.setMessage("Busybox is not Properly Installed");
			d1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			d1.create().show();
		}
		
		customPath.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFCDD2));
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
	}
	public void _Error() {
		try {
			    String cmdxx = "rm"; 
			    Runtime.getRuntime().exec(cmdxx);
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
		} catch (Exception e) {
			_ERROR("Busybox is not Properly Installed");
		}
		
		result.setText("");
	}
	
	
	public void _color1() {
		_Themer(view);
		_Themer(clean);
		_Themer(textview17);
		_Themer(textview18);
		header.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFC6FF00));
		textview5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview12.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview15.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
		textview16.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFBBDEFB));
	}
	
	
	public void _require_premium() {
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
	
	
	public void _TemplateClean(final String _formate, final String _cmd) {
		_Info_or_Help("Update Required", "Download Latest version to use Features");
	}
	
	
	public void _Animation() {
		if (set.getString("Animation", "").equals("1")) {
			final String textToType = "𝗩𝗶𝗲𝘄 & 𝗖𝗹𝗲𝗮𝗻 𝗖𝘂𝘀𝘁𝗼𝗺𝗶𝘇𝗮𝗯𝗹𝗲 𝗙𝗶𝗹𝗲𝘀 , 𝗙𝗼𝗹𝗱𝗲𝗿𝘀 𝗼𝗿 𝗗𝗶𝗿𝗲𝗰𝘁𝗼𝗿𝗶𝗲𝘀";
			final int[] charIndex = {0};
			
			final Handler handler = new Handler();
			handler.postDelayed(new Runnable() {
				    @Override
				    public void run() {
					        headL.setText(textToType.substring(0, charIndex[0]++));
					        if (charIndex[0] <= textToType.length()) {
						            handler.postDelayed(this, 1);
						        }
					    }
			}, 100);
		}
		else {
			headL.setText("𝗩𝗶𝗲𝘄 & 𝗖𝗹𝗲𝗮𝗻 𝗖𝘂𝘀𝘁𝗼𝗺𝗶𝘇𝗮𝗯𝗹𝗲 𝗙𝗶𝗹𝗲𝘀 , 𝗙𝗼𝗹𝗱𝗲𝗿𝘀 𝗼𝗿 𝗗𝗶𝗿𝗲𝗰𝘁𝗼𝗿𝗶𝗲𝘀");
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
	
	
	public void _SmartClean(final String _Cmd) {
		_Info_or_Help("Update Required", "Download Latest version to use Features");
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