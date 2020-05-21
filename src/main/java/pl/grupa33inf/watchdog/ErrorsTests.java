package pl.grupa33inf.watchdog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pl.grupa33inf.watchdog.exceptions.ELayoutName;
import pl.grupa33inf.watchdog.exceptions.ELogin;
import pl.grupa33inf.watchdog.exceptions.EPasswordChange;

public class ErrorsTests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // ELogin.loginError(this);
        //EPasswordChange.invalidChange(this);
        //ELayoutName.getNewPath("no","tak","txt",this);
    }
}
