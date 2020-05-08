package pl.grupa33inf.watchdog.exceptions;

import android.app.Activity;

public class ELogin {

    public static void loginError(Activity activity) {
        Utils.showToast(activity,"Wrong login data");
    }
}
