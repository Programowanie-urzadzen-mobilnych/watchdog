package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

public class EMeasurementChanges extends Exception{
    EMeasurementChanges()
    {
    }
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Changing of measurement value was incorrect, please try again.");
    }
}
