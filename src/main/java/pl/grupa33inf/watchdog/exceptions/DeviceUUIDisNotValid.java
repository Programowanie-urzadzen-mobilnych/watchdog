package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

/**
 * odpowiada za wyświetlenie komunikatu w momencie gdy numer UUID urządzenia jest nieprawidłowy,
 * został podany niepoprawny lub został źle zinterpretowany.
 *
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class DeviceUUIDisNotValid extends Exception {
    /**
     *  To jest konsturktor
     */
    DeviceUUIDisNotValid()
    {
    }

    /**
     * Metoda aktywująca się gdy zostały źle
     * podane Device UUID.
     * @param context Parametr zawierający context
     */
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Device UUID is not valid, please check UUID.");
    }
}
