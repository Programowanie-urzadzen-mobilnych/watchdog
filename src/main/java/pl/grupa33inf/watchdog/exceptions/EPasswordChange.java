package pl.grupa33inf.watchdog.exceptions;

import android.app.Activity;

public class EPasswordChange {
    public static void invalidChange(Activity activity) {
        Utils.showToast(activity,"Password was not changed");
    }
}
