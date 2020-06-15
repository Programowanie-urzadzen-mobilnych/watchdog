package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

public class TryingToWriteReadonlyVariable extends Exception{
    TryingToWriteReadonlyVariable()
    {
    }
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "You cannot write this variable, it is read only variable");
    }
}
