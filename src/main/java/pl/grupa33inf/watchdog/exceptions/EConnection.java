package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

/**
 * klasa obsługująca błąd przy połączeniu z urządzeniem. Wyświetla ona odpowiednie powiadomienie
 * dla użytkownika, nie jest ona używana, natomiast jest skończona i gotowa do wykorzystania
 * przy nieprawidłowym łączeniu urządzenia do węzła.
 *
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class EConnection  extends Exception{
    /**
     *  To jest konsturktor
     */
    EConnection()
    {
    }

    /**
     * Metoda aktywująca się gdy wystąpi
     * błąd połączenia.
     * @param context Parametr zawierający context
     */
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Cannot connect to device. Please check if bluetooth is enabled.");
    }
}
