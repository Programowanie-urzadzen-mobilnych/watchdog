package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

public class EConnection  extends Exception{
    EConnection()
    {
    }
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Cannot connect to device. Please check if bluetooth is enabled.");
    }
}
