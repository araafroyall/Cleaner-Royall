package Cleaner.Royall;

import android.app.Activity;
import android.app.AlertDialog;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class RootPro {

    public static void run(final Activity activity,
                           final String command,
                           final String title,
                           final String message,
                           final ResultWrapper resultWrap,
                           final int iconResId,
                           final int errorIconResId,
                           final Runnable successRunnable,
                           final Runnable failureRunnable) {

        AlertDialog alertDialog = (title != null && !title.isEmpty())
            ? new AlertDialog.Builder(activity)
                .setTitle(title)
                .setMessage((message != null && !message.isEmpty()) ? message : "           Please Wait...")
                .setCancelable(false)
                .setIcon(iconResId)
                .create()
            : null;
        if (alertDialog != null) {
            try { alertDialog.show(); } catch (Exception ignored) {}
        }

        new Thread(() -> {
            final Process[] processHolder = new Process[1];
            ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
            try {
                processHolder[0] = Runtime.getRuntime().exec("su");
                OutputStreamWriter writer = new OutputStreamWriter(processHolder[0].getOutputStream(), "UTF-8");
                writer.write(command + "\nexit\n");
                writer.flush();
                try { if (writer != null) writer.close(); } catch (Exception ignored) { }

                ScheduledFuture<?> killer = scheduler.schedule(() -> {
                    if (processHolder[0] != null && processHolder[0].isAlive()) {
                        processHolder[0].destroy();
                    }
                }, 20, TimeUnit.SECONDS);

                new Thread(() -> {
                    try {
                        int exitCode = processHolder[0].waitFor();
                        killer.cancel(false);

                        BufferedReader brOut = new BufferedReader(new InputStreamReader(processHolder[0].getInputStream(), "UTF-8"));
                        BufferedReader brErr = new BufferedReader(new InputStreamReader(processHolder[0].getErrorStream(), "UTF-8"));
                        StringBuilder out = new StringBuilder(), err = new StringBuilder();
                        String line;
                        while ((line = brOut.readLine()) != null) out.append(line).append('\n');
                        while ((line = brErr.readLine()) != null) err.append(line).append('\n');
                        try { if (brOut != null) brOut.close(); } catch (Exception ignored) { }
                        try { if (brErr != null) brErr.close(); } catch (Exception ignored) { }

                        activity.runOnUiThread(() -> {
                            if (alertDialog != null) {
                                try { if (alertDialog.isShowing()) alertDialog.dismiss(); } catch (Exception ignored) {}
                            }
                            if (exitCode == 0) {
                                if (resultWrap != null) resultWrap.setResult(out.toString().trim());
                                if (successRunnable != null) successRunnable.run();
                            } else {
                                if (resultWrap != null) resultWrap.setResult(err.toString().trim().isEmpty() ? out.toString().trim() : err.toString().trim());
                                if (failureRunnable != null) failureRunnable.run();
                            }
                        });

                    } catch (Exception e) {
                        activity.runOnUiThread(() -> {
                            if (alertDialog != null) {
                                try { if (alertDialog.isShowing()) alertDialog.dismiss(); } catch (Exception ignored) {}
                            }
                            new AlertDialog.Builder(activity)
                                .setTitle("Error")
                                .setMessage("Error: " + e.getMessage())
                                .setIcon(errorIconResId)
                                .setPositiveButton("OK", (d, w) -> d.dismiss())
                                .create().show();
                        });
                    } finally {
                        scheduler.shutdownNow();
                    }
                }).start();

            } catch (Exception e) {
                if (processHolder[0] != null && processHolder[0].isAlive()) processHolder[0].destroy();
                activity.runOnUiThread(() -> {
                    if (alertDialog != null) {
                        try { if (alertDialog.isShowing()) alertDialog.dismiss(); } catch (Exception ignored) {}
                    }
                    new AlertDialog.Builder(activity)
                        .setTitle("Error")
                        .setMessage("Error: " + e.getMessage())
                        .setIcon(errorIconResId)
                        .setPositiveButton("OK", (d, w) -> d.dismiss())
                        .create().show();
                });
                scheduler.shutdownNow();
            }
        }).start();
    }
  

   
   
    // Error Dialog
    
    public static void ErrorD(Activity a, String res, String err, String cus) {
     String title = "𝗘𝗿𝗿𝗼𝗿";
     String msg = Error(a, res, err, cus);
     new AlertDialog.Builder(a)
        .setTitle(title).setMessage(msg)
        .setIcon(R.drawable.icon_1)
        .setPositiveButton("OK", (d, w) -> {}).show();
    }
    
    // Error Mechanism

    public static String Error(Activity ctx, String res, String err, String cus) {
      try {
        if (res.contains("araafroyall")) {
            return AssetsPro.getValue(ctx, "/Msg/TrialEnd.txt", "DIRECT");
        } else if (res.contains("notfounded")) {
            return AssetsPro.getValue(ctx, "/Msg/DecryptionError.txt", "DIRECT");
        } else if (err != null && err.length() > 2 && res.contains(err)) {
            return cus.concat("\nLog :\n").concat(res);
        } else {
            return res;
        }
      } catch (Exception e) {
        return AssetsPro.getValue(ctx, "/Msg/ExceptionError.txt", "DIRECT")
            .concat("\n\nOutput :\n")
            .concat(res);
       }
    }
    
    
   
   
}




