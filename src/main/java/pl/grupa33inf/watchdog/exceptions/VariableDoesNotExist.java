package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

public class VariableDoesNotExist extends Exception {
    VariableDoesNotExist()
    {

    }
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Unable to read variable, that variable does not exist.");
    }
}
