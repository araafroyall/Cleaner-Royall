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
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class PremiumForumActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private String payMethod = "";
	private String Random = "";
	private String RandomOutput = "";
	private String Finall = "";
	private String encrypted = "";
	private String Upload = "";
	private String cancl = "";
	private double check = 0;
	
	private LinearLayout header;
	private TextView textview2;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private EditText tnxid;
	private TextView textview3;
	private EditText gmail;
	private EditText comment;
	private Button submit;
	private LinearLayout tg;
	private TextView submissions;
	private ImageView imageview2;
	private TextView headL;
	private RadioButton paypal;
	private RadioButton crypto;
	private RadioButton upi;
	private RadioButton gpay;
	private ImageView imageview3;
	private TextView textview4;
	
	private SharedPreferences set;
	private TimerTask t;
	private AlertDialog.Builder Submitor;
	private AlertDialog.Builder submiting;
	private TimerTask canclr;
	private RequestNetwork bot;
	private RequestNetwork.RequestListener _bot_request_listener;
	private AlertDialog.Builder error;
	private Intent i = new Intent();
	private AlertDialog.Builder submitted;
	private SharedPreferences forum;
	private AlertDialog.Builder sbmisns;
	private AlertDialog.Builder telegramgrp;
	private AlertDialog.Builder info;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.premium_forum);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		header = findViewById(R.id.header);
		textview2 = findViewById(R.id.textview2);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		tnxid = findViewById(R.id.tnxid);
		textview3 = findViewById(R.id.textview3);
		gmail = findViewById(R.id.gmail);
		comment = findViewById(R.id.comment);
		submit = findViewById(R.id.submit);
		tg = findViewById(R.id.tg);
		submissions = findViewById(R.id.submissions);
		imageview2 = findViewById(R.id.imageview2);
		headL = findViewById(R.id.headL);
		paypal = findViewById(R.id.paypal);
		crypto = findViewById(R.id.crypto);
		upi = findViewById(R.id.upi);
		gpay = findViewById(R.id.gpay);
		imageview3 = findViewById(R.id.imageview3);
		textview4 = findViewById(R.id.textview4);
		set = getSharedPreferences("set", Activity.MODE_PRIVATE);
		Submitor = new AlertDialog.Builder(this);
		submiting = new AlertDialog.Builder(this);
		bot = new RequestNetwork(this);
		error = new AlertDialog.Builder(this);
		submitted = new AlertDialog.Builder(this);
		forum = getSharedPreferences("forum", Activity.MODE_PRIVATE);
		sbmisns = new AlertDialog.Builder(this);
		telegramgrp = new AlertDialog.Builder(this);
		info = new AlertDialog.Builder(this);
		
		tnxid.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (gpay.isChecked()) {
					_EncryptedStringKey(_charSeq, "gpay");
				}
				else {
					encrypted = _charSeq;
				}
				if (_charSeq.length() > 200) {
					tnxid.setError("max 200 words are allowed");
					check = 1;
				}
				else {
					check = 0;
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		gmail.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.length() > 100) {
					gmail.setError("max 100 words are allowed");
					check = 1;
				}
				else {
					check = 0;
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		comment.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.length() > 300) {
					comment.setError("max 300 words are allowed");
					check = 1;
				}
				else {
					check = 0;
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		submit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (encrypted.length() > 2) {
					Finall = "𝗜𝗗 : ".concat(RandomOutput).concat(" •••• 𝗣𝗿𝗲𝗺𝗶𝘂𝗺 𝗙𝗼𝗿𝘂𝗺 ••• 𝗦𝘁𝗿𝗶𝗻𝗴 : ".concat(set.getString("strng", "").concat("••• 𝗣𝗮𝘆𝗺𝗲𝗻𝘁 𝗠𝗲𝘁𝗵𝗼𝗱 : ".concat(payMethod).concat("••• 𝗧𝗻𝘅 𝗜𝗱 : ".concat(encrypted.concat(" •••• 𝗖𝗼𝗻𝘁𝗮𝗰𝘁 𝐃𝐞𝐭𝐚𝐢𝐥 : ".concat(gmail.getText().toString().concat(" •••• 𝗖𝗼𝗺𝗺𝗲𝗻𝘁 : ".concat(comment.getText().toString())))))))));
					t = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									Upload = Finall.replace("+", "¥");
								}
							});
						}
					};
					_timer.schedule(t, (int)(150));
					if (check == 0) {
						t = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										Submitor.setTitle("𝗦𝘂𝗯𝗺𝗶𝘁 𝗣𝗿𝗲𝗺𝗶𝘂𝗺 Forum");
										Submitor.setIcon(R.drawable.file);
										Submitor.setPositiveButton("📤 Submit", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
												bot.startRequestNetwork(RequestNetworkController.POST, "https://api.telegram.org/botAPI/sendMessage?chat_id=ChatID&text=".concat(Upload), "Telegram", _bot_request_listener);
												submiting.setTitle("𝑺𝒖𝒃𝒎𝒊𝒕𝒕𝒊𝒏𝒈 𝒀𝒐𝒖𝒓 𝑭𝒐𝒓𝒖𝒎  (5𝒔𝒆𝒄...)");
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
										Submitor.setNegativeButton("No", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
												
											}
										});
										Submitor.create().show();
									}
								});
							}
						};
						_timer.schedule(t, (int)(200));
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "🧑‍💻 Something is wrong in Inputs");
					}
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "🧑‍💻 Enter Something to submit");
				}
			}
		});
		
		tg.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				telegramgrp.setTitle("𝗧𝗲𝗹𝗲𝗴𝗿𝗮𝗺 𝗚𝗿𝗼𝘂𝗽");
				telegramgrp.setMessage("You can check your Submission progress on Telegram group by forum id");
				telegramgrp.setIcon(R.drawable.telegrm);
				telegramgrp.setPositiveButton("Open Group", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						i.setAction(Intent.ACTION_VIEW);
						i.setData(Uri.parse("https://t.me/cleanerprodiscussion"));
						startActivity(i);
					}
				});
				telegramgrp.create().show();
			}
		});
		
		submissions.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sbmisns.setTitle("𝗬𝗼𝘂𝗿 𝗦𝘂𝗯𝗺𝗶𝘀𝘀𝗶𝗼𝗻𝘀");
				sbmisns.setMessage("You can check its progress in Telegram Group \n".concat(forum.getString("forum", "")));
				sbmisns.setIcon(R.drawable.listj);
				sbmisns.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				sbmisns.create().show();
			}
		});
		
		paypal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		paypal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					payMethod = "💸paypal";
					crypto.setChecked(false);
					upi.setChecked(false);
					gpay.setChecked(false);
					tnxid.setHint("Paste paypal gmail here ...");
				}
				else {
					
				}
			}
		});
		
		crypto.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		crypto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					payMethod = "💸Crypto or Binance or BTC";
					upi.setChecked(false);
					gpay.setChecked(false);
					paypal.setChecked(false);
					tnxid.setHint("Paste Transaction Hash or Binance Pay id ");
				}
				else {
					
				}
			}
		});
		
		upi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					payMethod = "🪙UPI";
					crypto.setChecked(false);
					gpay.setChecked(false);
					paypal.setChecked(false);
					tnxid.setHint("Paste UPI Transaction id here  ______");
				}
				else {
					
				}
			}
		});
		
		gpay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					payMethod = "🪙GPay";
					crypto.setChecked(false);
					upi.setChecked(false);
					paypal.setChecked(false);
					tnxid.setHint("Paste Google Play Redeem Code Here __");
				}
				else {
					
				}
			}
		});
		
		_bot_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				cancl = "1";
				if (_response.contains("{\"ok\":true,\"result\":")) {
					submitted.setTitle("𝗙𝗼𝗿𝘂𝗺 𝗦𝘂𝗯𝗺𝗶𝘁𝘁𝗲𝗱");
					submitted.setCancelable(false);
					submitted.setIcon(R.drawable.check);
					submitted.setMessage("Please wait and allow upto 8 hour to send your Activation KEY to your gmail or Telegram.\n\nForum id : ".concat(RandomOutput));
					submitted.setPositiveButton("OK", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					submitted.create().show();
					forum.edit().putString("forum", "\n••••••••••••••••••••\nPremium Forum\nid : ".concat(RandomOutput).concat(forum.getString("forum", ""))).commit();
					submissions.setVisibility(View.VISIBLE);
					Random = "1234567890";
					RandomOutput = "";
					for (int i = 0; i < 5; i++) {
						RandomOutput = RandomOutput + Random.charAt(new java.util.Random().nextInt(Random.length()));
					}
					tnxid.setText("");
					gmail.setText("");
					comment.setText("");
				}
				else {
					error.setTitle("𝗘𝗿𝗿𝗼𝗿");
					error.setIcon(R.drawable.icon_1);
					error.setMessage("Something went wrong Please Contact Developer on Telegram");
					error.setPositiveButton("OK", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					error.setNegativeButton("📃 Log", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							error.setTitle(" 𝐄𝐫𝐫𝐨𝐫 𝐋𝐨𝐠");
							error.setIcon(R.drawable.info_2);
							error.setMessage(_response);
							error.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							error.setNegativeButton("📃 Log", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
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
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				cancl = "1";
				error.setTitle("𝗘𝗿𝗿𝗼𝗿");
				error.setIcon(R.drawable.icon_1);
				error.setMessage("Make sure you have \n• Proper Internet Connection\n• Updated App\n\nOr Contact Developer on Telegram");
				error.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				error.setNegativeButton("📃 Log", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						error.setTitle(" 𝐄𝐫𝐫𝐨𝐫 𝐋𝐨𝐠");
						error.setIcon(R.drawable.info_2);
						error.setMessage(_message);
						error.setPositiveButton("OK", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
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
		setTitle("📝 𝗣𝗿𝗲𝗺𝗶𝘂𝗺 𝗙𝗼𝗿𝘂𝗺");
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		if (set.getString("strng", "").length() > 5) {
			Random = "1234567890";
			RandomOutput = "";
			for (int i = 0; i < 5; i++) {
				RandomOutput = RandomOutput + Random.charAt(new java.util.Random().nextInt(Random.length()));
			}
		}
		else {
			info.setTitle("𝗜𝗻𝗳𝗼𝗿𝗺𝗮𝘁𝗶𝗼𝗻");
			info.setMessage("String Not Loaded \n\nPlease Go to Previous Activity with root Permission\nWhen string will generate , come here and fill forum again ");
			info.setIcon(R.drawable.info_1);
			info.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					i.setClass(getApplicationContext(), PremiumActivity.class);
					startActivity(i);
				}
			});
			final AlertDialog infoinfo = info.create();
			infoinfo.show();
			infoinfo.setCancelable(false);
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		_Theme();
	}
	public void _Theme() {
		tnxid.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)18, (int)5, 0xFFD7CCC8, Color.TRANSPARENT));
		submit.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFB9F6CA));
		gmail.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)18, (int)5, 0xFFD7CCC8, Color.TRANSPARENT));
		comment.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)18, (int)5, 0xFFD7CCC8, Color.TRANSPARENT));
		tg.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFDE7));
		submissions.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFDE7));
		header.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)30, 0xFFC6FF00));
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
	
	
	public void _EncryptedStringKey(final String _string, final String _key) {
		try {
			
			javax.crypto.SecretKey key = generateKey(_key);
			
			javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("AES");
			
			c.init(javax.crypto.Cipher.ENCRYPT_MODE,key);
			
			byte[] encVal = c.doFinal(_string.getBytes());
			
			encrypted = android.util.Base64.encodeToString(encVal,android.util.Base64.DEFAULT);
			
		} catch (Exception ex) {
			
		}
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