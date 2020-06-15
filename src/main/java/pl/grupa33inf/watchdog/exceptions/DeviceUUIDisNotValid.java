package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

public class DeviceUUIDisNotValid extends Exception {
    DeviceUUIDisNotValid()
    {
    }
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Device UUID is not valid, please check UUID.");
    }
}
