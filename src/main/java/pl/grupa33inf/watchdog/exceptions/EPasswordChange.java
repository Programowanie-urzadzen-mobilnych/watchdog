package pl.grupa33inf.watchdog.exceptions;

import android.app.Activity;

/**
 * obsługuje błędy związane z niepoprawną zmiana hasła; jest rozpatrywane w tej klasie pięć
 * przypadków, w zależności, który przypadek wystąpi, zostanie wyświetlona odpowiednia
 * informacja dla użytkownika.
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class EPasswordChange {

    /**
     * Metoda uruchamia się gdy nie zostało zmienione hasło
     * @param activity Parametr zawierający aktywnośc
     */
    public static void invalidChange(Activity activity) {
        Utils.showToast(activity,"Password was not changed");
    }

    /**
     * Metoda uruchamia się gdy hasło i ponownie wpisz hasło nie są indentyczne
     * @param activity Parametr zawierający aktywnośc
     */
    public static void passwordsAreNotTheSame(Activity activity){
        Utils.showToast(activity, "Passwords are NOT the same");
    }

    /**
     * Metoda uruchamia się gdy hasło i login są takie same
     * @param activity Parametr zawierający aktywnośc
     */
    public static void fieldsLoginAndPasswordAreTheSame(Activity activity){
        Utils.showToast(activity,"Login and password cannot be the same");
    }

    /**
     * Metoda uruchamia się gdy zostanie żle wprowadzone stary login
     * @param activity Parametr zawierający aktywnośc
     */
    public static void oldLoginNotProvidedWrong(Activity activity){
        Utils.showToast(activity, "Please reenter old login");
    }

    /**
     * Metoda uruchamia się gdy zostanie żle wprowadzone stare hasło
     * @param activity Parametr zawierający aktywnośc
     */
    public static void oldPasswordNotProvidedWrong(Activity activity){
        Utils.showToast(activity, "Please reenter old password");
    }
}
