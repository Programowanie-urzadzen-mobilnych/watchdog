package pl.grupa33inf.watchdog.exceptions;

import android.content.Context;

/**
 * odpowiada za obsługę błędu związanego z próbą zapisu zmiennej, która może zostać tylko odczytana.
 * Tu również zostanie wyświetlone powiadomienie informujące, że wybrana zmienna nie
 * może zostać zapisana.
 *
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class TryingToWriteReadonlyVariable extends Exception{
    /**
     *  To jest konsturktor
     */
    TryingToWriteReadonlyVariable()
    {
    }

    /**
     * Metoda aktywująca się gdy próbuje nadpisać się zmienna tylko do odczytu
     * @param context Parametr zawierający context
     */
    public static void showInfo(Context context)
    {
        Utils.showToast(context, "You cannot write this variable, it is read only variable");
    }
}
