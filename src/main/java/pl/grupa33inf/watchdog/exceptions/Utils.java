package pl.grupa33inf.watchdog.exceptions;
import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/**
 * Umożliwia ona wyświetlanie tychże powiadomień
 * @author  Alicja Jagoda & Patryk Abraś
 * @version 1.0
 * @since   2020-06-15
 */
public class Utils {

    /**
     * Metoda tworzaca Toast.
     * @param mContext Parametr zawierający mContext
     * @param message Parametr zawierający wiadomość
     */
    public static void showToast(Context mContext, String message){
        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();

    }}
