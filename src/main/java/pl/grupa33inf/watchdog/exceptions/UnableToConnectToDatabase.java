package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

/**
 * odpowiada za błąd występujący w momencie łączenia z bazą, najczęstszym powodem takiego błędu,
 * będzie brak połączenia internetowego, użytkownik jest więc informowany o zaistniałej sytuacji,
 * proszony o sprawdzenie połączenia z internetem i ponowną próbę.
 *
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class UnableToConnectToDatabase extends Exception {
    /**
     *  To jest konsturktor
     */
    UnableToConnectToDatabase()
    {
    }

    /**
     * Metoda aktywująca się gdy nie powiodło się połączenie z bazą.
     * @param context Parametr zawierający context
     */
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Unable to connect to database. Please check Internet connection");
    }
}
