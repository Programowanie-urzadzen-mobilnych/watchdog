package pl.grupa33inf.watchdog.exceptions;

import android.app.Activity;

/**
 * obsługuje błąd, gdy użytkownik wprowadzi niepoprawne dane logowania; gdy ten błąd zostanie
 * wychwycony zostanie wyświetlona informacja na temat nieprawidłowych danych.
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class ELogin {

    /**
     * Metoda aktywująca się gdy zostały źle
     * podane wartości logowania
     * @param activity Parametr zawierający aktywnośc
     */
    public static void loginError(Activity activity) {
        Utils.showToast(activity,"Wrong login data");
    }
}
