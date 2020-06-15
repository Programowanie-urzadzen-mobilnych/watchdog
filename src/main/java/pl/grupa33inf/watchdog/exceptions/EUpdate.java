package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

public class EUpdate extends Exception {
    EUpdate()
    {
    }
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Update was NOT successful. Please check connection and try again.");
    }
}
