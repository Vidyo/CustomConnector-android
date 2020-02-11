package com.vidyo.vidyoconnector;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import com.vidyo.vidyoconnector.connect.ConnectParams;
import com.vidyo.vidyoconnector.utils.AppUtils;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        TextView ioCred = findViewById(R.id.io_api_credentials);
        ioCred.setText(patchIOCred());
    }

    private String patchIOCred() {
        return String.format("Host: %1s\nResource: %2s\nToken: %3s\nGuest Name: %4s",
                ConnectParams.HOST, ConnectParams.RESOURCE, AppUtils.formatToken(), ConnectParams.DISPLAY_NAME);
    }
}