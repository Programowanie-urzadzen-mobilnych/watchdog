package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

public class UnableToConnectToDatabase extends Exception {

    UnableToConnectToDatabase()
    {
    }
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Unable to connect to database. Please check Internet connection");
    }
}
