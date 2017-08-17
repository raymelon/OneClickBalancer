package io.github.raymelon.oneclickbalancer;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.ActivityCompat;
import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Toast;
import android.Manifest;

import io.github.raymelon.prepaidbalance.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for Marshmallow API and above
        ActivityCompat.requestPermissions(this, new String[]{ Manifest.permission.SEND_SMS }, 1);

        String sendToNumber = "214";
        String messageToSend = "?1515";

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(sendToNumber, null, messageToSend, null, null);

        Toast.makeText(this, "Balance query sent!",
                Toast.LENGTH_LONG).show();

        finish();
    }
}
