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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class CustomCleanerActivity extends Activity {
	
	private String checkPrmemiumm = "";
	private String sspnd = "";
	private String PremiumCheck = "";
	private String variable = "";
	private String cmd = "";
	private String counter = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear13;
	private TextView nouse;
	private LinearLayout linear8;
	private TextView textview5;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear12;
	private LinearLayout layooo;
	private TextView result;
	private TextView cleardata;
	private TextView cleanstatus;
	private TextView sharedcleaner;
	private TextView WhatsAppcleannnn;
	private TextView splitclean;
	private TextView textview7;
	private TextView custompatch;
	private TextView modifiedapp;
	private TextView fix_tmp;
	private TextView mount;
	private TextView browser;
	private TextView lostdircleaner;
	private TextView selinux;
	private TextView nomedia;
	
	private AlertDialog.Builder two;
	private AlertDialog.Builder wac;
	private AlertDialog.Builder n;
	private AlertDialog.Builder soon;
	private SharedPreferences set;
	private AlertDialog.Builder enablefirst;
	private SharedPreferences premium;
	private AlertDialog.Builder prm;
	private Intent i = new Intent();
	private AlertDialog.Builder d2;
	private AlertDialog.Builder info;
	private AlertDialog.Builder d1;
	private AlertDialog.Builder error;
	private AlertDialog.Builder Nomedia;
	
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
		textview4 = findViewById(R.id.textview4);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear13 = findViewById(R.id.linear13);
		nouse = findViewById(R.id.nouse);
		linear8 = findViewById(R.id.linear8);
		textview5 = findViewById(R.id.textview5);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		linear12 = findViewById(R.id.linear12);
		layooo = findViewById(R.id.layooo);
		result = findViewById(R.id.result);
		cleardata = findViewById(R.id.cleardata);
		cleanstatus = findViewById(R.id.cleanstatus);
		sharedcleaner = findViewById(R.id.sharedcleaner);
		WhatsAppcleannnn = findViewById(R.id.WhatsAppcleannnn);
		splitclean = findViewById(R.id.splitclean);
		textview7 = findViewById(R.id.textview7);
		custompatch = findViewById(R.id.custompatch);
		modifiedapp = findViewById(R.id.modifiedapp);
		fix_tmp = findViewById(R.id.fix_tmp);
		mount = findViewById(R.id.mount);
		browser = findViewById(R.id.browser);
		lostdircleaner = findViewById(R.id.lostdircleaner);
		selinux = findViewById(R.id.selinux);
		nomedia = findViewById(R.id.nomedia);
		two = new AlertDialog.Builder(this);
		wac = new AlertDialog.Builder(this);
		n = new AlertDialog.Builder(this);
		soon = new AlertDialog.Builder(this);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		enablefirst = new AlertDialog.Builder(this);
		premium = getSharedPreferences("premium", Activity.MODE_PRIVATE);
		prm = new AlertDialog.Builder(this);
		d2 = new AlertDialog.Builder(this);
		info = new AlertDialog.Builder(this);
		d1 = new AlertDialog.Builder(this);
		error = new AlertDialog.Builder(this);
		Nomedia = new AlertDialog.Builder(this);
		
		linear1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		cleardata.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (set.getString("enable5", "").contains("whatsapp")) {
					_whatsApp_clear_Data();
				}
				else {
					_enable_first();
				}
			}
		});
		
		cleanstatus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				two.setTitle("📸 𝗪𝗵𝗮𝘁𝘀𝗔𝗽𝗽 𝗦𝘁𝗮𝘁𝘂𝘀 𝗖𝗹𝗲𝗮𝗻𝗲𝗿");
				two.setMessage("This will Clear all Viewed WhatsApp Status\n[ 𝑰𝒕 𝒘𝒊𝒍𝒍 𝒏𝒐𝒕 𝑨𝒇𝒇𝒆𝒄𝒕 𝑵𝒆𝒘 𝒐𝒓 𝑼𝒏𝒘𝒂𝒕𝒄𝒉𝒆𝒅 𝑺𝒕𝒂𝒕𝒖𝒔 ]");
				two.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							    final String command = "# clear whatsapp status"; 
							
							    
							    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
							            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐖𝐡𝐚𝐭𝐬𝐚𝐩𝐩 𝐒𝐭𝐚𝐭𝐮𝐬")
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
											                   
											                    Toast.makeText(CustomCleanerActivity.this, "🥏 Cleared Sucessfully", Toast.LENGTH_SHORT).show();
											                } else {
											                    
											                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
										                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
				two.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				two.create().show();
			}
		});
		
		sharedcleaner.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				wac.setTitle("📳 𝗪𝗵𝗮𝘁𝘀𝗔𝗽𝗽 .𝗦𝗵𝗮𝗿𝗲𝗱 𝗰𝗹𝗲𝗮𝗻𝗲𝗿");
				wac.setMessage("It will Delete All downloaded Media available in Whatsapp chats or groups and can't be undo.\n\n[ 𝑻𝒉𝒊𝒔 𝒘𝒊𝒍𝒍 𝒏𝒐𝒕 𝒅𝒆𝒍𝒆𝒕𝒆 : 𝒎𝒆𝒔𝒔𝒂𝒈𝒆𝒔 & 𝑳𝒐𝒈𝒊𝒏 𝒅𝒂𝒕𝒂 ]");
				wac.setPositiveButton("⏩ Next", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						two.setTitle("⚠️ 𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
						two.setMessage("Are You shure to clear .shared folder in WhatsApp");
						two.setPositiveButton("🌀 CLEAR", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								if (premium.getString("purchased", "").equals("1")) {
									try {
										    final String command = "# clear shared folder of whatsapp"; 
										
										    
										    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
										            .setTitle("⚡𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐖𝐡𝐚𝐭𝐬𝐚𝐩𝐩 .𝐒𝐡𝐚𝐫𝐞𝐝")
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
														                   
														                    Toast.makeText(CustomCleanerActivity.this, "🥏 Cleared Sucessfully", Toast.LENGTH_SHORT).show();
														                } else {
														                    
														                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
													                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
									_require_premium();
								}
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
				wac.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				wac.create().show();
			}
		});
		
		WhatsAppcleannnn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				n.setTitle("🪀 𝙒𝙝𝙖𝙨𝙩𝘼𝙥𝙥 𝙒𝙖𝙨𝙩𝙚 Cleaner");
				n.setMessage("This Will clears Unwanted files in whatsapp.\n\n[ 𝑵𝒐 𝑫𝒂𝒕𝒂 𝑾𝒊𝒍𝒍 𝒃𝒆 𝑫𝒆𝒍𝒆𝒕𝒆𝒅 ]");
				n.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							    final String command = "# clean whatsapp unwanted files "; 
							
							    
							    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
							            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐖𝐡𝐚𝐭𝐬𝐀𝐩𝐩")
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
											                   
											                    Toast.makeText(CustomCleanerActivity.this, "🥏 Cleared Sucessfully", Toast.LENGTH_SHORT).show();
											                } else {
											                    
											                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
										                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
				n.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				n.create().show();
			}
		});
		
		splitclean.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				two.setTitle("💫 𝐒𝐩𝐥𝐢𝐭 𝐒𝐭𝐚𝐭𝐮𝐬 𝐂𝐥𝐞𝐚𝐧𝐞𝐫");
				two.setMessage("It cleans the large number of Split status created by WhatsApp Mods");
				two.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							   
							    final String command = "# clean whatsapp mods splits";
							
							    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
							            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐒𝐩𝐥𝐢𝐭 𝐒𝐭𝐚𝐭𝐮𝐬")
							            .setMessage("          Please wait...")
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
													if (result.getText().toString().contains("such")) {
														SketchwareUtil.showMessage(getApplicationContext(), "🥏 Cleared Sucessfully");
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
				two.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				two.create().show();
			}
		});
		
		custompatch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("🧩 𝐂𝐮𝐬𝐭𝐨𝐦 𝐏𝐚𝐭𝐜𝐡𝐞𝐬 Cleaner");
				d2.setMessage("It Will Clear All Custom Patches Downloaded in Lucky Patcher App");
				d2.setPositiveButton("🚀 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						if (premium.getString("purchased", "").equals("1")) {
							try {
								    final String command = "# clean lucky patcher patches"; 
								
								    
								    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
								            .setTitle("⚡𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐂𝐮𝐬𝐭𝐨𝐦 𝐏𝐚𝐭𝐜𝐡")
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
												                   
												                    Toast.makeText(CustomCleanerActivity.this, "🥏 Cleared Sucessfully", Toast.LENGTH_SHORT).show();
												                } else {
												                    
												                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
											                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
							_require_premium();
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
		
		modifiedapp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("⛓️ 𝗠𝗼𝗱𝗶𝗳𝗶𝗲𝗱 𝗔𝗽𝗽𝘀 Cleaner");
				d2.setMessage("It Will Clear All Modified,Patched apps by lucky patcher");
				d2.setPositiveButton("🚀 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						if (premium.getString("purchased", "").equals("1")) {
							try {
								    final String command = "# clean whatsapp modified apps"; 
								
								    
								    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
								            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐌𝐨𝐝𝐢𝐟𝐢𝐞𝐝 𝐀𝐩𝐩𝐬")
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
												                   
												                    Toast.makeText(CustomCleanerActivity.this, "🥏 Cleared Sucessfully", Toast.LENGTH_SHORT).show();
												                } else {
												                    
												                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
											                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
							_require_premium();
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
		
		fix_tmp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("📁 𝐅𝐢𝐱 /𝐝𝐚𝐭𝐚/𝐥𝐨𝐜𝐚𝐥/𝐭𝐦𝐩");
				d2.setMessage("This folder Used by many App/ADB For temporary work");
				d2.setPositiveButton("❄️ 𝗙𝗶𝘅", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							   
							    final String command = "\ndir_path=\"/data/local/tmp\"\n\nif [ -d \"$dir_path\" ]; then\n  echo \"The directory already exists.\"\n  rm -rf /data/local/tmp/*\nelse\n  mkdir -p \"$dir_path\"\n  echo \"Directory created successfully.\"\nfi";
							
							    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
							            .setTitle("⚡ 𝐅𝐢𝐱𝐢𝐧𝐠 /𝐝𝐚𝐭𝐚/𝐥𝐨𝐜𝐚𝐥/𝐭𝐦𝐩")
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
													if (result.getText().toString().contains("The directory already exists")) {
														d1.setTitle("🪧 𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
														d1.setMessage("The Directory is Already Fixed");
														d1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
																@Override
																public void onClick(DialogInterface _dialog, int _which) {
																		 
																}
														});
														d1.create().show();
													}
													if (result.getText().toString().contains("Directory created successfully")) {
														d1.setTitle("🪧 𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
														d1.setMessage("Fixed /data/local/tmp");
														d1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
																@Override
																public void onClick(DialogInterface _dialog, int _which) {
																		 
																}
														});
														d1.create().show();
													}
													                        }
												                    });
											                } else {
											                    runOnUiThread(new Runnable() {
												                        @Override
												                        public void run() {
													                            result.setText(errorText.toString());
													d1.setTitle("❗𝗘𝗿𝗿𝗼𝗿");
													d1.setMessage("Something went wrong or Root permission Denied");
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
				d2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d2.create().show();
			}
		});
		
		mount.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("📂 𝐌𝐨𝐮𝐧𝐭 /𝐝𝐚𝐭𝐚");
				d2.setMessage("If you think some features not working than you may use this");
				d2.setPositiveButton("🧩 𝑴𝒐𝒖𝒏𝒕", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							    final String command = "mount -o rw,remount /data"; 
							
							    
							    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
							            .setTitle("⚡ 𝗠𝗼𝘂𝗻𝘁𝗶𝗻𝗴 /𝗱𝗮𝘁𝗮")
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
											                   
											                    Toast.makeText(CustomCleanerActivity.this, "✅ Mounted /data Sucessfully", Toast.LENGTH_SHORT).show();
											                } else {
											                    
											                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
										                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
		
		browser.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("🌎 𝐁𝐫𝐨𝐰𝐬𝐞𝐫 𝐌𝐞𝐭𝐫𝐢𝐜𝐬 𝐂𝐥𝐞𝐚𝐧");
				d2.setMessage("It seems a 4MB file in almost every App found in /data/data/PKG/app_webview/BrowserMetrics-spare.pma\nIt Related to something Called Webview Cache or File \nYou can clean if you know this");
				d2.setPositiveButton("🚀 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							   
							    final String command = "# clean browser matrics data";
							
							    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
							            .setTitle("⚡ 𝐁𝐫𝐨𝐰𝐬𝐞𝐫 𝐌𝐞𝐭𝐫𝐢𝐜𝐬 𝐂𝐥𝐞𝐚𝐧")
							            .setMessage("       Please wait...")
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
				});
				d2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d2.create().show();
			}
		});
		
		lostdircleaner.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d2.setTitle("📫 𝐋𝐎𝐒𝐓.𝐃𝐈𝐑 𝐂𝐥𝐞𝐚𝐧𝐞𝐫");
				d2.setMessage("Clears All LOST.DIR Files and Folder from Device including SD Card");
				d2.setPositiveButton("🛸 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							    final String command = "# lostdir clean"; 
							    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
							            .setTitle("⚡ 𝐋𝐎𝐒𝐓.𝐃𝐈𝐑 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠")
							            .setMessage("       Please wait...")
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
											                  
											SketchwareUtil.showMessage(getApplicationContext(), "🥏 Cleared Sucessfully");
											                } else {
											                    
											_Error();
											                }
										            } catch (Exception e) {
										                e.printStackTrace();
										                alertDialog.dismiss(); 
										                Toast.makeText(CustomCleanerActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
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
		
		selinux.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					   
					    final String command = "getenforce";
					
					    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
					            .setTitle("⚡ 𝗦𝗘 𝗟𝗶𝗻𝘂𝘅")
					            .setMessage("      Please wait...")
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
											d2.setTitle("🔩 𝗦𝗘 𝗟𝗶𝗻𝘂𝘅");
											d2.setMessage("Current Mode : ".concat(result.getText().toString()));
											d2.setPositiveButton("⭕ 𝐒𝐞𝐭 𝐏𝐞𝐫𝐦𝐢𝐬𝐬𝐢𝐯𝐞", new DialogInterface.OnClickListener() {
												@Override
												public void onClick(DialogInterface _dialog, int _which) {
													try {
														    final String command = "setenforce 0"; 
														    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
														            .setTitle("⚡ 𝐒𝐰𝐢𝐭𝐜𝐡𝐢𝐧𝐠 𝐒𝐄𝐋𝐢𝐧𝐮𝐱 𝐌𝐨𝐝𝐞")
														            .setMessage("      Please wait...")
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
																		                  
																		SketchwareUtil.showMessage(getApplicationContext(), "📃 Changed to Permissive Mode");
																		                } else {
																		                    
																		_Error();
																		                }
																	            } catch (Exception e) {
																	                e.printStackTrace();
																	                alertDialog.dismiss(); 
																	                Toast.makeText(CustomCleanerActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
																	            }
																        }
															    }, 100); 
													} catch (Exception e) {
														    e.printStackTrace();
													}
													
												}
											});
											d2.setNegativeButton("⭕ 𝐒𝐞𝐭 𝐄𝐧𝐟𝐨𝐫𝐜𝐞", new DialogInterface.OnClickListener() {
												@Override
												public void onClick(DialogInterface _dialog, int _which) {
													try {
														    final String command = "setenforce 1"; 
														    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
														            .setTitle("⚡ 𝐒𝐰𝐢𝐭𝐜𝐡𝐢𝐧𝐠 𝐒𝐄𝐋𝐢𝐧𝐮𝐱 𝐌𝐨𝐝𝐞")
														            .setMessage("      Please wait...")
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
																		                  
																		SketchwareUtil.showMessage(getApplicationContext(), "📃 Changed to Enforcing Mode");
																		                } else {
																		                    
																		_Error();
																		                }
																	            } catch (Exception e) {
																	                e.printStackTrace();
																	                alertDialog.dismiss(); 
																	                Toast.makeText(CustomCleanerActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
																	            }
																        }
															    }, 100); 
													} catch (Exception e) {
														    e.printStackTrace();
													}
													
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
		
		nomedia.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Nomedia.setTitle("🎛️ .𝐍𝐨𝐦𝐞𝐝𝐢𝐚 𝐂𝐥𝐞𝐚𝐧𝐞𝐫");
				Nomedia.setMessage("Clears All .Nomedia Files From Internal Storage");
				final CheckBox nomed = new CheckBox(CustomCleanerActivity.this);
				nomed.setText("Clean Globally From '/data'");
				LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
				nomed.setLayoutParams(lpar);
				Nomedia.setView(nomed);
				Nomedia.setPositiveButton("🛸 Clean", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						if
						((nomed.isChecked())){
							
							cmd = "# clean . nomedia";
						}
						else
						{
							cmd = "# clean . nomedia globally";
							
						}
						_NoMediaClean();
					}
				});
				Nomedia.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Nomedia.create().show();
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("🧩 𝗖𝗹𝗲𝗮𝗻𝗲𝗿 𝗧𝗼𝗼𝗹𝗯𝗼𝘅");
		if (set.getString("theme", "").equals("1")) {
			_color1();
		}
		else {
			_color2();
		}
	}
	
	@Override
	public void onBackPressed() {
		finish();
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		PremiumCheck = "# check premium version";
		if (premium.getString("#", "").equals("1")) {
			sspnd = "# check root acess";
		}
		else {
			sspnd = "# check app functioning";
		}
	}
	public void _whatsappclean() {
		
	}
	
	
	public void _color1() {
		cleardata.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		cleanstatus.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		sharedcleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		WhatsAppcleannnn.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		custompatch.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		modifiedapp.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		fix_tmp.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		lostdircleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		selinux.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		splitclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		nomedia.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		browser.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
		mount.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFF4CAF50, 0xFFFFFF00));
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
	
	
	public void _whatsApp_clear_Data() {
		n.setTitle("🪀 𝗪𝗵𝗮𝘁𝘀𝗔𝗽𝗽 : 𝗖𝗹𝗲𝗮𝗿 𝗗𝗮𝘁𝗮");
		n.setMessage("This Will Clear All WhatsApp Data\n\n[ 𝑷𝒓𝒐𝒄𝒆𝒆𝒅 𝑾𝒊𝒕𝒉 𝑪𝒂𝒖𝒕𝒊𝒐𝒏 ]");
		n.setPositiveButton("⏩ Next", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				wac.setTitle("⚠️ 𝗪𝗮𝗿𝗻𝗶𝗻𝗴");
				wac.setMessage("This Will Clear All WhatsApp Data");
				wac.setPositiveButton("🌀 Clear", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							    final String command = "pm clear com.whatsapp"; 
							
							    
							    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
							            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 𝐖𝐡𝐚𝐭𝐬𝐚𝐩𝐩 𝐝𝐚𝐭𝐚")
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
											                   
											                    Toast.makeText(CustomCleanerActivity.this, "🥏 Cleared Sucessfully", Toast.LENGTH_SHORT).show();
											                } else {
											                    
											                    AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
										                AlertDialog.Builder errorDialogBuilder = new AlertDialog.Builder(CustomCleanerActivity.this)
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
				wac.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				wac.create().show();
			}
		});
		n.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		n.create().show();
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
	
	
	public void _require_premium() {
		prm.setTitle("🧩 𝗥𝗲𝗾𝘂𝗶𝗿𝗲 𝗣𝗿𝗲𝗺𝗶𝘂𝗺");
		prm.setMessage("This is a premium feature \nPurchase premium to use ");
		prm.setPositiveButton("🛸 𝐆𝐞𝐭 𝐏𝐫𝐞𝐦𝐢𝐮𝐦", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				i.setAction(Intent.ACTION_VIEW);
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
	
	
	public void _color2() {
		if (set.getString("stroke", "").equals("1")) {
			_Themer(cleardata);
			_Themer(cleanstatus);
			_Themer(sharedcleaner);
			_Themer(WhatsAppcleannnn);
			_Themer(splitclean);
			_Themer(custompatch);
			_Themer(modifiedapp);
			_Themer(fix_tmp);
			_Themer(lostdircleaner);
			_Themer(selinux);
			_Themer(nomedia);
			_Themer(browser);
			_Themer(mount);
		}
		else {
			cleardata.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			cleanstatus.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			sharedcleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			WhatsAppcleannnn.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			splitclean.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			custompatch.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			modifiedapp.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			fix_tmp.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			lostdircleaner.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			selinux.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			nomedia.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			browser.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
			mount.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF69F0AE));
		}
	}
	
	
	public void _NoMediaClean() {
		try {
			   
			    final String command = "# pick command for cleaning from cmd";
			
			    final AlertDialog alertDialog = new AlertDialog.Builder(CustomCleanerActivity.this)
			            .setTitle("⚡ 𝐂𝐥𝐞𝐚𝐧𝐢𝐧𝐠 .𝐧𝐨𝐦𝐞𝐝𝐢𝐚 𝐅𝐢𝐥𝐞𝐬")
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
									if (set.getString("nomediaoutput", "").equals("1")) {
										if (result.getText().toString().contains(".nomedia")) {
											d1.setTitle("📁 𝗖𝗹𝗲𝗮𝗿𝗲𝗱 .𝗡𝗼𝗺𝗲𝗱𝗶𝗮 𝗙𝗶𝗹𝗲𝘀");
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
											d1.setTitle("📁 𝗖𝗹𝗲𝗮𝗿𝗲𝗱 .𝗡𝗼𝗺𝗲𝗱𝗶𝗮 𝗙𝗶𝗹𝗲𝘀");
											d1.setMessage("All such files are already cleared");
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
										SketchwareUtil.showMessage(getApplicationContext(), "🥏 Cleared Sucessfully");
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
	
	
	public void _Themer(final View _view) {
		_view.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)25, (int)10, 0xFFDD2C00, 0xFF69F0AE));
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