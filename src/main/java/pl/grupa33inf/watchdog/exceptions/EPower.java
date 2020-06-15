package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

public class EPower extends Exception {
    EPower()
    {
    }
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Battery power is low.");
    }
}
