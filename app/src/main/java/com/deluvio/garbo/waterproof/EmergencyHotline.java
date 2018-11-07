package com.deluvio.garbo.waterproof;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EmergencyHotline extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencyhotline);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
        button = (Button) findViewById(R.id.callndrrmc);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.home) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (arg0.getId() == R.id.callndrrmc) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:9111406"));
                    startActivity(callIntent);
                }
                if (ActivityCompat.checkSelfPermission(EmergencyHotline.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }

            }
        });
    }
}
