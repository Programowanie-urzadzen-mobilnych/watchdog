package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

/**
 * wyświetla informację dla użytkownika w momencie niepoprawnej zmiany wyświetlanej wielkości.
 * Klasa została zdefiniowana w założeniach projektu, natomiast nie jest wykorzystywana w związku
 * ze zmianą realizacji  funkcjonalności reprezentacji danych, zmiana wielkości nie sprawia
 * problemów w związku z czym nie jest potrzebna klasa obsługująca taki wyjątek. Jednakże, jeśli
 * w przyszłości istniałby problem ze zmianą wielkości klasa taka istnieje
 * i może zostać wykorzystana.
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class EMeasurementChanges extends Exception{
    /**
     *  To jest konsturktor
     */
    EMeasurementChanges()
    {
    }

    /**
     * Metoda aktywująca się gdy wystąpi bład w zmianie wielkośći.
     * @param context Parametr zawierający context
     */
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "Changing of measurement value was incorrect, please try again.");
    }
}
