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

public class Evacuation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evacuationcenter);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }


    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.home) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.emergencyhotline) {
            i = new Intent(this, EmergencyHotline.class);
            startActivity(i);
        } else if (v.getId() == R.id.makatigm) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 11.967203 + "," + 121.925502));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        }
    }
}
