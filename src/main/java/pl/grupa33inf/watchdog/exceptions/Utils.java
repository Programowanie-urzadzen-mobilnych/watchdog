package pl.grupa33inf.watchdog.exceptions;
import android.app.Activity;
import android.content.Context;
import android.widget.Toast;


public class Utils {
    public static void showToast(Context mContext, String message){
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();

    }}