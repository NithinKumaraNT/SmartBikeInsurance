package eu.basicairdata.graziano.gpslogger;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Start_Button extends Activity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__button);
        login = (Button) findViewById(R.id.button_start);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.w("Hack","entered finger print");
                openFinger_AuthActivity();

            }
        });

    }

    public void openFinger_AuthActivity() {

        Intent intent = new Intent(this,Finger_Auth.class);
        startActivity(intent);
    }

}
