package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

/**
 * błąd obsługiwany w tej klasie występuje w momencie, gdy użytkownik próbuje odczytać zmienną,
 * która nie istnieje, wywołanie tego wyjątku powoduje wyświetlanie użytkownikowi powiadomienia
 * o braku istnienia takowej zmiennej.
 *
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class VariableDoesNotExist extends Exception {
    /**
     *  To jest konsturktor
     */
    VariableDoesNotExist()
    {

    }

    /**
     * Metoda aktywująca się gdy próbuje odczytać zmienną która nie istnieję
     * @param context Parametr zawierający context
     */
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Unable to read variable, that variable does not exist.");
    }
}
