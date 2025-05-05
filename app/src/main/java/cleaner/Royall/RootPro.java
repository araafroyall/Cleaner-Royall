package Cleaner.Royall;

import android.app.Activity;
import android.app.AlertDialog;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;

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
        if (alertDialog != null) alertDialog.show();

        new Thread(() -> {
            try {
                Process process = Runtime.getRuntime().exec("su");
                DataOutputStream os = new DataOutputStream(process.getOutputStream());
                os.writeBytes(command + "\nexit\n");
                os.flush();
                os.close();

                int exitCode = process.waitFor();

                BufferedReader brOut = new BufferedReader(new InputStreamReader(process.getInputStream()));
                BufferedReader brErr = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                StringBuilder out = new StringBuilder(), err = new StringBuilder();
                String line;
                while ((line = brOut.readLine()) != null) out.append(line).append("\n");
                while ((line = brErr.readLine()) != null) err.append(line).append("\n");
                brOut.close();
                brErr.close();

                activity.runOnUiThread(() -> {
                    if (alertDialog != null && alertDialog.isShowing()) alertDialog.dismiss();
                    if (exitCode == 0) {
                        resultWrap.setResult(out.toString().trim());
                        if (successRunnable != null) successRunnable.run();
                    } else {
                        resultWrap.setResult(err.toString().trim());
                        if (failureRunnable != null) failureRunnable.run();
                    }
                });

            } catch (Exception e) {
                activity.runOnUiThread(() -> {
                    if (alertDialog != null && alertDialog.isShowing()) alertDialog.dismiss();
                    new AlertDialog.Builder(activity)
                        .setTitle("Error")
                        .setMessage("Error: " + e.getMessage())
                        .setIcon(errorIconResId)
                        .setPositiveButton("OK", (d, w) -> d.dismiss())
                        .create().show();
                });
            }
        }).start();
    }
}