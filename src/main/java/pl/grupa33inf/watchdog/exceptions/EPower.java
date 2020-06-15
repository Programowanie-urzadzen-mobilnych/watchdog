package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

/**
 * obsługuje błąd związany z mocą akumulatora lub baterii w węźle; klasa ta nie jest wykorzystana
 * (nie jest symulowany niski poziom baterii), natomiast jest gotowa do wykorzystania.
 * Wyświetla ona odpowiednie powiadomienie dla użytkownika.
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class EPower extends Exception {
    /**
     *  To jest konsturktor
     */
    EPower()
    {
    }

    /**
     * Metoda aktywująca się gdy poziom baterii jest niski.
     * @param context Parametr zawierający context
     */
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Battery power is low.");
    }
}
