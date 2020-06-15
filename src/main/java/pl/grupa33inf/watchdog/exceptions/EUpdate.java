package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

/**
 * odpowiada za błąd związany z aktualizowaniem oprogramowania na węźle.
 * Klasa ta wyświetla informację dla użytkownika, że aktualizacja nie przebiegła pomyślnie.
 * Nie jest ona wykorzystywana, dlatego że niestety nie została zaimplementowana funkcjonalność
 * aktualizacji. Natomiast, jeśli w przyszłości zostanie zaimplementowana możliwość aktualizacji,
 * obsługa błędu może zostać wykorzystana, bo jest w pełni funkcjonalna.
 *
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class EUpdate extends Exception {
    /**
     *  To jest konsturktor
     */
    EUpdate()
    {
    }

    /**
     * Metoda aktywująca się gdy aktualizacja sie nie powiodla.
     * @param context Parametr zawierający context
     */
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Update was NOT successful. Please check connection and try again.");
    }
}
